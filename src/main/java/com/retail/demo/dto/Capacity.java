package com.retail.demo.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Capacity {

    private String storeNo;

    private Date date;

    private Double noOfOrdersAccepted;
}
