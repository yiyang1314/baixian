/*
SQLyog Ultimate v11.22 (64 bit)
MySQL - 5.5.29 : Database - baixian
*********************************************************************
*/

/*前缀bx_省略，表含义
 * account账户
 * user用户
 * address地址
 * admin 管理员
 * VIPtype 会员类型5
 * company 公司信息
 * person 个人
 * order 订单
 * notify 站内消息通知
 * score 积分
 * itemcat 商品分类
 * product 商品或产品 	 	
 * attention 关注
 * band 品牌
 * hend 收藏
 */


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`baixian` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `baixian`;

/*Table structure for table `bx_account` */

DROP TABLE IF EXISTS `bx_account`;

CREATE TABLE `bx_account` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `userId` int(16) NOT NULL COMMENT '用户id',
  `lock_status` int(1) DEFAULT '0' COMMENT '账户状态',
  `card_id` int(19) DEFAULT NULL COMMENT '银行账户',
  `cart_name` varchar(20) DEFAULT NULL COMMENT '银行卡类型名称',
  `openbank` varchar(50) DEFAULT NULL COMMENT '开户行',
  `create_time` date DEFAULT NULL COMMENT '绑定时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bx_account` */

/*Table structure for table `bx_address` */

DROP TABLE IF EXISTS `bx_address`;

