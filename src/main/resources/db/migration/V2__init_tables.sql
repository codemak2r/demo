create table if not exists `testcase`(
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

create table if not exists `api_testcase_item`(
    `id` bigint auto_increment,
    `testcase_id` bigint not null comment '测试用例 id',
    `common_var_id` bigint comment '公共变量',
    `self_var_id` bigint comment '私有变量',
  	`api_auth_id` bigint comment 'auth',
    `api_header_id` bigint comment 'header',
   	`api_body_id` bigint comment 'body',
  	`api_assert_id` bigint comment '验证结果',
    primary key(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


create table if not exists `api_header`(
    `id` bigint auto_increment,
 		`name` varchar(100) not null comment 'key',
  	`value` varchar(50) not null comment '值',
    `desc` varchar(500) comment '描述',
    primary key(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table if not exists `api_assert`(
    `id` bigint auto_increment,
 		`expect_val` varchar(100) not null comment '期望值',
  	`exactly_val` varchar(100) not null comment '实际值',
    `desc` varchar(500) comment '描述',
    primary key(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table if not exists `api_body`(
    `id` bigint auto_increment,
 		`name` varchar(100) not null comment 'key',
  	`value` varchar(50) not null comment '值',
    `desc` varchar(500) comment '描述',
    primary key(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


create table if not exists `common_var`(
    `id` bigint auto_increment,
    `name` varchar(100) not null comment '名字',
    `desc` varchar(500) comment '描述',
    `status` int default 0 comment '0 启用， 1 禁用',
    `owner` varchar(20) not null comment '维护人',
    `creator` varchar(20) not null comment '创建人',
    `modifier` varchar(20) comment '最近一次修改人',
    `create_time` datetime  comment '创建时间',
    `modify_time` datetime comment '修改时间',
    primary key(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table if not exists `common_var_itmes`(
    `id` bigint auto_increment,
    `common_var_id` bigint comment '公共变量id',
    `name` varchar(100) not null comment 'key',
    `val` varchar(100) not null comment 'value',
    `create_time` datetime  comment '创建时间',
    `modify_time` datetime comment '修改时间',
    primary key(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


create table if not exists `self_var`(
    `id` bigint auto_increment,
    `name` varchar(100) not null comment 'key',
    `val` varchar(100) not null comment 'value',
    `create_time` datetime  comment '创建时间',
    `modify_time` datetime comment '修改时间',
    primary key(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;