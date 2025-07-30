package com.online.education.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor

public class MonthlySalesDTO {
    private String month;
    private BigDecimal totalSales;


    public MonthlySalesDTO(String month, BigDecimal totalSales) {
        this.month = month;
        this.totalSales = totalSales;
    }
}
