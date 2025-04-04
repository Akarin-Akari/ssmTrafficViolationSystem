-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssm4ir8r
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Table structure for table `cheliangleixing`
--

DROP TABLE IF EXISTS `cheliangleixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cheliangleixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `cheliangleixing` varchar(200) DEFAULT NULL COMMENT '车辆类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='车辆类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cheliangleixing`
--

LOCK TABLES `cheliangleixing` WRITE;
/*!40000 ALTER TABLE `cheliangleixing` DISABLE KEYS */;
INSERT INTO `cheliangleixing` VALUES (51,'2021-04-12 08:49:21','汽车'),(52,'2021-04-12 08:49:21','车辆类型2'),(53,'2021-04-12 08:49:21','车辆类型3'),(54,'2021-04-12 08:49:21','车辆类型4'),(55,'2021-04-12 08:49:21','车辆类型5'),(56,'2021-04-12 08:49:21','车辆类型6');
/*!40000 ALTER TABLE `cheliangleixing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chepaizhonglei`
--

DROP TABLE IF EXISTS `chepaizhonglei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chepaizhonglei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `chepaizhonglei` varchar(200) DEFAULT NULL COMMENT '车牌种类',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='车牌种类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chepaizhonglei`
--

LOCK TABLES `chepaizhonglei` WRITE;
/*!40000 ALTER TABLE `chepaizhonglei` DISABLE KEYS */;
INSERT INTO `chepaizhonglei` VALUES (81,'2021-04-12 08:49:21','黄牌'),(82,'2021-04-12 08:49:21','车牌种类2'),(83,'2021-04-12 08:49:21','车牌种类3'),(84,'2021-04-12 08:49:21','车牌种类4'),(85,'2021-04-12 08:49:21','车牌种类5'),(86,'2021-04-12 08:49:21','车牌种类6');
/*!40000 ALTER TABLE `chepaizhonglei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chufafangshi`
--

DROP TABLE IF EXISTS `chufafangshi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chufafangshi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `chufafangshi` varchar(200) DEFAULT NULL COMMENT '处罚方式',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8 COMMENT='处罚方式';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chufafangshi`
--

LOCK TABLES `chufafangshi` WRITE;
/*!40000 ALTER TABLE `chufafangshi` DISABLE KEYS */;
INSERT INTO `chufafangshi` VALUES (111,'2021-04-12 08:49:21','处罚方式1'),(112,'2021-04-12 08:49:21','处罚方式2'),(113,'2021-04-12 08:49:21','处罚方式3'),(114,'2021-04-12 08:49:21','处罚方式4'),(115,'2021-04-12 08:49:21','处罚方式5'),(116,'2021-04-12 08:49:21','处罚方式6');
/*!40000 ALTER TABLE `chufafangshi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chufajuedingshu`
--

DROP TABLE IF EXISTS `chufajuedingshu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chufajuedingshu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `chufajuedingshu` varchar(200) DEFAULT NULL COMMENT '处罚决定书',
  `chuliren` varchar(200) DEFAULT NULL COMMENT '处理人',
  `beifazhe` varchar(200) DEFAULT NULL COMMENT '被罚者',
  `chufaneirong` longtext COMMENT '处罚内容',
  `chufafangshi` varchar(200) DEFAULT NULL COMMENT '处罚方式',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='处罚决定书';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chufajuedingshu`
--

LOCK TABLES `chufajuedingshu` WRITE;
/*!40000 ALTER TABLE `chufajuedingshu` DISABLE KEYS */;
INSERT INTO `chufajuedingshu` VALUES (91,'2021-04-12 08:49:21','http://localhost:8080/ssm4ir8r/upload/1618217985880.jpg','处理人1','被罚者1','<p>处罚内容1</p>','处罚方式1'),(92,'2021-04-12 08:49:21','','处理人2','被罚者2','处罚内容2','处罚方式2'),(93,'2021-04-12 08:49:21','','处理人3','被罚者3','处罚内容3','处罚方式3'),(94,'2021-04-12 08:49:21','','处理人4','被罚者4','处罚内容4','处罚方式4'),(95,'2021-04-12 08:49:21','','处理人5','被罚者5','处罚内容5','处罚方式5'),(96,'2021-04-12 08:49:21','','处理人6','被罚者6','处罚内容6','处罚方式6');
/*!40000 ALTER TABLE `chufajuedingshu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/ssm4ir8r/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssm4ir8r/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssm4ir8r/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `daduiguanli`
--

DROP TABLE IF EXISTS `daduiguanli`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `daduiguanli` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `daduiduiming` varchar(200) DEFAULT NULL COMMENT '大队队名',
  `zhiduizhaopian` varchar(200) DEFAULT NULL COMMENT '支队照片',
  `daduididian` varchar(200) DEFAULT NULL COMMENT '大队地点',
  `daduiduizhang` varchar(200) DEFAULT NULL COMMENT '大队队长',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='大队管理';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `daduiguanli`
--

LOCK TABLES `daduiguanli` WRITE;
/*!40000 ALTER TABLE `daduiguanli` DISABLE KEYS */;
INSERT INTO `daduiguanli` VALUES (71,'2021-04-12 08:49:21','大队队名1','http://localhost:8080/ssm4ir8r/upload/daduiguanli_zhiduizhaopian1.jpg','大队地点1','大队队长1','联系电话1'),(72,'2021-04-12 08:49:21','大队队名2','http://localhost:8080/ssm4ir8r/upload/daduiguanli_zhiduizhaopian2.jpg','大队地点2','大队队长2','联系电话2'),(73,'2021-04-12 08:49:21','大队队名3','http://localhost:8080/ssm4ir8r/upload/daduiguanli_zhiduizhaopian3.jpg','大队地点3','大队队长3','联系电话3'),(74,'2021-04-12 08:49:21','大队队名4','http://localhost:8080/ssm4ir8r/upload/daduiguanli_zhiduizhaopian4.jpg','大队地点4','大队队长4','联系电话4'),(75,'2021-04-12 08:49:21','大队队名5','http://localhost:8080/ssm4ir8r/upload/daduiguanli_zhiduizhaopian5.jpg','大队地点5','大队队长5','联系电话5'),(76,'2021-04-12 08:49:21','大队队名6','http://localhost:8080/ssm4ir8r/upload/daduiguanli_zhiduizhaopian6.jpg','大队地点6','大队队长6','联系电话6');
/*!40000 ALTER TABLE `daduiguanli` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kakoudianziweizhangxinxiguanli`
--

DROP TABLE IF EXISTS `kakoudianziweizhangxinxiguanli`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kakoudianziweizhangxinxiguanli` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `weizhangleixing` varchar(200) DEFAULT NULL COMMENT '违章类型',
  `weizhangcheliang` varchar(200) DEFAULT NULL COMMENT '违章车辆',
  `chepaizhonglei` varchar(200) DEFAULT NULL COMMENT '车牌种类',
  `weizhangchepaihao` varchar(200) DEFAULT NULL COMMENT '违章车牌号',
  `xingshifangxiang` varchar(200) DEFAULT NULL COMMENT '行驶方向',
  `chufafangshi` varchar(200) DEFAULT NULL COMMENT '处罚方式',
  `didianxinxi` varchar(200) DEFAULT NULL COMMENT '地点信息',
  `chuliren` varchar(200) DEFAULT NULL COMMENT '处理人',
  `weizhangren` varchar(200) DEFAULT NULL COMMENT '违章人',
  `weifashijian` datetime DEFAULT NULL COMMENT '违法时间',
  `weifashipin` varchar(200) DEFAULT NULL COMMENT '违法视频',
  `weizhangtupian` varchar(200) DEFAULT NULL COMMENT '违章图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='卡口电子违章信息管理';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kakoudianziweizhangxinxiguanli`
--

LOCK TABLES `kakoudianziweizhangxinxiguanli` WRITE;
/*!40000 ALTER TABLE `kakoudianziweizhangxinxiguanli` DISABLE KEYS */;
INSERT INTO `kakoudianziweizhangxinxiguanli` VALUES (31,'2021-04-12 08:49:21','闯红灯','违章车辆1','车牌种类1','违章车牌号1','行驶方向1','处罚方式1','地点信息1','处理人1','违章人1','2021-04-12 16:49:21','','http://localhost:8080/ssm4ir8r/upload/kakoudianziweizhangxinxiguanli_weizhangtupian1.jpg'),(32,'2021-04-12 08:49:21','闯红灯','汽车','黄牌','11111','行驶方向1','处罚方式1','广东省','处理人2','违章人2','2021-04-12 16:49:21','','http://localhost:8080/ssm4ir8r/upload/kakoudianziweizhangxinxiguanli_weizhangtupian2.jpg'),(33,'2021-04-12 08:49:21','违章类型3','违章车辆3','车牌种类3','违章车牌号3','行驶方向3','处罚方式3','地点信息3','处理人3','违章人3','2021-04-12 16:49:21','','http://localhost:8080/ssm4ir8r/upload/kakoudianziweizhangxinxiguanli_weizhangtupian3.jpg'),(34,'2021-04-12 08:49:21','违章类型4','违章车辆4','车牌种类4','违章车牌号4','行驶方向4','处罚方式4','地点信息4','处理人4','违章人4','2021-04-12 16:49:21','','http://localhost:8080/ssm4ir8r/upload/kakoudianziweizhangxinxiguanli_weizhangtupian4.jpg'),(35,'2021-04-12 08:49:21','违章类型5','违章车辆5','车牌种类5','违章车牌号5','行驶方向5','处罚方式5','地点信息5','处理人5','违章人5','2021-04-12 16:49:21','','http://localhost:8080/ssm4ir8r/upload/kakoudianziweizhangxinxiguanli_weizhangtupian5.jpg'),(36,'2021-04-12 08:49:21','违章类型6','违章车辆6','车牌种类6','违章车牌号6','行驶方向3','处罚方式6','地点信息6','李四','张三','2021-04-12 16:49:21','','http://localhost:8080/ssm4ir8r/upload/1618217722101.jpg');
/*!40000 ALTER TABLE `kakoudianziweizhangxinxiguanli` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8 COMMENT='公告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (131,'2021-04-12 08:49:21','标题1','简介1','http://localhost:8080/ssm4ir8r/upload/news_picture1.jpg','内容1'),(132,'2021-04-12 08:49:21','标题2','简介2','http://localhost:8080/ssm4ir8r/upload/news_picture2.jpg','内容2'),(133,'2021-04-12 08:49:21','标题3','简介3','http://localhost:8080/ssm4ir8r/upload/news_picture3.jpg','内容3'),(134,'2021-04-12 08:49:21','标题4','简介4','http://localhost:8080/ssm4ir8r/upload/news_picture4.jpg','内容4'),(135,'2021-04-12 08:49:21','标题5','简介5','http://localhost:8080/ssm4ir8r/upload/news_picture5.jpg','内容5'),(136,'2021-04-12 08:49:21','标题6','简介6','http://localhost:8080/ssm4ir8r/upload/1618217758234.jpg','<p>内容6</p>');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1618217476632,'1','yonghu','用户','q725y8fu28y5bl54crbymllormllm03i','2021-04-12 08:51:24','2021-04-12 10:01:12'),(2,1,'abo','users','管理员','r8higq0xpjaa13u95gqvtbrf5novt9co','2021-04-12 08:56:32','2021-04-12 09:56:32');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-04-12 08:49:21');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `weizhangxingwei`
--

DROP TABLE IF EXISTS `weizhangxingwei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `weizhangxingwei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `weizhangxingwei` varchar(200) DEFAULT NULL COMMENT '违章行为',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='违章行为';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `weizhangxingwei`
--

LOCK TABLES `weizhangxingwei` WRITE;
/*!40000 ALTER TABLE `weizhangxingwei` DISABLE KEYS */;
INSERT INTO `weizhangxingwei` VALUES (41,'2021-04-12 08:49:21','闯红灯'),(42,'2021-04-12 08:49:21','违章行为2'),(43,'2021-04-12 08:49:21','违章行为3'),(44,'2021-04-12 08:49:21','违章行为4'),(45,'2021-04-12 08:49:21','违章行为5'),(46,'2021-04-12 08:49:21','违章行为6');
/*!40000 ALTER TABLE `weizhangxingwei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xingshifangxiang`
--

DROP TABLE IF EXISTS `xingshifangxiang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xingshifangxiang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xingshifangxiang` varchar(200) DEFAULT NULL COMMENT '行驶方向',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8 COMMENT='行驶方向';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xingshifangxiang`
--

LOCK TABLES `xingshifangxiang` WRITE;
/*!40000 ALTER TABLE `xingshifangxiang` DISABLE KEYS */;
INSERT INTO `xingshifangxiang` VALUES (121,'2021-04-12 08:49:21','行驶方向1'),(122,'2021-04-12 08:49:21','行驶方向2'),(123,'2021-04-12 08:49:21','行驶方向3'),(124,'2021-04-12 08:49:21','行驶方向4'),(125,'2021-04-12 08:49:21','行驶方向5'),(126,'2021-04-12 08:49:21','行驶方向6');
/*!40000 ALTER TABLE `xingshifangxiang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xingzhengquhua`
--

DROP TABLE IF EXISTS `xingzhengquhua`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xingzhengquhua` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xingzhengquhua` varchar(200) DEFAULT NULL COMMENT '行政区划',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='行政区划';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xingzhengquhua`
--

LOCK TABLES `xingzhengquhua` WRITE;
/*!40000 ALTER TABLE `xingzhengquhua` DISABLE KEYS */;
INSERT INTO `xingzhengquhua` VALUES (101,'2021-04-12 08:49:21','广东省'),(102,'2021-04-12 08:49:21','行政区划2'),(103,'2021-04-12 08:49:21','行政区划3'),(104,'2021-04-12 08:49:21','行政区划4'),(105,'2021-04-12 08:49:21','行政区划5'),(106,'2021-04-12 08:49:21','行政区划6');
/*!40000 ALTER TABLE `xingzhengquhua` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yidongdianziweizhangxinxiguanli`
--

DROP TABLE IF EXISTS `yidongdianziweizhangxinxiguanli`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yidongdianziweizhangxinxiguanli` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `weizhangxingwei` varchar(200) DEFAULT NULL COMMENT '违章行为',
  `weizhangcheliangleixing` varchar(200) DEFAULT NULL COMMENT '违章车辆类型',
  `chepaizhonglei` varchar(200) DEFAULT NULL COMMENT '车牌种类',
  `weizhangchepaihao` varchar(200) DEFAULT NULL COMMENT '违章车牌号',
  `chufafangshi` varchar(200) DEFAULT NULL COMMENT '处罚方式',
  `chuliren` varchar(200) DEFAULT NULL COMMENT '处理人',
  `weizhangzhe` varchar(200) DEFAULT NULL COMMENT '违章者',
  `chufashijianshijian` datetime DEFAULT NULL COMMENT '处罚时间时间',
  `chufadidian` varchar(200) DEFAULT NULL COMMENT '处罚地点',
  `weizhangneirong` varchar(200) DEFAULT NULL COMMENT '违章内容',
  `weizhangshipin` varchar(200) DEFAULT NULL COMMENT '违章视频',
  `weizhangzhaopian` varchar(200) DEFAULT NULL COMMENT '违章照片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='移动电子违章信息管理';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yidongdianziweizhangxinxiguanli`
--

LOCK TABLES `yidongdianziweizhangxinxiguanli` WRITE;
/*!40000 ALTER TABLE `yidongdianziweizhangxinxiguanli` DISABLE KEYS */;
INSERT INTO `yidongdianziweizhangxinxiguanli` VALUES (21,'2021-04-12 08:49:21','闯红灯','汽车','黄牌','212121','处罚方式1','处理人1','违章者1','2021-04-12 16:49:21','处罚地点1','违章内容1','','http://localhost:8080/ssm4ir8r/upload/yidongdianziweizhangxinxiguanli_weizhangzhaopian1.jpg'),(22,'2021-04-12 08:49:21','违章行为2','违章车辆类型2','车牌种类2','违章车牌号2','处罚方式2','处理人2','违章者2','2021-04-12 16:49:21','处罚地点2','违章内容2','','http://localhost:8080/ssm4ir8r/upload/yidongdianziweizhangxinxiguanli_weizhangzhaopian2.jpg'),(23,'2021-04-12 08:49:21','违章行为3','违章车辆类型3','车牌种类3','违章车牌号3','处罚方式3','处理人3','违章者3','2021-04-12 16:49:21','处罚地点3','违章内容3','','http://localhost:8080/ssm4ir8r/upload/yidongdianziweizhangxinxiguanli_weizhangzhaopian3.jpg'),(24,'2021-04-12 08:49:21','违章行为4','违章车辆类型4','车牌种类4','违章车牌号4','处罚方式4','处理人4','违章者4','2021-04-12 16:49:21','处罚地点4','违章内容4','','http://localhost:8080/ssm4ir8r/upload/yidongdianziweizhangxinxiguanli_weizhangzhaopian4.jpg'),(25,'2021-04-12 08:49:21','违章行为1','车辆类型1','车牌种类5','粤24242424','处罚方式5','张三','李四','2021-04-12 16:49:21','处罚地点5','违章内容5','','http://localhost:8080/ssm4ir8r/upload/1618217662610.jpg'),(26,'2021-04-12 08:49:21','违章行为6','违章车辆类型6','车牌种类6','违章车牌号6','处罚方式6','桃子','梨','2021-04-13 16:49:21','处罚地点6','违章内容6','','http://localhost:8080/ssm4ir8r/upload/yidongdianziweizhangxinxiguanli_weizhangzhaopian6.jpg');
/*!40000 ALTER TABLE `yidongdianziweizhangxinxiguanli` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1618217476633 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2021-04-12 08:49:20','用户1','123456','姓名1','13823888881','男','http://localhost:8080/ssm4ir8r/upload/yonghu_touxiang1.jpg'),(12,'2021-04-12 08:49:20','用户2','123456','姓名2','13823888882','男','http://localhost:8080/ssm4ir8r/upload/yonghu_touxiang2.jpg'),(13,'2021-04-12 08:49:20','用户3','123456','姓名3','13823888883','男','http://localhost:8080/ssm4ir8r/upload/yonghu_touxiang3.jpg'),(14,'2021-04-12 08:49:20','用户4','123456','姓名4','13823888884','男','http://localhost:8080/ssm4ir8r/upload/yonghu_touxiang4.jpg'),(15,'2021-04-12 08:49:20','用户5','123456','姓名5','13823888885','男','http://localhost:8080/ssm4ir8r/upload/yonghu_touxiang5.jpg'),(16,'2021-04-12 08:49:20','用户6','123456','姓名6','13823888886','男','http://localhost:8080/ssm4ir8r/upload/yonghu_touxiang6.jpg'),(1618217476632,'2021-04-12 08:51:16','2','1','11','11111111111','女','http://localhost:8080/ssm4ir8r/upload/1618217551539.jpg');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhiduiguanli`
--

DROP TABLE IF EXISTS `zhiduiguanli`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhiduiguanli` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhiduiduiming` varchar(200) DEFAULT NULL COMMENT '支队队名',
  `zhiduididian` varchar(200) DEFAULT NULL COMMENT '支队地点',
  `zhiduiduizhang` varchar(200) DEFAULT NULL COMMENT '支队队长',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `zhiduizhaopian` varchar(200) DEFAULT NULL COMMENT '支队照片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='支队管理';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhiduiguanli`
--

LOCK TABLES `zhiduiguanli` WRITE;
/*!40000 ALTER TABLE `zhiduiguanli` DISABLE KEYS */;
INSERT INTO `zhiduiguanli` VALUES (61,'2021-04-12 08:49:21','支队队名1','支队地点1','支队队长1','联系电话1','http://localhost:8080/ssm4ir8r/upload/zhiduiguanli_zhiduizhaopian1.jpg'),(62,'2021-04-12 08:49:21','支队队名2','支队地点2','支队队长2','联系电话2','http://localhost:8080/ssm4ir8r/upload/zhiduiguanli_zhiduizhaopian2.jpg'),(63,'2021-04-12 08:49:21','支队队名3','支队地点3','支队队长3','联系电话3','http://localhost:8080/ssm4ir8r/upload/zhiduiguanli_zhiduizhaopian3.jpg'),(64,'2021-04-12 08:49:21','支队队名4','支队地点4','支队队长4','联系电话4','http://localhost:8080/ssm4ir8r/upload/zhiduiguanli_zhiduizhaopian4.jpg'),(65,'2021-04-12 08:49:21','支队队名5','支队地点5','支队队长5','联系电话5','http://localhost:8080/ssm4ir8r/upload/zhiduiguanli_zhiduizhaopian5.jpg'),(66,'2021-04-12 08:49:21','支队队名6','支队地点6','支队队长6','联系电话6','http://localhost:8080/ssm4ir8r/upload/zhiduiguanli_zhiduizhaopian6.jpg');
/*!40000 ALTER TABLE `zhiduiguanli` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-15 16:41:19
