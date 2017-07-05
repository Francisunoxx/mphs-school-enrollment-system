CREATE TABLE `sectioncategory_mt` (
  `sectioncategory_id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(45) NOT NULL,
  `grade_range_from` int(11) NOT NULL,
  `grade_range_to` int(11) NOT NULL,
  `date_created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`sectioncategory_id`),
  UNIQUE KEY `category_UNIQUE` (`category`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='table to store grade range value from and to, to classify students';
