package com.online.education.repository;

import com.online.education.constant.OrderStatus;
import com.online.education.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    Optional<Order> findByCustomerId(Long id);


    List<Order> findTop5ByOrderByCreatedOnDesc();
    List<Order> findTop5BySupplierIdOrderByCreatedOnDesc(Long supplierId);
    List<Order> findTop5ByVendorIdOrderByCreatedOnDesc(Long vendorId);

    Long countByStatus(OrderStatus status);
    Long countByStatusAndSupplierId(OrderStatus status, Long supplierId);
    Long countByStatusAndVendorId(OrderStatus status, Long vendorId);
}
