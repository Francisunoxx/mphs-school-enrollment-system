CREATE TABLE `section_settings_lt` (
  `section_settings_id` int(11) NOT NULL AUTO_INCREMENT,
  `section_id` int(11) NOT NULL,
  `schoolyear_id` int(11) NOT NULL,
  `gradelevel_id` int(11) NOT NULL,
  `capacity` int(11) NOT NULL,
  `sectioncategory_id` int(11) NOT NULL,
  PRIMARY KEY (`section_settings_id`),
  KEY `fk_section_settings_ltTABLE_section_idCOL_idx` (`section_id`),
  KEY `fk_section_settings_ltTABLE_schoolyear_idCOL_idx` (`schoolyear_id`),
  KEY `fk_section_settings_ltTABLE_gradelevel_idCOL_idx` (`gradelevel_id`),
  KEY `fk_section_settings_ltTABLE_sectioncategory_idCOL_idx` (`sectioncategory_id`),
  CONSTRAINT `fk_section_settings_ltTABLE_gradelevel_idCOL` FOREIGN KEY (`gradelevel_id`) REFERENCES `gradelevel_mt` (`gradelevel_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_section_settings_ltTABLE_schoolyear_idCOL` FOREIGN KEY (`schoolyear_id`) REFERENCES `schoolyear_mt` (`schoolyear_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_section_settings_ltTABLE_section_idCOL` FOREIGN KEY (`section_id`) REFERENCES `section_mt` (`section_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_section_settings_ltTABLE_sectioncategory_idCOL` FOREIGN KEY (`sectioncategory_id`) REFERENCES `sectioncategory_mt` (`sectioncategory_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
