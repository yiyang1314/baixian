/*
Navicat MySQL Data Transfer

Source Server         : myconn
Source Server Version : 50645
Source Host           : localhost:3306
Source Database       : mypri

Target Server Type    : MYSQL
Target Server Version : 50645
File Encoding         : 65001

Date: 2020-02-27 11:19:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `deptno` int(8) NOT NULL,
  `dname` varchar(50) DEFAULT NULL,
  `summary` varchar(255) DEFAULT NULL,
  `parentid` int(8) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------

-- ----------------------------
-- Table structure for priviliage
-- ----------------------------
DROP TABLE IF EXISTS `priviliage`;
CREATE TABLE `priviliage` (
  `priid` int(8) NOT NULL,
  `pri_name` varchar(50) DEFAULT NULL,
  `pic_path` varchar(100) DEFAULT NULL,
  `pri_url` varchar(100) DEFAULT NULL,
  `parentid` int(8) DEFAULT NULL,
  `pri_info` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`priid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of priviliage
-- ----------------------------
INSERT INTO `priviliage` VALUES ('1', '部门管理', null, null, '0', null);
INSERT INTO `priviliage` VALUES ('2', '订单管理', null, null, '0', null);
INSERT INTO `priviliage` VALUES ('3', '查看订单列表', null, 'checkallorder', '2', null);
INSERT INTO `priviliage` VALUES ('4', '增加订单', null, 'addorder', '2', null);
INSERT INTO `priviliage` VALUES ('5', '查看价格', null, 'checkprice', '2', null);

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `roleid` int(8) NOT NULL,
  `rolename` varchar(50) DEFAULT NULL,
  `summary` varchar(255) DEFAULT NULL,
  `parentid` int(8) DEFAULT NULL,
  PRIMARY KEY (`roleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '销售经理', null, null);
INSERT INTO `role` VALUES ('2', '销售员', null, null);

-- ----------------------------
-- Table structure for role_pri_relax
-- ----------------------------
DROP TABLE IF EXISTS `role_pri_relax`;
CREATE TABLE `role_pri_relax` (
  `roleid` int(8) NOT NULL,
  `priid` int(8) NOT NULL,
  PRIMARY KEY (`roleid`,`priid`),
  KEY `pri_relax_fk` (`priid`),
  CONSTRAINT `pri_relax_fk` FOREIGN KEY (`priid`) REFERENCES `priviliage` (`priid`),
  CONSTRAINT `role_relax_fk` FOREIGN KEY (`roleid`) REFERENCES `role` (`roleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_pri_relax
-- ----------------------------
INSERT INTO `role_pri_relax` VALUES ('1', '1');
INSERT INTO `role_pri_relax` VALUES ('1', '2');
INSERT INTO `role_pri_relax` VALUES ('2', '2');
INSERT INTO `role_pri_relax` VALUES ('1', '3');
INSERT INTO `role_pri_relax` VALUES ('2', '3');
INSERT INTO `role_pri_relax` VALUES ('1', '4');
INSERT INTO `role_pri_relax` VALUES ('2', '4');
INSERT INTO `role_pri_relax` VALUES ('1', '5');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `userid` int(8) NOT NULL,
  `loginname` varchar(50) NOT NULL,
  `loginpwd` varchar(50) NOT NULL,
  `realname` varchar(50) DEFAULT NULL,
  `parentid` int(8) DEFAULT NULL,
  `deptno` int(8) DEFAULT NULL,
  `roleid` int(8) DEFAULT NULL,
  PRIMARY KEY (`userid`),
  KEY `user_dept_fk` (`deptno`),
  KEY `user_role_fk` (`roleid`),
  CONSTRAINT `user_dept_fk` FOREIGN KEY (`deptno`) REFERENCES `dept` (`deptno`),
  CONSTRAINT `user_role_fk` FOREIGN KEY (`roleid`) REFERENCES `role` (`roleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
