-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: kodilla_course
-- ------------------------------------------------------
-- Server version	5.7.20-log

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
-- Table structure for table `rents_aud`
--

DROP TABLE IF EXISTS `rents_aud`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rents_aud` (
  `event_id` int(11) NOT NULL AUTO_INCREMENT,
  `event_date` datetime NOT NULL,
  `event_type` varchar(10) DEFAULT NULL,
  `rent_id` int(11) NOT NULL,
  `old_book_id` int(11) DEFAULT NULL,
  `new_book_id` int(11) DEFAULT NULL,
  `old_reader_id` int(11) DEFAULT NULL,
  `new_reader_id` int(11) DEFAULT NULL,
  `old_rent_date` datetime DEFAULT NULL,
  `new_rent_date` datetime DEFAULT NULL,
  `old_return_date` datetime DEFAULT NULL,
  `new_return_date` datetime DEFAULT NULL,
  PRIMARY KEY (`event_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rents_aud`
--

LOCK TABLES `rents_aud` WRITE;
/*!40000 ALTER TABLE `rents_aud` DISABLE KEYS */;
INSERT INTO `rents_aud` VALUES (1,'2018-01-03 22:03:22','insert',14,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,'2018-01-03 22:09:54','insert',15,NULL,2,NULL,4,NULL,'2018-01-10 00:00:00',NULL,NULL),(3,'2018-01-03 22:18:26','delete',15,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4,'2018-01-03 22:29:56','update',1,1,1,1,1,'2017-12-18 00:00:00','2017-12-18 00:00:00',NULL,'2018-01-03 00:00:00');
/*!40000 ALTER TABLE `rents_aud` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-05  0:10:04
