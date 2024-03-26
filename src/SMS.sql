-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: salonmanagementsystem
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `appointmentdetails`
--

DROP TABLE IF EXISTS appointmentdetails;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE appointmentdetails (
  appointment_id varchar(10) NOT NULL,
  c_name varchar(255) DEFAULT NULL,
  c_nic varchar(255) DEFAULT NULL,
  gender varchar(255) DEFAULT NULL,
  c_mobile bigint DEFAULT NULL,
  reason varchar(255) DEFAULT NULL,
  service_cost int DEFAULT NULL,
  PRIMARY KEY (appointment_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appointmentdetails`
--

LOCK TABLES appointmentdetails WRITE;
/*!40000 ALTER TABLE appointmentdetails DISABLE KEYS */;
INSERT INTO appointmentdetails VALUES ('678930','Kavindu Jayasena','200145678930','Male',771339233,'Beard Shave,Hair Style',1150),('800066','Purna Anupama','200230800066','Male',740339157,'Hair Dye,Hair Style,Hair Colour',1750);
/*!40000 ALTER TABLE appointmentdetails ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `assignments`
--

DROP TABLE IF EXISTS assignments;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE assignments (
  record_id int NOT NULL AUTO_INCREMENT,
  SM_id varchar(10) DEFAULT NULL,
  Appointment_id varchar(10) DEFAULT NULL,
  `time` varchar(50) DEFAULT NULL,
  `date` varchar(200) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (record_id),
  KEY SM_id (SM_id),
  KEY Appointment_id (Appointment_id),
  CONSTRAINT assignments_ibfk_1 FOREIGN KEY (SM_id) REFERENCES staffdetails (sm_id),
  CONSTRAINT assignments_ibfk_2 FOREIGN KEY (Appointment_id) REFERENCES appointmentdetails (appointment_id)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assignments`
--

LOCK TABLES assignments WRITE;
/*!40000 ALTER TABLE assignments DISABLE KEYS */;
INSERT INTO assignments VALUES (39,'600077','800066','00:43:56','2024-03-11','Handled');
/*!40000 ALTER TABLE assignments ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS login;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE login (
  username varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES login WRITE;
/*!40000 ALTER TABLE login DISABLE KEYS */;
INSERT INTO login VALUES ('user1','pass'),('user2','00066');
/*!40000 ALTER TABLE login ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staffdetails`
--

DROP TABLE IF EXISTS staffdetails;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE staffdetails (
  sm_id varchar(10) NOT NULL,
  sm_name varchar(255) DEFAULT NULL,
  sm_mobile varchar(255) DEFAULT NULL,
  sm_nic varchar(255) DEFAULT NULL,
  gender varchar(255) DEFAULT NULL,
  sm_skills varchar(255) DEFAULT NULL,
  Availability_Status varchar(255) NOT NULL,
  PRIMARY KEY (sm_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staffdetails`
--

LOCK TABLES staffdetails WRITE;
/*!40000 ALTER TABLE staffdetails DISABLE KEYS */;
INSERT INTO staffdetails VALUES ('600077','Sanduni Nisansala','0771630612','200345600077','Female','Hair Style,Hair Colour,Hair Dye','Available'),('677732','Chanupa Deshitha','0740339155','200245677732','Male','Hair Colour,Hair Dye','Unavailable');
/*!40000 ALTER TABLE staffdetails ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-26  0:07:48
