-- --------------------------------------------------------
-- Host:                         192.168.123.21
-- Server version:               10.5.4-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping structure for table hotel_management_app_console.account
CREATE TABLE IF NOT EXISTS `account` (
  `id_account` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `permission` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_account`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='Account management';

-- Data exporting was unselected.

-- Dumping structure for table hotel_management_app_console.customer
CREATE TABLE IF NOT EXISTS `customer` (
  `id_customer` bigint(20) NOT NULL,
  `name_customer` varchar(100) COLLATE utf8_vietnamese_ci NOT NULL,
  `date_of_birth` date NOT NULL,
  `address` varchar(500) COLLATE utf8_vietnamese_ci NOT NULL,
  `telephone` bigint(20) NOT NULL,
  `id_room` int(11) NOT NULL AUTO_INCREMENT,
  `id_account` int(11) NOT NULL,
  PRIMARY KEY (`id_customer`),
  KEY `FK_customer_room` (`id_room`),
  KEY `FK_customer_account` (`id_account`),
  CONSTRAINT `FK_customer_account` FOREIGN KEY (`id_account`) REFERENCES `account` (`id_account`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_customer_room` FOREIGN KEY (`id_room`) REFERENCES `room` (`id_room`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci COMMENT='Customer Information Management';

-- Data exporting was unselected.

-- Dumping structure for table hotel_management_app_console.room
CREATE TABLE IF NOT EXISTS `room` (
  `id_room` int(11) NOT NULL,
  `type_of_room` varchar(50) NOT NULL,
  `check-in_date` date NOT NULL,
  `check-out-date` date NOT NULL,
  `service` int(11) NOT NULL DEFAULT 0,
  `note` varchar(500) DEFAULT NULL,
  `prepayment` float NOT NULL DEFAULT 0,
  `day_of_stay` int(11) NOT NULL,
  `total` float NOT NULL,
  PRIMARY KEY (`id_room`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Room information management';

-- Data exporting was unselected.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
