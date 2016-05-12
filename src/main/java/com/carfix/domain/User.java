package com.carfix.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by Administrator on 2016-05-12.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class User {
    private Long userId;
    private String username;
    private String name;
    private String password;
    private Date createdAt;
    private Date updatedAt;
}
