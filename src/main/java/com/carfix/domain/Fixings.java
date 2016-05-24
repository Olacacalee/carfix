package com.carfix.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by Administrator on 2016-05-24.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class Fixings {
    private Long fixingsId;
    private String fixingsCode;
    private String fixingsName;
    private double inPrice;
    private double salePrice;
    private int stock;
    private String producer;
    private String brand;
    private String carType;
    private String carCategory;
    private Date updatedAt;
}
