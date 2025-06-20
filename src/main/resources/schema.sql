/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80031 (8.0.31)
 Source Host           : localhost:3306
 Source Schema         : flight

 Target Server Type    : MySQL
 Target Server Version : 80031 (8.0.31)
 File Encoding         : 65001

 Date: 04/06/2025 09:18:39
*/

DROP DATABASE IF EXISTS `flight`

CREATE DATABASE `flight` DEFAULT CHARACTER SET utf8mb4  COLLATE utf8mb4_unicode_ci;


SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

USE `flight`

-- ----------------------------
-- Table structure for airport
-- ----------------------------
DROP TABLE IF EXISTS `airport`;
CREATE TABLE `airport`  (
                            `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键，自增',
                            `code` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_german2_ci NULL DEFAULT NULL COMMENT '机场代码',
                            `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_german2_ci NULL DEFAULT NULL COMMENT '机场名称',
                            `city` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_german2_ci NULL DEFAULT NULL COMMENT '城市',
                            PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_german2_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for booking
-- ----------------------------
DROP TABLE IF EXISTS `booking`;
CREATE TABLE `booking`  (
                            `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键，自增',
                            `user_id` bigint NULL DEFAULT NULL COMMENT '用户ID',
                            `flight_id` bigint NULL DEFAULT NULL COMMENT '航班ID',
                            `reference` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_german2_ci NULL DEFAULT NULL COMMENT '预订参考号',
                            `status` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_german2_ci NULL DEFAULT NULL COMMENT '状态 (UPCOMING, PAST)',
                            `booking_time` timestamp NULL DEFAULT NULL COMMENT '下单时间',
                            `total_price` decimal(15, 2) NULL DEFAULT NULL COMMENT '订单总金额',
                            PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_german2_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for flight
-- ----------------------------
DROP TABLE IF EXISTS `flight`;
CREATE TABLE `flight`  (
                           `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键，自增',
                           `flight_number` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_german2_ci NULL DEFAULT NULL COMMENT '航班号',
                           `departure_airport_id` bigint NULL DEFAULT NULL COMMENT '出发机场ID',
                           `destination_airport_id` bigint NULL DEFAULT NULL COMMENT '到达机场ID',
                           `departure_date` date NULL DEFAULT NULL COMMENT '出发日期',
                           `departure_time` time NULL DEFAULT NULL COMMENT '出发时间',
                           `price` decimal(10, 2) NULL DEFAULT NULL COMMENT '票价',
                           PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_german2_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for passenger
-- ----------------------------
DROP TABLE IF EXISTS `passenger`;
CREATE TABLE `passenger`  (
                              `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键，自增',
                              `booking_id` bigint NOT NULL COMMENT '关联的预定id',
                              `first_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '乘客姓',
                              `last_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '乘客名',
                              `email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '乘客邮箱',
                              PRIMARY KEY (`id`) USING BTREE,
                              INDEX `booking_id`(`booking_id` ASC) USING BTREE,
                              CONSTRAINT `passenger_ibfk_1` FOREIGN KEY (`booking_id`) REFERENCES `booking` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
                         `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键，自增',
                         `email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_german2_ci NULL DEFAULT NULL COMMENT '邮箱地址，唯一',
                         `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_german2_ci NULL DEFAULT NULL COMMENT '加密密码',
                         `first_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_german2_ci NULL DEFAULT NULL COMMENT '名',
                         `last_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_german2_ci NULL DEFAULT NULL COMMENT '姓',
                         `country` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_german2_ci NULL DEFAULT NULL COMMENT '国家',
                         `phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_german2_ci NULL DEFAULT NULL COMMENT '手机号，可空',
                         PRIMARY KEY (`id`) USING BTREE,
                         UNIQUE INDEX `email`(`email` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_german2_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
