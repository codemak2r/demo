create table if not exists `frontend_testcase_item` (
    `id` bigint auto_increment,
    `browser` int default 0 not null comment '浏览器',
    `test_url` varchar(500) not null comment '要测试的URL',
    `action` int default 0 not null comment '动作',
    `element_type` int default 0  not null comment 'xpath, cssSelector, id',
    `element` varchar(500) not null comment '元素',
    `val` varchar(500) comment '值，可以为空',
    primary key(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;