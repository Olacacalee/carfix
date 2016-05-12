package com.carfix.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Created by Administrator on 2016-05-12.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class User {
    private String userName;
    private String password;
}
