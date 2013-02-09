DROP TABLE IF EXISTS `cafe`;
CREATE TABLE `cafe` (
  `cafe_id` int(11) NOT NULL AUTO_INCREMENT,
  `cafe_name` varchar(255) NOT NULL,
  `cafe_address` varchar(255) NOT NULL,
  `cafe_phone` varchar(9) NOT NULL,
  `num_of_employees` int(2) DEFAULT NULL,
  `num_of_tables` int(2) DEFAULT NULL,
  PRIMARY KEY (`cafe_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `employee_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(120) NOT NULL,
  `last_name` varchar(120) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` varchar(9) CHARACTER SET utf8 COLLATE utf8_hungarian_ci NOT NULL,
  `sallary` double NOT NULL,
  `role` tinyint(1) NOT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;
