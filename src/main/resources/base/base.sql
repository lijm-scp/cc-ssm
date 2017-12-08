-- MySQL dump 10.13  Distrib 5.7.20, for macos10.12 (x86_64)
--
-- Host: localhost    Database: test_mybatis
-- ------------------------------------------------------
-- Server version	5.7.20

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
-- Table structure for table `t_lecture`
--

DROP TABLE IF EXISTS `t_lecture`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_lecture` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `lecture_name` varchar(100) COLLATE utf8_bin NOT NULL,
  `note` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_lecture`
--

LOCK TABLES `t_lecture` WRITE;
/*!40000 ALTER TABLE `t_lecture` DISABLE KEYS */;
INSERT INTO `t_lecture` VALUES (1,'数学',NULL),(2,'英语',NULL),(3,'语文',NULL);
/*!40000 ALTER TABLE `t_lecture` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_student`
--

DROP TABLE IF EXISTS `t_student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_student` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) COLLATE utf8_bin NOT NULL,
  `sex` varchar(100) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_student`
--

LOCK TABLES `t_student` WRITE;
/*!40000 ALTER TABLE `t_student` DISABLE KEYS */;
INSERT INTO `t_student` VALUES (1,'wyy','0');
/*!40000 ALTER TABLE `t_student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_student_lecture`
--

DROP TABLE IF EXISTS `t_student_lecture`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_student_lecture` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `student_id` bigint(11) DEFAULT NULL,
  `lecture_id` bigint(11) DEFAULT NULL,
  `grade` bigint(100) NOT NULL,
  `note` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_student_lecture`
--

LOCK TABLES `t_student_lecture` WRITE;
/*!40000 ALTER TABLE `t_student_lecture` DISABLE KEYS */;
INSERT INTO `t_student_lecture` VALUES (1,1,1,99,'A'),(2,1,2,98,'A'),(3,1,3,88,'B');
/*!40000 ALTER TABLE `t_student_lecture` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_student_selfcard`
--

DROP TABLE IF EXISTS `t_student_selfcard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_student_selfcard` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `student_id` bigint(20) NOT NULL,
  `note` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_student_selfcard`
--

LOCK TABLES `t_student_selfcard` WRITE;
/*!40000 ALTER TABLE `t_student_selfcard` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_student_selfcard` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `test_role`
--

DROP TABLE IF EXISTS `test_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `test_role` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(1024) COLLATE utf8_bin NOT NULL,
  `note` varchar(100) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test_role`
--

LOCK TABLES `test_role` WRITE;
/*!40000 ALTER TABLE `test_role` DISABLE KEYS */;
INSERT INTO `test_role` VALUES (7,'abcddddd','ddaafff');
/*!40000 ALTER TABLE `test_role` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-08 18:52:04
