package com.online.education.repository;

import com.online.education.constant.OrderStatus;
import com.online.education.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
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

    List<Order> findByStatus(OrderStatus status);
    List<Order> findByStatusAndSupplierId(OrderStatus status, Long supplierId);
    List<Order> findByStatusAndVendorId(OrderStatus status, Long vendorId);

    List<Order> findByStatusAndCreatedOnBetween(OrderStatus status, Date start, Date end);
    List<Order> findByStatusAndSupplierIdAndCreatedOnBetween(OrderStatus status, Long supplierId, Date startDate, Date endDate);
    List<Order> findByStatusAndVendorIdAndCreatedOnBetween(OrderStatus status, Long vendorId, Date startDate, Date endDate);



}
