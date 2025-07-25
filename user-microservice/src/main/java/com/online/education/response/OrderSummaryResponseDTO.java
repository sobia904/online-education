package com.online.education.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderSummaryResponseDTO {
    private List<RecentOrderDTO> recentOrders;
    private List<TopSellingDTO> topSellingItems;
    private BigDecimal totalPendingOrders;
    private BigDecimal totalCompletedOrders;

}
