CREATE TABLE `t_mq_message` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `biz_id` bigint(20) NOT NULL COMMENT '业务id',
  `biz_type` tinyint(2) NOT NULL COMMENT '业务类型',
  `msg` text COLLATE utf8mb4_bin NOT NULL COMMENT '消息内容',
  `msg_result` tinyint(2) NOT NULL COMMENT '消息结果(0:成功,1:失败,2:处理中)',
  `msg_desc` varchar(255) COLLATE utf8mb4_bin NOT NULL COMMENT '消息描述',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `try_count` int(3) NOT NULL DEFAULT '0' COMMENT '重试次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;


CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) COLLATE utf8mb4_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;
