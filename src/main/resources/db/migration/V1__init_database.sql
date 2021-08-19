create table if not exists `t_end_case`(
    `id` bigint auto_increment,
    `name` varchar(100) not null comment '名字',
    `desc` varchar(500) comment '描述',
    `status` int default 0 comment '0 启用 ，1 禁用',
    `result` int unsigned default 0 comment '-1 失败， 1 成功 ， 0 未运行',
    `owner` varchar(20) not null comment '维护人',
    `modifier` varchar(20) comment '最近一次修改人',
    `created_time` datetime  comment '创建时间',
    `modified_time` datetime comment '修改时间',
    `is_before` int default 0 not null comment "是否是前置处理脚本 0 不是 1 是",
    `is_after` int default 0 not null comment "是否是后置处理脚本 0 不是 1 是",
    primary key(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table if not exists `t_before_exec_case`(
    `id` bigint auto_increment,
    `before_case_id` bigint comment '前置脚本',
    `exec_case_id` bigint comment '正式执行的脚本',
    primary key(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table if not exists `t_after_exec_case`(
    `id` bigint auto_increment,
    `after_case_id` bigint comment '后置脚本',
    `exec_case_id` bigint comment '正式执行的脚本',
    primary key(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


create table if not exists `t_end_conf`(
     `id` bigint auto_increment,
     `browser` int default 0 not null comment '浏览器',
     `window_size_width` int default 1366 comment '浏览器窗口宽度， 默认 1366',
     `window_size_height` int default 768 comment '浏览器窗口高度， 默认 768',
     `is_headless` int default 1 comment '0 无头模式， 1 正常模式。 默认无头模式',
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
  `order_no` DOUBLE not null comment '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

create table if not exists `t_end_reports`(
     `id` bigint auto_increment,
     `t_case_id` bigint not null comment '关联的用例ID',
     `result` int not null comment '结果',
     `screen` varchar(500) comment '截图',
     primary key(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;