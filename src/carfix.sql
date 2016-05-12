create database carfix;

use carfix;

-- 登录用户表
CREATE TABLE `user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户user_id',
  `username` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT into user (username,name,password,created_at,updated_at)
VALUES ('root','超级管理员','123456','2016-05-12 00:00:00','2016-05-12 00:00:00')

-- 配件信息表
CREATE TABLE `fixings` (
  `fixings_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `fixings_code` varchar(100) DEFAULT NULL COMMENT '零件编号',
  `fixings_name` varchar(255) NOT NULL COMMENT '配件名称',
  `in_price` double(12,2) DEFAULT NULL COMMENT '进价',
  `sale_price` double(12,2) DEFAULT NULL COMMENT '售价',
  `stock` int(11) DEFAULT NULL COMMENT '库存数量',
  `producer` varchar(100) DEFAULT NULL COMMENT '产地',
  `brand` varchar(100) DEFAULT NULL COMMENT '品牌',
  `car_type` varchar(100) DEFAULT NULL COMMENT '车品牌',
  `car_category` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '车系',
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`fixings_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


