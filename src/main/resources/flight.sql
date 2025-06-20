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

 Date: 20/06/2025 21:04:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

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
) ENGINE = InnoDB AUTO_INCREMENT = 143 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_german2_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of airport
-- ----------------------------
INSERT INTO `airport` VALUES (1, 'PEK', '北京首都国际机场', '北京');
INSERT INTO `airport` VALUES (2, 'PKX', '北京大兴国际机场', '北京');
INSERT INTO `airport` VALUES (3, 'TSN', '天津滨海国际机场', '天津');
INSERT INTO `airport` VALUES (4, 'SJW', '石家庄正定国际机场', '石家庄');
INSERT INTO `airport` VALUES (5, 'TYN', '太原武宿国际机场', '太原');
INSERT INTO `airport` VALUES (6, 'HET', '呼和浩特白塔国际机场', '呼和浩特');
INSERT INTO `airport` VALUES (7, 'SHE', '沈阳桃仙国际机场', '沈阳');
INSERT INTO `airport` VALUES (8, 'DLC', '大连周水子国际机场', '大连');
INSERT INTO `airport` VALUES (9, 'HRB', '哈尔滨太平国际机场', '哈尔滨');
INSERT INTO `airport` VALUES (10, 'CGQ', '长春龙嘉国际机场', '长春');
INSERT INTO `airport` VALUES (11, 'PVG', '上海浦东国际机场', '上海');
INSERT INTO `airport` VALUES (12, 'SHA', '上海虹桥国际机场', '上海');
INSERT INTO `airport` VALUES (13, 'HGH', '杭州萧山国际机场', '杭州');
INSERT INTO `airport` VALUES (14, 'NKG', '南京禄口国际机场', '南京');
INSERT INTO `airport` VALUES (15, 'TNA', '济南遥墙国际机场', '济南');
INSERT INTO `airport` VALUES (16, 'HFE', '合肥新桥国际机场', '合肥');
INSERT INTO `airport` VALUES (17, 'CAN', '广州白云国际机场', '广州');
INSERT INTO `airport` VALUES (18, 'SZX', '深圳宝安国际机场', '深圳');
INSERT INTO `airport` VALUES (19, 'WUH', '武汉天河国际机场', '武汉');
INSERT INTO `airport` VALUES (20, 'CGO', '郑州新郑国际机场', '郑州');
INSERT INTO `airport` VALUES (21, 'CTU', '成都双流国际机场', '成都');
INSERT INTO `airport` VALUES (22, 'TFU', '成都天府国际机场', '成都');
INSERT INTO `airport` VALUES (23, 'CKG', '重庆江北国际机场', '重庆');
INSERT INTO `airport` VALUES (24, 'KMG', '昆明长水国际机场', '昆明');
INSERT INTO `airport` VALUES (25, 'LXA', '拉萨贡嘎国际机场', '拉萨');
INSERT INTO `airport` VALUES (26, 'XIY', '西安咸阳国际机场', '西安');
INSERT INTO `airport` VALUES (27, 'LHW', '兰州中川国际机场', '兰州');
INSERT INTO `airport` VALUES (28, 'URC', '乌鲁木齐地窝堡国际机场', '乌鲁木齐');
INSERT INTO `airport` VALUES (29, 'SYX', '三亚凤凰国际机场', '三亚');
INSERT INTO `airport` VALUES (30, 'XMN', '厦门高崎国际机场', '厦门');
INSERT INTO `airport` VALUES (31, 'TAO', '青岛胶东国际机场', '青岛');
INSERT INTO `airport` VALUES (32, 'NGB', '宁波栎社国际机场', '宁波');
INSERT INTO `airport` VALUES (33, 'FOC', '福州长乐国际机场', '福州');
INSERT INTO `airport` VALUES (34, 'KWE', '贵阳龙洞堡国际机场', '贵阳');
INSERT INTO `airport` VALUES (35, 'KHN', '南昌昌北国际机场', '南昌');
INSERT INTO `airport` VALUES (36, 'CSX', '长沙黄花国际机场', '长沙');
INSERT INTO `airport` VALUES (37, 'HAK', '海口美兰国际机场', '海口');
INSERT INTO `airport` VALUES (38, 'ZUH', '珠海金湾机场', '珠海');
INSERT INTO `airport` VALUES (39, 'WNZ', '温州龙湾国际机场', '温州');
INSERT INTO `airport` VALUES (40, 'INC', '银川河东国际机场', '银川');
INSERT INTO `airport` VALUES (41, 'XNN', '西宁曹家堡国际机场', '西宁');
INSERT INTO `airport` VALUES (42, 'LYG', '连云港花果山机场', '连云港');
INSERT INTO `airport` VALUES (43, 'YNZ', '盐城南洋国际机场', '盐城');
INSERT INTO `airport` VALUES (44, 'YNT', '烟台蓬莱国际机场', '烟台');
INSERT INTO `airport` VALUES (45, 'WEH', '威海大水泊国际机场', '威海');
INSERT INTO `airport` VALUES (46, 'TXN', '黄山屯溪国际机场', '黄山');
INSERT INTO `airport` VALUES (47, 'JJN', '泉州晋江国际机场', '泉州');
INSERT INTO `airport` VALUES (48, 'SWA', '揭阳潮汕国际机场', '揭阳');
INSERT INTO `airport` VALUES (49, 'DYG', '张家界荷花国际机场', '张家界');
INSERT INTO `airport` VALUES (50, 'LZY', '林芝米林机场', '林芝');
INSERT INTO `airport` VALUES (51, 'JHG', '西双版纳嘎洒国际机场', '西双版纳');
INSERT INTO `airport` VALUES (52, 'DLU', '大理荒草坝机场', '大理');
INSERT INTO `airport` VALUES (53, 'LUM', '德宏芒市机场', '德宏');
INSERT INTO `airport` VALUES (54, 'BSD', '保山云瑞机场', '保山');
INSERT INTO `airport` VALUES (55, 'LNJ', '临沧博尚机场', '临沧');
INSERT INTO `airport` VALUES (56, 'ZAT', '昭通机场', '昭通');
INSERT INTO `airport` VALUES (57, 'WMT', '遵义茅台机场', '遵义');
INSERT INTO `airport` VALUES (58, 'ACX', '兴义万峰林机场', '兴义');
INSERT INTO `airport` VALUES (59, 'KWL', '桂林两江国际机场', '桂林');
INSERT INTO `airport` VALUES (60, 'WUZ', '梧州西江机场', '梧州');
INSERT INTO `airport` VALUES (61, 'AEB', '百色巴马机场', '百色');
INSERT INTO `airport` VALUES (62, 'LZH', '柳州白莲机场', '柳州');
INSERT INTO `airport` VALUES (63, 'BHY', '北海福成机场', '北海');
INSERT INTO `airport` VALUES (64, 'HZH', '黎平机场', '黎平');
INSERT INTO `airport` VALUES (65, 'TEN', '铜仁凤凰机场', '铜仁');
INSERT INTO `airport` VALUES (66, 'ZYI', '遵义新舟机场', '遵义');
INSERT INTO `airport` VALUES (67, 'JGN', '嘉峪关机场', '嘉峪关');
INSERT INTO `airport` VALUES (68, 'DNH', '敦煌机场', '敦煌');
INSERT INTO `airport` VALUES (69, 'YZY', '张掖甘州机场', '张掖');
INSERT INTO `airport` VALUES (70, 'CHW', '酒泉鼎新机场', '酒泉');
INSERT INTO `airport` VALUES (71, 'IQN', '庆阳机场', '庆阳');
INSERT INTO `airport` VALUES (72, 'THQ', '天水麦积山机场', '天水');
INSERT INTO `airport` VALUES (73, 'GXH', '夏河机场', '夏河');
INSERT INTO `airport` VALUES (74, 'HXD', '德令哈机场', '德令哈');
INSERT INTO `airport` VALUES (75, 'HTT', '花土沟机场', '花土沟');
INSERT INTO `airport` VALUES (76, 'HZG', '汉中城固机场', '汉中');
INSERT INTO `airport` VALUES (77, 'ENY', '延安南泥湾机场', '延安');
INSERT INTO `airport` VALUES (78, 'UYN', '榆林榆阳机场', '榆林');
INSERT INTO `airport` VALUES (79, 'AKA', '安康富强机场', '安康');
INSERT INTO `airport` VALUES (80, 'HSN', '舟山普陀山机场', '舟山');
INSERT INTO `airport` VALUES (81, 'HYN', '台州路桥机场', '台州');
INSERT INTO `airport` VALUES (82, 'YUS', '玉树巴塘机场', '玉树');
INSERT INTO `airport` VALUES (83, 'DCY', '稻城亚丁机场', '稻城');
INSERT INTO `airport` VALUES (84, 'DAX', '达州河市机场', '达州');
INSERT INTO `airport` VALUES (85, 'MIG', '绵阳南郊机场', '绵阳');
INSERT INTO `airport` VALUES (86, 'NAO', '南充高坪机场', '南充');
INSERT INTO `airport` VALUES (87, 'YBP', '宜宾五粮液机场', '宜宾');
INSERT INTO `airport` VALUES (88, 'LZO', '泸州云龙机场', '泸州');
INSERT INTO `airport` VALUES (89, 'XIC', '西昌青山机场', '西昌');
INSERT INTO `airport` VALUES (90, 'PZI', '攀枝花保安营机场', '攀枝花');
INSERT INTO `airport` VALUES (91, 'AHJ', '阿坝红原机场', '阿坝');
INSERT INTO `airport` VALUES (92, 'GYS', '广元盘龙机场', '广元');
INSERT INTO `airport` VALUES (93, 'HZH', '黎平机场', '黎平');
INSERT INTO `airport` VALUES (94, 'WXN', '万州五桥机场', '万州');
INSERT INTO `airport` VALUES (95, 'JIQ', '黔江武陵山机场', '黔江');
INSERT INTO `airport` VALUES (96, 'BPX', '昌都邦达机场', '昌都');
INSERT INTO `airport` VALUES (97, 'NGQ', '阿里昆莎机场', '阿里');
INSERT INTO `airport` VALUES (98, 'LUM', '德宏芒市机场', '德宏');
INSERT INTO `airport` VALUES (99, 'BSD', '保山云瑞机场', '保山');
INSERT INTO `airport` VALUES (100, 'LNJ', '临沧博尚机场', '临沧');
INSERT INTO `airport` VALUES (101, 'ZAT', '昭通机场', '昭通');
INSERT INTO `airport` VALUES (102, 'WMT', '遵义茅台机场', '遵义');
INSERT INTO `airport` VALUES (103, 'ACX', '兴义万峰林机场', '兴义');
INSERT INTO `airport` VALUES (104, 'KWL', '桂林两江国际机场', '桂林');
INSERT INTO `airport` VALUES (105, 'WUZ', '梧州西江机场', '梧州');
INSERT INTO `airport` VALUES (106, 'AEB', '百色巴马机场', '百色');
INSERT INTO `airport` VALUES (107, 'LZH', '柳州白莲机场', '柳州');
INSERT INTO `airport` VALUES (108, 'BHY', '北海福成机场', '北海');
INSERT INTO `airport` VALUES (109, 'HZH', '黎平机场', '黎平');
INSERT INTO `airport` VALUES (110, 'TEN', '铜仁凤凰机场', '铜仁');
INSERT INTO `airport` VALUES (111, 'ZYI', '遵义新舟机场', '遵义');
INSERT INTO `airport` VALUES (112, 'JGN', '嘉峪关机场', '嘉峪关');
INSERT INTO `airport` VALUES (113, 'DNH', '敦煌机场', '敦煌');
INSERT INTO `airport` VALUES (114, 'YZY', '张掖甘州机场', '张掖');
INSERT INTO `airport` VALUES (115, 'CHW', '酒泉鼎新机场', '酒泉');
INSERT INTO `airport` VALUES (116, 'IQN', '庆阳机场', '庆阳');
INSERT INTO `airport` VALUES (117, 'THQ', '天水麦积山机场', '天水');
INSERT INTO `airport` VALUES (118, 'GXH', '夏河机场', '夏河');
INSERT INTO `airport` VALUES (119, 'HXD', '德令哈机场', '德令哈');
INSERT INTO `airport` VALUES (120, 'HTT', '花土沟机场', '花土沟');
INSERT INTO `airport` VALUES (121, 'HZG', '汉中城固机场', '汉中');
INSERT INTO `airport` VALUES (122, 'ENY', '延安南泥湾机场', '延安');
INSERT INTO `airport` VALUES (123, 'UYN', '榆林榆阳机场', '榆林');
INSERT INTO `airport` VALUES (124, 'AKA', '安康富强机场', '安康');
INSERT INTO `airport` VALUES (125, 'HSN', '舟山普陀山机场', '舟山');
INSERT INTO `airport` VALUES (126, 'HYN', '台州路桥机场', '台州');
INSERT INTO `airport` VALUES (127, 'YUS', '玉树巴塘机场', '玉树');
INSERT INTO `airport` VALUES (128, 'DCY', '稻城亚丁机场', '稻城');
INSERT INTO `airport` VALUES (129, 'DAX', '达州河市机场', '达州');
INSERT INTO `airport` VALUES (130, 'MIG', '绵阳南郊机场', '绵阳');
INSERT INTO `airport` VALUES (131, 'NAO', '南充高坪机场', '南充');
INSERT INTO `airport` VALUES (132, 'YBP', '宜宾五粮液机场', '宜宾');
INSERT INTO `airport` VALUES (133, 'LZO', '泸州云龙机场', '泸州');
INSERT INTO `airport` VALUES (134, 'XIC', '西昌青山机场', '西昌');
INSERT INTO `airport` VALUES (135, 'PZI', '攀枝花保安营机场', '攀枝花');
INSERT INTO `airport` VALUES (136, 'AHJ', '阿坝红原机场', '阿坝');
INSERT INTO `airport` VALUES (137, 'GYS', '广元盘龙机场', '广元');
INSERT INTO `airport` VALUES (138, 'HZH', '黎平机场', '黎平');
INSERT INTO `airport` VALUES (139, 'WXN', '万州五桥机场', '万州');
INSERT INTO `airport` VALUES (140, 'JIQ', '黔江武陵山机场', '黔江');
INSERT INTO `airport` VALUES (141, 'BPX', '昌都邦达机场', '昌都');
INSERT INTO `airport` VALUES (142, 'NGQ', '阿里昆莎机场', '阿里');

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
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_german2_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of booking
-- ----------------------------
INSERT INTO `booking` VALUES (1, 1, 1, 'A123232', '1', '2025-06-17 22:43:40', 6000.00);
INSERT INTO `booking` VALUES (2, NULL, 1, 'A2332', '1', NULL, 9000.00);
INSERT INTO `booking` VALUES (3, NULL, 1, 'A2332', '1', '2025-06-17 23:14:12', 9000.00);

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
) ENGINE = InnoDB AUTO_INCREMENT = 91 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_german2_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of flight
-- ----------------------------
INSERT INTO `flight` VALUES (1, 'CA1501', 1, 12, '2025-06-18', '07:30:00', 980.00);
INSERT INTO `flight` VALUES (2, 'MU5102', 11, 17, '2025-06-18', '08:15:00', 1200.00);
INSERT INTO `flight` VALUES (3, 'CZ3106', 17, 1, '2025-06-18', '09:20:00', 1350.00);
INSERT INTO `flight` VALUES (4, 'HU7601', 2, 18, '2025-06-18', '10:45:00', 1100.00);
INSERT INTO `flight` VALUES (5, '3U8732', 21, 24, '2025-06-18', '11:10:00', 680.00);
INSERT INTO `flight` VALUES (6, 'MF8103', 30, 13, '2025-06-18', '12:30:00', 750.00);
INSERT INTO `flight` VALUES (7, 'ZH9876', 18, 26, '2025-06-18', '13:15:00', 890.00);
INSERT INTO `flight` VALUES (8, 'SC4658', 31, 23, '2025-06-18', '14:40:00', 920.00);
INSERT INTO `flight` VALUES (9, 'KY1234', 34, 36, '2025-06-18', '15:25:00', 540.00);
INSERT INTO `flight` VALUES (10, 'GJ8888', 13, 14, '2025-06-18', '16:50:00', 480.00);
INSERT INTO `flight` VALUES (11, 'CA1235', 1, 7, '2025-06-19', '07:40:00', 760.00);
INSERT INTO `flight` VALUES (12, 'MU5318', 11, 30, '2025-06-19', '08:55:00', 880.00);
INSERT INTO `flight` VALUES (13, 'CZ3621', 17, 20, '2025-06-19', '09:30:00', 670.00);
INSERT INTO `flight` VALUES (14, 'HU7633', 2, 37, '2025-06-19', '10:20:00', 1250.00);
INSERT INTO `flight` VALUES (15, '3U8991', 21, 25, '2025-06-19', '11:45:00', 1480.00);
INSERT INTO `flight` VALUES (16, 'MF8345', 30, 32, '2025-06-19', '12:10:00', 590.00);
INSERT INTO `flight` VALUES (17, 'ZH8520', 18, 28, '2025-06-19', '13:35:00', 1860.00);
INSERT INTO `flight` VALUES (18, 'SC4882', 31, 29, '2025-06-19', '14:50:00', 1520.00);
INSERT INTO `flight` VALUES (19, 'KY2345', 34, 19, '2025-06-19', '15:15:00', 710.00);
INSERT INTO `flight` VALUES (20, 'GJ6666', 13, 33, '2025-06-19', '16:40:00', 530.00);
INSERT INTO `flight` VALUES (21, 'CA1583', 1, 8, '2025-06-20', '07:50:00', 820.00);
INSERT INTO `flight` VALUES (22, 'MU5426', 11, 4, '2025-06-20', '08:25:00', 690.00);
INSERT INTO `flight` VALUES (23, 'CZ3158', 17, 10, '2025-06-20', '09:40:00', 780.00);
INSERT INTO `flight` VALUES (24, 'HU7699', 2, 9, '2025-06-20', '10:55:00', 1120.00);
INSERT INTO `flight` VALUES (25, '3U8246', 21, 40, '2025-06-20', '11:20:00', 950.00);
INSERT INTO `flight` VALUES (26, 'MF8012', 30, 39, '2025-06-20', '12:45:00', 620.00);
INSERT INTO `flight` VALUES (27, 'ZH9632', 18, 27, '2025-06-20', '13:30:00', 1080.00);
INSERT INTO `flight` VALUES (28, 'SC4123', 31, 41, '2025-06-20', '14:15:00', 890.00);
INSERT INTO `flight` VALUES (29, 'KY3456', 34, 59, '2025-06-20', '15:50:00', 730.00);
INSERT INTO `flight` VALUES (30, 'GJ7777', 13, 81, '2025-06-20', '16:25:00', 580.00);
INSERT INTO `flight` VALUES (31, 'CA1321', 1, 10, '2025-06-21', '07:35:00', 910.00);
INSERT INTO `flight` VALUES (32, 'MU5537', 11, 15, '2025-06-21', '08:40:00', 650.00);
INSERT INTO `flight` VALUES (33, 'CZ3274', 17, 16, '2025-06-21', '09:55:00', 720.00);
INSERT INTO `flight` VALUES (34, 'HU7588', 2, 49, '2025-06-21', '10:10:00', 980.00);
INSERT INTO `flight` VALUES (35, '3U8452', 21, 51, '2025-06-21', '11:45:00', 1320.00);
INSERT INTO `flight` VALUES (36, 'MF8234', 30, 38, '2025-06-21', '12:20:00', 710.00);
INSERT INTO `flight` VALUES (37, 'ZH8745', 18, 42, '2025-06-21', '13:35:00', 890.00);
INSERT INTO `flight` VALUES (38, 'SC4765', 31, 44, '2025-06-21', '14:50:00', 680.00);
INSERT INTO `flight` VALUES (39, 'KY4567', 34, 52, '2025-06-21', '15:15:00', 1050.00);
INSERT INTO `flight` VALUES (40, 'GJ5555', 13, 45, '2025-06-21', '16:40:00', 760.00);
INSERT INTO `flight` VALUES (41, 'CA1426', 1, 6, '2025-06-22', '07:45:00', 830.00);
INSERT INTO `flight` VALUES (42, 'MU5648', 11, 43, '2025-06-22', '08:30:00', 590.00);
INSERT INTO `flight` VALUES (43, 'CZ3382', 17, 35, '2025-06-22', '09:25:00', 670.00);
INSERT INTO `flight` VALUES (44, 'HU7477', 2, 46, '2025-06-22', '10:50:00', 1120.00);
INSERT INTO `flight` VALUES (45, '3U8664', 21, 53, '2025-06-22', '11:15:00', 1240.00);
INSERT INTO `flight` VALUES (46, 'MF8123', 30, 48, '2025-06-22', '12:40:00', 780.00);
INSERT INTO `flight` VALUES (47, 'ZH8965', 18, 54, '2025-06-22', '13:55:00', 1360.00);
INSERT INTO `flight` VALUES (48, 'SC4231', 31, 50, '2025-06-22', '14:20:00', 1580.00);
INSERT INTO `flight` VALUES (49, 'KY5678', 34, 83, '2025-06-22', '15:45:00', 1420.00);
INSERT INTO `flight` VALUES (50, 'GJ4444', 13, 80, '2025-06-22', '16:10:00', 680.00);
INSERT INTO `flight` VALUES (51, 'CA1537', 1, 47, '2025-06-23', '07:20:00', 1250.00);
INSERT INTO `flight` VALUES (52, 'MU5759', 11, 68, '2025-06-23', '08:35:00', 1080.00);
INSERT INTO `flight` VALUES (53, 'CZ3496', 17, 69, '2025-06-23', '09:50:00', 920.00);
INSERT INTO `flight` VALUES (54, 'HU7366', 2, 71, '2025-06-23', '10:05:00', 780.00);
INSERT INTO `flight` VALUES (55, '3U8873', 21, 84, '2025-06-23', '11:40:00', 650.00);
INSERT INTO `flight` VALUES (56, 'MF8456', 30, 85, '2025-06-23', '12:15:00', 590.00);
INSERT INTO `flight` VALUES (57, 'ZH8521', 18, 86, '2025-06-23', '13:30:00', 720.00);
INSERT INTO `flight` VALUES (58, 'SC4321', 31, 87, '2025-06-23', '14:45:00', 830.00);
INSERT INTO `flight` VALUES (59, 'KY6789', 34, 88, '2025-06-23', '15:10:00', 680.00);
INSERT INTO `flight` VALUES (60, 'GJ3333', 13, 89, '2025-06-23', '16:35:00', 950.00);
INSERT INTO `flight` VALUES (61, 'CA1648', 1, 90, '2025-06-24', '07:55:00', 1120.00);
INSERT INTO `flight` VALUES (62, 'MU5860', 11, 91, '2025-06-24', '08:20:00', 1360.00);
INSERT INTO `flight` VALUES (63, 'CZ3512', 17, 92, '2025-06-24', '09:45:00', 890.00);
INSERT INTO `flight` VALUES (64, 'HU7255', 2, 94, '2025-06-24', '10:30:00', 780.00);
INSERT INTO `flight` VALUES (65, '3U8085', 21, 95, '2025-06-24', '11:55:00', 1020.00);
INSERT INTO `flight` VALUES (66, 'MF8567', 30, 96, '2025-06-24', '12:40:00', 1480.00);
INSERT INTO `flight` VALUES (67, 'ZH8632', 18, 97, '2025-06-24', '13:15:00', 1650.00);
INSERT INTO `flight` VALUES (68, 'SC4456', 31, 82, '2025-06-24', '14:50:00', 1320.00);
INSERT INTO `flight` VALUES (69, 'KY7890', 34, 74, '2025-06-24', '15:25:00', 1180.00);
INSERT INTO `flight` VALUES (70, 'GJ2222', 13, 75, '2025-06-24', '16:40:00', 980.00);
INSERT INTO `flight` VALUES (71, 'CA1752', 1, 76, '2025-06-25', '07:30:00', 850.00);
INSERT INTO `flight` VALUES (72, 'MU5971', 11, 77, '2025-06-25', '08:45:00', 720.00);
INSERT INTO `flight` VALUES (73, 'CZ3628', 17, 78, '2025-06-25', '09:20:00', 890.00);
INSERT INTO `flight` VALUES (74, 'HU7144', 2, 79, '2025-06-25', '10:35:00', 680.00);
INSERT INTO `flight` VALUES (75, '3U8297', 21, 61, '2025-06-25', '11:50:00', 750.00);
INSERT INTO `flight` VALUES (76, 'MF8678', 30, 60, '2025-06-25', '12:25:00', 620.00);
INSERT INTO `flight` VALUES (77, 'ZH8746', 18, 63, '2025-06-25', '13:40:00', 830.00);
INSERT INTO `flight` VALUES (78, 'SC4567', 31, 65, '2025-06-25', '14:55:00', 920.00);
INSERT INTO `flight` VALUES (79, 'KY8901', 34, 66, '2025-06-25', '15:30:00', 680.00);
INSERT INTO `flight` VALUES (80, 'GJ1111', 13, 67, '2025-06-25', '16:45:00', 780.00);
INSERT INTO `flight` VALUES (81, 'CA1863', 1, 70, '2025-06-26', '07:40:00', 950.00);
INSERT INTO `flight` VALUES (82, 'MU5083', 11, 72, '2025-06-26', '08:15:00', 820.00);
INSERT INTO `flight` VALUES (83, 'CZ3734', 17, 73, '2025-06-26', '09:50:00', 1080.00);
INSERT INTO `flight` VALUES (84, 'HU7033', 2, 64, '2025-06-26', '10:25:00', 720.00);
INSERT INTO `flight` VALUES (85, '3U8128', 21, 57, '2025-06-26', '11:40:00', 890.00);
INSERT INTO `flight` VALUES (86, 'MF8789', 30, 58, '2025-06-26', '12:55:00', 1020.00);
INSERT INTO `flight` VALUES (87, 'ZH8852', 18, 62, '2025-06-26', '13:30:00', 780.00);
INSERT INTO `flight` VALUES (88, 'SC4678', 31, 64, '2025-06-26', '14:45:00', 850.00);
INSERT INTO `flight` VALUES (89, 'KY9012', 34, 57, '2025-06-26', '15:20:00', 920.00);
INSERT INTO `flight` VALUES (90, 'GJ9999', 13, 58, '2025-06-26', '16:35:00', 1080.00);

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
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of passenger
-- ----------------------------

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
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_german2_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (7, '123@163.com', 'zaq12wsx', 'zhang', 'san', 'C', '1234568980');
INSERT INTO `user` VALUES (9, '1233@163.com', 'zaq12wsx', 'zhang', 'li', 'C', '13839248233');

SET FOREIGN_KEY_CHECKS = 1;
