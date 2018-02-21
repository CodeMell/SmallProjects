-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Oct 17, 2017 at 08:18 PM
-- Server version: 5.5.57-MariaDB
-- PHP Version: 7.1.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mel1481`
--

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `gameid` int(11) NOT NULL,
  `title` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `genre` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `rating` int(11) NOT NULL,
  `cond` int(11) NOT NULL,
  `consoleID` int(11) NOT NULL,
  `price` decimal(10,0) NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`gameid`, `title`, `genre`, `rating`, `cond`, `consoleID`, `price`, `quantity`) VALUES
(1, 'Halo 3', 'FPS', 10, 1, 1, '20', 12),
(2, 'Space Invaders', 'Shooter', 7, 1, 3, '10', 22),
(3, 'Breath of The Wild', 'Adventure', 9, 0, 11, '50', 5),
(4, 'Destiny', 'FPS', 8, 1, 1, '15', 30),
(5, 'Destiny', 'FPS', 8, 1, 7, '15', 10),
(6, 'Destiny 2', 'FPS', 7, 0, 4, '60', 10),
(7, 'Destiny 2', 'FPS', 7, 0, 6, '60', 15),
(8, 'Halo 3', 'shooter', 10, 0, 1, '100', 1),
(9, 'Super Mario Sunshine', 'Platformer', 10, 1, 12, '25', 3),
(10, 'Super Mario Odyssey', 'Platformer', 9, 0, 9, '50', 4),
(11, 'Sly Cooper', 'Stealth', 9, 1, 8, '15', 2),
(12, 'Vex', 'Adventure', 5, 1, 8, '6', 13),
(13, 'Advanced Dungeons & Dragons: Treasure of Tarmin', 'Dungeon', 7, 0, 2, '150', 1),
(14, 'Shadow of War', 'Action', 9, 0, 6, '60', 36),
(15, 'Shadow of War', 'Action', 9, 0, 4, '60', 22),
(16, 'Minecraft', 'Adventure', 9, 0, 13, '15', 100),
(17, 'Minecraft', 'Adventure', 8, 0, 9, '50', 20),
(18, 'Twilight Princess', 'Adventure', 9, 1, 10, '20', 5),
(19, 'Splatoon', 'Shooter', 7, 1, 11, '18', 7);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`gameid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `inventory`
--
ALTER TABLE `inventory`
  MODIFY `gameid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
