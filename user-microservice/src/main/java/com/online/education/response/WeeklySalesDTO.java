package com.online.education.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class WeeklySalesDTO {
    private String weekRange;
    private BigDecimal totalSales;


    public WeeklySalesDTO(String week, BigDecimal totalSales) {
        this.weekRange = week;
        this.totalSales = totalSales;
    }
}
