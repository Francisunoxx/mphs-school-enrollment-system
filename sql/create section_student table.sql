CREATE TABLE `section_student` (
  `section_student_id` int(11) NOT NULL AUTO_INCREMENT,
  `section_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `schoolyear_id` int(11) NOT NULL,
  PRIMARY KEY (`section_student_id`),
  KEY `fk_students_sectionTABLE_section_idCOL_idx` (`section_id`),
  KEY `fk_students_sectionTABLE_schoolyear_idCOL_idx` (`schoolyear_id`),
  CONSTRAINT `fk_section_studentTABLE_schoolyear_idCOL` FOREIGN KEY (`schoolyear_id`) REFERENCES `schoolyear_mt` (`schoolyear_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_section_studentTABLE_section_idCOL` FOREIGN KEY (`section_id`) REFERENCES `section_mt` (`section_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
