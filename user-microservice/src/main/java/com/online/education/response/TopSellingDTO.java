package com.online.education.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TopSellingDTO {
    private Long itemId;
    private Long totalQuantitySold;
    private Double totalPriceSold;
}
