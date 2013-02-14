DROP TABLE IF EXISTS `cafe`;
CREATE TABLE `cafe` (
  `cafe_id` int(11) NOT NULL AUTO_INCREMENT,
  `cafe_name` varchar(255) NOT NULL,
  `cafe_address` varchar(255) NOT NULL,
  `cafe_phone` varchar(20) NOT NULL,
  `num_of_employees` int(2) DEFAULT NULL,
  `num_of_tables` int(2) DEFAULT NULL,
  PRIMARY KEY (`cafe_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `employee_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(120) NOT NULL,
  `last_name` varchar(120) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `sallary` double NOT NULL,
  `role` tinyint(1) NOT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;

DROP TABLE IF EXISTS `cafe_employee`;
CREATE TABLE `cafe_employee` (
  `cafe_id` int(11) NOT NULL,
  `employee_id` int(11) NOT NULL,
  KEY `cafe_employee_id` (`cafe_id`,`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
