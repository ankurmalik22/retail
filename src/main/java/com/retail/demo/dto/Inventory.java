package com.retail.demo.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {

    private String productId;

    private String prodName;

    private String UOM;

    private Double availQty;

    private Date availDate;

    private Date reqDate;
}
