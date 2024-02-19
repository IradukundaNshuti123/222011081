-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 18, 2024 at 05:04 PM
-- Server version: 10.1.35-MariaDB
-- PHP Version: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `login form`
--

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `Username` varchar(50) NOT NULL,
  `phone` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`Username`, `phone`, `email`, `gender`, `password`) VALUES
('', '', '', '', ''),
('Ira', '', '', '', '123'),
('', '', '', '', ''),
('bello', '', '', '', '224'),
('lisa', '', '', '', '77'),
('rosette', '07884477', 'gt', 'FEMALE', '202'),
('kami', '99999', 'gtt', 'FEMALE', '56'),
('p', '888', 'ggg', 'MALE ', '123'),
('iris', '07828282', 'iris@gmail.com', 'FEMALE', '000'),
('Gatesi', '0788255034', 'gatesi1@gmail.com', 'FEMALE', 'tesi'),
('rosinne', '078723444', 'gjj', 'MALE ', '99'),
('joy', '999', 'gtt', 'MALE ', '34'),
('doro', '99776', 'jg', 'MALE ', '23'),
('clem', '777', 'gggg', 'MALE ', '87'),
('naomi', '078765675', '@yiyggj', 'MALE ', '1234');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
