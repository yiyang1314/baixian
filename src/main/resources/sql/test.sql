/*
SQLyog Ultimate v11.22 (64 bit)
MySQL - 5.5.29 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `bx_admin` (
	`id` int (1),
	`admin_name` varchar (60),
	`login_time` date ,
	`password` varchar (99)
); 
insert into `bx_admin` (`id`, `admin_name`, `login_time`, `password`) values('1','admin','2020-02-25','123456');
insert into `bx_admin` (`id`, `admin_name`, `login_time`, `password`) values('2','manager','2020-02-20','123456');
insert into `bx_admin` (`id`, `admin_name`, `login_time`, `password`) values('3','test','2020-02-11','123456');
