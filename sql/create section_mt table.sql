CREATE TABLE `section_mt` (
  `section_id` int(11) NOT NULL AUTO_INCREMENT,
  `sectionName` varchar(45) NOT NULL,
  `isActive` bit(1) NOT NULL DEFAULT b'1',
  `date_created` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`section_id`),
  UNIQUE KEY `sectionName_UNIQUE` (`sectionName`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=latin1 COMMENT='Master table for storing all sections only. Students sections information will be put on a different table';
