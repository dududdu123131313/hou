-- MySQL dump 10.13  Distrib 8.0.39, for Win64 (x86_64)
--
-- Host: localhost    Database: huawei
-- ------------------------------------------------------
-- Server version	8.0.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `charge`
--

DROP TABLE IF EXISTS `charge`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `charge` (
                          `name` varchar(20) NOT NULL,
                          `department` varchar(20) NOT NULL,
                          `outpatientType` varchar(20) NOT NULL,
                          `cost` float NOT NULL,
                          PRIMARY KEY (`name`),
                          CONSTRAINT `charge_doctors_name_fk` FOREIGN KEY (`name`) REFERENCES `doctors` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `charge`
--

LOCK TABLES `charge` WRITE;
/*!40000 ALTER TABLE `charge` DISABLE KEYS */;
INSERT INTO `charge` VALUES ('何婷','康复科','专家门诊',50),
                            ('刘悦','普外科','普通门诊',20),
                            ('吕辉','中医科','普通门诊',20),
                            ('吴迪','眼科','普通门诊',20),
                            ('周琳','口腔科','普通门诊',20),
                            ('孙强','皮肤科','专家门诊',50),
                            ('张峰','骨科','专家门诊',50),
                            ('徐阳','风湿免疫科','普通门诊',20),
                            ('朱悦','肿瘤科','专家门诊',50),
                            ('李华','心内科','专家门诊',50),
                            ('林宇','传染科','普通门诊',20),
                            ('沈静','妇产科','普通门诊',20),
                            ('王丽','呼吸内科','普通门诊',20),
                            ('蒋超','儿科','专家门诊',50),
                            ('许鹏','血液科','普通门诊',20),
                            ('赵敏','泌尿外科','普通门诊',20),
                            ('郑浩','耳鼻喉科','专家门诊',50),
                            ('陈杰','神经内科','专家门诊',50),
                            ('韩磊','急诊科','专家门诊',50),
                            ('黄鑫','内分泌科','专家门诊',50);
/*!40000 ALTER TABLE `charge` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chargerecords`
--

DROP TABLE IF EXISTS `chargerecords`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chargerecords` (
                                 `username` varchar(20) NOT NULL,
                                 `user_phoneNumber` char(11) NOT NULL,
                                 `user_age` int DEFAULT NULL,
                                 `visittime` datetime NOT NULL,
                                 `doctor_department` varchar(20) NOT NULL,
                                 `doctor_name` varchar(20) NOT NULL,
                                 `outpatientType` varchar(20) NOT NULL,
                                 `registrationTime` datetime NOT NULL,
                                 `medicalNumber` int NOT NULL,
                                 `reservationConfirmation` char(10) NOT NULL,
                                 `chargecost` float NOT NULL,
                                 `paymentTime` datetime NOT NULL,
                                 KEY `chargerecords_registrationlist_name_fk` (`username`),
                                 KEY `chargerecords_charge_name_fk` (`doctor_name`),
                                 CONSTRAINT `chargerecords_charge_name_fk` FOREIGN KEY (`doctor_name`) REFERENCES `charge` (`name`),
                                 CONSTRAINT `chargerecords_registrationlist_name_fk` FOREIGN KEY (`username`) REFERENCES `registrationlist` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chargerecords`
--

LOCK TABLES `chargerecords` WRITE;
/*!40000 ALTER TABLE `chargerecords` DISABLE KEYS */;
/*!40000 ALTER TABLE `chargerecords` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctors`
--

DROP TABLE IF EXISTS `doctors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctors` (
                           `name` varchar(20) NOT NULL,
                           `Department` varchar(20) NOT NULL,
                           `outpatientType` varchar(20) NOT NULL,
                           `totalNumber` int DEFAULT NULL,
                           `remainingNumbers` int DEFAULT NULL,
                           `visitTime` datetime DEFAULT NULL,
                           PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctors`
--

LOCK TABLES `doctors` WRITE;
/*!40000 ALTER TABLE `doctors` DISABLE KEYS */;
INSERT INTO `doctors` VALUES ('何婷','康复科','专家门诊',28,13,'2024-12-15 13:30:00'),
                             ('刘悦','普外科','普通门诊',35,15,'2024-12-04 15:00:00'),
                             ('吕辉','中医科','普通门诊',36,22,'2024-12-16 14:30:00'),
                             ('吴迪','眼科','普通门诊',36,20,'2024-12-08 11:00:00'),
                             ('周琳','口腔科','普通门诊',30,16,'2024-12-10 14:30:00'),
                             ('孙强','皮肤科','专家门诊',22,6,'2024-12-07 10:30:00'),
                             ('张峰','骨科','专家门诊',20,5,'2024-12-03 14:00:00'),
                             ('徐阳','风湿免疫科','普通门诊',34,14,'2024-12-12 09:30:00'),
                             ('朱悦','肿瘤科','专家门诊',20,7,'2024-12-13 10:30:00'),
                             ('李华','心内科','专家门诊',30,10,'2024-12-01 09:00:00'),
                             ('林宇','传染科','普通门诊',32,15,'2024-12-20 11:30:00'),
                             ('沈静','妇产科','普通门诊',30,18,'2024-12-18 09:30:00'),
                             ('王丽','呼吸内科','普通门诊',25,8,'2024-12-02 10:00:00'),
                             ('蒋超','儿科','专家门诊',22,8,'2024-12-17 08:30:00'),
                             ('许鹏','血液科','普通门诊',32,17,'2024-12-14 11:30:00'),
                             ('赵敏','泌尿外科','普通门诊',32,18,'2024-12-06 09:30:00'),
                             ('郑浩','耳鼻喉科','专家门诊',24,10,'2024-12-09 13:30:00'),
                             ('陈杰','神经内科','专家门诊',28,12,'2024-12-05 08:30:00'),
                             ('韩磊','急诊科','专家门诊',24,10,'2024-12-19 10:30:00'),
                             ('黄鑫','内分泌科','专家门诊',26,9,'2024-12-11 08:30:00');
/*!40000 ALTER TABLE `doctors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `identification`
--

DROP TABLE IF EXISTS `identification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `identification` (
                                  `name` varchar(50) NOT NULL,
                                  `id` char(18) NOT NULL,
                                  `sex` varchar(10) NOT NULL,
                                  `age` int NOT NULL,
                                  `user_name` char(20) NOT NULL,
                                  PRIMARY KEY (`name`),
                                  KEY `identification_user_name_fk` (`user_name`),
                                  CONSTRAINT `identification_user_name_fk` FOREIGN KEY (`user_name`) REFERENCES `user` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `identification`
--

LOCK TABLES `identification` WRITE;
/*!40000 ALTER TABLE `identification` DISABLE KEYS */;
/*!40000 ALTER TABLE `identification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `register`
--

DROP TABLE IF EXISTS `register`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `register` (
                            `patient_Name` varchar(20) NOT NULL,
                            `patient_phonenumber` char(11) NOT NULL,
                            `visitTime` datetime NOT NULL,
                            `doctor_department` varchar(20) NOT NULL,
                            `doctor_name` varchar(20) NOT NULL,
                            `outpatientType` varchar(20) NOT NULL,
                            `registrationTime` datetime NOT NULL,
                            `medicalNumber` int NOT NULL,
                            PRIMARY KEY (`patient_Name`),
                            KEY `register_doctors_name_fk` (`doctor_name`),
                            CONSTRAINT `register_doctors_name_fk` FOREIGN KEY (`doctor_name`) REFERENCES `doctors` (`name`),
                            CONSTRAINT `register_user_name_fk` FOREIGN KEY (`patient_Name`) REFERENCES `user` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `register`
--

LOCK TABLES `register` WRITE;
/*!40000 ALTER TABLE `register` DISABLE KEYS */;
/*!40000 ALTER TABLE `register` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registertoday`
--

DROP TABLE IF EXISTS `registertoday`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registertoday` (
                                 `patient_Name` varchar(20) NOT NULL,
                                 `patient_phoneNumber` varchar(20) DEFAULT NULL,
                                 `visitTime` datetime NOT NULL,
                                 `doctor_name` varchar(20) NOT NULL,
                                 `doctor_department` varchar(20) NOT NULL,
                                 `outpatientType` varchar(20) NOT NULL,
                                 `registrationTime` datetime NOT NULL,
                                 `medicalNumber` datetime NOT NULL,
                                 PRIMARY KEY (`patient_Name`),
                                 KEY `registertoday_doctors_name_fk` (`doctor_name`),
                                 CONSTRAINT `registertoday_doctors_name_fk` FOREIGN KEY (`doctor_name`) REFERENCES `doctors` (`name`),
                                 CONSTRAINT `registertoday_user_name_fk` FOREIGN KEY (`patient_Name`) REFERENCES `user` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registertoday`
--

LOCK TABLES `registertoday` WRITE;
/*!40000 ALTER TABLE `registertoday` DISABLE KEYS */;
/*!40000 ALTER TABLE `registertoday` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registrationlist`
--

DROP TABLE IF EXISTS `registrationlist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registrationlist` (
                                    `name` varchar(20) NOT NULL,
                                    `phoneNumber` char(11) NOT NULL,
                                    `age` int NOT NULL,
                                    `visitTime` datetime NOT NULL,
                                    `doctor_name` varchar(20) NOT NULL,
                                    `department` varchar(20) NOT NULL,
                                    `outpatientType` varchar(20) NOT NULL,
                                    `registrationTime` datetime NOT NULL,
                                    `medicalTime` char(10) NOT NULL,
                                    `reservationConfirmation` char(10) NOT NULL,
                                    PRIMARY KEY (`name`),
                                    CONSTRAINT `registrationlist_register_patient_Name_fk` FOREIGN KEY (`name`) REFERENCES `register` (`patient_Name`),
                                    CONSTRAINT `registrationlist_registertoday_patient_Name_fk` FOREIGN KEY (`name`) REFERENCES `registertoday` (`patient_Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registrationlist`
--

LOCK TABLES `registrationlist` WRITE;
/*!40000 ALTER TABLE `registrationlist` DISABLE KEYS */;
/*!40000 ALTER TABLE `registrationlist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
                        `accountName` char(20) NOT NULL,
                        `passWord` varchar(50) NOT NULL,
                        `creatTime` varchar(50) DEFAULT NULL,
                        `phoneNumber` char(11) DEFAULT NULL,
                        `name` varchar(50) NOT NULL,
                        `id` char(18) DEFAULT NULL,
                        `age` int DEFAULT NULL,
                        `sex` varchar(10) DEFAULT NULL,
                        PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-11-25 19:54:38
