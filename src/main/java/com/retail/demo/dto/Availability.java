package com.retail.demo.dto;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Availability {

    private String storeNo;

    private String productId;

    private Double availQty;
}
