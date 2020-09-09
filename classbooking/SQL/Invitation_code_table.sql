CREATE TABLE `invitation_code` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `invitation_code` varchar(20) NOT NULL,
  `remain_count` integer NOT NULL,
  `initail_amount` integer NOT NULL,
  `invitation_code_status` varchar(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8