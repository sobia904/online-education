package com.online.education.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RecentOrderDTO {
        private Long orderId;
        private String orderNumber;
        private String status;
        private Date createdOn;

}
