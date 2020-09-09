CREATE TABLE `user` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `identity` varchar(30) NOT NULL,
  `name` varchar(50) NOT NULL,
  `sex` varchar(4) NOT NULL,
  `password` varchar(50) NOT NULL,
  `telephone` varchar(20) NOT NULL,
  `userType` varchar(2) NOT NULL,
  `invitation_code` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8