CREATE TABLE `bx_address` (
  `id` int(16) NOT NULL,
  `province` varchar(24) DEFAULT NULL COMMENT '省/区',
  `city` varchar(30) DEFAULT NULL COMMENT '市/州',
  `are` varchar(30) DEFAULT NULL COMMENT '县/区',
  `address` varchar(30) DEFAULT NULL COMMENT '详细地址',
  `default_status` int(1) DEFAULT '1' COMMENT '默认地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bx_address` */

/*Table structure for table `bx_admin` */

DROP TABLE IF EXISTS `bx_admin`;

CREATE TABLE `bx_admin` (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(20) NOT NULL COMMENT '管理员名称',
  `login_time` date NOT NULL COMMENT '登录时间',
  `password` varchar(33) NOT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `bx_admin` */

insert  into `bx_admin`(`id`,`admin_name`,`login_time`,`password`) values (1,'admin','2020-02-25','123456'),(2,'manager','2020-02-20','123456'),(3,'test','2020-02-11','123456');

/*Table structure for table `bx_attention` */

DROP TABLE IF EXISTS `bx_attention`;

CREATE TABLE `bx_attention` (
  `id` int(16) NOT NULL,
  `comm_id` int(16) DEFAULT NULL COMMENT '运营商编号',
  `download_num` int(5) DEFAULT NULL COMMENT '下载量',
  `descrition` varchar(300) DEFAULT NULL COMMENT '描述信息',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `order_status` int(1) DEFAULT '0' COMMENT '清单状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bx_attention` */

/*Table structure for table `bx_band` */

DROP TABLE IF EXISTS `bx_band`;

CREATE TABLE `bx_band` (
  `id` int(16) NOT NULL COMMENT '品牌编号',
  `text` varchar(20) DEFAULT NULL COMMENT '品牌名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bx_band` */

/*Table structure for table `bx_company` */

DROP TABLE IF EXISTS `bx_company`;

CREATE TABLE `bx_company` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `company_name` varchar(25) DEFAULT NULL COMMENT '公司名称',
  `image_list` varchar(500) DEFAULT NULL COMMENT '认证图片地址列表',
  `other_list` varchar(500) DEFAULT NULL COMMENT '其他证件图片列表',
  `corporate` varchar(20) DEFAULT NULL COMMENT '公司法人',
  `operator` varchar(20) DEFAULT NULL COMMENT '运营商姓名',
  `operate_service` varchar(30) DEFAULT NULL COMMENT '运营商职务',
  `contact` varchar(11) DEFAULT NULL COMMENT '联系方式',
  `authentic_status` int(1) DEFAULT '0' COMMENT '审核状态',
  `address_id` int(16) DEFAULT NULL COMMENT '公司地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bx_company` */

/*Table structure for table `bx_head` */

DROP TABLE IF EXISTS `bx_head`;

CREATE TABLE `bx_head` (
  `id` int(16) NOT NULL,
  `type` int(1) DEFAULT NULL COMMENT '收藏类型',
  `head_id` int(16) DEFAULT NULL COMMENT '收藏关联的编号',
  `content` varchar(500) DEFAULT NULL COMMENT '暂留位置',
  `type_status` int(1) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bx_head` */

/*Table structure for table `bx_itemcat` */

DROP TABLE IF EXISTS `bx_itemcat`;

CREATE TABLE `bx_itemcat` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `itemname` varchar(33) NOT NULL COMMENT '分类名称',
  `parentId` int(16) DEFAULT '0' COMMENT '上级id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=78 DEFAULT CHARSET=utf8;

/*Data for the table `bx_itemcat` */

insert  into `bx_itemcat`(`id`,`itemname`,`parentId`) values (1,'水产海鲜类',0),(2,'禽类',0),(3,'粮食富作物',0),(4,'熟食调理类',0),(5,'调料类',0),(6,'蔬菜类',0),(7,'水果类',0),(11,'鱼类',1),(12,'贝类',1),(13,'虾蟹类',1),(21,'鸡类',2),(22,'狗类',2),(23,'牛类',2),(24,'猪类',2),(25,'鸭类',2),(31,'大麦类',3),(32,'食用盐类',3),(33,'食用油类',3),(34,'玉米类',3),(35,'稻米类',3),(36,'高粱类',3),(41,'肉丸类',4),(42,'水饺类',4),(43,'酱香饼类',4),(44,'汤圆类',4),(71,'梨子类',7),(72,'西瓜',7),(73,'芒果',7),(74,'桃子',7),(75,'椰子',7),(76,'柚子',7),(77,'苹果',7);

/*Table structure for table `bx_notify` */

DROP TABLE IF EXISTS `bx_notify`;

CREATE TABLE `bx_notify` (
  `id` int(16) NOT NULL,
  `theme` varchar(30) DEFAULT NULL COMMENT '提示标题',
  `check_time` date DEFAULT NULL COMMENT '创建时间',
  `status` int(1) DEFAULT '3' COMMENT '通知状态',
  `content` varchar(300) DEFAULT NULL COMMENT '提示内容',
  `userid` int(16) DEFAULT NULL COMMENT '用户id',
  `type` int(1) DEFAULT '0' COMMENT '会员服务id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bx_notify` */

/*Table structure for table `bx_order` */

DROP TABLE IF EXISTS `bx_order`;

CREATE TABLE `bx_order` (
  `id` int(16) NOT NULL COMMENT '订单明细',
  `comm_id` int(16) DEFAULT NULL COMMENT '供应商',
  `product_id` int(16) DEFAULT NULL COMMENT '商品id',
  `num` int(8) DEFAULT NULL COMMENT '总数量',
  `total` double DEFAULT NULL COMMENT '总价',
  `pay_status` int(1) DEFAULT '0' COMMENT '订单状态',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `receive_address` varchar(30) DEFAULT NULL COMMENT '收货地址',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号码',
  `order_id` int(16) DEFAULT NULL COMMENT '订单编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bx_order` */

/*Table structure for table `bx_person` */

DROP TABLE IF EXISTS `bx_person`;

CREATE TABLE `bx_person` (
  `id` int(16) NOT NULL,
  `realname` varchar(20) DEFAULT NULL COMMENT '真实姓名',
  `authen_id` varchar(19) DEFAULT NULL COMMENT '身份证号',
  `authen_pic` varchar(200) DEFAULT NULL COMMENT '身份证附件地址',
  `contact_address` varchar(50) DEFAULT NULL COMMENT '联系地址',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号',
  `email` varchar(16) DEFAULT NULL COMMENT '邮箱',
  `telphone` varchar(14) DEFAULT NULL COMMENT '座机',
  `audit_status` int(1) DEFAULT '1' COMMENT '审核状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bx_person` */

/*Table structure for table `bx_product` */

DROP TABLE IF EXISTS `bx_product`;

CREATE TABLE `bx_product` (
  `id` int(16) NOT NULL,
  `product_name` varchar(30) DEFAULT NULL COMMENT '商品名称',
  `product_attr` varchar(500) DEFAULT NULL COMMENT '商品属性',
  `product_specical` varchar(500) DEFAULT NULL COMMENT '商品规格',
  `grade` varchar(5) DEFAULT NULL COMMENT '级别',
  `area` varchar(20) DEFAULT NULL COMMENT '地区',
  `num` int(8) DEFAULT '999' COMMENT '库存',
  `send_city` varchar(20) DEFAULT NULL COMMENT '发货地',
  `price` double DEFAULT NULL COMMENT '单价',
  `comm_id` int(16) DEFAULT NULL COMMENT '供应商ID',
  `audit_status` int(1) DEFAULT '0' COMMENT '审核状态',
  `exists_goods` int(1) DEFAULT '0' COMMENT '货物状态',
  `repository_nead` varchar(20) DEFAULT NULL COMMENT '仓库需求',
  `itemcat_id` int(16) DEFAULT NULL COMMENT '商品分类id',
  `create_time` date DEFAULT NULL COMMENT '发布时间',
  `audit_time` date DEFAULT NULL COMMENT '审核时间',
  `image_list` varchar(500) DEFAULT NULL COMMENT '商品图片列表地址',
  `band_id` int(16) DEFAULT NULL COMMENT '品牌id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bx_product` */

/*Table structure for table `bx_score` */

DROP TABLE IF EXISTS `bx_score`;

CREATE TABLE `bx_score` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `order_id` int(16) DEFAULT NULL COMMENT '订单编号',
  `product_id` int(16) DEFAULT NULL COMMENT '产品编号',
  `score` int(4) DEFAULT NULL COMMENT '积分',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bx_score` */

/*Table structure for table `bx_user` */

DROP TABLE IF EXISTS `bx_user`;

CREATE TABLE `bx_user` (
  `id` int(16) NOT NULL,
  `username` varchar(16) NOT NULL COMMENT '用户名',
  `password` varchar(33) NOT NULL COMMENT '密码',
  `nickname` varchar(30) DEFAULT NULL COMMENT '昵称',
  `pic_path` varchar(200) DEFAULT NULL COMMENT '头像地址',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机',
  `emaill` varchar(16) DEFAULT NULL COMMENT '邮箱',
  `area` varchar(20) DEFAULT NULL COMMENT '区域',
  `address_id` int(16) DEFAULT NULL COMMENT '地址id',
  `account_id` int(16) DEFAULT NULL COMMENT '账户id',
  `authen_id` int(16) DEFAULT NULL COMMENT '认证服务id',
  `product_id` int(16) DEFAULT NULL COMMENT '产品id',
  `create_time` date DEFAULT NULL COMMENT '注册时间',
  `update_time` date DEFAULT NULL COMMENT '修改时间',
  `lastlogin_time` date DEFAULT NULL COMMENT '上次登录时间',
  `use_status` int(1) DEFAULT NULL COMMENT '0:正常 1:锁定 2:过期 3:注销',
  `viptype_id` int(1) DEFAULT NULL COMMENT '会员的类型id',
  `score` double DEFAULT '1200' COMMENT '积分',
  `money` double DEFAULT '0' COMMENT '余额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bx_user` */

/*Table structure for table `bx_viptype` */

DROP TABLE IF EXISTS `bx_viptype`;

CREATE TABLE `bx_viptype` (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `authentic_name` varchar(25) DEFAULT NULL COMMENT '认证名称',
  `descrition` text COMMENT '简介',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `bx_viptype` */

insert  into `bx_viptype`(`id`,`authentic_name`,`descrition`,`create_time`) values (1,'供应商','认证成为供应商之后可以在线发布自己的资源单，商品信息发布更新将不再繁琐，认证成为供应商之后可以在线发布自己的资源单，商品信息发布更新将不再繁琐，认证成为供应商之后可以在线发布自己的资源单。商品信息发布更新将不再繁琐，认证成为供应商之后可以在线发布自己的资源单。','2020-02-04'),(2,'采购方','证成为供应商之后可以在线发布自己的资源单，商品信息发布更新将不再繁琐，认证成为供应商之后可以在线发布自己的资源单，商品信息发布更新将不再繁琐，认证成为供应商之后可以在线发布自己的资源单。商品信息发布更新将不再繁琐，认证成为供应商之后可以在线发布自己的资源单。','2020-02-11'),(3,'托运方','认证成为供应商之后可以在线发布自己的资源单，商品信息发布更新将不再繁琐，认证成为供应商之后可以在线发布自己的资源单，商品信息发布更新将不再繁琐，认证成为供应商之后可以在线发布自己的资源单。商品信息发布更新将不再繁琐，认证成为供应商之后可以在线发布自己的资源单','2020-02-13'),(4,'承运方法','认证成为供应商之后可以在线发布自己的资源单，商品信息发布更新将不再繁琐，认证成为供应商之后可以在线发布自己的资源单，商品信息发布更新将不再繁琐，认证成为供应商之后可以在线发布自己的资源单。商品信息发布更新将不再繁琐，认证成为供应商之后可以在线发布自己的资源单','2020-02-25');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
