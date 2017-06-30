CREATE DATABASE  IF NOT EXISTS `enrollmentdb` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `enrollmentdb`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: enrollmentdb
-- ------------------------------------------------------
-- Server version	5.6.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admission_mt`
--

DROP TABLE IF EXISTS `admission_mt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admission_mt` (
  `admission_id` int(11) NOT NULL AUTO_INCREMENT,
  `registration_id` int(11) NOT NULL,
  `isComplete` bit(1) NOT NULL DEFAULT b'0',
  `completion_date` datetime DEFAULT NULL,
  PRIMARY KEY (`admission_id`),
  UNIQUE KEY `registration_id_UNIQUE` (`registration_id`),
  CONSTRAINT `fk_admission_mtTABLE_registration_idCOL` FOREIGN KEY (`registration_id`) REFERENCES `registration_mt` (`registration_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=latin1 COMMENT='This is a table to be used for new students only.';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admission_mt`
--

LOCK TABLES `admission_mt` WRITE;
/*!40000 ALTER TABLE `admission_mt` DISABLE KEYS */;
INSERT INTO `admission_mt` VALUES (9,9,'',NULL),(10,10,'',NULL),(11,11,'',NULL),(12,12,'',NULL),(13,13,'',NULL),(14,14,'',NULL),(15,15,'',NULL),(16,16,'',NULL),(17,17,'',NULL),(18,18,'',NULL),(19,19,'',NULL),(20,20,'',NULL),(21,21,'',NULL),(22,22,'',NULL),(23,23,'\0',NULL),(24,24,'',NULL),(25,28,'',NULL),(26,29,'',NULL),(27,30,'',NULL),(28,31,'',NULL),(29,32,'',NULL);
/*!40000 ALTER TABLE `admission_mt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `balance_breakdown_fee`
--

DROP TABLE IF EXISTS `balance_breakdown_fee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `balance_breakdown_fee` (
  `balance_breakdown_fee_id` int(11) NOT NULL AUTO_INCREMENT,
  `description` text NOT NULL,
  `amount` decimal(10,2) NOT NULL,
  `date_added` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`balance_breakdown_fee_id`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `balance_breakdown_fee`
--

LOCK TABLES `balance_breakdown_fee` WRITE;
/*!40000 ALTER TABLE `balance_breakdown_fee` DISABLE KEYS */;
INSERT INTO `balance_breakdown_fee` VALUES (47,'Cash',8923.50,'2017-06-30 12:24:20'),(48,'Field Trip',756.00,'2017-06-30 12:24:20'),(49,'Downpayment',5000.00,'2017-06-30 13:10:57'),(50,'Semester 1',2865.17,'2017-06-30 13:10:57'),(51,'Semester 2',2865.17,'2017-06-30 13:10:57'),(52,'Field Trip',756.00,'2017-06-30 13:10:57');
/*!40000 ALTER TABLE `balance_breakdown_fee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `classschedule`
--

