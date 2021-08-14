create table if not exists `t_end_case`(
    `id` bigint auto_increment,
    `name` varchar(100) not null comment '名字',
    `desc` varchar(500) comment '描述',
    `status` int default 0 comment '0 启用 ，1 禁用',
    `result` int default 0 comment '-1 失败， 1 成功 ， 0 新建',
    `owner` varchar(20) not null comment '维护人',
    `creator` varchar(20) not null comment '创建人',
    `modifier` varchar(20) comment '最近一次修改人',
    `create_time` datetime  comment '创建时间',
    `modify_time` datetime comment '修改时间',
    primary key(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table if not exists `t_end_conf`(
     `id` bigint auto_increment,
     `browser` int default 0 not null comment '浏览器',
     `test_url` varchar(500) not null comment '要测试的URL',
     `t_case_id` bigint not null comment '关联的用例ID',
     primary key(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_end_steps` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `t_case_id` bigint(20) NOT NULL COMMENT '关联的用例ID',
  `action` varchar(50) NOT NULL COMMENT '动作',
  `element_type` varchar(30) DEFAULT NULL COMMENT 'xpath, cssSelector, id',
  `element` varchar(500) DEFAULT NULL COMMENT '元素',
  `val` varchar(500) DEFAULT NULL COMMENT '值，可以为空',
  `order_no` DOUBLE not null comment '进行排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

