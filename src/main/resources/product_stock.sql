/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 05/06/2019 18:31:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for product_stock
-- ----------------------------
DROP TABLE IF EXISTS `product_stock`;
CREATE TABLE `product_stock` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` int(11) DEFAULT NULL,
  `stock_01` int(255) DEFAULT NULL,
  `stock_02` int(255) DEFAULT NULL,
  `stock_03` int(255) DEFAULT NULL,
  `stock_04` int(255) DEFAULT NULL,
  `stock_05` int(255) DEFAULT NULL,
  `stock_06` int(255) DEFAULT NULL,
  `stock_07` int(255) DEFAULT NULL,
  `stock_08` int(255) DEFAULT NULL,
  `stock_09` int(255) DEFAULT NULL,
  `stock_10` int(255) DEFAULT NULL,
  `stock_segment` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of product_stock
-- ----------------------------
BEGIN;
INSERT INTO `product_stock` VALUES (1, 232323, 11, 8, 13, 14, 15, 16, 17, 18, 19, 100, 10);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