DROP TABLE IF EXISTS `classschedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `classschedule` (
  `classschedule_id` int(11) NOT NULL AUTO_INCREMENT,
  `startTime` int(11) NOT NULL,
  `endTime` int(11) NOT NULL,
  `dayOfWeek_id` int(11) NOT NULL,
  `room_id` int(11) NOT NULL,
  `subject_id` int(11) NOT NULL,
  `faculty_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`classschedule_id`),
  KEY `class_schedule_TABLE_roomId_COL_idx` (`room_id`),
  KEY `fk_class_schedule_TABLE_facultyId_COL_idx` (`faculty_id`),
  KEY `fk_class_schedule_TABLE_subjectId_COLUMN_idx` (`subject_id`),
  CONSTRAINT `fk_class_schedule_TABLE_facultyId_COL` FOREIGN KEY (`faculty_id`) REFERENCES `faculty_mt` (`faculty_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_class_schedule_TABLE_roomId_COL` FOREIGN KEY (`room_id`) REFERENCES `room_mt` (`room_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_class_schedule_TABLE_subjectId_COLUMN` FOREIGN KEY (`subject_id`) REFERENCES `subject_mt` (`subject_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classschedule`
--

LOCK TABLES `classschedule` WRITE;
/*!40000 ALTER TABLE `classschedule` DISABLE KEYS */;
INSERT INTO `classschedule` VALUES (1,700,1200,1,1,60,NULL),(2,700,730,2,1,60,NULL),(3,730,800,2,1,62,NULL),(4,800,900,2,1,64,NULL),(5,800,900,3,1,67,NULL),(6,700,730,1,1,68,NULL),(7,700,730,1,2,70,NULL);
/*!40000 ALTER TABLE `classschedule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `classschedule_hd`
--

DROP TABLE IF EXISTS `classschedule_hd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `classschedule_hd` (
  `classschedule_id` int(11) NOT NULL,
  `addedBy_UserId` int(11) NOT NULL,
  `lastEditedBy_UserId` int(11) NOT NULL,
  `dateAdded` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `dateLastEdited` datetime DEFAULT NULL,
  KEY `fk_classschedule_hd_TABLE_classschedule_id_COL_idx` (`classschedule_id`),
  KEY `fk_classschedule_hdTABLE_addedByUserId_COLUMN_idx` (`addedBy_UserId`),
  KEY `fk_classschedule_hdTABLE_lastEditedByUserId_COLUMN_idx` (`lastEditedBy_UserId`),
  CONSTRAINT `fk_classschedule_hdTABLE_addedByUserId_COLUMN` FOREIGN KEY (`addedBy_UserId`) REFERENCES `user_mt` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_classschedule_hdTABLE_lastEditedByUserId_COLUMN` FOREIGN KEY (`lastEditedBy_UserId`) REFERENCES `user_mt` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_classschedule_hd_TABLE_classschedule_id_COL` FOREIGN KEY (`classschedule_id`) REFERENCES `classschedule` (`classschedule_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classschedule_hd`
--

LOCK TABLES `classschedule_hd` WRITE;
/*!40000 ALTER TABLE `classschedule_hd` DISABLE KEYS */;
INSERT INTO `classschedule_hd` VALUES (1,3,3,'2016-09-02 11:12:02','2016-09-02 11:12:02'),(2,3,3,'2016-09-02 11:12:04','2016-09-02 11:12:04'),(3,3,3,'2016-09-02 11:12:05','2016-09-02 11:12:05'),(4,3,3,'2016-09-02 11:12:06','2016-09-02 11:12:06'),(5,3,3,'2016-09-02 11:12:07','2016-09-02 11:12:07'),(6,3,3,'2016-09-02 11:15:21','2016-09-02 11:15:21'),(7,3,3,'2016-09-02 11:15:22','2016-09-02 11:15:22');
/*!40000 ALTER TABLE `classschedule_hd` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `classschedule_section`
--

DROP TABLE IF EXISTS `classschedule_section`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `classschedule_section` (
  `classschedule_section_id` int(11) NOT NULL,
  `classschedule_id` int(11) NOT NULL,
  `gradelevel_id` int(11) NOT NULL,
  `section_id` int(11) NOT NULL,
  `schoolyear_id` int(11) NOT NULL,
  PRIMARY KEY (`classschedule_section_id`),
  KEY `fk_classschedule_sectionTABLE_classschedule_idCOLUMn_idx` (`classschedule_id`),
  KEY `fk_classschedule_sectionTABLE_section_id_idx` (`section_id`),
  KEY `fk_classschedule_sectionTABLE_gradelevel_idCOLUMN_idx` (`gradelevel_id`),
  KEY `fk_classschedule_sectionTABLE_schoolyear_idCOLUMN_idx` (`schoolyear_id`),
  CONSTRAINT `fk_classschedule_sectionTABLE_classschedule_idCOLUMN` FOREIGN KEY (`classschedule_id`) REFERENCES `classschedule` (`classschedule_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_classschedule_sectionTABLE_gradelevel_idCOLUMN` FOREIGN KEY (`gradelevel_id`) REFERENCES `gradelevel_mt` (`gradelevel_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_classschedule_sectionTABLE_schoolyear_idCOLUMN` FOREIGN KEY (`schoolyear_id`) REFERENCES `schoolyear_mt` (`schoolyear_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_classschedule_sectionTABLE_section_id` FOREIGN KEY (`section_id`) REFERENCES `section_mt` (`section_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classschedule_section`
--

LOCK TABLES `classschedule_section` WRITE;
/*!40000 ALTER TABLE `classschedule_section` DISABLE KEYS */;
/*!40000 ALTER TABLE `classschedule_section` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `credential_requirements_lt`
--

DROP TABLE IF EXISTS `credential_requirements_lt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `credential_requirements_lt` (
  `credential_id` int(11) NOT NULL COMMENT 'This table contains all required credentials to be submitted by a student.\nSchool year column is added to know when or what school year the credential was required for that gradelevel..',
  `gradelevel_id` int(11) NOT NULL,
  `schoolyear_id` int(11) NOT NULL,
  `date_added` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  KEY `fk_credential_requirements_ltTABLE_credential_idCOL_idx` (`credential_id`),
  KEY `fk_credential_requirements_ltTABLE_gradelevel_idCOL_idx` (`gradelevel_id`),
  KEY `fk_credential_requirements_ltTABLE_schoolyearl_idCOL_idx` (`schoolyear_id`),
  CONSTRAINT `fk_credential_requirements_ltTABLE_credential_idCOL` FOREIGN KEY (`credential_id`) REFERENCES `credentials_mt` (`credential_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_credential_requirements_ltTABLE_gradelevel_idCOL` FOREIGN KEY (`gradelevel_id`) REFERENCES `gradelevel_mt` (`gradelevel_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_credential_requirements_ltTABLE_schoolyearl_idCOL` FOREIGN KEY (`schoolyear_id`) REFERENCES `schoolyear_mt` (`schoolyear_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `credential_requirements_lt`
--

LOCK TABLES `credential_requirements_lt` WRITE;
/*!40000 ALTER TABLE `credential_requirements_lt` DISABLE KEYS */;
INSERT INTO `credential_requirements_lt` VALUES (18,301,409,'2017-03-24 01:31:07'),(18,302,409,'2017-03-24 01:31:07'),(18,303,409,'2017-03-24 01:31:07'),(18,304,409,'2017-03-24 01:31:08'),(18,305,409,'2017-03-24 01:31:08'),(18,306,409,'2017-03-24 01:31:08'),(18,307,409,'2017-03-24 01:31:08'),(18,308,409,'2017-03-24 01:31:08'),(18,309,409,'2017-03-24 01:31:08'),(18,310,409,'2017-03-24 01:31:08'),(18,311,409,'2017-03-24 01:31:08'),(19,301,409,'2017-03-24 01:32:20'),(19,302,409,'2017-03-24 01:32:20'),(19,303,409,'2017-03-24 01:32:20'),(19,304,409,'2017-03-24 01:32:20'),(19,305,409,'2017-03-24 01:32:20'),(19,306,409,'2017-03-24 01:32:20'),(19,307,409,'2017-03-24 01:32:20'),(19,308,409,'2017-03-24 01:32:20'),(19,309,409,'2017-03-24 01:32:20'),(19,310,409,'2017-03-24 01:32:20'),(19,311,409,'2017-03-24 01:32:20'),(20,301,409,'2017-03-24 01:33:00'),(20,302,409,'2017-03-24 01:33:00'),(20,303,409,'2017-03-24 01:33:00'),(20,304,409,'2017-03-24 01:33:00'),(20,305,409,'2017-03-24 01:33:00'),(20,306,409,'2017-03-24 01:33:00'),(20,307,409,'2017-03-24 01:33:01'),(20,308,409,'2017-03-24 01:33:01'),(20,309,409,'2017-03-24 01:33:01'),(20,310,409,'2017-03-24 01:33:01'),(20,311,409,'2017-03-24 01:33:01'),(21,302,409,'2017-03-24 01:33:35'),(21,303,409,'2017-03-24 01:33:36'),(21,304,409,'2017-03-24 01:33:36'),(21,305,409,'2017-03-24 01:33:36'),(21,306,409,'2017-03-24 01:33:36'),(21,307,409,'2017-03-24 01:33:36'),(21,308,409,'2017-03-24 01:33:36'),(21,309,409,'2017-03-24 01:33:36'),(21,310,409,'2017-03-24 01:33:36'),(21,311,409,'2017-03-24 01:33:36'),(22,308,409,'2017-03-24 01:33:58'),(22,309,409,'2017-03-24 01:33:58'),(22,310,409,'2017-03-24 01:33:59'),(22,311,409,'2017-03-24 01:33:59');
/*!40000 ALTER TABLE `credential_requirements_lt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `credentials_mt`
--

DROP TABLE IF EXISTS `credentials_mt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `credentials_mt` (
  `credential_id` int(11) NOT NULL AUTO_INCREMENT,
  `credential_name` varchar(45) NOT NULL,
  `date_added` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `credential_description` text NOT NULL,
  PRIMARY KEY (`credential_id`),
  UNIQUE KEY `credential_name_UNIQUE` (`credential_name`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1 COMMENT='Master Table of Credentials';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `credentials_mt`
--

LOCK TABLES `credentials_mt` WRITE;
/*!40000 ALTER TABLE `credentials_mt` DISABLE KEYS */;
INSERT INTO `credentials_mt` VALUES (18,'Birth Certificate','2017-03-24 01:31:07',''),(19,'Baptismal','2017-03-24 01:32:20',''),(20,'ID','2017-03-24 01:33:00',''),(21,'Report Card','2017-03-24 01:33:35',''),(22,'Certificate Of Good Moral','2017-03-24 01:33:58','');
/*!40000 ALTER TABLE `credentials_mt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `credentials_received_lt`
--

DROP TABLE IF EXISTS `credentials_received_lt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `credentials_received_lt` (
  `credential_id` int(11) NOT NULL,
  `registration_id` int(11) NOT NULL,
  `date_received` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  KEY `credentials_received_ltTABLE_credential_idCOL_idx` (`credential_id`),
  KEY `credentials_received_ltTABLE_registration_idCOL_idx` (`registration_id`),
  CONSTRAINT `credentials_received_ltTABLE_credential_idCOL` FOREIGN KEY (`credential_id`) REFERENCES `credentials_mt` (`credential_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `credentials_received_ltTABLE_registration_idCOL` FOREIGN KEY (`registration_id`) REFERENCES `registration_mt` (`registration_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `credentials_received_lt`
--

LOCK TABLES `credentials_received_lt` WRITE;
/*!40000 ALTER TABLE `credentials_received_lt` DISABLE KEYS */;
/*!40000 ALTER TABLE `credentials_received_lt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `curriculum_mt`
--

DROP TABLE IF EXISTS `curriculum_mt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `curriculum_mt` (
  `curriculum_id` int(11) NOT NULL AUTO_INCREMENT,
  `gradelevel_id` int(11) NOT NULL,
  `schoolyear_id` int(11) NOT NULL,
  `curriculum_title` varchar(45) NOT NULL,
  `description` text NOT NULL,
  `isActive` bit(1) DEFAULT b'1',
  `date_created` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`curriculum_id`),
  UNIQUE KEY `uc_curriculum_mtTABLE_syCOL_glCOL` (`gradelevel_id`,`schoolyear_id`),
  KEY `fk_curriculum_mtTABLE_schoolyear_idCOL_idx` (`schoolyear_id`),
  CONSTRAINT `fk_curriculum_mtTABLE_gradelevel_idCOL` FOREIGN KEY (`gradelevel_id`) REFERENCES `gradelevel_mt` (`gradelevel_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_curriculum_mtTABLE_schoolyear_idCOL` FOREIGN KEY (`schoolyear_id`) REFERENCES `schoolyear_mt` (`schoolyear_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1 COMMENT='Curriculum Master Table to hold all Curriculums.';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curriculum_mt`
--

LOCK TABLES `curriculum_mt` WRITE;
/*!40000 ALTER TABLE `curriculum_mt` DISABLE KEYS */;
INSERT INTO `curriculum_mt` VALUES (4,301,407,'','test1','','2017-03-25 15:00:21'),(6,302,407,'','test1','','2017-03-25 15:00:21'),(7,303,407,'','test1','','2017-03-25 15:00:21'),(9,303,408,'','test1','','2017-03-25 15:00:21');
/*!40000 ALTER TABLE `curriculum_mt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `curriculum_subject_lt`
--

DROP TABLE IF EXISTS `curriculum_subject_lt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `curriculum_subject_lt` (
  `curriculum_id` int(11) NOT NULL,
  `subject_id` int(11) NOT NULL,
  KEY `fk_curriculum_subject_ltTABLE_curriculum_idCOL_idx` (`curriculum_id`),
  KEY `fk_curriculum_subject_ltTABLE_subject_idCOL_idx` (`subject_id`),
  CONSTRAINT `fk_curriculum_subject_ltTABLE_curriculum_idCOL` FOREIGN KEY (`curriculum_id`) REFERENCES `curriculum_mt` (`curriculum_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_curriculum_subject_ltTABLE_subject_idCOL` FOREIGN KEY (`subject_id`) REFERENCES `subject_mt` (`subject_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curriculum_subject_lt`
--

LOCK TABLES `curriculum_subject_lt` WRITE;
/*!40000 ALTER TABLE `curriculum_subject_lt` DISABLE KEYS */;
/*!40000 ALTER TABLE `curriculum_subject_lt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discount_mt`
--

DROP TABLE IF EXISTS `discount_mt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discount_mt` (
  `discount_id` int(11) NOT NULL AUTO_INCREMENT,
  `discount_name` varchar(45) NOT NULL,
  `percentage` int(11) NOT NULL,
  `description` text NOT NULL,
  `date_created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `isActive` bit(1) DEFAULT b'1',
  PRIMARY KEY (`discount_id`),
  UNIQUE KEY `discount_name_UNIQUE` (`discount_name`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1 COMMENT='MASTER table of dicounts';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discount_mt`
--

LOCK TABLES `discount_mt` WRITE;
/*!40000 ALTER TABLE `discount_mt` DISABLE KEYS */;
INSERT INTO `discount_mt` VALUES (4,'Employee Relative',11,'Employee Relative','2017-03-14 14:08:19',''),(5,'Varsity',8,'Discount for Varsity','2017-03-14 14:08:19',''),(7,'Referral',5,'','2017-03-14 14:08:19',''),(8,'Scholar-B',50,'50% Scholarship','2017-03-14 19:15:22',''),(9,'Scholar-A',100,'100% Discount for Scholars','2017-03-14 19:16:57',''),(10,'Scholar-C',25,'25% Discount for Scholars','2017-03-14 19:25:41',''),(11,'sibling discount',30,'sibling discount','2017-03-25 17:42:50','');
/*!40000 ALTER TABLE `discount_mt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enrollment_mt`
--

DROP TABLE IF EXISTS `enrollment_mt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `enrollment_mt` (
  `enrollment_id` int(11) NOT NULL AUTO_INCREMENT,
  `schoolyear_id` int(11) NOT NULL,
  `opening_date` date NOT NULL COMMENT 'any enrollment date prior to "opening_date" date  value will be considered Early Enrollment',
  `closing_date` date NOT NULL COMMENT 'any enrollment date beyond "closing_date" date  value will be considered Late Enrollment',
  `date_created` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`enrollment_id`),
  UNIQUE KEY `schoolyear_id_UNIQUE` (`schoolyear_id`),
  KEY `fk_enrollment_mtTABLE_schoolyear_idCOL_idx` (`schoolyear_id`),
  CONSTRAINT `fk_enrollment_mtTABLE_schoolyear_idCOL` FOREIGN KEY (`schoolyear_id`) REFERENCES `schoolyear_mt` (`schoolyear_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1 COMMENT='This table will store the information of ENROLLMENT SCHEDULE such as when the enrollment OPENS and when the enrollment CLOSES\nEvery enrollment will be associated with a School Year';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enrollment_mt`
--

LOCK TABLES `enrollment_mt` WRITE;
/*!40000 ALTER TABLE `enrollment_mt` DISABLE KEYS */;
INSERT INTO `enrollment_mt` VALUES (2,407,'2017-05-01','2017-06-30','2017-02-28 14:28:12'),(3,408,'2018-05-01','2018-06-01','2017-02-28 21:25:19'),(4,409,'2016-05-01','2016-05-30','2017-03-06 13:46:02'),(7,414,'2019-02-01','2019-03-01','2017-03-09 21:04:56');
/*!40000 ALTER TABLE `enrollment_mt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enrollment_student_lt`
--

DROP TABLE IF EXISTS `enrollment_student_lt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `enrollment_student_lt` (
  `enrollment_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `date_of_enrollment` datetime NOT NULL,
  `isEarlyEnrollment` bit(1) NOT NULL DEFAULT b'0',
  `isLateEnrollment` bit(1) NOT NULL DEFAULT b'0',
  KEY `fk_enrollment_student_ltTABLE_enrollment_idCOL_idx` (`enrollment_id`),
  KEY `fk_enrollment_student_ltTABLE_student_idCOL_idx` (`student_id`),
  CONSTRAINT `fk_enrollment_student_ltTABLE_enrollment_idCOL` FOREIGN KEY (`enrollment_id`) REFERENCES `enrollment_mt` (`enrollment_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_enrollment_student_ltTABLE_student_idCOL` FOREIGN KEY (`student_id`) REFERENCES `student_mt` (`student_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='This will contain all students enrollment dates and will determine whether an enrollment is late enrollment or early enrollment';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enrollment_student_lt`
--

LOCK TABLES `enrollment_student_lt` WRITE;
/*!40000 ALTER TABLE `enrollment_student_lt` DISABLE KEYS */;
INSERT INTO `enrollment_student_lt` VALUES (4,11,'2017-03-24 00:00:00','\0',''),(4,12,'2017-03-25 00:00:00','\0',''),(4,14,'2017-03-25 00:00:00','\0',''),(4,15,'2017-03-25 00:00:00','\0',''),(4,16,'2017-03-25 00:00:00','\0',''),(4,17,'2017-03-25 00:00:00','\0',''),(4,18,'2017-03-25 00:00:00','\0',''),(4,10,'2017-05-12 00:00:00','\0',''),(4,9,'2017-05-13 00:00:00','\0',''),(2,18,'2017-06-19 00:00:00','\0','\0'),(2,16,'2017-06-19 00:00:00','\0','\0');
/*!40000 ALTER TABLE `enrollment_student_lt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `faculty_mt`
--

DROP TABLE IF EXISTS `faculty_mt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `faculty_mt` (
  `faculty_id` int(11) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `middleName` varchar(45) DEFAULT NULL,
  `civilStatus` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `contact` varchar(45) DEFAULT NULL,
  `status` bit(1) DEFAULT NULL,
  `degree` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`faculty_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `faculty_mt`
--

LOCK TABLES `faculty_mt` WRITE;
/*!40000 ALTER TABLE `faculty_mt` DISABLE KEYS */;
INSERT INTO `faculty_mt` VALUES (1,'Jordan','Rizal','Protacio','asdf','In a Relationship','asdf',NULL,NULL),(2,'francis','ochotorina','talaga','single','john@gmail.com','09362250625','\0',NULL),(3,'b','b','b','b','Single','b','\0',NULL),(4,'dasdsad','asdas','asdasasdas','dasd','asdas','dasdas','\0',NULL),(5,'dasd','dasd','dasd','asd','adsdas','asdas','\0',NULL),(6,'paul','neo','t','single','paulnapadao@gmail.com','09273309427','\0',NULL),(7,'paul','neo','t','single','09273309427','paulnapadao@gmail.com','\0',NULL),(8,'ZXZ','dasdasda','asd','adsas','dasd','dsadasdas','\0',NULL);
/*!40000 ALTER TABLE `faculty_mt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `faculty_specialization`
--

DROP TABLE IF EXISTS `faculty_specialization`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `faculty_specialization` (
  `faculty_id` int(11) NOT NULL,
  `specialization_id` int(11) NOT NULL,
  `date_assigned` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  KEY `faculty_specialization_TABLE_facultyId_COL_idx` (`faculty_id`),
  KEY `fk_faculty_specializationTABLE_specialization_idCOL_idx` (`specialization_id`),
  CONSTRAINT `faculty_specialization_TABLE_facultyId_COL` FOREIGN KEY (`faculty_id`) REFERENCES `faculty_mt` (`faculty_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_faculty_specializationTABLE_specialization_idCOL` FOREIGN KEY (`specialization_id`) REFERENCES `specialization` (`specialization_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `faculty_specialization`
--

LOCK TABLES `faculty_specialization` WRITE;
/*!40000 ALTER TABLE `faculty_specialization` DISABLE KEYS */;
/*!40000 ALTER TABLE `faculty_specialization` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fee_category_mt`
--

DROP TABLE IF EXISTS `fee_category_mt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fee_category_mt` (
  `fee_category_id` int(11) NOT NULL AUTO_INCREMENT,
  `fee_category` varchar(45) NOT NULL,
  PRIMARY KEY (`fee_category_id`),
  UNIQUE KEY `feetype_UNIQUE` (`fee_category`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1 COMMENT='MASTER table';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fee_category_mt`
--

LOCK TABLES `fee_category_mt` WRITE;
/*!40000 ALTER TABLE `fee_category_mt` DISABLE KEYS */;
INSERT INTO `fee_category_mt` VALUES (1,'Basic'),(4,'Downpayment'),(2,'Miscellaneous'),(3,'Others');
/*!40000 ALTER TABLE `fee_category_mt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fee_mt`
--

DROP TABLE IF EXISTS `fee_mt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fee_mt` (
  `fee_id` int(11) NOT NULL AUTO_INCREMENT,
  `fee_name` varchar(45) NOT NULL,
  `fee_description` text,
  `fee_category_id` int(11) NOT NULL,
  PRIMARY KEY (`fee_id`),
  UNIQUE KEY `fee_name_UNIQUE` (`fee_name`),
  KEY `fk_fee_mtTABLE_fee_category_idCOL_idx` (`fee_category_id`),
  CONSTRAINT `fk_fee_mtTABLE_fee_category_idCOL` FOREIGN KEY (`fee_category_id`) REFERENCES `fee_category_mt` (`fee_category_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=98 DEFAULT CHARSET=latin1 COMMENT='MASTER';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fee_mt`
--

LOCK TABLES `fee_mt` WRITE;
/*!40000 ALTER TABLE `fee_mt` DISABLE KEYS */;
INSERT INTO `fee_mt` VALUES (90,'Downpayment','Downpayment amount for all grade levels',4),(91,'Tuition','Tuition Fee ',1),(92,'Energy Fee','Energy Fee',2),(93,'Field Trip','Field Trip',3),(94,'Sports Fee','Sports Fee',2),(95,'Clinic Fee','Clinic Fee',2),(96,'Bookk','Book',2),(97,'Sample','Sample Fee',2);
/*!40000 ALTER TABLE `fee_mt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fee_schoolyear_lt`
--

DROP TABLE IF EXISTS `fee_schoolyear_lt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fee_schoolyear_lt` (
  `fee_id` int(11) NOT NULL,
  `fee_amount` decimal(10,2) NOT NULL,
  `gradelevel_id` int(11) NOT NULL,
  `schoolyear_id` int(11) NOT NULL COMMENT 'this column represents the schoolyearid of when this fee was created.',
  `isActive` bit(1) NOT NULL DEFAULT b'1',
  KEY `fk_fee_schoolyear_ltTABLE_fee_idCOL_idx` (`fee_id`),
  KEY `fk_fee_schoolyear_ltTABLE_gradelevel_idCOL_idx` (`gradelevel_id`),
  KEY `fk_fee_schoolyear_ltTABLE_year_createdCOL_idx` (`schoolyear_id`),
  CONSTRAINT `fk_fee_schoolyear_ltTABLE_fee_idCOL` FOREIGN KEY (`fee_id`) REFERENCES `fee_mt` (`fee_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_fee_schoolyear_ltTABLE_gradelevel_idCOL` FOREIGN KEY (`gradelevel_id`) REFERENCES `gradelevel_mt` (`gradelevel_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_fee_schoolyear_ltTABLE_schoolyear_idCOL` FOREIGN KEY (`schoolyear_id`) REFERENCES `schoolyear_mt` (`schoolyear_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Contains the amounts of fees per gradelevel and whether it is still active.';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fee_schoolyear_lt`
--

LOCK TABLES `fee_schoolyear_lt` WRITE;
/*!40000 ALTER TABLE `fee_schoolyear_lt` DISABLE KEYS */;
INSERT INTO `fee_schoolyear_lt` VALUES (90,5000.00,301,409,''),(90,5000.00,302,409,''),(90,5000.00,303,409,''),(90,5000.00,304,409,''),(90,5000.00,305,409,''),(90,5000.00,306,409,''),(90,5000.00,307,409,''),(90,5000.00,308,409,''),(90,5000.00,309,409,''),(90,5000.00,310,409,''),(90,5000.00,311,409,''),(91,8000.00,301,407,''),(91,8000.00,302,407,''),(91,8000.00,303,407,''),(91,8000.00,304,407,''),(91,8000.00,305,407,''),(91,8000.00,306,407,''),(91,8000.00,307,407,''),(91,8000.00,308,407,''),(91,8000.00,309,407,''),(91,8000.00,310,407,''),(91,8000.00,311,407,''),(92,2500.00,301,407,''),(92,2500.00,302,407,''),(92,2500.00,303,407,''),(92,2500.00,304,407,''),(92,2500.00,305,407,''),(92,2500.00,306,407,''),(92,2500.00,307,407,''),(92,2500.00,308,407,''),(92,2500.00,309,407,''),(92,2500.00,310,407,''),(92,2500.00,311,407,''),(93,756.00,301,407,''),(93,756.00,302,407,''),(93,756.00,303,407,''),(93,756.00,304,407,''),(93,756.00,305,407,''),(93,756.00,306,407,''),(93,756.00,307,407,''),(93,756.00,308,407,''),(93,756.00,309,407,''),(93,756.00,310,407,''),(93,756.00,311,407,''),(94,3566.00,308,407,''),(95,1150.00,302,407,''),(95,1150.00,303,407,''),(95,1150.00,304,407,''),(95,1150.00,305,407,''),(95,1150.00,306,407,''),(95,1150.00,307,407,''),(96,500.00,301,407,''),(96,500.00,302,407,''),(96,500.00,303,407,''),(96,500.00,304,407,''),(96,500.00,305,407,''),(96,500.00,306,407,''),(96,500.00,307,407,''),(96,500.00,308,407,''),(96,500.00,309,407,''),(96,500.00,310,407,''),(96,500.00,311,407,''),(97,500.00,301,407,''),(97,500.00,302,407,''),(97,500.00,303,407,''),(97,500.00,304,407,''),(97,500.00,305,407,''),(97,500.00,306,407,''),(97,500.00,307,407,'');
/*!40000 ALTER TABLE `fee_schoolyear_lt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gradelevel_mt`
--

DROP TABLE IF EXISTS `gradelevel_mt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gradelevel_mt` (
  `gradelevel_id` int(11) NOT NULL AUTO_INCREMENT,
  `grade_level` int(11) NOT NULL,
  `isActive` bit(1) NOT NULL DEFAULT b'1',
  PRIMARY KEY (`gradelevel_id`)
) ENGINE=InnoDB AUTO_INCREMENT=312 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gradelevel_mt`
--

LOCK TABLES `gradelevel_mt` WRITE;
/*!40000 ALTER TABLE `gradelevel_mt` DISABLE KEYS */;
INSERT INTO `gradelevel_mt` VALUES (301,0,''),(302,1,''),(303,2,''),(304,3,''),(305,4,''),(306,5,''),(307,6,''),(308,7,''),(309,8,''),(310,9,''),(311,10,'');
/*!40000 ALTER TABLE `gradelevel_mt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payment` (
  `payment_id` int(11) NOT NULL AUTO_INCREMENT,
  `balance_breakdown_fee_id` int(11) NOT NULL,
  `amount_tendered` decimal(10,2) NOT NULL,
  `date_of_payment` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`payment_id`),
  KEY `fk_paymentTABLE_balance_breakdown_fee_idCOL_idx` (`balance_breakdown_fee_id`),
  CONSTRAINT `fk_paymentTABLE_balance_breakdown_fee_idCOL` FOREIGN KEY (`balance_breakdown_fee_id`) REFERENCES `balance_breakdown_fee` (`balance_breakdown_fee_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paymentterm_mt`
--

DROP TABLE IF EXISTS `paymentterm_mt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `paymentterm_mt` (
  `paymentterm_id` int(11) NOT NULL AUTO_INCREMENT,
  `paymentterm` varchar(45) NOT NULL,
  `isActive` bit(1) NOT NULL DEFAULT b'1',
  PRIMARY KEY (`paymentterm_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paymentterm_mt`
--

LOCK TABLES `paymentterm_mt` WRITE;
/*!40000 ALTER TABLE `paymentterm_mt` DISABLE KEYS */;
INSERT INTO `paymentterm_mt` VALUES (2,'Cash',''),(3,'Quarterly',''),(4,'Semestral',''),(5,'Monthly','');
/*!40000 ALTER TABLE `paymentterm_mt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quarter_mt`
--

DROP TABLE IF EXISTS `quarter_mt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quarter_mt` (
  `quarter_id` int(11) NOT NULL AUTO_INCREMENT,
  `quarter_no` int(11) NOT NULL,
  `isActive` bit(1) NOT NULL DEFAULT b'1',
  `description` text,
  `date_added` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`quarter_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quarter_mt`
--

LOCK TABLES `quarter_mt` WRITE;
/*!40000 ALTER TABLE `quarter_mt` DISABLE KEYS */;
INSERT INTO `quarter_mt` VALUES (9,1,'','','2017-03-09 21:04:56'),(10,2,'','','2017-03-09 21:04:56'),(11,3,'','','2017-03-09 21:04:56'),(12,4,'','','2017-03-09 21:04:56');
/*!40000 ALTER TABLE `quarter_mt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registration_mt`
--

DROP TABLE IF EXISTS `registration_mt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `registration_mt` (
  `registration_id` int(11) NOT NULL AUTO_INCREMENT,
  `student_type` varchar(45) NOT NULL,
  `lastname` varchar(45) NOT NULL,
  `firstname` varchar(45) NOT NULL,
  `middlename` varchar(45) NOT NULL,
  `dob` date NOT NULL,
  `pob` varchar(45) NOT NULL,
  `nationality` varchar(45) NOT NULL,
  `religion` varchar(45) NOT NULL,
  `gender` bit(1) NOT NULL,
  `father_firstname` varchar(45) NOT NULL,
  `father_middlename` varchar(45) NOT NULL,
  `father_lastname` varchar(45) NOT NULL,
  `father_occupation` varchar(45) NOT NULL,
  `father_officephone_no` varchar(45) NOT NULL,
  `father_mobile_no` varchar(45) DEFAULT NULL,
  `isFatherContactInCaseEmergency` bit(1) NOT NULL DEFAULT b'0',
  `mother_firstname` varchar(45) NOT NULL,
  `mother_middlename` varchar(45) DEFAULT NULL,
  `mother_lastname` varchar(45) NOT NULL,
  `mother_occupation` varchar(45) NOT NULL,
  `mother_officephone_no` varchar(45) NOT NULL,
  `mother_mobile_no` varchar(45) DEFAULT NULL,
  `isMotherContactInCaseEmergency` bit(1) NOT NULL DEFAULT b'0',
  `guardian_lastname` varchar(45) NOT NULL,
  `guardian_firstname` varchar(45) NOT NULL,
  `guardian_middlename` varchar(45) DEFAULT NULL,
  `guardian_occupation` varchar(45) DEFAULT NULL,
  `guardian_officephone_no` varchar(45) DEFAULT NULL,
  `guardian_mobile_no` varchar(45) DEFAULT NULL,
  `guardian_relation_to_student` varchar(45) DEFAULT NULL,
  `isGuardianContactInCaseEmergency` bit(1) NOT NULL DEFAULT b'0',
  `school_last_attended` varchar(45) DEFAULT NULL,
  `school_last_attended_address` varchar(100) DEFAULT NULL,
  `isDownpaymentPaid` bit(1) DEFAULT b'0',
  `room_or_house_no` varchar(45) NOT NULL,
  `street` varchar(45) NOT NULL,
  `brgy_or_subd` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `province` varchar(45) DEFAULT NULL,
  `gradelevel_id` int(11) NOT NULL,
  `schoolyear_id` int(11) DEFAULT NULL,
  `date_registered` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `paymentterm_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`registration_id`),
  KEY `fk_registration_mtTABLE_gradelevel_idCOL_idx` (`gradelevel_id`),
  KEY `fk_registration_mtTABLE_schoolyear_idCOL_idx` (`schoolyear_id`),
  KEY `fk_registration_mtTABLE_paymentterm_idCOL_idx` (`paymentterm_id`),
  CONSTRAINT `fk_gradelevel_mtTABLE_gradelevel_idCOL` FOREIGN KEY (`gradelevel_id`) REFERENCES `gradelevel_mt` (`gradelevel_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_registration_mtTABLE_gradelevel_idCOL` FOREIGN KEY (`gradelevel_id`) REFERENCES `gradelevel_mt` (`gradelevel_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_registration_mtTABLE_paymentterm_idCOL` FOREIGN KEY (`paymentterm_id`) REFERENCES `paymentterm_mt` (`paymentterm_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_registration_mtTABLE_schoolyear_idCOL` FOREIGN KEY (`schoolyear_id`) REFERENCES `schoolyear_mt` (`schoolyear_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=latin1 COMMENT='Master Table for registration of new students and transferees ';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registration_mt`
--

LOCK TABLES `registration_mt` WRITE;
/*!40000 ALTER TABLE `registration_mt` DISABLE KEYS */;
INSERT INTO `registration_mt` VALUES (9,'New','Smith','John','Michael','2001-02-15','Manila','American','Catholic','','John','Michael','Smith','Engineer','1564546','7871213','','Kristine','Michaels','Taylor','Nurse','6541512','6541512','','','','','','','','','\0','University Of Santo Thomas','Manila','\0','255','Hope','Filinvest','Quezon City','',301,409,'2017-03-24 20:52:55',2),(10,'New','Ahos','Catherine','X','2007-12-13','Philippines','Filipino','Catholic','\0','Rolando','S.','Ahos','Mechanical Engr.','15645649','45454789','','Rosario','T.','Ahos','Accountant','45454789','12032154','','','','','','','','','\0','Bagong Silangan National High School','Bagong Silangan','\0','20','Pilapil St.','Bagong Silangan','Quezon City','',304,409,'2017-03-24 20:52:55',3),(11,'New','Elnas','Jerry','Pili','2002-04-05','Bicol','Filipino','Catholic','','Romeo','M.','Elnas','Manager','989978','7668697','','Maria','V.','Elnas','Housewife','5445','675757675','','Villamor','Elena','C','Housewife','5435435','767567','Aunt','','','','\0','8','Bane','Sto. Tomas','Bicol','Bicol',306,409,'2017-03-24 20:52:55',2),(12,'New','Elnas','Paolo','Santos','1998-10-08','Manila','Filipino','Catholic','','Jericho','Marco','Elnas','Data Scientist','123456798','987654321','','Carlo','Mina','Ragudo','Nurse','65448965','32145611','','','','','','','','','\0','University of San Carlos','Pangasinan','\0','06','Mapayapa','Matahimik','Quezon City','',310,409,'2017-03-24 20:52:55',3),(13,'New','Santos','Frederick','Sebastian','2000-12-14','Philippines','Filipino','Catholic','','Mariano','Aquino','Santos','Systems Engineer','4549876','1203156','','Marie','Marquez','Perez','Psychologist','15146789','0915644987','','','','','','','','','\0','University of the East','Manila','\0','12','Masipag','Kanluran','Quezon City','',304,409,'2017-03-24 20:52:55',2),(14,'New','Maala','Jonnie','U.','2009-08-05','Manila','Filipino','Catholic','','Anthony','R.','Maala','Plumber','4343424','45435454','','Rose','P.','Maala','Housewife','446456','4645656','','Maala','Jinky','P.','Office Staff','4466','46456456','Aunt','\0','','','\0','7','Rhubarb','Greenville','San Juan','NCR',303,409,'2017-03-24 20:52:55',3),(15,'New','Conelly','Miranda','I.','2008-04-05','New York','American','Catholic','\0','Alejandro','L.','Conelly','Manager','4354545','45464646','','Alexandra','K.','Conelly','Housewife','4343424','4534534545','','Conelly','Alexandra','K','Housewife','433454','35435345','Mother','\0','St. Paul School','Virginia','\0','3','45th','Greenville','New York','USA',304,409,'2017-03-24 22:54:15',2),(16,'New','John Francis','Ochotorina','Z.','2006-12-12','Quezon City','Filipino','Catholic','','Elias','Makaryo','Lazaro','Manager','987987456','06654499','','Stephanie','Mina','Lazaro','Doctor','1234654649','091654789','\0','','','','','','','','\0','University of the East','','\0','09','Dahlia','Katahimikan','Quezon City','',306,409,'2017-03-25 10:25:14',3),(17,'Transferee','Napadao','Paul Neo','T','1995-07-30','Bulacan','Filpino','Born Again','','Ireneo','C','Napadao','Teacher','09273309427','092323232323','','Melba','T','Napadao','Teacher','09277777','09273309427','','Napadao','09273309427','T','Teacher','092222','09273309427','Mother','','Vms','Bulacan','\0','Bulacan','Narra','Narra','Bulacan','',306,409,'2017-03-25 10:41:45',2),(18,'Transferee','Antonio','John Ferdinand','Maala','2007-12-12','Quezon City','Filipino','Catholic','','Jine','Gonzales','Antonio','OFW','16547531','0951564867','','Jocelyn','Maala','Antonio','Real Estate Broker','4654654753','159465432','','','','','','','','','\0','FEU Diliman','Manila','\0','03','Emerald','Bagong Silangan','Quezon City','',303,409,'2017-03-25 14:21:33',3),(19,'Transferee','Jacinto','Larry','B.','2000-11-06','Bulacan','Filipino','Catholic','','Luna','S.','Belarmino','OFW','46545687','9879841651','','Teresita','X.','Belarmino','Housewife','4654654','987987987','\0','','','','','','','','\0','University of the Philippines','Diliman Quezon City','\0','45','Manggahan','Narra','Bulacan','',305,409,'2017-03-25 15:27:15',2),(20,'Transferee','Rolle','Karlo','T','1981-03-02','qc','Filpino','Catholic','','Tatay','P','Rolle','Marine','02922919291','09277918179','','nanay','t','rolle','marine','02020201','09277918179','','rolle','nanay','t','marine','02002020202','0927790633','mother','','village montessori school','bulacan','\0','201','santol','mt.view','qc','',302,409,'2017-03-25 15:49:04',3),(21,'Transferee','Domingo','Kim','N','1995-03-01','Mani;a','filipino','INC','\0','Francis','O','Domingo','programmer','02929201','232365923','','marinela','i','Domingo','programmer','2020291910','0927797989826','','domigo','marinela','q','programmer','302300302','09276656565','mother','','Mother of perpetual Help','qc','\0','202','apple','mulawin','','',303,409,'2017-03-25 15:55:52',2),(22,'Transferee','Labilles','Jeno','K','1991-02-05','mexico','American','inc','','Kennteh','P','Labilles','Engineer','201020100','0927797965','','Kristle','I','Labilles','house wife','2002002002','0927995959','','','','','','','','','\0','school of qc','qc','\0','211','makopa','da','qc','',304,409,'2017-03-25 16:00:36',3),(23,'Transferee','taclas','kyle','P','2006-02-03','bulacan','filipino','INC','','jong','K','taclas','Boxer','2002029299','092772323232323','','Arbues','2','Taclas','house wife','0209090909','09277565656','','','','','','','','','\0','Learning','bulacan','\0','202','duhat','green','qc','',307,409,'2017-03-25 16:17:34',2),(24,'New','Magturo','Tin','M','1980-03-26','Jeddah','Arabian','Catholic','\0','magturo','magturo','magturo','magturo','magturo','magturo','\0','magturo','magturo','magturo','magturo','magturo','magturo','\0','magturo','magturo','magturo','magturo','312312312','23423423','mother','','FEU','Diliman','\0','303','santol','mangga','qc','qc',308,409,'2017-03-25 17:29:47',3),(28,'Transferee','Test','Test','Test','2001-07-06','Test','Test','Test','','Test','Test','Test','Test','Test','Test','','Test','Test','Test','Test','Test','Test','','Test','Test','Test','Test','Test','Test','Test','','Test','Test','\0','Test','Test','Test','Test','Test',307,409,'2017-05-10 19:29:52',3),(29,'New','Test','Test','Test','1988-08-01','Test','Test','Test','','Test','Test','Test','Test','Test','Test','','Test','Test','Test','Test','Test','Test','\0','Test','Test','Test','Test','Test','Test','Test','\0','Test','Test','\0','Test','Test','Test','Test','Test',307,407,'2017-06-29 23:50:09',5),(30,'New','Test2','Test2','Test2','2004-12-12','Test2','Test2','Test2','','Test2','Test2','Test2','Test2','Test2','Test2','','Test2','Test2','Test2','Test2','Test2','Test2','','Test2','Test2','Test2','Test2','Test2','Test2','Test2','\0','Test2','Test2','\0','Test2','Test2','Test2','Test2','Test2',303,407,'2017-06-30 12:13:50',2),(31,'Transferee','Test3','Test3','Test3','1995-04-01','Test3','Test3','Test3','','Test3','Test3','Test3','Test3','Test3','Test3','','Test3','Test3','Test3','Test3','Test3','Test3','','Test3','Test3','Test3','Test3','Test3','Test3','Test3','\0','Test3','Test3','\0','Test3','Test3','Test3','Test3','Test3',305,407,'2017-06-30 12:18:45',4),(32,'New','Test4','Test4','Test4','2006-11-11','Test4','Test4','Test4','','Test4','Test4','Test4','Test4','Test4','Test4','','Test4','Test4','Test4','Test4','Test4','Test4','','Test4','Test4','Test4','Test4','','','','\0','','','\0','Test4','Test4','Test4','Test4','Test4',303,407,'2017-06-30 13:07:25',4);
/*!40000 ALTER TABLE `registration_mt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room_mt`
--

DROP TABLE IF EXISTS `room_mt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room_mt` (
  `room_id` int(11) NOT NULL AUTO_INCREMENT,
  `room_name_or_num` varchar(45) NOT NULL,
  `bldg_name_or_num` varchar(45) NOT NULL,
  `capacity` int(11) NOT NULL,
  PRIMARY KEY (`room_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room_mt`
--

LOCK TABLES `room_mt` WRITE;
/*!40000 ALTER TABLE `room_mt` DISABLE KEYS */;
INSERT INTO `room_mt` VALUES (1,'Room Test','Bldg 5',30),(2,'Room 2','302',40);
/*!40000 ALTER TABLE `room_mt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `schoolyear_mt`
--

DROP TABLE IF EXISTS `schoolyear_mt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `schoolyear_mt` (
  `schoolyear_id` int(11) NOT NULL AUTO_INCREMENT,
  `yearFrom` int(11) NOT NULL,
  `yearTo` int(11) NOT NULL,
  `isActive` bit(1) NOT NULL DEFAULT b'1',
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `isCurrentSchoolYear` bit(1) DEFAULT b'0',
  PRIMARY KEY (`schoolyear_id`),
  UNIQUE KEY `yearFrom_UNIQUE` (`yearFrom`),
  UNIQUE KEY `yearTo_UNIQUE` (`yearTo`)
) ENGINE=InnoDB AUTO_INCREMENT=415 DEFAULT CHARSET=latin1 COMMENT='School Year Master Table';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schoolyear_mt`
--

LOCK TABLES `schoolyear_mt` WRITE;
/*!40000 ALTER TABLE `schoolyear_mt` DISABLE KEYS */;
INSERT INTO `schoolyear_mt` VALUES (407,2017,2018,'\0','2017-06-01','2018-03-01',''),(408,2018,2019,'\0','2018-06-01','2019-03-01','\0'),(409,2016,2017,'\0','2016-06-01','2017-05-30','\0'),(414,2019,2020,'\0','2019-01-04','2020-04-04','\0');
/*!40000 ALTER TABLE `schoolyear_mt` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `yearEndCheck_before_insert` BEFORE INSERT ON `schoolyear_mt` FOR EACH ROW BEGIN
IF(NEW.yearTo != NEW.yearFrom + 1) THEN
SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Invalid Year End';

END IF;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `schoolyear_quarter_lt`
--

DROP TABLE IF EXISTS `schoolyear_quarter_lt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `schoolyear_quarter_lt` (
  `schoolyear_id` int(11) NOT NULL,
  `quarter_id` int(11) NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `isCurrentQuarter` bit(1) NOT NULL DEFAULT b'0',
  UNIQUE KEY `uc_schoolyear_idCOL_semester_idCOL` (`schoolyear_id`,`quarter_id`),
  KEY `fk_schoolyear_quarter_ltTABLE_schoolyear_idCOL_idx` (`schoolyear_id`),
  KEY `fk_schoolyear_semester_ltTABLE_quarter_idCOL_idx` (`quarter_id`),
  CONSTRAINT `fk_schoolyear_quarter_ltTABLE_quarter_idCOL` FOREIGN KEY (`quarter_id`) REFERENCES `quarter_mt` (`quarter_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_schoolyear_quarter_ltTABLE_schoolyear_idCOL` FOREIGN KEY (`schoolyear_id`) REFERENCES `schoolyear_mt` (`schoolyear_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schoolyear_quarter_lt`
--

LOCK TABLES `schoolyear_quarter_lt` WRITE;
/*!40000 ALTER TABLE `schoolyear_quarter_lt` DISABLE KEYS */;
INSERT INTO `schoolyear_quarter_lt` VALUES (414,9,'2017-03-04','2017-05-04','\0'),(414,10,'2017-05-01','2017-05-05','\0'),(414,11,'2017-05-05','2017-06-05','\0'),(414,12,'2017-04-02','2020-05-03','\0');
/*!40000 ALTER TABLE `schoolyear_quarter_lt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `schoolyear_section_lt`
--

DROP TABLE IF EXISTS `schoolyear_section_lt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `schoolyear_section_lt` (
  `schoolyear_section_id` int(11) NOT NULL AUTO_INCREMENT,
  `section_id` int(11) NOT NULL,
  `session_id` int(11) NOT NULL,
  `schoolyear_id` int(11) NOT NULL,
  `gradelevel_id` int(11) NOT NULL,
  `capacity` int(11) NOT NULL,
  PRIMARY KEY (`schoolyear_section_id`),
  UNIQUE KEY `uc_schoolyear_sectionTABLE_section_id_schoolyear_id_session_id` (`section_id`,`session_id`,`schoolyear_id`),
  KEY `fk_schoolyear_sectionTABLE_section_idCOL_idx` (`section_id`),
  KEY `fk_schoolyear_sectionTABLE_session_idCOL_idx` (`session_id`),
  KEY `fk_schoolyear_sectionTABLE_schoolyear_idCOL_idx` (`schoolyear_id`),
  KEY `fk_schoolyear_sectionTABLE_gradelevel_idCOL_idx` (`gradelevel_id`),
  CONSTRAINT `fk_schoolyear_sectionTABLE_gradelevel_idCOL` FOREIGN KEY (`gradelevel_id`) REFERENCES `gradelevel_mt` (`gradelevel_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_schoolyear_sectionTABLE_schoolyear_idCOL` FOREIGN KEY (`schoolyear_id`) REFERENCES `schoolyear_mt` (`schoolyear_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_schoolyear_sectionTABLE_section_idCOL` FOREIGN KEY (`section_id`) REFERENCES `section_mt` (`section_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_schoolyear_sectionTABLE_session_idCOL` FOREIGN KEY (`session_id`) REFERENCES `session_mt` (`session_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schoolyear_section_lt`
--

LOCK TABLES `schoolyear_section_lt` WRITE;
/*!40000 ALTER TABLE `schoolyear_section_lt` DISABLE KEYS */;
INSERT INTO `schoolyear_section_lt` VALUES (6,30,1,409,301,25),(7,30,2,409,301,15),(8,31,1,409,301,25),(9,31,2,409,301,30),(10,32,1,409,302,25),(11,33,1,409,311,30);
/*!40000 ALTER TABLE `schoolyear_section_lt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `schoolyear_student_lt`
--

DROP TABLE IF EXISTS `schoolyear_student_lt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `schoolyear_student_lt` (
  `schoolyear_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `gradelevel_id` int(11) NOT NULL,
  `section_id` int(11) DEFAULT NULL,
  `passed` bit(1) DEFAULT b'0',
  UNIQUE KEY `uk_schoolyear_idCOL_student_idCOL` (`schoolyear_id`,`student_id`),
  KEY `fk_schoolyear_student_ltTABLE_schoolyear_idCOL_idx` (`schoolyear_id`),
  KEY `fk_schoolyear_student_ltTABLE_student_idCOL_idx` (`student_id`),
  KEY `fk_schoolyear_student_ltTABLE_gradelevel_idCOL_idx` (`gradelevel_id`),
  CONSTRAINT `fk_schoolyear_student_ltTABLE_gradelevel_idCOL` FOREIGN KEY (`gradelevel_id`) REFERENCES `gradelevel_mt` (`gradelevel_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_schoolyear_student_ltTABLE_schoolyear_idCOL` FOREIGN KEY (`schoolyear_id`) REFERENCES `schoolyear_mt` (`schoolyear_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_schoolyear_student_ltTABLE_student_idCOL` FOREIGN KEY (`student_id`) REFERENCES `student_mt` (`student_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schoolyear_student_lt`
--

LOCK TABLES `schoolyear_student_lt` WRITE;
/*!40000 ALTER TABLE `schoolyear_student_lt` DISABLE KEYS */;
INSERT INTO `schoolyear_student_lt` VALUES (407,16,303,NULL,'\0'),(407,18,308,NULL,'\0'),(409,9,310,NULL,'\0'),(409,10,304,NULL,'\0'),(409,11,304,NULL,'\0'),(409,12,303,NULL,'\0'),(409,14,306,NULL,'\0'),(409,15,306,NULL,'\0'),(409,16,303,NULL,'\0'),(409,17,305,NULL,'\0'),(409,18,308,NULL,'\0');
/*!40000 ALTER TABLE `schoolyear_student_lt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `section_gradelevel_lt`
--

DROP TABLE IF EXISTS `section_gradelevel_lt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `section_gradelevel_lt` (
  `section_id` int(11) NOT NULL,
  `gradelevel_id` int(11) NOT NULL,
  KEY `fk_section_gradelevel_ltTABLE_section_idCOL_idx` (`section_id`),
  KEY `fk_section_gradelevel_ltTABLE_gradelevel_idCOL_idx` (`gradelevel_id`),
  CONSTRAINT `fk_section_gradelevel_ltTABLE_gradelevel_idCOL` FOREIGN KEY (`gradelevel_id`) REFERENCES `gradelevel_mt` (`gradelevel_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_section_gradelevel_ltTABLE_section_idCOL` FOREIGN KEY (`section_id`) REFERENCES `section_mt` (`section_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `section_gradelevel_lt`
--

LOCK TABLES `section_gradelevel_lt` WRITE;
/*!40000 ALTER TABLE `section_gradelevel_lt` DISABLE KEYS */;
/*!40000 ALTER TABLE `section_gradelevel_lt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `section_mt`
--

DROP TABLE IF EXISTS `section_mt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `section_mt` (
  `section_id` int(11) NOT NULL AUTO_INCREMENT,
  `sectionName` varchar(45) NOT NULL,
  `isActive` bit(1) NOT NULL DEFAULT b'1',
  `date_created` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`section_id`),
  UNIQUE KEY `sectionName_UNIQUE` (`sectionName`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=latin1 COMMENT='Master table for storing all sections only. Students sections information will be put on a different table';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `section_mt`
--

LOCK TABLES `section_mt` WRITE;
/*!40000 ALTER TABLE `section_mt` DISABLE KEYS */;
INSERT INTO `section_mt` VALUES (30,'First Section','','2017-03-22 05:32:06'),(31,'Jordan\'s Section','','2017-03-22 05:50:38'),(32,'Try Section','','2017-03-22 05:58:27'),(33,'physics10','','2017-03-25 10:53:05');
/*!40000 ALTER TABLE `section_mt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `section_student`
--

DROP TABLE IF EXISTS `section_student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `section_student` (
  `section_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `schoolyear_id` int(11) NOT NULL,
  KEY `fk_students_sectionTABLE_section_idCOL_idx` (`section_id`),
  KEY `fk_students_sectionTABLE_schoolyear_idCOL_idx` (`schoolyear_id`),
  CONSTRAINT `fk_section_studentTABLE_schoolyear_idCOL` FOREIGN KEY (`schoolyear_id`) REFERENCES `schoolyear_mt` (`schoolyear_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_section_studentTABLE_section_idCOL` FOREIGN KEY (`section_id`) REFERENCES `section_mt` (`section_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `section_student`
--

LOCK TABLES `section_student` WRITE;
/*!40000 ALTER TABLE `section_student` DISABLE KEYS */;
/*!40000 ALTER TABLE `section_student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `session_mt`
--

DROP TABLE IF EXISTS `session_mt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `session_mt` (
  `session_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  PRIMARY KEY (`session_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `session_mt`
--

LOCK TABLES `session_mt` WRITE;
/*!40000 ALTER TABLE `session_mt` DISABLE KEYS */;
INSERT INTO `session_mt` VALUES (1,'AM'),(2,'PM');
/*!40000 ALTER TABLE `session_mt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `specialization`
--

DROP TABLE IF EXISTS `specialization`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `specialization` (
  `specialization_id` int(11) NOT NULL AUTO_INCREMENT,
  `specialization_title` varchar(45) NOT NULL,
  `isActive` bit(1) NOT NULL DEFAULT b'1',
  `description` text NOT NULL,
  `date_created` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`specialization_id`),
  UNIQUE KEY `specialization_title_UNIQUE` (`specialization_title`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `specialization`
--

LOCK TABLES `specialization` WRITE;
/*!40000 ALTER TABLE `specialization` DISABLE KEYS */;
INSERT INTO `specialization` VALUES (1,'English','','English specialization',NULL),(2,'Mathematics','','Math Subjects',NULL),(3,'Science','','',NULL);
/*!40000 ALTER TABLE `specialization` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_address_lt`
--

DROP TABLE IF EXISTS `student_address_lt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_address_lt` (
  `students_address_id` int(10) NOT NULL AUTO_INCREMENT,
  `student_id` int(10) NOT NULL,
  `room_houseNo` int(10) DEFAULT NULL,
  `street` varchar(45) DEFAULT NULL,
  `brgy_or_subd` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`students_address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Students Address Child Table of Students ';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_address_lt`
--

LOCK TABLES `student_address_lt` WRITE;
/*!40000 ALTER TABLE `student_address_lt` DISABLE KEYS */;
/*!40000 ALTER TABLE `student_address_lt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_discount_lt`
--

DROP TABLE IF EXISTS `student_discount_lt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_discount_lt` (
  `student_id` int(11) NOT NULL,
  `discount_id` int(11) NOT NULL,
  `schoolyear_id` int(11) NOT NULL,
  `date_applied` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `amount` decimal(10,2) NOT NULL,
  KEY `fk_student_discount_ltTABLE_student_idCOL_idx` (`student_id`),
  KEY `fk_student_discount_ltTABLE_discount_idCOL_idx` (`discount_id`),
  KEY `fk_student_discount_ltTABLE_schoolyear_idCOL_idx` (`schoolyear_id`),
  CONSTRAINT `fk_student_discount_ltTABLE_discount_idCOL` FOREIGN KEY (`discount_id`) REFERENCES `discount_mt` (`discount_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_discount_ltTABLE_schoolyear_idCOL` FOREIGN KEY (`schoolyear_id`) REFERENCES `schoolyear_mt` (`schoolyear_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_discount_ltTABLE_student_idCOL` FOREIGN KEY (`student_id`) REFERENCES `student_mt` (`student_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_discount_lt`
--

LOCK TABLES `student_discount_lt` WRITE;
/*!40000 ALTER TABLE `student_discount_lt` DISABLE KEYS */;
INSERT INTO `student_discount_lt` VALUES (24,10,407,'2017-06-30 12:24:20',0.00),(26,4,407,'2017-06-30 13:10:57',0.00);
/*!40000 ALTER TABLE `student_discount_lt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_mt`
--

DROP TABLE IF EXISTS `student_mt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_mt` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `registration_id` int(11) NOT NULL COMMENT 'registration_id is a foreign key referencing to registration_mt table',
  `entry_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `isGraduated` bit(1) NOT NULL DEFAULT b'0' COMMENT 'isGraduate column gets updated with 1 when student graduates',
  `date_graduated` datetime DEFAULT NULL,
  `isActive` bit(1) DEFAULT b'0' COMMENT 'isActive column resets to 0 every after 1 schoolyear.\nThe date depends on the EXACT start date of schoolyear.\n\nAll enrolled students will have isActive status of 1 which mean ENROLLED',
  `student_type` bit(1) DEFAULT b'1' COMMENT 'Default student type of all students is "New" or 1\nAll Students start as New Student then becomes old student after 1 schoolyear. ',
  PRIMARY KEY (`student_id`),
  UNIQUE KEY `registration_id_UNIQUE` (`registration_id`),
  KEY `fk_student_mtTABLE_registration_idCOL_idx` (`registration_id`),
  CONSTRAINT `fk_student_mtTABLE_registration_idCOL` FOREIGN KEY (`registration_id`) REFERENCES `registration_mt` (`registration_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=latin1 COMMENT='Students Master Table';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_mt`
--

LOCK TABLES `student_mt` WRITE;
/*!40000 ALTER TABLE `student_mt` DISABLE KEYS */;
INSERT INTO `student_mt` VALUES (7,9,'2017-03-21 15:06:30','\0',NULL,'\0',''),(8,11,'2017-03-24 00:30:52','\0',NULL,'\0',''),(9,12,'2017-03-24 18:15:54','\0',NULL,'',''),(10,10,'2017-03-24 18:21:50','\0',NULL,'',''),(11,13,'2017-03-24 18:28:49','\0',NULL,'',''),(12,14,'2017-03-24 18:51:21','\0',NULL,'',''),(13,15,'2017-03-24 22:55:15','\0',NULL,'\0',''),(14,16,'2017-03-25 10:25:38','\0',NULL,'',''),(15,17,'2017-03-25 10:43:06','\0',NULL,'',''),(16,18,'2017-03-25 14:21:53','\0',NULL,'',''),(17,19,'2017-03-25 15:27:34','\0',NULL,'',''),(18,24,'2017-03-25 17:31:09','\0',NULL,'',''),(19,20,'2017-05-12 18:45:20','\0',NULL,'\0',''),(20,28,'2017-05-13 21:41:24','\0',NULL,'\0',''),(21,21,'2017-05-15 21:46:33','\0',NULL,'\0',''),(22,22,'2017-05-19 17:07:37','\0',NULL,'\0',''),(23,29,'2017-06-29 23:50:32','\0',NULL,'\0',''),(24,30,'2017-06-30 12:14:02','\0',NULL,'\0',''),(25,31,'2017-06-30 12:18:57','\0',NULL,'\0',''),(26,32,'2017-06-30 13:08:00','\0',NULL,'\0','');
/*!40000 ALTER TABLE `student_mt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_paymentterm_lt`
--

DROP TABLE IF EXISTS `student_paymentterm_lt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_paymentterm_lt` (
  `student_id` int(11) NOT NULL,
  `paymentterm_id` int(11) NOT NULL,
  `schoolyear_id` int(11) NOT NULL,
  KEY `fk_student_paymentterm_ltTABLE_student_idCOL_idx` (`student_id`),
  KEY `fk_student_paymentterm_ltTABLE_paymentterm_idCOL_idx` (`paymentterm_id`),
  KEY `fk_student_paymentterm_ltTABLE_schoolyear_idCOL_idx` (`schoolyear_id`),
  CONSTRAINT `fk_student_paymentterm_ltTABLE_paymentterm_idCOL` FOREIGN KEY (`paymentterm_id`) REFERENCES `paymentterm_mt` (`paymentterm_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_paymentterm_ltTABLE_schoolyear_idCOL` FOREIGN KEY (`schoolyear_id`) REFERENCES `schoolyear_mt` (`schoolyear_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_paymentterm_ltTABLE_student_idCOL` FOREIGN KEY (`student_id`) REFERENCES `student_mt` (`student_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_paymentterm_lt`
--

LOCK TABLES `student_paymentterm_lt` WRITE;
/*!40000 ALTER TABLE `student_paymentterm_lt` DISABLE KEYS */;
INSERT INTO `student_paymentterm_lt` VALUES (24,2,407),(26,4,407);
/*!40000 ALTER TABLE `student_paymentterm_lt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject_gradelevel_lt`
--

DROP TABLE IF EXISTS `subject_gradelevel_lt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subject_gradelevel_lt` (
  `subject_id` int(10) NOT NULL,
  `gradelevel_id` int(10) NOT NULL,
  KEY `fk_subjects_gradelevel_dtTable_subjectId_idx` (`subject_id`),
  KEY `fk_subjects_gradelevel_Table_gradeLevelId_idx` (`gradelevel_id`),
  CONSTRAINT `fk_subject_gradelevelTABLE_gradelevel_idCOL` FOREIGN KEY (`gradelevel_id`) REFERENCES `gradelevel_mt` (`gradelevel_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_subject_gradelevelTABLE_subject_idCOL` FOREIGN KEY (`subject_id`) REFERENCES `subject_mt` (`subject_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject_gradelevel_lt`
--

LOCK TABLES `subject_gradelevel_lt` WRITE;
/*!40000 ALTER TABLE `subject_gradelevel_lt` DISABLE KEYS */;
INSERT INTO `subject_gradelevel_lt` VALUES (71,305),(72,305),(73,305);
/*!40000 ALTER TABLE `subject_gradelevel_lt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject_mt`
--

DROP TABLE IF EXISTS `subject_mt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subject_mt` (
  `subject_id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) NOT NULL,
  `title` varchar(255) NOT NULL,
  `description` text NOT NULL,
  `isActive` bit(1) NOT NULL DEFAULT b'1',
  PRIMARY KEY (`subject_id`),
  UNIQUE KEY `code_UNIQUE` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=74 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject_mt`
--

LOCK TABLES `subject_mt` WRITE;
/*!40000 ALTER TABLE `subject_mt` DISABLE KEYS */;
INSERT INTO `subject_mt` VALUES (60,'GR1MOTO','Mother Tongue','Mother Tongue',''),(61,'1','English','English',''),(62,'2','Math','Math',''),(63,'3','GMRC','GMRC',''),(64,'5','Science','Science.',''),(67,'4','PE','PE',''),(68,'6','English','English',''),(70,'7','MATH','MATH',''),(71,'ENG111','English','English	',''),(72,'Physics100','Physics','Physics',''),(73,'Chemistry111','Chemistry','Chemistry','');
/*!40000 ALTER TABLE `subject_mt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transaction_mt`
--

DROP TABLE IF EXISTS `transaction_mt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transaction_mt` (
  `transaction_id` int(11) NOT NULL AUTO_INCREMENT,
  `transaction_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `student_id` int(11) NOT NULL,
  PRIMARY KEY (`transaction_id`),
  KEY `fk_transaction_mtTABLE_student_idCOL_idx` (`student_id`),
  CONSTRAINT `fk_transaction_mtTABLE_student_idCOL` FOREIGN KEY (`student_id`) REFERENCES `student_mt` (`student_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction_mt`
--

LOCK TABLES `transaction_mt` WRITE;
/*!40000 ALTER TABLE `transaction_mt` DISABLE KEYS */;
INSERT INTO `transaction_mt` VALUES (1,'2017-06-29 19:34:39',18),(2,'2017-06-29 19:39:35',18),(3,'2017-06-29 20:27:33',18),(4,'2017-06-29 23:51:10',20),(5,'2017-06-30 12:19:41',25),(6,'2017-06-30 12:20:42',24),(7,'2017-06-30 12:21:40',17),(8,'2017-06-30 12:24:20',24),(9,'2017-06-30 13:10:57',26);
/*!40000 ALTER TABLE `transaction_mt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transaction_payment_lt`
--

DROP TABLE IF EXISTS `transaction_payment_lt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transaction_payment_lt` (
  `transaction_id` int(11) NOT NULL,
  `payment_id` int(11) NOT NULL,
  PRIMARY KEY (`transaction_id`),
  KEY `fk_transaction_payment_ltTABLE_payment_idCOL_idx` (`payment_id`),
  CONSTRAINT `fk_transaction_payment_ltTABLE_payment_idCOL` FOREIGN KEY (`payment_id`) REFERENCES `payment` (`payment_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_transaction_payment_ltTABLE_transaction_idCOL` FOREIGN KEY (`transaction_id`) REFERENCES `transaction_mt` (`transaction_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction_payment_lt`
--

LOCK TABLES `transaction_payment_lt` WRITE;
/*!40000 ALTER TABLE `transaction_payment_lt` DISABLE KEYS */;
/*!40000 ALTER TABLE `transaction_payment_lt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuition_fee`
--

DROP TABLE IF EXISTS `tuition_fee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tuition_fee` (
  `balance_breakdown_fee_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `schoolyear_id` int(11) NOT NULL,
  `date_assigned` datetime DEFAULT CURRENT_TIMESTAMP,
  KEY `fk_student_feesTABLE_schoolyear_idCOL_idx` (`schoolyear_id`),
  KEY `fk_student_feesTABLE_student_idCOL_idx` (`student_id`),
  KEY `fk_tuition_feeTABLE_balance_breakdown_fee_idCOL_idx` (`balance_breakdown_fee_id`),
  CONSTRAINT `fk_tuition_feeTABLE_student_idCOL` FOREIGN KEY (`student_id`) REFERENCES `student_mt` (`student_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuition_fee`
--

LOCK TABLES `tuition_fee` WRITE;
/*!40000 ALTER TABLE `tuition_fee` DISABLE KEYS */;
INSERT INTO `tuition_fee` VALUES (47,24,407,'2017-06-30 12:24:20'),(48,24,407,'2017-06-30 12:24:20'),(49,26,407,'2017-06-30 13:10:57'),(50,26,407,'2017-06-30 13:10:57'),(51,26,407,'2017-06-30 13:10:57'),(52,26,407,'2017-06-30 13:10:57');
/*!40000 ALTER TABLE `tuition_fee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_mt`
--

DROP TABLE IF EXISTS `user_mt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_mt` (
  `user_id` int(255) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `isActive` smallint(1) NOT NULL DEFAULT '1',
  `isLocked` smallint(1) NOT NULL DEFAULT '0',
  `lastname` varchar(255) NOT NULL,
  `firstname` varchar(255) NOT NULL,
  `middlename` varchar(255) NOT NULL,
  `lastLoginDate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `dateCreated` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `addedBy` varchar(255) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `uc_username` (`username`),
  UNIQUE KEY `password_UNIQUE` (`password`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1 COMMENT='Users Master Table';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_mt`
--

LOCK TABLES `user_mt` WRITE;
/*!40000 ALTER TABLE `user_mt` DISABLE KEYS */;
INSERT INTO `user_mt` VALUES (3,'jordan','jordanjordanjoan',1,0,'Antonio','John Ferdinand','Maala','2017-06-30 15:07:51','2016-05-18 22:35:02','jordan');
/*!40000 ALTER TABLE `user_mt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'enrollmentdb'
--
/*!50106 SET @save_time_zone= @@TIME_ZONE */ ;
/*!50106 DROP EVENT IF EXISTS `e_setAllStudentsInactive` */;
DELIMITER ;;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;;
/*!50003 SET character_set_client  = utf8 */ ;;
/*!50003 SET character_set_results = utf8 */ ;;
/*!50003 SET collation_connection  = utf8_general_ci */ ;;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;;
/*!50003 SET @saved_time_zone      = @@time_zone */ ;;
/*!50003 SET time_zone             = 'SYSTEM' */ ;;
/*!50106 CREATE*/ /*!50117 DEFINER=`root`@`localhost`*/ /*!50106 EVENT `e_setAllStudentsInactive` ON SCHEDULE EVERY 1 SECOND STARTS '2017-02-27 09:53:26' ON COMPLETION NOT PRESERVE ENABLE DO CALL setAllStudentsInactive */ ;;
/*!50003 SET time_zone             = @saved_time_zone */ ;;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;;
/*!50003 SET character_set_client  = @saved_cs_client */ ;;
/*!50003 SET character_set_results = @saved_cs_results */ ;;
/*!50003 SET collation_connection  = @saved_col_connection */ ;;
/*!50106 DROP EVENT IF EXISTS `e_setCurrentSchoolYear` */;;
DELIMITER ;;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;;
/*!50003 SET character_set_client  = utf8 */ ;;
/*!50003 SET character_set_results = utf8 */ ;;
/*!50003 SET collation_connection  = utf8_general_ci */ ;;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;;
/*!50003 SET @saved_time_zone      = @@time_zone */ ;;
/*!50003 SET time_zone             = 'SYSTEM' */ ;;
/*!50106 CREATE*/ /*!50117 DEFINER=`root`@`localhost`*/ /*!50106 EVENT `e_setCurrentSchoolYear` ON SCHEDULE EVERY 1 SECOND STARTS '2017-02-17 18:55:28' ON COMPLETION NOT PRESERVE ENABLE DO CALL setCurrentSchoolYear() */ ;;
/*!50003 SET time_zone             = @saved_time_zone */ ;;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;;
/*!50003 SET character_set_client  = @saved_cs_client */ ;;
/*!50003 SET character_set_results = @saved_cs_results */ ;;
/*!50003 SET collation_connection  = @saved_col_connection */ ;;
DELIMITER ;
/*!50106 SET TIME_ZONE= @save_time_zone */ ;

--
-- Dumping routines for database 'enrollmentdb'
--
/*!50003 DROP PROCEDURE IF EXISTS ` getAllSchoolYearInfo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE ` getAllSchoolYearInfo`()
BEGIN
	SELECT * FROM schoolyear_mt;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addBalanceBreakDownFee` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addBalanceBreakDownFee`(aDescription TEXT, anAmount decimal (10,2), OUT aBalanceBreakDownFeeId INT)
BEGIN

INSERT INTO balance_breakdown_fee
(description, amount)
VALUES
(aDescription, anAmount);

SELECT LAST_INSERT_ID() INTO aBalanceBreakDownFeeId;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addCredential` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addCredential`(aCredentialName VARCHAR(255),aCredentialDescription VARCHAR(255),OUT aCredentialId INT)
BEGIN

INSERT INTO credentials_mt(credential_name,credential_description)
VALUES(aCredentialName,aCredentialDescription);

SELECT LAST_INSERT_ID() INTO aCredentialId;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addCurriculum` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addCurriculum`(	
	IN p_educationalStageId varchar(100), 
	IN p_description TEXT, 
	IN p_gradeLevelId INT,
    IN p_schoolYearId INT,
    IN p_addedBy_UserId INT,
    IN p_editedBy_UserId INT
    )
BEGIN

	DECLARE var_curriculumId INT;
    
    DECLARE EXIT HANDLER FOR sqlexception
    BEGIN
		ROLLBACK;
        SELECT 'Failed to add curriculum';
        RESIGNAL;
    END;
	
	
    
    
    START TRANSACTION;
	
    INSERT INTO curriculum_mt(educationalstage_id, description, gradeLevelId)
    VALUES(p_educationalStageId,p_description,p_gradeLevelId);
    
    
    SELECT LAST_INSERT_ID() INTO var_curriculumId;
    
    
    INSERT INTO curriculum_hd(curriculumId, addedBy_UserId, editedBy_UserId, dateLastEdited)
    VALUES(var_curriculumId,p_addedBy_UserId,p_editedBy_UserId,NOW());
    
    
    INSERT INTO curriculum_schoolyears(curriculumId, schoolYearId)
    VALUES(var_curriculumId,p_schoolYearId);
    
		COMMIT;
        SELECT 'Successfully added curriculum' AS msg; 
    
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addCurriculumSubject` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addCurriculumSubject`( IN aEducationalStageId INT,IN aGradeLevelId INT, IN aSchoolYearId INT, IN aSubjectId INT,IN aAddedByUserId INT )
BEGIN
	DECLARE EXIT HANDLER FOR sqlexception
    BEGIN
		ROLLBACK;
        RESIGNAL;
    END;

	START TRANSACTION;

	INSERT INTO curriculum_subjects(curriculumId,subjectId,addedBy_UserId)
    VALUES
    (
    
		(SELECT c.id FROM curriculum_mt 			c 								
        INNER JOIN curriculum_schoolyears	 	cs 	ON c.id = cs.curriculumId 
        INNER JOIN schoolyear_mt	 				s 	ON cs.schoolYearId = s.id 
        INNER JOIN gradelevel_mt	 				g 	ON c.gradeLevelId = g.gradelevel_id 
		INNER JOIN 	educationalstage			es ON c.educationalstage_id = es.id
            WHERE 
            
            c.educationalstage_id 	 = aEducationalStageId 			AND 
			g.gradelevel_id  = aGradeLevelId 	AND 
			s.id = aSchoolYearId
		),
		
		aSubjectId,aAddedByUserId
    
    );
    
    
		COMMIT;
        
	
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addCurriculumWithSubjects` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addCurriculumWithSubjects`(OUT pOUT_subjectId INT, IN pIN_subjectCode VARCHAR(250), IN pIN_curriculumId INT)
BEGIN
	START TRANSACTION;
	SELECT subject_id INTO pOUT_subjectId FROM subject_mt WHERE code = pIN_subjectCode;
    
    INSERT INTO curriculum_subject_lt(curriculum_id,subject_id)
    VALUES(pIN_curriculumId, pOUT_subjectId);
    COMMIT;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addDiscount` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addDiscount`(aDiscountName VARCHAR(255), aDiscountPercentage INT,
aDescription TEXT)
BEGIN

DECLARE EXIT HANDLER FOR sqlexception
    BEGIN
		ROLLBACK;
        RESIGNAL;
    END;
    
    START TRANSACTION;
		INSERT INTO discount_mt (discount_name, percentage, description)
		VALUES(aDiscountName, aDiscountPercentage, aDescription);
	COMMIT;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addFaculty` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addFaculty`(
	IN p_faculty_id int,
    IN p_firstName varchar(45),
    IN p_lastName varchar(45),
    IN p_middleName varchar(45),
    IN p_civilStatus varchar(45),
    IN p_email varchar (45),
    IN p_contact varchar(45),
    IN p_status bit(1)
    
)
BEGIN

	INSERT INTO faculty_mt (faculty_id,firstName,lastName,middleName,civilStatus,email,contact,`status`)
    VALUES(p_faculty_id,p_firstName,p_lastName,p_middleName,p_civilStatus,p_email,p_contact,p_status);

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addFacultyandSpecialization` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addFacultyandSpecialization`(
	IN p_faculty_specialization_id INT,
    IN p_faculty_id INT,
    IN p_specialization Varchar(45)
)
BEGIN
	INSERT INTO faculty_specialization(faculty_specialization_id,faculty_id,specialization)
    VALUES(p_faculty_specialization_id,p_faculty_id,p_specialization);

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addFee` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addFee`(
IN aFeeName VARCHAR(255), 
IN aFeeDescription VARCHAR(255),
IN aFeeCategoryId INT,
OUT aFeeId INT)
BEGIN

	DECLARE EXIT HANDLER FOR sqlexception
    BEGIN
		ROLLBACK;
        RESIGNAL;
    END;

	START TRANSACTION;
    
    INSERT INTO fee_mt(fee_name, fee_description, fee_category_id)
    VALUES(aFeeName, aFeeDescription, aFeeCategoryId);
    
    SELECT LAST_INSERT_ID() INTO aFeeId;
    
    COMMIT;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addGradeLevel` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addGradeLevel`(IN aGradeLevel VARCHAR(255))
BEGIN
	DECLARE EXIT HANDLER FOR sqlexception
    BEGIN
		ROLLBACK;
        RESIGNAL;
    END;
    
    START TRANSACTION;
		INSERT INTO gradelevel_mt(grade_level)
		VALUES(aGradeLevel);
	COMMIT;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addQuarter` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addQuarter`(
aQuarterNo INT, 
aDescription TEXT,
aStartDate DATE, 
aEndDate DATE, 
aSchoolYearId INT
)
BEGIN
	DECLARE aQuarterId INT;

	DECLARE EXIT HANDLER FOR sqlexception
    BEGIN
		ROLLBACK;
		RESIGNAL;
    END;
    
    START TRANSACTION;
    
    INSERT INTO quarter_mt(quarter_no, description)
    VALUES(aQuarterNo, aDescription);
    
    SELECT LAST_INSERT_ID() INTO aQuarterId;
    
    INSERT INTO schoolyear_quarter_lt
    (schoolyear_id, quarter_id, start_date, end_date)
    VALUES(aSchoolYearId, aQuarterId, aStartDate, aEndDate);
    
    COMMIT;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addRegistration` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addRegistration`(
aStudentType VARCHAR(255),
aStudentLastName VARCHAR(255),
aStudentFirstName VARCHAR(255),
aStudentMiddleName VARCHAR(255),
aDOB DATE,
aPOB VARCHAR(255),
aNationality VARCHAR(255),
aReligion VARCHAR(255),
aGender INT,
aFatherFirstName VARCHAR(255),
aFatherMiddleName VARCHAR(255),
aFatherLastName VARCHAR(255),
aFatherOccupation VARCHAR(255),
aFatherOfficePhoneNo VARCHAR(255),
aFatherMobileNo VARCHAR(255),
aIsFatherContactInCaseEmergency BIT(1),
aMotherFirstName VARCHAR(255),
aMotherMiddleName VARCHAR(255),
aMotherLastName VARCHAR(255),
aMotherOccupation VARCHAR(255),
aMotherOfficePhoneNo VARCHAR(255),
aMotherMobileNo VARCHAR(255),
aIsMotherContactInCaseEmergency BIT(1),
aGuardianLastName VARCHAR(255),
aGuardianFirstName VARCHAR(255),
aGuardianMiddleName VARCHAR(255),
aGuardianOccupation VARCHAR(255),
aGuardianOfficePhoneNo VARCHAR(255),
aGuardianMobileNo VARCHAR(255),
aGuardianRelationToStudent VARCHAR(255),
aIsGuardianContactInCaseEmergency BIT(1),
aSchoolLastAttended VARCHAR(255),
aSchoolLastAttendedAddress VARCHAR(255),
aRoomOrHouseNo VARCHAR(255),
aStreet VARCHAR(255),
aBrgyOrSubd VARCHAR(255),
aCity VARCHAR(255),
aProvince VARCHAR(255),
aGradeLevelId INT,
aSchoolYearId INT,
aPaymentTermId INT
)
BEGIN

DECLARE EXIT HANDLER FOR sqlexception
    BEGIN
		ROLLBACK;
        RESIGNAL;
    END;

START TRANSACTION;

INSERT INTO registration_mt(
student_type, 
lastname, firstname, middlename, dob, pob, nationality, 
religion, gender, father_firstname, father_middlename, father_lastname, 
father_occupation, father_officephone_no, father_mobile_no, isFatherContactInCaseEmergency, 
mother_firstname, mother_middlename, mother_lastname,mother_occupation, mother_officephone_no, mother_mobile_no, 
isMotherContactInCaseEmergency, guardian_lastname, guardian_firstname, guardian_middlename, 
guardian_occupation, guardian_officephone_no, guardian_mobile_no, guardian_relation_to_student, 
isGuardianContactInCaseEmergency, school_last_attended, school_last_attended_address, 
room_or_house_no, street, brgy_or_subd, city, province, gradelevel_id, schoolyear_id,
paymentterm_id
)

VALUES(aStudentType,aStudentLastName,aStudentFirstName,aStudentMiddleName,aDOB,aPOB,aNationality,
aReligion,aGender,aFatherFirstName,aFatherMiddleName,aFatherLastName,aFatherOccupation,aFatherOfficePhoneNo,aFatherMobileNo,aIsFatherContactInCaseEmergency,
aMotherFirstName,aMotherMiddleName,aMotherLastName,aMotherOccupation,
aMotherOfficePhoneNo,aMotherMobileNo,
aIsMotherContactInCaseEmergency,aGuardianLastName,aGuardianFirstName,aGuardianMiddleName,
aGuardianOccupation,aGuardianOfficePhoneNo,aGuardianMobileNo,aGuardianRelationToStudent,
aIsGuardianContactInCaseEmergency,aSchoolLastAttended,aSchoolLastAttendedAddress,
aRoomOrHouseNo,aStreet,aBrgyOrSubd,aCity,aProvince,aGradeLevelId,aSchoolYearId,
aPaymentTermId
);

INSERT INTO admission_mt(registration_id)
VALUES(LAST_INSERT_ID());

COMMIT;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addRoom` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addRoom`(aRoomNameOrNo VARCHAR(50), aBldgNameOrNo VARCHAR(50), aCapacity INT, aSchoolYearId INT, aAddedByUserId INT)
BEGIN
	DECLARE myRoomId INT;
    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    BEGIN
		ROLLBACK;
        RESIGNAL;
    END;

	START TRANSACTION;
	INSERT INTO room(room_name_or_num, bldg_name_or_num, capacity)
    VALUES(aRoomNameOrNo,aBldgNameOrNo,aCapacity);
    
    SELECT LAST_INSERT_ID() INTO myRoomId;
    
    INSERT INTO room_schoolyear(room_id, schoolyear_id)
    VALUES(myRoomId,aSchoolYearId);
    
    INSERT INTO room_hd(room_id, addedBy_UserId, editedBy_UserId,dateLastEdited)
    VALUES(myRoomId,aAddedByUserId,aAddedByUserId,CURRENT_TIMESTAMP);
    
    COMMIT;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addSchedule` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addSchedule`(aStartTime INT, aEndTime INT, aDayOfWeekId INT, aRoomId INT, aSubjectId INT, aAddedByUserId INT,aGradeLevelId INT, aSectionId INT, aSchoolYearId INT )
BEGIN

	DECLARE myClassScheduleId INT DEFAULT 0;
	DECLARE EXIT HANDLER FOR SQLEXCEPTION 
    BEGIN
		ROLLBACK;
        RESIGNAL;
    END;
    
    START TRANSACTION;
    
    
    
    INSERT INTO classschedule(startTime, endTime, dayOfWeek_id, room_id, subject_id)
    VALUES(aStartTime, aEndTime, aDayOfWeekId, aRoomId, aSubjectId);
    
    SELECT LAST_INSERT_ID() INTO myClassScheduleId;
    
    
    INSERT INTO classschedule_hd(classschedule_id, addedBy_UserId, lastEditedBy_UserId, dateLastEdited)
    VALUES(myClassScheduleId,aAddedByUserId,aAddedByUserId, CURRENT_TIMESTAMP);
    
    
    IF NOT EXISTS (SELECT * FROM classschedule_section WHERE classschedule_id = myClassScheduleId )
    THEN
		INSERT INTO classschedule_section(classschedule_id, gradelevel_id, section_id, schoolyear_id)
		VALUES(myClassScheduleId, aGradeLevelId, aSectionId, aSchoolYearId);
    END IF;
    
    
    COMMIT;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addSchoolYear` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addSchoolYear`(
IN aYearFrom INT, 
IN aYearTo INT, 
IN aStartDate DATE, 
IN aEndDate DATE,
IN aEnrollmentDateOpen DATE,
IN aEnrollmentDateClosed DATE,
OUT outSchoolYearId INT )
BEGIN
	DECLARE aNewSchoolYearId INT;

	DECLARE EXIT HANDLER FOR sqlexception
    BEGIN
		ROLLBACK;
        RESIGNAL;
    END;

	START TRANSACTION;
    
    INSERT INTO schoolyear_mt(yearFrom, yearTo, start_date, end_date)
    VALUES(aYearFrom, aYearTo, aStartDate, aEndDate);
    
    SELECT LAST_INSERT_ID() INTO aNewSchoolYearId;
    SELECT LAST_INSERT_ID() INTO outSchoolYearId;
    
    INSERT INTO enrollment_mt(schoolyear_id, opening_date, closing_date)
    VALUES(aNewSchoolYearId, aEnrollmentDateOpen, aEnrollmentDateClosed);
    
    COMMIT;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addSection` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addSection`(aSectionName VARCHAR(255), OUT aSectionId INT)
BEGIN

DECLARE EXIT HANDLER FOR sqlexception
BEGIN
		ROLLBACK;
        RESIGNAL;
END;



START TRANSACTION;

INSERT INTO section_mt(sectionName)
VALUES(aSectionName);

SELECT LAST_INSERT_ID() INTO aSectionId;

COMMIT;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addSectionDetails` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addSectionDetails`(aSectionId INT, aSessionId INT, aSchoolYearId INT, aGradeLevelId INT, aCapacity INT)
BEGIN

INSERT INTO schoolyear_section_lt
(section_id, session_id, schoolyear_id, gradelevel_id, capacity)
VALUES(aSectionId,aSessionId,aSchoolYearId,aGradeLevelId,aCapacity);

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addSemester` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addSemester`(
aSemesterNo INT, 
aDescription TEXT,
aStartDate DATE, 
aEndDate DATE, 
aSchoolYearId INT
)
BEGIN
	DECLARE aSemesterId INT;

	DECLARE EXIT HANDLER FOR sqlexception
    BEGIN
		ROLLBACK;
		RESIGNAL;
    END;
    
    START TRANSACTION;
    
    INSERT INTO semester_mt(semester_no, description)
    VALUES(aSemesterNo, aDescription);
    
    SELECT LAST_INSERT_ID() INTO aSemesterId;
    
    INSERT INTO schoolyear_semester_lt
    (schoolyear_id, semester_id, start_date, end_date)
    VALUES(aSchoolYearId, aSemesterId, aStartDate, aEndDate);
    
    COMMIT;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addSession` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addSession`(aSession VARCHAR(2))
BEGIN
 INSERT INTO `session`(title)
 VALUES(aSession);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addSpecialization` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addSpecialization`(
	IN	p_id int,
    IN	p_title varchar(45),
    IN	p_desciption text,
    IN p_date DATETIME
    
   
)
BEGIN
	INSERT into specialization(specialization_id,specialization_title,description,date_created)
    VALUES(p_id,p_title,p_desciption,p_date);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addStudentDiscount` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addStudentDiscount`(IN aStudentId INT, IN aDiscountId INT, IN aSchoolYearId INT, IN anAmount DECIMAL(10,2) )
BEGIN

INSERT INTO student_discount_lt(student_id, discount_id, schoolyear_id, amount)
VALUES(aStudentId,aDiscountId,aSchoolYearId, anAmount);

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addStudentPaymentTerm` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addStudentPaymentTerm`(IN aStudentId INT, IN aPaymentTermId INT,IN aSchoolYearId INT)
BEGIN

INSERT INTO student_paymentterm_lt(student_id, paymentterm_id, schoolyear_id)
VALUES(aStudentId,aPaymentTermId,aSchoolYearId);


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addSubject` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addSubject`(
IN p_subjName varchar(50), 
IN p_subjCode varchar(50), 
IN p_subjUnits INT, 
IN p_subjDesc TEXT, 
IN p_gradeLevelId INT,
IN p_schoolYearId INT,
IN p_addedBy_UserId varchar(50)

)
BEGIN
	
    DECLARE var_subjectId INT;
    DECLARE EXIT HANDLER FOR sqlexception
	BEGIN
		ROLLBACK;
        RESIGNAL;
    END;
    
    START TRANSACTION;
    
    INSERT INTO subjects(`code`, `name`, units, description)
    VALUES(p_subjCode,p_subjName,p_subjUnits,p_subjDesc);
    
    SELECT LAST_INSERT_ID() INTO @var_subjectId;
    
    INSERT INTO subjects_gradelevel(subjectId, gradeLevelId, schoolYearId)
    VALUES(@var_subjectId,p_gradeLevelId,p_schoolYearId);
    
    INSERT INTO subjects_hd(subjectId, addedBy_UserId, editedBy_UserId)
    VALUES(@var_subjectId,p_addedBy_UserId,p_addedBy_UserId);
    
		COMMIT ;
        SELECT 'successfully added subject';
    
    
    
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addTransaction` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addTransaction`(aStudentId INT, OUT aTransactionId INT)
BEGIN
	DECLARE EXIT HANDLER FOR sqlexception
    BEGIN
		RESIGNAL;
        ROLLBACK;
    END;
    
START TRANSACTION;
	INSERT INTO transaction_mt(student_id)
	VALUES(aStudentId);
    
    SELECT LAST_INSERT_ID() INTO aTransactionId;
    
    COMMIT;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addTransactionPayment` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addTransactionPayment`(aTransactionId INT, aPaymentId INT)
BEGIN

INSERT INTO transaction_payment_lt(transaction_id, payment_id)
VALUES(aTransactionId, aPaymentId);

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `addTuitionFee` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `addTuitionFee`(IN aBalanceBreakDownFeeId INT, IN aStudentId INT, aSchoolYearId INT)
BEGIN

INSERT INTO tuition_fee (balance_breakdown_fee_id, student_id, schoolyear_id)
VALUES(aBalanceBreakDownFeeId,aStudentId,aSchoolYearId);

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `assignCredential` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `assignCredential`(aCredentialId INT, aGradeLevelId INT, aSchoolYearId INT)
BEGIN

INSERT INTO credential_requirements_lt
(credential_id, gradelevel_id, schoolyear_id)
VALUES
(aCredentialId,aGradeLevelId,aSchoolYearId);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `assignFee` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `assignFee`(
IN aFeeId INT, 
IN aFeeAmount DECIMAL,
IN aGradeLevelId INT,
IN aSchoolYearId INT)
BEGIN


	DECLARE EXIT HANDLER FOR sqlexception
    BEGIN
		ROLLBACK;
        RESIGNAL;
    END;

	START TRANSACTION;
    
    INSERT INTO fee_schoolyear_lt(fee_id, fee_amount, gradelevel_id, schoolyear_id)
    VALUES(aFeeId,aFeeAmount,aGradeLevelId,aSchoolYearId);
    
    COMMIT;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `completeAdmission` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `completeAdmission`( IN aRegistrationId INT )
BEGIN

DECLARE EXIT HANDLER FOR sqlexception
    BEGIN
		ROLLBACK;
        RESIGNAL;
    END;

START TRANSACTION;

UPDATE admission_mt 
SET isComplete = 1 
WHERE registration_id = aRegistrationId;

INSERT INTO student_mt(registration_id)
VALUES(aRegistrationId);

COMMIT;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `createCurriculumSubjects` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `createCurriculumSubjects`(OUT pOUT_gradeLevelId INT, IN pIN_gradeLevel VARCHAR(250), OUT pOUT_schoolYearId INT, IN pIN_schoolYear INT, IN pIN_description VARCHAR(250), IN pIN_isActive INT, IN pIN_dateCreated VARCHAR(250), OUT pOUT_curriculumId INT)
BEGIN
	
    START TRANSACTION;
    
	SELECT gradelevel_id INTO pOUT_gradeLevelId FROM gradelevel_mt WHERE grade_level = pIN_gradeLevel;
    
    SELECT schoolyear_id INTO pOUT_schoolYearId FROM schoolyear_mt WHERE yearFrom = pIN_schoolYear;

	INSERT INTO curriculum_mt(gradelevel_id,schoolyear_id,description,isActive,date_created)
    VALUES(pOUT_gradeLevelId,pOUT_schoolYearId,pIN_description,pIN_isActive,pIN_dateCreated);
    
    SET pOUT_curriculumId = LAST_INSERT_ID();
    
    COMMIT;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `createSubject` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `createSubject`(IN p_subjCode VARCHAR(250), IN p_subjTitle VARCHAR(250), IN p_subjDescription VARCHAR(250), IN p_subjIsActive BOOLEAN, OUT p_subjId INT, OUT p_gradeLevelId INT, IN p_gradeLevel INT)
BEGIN

	START TRANSACTION;
    
    INSERT INTO subject_mt(code,title,description,isActive)
    VALUES(p_subjCode,p_subjTitle, p_subjDescription, p_subjIsActive);
    
    SET p_subjId = LAST_INSERT_ID();
    
    #SELECT gradelevel_id FROM gradelevel_mt WHERE grade_level = p_gradeLevelId;
    
    SELECT gradelevel_id INTO p_gradeLevelId FROM gradelevel_mt WHERE grade_level = p_gradeLevel;
    
	INSERT INTO subject_gradelevel_lt (subject_id, gradelevel_id)
    VALUES (p_subjId,p_gradeLevelId);


    
    COMMIT;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `createTuitionFee` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `createTuitionFee`(aFeeTitle VARCHAR(100),aFeeAmount DECIMAL, aFeeDescription TEXT, aFeeTypeId INT,aGradeLevelId INT, aSchoolYearId INT, aAddedByUserId INT, aLastEditedByUserId INT)
BEGIN
	
    DECLARE myFeeId INT;
    DECLARE myTuitionId INT;
    DECLARE EXIT HANDLER FOR sqlexception
    BEGIN
		ROLLBACK;
        SELECT 'error occured' AS msg;
        RESIGNAL;
    END;

	START TRANSACTION;
	
    IF NOT EXISTS(SELECT id FROM tuition WHERE gradelevel_id = aGradeLevelId AND schoolyear_id = aSchoolYearId)
    THEN
		INSERT INTO tuition(gradelevel_id,schoolyear_id)VALUES(aGradeLevelId,aSchoolYearId);
        
        SELECT LAST_INSERT_ID() INTO myTuitionId;
        INSERT INTO fees(title, amount, description, feetype_id)
    VALUES(aFeeTitle,aFeeAmount,aFeeDescription,aFeeTypeId);
    
    
	SELECT LAST_INSERT_ID() INTO myFeeId;
    
    INSERT INTO fees_hd(fees_id, addedByUserId, lastEditedByUserId, dateLastEdited)
    VALUES(myFeeId,aAddedByUserId,aLastEditedByUserId,CURRENT_TIMESTAMP);
    
    INSERT INTO tuition_fee(fees_id, tuition_id)
    VALUES(myFeeId,myTuitionId);
    
    
    ELSE
		
		SELECT t.id INTO myTuitionId FROM tuition t WHERE t.gradelevel_id = aGradeLevelId AND t.schoolyear_id = aSchoolYearId;
    
    
    INSERT INTO fees(title, amount, description, feetype_id)
    VALUES(aFeeTitle,aFeeAmount,aFeeDescription,aFeeTypeId);
    SELECT LAST_INSERT_ID() INTO myFeeId;
    INSERT INTO fees_hd(fees_id, addedByUserId, lastEditedByUserId, dateLastEdited)
    VALUES(myFeeId,aAddedByUserId,aLastEditedByUserId,CURRENT_TIMESTAMP);
    
    
    INSERT INTO tuition_fee(fees_id, tuition_id)
    VALUES(myFeeId,myTuitionId);
    
    END IF;
    
    COMMIT;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `credentialAlreadyExists` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `credentialAlreadyExists`(aCredentialName VARCHAR(255))
BEGIN

SELECT * FROM credentials_mt WHERE credential_name = aCredentialName;


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `curriculumExists` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `curriculumExists`(IN aGradeLevelId INT, IN aSchoolYearId INT)
BEGIN
	select * from curriculum_mt where gradelevel_id = aGradeLevelId AND schoolyear_id = aSchoolYearId;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `deactivateGradeLevel` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `deactivateGradeLevel`(IN aGradeLevelId INT)
BEGIN
	DECLARE EXIT HANDLER FOR sqlexception
    BEGIN
		ROLLBACK;
        RESIGNAL;
    END;
    
    
    START TRANSACTION;

	UPDATE gradelevel_mt SET isActive = 0
    WHERE gradelevel_id = aGradeLevelId;
    
    COMMIT;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `deleteAllCurriculumSubjects` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `deleteAllCurriculumSubjects`(IN p_curriculumId INT, IN p_subjectId INT)
BEGIN

	DELETE FROM curriculum_subjects WHERE curriculumId = p_curriculumId;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `deleteAllCurriculumSubjectsOf` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `deleteAllCurriculumSubjectsOf`(p_curriculumId INT)
BEGIN
	DELETE FROM curriculum_subjects WHERE curriculumId = p_curriculumId;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `deleteDiscount` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `deleteDiscount`(aDiscountId INT)
BEGIN
	DELETE FROM discount WHERE discount_id = aDiscountId;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `deleteFee` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `deleteFee`(aFeeId INT)
BEGIN

DECLARE EXIT handler for sqlexception
BEGIN
	rollback;
    resignal;
END;

start transaction;

DELETE FROM fee_schoolyear_lt 
WHERE
    fee_id = aFeeId;
DELETE FROM fee_mt 
WHERE
    fee_id = aFeeId;
    
commit;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `enrollStudent` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `enrollStudent`(
aSchoolYearId INT, 
aStudentId INT, 
aGradeLevelId INT
)
BEGIN

	DECLARE aEnrollmentId INT;

	DECLARE EXIT HANDLER FOR SQLEXCEPTION
    BEGIN
		ROLLBACK;
        RESIGNAL;
    END;
    
    START TRANSACTION;
    
    SELECT enrollment_id INTO aEnrollmentId FROM enrollment_mt
    WHERE schoolyear_id = aSchoolYearId;
    
    UPDATE student_mt SET isActive = 1 WHERE student_id = aStudentId;
	INSERT INTO schoolyear_student_lt (schoolyear_id,student_id,gradelevel_id)
    VALUES(aSchoolYearId, aStudentId, aGradeLevelId);
    
    
    INSERT INTO enrollment_student_lt
    (enrollment_id, student_id, date_of_enrollment)
    VALUES(aEnrollmentId,aStudentId,CURDATE());
    
    IF CURDATE() < 
		(SELECT DATE(opening_date) 
			FROM enrollment_mt 
				WHERE schoolyear_id = aSchoolYearId)
		THEN 
		UPDATE enrollment_student_lt 
			SET isEarlyEnrollment = 1
				WHERE student_id = aStudentId;
    
	ELSEIF CURDATE() >
		(SELECT DATE(closing_date) 
			FROM enrollment_mt 
				WHERE schoolyear_id = aSchoolYearId)
		THEN
        UPDATE enrollment_student_lt 
			SET isLateEnrollment = 1
				WHERE student_id = aStudentId;
    END IF;
    
    COMMIT;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `feeExists` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `feeExists`(aFeeName VARCHAR(255))
BEGIN
	SELECT * FROM fee_mt f WHERE f.fee_name = aFeeName;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAdmissionGradeLevelByRegistrationId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAdmissionGradeLevelByRegistrationId`(
aRegistrationId INT)
BEGIN

SELECT gl.grade_level AS admissionGradeLevel
FROM registration_mt r
INNER JOIN admission_mt a ON r.registration_id = a.registration_id
INNER JOIN gradelevel_mt gl ON r.gradelevel_id = gl.gradelevel_id
WHERE r.registration_id = aRegistrationId;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAdmissionInfoByRegistrationId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAdmissionInfoByRegistrationId`(IN aRegistrationId INT)
BEGIN

SELECT * FROM admission_mt WHERE registration_id = aRegistrationId;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAdmissionStatus` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAdmissionStatus`(aRegistrationId INT)
BEGIN
	SELECT r.isAdmissionComplete FROM registration r WHERE r.registration_id = aRegistrationId;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllActiveDiscounts` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllActiveDiscounts`()
BEGIN
	
SELECT * from discount_mt WHERE isActive = 1;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllActiveGradeLevels` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllActiveGradeLevels`()
BEGIN
	SELECT * FROM gradelevel_mt WHERE isActive = 1;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllActivePaymentTerms` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllActivePaymentTerms`()
BEGIN
	SELECT * FROM paymentterm_mt WHERE isActive = 1;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllActiveStudentsOfCurrentSchoolYear` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllActiveStudentsOfCurrentSchoolYear`()
BEGIN

SELECT sy.*,r.*,s.*,a.*,
s.student_type AS aStudentType,
s.isActive AS aStudentStatus 
FROM registration_mt r
INNER JOIN admission_mt a ON r.registration_id = a.registration_Id
INNER JOIN student_mt s ON r.registration_id = s.registration_id
LEFT JOIN schoolyear_student_lt sslt ON s.student_id = sslt.student_id
LEFT JOIN schoolyear_mt sy ON sslt.schoolyear_id =  sy.schoolyear_id
WHERE sy.isCurrentSchoolYear = 1 AND 
s.isActive = 1
ORDER BY r.lastname;


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllCredentials` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllCredentials`()
BEGIN

SELECT c.*,cr.*,gl.grade_level,sy.yearFrom, sy.yearTo FROM credentials_mt c
INNER JOIN credential_requirements_lt cr ON c.credential_id
INNER JOIN gradelevel_mt gl ON cr.gradelevel_id = gl.gradelevel_id
INNER JOIN schoolyear_mt sy ON cr.schoolyear_id = sy.schoolyear_id
GROUP BY c.credential_name;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllCurriculum` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllCurriculum`()
BEGIN
	SELECT schoolyear_mt.yearFrom, schoolyear_mt.yearTo, gradelevel_mt.grade_level, curriculum_mt.description, curriculum_mt.date_created FROM curriculum_mt
	INNER JOIN schoolyear_mt ON schoolyear_mt.schoolyear_id = curriculum_mt.schoolyear_id
	INNER JOIN gradelevel_mt ON gradelevel_mt.gradelevel_id = curriculum_mt.gradelevel_id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllCurriculumInfo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllCurriculumInfo`()
BEGIN
	SELECT 
    c.*,
    es.educationstage,
    chd.dateAdded,
    CONCAT(uA.lastname,', ',uA.firstname,' ',uA.middlename) AS addedBy,
    chd.dateLastEdited,
    CONCAT(uB.lastname,', ',uB.firstname,' ',uB.middlename) AS lastEditedBy,
    gl.`level`,
    sy.yearFrom,
    sy.yearTo
    
    FROM 		curriculum 				c
    
    INNER JOIN 	gradelevel 				gl 	ON c.gradelevel_id = gl.gradelevel_id
    
    INNER JOIN 	curriculum_schoolyears 	csy ON c.curriculum_id = csy.curriculum_id
    
    INNER JOIN 	schoolyear	 			sy 	ON csy.schoolyear_id = sy.schoolyear_id
    
    INNER JOIN 	curriculum_hd 			chd ON c.curriculum_id = chd.curriculum_id
    
    INNER JOIN 	user					uA	ON chd.addedBy_UserId = uA.user_id
    
    INNER JOIN 	user					uB	ON chd.editedBy_UserId = uB.user_id
    
    INNER JOIN 	educationalstage		es	ON c.educationalstage_id = es.educationalstage_id
    
    ORDER BY `yearFrom`;
    
     
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllDiscounts` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllDiscounts`()
BEGIN
	SELECT * FROM discount;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllEnrollmentSchedulesOfAllSchoolYears` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllEnrollmentSchedulesOfAllSchoolYears`()
BEGIN

SELECT 
    e.enrollment_id,
    e.schoolyear_id,sy.yearFrom, sy.yearTo,
    e.opening_date, e.closing_date, 
    IF(e.closing_date < CURDATE(),1,0) AS isClosed,
    e.date_created
    FROM enrollment_mt e
    INNER JOIN schoolyear_mt sy ON e.schoolyear_id = sy.schoolyear_id;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllFeeCategory` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllFeeCategory`()
BEGIN
	SELECT * FROM fee_category_mt;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllFeeNames` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllFeeNames`()
BEGIN
	SELECT fee_name FROM fee_mt;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllFeesInfo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllFeesInfo`()
BEGIN

SELECT 
f1.*, f2.*,
gl.*,
f3.*

FROM fee_mt f1 
INNER JOIN fee_schoolyear_lt f2 ON f1.fee_id = f2.fee_id
INNER JOIN fee_category_mt f3 ON f1.fee_category_id = f3.fee_category_id
INNER JOIN gradelevel_mt gl ON f2.gradelevel_id = gl.gradelevel_id;


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllGradeLevelsInfo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllGradeLevelsInfo`()
BEGIN
	SELECT * FROM gradelevel_mt ;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllGradeLevelsStudentPassed` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllGradeLevelsStudentPassed`(aStudentId INT)
BEGIN

SELECT grade_level FROM schoolyear_student_lt sslt
INNER JOIN gradelevel_mt gl ON sslt.gradelevel_id = gl.gradelevel_id
WHERE 
student_id = aStudentId AND passed = 1;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllInactiveGradeLevels` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllInactiveGradeLevels`()
BEGIN
SELECT * FROM gradelevel_mt WHERE isActive = 0;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllInActivePaymentTerms` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllInActivePaymentTerms`()
BEGIN
	SELECT * FROM paymentterm_mt WHERE isActive = 0;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllInactiveStudents` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllInactiveStudents`()
BEGIN

SELECT 
r.*,s.*,a.*,
s.student_type AS aStudentType, 
s.isActive AS aStudentStatus 
FROM registration_mt r
INNER JOIN admission_mt a ON r.registration_id = a.registration_Id
INNER JOIN student_mt s ON r.registration_id = s.registration_id
LEFT JOIN schoolyear_student_lt sslt ON s.student_id = sslt.student_id
WHERE s.isActive = 0
GROUP BY r.registration_id ORDER BY r.lastname;


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllInactiveStudentsBySchoolYear` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllInactiveStudentsBySchoolYear`(IN aSchoolYearId INT)
BEGIN

SELECT 
s.*, r.*,a.*,
sy.schoolyear_id,
sy.yearFrom , sy.yearTo,

gl.grade_level,
gla.grade_level AS 		last_gradelevel_enrolled,
sslt.passed AS 			has_passed_last_gradelevel,
sslt.schoolyear_id AS 	last_gradelevel_enrolled_schoolyear_id,
sya.yearFrom AS 		last_gradelevel_enrolled_schoolyear_yearFrom,
sya.yearTo AS 			last_gradelevel_enrolled_schoolyear_yearTo,

CASE 
WHEN r.student_type = 'New' THEN gl.grade_level
WHEN r.student_type = 'Transferee' THEN gl.grade_level
WHEN r.student_type = 'Old' AND sslt.passed = 0 THEN gla.grade_level
WHEN r.student_type = 'Old' AND sslt.passed = 1 THEN gla.grade_level+1
END AS recommended_gradelevel_to_enroll

FROM registration_mt r 
INNER JOIN schoolyear_mt sy ON r.schoolyear_id = sy.schoolyear_id
INNER JOIN gradelevel_mt gl ON r.gradelevel_id = gl.gradelevel_id

INNER JOIN admission_mt a ON r.registration_id = a.registration_id
INNER JOIN student_mt s ON  a.registration_id = s.registration_id

LEFT OUTER JOIN schoolyear_student_lt sslt ON s.student_id = sslt.student_id
LEFT OUTER JOIN schoolyear_mt sya ON sslt.schoolyear_id = sya.schoolyear_id
LEFT OUTER JOIN gradelevel_mt gla ON sslt.gradelevel_id = gla.gradelevel_id

INNER JOIN 
(SELECT gl.grade_level 
	FROM registration_mt r 
	INNER JOIN gradelevel_mt gl 
	ON r.gradelevel_id = gl.gradelevel_id
	ORDER BY r.gradelevel_id ASC LIMIT 1) 
		AS registration_gradelevel_selected

WHERE s.isActive = 0 AND
sy.schoolyear_id = aSchoolYearId
GROUP BY recommended_gradelevel_to_enroll
ORDER BY sya.yearFrom DESC, sya.yearTo DESC, gla.grade_level DESC
;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllPaymentTermDownPayment` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllPaymentTermDownPayment`()
BEGIN
	SELECT pt.paymentterm,ptd.downpayment,
    CONCAT(sy.yearFrom,'-',sy.yearTo) AS schoolyear
    FROM paymentterm pt
    INNER JOIN paymentterm_downpayment ptd ON pt.id = ptd.paymentterm_id
    INNER JOIN paymentterm_downpayment_schoolyear ptdsy ON ptd.id = ptdsy.paymentterm_downpayment_id
    INNER JOIN schoolyear sy ON ptdsy.schoolyear_id = sy.id;
    
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllPaymentTermsInfo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllPaymentTermsInfo`()
BEGIN
	SELECT * FROM paymentterm_mt;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllQuarters` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllQuarters`()
BEGIN
	SELECT 
    s.quarter_id,
    s.quarter_no,
    s.isActive,
    s.description,
    s.date_added,
    sslt.isCurrentQuarter,
    sslt.start_date,
    sslt.end_date,
    sslt.schoolyear_id,
    sy.yearFrom,
    sy.yearTo
FROM
    quarter_mt s
        INNER JOIN
    schoolyear_quarter_lt sslt ON s.quarter_id = sslt.quarter_id
        INNER JOIN
    schoolyear_mt sy ON sslt.schoolyear_id = sy.schoolyear_id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllRegisteredSubjectGradeLevel` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllRegisteredSubjectGradeLevel`()
BEGIN 
	SELECT gradelevel_mt.grade_level FROM gradelevel_mt
    INNER JOIN subject_gradelevel_lt
    ON gradelevel_mt.gradelevel_id = subject_gradelevel_lt.gradelevel_id 
    GROUP BY grade_level ASC;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllRegistrationInfo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllRegistrationInfo`()
BEGIN
	SELECT r.*,g.*,s.*,a.* FROM registration_mt r
    INNER JOIN gradelevel_mt g ON r.gradelevel_id = g.gradelevel_id
    INNER JOIN schoolyear_mt s ON r.schoolyear_id = s.schoolyear_id
    INNER JOIN admission_mt a ON r.registration_id = a.registration_id
    ORDER BY r.lastname;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllRegistrationInfoBySchoolYearId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllRegistrationInfoBySchoolYearId`(aSchoolYearId INT)
BEGIN

SELECT r.*,g.*,s.*,a.* FROM registration_mt r
    INNER JOIN gradelevel_mt g ON r.gradelevel_id = g.gradelevel_id
    INNER JOIN schoolyear_mt s ON r.schoolyear_id = s.schoolyear_id
    INNER JOIN admission_mt a ON r.registration_id = a.registration_id
	WHERE r.schoolyear_id = aSchoolYearId;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllRegistrationInfoByWildCard` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllRegistrationInfoByWildCard`(aKeyword VARCHAR(255))
BEGIN
	SELECT r.*,g.*,s.*,a.* 
    FROM registration_mt r
    INNER JOIN gradelevel_mt g ON r.gradelevel_id = g.gradelevel_id
    INNER JOIN schoolyear_mt s ON r.schoolyear_id = s.schoolyear_id
    INNER JOIN admission_mt a ON r.registration_id = a.registration_id
    WHERE 
    
    r.registration_id LIKE CONCAT('%',aKeyword,'%') OR
    r.lastname LIKE CONCAT('%',aKeyword,'%') OR 
    r.firstname LIKE CONCAT('%',aKeyword,'%')
    
    ORDER BY r.lastname;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllRoomInformation` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllRoomInformation`()
BEGIN
	SELECT 
    r.room_name_or_num,
    r.bldg_name_or_num,
    r.capacity,
    CONCAT(u.lastname,', ',u.firstname,' ',u.middlename) AS addedBy,
    rhd.dateAdded,
    CONCAT(usr.lastname,', ',usr.firstname,' ',usr.middlename) AS lastEditedBy,
    rhd.dateLastEdited
    FROM room r
    INNER JOIN room_schoolyear 	rs 	ON r.room_id = rs.room_id
    INNER JOIN room_hd 			rhd ON r.room_id = rhd.room_id
    INNER JOIN schoolyear 		sy 	ON rs.schoolyear_id = sy.schoolyear_id
    INNER JOIN user 			u 	ON rhd.addedBy_UserId = u.user_id
    INNER JOIN user 			usr ON rhd.editedBy_UserId = u.user_id
    
    ORDER BY rhd.dateAdded ASC;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllSchedule` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllSchedule`()
BEGIN
	SELECT 
    cs.startTime, cs.endTime, d.days,
    r.*,s.`name` AS subjectName,
    CONCAT(sy.yearFrom,'-',sy.yearTo) AS schoolYear,
    sec.sectionName,
    gl.`level` AS gradeLevel
    
    FROM classschedule cs
    INNER JOIN classschedule_hd cshd ON cs.id = cshd.classschedule_id
    INNER JOIN classschedule_section css ON cs.id = css.classschedule_id
    INNER JOIN daysofweek d ON cs.dayOfWeek_id = d.id
    INNER JOIN room r ON cs.room_id = r.id
    INNER JOIN `subjects` s ON cs.subject_id = s.id
    INNER JOIN gradelevel gl ON css.gradelevel_id = gl.id
    INNER JOIN section sec ON css.section_id = sec.id
    INNER JOIN schoolyear sy ON css.schoolyear_id = sy.id;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllSchoolYearInfo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllSchoolYearInfo`()
BEGIN
 SELECT * FROM schoolyear_mt ORDER BY yearFrom;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllSections` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllSections`()
BEGIN
	
SELECT 
s.section_id,
s.sectionName,
s.isActive,
sslt.session_id,
ss.title,
sslt.capacity,
sslt.schoolyear_id,
sy.yearFrom,
sy.yearTo,
sslt.gradelevel_id,
gl.grade_level 
FROM section_mt s
INNER JOIN schoolyear_section_lt sslt ON s.section_id = sslt.section_id
INNER JOIN session_mt ss ON sslt.session_id = ss.session_id
INNER JOIN schoolyear_mt sy ON sslt.schoolyear_id = sy.schoolyear_id
INNER JOIN gradelevel_mt gl ON sslt.gradelevel_id = gl.gradelevel_id;
    
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllSectionsInfo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllSectionsInfo`()
BEGIN
	SELECT 
    s.sectionName,s.isActive,
    g.`level`,
    CONCAT(sy.yearFrom,'-',sy.yearTo) AS schoolYear,
    se.title AS `session`,
    CONCAT(u.lastname,', ',u.firstname,' ',u.middlename) AS addedBy,
    shd.dateAdded,
    CONCAT(f.lastName,', ',f.firstName,' ',(SELECT LEFT(f.middleName,1)) ) AS adviser
    
    FROM section s
    INNER JOIN section_gradelevel 	sg 	ON s.section_id 		= sg.section_id
    INNER JOIN section_hd 			shd ON s.section_id 		= shd.section_id
    INNER JOIN gradelevel 			g 	ON sg.gradelevel_id 	= g.gradelevel_id
    INNER JOIN schoolyear 			sy 	ON sg.schoolyear_id 	= sy.schoolyear_id
    INNER JOIN `session` 			se 	ON sg.session_id 		= se.session_id
    INNER JOIN user 				u 	ON shd.addedBy_UserId 	= u.user_id
    INNER JOIN user 				usr ON shd.editedBy_UserId 	= u.user_id
    INNER JOIN section_adviser 		sa 	ON s.section_id 		= sa.section_id
    INNER JOIN faculty 				f 	ON sa.faculty_id 		= f.faculty_id;
    
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllStudents` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllStudents`()
BEGIN

SELECT r.*,s.*,a.*,s.student_type AS aStudentType FROM registration_mt r
INNER JOIN admission_mt a ON r.registration_id = a.registration_Id
INNER JOIN student_mt s ON r.registration_id = s.registration_id
LEFT JOIN schoolyear_student_lt sslt ON s.student_id = sslt.student_id
GROUP BY r.registration_id ORDER BY r.lastname;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllStudentsByWildCard` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllStudentsByWildCard`(aKeyword VARCHAR(255))
BEGIN

SELECT r.*,s.*,a.*,s.student_type AS aStudentType FROM registration_mt r
INNER JOIN admission_mt a ON r.registration_id = a.registration_Id
INNER JOIN student_mt s ON r.registration_id = s.registration_id
LEFT JOIN schoolyear_student_lt sslt ON s.student_id = sslt.student_id
WHERE 
s.student_id LIKE CONCAT('%',aKeyword,'%') OR
r.lastname LIKE CONCAT('%',aKeyword,'%') OR
r.firstname LIKE CONCAT('%',aKeyword,'%');

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllSubjectForCurriculum` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllSubjectForCurriculum`()
BEGIN
	SELECT subject_mt.code, subject_mt.title, subject_mt.description, gradelevel_mt.grade_level
	FROM subject_gradelevel_lt
	INNER JOIN subject_mt
	ON subject_mt.subject_id = subject_gradelevel_lt.subject_id
	INNER JOIN gradelevel_mt
	ON gradelevel_mt.gradelevel_id = subject_gradelevel_lt.gradelevel_id
    ORDER BY gradelevel_mt.grade_level ASC;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllSubjectInfo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllSubjectInfo`()
BEGIN
	SELECT 
    s.*, 
    gl.`level`, 
    sy.yearFrom,
    sy.yearTo,
    CONCAT(uA.lastname,', ',uA.firstname) AS AddedBy, 
    shd.dateAdded,
    CONCAT(uB.lastname,', ',uB.firstname) AS EditedBy, 
    shd.dateEdited
    
    
    
				
    FROM 		`subject` 				s 								
    INNER JOIN 	subject_hd 			    shd ON s.subject_id = shd.subject_id 
    INNER JOIN 	subject_gradelevel 		sgl ON s.subject_id = sgl.subject_id 
    
    
    INNER JOIN  gradelevel				gl 	ON sgl.gradelevel_id = gl.gradelevel_id
    INNER JOIN 	schoolyear				sy	ON sgl.schoolyear_id = sy.schoolyear_id
    INNER JOIN	user					uA	ON shd.addedBy_UserId = uA.user_id 
    INNER JOIN 	user					uB	ON shd.editedBy_UserId = uB.user_id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllSubjects` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllSubjects`()
BEGIN
	SELECT title FROM subject_gradelevel_lt
	INNER JOIN subject_mt
	ON subject_mt.subject_id = subject_gradelevel_lt.subject_id
	INNER JOIN gradelevel_mt
	ON gradelevel_mt.gradelevel_id = subject_gradelevel_lt.gradelevel_id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllSubjectsByGradeLevel` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllSubjectsByGradeLevel`(IN p_gradeLevel INT)
BEGIN
	SELECT title FROM subject_gradelevel_lt
	INNER JOIN subject_mt
	ON subject_mt.subject_id = subject_gradelevel_lt.subject_id
	INNER JOIN gradelevel_mt
	ON gradelevel_mt.gradelevel_id = subject_gradelevel_lt.gradelevel_id
	WHERE gradelevel_mt.grade_level = p_gradeLevel;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getAllUsersInfo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getAllUsersInfo`()
BEGIN
	SELECT * FROM users;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getBasicFeeByGradeLevelId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getBasicFeeByGradeLevelId`(aGradeLevelId INT)
BEGIN

SELECT f.fee_id, f.fee_name, f.fee_description, fs.fee_amount, 
fc.fee_category, fc.fee_category_id,
gl.*,
sy.*,
fs.*
FROM fee_mt f
INNER JOIN fee_schoolyear_lt fs ON f.fee_id = fs.fee_id
INNER JOIN gradelevel_mt gl ON fs.gradelevel_id = gl.gradelevel_id
INNER JOIN schoolyear_mt sy ON fs.schoolyear_id = sy.schoolyear_id
INNER JOIN fee_category_mt fc ON f.fee_category_id = fc.fee_category_id

WHERE fc.fee_category = 'Basic'
AND fs.gradelevel_id = aGradeLevelId;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getCredentialByGradeLevelId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getCredentialByGradeLevelId`(aGradeLevelId INT)
BEGIN

SELECT c.*,cr.*,gl.grade_level,sy.yearFrom, sy.yearTo FROM credentials_mt c
INNER JOIN credential_requirements_lt cr ON c.credential_id
INNER JOIN gradelevel_mt gl ON cr.gradelevel_id = gl.gradelevel_id
INNER JOIN schoolyear_mt sy ON cr.schoolyear_id = sy.schoolyear_id

WHERE cr.gradelevel_id = aGradeLevelId 
GROUP BY c.credential_name;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getCredentialIdByName` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getCredentialIdByName`(aCredentialName VARCHAR(255))
BEGIN
SELECT credential_id 
FROM credentials_mt
WHERE credential_name = aCredentialName;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getCurrentSchoolYear` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getCurrentSchoolYear`()
BEGIN
	SELECT yearFrom, yearTo FROM schoolyear_mt WHERE isCurrentSchoolYear = 1;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getCurrentSchoolYearFrom` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getCurrentSchoolYearFrom`()
BEGIN
SELECT yearFrom FROM schoolyear_mt WHERE isCurrentSchoolYear = 1;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getCurrentSchoolYearId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getCurrentSchoolYearId`()
BEGIN
SELECT schoolyear_id FROM schoolyear_mt WHERE isCurrentSchoolYear = 1;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getCurriculumId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getCurriculumId`(IN aGradeLevelId INT, IN aSchoolYearId INT)
BEGIN
	SELECT curriculum_id FROM curriculum_mt 
    WHERE gradelevel_id = aGradeLevelId 
    AND schoolyear_id = aSchoolYearId;
    
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getCurriculumInfoOf` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getCurriculumInfoOf`(IN p_curriculumId INT)
BEGIN

SELECT 
    c.*,
    es.educationstage,
    chd.dateAdded,
    gl.`level`,
    sy.yearFrom,
    sy.yearTo
    
    FROM curriculum 					c
    INNER JOIN gradelevel 				gl 	ON c.gradeLevelId = gl.id
    INNER JOIN curriculum_schoolyears 	csy ON c.id = csy.curriculumId
    INNER JOIN schoolyear 				sy 	ON csy.schoolYearId = sy.id
    INNER JOIN curriculum_hd 			chd ON c.id = chd.curriculumId
    INNER JOIN educationalstage			es	ON c.educationalstage_id = es.id
    
    WHERE c.id = p_curriculumId;
    
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getCurriculumNameGradeLevel` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getCurriculumNameGradeLevel`(aEducationalStageId int)
BEGIN
	SELECT g.`level` as gradelevel
    FROM educationalstage_gradelevel esg 
    INNER JOIN gradelevel g ON esg.gradelevel_id = g.id
    WHERE esg.curriculumname_id = aEducationStageId;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getCurriculumNameId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getCurriculumNameId`(aCurriculumName VARCHAR(50))
BEGIN
	SELECT cn.id FROM curriculumname cn WHERE cn.curriculum_name = aCurriculumName;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getCurriculumNames` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getCurriculumNames`()
BEGIN
	SELECT educationstage FROM educationalstage;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getCurriculumSubjects` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getCurriculumSubjects`(IN p_curriculumId INT)
BEGIN
	SELECT 
    s.`code`,
    s.`name`,
    s.units,
    s.description,
    gl.`level`
    
    FROM 		subjects	 			s
    INNER JOIN 	curriculum_subjects 	cs 		ON s.id = cs.subjectId
    INNER JOIN 	subjects_gradelevel		sgl 	ON cs.subjectId = sgl.subjectId
    INNER JOIN	gradelevel				gl		ON sgl.gradeLevelId = gl.id
    
    
    WHERE cs.curriculumId = p_curriculumId;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getDiscountById` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getDiscountById`(aDiscountId INT)
BEGIN

SELECT * FROM discount_mt WHERE discount_id = aDiscountId;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getDiscountDescription` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getDiscountDescription`(aDiscountName VARCHAR(100))
BEGIN

	SELECT description FROM discount WHERE discountType = aDiscountName;


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getDiscountId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getDiscountId`(aDiscountName VARCHAR(100))
BEGIN
	SELECT discount_id FROM discount WHERE discountType = aDiscountName;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getDiscountIdByName` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getDiscountIdByName`(aDiscountName VARCHAR(255))
BEGIN
SELECT discount_id FROM discount_mt WHERE discount_name = aDiscountName;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getDiscountNames` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getDiscountNames`()
BEGIN
SELECT discountType FROM discount;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getDiscountPercentage` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getDiscountPercentage`(aDiscountName VARCHAR(50))
BEGIN
	SELECT percentage FROM discount WHERE discountType = aDiscountName;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getDisountDescription` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getDisountDescription`(aDiscountName VARCHAR(100))
BEGIN

	SELECT description FROM discount WHERE discountType = aDiscountName;


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getDownpaymentFeeByGradeLevelId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getDownpaymentFeeByGradeLevelId`(aGradeLevelId INT)
BEGIN

SELECT f.fee_id, f.fee_name, f.fee_description, fs.fee_amount, 
fc.fee_category, fc.fee_category_id,
gl.*,
sy.*,
fs.*
FROM fee_mt f
INNER JOIN fee_schoolyear_lt fs ON f.fee_id = fs.fee_id
INNER JOIN gradelevel_mt gl ON fs.gradelevel_id = gl.gradelevel_id
INNER JOIN schoolyear_mt sy ON fs.schoolyear_id = sy.schoolyear_id
INNER JOIN fee_category_mt fc ON f.fee_category_id = fc.fee_category_id

WHERE fc.fee_category = 'Downpayment'
AND fs.gradelevel_id = aGradeLevelId;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getEachCurriculum` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getEachCurriculum`(IN pIN_yearFrom INT, IN pIN_search VARCHAR(250))
BEGIN
	SELECT schoolyear_mt.yearFrom, schoolyear_mt.yearTo, gradelevel_mt.grade_level, curriculum_mt.description, curriculum_mt.date_created FROM curriculum_mt
	INNER JOIN schoolyear_mt ON schoolyear_mt.schoolyear_id = curriculum_mt.schoolyear_id
	INNER JOIN gradelevel_mt ON gradelevel_mt.gradelevel_id = curriculum_mt.gradelevel_id
    WHERE yearFrom = pIN_yearFrom AND description LIKE CONCAT ('%',  pIN_search, '%');
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getEachSubjectByGradeLevel` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getEachSubjectByGradeLevel`(IN p_subjTitle VARCHAR(250))
BEGIN   
    SELECT subject_mt.title, subject_mt.code, subject_mt.description, gradelevel_mt.grade_level,
    subject_mt.subject_id, gradelevel_mt.gradelevel_id
	FROM subject_gradelevel_lt
	INNER JOIN subject_mt 
	ON subject_mt.subject_id = subject_gradelevel_lt.subject_id
	INNER JOIN gradelevel_mt 
	ON gradelevel_mt.gradelevel_id = subject_gradelevel_lt.gradelevel_id
	WHERE subject_mt.title = p_subjTitle;
    
	END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getEachSubjectByGradeLevelForCurriculum` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getEachSubjectByGradeLevelForCurriculum`(IN pIN_gradeLevel INT)
BEGIN
	SELECT subject_mt.code, subject_mt.title, subject_mt.description, gradelevel_mt.grade_level
	FROM subject_gradelevel_lt
	INNER JOIN subject_mt
	ON subject_mt.subject_id = subject_gradelevel_lt.subject_id
	INNER JOIN gradelevel_mt
	ON gradelevel_mt.gradelevel_id = subject_gradelevel_lt.gradelevel_id
    WHERE gradelevel_mt.grade_level = pIN_gradeLevel;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getEnrollmentScheduleBySchoolYear` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getEnrollmentScheduleBySchoolYear`(IN aSchoolYearId INT)
BEGIN
	SELECT 
    e.enrollment_id, 
    e.opening_date, 
    e.closing_date, 
    e.date_created,
    e.schoolyear_id, 
    sy.yearFrom, 
    sy.yearTo,
    sy.start_date,
    sy.end_date,
    sy.isActive,
    sy.isCurrentSchoolYear
    FROM enrollment_mt e
    INNER JOIN schoolyear_mt sy ON e.schoolyear_id = sy.schoolyear_id
    WHERE sy.schoolyear_id = aSchoolYearId;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getFaculty` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getFaculty`()
BEGIN
	SELECT * FROM faculty_mt;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getFacultyByID` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getFacultyByID`(
	IN p_facultyID int(11)
)
BEGIN
	SELECT * FROM faculty_mt WHERE faculty_id = p_facultyID;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getFacultyId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getFacultyId`(
p_lastName VARCHAR(255),
p_firstName VARCHAR(255),
p_middleName VARCHAR(255)
)
BEGIN

SELECT f.faculty_id FROM faculty_mt f 
WHERE f.firstName = p_firstName 
AND f.lastName = p_lastName
AND f.middleName = p_middleName; 


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getfacultyIdByEmployeeNo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getfacultyIdByEmployeeNo`(p_facultyEmployeeNo INT)
BEGIN
	SELECT id FROM faculty  
    WHERE employee_id = p_facultyEmployeeNo;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getFeeCategoryById` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getFeeCategoryById`(IN aFeeCategoryId INT)
BEGIN
	SELECT * FROM fee_category_mt WHERE fee_category_id = aFeeCategoryId;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getFeeCategoryId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getFeeCategoryId`(IN aFeeCategory VARCHAR(255))
BEGIN
	SELECT fee_category_id FROM fee_category_mt WHERE fee_category = aFeeCategory;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getFeeId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getFeeId`(IN aFeeName VARCHAR(255))
BEGIN
	SELECT fee_id FROM fee_mt WHERE fee_name = aFeeName;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getFeeIdByName` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getFeeIdByName`(IN aFeeName VARCHAR(255))
BEGIN
	SELECT fee_id FROM fee_mt WHERE fee_name = aFeeName;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getFees` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getFees`()
BEGIN

	SELECT
    f.title,f.amount,f.description,ft.feetype,gl.`level`
    FROM fee f 
    INNER JOIN feetype 			ft ON f.feetype_id 		= ft.feetype_id
    INNER JOIN fee_gradelevel 	fg ON f.fee_id 			= fg.fee_id
    INNER JOIN gradelevel 		gl ON fg.gradelevel_id 	= gl.gradelevel_id;
      
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getFeesByCategory` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getFeesByCategory`(IN aFeeCategory VARCHAR(255))
BEGIN

SELECT
f1.*, f2.*,
gl.*,
f3.*

FROM fee_mt f1 
INNER JOIN fee_schoolyear_lt f2 ON f1.fee_id = f2.fee_id
INNER JOIN fee_category_mt f3 ON f1.fee_category_id = f3.fee_category_id
INNER JOIN gradelevel_mt gl ON f2.gradelevel_id = gl.gradelevel_id

WHERE f3.fee_category = aFeeCategory;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getFeesByFeeType` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getFeesByFeeType`(aFeeTypeId INT)
BEGIN

	SELECT
    f.title,f.amount,f.description,ft.feetype,gl.`level`
    FROM fee f 
    INNER JOIN feetype 			ft ON f.feetype_id 		= ft.feetype_id
    INNER JOIN fee_gradelevel 	fg ON f.fee_id 			= fg.fee_id
    INNER JOIN gradelevel 		gl ON fg.gradelevel_id 	= gl.gradelevel_id
    
    WHERE f.feetype_id = aFeeTypeId;
    
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getFeesByGradeLevel` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getFeesByGradeLevel`(aGradeLevel INT)
BEGIN

SELECT
f1.*, f2.*,
gl.*,
f3.*

FROM fee_mt f1 
INNER JOIN fee_schoolyear_lt f2 ON f1.fee_id = f2.fee_id
INNER JOIN fee_category_mt f3 ON f1.fee_category_id = f3.fee_category_id
INNER JOIN gradelevel_mt gl ON f2.gradelevel_id = gl.gradelevel_id

WHERE gl.grade_level = aGradeLevel;
    
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getFeesByGradeLevelAndCategory` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getFeesByGradeLevelAndCategory`(aGradeLevel INT, aFeeCategory VARCHAR(255))
BEGIN


SELECT
f1.*, f2.*,
gl.*,
f3.*

FROM fee_mt f1 
INNER JOIN fee_schoolyear_lt f2 ON f1.fee_id = f2.fee_id
INNER JOIN fee_category_mt f3 ON f1.fee_category_id = f3.fee_category_id
INNER JOIN gradelevel_mt gl ON f2.gradelevel_id = gl.gradelevel_id

WHERE f3.fee_category = aFeeCategory
AND gl.grade_level = aGradeLevel;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getFeesByGradeLevelAndFeeType` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getFeesByGradeLevelAndFeeType`(aGradeLevelId INT, aFeeTypeId INT)
BEGIN

	SELECT
    f.title,f.amount,f.description,ft.feetype,gl.`level`
    FROM fee f 
    INNER JOIN feetype 			ft ON f.feetype_id 		= ft.feetype_id
    INNER JOIN fee_gradelevel 	fg ON f.fee_id 			= fg.fee_id
    INNER JOIN gradelevel 		gl ON fg.gradelevel_id 	= gl.gradelevel_id
    
    WHERE fg.gradelevel_id = aGradeLevelId
    AND f.feetype_id = aFeeTypeId;
    
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getFeesByGradeLevelAndType` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getFeesByGradeLevelAndType`(aGradeLevelId INT, aFeeTypeId INT)
BEGIN

	SELECT
    f.title,f.amount,f.description,ft.feetype,gl.`level`
    FROM fee f 
    INNER JOIN feetype 			ft ON f.feetype_id 		= ft.feetype_id
    INNER JOIN fee_gradelevel 	fg ON f.fee_id 			= fg.fee_id
    INNER JOIN gradelevel 		gl ON fg.gradelevel_id 	= gl.gradelevel_id
    
    WHERE fg.gradelevel_id = aGradeLevelId
    AND f.feetype_id = aFeeTypeId;
    
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getFeeTypeId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getFeeTypeId`(aFeeType VARCHAR(50))
BEGIN
	SELECT ft.id FROM feetype ft WHERE ft.feetype = aFeeType;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getFeeTypes` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getFeeTypes`()
BEGIN
	SELECT * FROM feetype;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getGradeLevelId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getGradeLevelId`(IN aGradeLevel INT)
BEGIN
	SELECT gradelevel_id FROM gradeLevel_mt WHERE `grade_level` = aGradeLevel; 
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getGradeLevelsAssignedToCredentialById` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getGradeLevelsAssignedToCredentialById`(aCredentialId INT)
BEGIN

SELECT gl.grade_level,gl.gradelevel_id FROM credentials_mt c
INNER JOIN credential_requirements_lt cr ON c.credential_id
INNER JOIN gradelevel_mt gl ON cr.gradelevel_id = gl.gradelevel_id
INNER JOIN schoolyear_mt sy ON cr.schoolyear_id = sy.schoolyear_id

WHERE cr.credential_id = aCredentialId;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getIdBySessionName` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getIdBySessionName`(aSessionName VARCHAR(255))
BEGIN

SELECT session_id FROM session_mt WHERE title = aSessionName;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getLastGradeLevelStudentPassed` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getLastGradeLevelStudentPassed`(aStudentId INT)
BEGIN

SELECT MAX(grade_level) FROM schoolyear_student_lt sslt
INNER JOIN gradelevel_mt gl ON sslt.gradelevel_id = gl.gradelevel_id
WHERE 
student_id = aStudentId AND passed = 1;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getMiscellaneousByGradeLevelId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getMiscellaneousByGradeLevelId`(aGradeLevelId INT)
BEGIN

SELECT f.fee_id, f.fee_name, f.fee_description, fs.fee_amount, 
fc.fee_category, fc.fee_category_id,
gl.*,
sy.*,
fs.*
FROM fee_mt f
INNER JOIN fee_schoolyear_lt fs ON f.fee_id = fs.fee_id
INNER JOIN gradelevel_mt gl ON fs.gradelevel_id = gl.gradelevel_id
INNER JOIN schoolyear_mt sy ON fs.schoolyear_id = sy.schoolyear_id
INNER JOIN fee_category_mt fc ON f.fee_category_id = fc.fee_category_id

WHERE fc.fee_category = 'Miscellaneous'
AND fs.gradelevel_id = aGradeLevelId;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getMiscellaneousFeesByGradeLevelId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getMiscellaneousFeesByGradeLevelId`(aGradeLevelId INT)
BEGIN

SELECT f.fee_id, f.fee_name, f.fee_description, fs.fee_amount, 
fc.fee_category, fc.fee_category_id,
gl.*,
sy.*,
fs.*
FROM fee_mt f
INNER JOIN fee_schoolyear_lt fs ON f.fee_id = fs.fee_id
INNER JOIN gradelevel_mt gl ON fs.gradelevel_id = gl.gradelevel_id
INNER JOIN schoolyear_mt sy ON fs.schoolyear_id = sy.schoolyear_id
INNER JOIN fee_category_mt fc ON f.fee_category_id = fc.fee_category_id

WHERE fc.fee_category = 'Miscellaneous'
AND fs.gradelevel_id = aGradeLevelId;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getOtherFeesByGradeLevelId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getOtherFeesByGradeLevelId`(aGradeLevelId INT)
BEGIN

SELECT f.fee_id, f.fee_name, f.fee_description, fs.fee_amount, 
fc.fee_category, fc.fee_category_id,
gl.*,
sy.*,
fs.*
FROM fee_mt f
INNER JOIN fee_schoolyear_lt fs ON f.fee_id = fs.fee_id
INNER JOIN gradelevel_mt gl ON fs.gradelevel_id = gl.gradelevel_id
INNER JOIN schoolyear_mt sy ON fs.schoolyear_id = sy.schoolyear_id
INNER JOIN fee_category_mt fc ON f.fee_category_id = fc.fee_category_id

WHERE fc.fee_category = 'Others'
AND fs.gradelevel_id = aGradeLevelId;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getPaymentTermById` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getPaymentTermById`(IN aPaymentTermId INT)
BEGIN
	SELECT * FROM paymentterm_mt WHERE paymentterm_id = aPaymentTermId;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getPaymentTermId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getPaymentTermId`(aPaymentTerm VARCHAR(255))
BEGIN
SELECT paymentterm_id FROM paymentterm_mt
WHERE paymentterm = aPaymentTerm;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getPresentGradeLevelByStudentId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getPresentGradeLevelByStudentId`(aStudentId INT)
BEGIN

DECLARE aPresentGradeLevel INT;
DECLARE aRegistrationGradeLevel INT;

SELECT gl.grade_level INTO aRegistrationGradeLevel FROM registration_mt r
LEFT JOIN student_mt s ON r.registration_id = s.registration_id
INNER JOIN gradelevel_mt gl ON r.gradelevel_id = gl.gradelevel_id
WHERE s.student_id = aStudentId;

SELECT 
gl.grade_level
INTO aPresentGradeLevel
FROM schoolyear_student_lt sslt
INNER JOIN gradelevel_mt gl ON sslt.gradelevel_id = gl.gradelevel_id
WHERE sslt.student_id = aStudentId 
ORDER BY gl.grade_level DESC LIMIT 1;


IF aPresentGradeLevel IS NULL
THEN
	SELECT aRegistrationGradeLevel INTO aPresentGradeLevel;
    SELECT aPresentGradeLevel;
ELSE 
	SELECT aPresentGradeLevel;
END IF;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getRecommendedGradeLevel` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getRecommendedGradeLevel`(aStudentId INT)
BEGIN

DECLARE aRecommendedGradeLevel INT;

SELECT 

CASE 
WHEN sslt.passed = 0
THEN gl.grade_level
WHEN sslt.passed = 1
THEN gl.grade_level+1
END AS aRecommendedGradeLevel INTO aRecommendedGradeLevel
FROM schoolyear_student_lt sslt
INNER JOIN gradelevel_mt gl ON sslt.gradelevel_id = gl.gradelevel_id
WHERE sslt.student_id = aStudentId 
ORDER BY gl.grade_level DESC LIMIT 1;

SELECT aRecommendedGradeLevel;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getRegistrationIdByStudentId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getRegistrationIdByStudentId`(aStudentId INT)
BEGIN

SELECT r.registration_id AS aRegistrationId
FROM registration_mt r
INNER JOIN student_mt s 
ON r.registration_id = s.registration_id
WHERE 
s.student_id = aStudentId;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getRegistrationInfoById` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getRegistrationInfoById`(IN aRegistrationId INT)
BEGIN
	SELECT r.*,g.*,s.*,a.* FROM registration_mt r
    INNER JOIN gradelevel_mt g ON r.gradelevel_id = g.gradelevel_id
    INNER JOIN schoolyear_mt s ON r.schoolyear_id = s.schoolyear_id
    INNER JOIN admission_mt a ON r.registration_id = a.registration_id
    WHERE r.registration_id = aRegistrationId;


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getRegistrationPaymentTermByStudentId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getRegistrationPaymentTermByStudentId`(aStudentId INT)
BEGIN

SELECT pt.paymentterm FROM paymentterm_mt pt
INNER JOIN registration_mt r ON pt.paymentterm_id = r.paymentterm_id
INNER JOIN student_mt s ON r.registration_id = s.registration_id
WHERE s.student_id = aStudentId;


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getSchedulesByGradeLevel` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getSchedulesByGradeLevel`(aGradeLevelId INT)
BEGIN
SELECT 
    cs.startTime, cs.endTime, d.days,
    r.*,s.`name` AS subjectName,
    CONCAT(sy.yearFrom,'-',sy.yearTo) AS schoolYear,
    sec.sectionName,
    gl.`level` AS gradeLevel
    
    FROM classschedule cs
    INNER JOIN classschedule_hd cshd ON cs.id = cshd.classschedule_id
    INNER JOIN classschedule_section css ON cs.id = css.classschedule_id
    INNER JOIN daysofweek d ON cs.dayOfWeek_id = d.id
    INNER JOIN room r ON cs.room_id = r.id
    INNER JOIN `subjects` s ON cs.subject_id = s.id
    INNER JOIN gradelevel gl ON css.gradelevel_id = gl.id
    INNER JOIN section sec ON css.section_id = sec.id
    INNER JOIN schoolyear sy ON css.schoolyear_id = sy.id
    
    WHERE css.gradelevel_id = aGradeLevelId;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getSchoolFeesSum` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getSchoolFeesSum`(aGradeLevelId INT)
BEGIN

SELECT SUM(fslt.fee_amount) AS sumOfFees
FROM fee_schoolyear_lt fslt
INNER JOIN fee_mt fmt ON fslt.fee_id = fmt.fee_id 
WHERE fmt.fee_name <> 'Downpayment' AND
fslt.gradelevel_id = aGradeLevelId;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getSchoolYearById` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getSchoolYearById`(aSchoolYearId INT)
BEGIN

SELECT * FROM schoolyear_mt WHERE schoolyear_id = aSchoolYearId;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getSchoolYearId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getSchoolYearId`(IN aYearFrom INT, aYearTo INT)
BEGIN
	SELECT schoolyear_id FROM schoolyear_mt 
    WHERE 	yearFrom = aYearFrom  AND
			yearTo = aYearTo;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getSchoolYearIdByYearFrom` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getSchoolYearIdByYearFrom`(IN aSchoolYearFrom INT)
BEGIN
	SELECT schoolyear_id FROM schoolyear_mt WHERE yearFrom = aSchoolYearFrom;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getSectionByGradeLevelId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getSectionByGradeLevelId`(aGradeLevelId INT)
BEGIN

	SELECT s.sectionName
    FROM section s
    INNER JOIN section_gradelevel sg ON s.section_id = sg.sectionId
    INNER JOIN gradelevel g ON sg.gradelevelId = g.gradelevel_id
    WHERE sg.gradelevelId = aGradeLevelId;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getSectionId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getSectionId`(aSectionName VARCHAR(50))
BEGIN
	SELECT s.section_id FROM section s WHERE s.sectionName = aSectionName;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getSectionsByGradeLevel` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getSectionsByGradeLevel`(aGradeLevelId INT)
BEGIN

SELECT 
s.section_id,
s.sectionName,
s.isActive,
sslt.session_id,
ss.title,
sslt.capacity,
sslt.schoolyear_id,
sy.yearFrom,
sy.yearTo,
sslt.gradelevel_id,
gl.grade_level 
FROM section_mt s
INNER JOIN schoolyear_section_lt sslt ON s.section_id = sslt.section_id
INNER JOIN session_mt ss ON sslt.session_id = ss.session_id
INNER JOIN schoolyear_mt sy ON sslt.schoolyear_id = sy.schoolyear_id
INNER JOIN gradelevel_mt gl ON sslt.gradelevel_id = gl.gradelevel_id
WHERE sslt.gradelevel_id = aGradeLevelId;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getSectionsBySchoolYear` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getSectionsBySchoolYear`(aSchoolYearId INT)
BEGIN

SELECT 
s.section_id,
s.sectionName,
s.isActive,
sslt.session_id,
ss.title,
sslt.capacity,
sslt.schoolyear_id,
sy.yearFrom,
sy.yearTo,
sslt.gradelevel_id,
gl.grade_level 
FROM section_mt s
INNER JOIN schoolyear_section_lt sslt ON s.section_id = sslt.section_id
INNER JOIN session_mt ss ON sslt.session_id = ss.session_id
INNER JOIN schoolyear_mt sy ON sslt.schoolyear_id = sy.schoolyear_id
INNER JOIN gradelevel_mt gl ON sslt.gradelevel_id = gl.gradelevel_id
WHERE sslt.schoolyear_id = aSchoolYearId;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getSectionsBySchoolYearAndGradeLevel` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getSectionsBySchoolYearAndGradeLevel`(aSchoolYearId INT, aGradeLevelId INT)
BEGIN

SELECT 
s.section_id,
s.sectionName,
s.isActive,
sslt.session_id,
ss.title,
sslt.capacity,
sslt.schoolyear_id,
sy.yearFrom,
sy.yearTo,
sslt.gradelevel_id,
gl.grade_level 
FROM section_mt s
INNER JOIN schoolyear_section_lt sslt ON s.section_id = sslt.section_id
INNER JOIN session_mt ss ON sslt.session_id = ss.session_id
INNER JOIN schoolyear_mt sy ON sslt.schoolyear_id = sy.schoolyear_id
INNER JOIN gradelevel_mt gl ON sslt.gradelevel_id = gl.gradelevel_id
WHERE 
sslt.schoolyear_id = aSchoolYearId
AND
sslt.gradelevel_id = aGradeLevelId ;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getSectionStudents` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getSectionStudents`(aSectionId VARCHAR(255), aSchoolYearId INT)
BEGIN
	SELECT std.*
    from
    section_student ss 
    INNER JOIN section s ON ss.section_id = s.section_id
    INNER JOIN students std ON ss.student_id = std.student_id
    INNER JOIN schoolyear sy ON ss.schoolyear_id = sy.id
    
    WHERE ss.section_id = aSectionId
    AND   ss.schoolyear_id = aSchoolYearId;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getSessionId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getSessionId`(aSessionType VARCHAR(11))
BEGIN
	SELECT id FROM `session` WHERE title = aSessionType;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getSessions` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getSessions`()
BEGIN

SELECT title FROM session_mt;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getSpecialization` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getSpecialization`()
BEGIN
	SELECT * FROM specialization;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getStudentDiscount` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getStudentDiscount`(aStudentId INT, aSchoolYearId INT)
BEGIN

SELECT d.*,sd.* FROM discount_mt d
INNER JOIN student_discount_lt sd
ON d.discount_id = sd.discount_id
WHERE sd.student_id = aStudentId
AND sd.schoolyear_id = aSchoolYearId;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getStudentPaymentTerm` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getStudentPaymentTerm`(aStudentId INT, aSchoolYearId INT)
BEGIN

SELECT pt.* FROM paymentterm_mt pt
INNER JOIN student_paymentterm_lt spl 
ON pt.paymentterm_id = spl.paymentterm_id
WHERE spl.student_id = aStudentId
AND spl.schoolyear_id = aSchoolYearId;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getStudentRecordById` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getStudentRecordById`(aStudentId INT)
BEGIN

SELECT 
s.*, r.*,a.*,
sy.schoolyear_id,
sy.yearFrom , sy.yearTo,

r.student_type AS registeredStudentType,

CASE 
WHEN s.student_type = 1
THEN NULL
WHEN s.student_type = 0
THEN sslt.passed
END AS aPassed,

s.student_type AS studentType,

gl.grade_level AS registeredGradeLevel,
gl.grade_level AS admissionGradeLevel,

CASE 
WHEN s.student_type=1 THEN NULL
WHEN s.student_type=0 THEN gla.grade_level 
END AS last_gradelevel_enrolled,

CASE
WHEN s.student_type=1 THEN NULL
WHEN s.student_type=0 THEN sslt.passed 
END AS has_passed_last_gradelevel,

CASE 
WHEN s.student_type = 1 THEN NULL
WHEN s.student_type = 0 THEN sslt.schoolyear_id
END AS last_gradelevel_enrolled_schoolyear_id,

CASE 
WHEN s.student_type = 1 THEN NULL
WHEN s.student_type = 0 THEN sya.yearFrom 
END AS last_gradelevel_enrolled_schoolyear_yearFrom,

CASE 
WHEN s.student_type = 1 THEN NULL
WHEN s.student_type = 0 THEN sya.yearTo
END AS last_gradelevel_enrolled_schoolyear_yearTo,

CASE 
WHEN s.student_type = 1 THEN NULL 
WHEN s.student_type = 0 AND sslt.passed = 0 THEN NULL 
WHEN s.student_type = 0 AND s.isActive = 1 THEN NULL 
WHEN s.student_type = 0 AND sslt.passed = 1 AND s.isActive =0 THEN gla.grade_level+1
END AS promotedGradeLevel,

CASE
WHEN s.student_type = 1 THEN gl.grade_level 
WHEN s.student_type = 0 AND s.isActive = 1 THEN gla.grade_level+1
WHEN s.student_type = 0 AND s.isActive = 0 THEN gla.grade_level
END AS presentGradeLevel

FROM registration_mt r 
INNER JOIN schoolyear_mt sy ON r.schoolyear_id = sy.schoolyear_id
INNER JOIN gradelevel_mt gl ON r.gradelevel_id = gl.gradelevel_id

INNER JOIN admission_mt a ON r.registration_id = a.registration_id
INNER JOIN student_mt s ON  a.registration_id = s.registration_id

LEFT OUTER JOIN schoolyear_student_lt sslt ON s.student_id = sslt.student_id
LEFT OUTER JOIN schoolyear_mt sya ON sslt.schoolyear_id = sya.schoolyear_id
LEFT OUTER JOIN gradelevel_mt gla ON sslt.gradelevel_id = gla.gradelevel_id

INNER JOIN 
(SELECT gl.grade_level 
	FROM registration_mt r 
	INNER JOIN gradelevel_mt gl 
	ON r.gradelevel_id = gl.gradelevel_id
	ORDER BY r.gradelevel_id ASC LIMIT 1) 
		AS registration_gradelevel_selected

WHERE s.student_id = aStudentId
ORDER BY sya.yearFrom DESC, sya.yearTo DESC, gla.grade_level DESC
LIMIT 1;



END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getStudentsBySchoolYear` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getStudentsBySchoolYear`(IN aSchoolYearId INT)
BEGIN

SELECT a.admission_id, a.isComplete, a.completion_date,
r.*,s.student_id,s.entry_date,s.isGraduated, s.date_graduated, s.isActive,
gl.grade_level AS gradelevel_enrolled,
sslt.schoolyear_id AS schoolyear_id_enrolled, 
sy.YearFrom AS schoolyear_enrolled_yearfrom,
sy.YearTo AS schoolyear_enrolled_yearto

FROM admission_mt a 
INNER JOIN registration_mt r ON a.registration_id = r.registration_id
INNER JOIN student_mt s ON s.registration_id = r.registration_id
INNER JOIN schoolyear_student_lt sslt ON s.student_id = sslt.student_id
INNER JOIN gradelevel_mt gl ON sslt.gradelevel_id = gl.gradelevel_id
INNER JOIN schoolyear_mt sy ON sslt.schoolyear_id = sy.schoolyear_id 

WHERE 
sslt.schoolyear_id = aSchoolYearId;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getStudentsBySchoolYearAndStatus` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getStudentsBySchoolYearAndStatus`(IN aSchoolYearId INT, IN aIsActiveStatus INT)
BEGIN

SELECT 
r.*,s.*,a.*

FROM registration_mt r
INNER JOIN admission_mt a ON r.registration_id = a.registration_id
INNER JOIN student_mt s ON a.registration_id = s.registration_id
INNER JOIN gradelevel_mt gl ON r.gradelevel_id = gl.gradelevel_id
INNER JOIN schoolyear_mt sy ON r.schoolyear_id = sy.schoolyear_id

LEFT OUTER JOIN schoolyear_student_lt sslt ON s.student_id = sslt.student_id
LEFT OUTER JOIN gradelevel_mt gla ON sslt.gradelevel_id = gla.gradelevel_id
LEFT OUTER JOIN schoolyear_mt sya ON sslt.schoolyear_id = sya.schoolyear_id

WHERE 
s.isActive = aIsActiveStatus
AND
sslt.schoolyear_id = aSchoolYearId
GROUP BY r.registration_id ;


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getSubjectId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getSubjectId`(IN p_subjectCode VARCHAR(20))
BEGIN
	SELECT s.id FROM subjects s
    WHERE s.`code` = p_subjectCode;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getSubjectsByGradeLevel` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getSubjectsByGradeLevel`(IN p_gradeLevelId INT)
BEGIN

SELECT 
s.`code`, 
s.`name`, 
s.units, 
s.description,
gl.`level` 
 
FROM 		subjects 				s 
INNER JOIN 	subjects_gradelevel 	sgl 	ON s.subjects_id = sgl.subjectId
INNER JOIN	gradelevel 				gl	 	ON sgl.gradeLevelId = gl.gradelevel_id

WHERE sgl.gradeLevelId = p_gradeLevelId;



END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getSumOfFeeByGradeLevel` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getSumOfFeeByGradeLevel`(aGradeLevelId INT)
BEGIN
select sum(fee_amount) as sumOfFees from fee_schoolyear_lt WHERE gradelevel_id = aGradeLevelId
AND isActive = 1;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getSumOfFees` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getSumOfFees`(aGradeLevelId INT, aSchoolYearId INT)
BEGIN
	SELECT SUM(f.amount) AS sumOFFees FROM
    fee_schoolyear fs INNER JOIN fee f ON fs.fee_id = f.id
    INNER JOIN fee_gradelevel fg ON f.id = fg.fee_id
    WHERE fg.gradelevel_id = aGradeLevelId
    AND fs.schoolyear_id = aSchoolYearId;
    
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getSumOfMiscellaneousFeesByGradeLevelId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getSumOfMiscellaneousFeesByGradeLevelId`(aGradeLevelId INT)
BEGIN

SELECT SUM(fee_amount) AS sumOfMiscellaneousFees FROM fee_schoolyear_lt fslt
INNER JOIN fee_mt f ON fslt.fee_id = f.fee_id
INNER JOIN fee_category_mt fct ON f.fee_category_id = fct.fee_category_id
WHERE fct.fee_category = 'Miscellaneous'
AND fslt.gradelevel_id = aGradeLevelId;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getSumOfOtherFeesByGradeLevelId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getSumOfOtherFeesByGradeLevelId`(aGradeLevelId INT)
BEGIN

SELECT SUM(fee_amount) AS sumOfOtherFees FROM fee_schoolyear_lt fslt
INNER JOIN fee_mt f ON fslt.fee_id = f.fee_id
INNER JOIN fee_category_mt fct ON f.fee_category_id = fct.fee_category_id
WHERE fct.fee_category = 'Others'
AND fslt.gradelevel_id = aGradeLevelId;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getSumOfTuitionFeesByGradeLevelId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getSumOfTuitionFeesByGradeLevelId`(aGradeLevelId INT)
BEGIN

SELECT SUM(fee_amount) AS sumOfTuitionFee FROM fee_schoolyear_lt fslt
INNER JOIN fee_mt f ON fslt.fee_id = f.fee_id
INNER JOIN fee_category_mt fct ON f.fee_category_id = fct.fee_category_id
WHERE fct.fee_category = 'Tuition'
AND fslt.gradelevel_id = aGradeLevelId;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getTuitionFee` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getTuitionFee`(aStudentId INT, aSchoolYearId INT)
BEGIN

SELECT 
tf.student_id, tf.schoolyear_id,tf.date_assigned,
bbf.*,
sy.*,
s.registration_id,s.entry_date,s.isActive,s.isGraduated,s.student_type,
p.payment_id, p.amount_tendered, p.date_of_payment,

CASE WHEN bbf.amount - sum(p.amount_tendered) >= 0
		THEN bbf.amount - sum(p.amount_tendered)
	 WHEN bbf.amount - sum(p.amount_tendered) < 0
		THEN 0.00
	ELSE bbf.amount
END AS balance,

CASE WHEN bbf.amount - sum(p.amount_tendered) <= 0
		THEN TRUE
	 WHEN bbf.amount - sum(p.amount_tendered) > 0
		THEN FALSE
	ELSE FALSE
END AS isPaid

FROM tuition_fee tf
LEFT JOIN payment p 
ON tf.balance_breakdown_fee_id = p.balance_breakdown_fee_id
INNER JOIN balance_breakdown_fee bbf 
ON tf.balance_breakdown_fee_id = bbf.balance_breakdown_fee_id
INNER JOIN schoolyear_mt sy 
ON tf.schoolyear_id = sy.schoolyear_id
INNER JOIN student_mt s ON tf.student_id = s.student_id
WHERE tf.student_id = aStudentId
AND tf.schoolyear_id = aSchoolYearId
GROUP BY bbf.balance_breakdown_fee_id;


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getTuitionFeeSum` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getTuitionFeeSum`(aStudentId INT, aSchoolYearId INT)
BEGIN
	SELECT SUM(bbf.amount) AS tuitionFeeSum FROM tuition_fee tf
	INNER JOIN balance_breakdown_fee bbf ON tf.balance_breakdown_fee_id = bbf.balance_breakdown_fee_id
	WHERE student_id = aStudentId AND
	schoolyear_id = aSchoolYearId;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getTuitionFeeTotalPaid` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getTuitionFeeTotalPaid`(aStudentId INT, aSchoolYearId INT)
BEGIN

SELECT SUM(p.amount_tendered) AS totalTuitionPaid
FROM payment p
INNER JOIN balance_breakdown_fee bbf 
ON p.balance_breakdown_fee_id = bbf.balance_breakdown_fee_id
INNER JOIN tuition_fee tf 
ON bbf.balance_breakdown_fee_id = tf.balance_breakdown_fee_id
WHERE tf.student_id = aStudentId
AND tf.schoolyear_id = aSchoolYearId; 

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getUserCompleteName` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getUserCompleteName`(aUserName VARCHAR(20))
BEGIN
 SELECT CONCAT(u.firstname,' ',u.lastname) AS completeName
 FROM user_mt u WHERE u.username = aUserName;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getUserId` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getUserId`(IN p_userName VARCHAR(10))
BEGIN
	SELECT id FROM user_mt WHERE username = p_userName;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getUserLastLogin` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getUserLastLogin`(IN p_username varchar(50))
BEGIN
	SELECT lastLoginDate FROM users WHERE username = p_username;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `getUsernameByLastName` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getUsernameByLastName`(IN p_lastName varchar(50))
BEGIN
	select username from users where lastname = lower(p_lastname);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `hasTuitionFeeDiscount` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `hasTuitionFeeDiscount`(aStudentId INT, aSchoolYearId INT)
BEGIN

SELECT 
CASE WHEN COUNT(*) > 0
	THEN TRUE 
    ELSE FALSE
		END AS hasDiscount
FROM student_discount_lt
WHERE student_id = aStudentId
AND schoolyear_id = aSchoolYearId;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `isAlreadyEnrolledInCurrentSchoolYear` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `isAlreadyEnrolledInCurrentSchoolYear`(aStudentId INT, aCurrentSchoolYearId INT)
BEGIN

SELECT * FROM schoolyear_student_lt 
WHERE student_id = aStudentId
AND schoolyear_id = aCurrentSchoolYearId; 

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `isAlreadyStudent` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `isAlreadyStudent`(aLastName VARCHAR(255), aFirstName VARCHAR(255), aMiddleName VARCHAR(255), aDateOfBirth DATE)
BEGIN
	SELECT * FROM students WHERE
    lastName = aLastName AND
    firstName = aFirstName AND
    middleName = aMiddleName AND
    dateOfBirth = aDateOfBirth;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `isEnrolledInSchoolYear` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `isEnrolledInSchoolYear`(aStudentId INT, aSchoolYearId INT)
BEGIN
SELECT * from schoolyear_student_lt 
WHERE student_id = aStudentId AND 
schoolyear_id = aSchoolYearId;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `isEnrollmentClosedForSchoolYear` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `isEnrollmentClosedForSchoolYear`(aSchoolYearId INT)
BEGIN

DECLARE aEnrollmentClosingDate DATE;

SELECT e.closing_date INTO aEnrollmentClosingDate 
FROM enrollment_mt e
WHERE e.schoolyear_id = aSchoolYearId;

SELECT IF(CURDATE() > DATE(aEnrollmentClosingDate), 1,0) 
AS is_enrollment_closed ; 

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `isGradeLevelActive` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `isGradeLevelActive`(IN aGradeLevel INT)
BEGIN
	SELECT isActive FROM gradelevel_mt
    WHERE grade_level = aGradeLevel;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `isStudentApplicantExists` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `isStudentApplicantExists`(aStudentType VARCHAR(10),aLastName VARCHAR(255),aMiddleName VARCHAR(255), aFirstName VARCHAR(255),aDateOfBirth date)
BEGIN
    SELECT 
    studentType, lastName, firstName, middleName, dateOfBirth
    FROM registration
    
    WHERE studentType = aStudentType AND
		  lastName = aLastName AND
          firstName = aFirstName AND
          middleName = aMiddleName AND
          dateOfBirth = aDateOfBirth     ;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `isUserActive` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `isUserActive`(IN p_username varchar(50), OUT p_boolIsActive INT)
BEGIN

	SELECT isActive INTO p_boolIsActive
    FROM users
    WHERE username = lower(p_username);
    
    SELECT p_boolIsActive;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `isUserLocked` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `isUserLocked`(IN p_username varchar(20), OUT p_boolIsLocked SMALLINT)
BEGIN
	SELECT isLocked INTO p_boolIsLocked
    FROM users 
    WHERE username = lower(p_username);
    
    SELECT p_boolIsLocked;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `payTuitionFee` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `payTuitionFee`(aBalanceBreakDownFeeId INT, anAmountTendered DECIMAL(10,2), OUT aPaymentId INT )
BEGIN

INSERT INTO payment(balance_breakdown_fee_id, amount_tendered)
VALUES(aBalanceBreakDownFeeId,anAmountTendered);

SELECT LAST_INSERT_ID() INTO aPaymentId; 

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `register` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `register`(
p_studentType VARCHAR(20), 
p_lastName VARCHAR(100), 
p_firstName VARCHAR(100), 
p_middleName VARCHAR(100), 
p_dateOfBirth DATE, 
p_placeOfBirth VARCHAR(100),
p_nationality VARCHAR(50), 
p_religion VARCHAR(50), 
p_gender INT, 
p_father_firstName VARCHAR(100),
p_father_middleName VARCHAR(100), 
p_father_lastName VARCHAR(100), 
p_father_occupation VARCHAR(100), 
p_father_officePhoneNo VARCHAR(100), 
p_mother_firstName VARCHAR(100), 
p_mother_middleName VARCHAR(100), 
p_mother_lastName VARCHAR(100), 
p_mother_occupation VARCHAR(100), 
p_mother_officePhoneNo VARCHAR(20), 
p_father_mobileNo VARCHAR(20), 
p_mother_mobileNo VARCHAR(20), 
p_guardian_lastName VARCHAR(100), 
p_guardian_firstName VARCHAR(100), 
p_guardian_middleName VARCHAR(100), 
p_guardian_occupation VARCHAR(100), 
p_guardian_officePhoneNo VARCHAR(50), 
p_guardian_mobileNo VARCHAR(50), 
p_guardian_relationToStudent VARCHAR(50), p_isFatherContactInCaseEmergency INT, 
p_isMotherContactInCaseEmergency INT, 
p_isGuardianContactInCaseEmergency INT, 
p_schoolyear_id INT, 
p_gradelevel_id INT,
p_schoolLastAttended VARCHAR(100),
p_schoolAddress VARCHAR(100),
p_addedByUserId INT,
p_roomOrHouseNo VARCHAR(100),
p_street VARCHAR(100),
p_brgyOrSubd VARCHAR(100),
p_city VARCHAR(100),
p_province VARCHAR(100),
p_hasBirthCertificate BIT(1),
p_hasBaptismalCertificate BIT(1),
p_hasMedicalCertificate BIT(1),
p_hasIdPicture BIT(1),
p_hasReportCard BIT(1),
p_hasCertificateOfGoodMoral BIT(1),
p_paymentTermId INT,
OUT op_registrationId INT)
BEGIN

	DECLARE var_registrationId INT;
	DECLARE EXIT HANDLER FOR sqlexception
	BEGIN
		ROLLBACK;
		RESIGNAL;
	END;
    
    START TRANSACTION;
    
    INSERT INTO registration
    (
    studentType,  
    lastName,  
    firstName,  
    middleName,  
    dateOfBirth,  
    placeOfBirth,  
    nationality,  
    religion,  
    gender,  
    father_firstName,  
    father_middleName,  
    father_lastName,  
    father_occupation,  
    father_officePhoneNo,  
    mother_firstName,  
    mother_middleName,  
    mother_lastName,  
    mother_occupation,  
    mother_officePhoneNo,  
    father_mobileNo,  
    mother_mobileNo,  
    guardian_lastName,  
    guardian_firstName,  
    guardian_middleName,  
    guardian_occupation,  
    guardian_officePhoneNo,  
    guardian_mobileNo,  
    guardian_relationToStudent,  
    isFatherContactInCaseEmergency,  
    isMotherContactInCaseEmergency,  
    isGuardianContactInCaseEmergency,  
    schoolyear_id,  
    gradelevel_id, 
    schoolLastAttended, 
    schoolAddress, 
    room_or_houseNo, 
    street, 
    brgy_subd, 
    city, 
    province,
    paymentterm_id)
    
    VALUES(
    p_studentType,p_lastName,p_firstName,p_middleName,p_dateOfBirth,
    p_placeOfBirth, p_nationality,p_religion,p_gender,p_father_firstName,
    p_father_middleName,p_father_lastName,p_father_occupation,p_father_officePhoneNo,
    p_mother_firstName,p_mother_middleName,p_mother_lastName,p_mother_occupation,
    p_mother_officePhoneNo,p_father_mobileNo,p_mother_mobileNo,p_guardian_lastName,
    p_guardian_firstName,p_guardian_middleName,p_guardian_occupation,p_guardian_officePhoneNo,
    p_guardian_mobileNo,p_guardian_relationToStudent,p_isFatherContactInCaseEmergency,
    p_isMotherContactInCaseEmergency,p_isGuardianContactInCaseEmergency,p_schoolyear_id,
    p_gradelevel_id, p_schoolLastAttended, p_schoolAddress, p_roomOrHouseNo, 
    p_street, p_brgyOrSubd, p_city, p_province, p_paymentTermId );
    
    SELECT LAST_INSERT_ID() INTO var_registrationId;
    
    INSERT INTO registration_credentialspresented(registration_id, hasBirthCertificate, hasBaptismalCertificate, hasMedicalCertificate, hasIdPicture, hasReportCard, hasCertificateOfGoodMoral)
    VALUES(var_registrationId,p_hasBirthCertificate, p_hasBaptismalCertificate,p_hasMedicalCertificate,p_hasIdPicture,p_hasReportCard,p_hasCertificateOfGoodMoral);
    
    INSERT INTO registration_hd(registration_id, registeredBy_UserId, lastEditedBy_UserId, dateLastEdited)
    VALUES(var_registrationId,p_addedByUserId,p_addedByUserId,NOW());
    
    SET op_registrationId = var_registrationId;
    
    COMMIT;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `registrationExists` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `registrationExists`(aStudentId INT)
BEGIN

SELECT 
CASE WHEN COUNT(*) > 0 THEN TRUE
WHEN COUNT(*) <= 0 THEN FALSE
END AS registrationExists

FROM student_mt 
WHERE student_id = aStudentId;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `removeCredentialById` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `removeCredentialById`(aCredentialId INT)
BEGIN

DECLARE EXIT HANDLER FOR sqlexception
BEGIN
	ROLLBACK;
	RESIGNAL;
END;

START TRANSACTION;

DELETE FROM credential_requirements_lt WHERE credential_id >= aCredentialId;
DELETE FROM credentials_received_lt WHERE credential_id >= aCredentialId;
DELETE FROM credentials_mt WHERE credential_id >= aCredentialId;

COMMIT;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sampleStoredProc` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sampleStoredProc`()
BEGIN

-- SELECT * FROM
-- SELECT * FROM
-- SELECT * FROM
-- SELECT * FROM
-- SELECT * FROM
-- SELECT * FROM
-- SELECT * FROM-- SELECT * FROM
-- SELECT * FROM-- SELECT * FROM-- SELECT * FROM-- SELECT * FROM-- SELECT * FROM 

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `setAllStudentsInactive` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `setAllStudentsInactive`()
BEGIN

DECLARE EXIT HANDLER FOR sqlexception
	BEGIN
		ROLLBACK;
		RESIGNAL;
	END;

START TRANSACTION;

 
IF (  SELECT COUNT(sy.schoolyear_id) 
		FROM schoolyear_mt sy 
		WHERE CURDATE() >= sy.start_date AND 
		CURDATE() <= sy.end_date) = 0 
THEN 
		SELECT 'CURDATE() is not within any schoolyear'; 
        IF(SELECT COUNT(s.schoolyear_id)
			FROM schoolyear_mt s
			WHERE CURDATE() > s.end_date) > 0
		THEN
			UPDATE enrollment_student_lt SET isEarlyEnrollment = 0;
			UPDATE student_mt SET isActive = 0;
            SELECT 'CURDATE() greater than s.end_date';
		END IF;
		 
        IF  (SELECT COUNT(s.schoolyear_id)
			 FROM schoolyear_mt s
			 WHERE CURDATE() < s.start_date) > 0
        THEN 
			UPDATE student_mt SET isActive = 0;
            SELECT 'CURDATE() less than s.start_date';
		END IF;
    
END IF;


COMMIT;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `setCurrentSchoolYear` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `setCurrentSchoolYear`()
BEGIN

DECLARE aCurDateSyId INT;

DECLARE EXIT HANDLER FOR sqlexception
	BEGIN
		ROLLBACK;
		RESIGNAL;
	END;

START TRANSACTION;
	
    
	SELECT schoolyear_id INTO aCurDateSyId FROM schoolyear_mt
    WHERE curdate() >= start_date AND curdate() <= end_date;
    
    IF aCurDateSyId IS NOT NULL 
    THEN
		UPDATE schoolyear_mt SET isCurrentSchoolYear = 0 
        WHERE schoolyear_id != aCurDateSyId;
        
        UPDATE schoolyear_mt SET isActive = 0 
        WHERE schoolyear_id != aCurDateSyId; 
			
		UPDATE schoolyear_mt SET isCurrentSchoolYear = 1
		WHERE schoolyear_id = aCurDateSyId;
	ELSEIF aCurDateSyId IS NULL
    THEN
		SELECT 'CURRENT DATE is NOT part of any schoolyear';
        UPDATE schoolyear_mt SET isCurrentSchoolYear = 0;
	END IF;
    
COMMIT;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `setPaymentTermDownPayment` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `setPaymentTermDownPayment`(aPaymentTermId INT, aDownPaymentAmount DECIMAL, aSchoolYearId INT)
BEGIN
	DECLARE myPaymentTermDownPaymentId INT;
	DECLARE EXIT HANDLER FOR sqlexception
    BEGIN
		ROLLBACK;
        RESIGNAL;
    END;

	START transaction;
	INSERT INTO paymentterm_downpayment(paymentterm_id, downpayment)
	VALUES(aPaymentTermId, aDownPaymentAmount);
    SELECT LAST_INSERT_ID() INTO myPaymentTermDownPaymentId;
    
    INSERT INTO paymentterm_downpayment_schoolyear(paymentterm_downpayment_id, schoolyear_id)
    VALUES(myPaymentTermDownPaymentId, aSchoolYearId);
    
    COMMIT;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `tuitionFeeExists` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `tuitionFeeExists`(aStudentId INT, aSchoolYearId INT)
BEGIN
DECLARE rowCount INT;

SELECT COUNT(*) INTO rowCount FROM tuition_fee t 
WHERE student_id = aStudentId
AND schoolyear_id = aSchoolYearId;

IF rowCount > 0 THEN SELECT TRUE AS tuitionFeeExists;
ELSE SELECT FALSE AS tuitionFeeExists;
END IF;


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `updateAdmissionStatus` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `updateAdmissionStatus`(aStatus INT, aRegistrationId INT)
BEGIN
	UPDATE registration r SET r.isAdmissionComplete = aStatus
    WHERE r.id = aRegistrationId;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `updateCurriculumDetails` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `updateCurriculumDetails`(aEducationalStageId INT,p_curriculumDesc VARCHAR(100),
p_gradeLevelId INT, p_curriculumId INT, p_schoolYearId INT,p_editedByUserId INT)
BEGIN

DECLARE EXIT HANDLER FOR sqlexception
BEGIN
	ROLLBACK;
    SELECT 'Error occured' AS Message;
    RESIGNAL;
END;

START TRANSACTION;

UPDATE curriculum c
			SET 	c.educationalstage_id = aEducationalStageId, 
					c.description 	= p_curriculumDesc,
					c.gradeLevelId 	= p_gradeLevelId 
			WHERE 	c.id 			= p_curriculumId;
            
UPDATE curriculum_schoolyears cs
			SET		cs.schoolYearId = p_schoolYearId
            WHERE	cs.curriculumId = p_curriculumId;
            
UPDATE curriculum_hd SET editedBy_UserId 	= p_editedByUserId,
						 dateLastEdited 	= NOW()
			WHERE curriculumId = p_curriculumId;
            
COMMIT;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `updateCurriculumSubjects` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `updateCurriculumSubjects`(IN p_curriculumId int, IN p_subjectId INT, IN p_editedByUserId INT)
BEGIN

    DECLARE EXIT HANDLER FOR sqlexception
    BEGIN
		ROLLBACK;
        SELECT 'Error occured' AS Message;
        RESIGNAL;
    END;
	    
    
	START TRANSACTION;
    
		IF NOT EXISTS(SELECT * FROM curriculum_subjects WHERE subjectId = p_subjectId)
        THEN
			INSERT INTO curriculum_subjects
			(curriculumId,subjectId,addedBy_UserId)
				VALUES(p_curriculumId,p_subjectId,p_editedByUserId);
		END IF;
        
        UPDATE curriculum_hd 
			SET editedBy_UserId = p_editedByUserId,
				dateLastEdited = NOW()
			WHERE curriculumId = p_curriculumId ;
    
    
		COMMIT;
        SELECT 'successfully updated' AS result;
        
	
    
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `updateFaculty` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `updateFaculty`(	
	IN p_faculty_id int,
	IN p_fname varchar(45),
    IN p_lname varchar(45),
    IN p_mname varchar(45),
    IN p_civilStatus varchar(45),
    IN p_contact varchar(45),
    IN p_email varchar(45)
    
)
BEGIN
	UPDATE faculty_mt set firstName = p_fname, lastName = p_lname,
    middleName = p_mname,civilStatus = p_civilStatus,
    contact = p_contact,email = p_email
    WHERE faculty_id = p_faculty_id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `updateRegistrationDetails` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `updateRegistrationDetails`(
p_studentType VARCHAR(20), 
p_lastName VARCHAR(100), 
p_firstName VARCHAR(100), 
p_middleName VARCHAR(100), 
p_dateOfBirth DATE, 
p_placeOfBirth VARCHAR(100),
p_nationality VARCHAR(50), 
p_religion VARCHAR(50), 
p_gender INT, 
p_father_firstName VARCHAR(100),
p_father_middleName VARCHAR(100), 
p_father_lastName VARCHAR(100), 
p_father_occupation VARCHAR(100), 
p_father_officePhoneNo VARCHAR(100), 
p_mother_firstName VARCHAR(100), 
p_mother_middleName VARCHAR(100), 
p_mother_lastName VARCHAR(100), 
p_mother_occupation VARCHAR(100), 
p_mother_officePhoneNo VARCHAR(20), 
p_father_mobileNo VARCHAR(20), 
p_mother_mobileNo VARCHAR(20), 
p_guardian_lastName VARCHAR(100), 
p_guardian_firstName VARCHAR(100), 
p_guardian_middleName VARCHAR(100), 
p_guardian_occupation VARCHAR(100), 
p_guardian_officePhoneNo VARCHAR(50), 
p_guardian_mobileNo VARCHAR(50), 
p_guardian_relationToStudent VARCHAR(50), p_isFatherContactInCaseEmergency INT, 
p_isMotherContactInCaseEmergency INT, 
p_isGuardianContactInCaseEmergency INT, 
p_schoolyear_id INT, 
p_gradelevel_id INT,
p_schoolLastAttended VARCHAR(100),
p_schoolAddress VARCHAR(100),
p_lastEditedByUserId INT,
p_roomOrHouseNo VARCHAR(100),
p_street VARCHAR(100),
p_brgyOrSubd VARCHAR(100),
p_city VARCHAR(100),
p_province VARCHAR(100),
p_hasBirthCertificate BIT(1),
p_hasBaptismalCertificate BIT(1),
p_hasMedicalCertificate BIT(1),
p_hasIdPicture BIT(1),
p_hasReportCard BIT(1),
p_hasCertificateOfGoodMoral BIT(1),
p_paymentTermId INT,
p_registrationId INT)
BEGIN

	DECLARE var_registrationId INT;
	DECLARE EXIT HANDLER FOR sqlexception
	BEGIN
		ROLLBACK;
		RESIGNAL;
	END;
    
    START TRANSACTION;
    
    UPDATE registration
    
    SET 
    studentType = p_studentType, 
    lastName = p_lastName, 
    firstName = p_firstName, 
    middleName = p_middleName, 
    dateOfBirth = p_dateOfBirth, 
    placeOfBirth = p_placeOfBirth, 
    nationality = p_nationality, 
    religion = p_religion, 
    gender = p_gender, 
    father_firstName = p_father_firstName, 
    father_middleName = p_father_middleName, 
    father_lastName = p_father_lastName, 
    father_occupation = p_father_occupation, 
    father_officePhoneNo = p_father_officePhoneNo, 
    mother_firstName = p_mother_firstName, 
    mother_middleName = p_mother_middleName, 
    mother_lastName = p_mother_lastName, 
    mother_occupation = p_mother_occupation, 
    mother_officePhoneNo = p_mother_officePhoneNo, 
    father_mobileNo = p_father_mobileNo, 
    mother_mobileNo = p_mother_mobileNo, 
    guardian_lastName = p_guardian_lastName, 
    guardian_firstName = p_guardian_firstName, 
    guardian_middleName = p_guardian_middleName, 
    guardian_occupation = p_guardian_occupation, 
    guardian_officePhoneNo = p_guardian_officePhoneNo, 
    guardian_mobileNo = p_guardian_mobileNo, 
    guardian_relationToStudent = p_guardian_relationToStudent, 
    isFatherContactInCaseEmergency = p_isFatherContactInCaseEmergency, 
    isMotherContactInCaseEmergency = p_isMotherContactInCaseEmergency, 
    isGuardianContactInCaseEmergency = p_isGuardianContactInCaseEmergency, 
    schoolyear_id = p_schoolyear_id, 
    gradelevel_id = p_gradelevel_id,
    schoolLastAttended = p_schoolLastAttended,
    schoolAddress = p_schoolAddress,
    room_or_houseNo = p_roomOrHouseNo,
    street = p_street,
    brgy_subd = p_brgyOrSubd,
    city = p_city,
    province = p_province,
    paymentterm_id = p_paymentTermId
    
    WHERE id = p_registrationId;
    
    UPDATE registration_credentialspresented
    SET hasBirthCertificate = p_hasBirthCertificate, 
    hasBaptismalCertificate = p_hasBaptismalCertificate, 
    hasMedicalCertificate = p_hasMedicalCertificate, 
    hasIdPicture = p_hasIdPicture, 
    hasReportCard = p_hasReportCard, 
    hasCertificateOfGoodMoral = p_hasCertificateOfGoodMoral
    WHERE registration_id = p_registrationId;
    
    
    UPDATE registration_hd SET lastEditedBy_UserId = p_lastEditedByUserId, dateLastEdited = NOW()
    WHERE registration_id = p_registrationId;
    
    COMMIT;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `updateSubjectAndGradeLevel` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `updateSubjectAndGradeLevel`(OUT pOUT_gradelevel_mt_gradeLevel INT, IN pIN_gradeLevel INT, IN pIN_gradeLevelId INT, IN pIN_subjCode VARCHAR(250), IN pIN_subjTitle VARCHAR(250), IN pIN_subjDescription VARCHAR(250), IN pIN_subjId INT)
BEGIN
	
    START TRANSACTION;
    
    SELECT gradelevel_id INTO pOUT_gradelevel_mt_gradeLevel
    FROM gradelevel_mt WHERE grade_level = pIN_gradeLevel;

    UPDATE subject_gradelevel_lt
	SET subject_gradelevel_lt.gradelevel_id = pOUT_gradelevel_mt_gradeLevel
	WHERE subject_gradelevel_lt.gradelevel_id = pIN_gradeLevelId;
    
    UPDATE subject_mt
    SET code = pIN_subjCode, title = pIN_subjTitle, description = pIN_subjDescription
	WHERE subject_id = pIN_subjId;
    
    COMMIT;
    
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `updateSubjectDetails` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `updateSubjectDetails`(p_subjCode VARCHAR(50), p_subjName VARCHAR(100), p_subjUnits INT,p_subjDesc VARCHAR(150), p_subjId INT, p_subjGradeLevelId INT, p_subjSchoolYearId INT, p_editedByUserId INT)
BEGIN

DECLARE EXIT HANDLER FOR sqlexception
BEGIN
	ROLLBACK;
	RESIGNAL;
    SELECT 'encountered error.\n update failed.' AS msg;
END;

START TRANSACTION;

UPDATE subjects s 
	SET s.`code` 		= p_subjCode,
		s.`name` 		= p_subjName,
        s.units	 		= p_subjUnits,
        s.description 	= p_subjDesc
	WHERE s.id 			= p_subjId;
    
UPDATE subjects_gradelevel sgl
	SET sgl.gradeLevelId	=	p_subjGradeLevelId,
		sgl.schoolYearId	=	p_subjSchoolYearId
	WHERE sgl.subjectId		=	p_subjId;
    
UPDATE subjects_hd	shd
	SET	shd.editedBy_UserId	=	p_editedByUserId,
		shd.dateEdited		=	NOW()
	WHERE shd.subjectId	= p_subjId;


		COMMIT;
        SELECT 'successfully updated' AS result;
        


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-30 21:12:43
