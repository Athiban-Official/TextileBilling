-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 01, 2023 at 02:31 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hexabilling`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(10) NOT NULL,
  `employe_name` varchar(50) NOT NULL,
  `mobile_number` varchar(12) NOT NULL,
  `main_address` varchar(255) NOT NULL,
  `temp_address` varchar(255) NOT NULL,
  `city` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `merchant_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `employe_name`, `mobile_number`, `main_address`, `temp_address`, `city`, `email`, `merchant_name`) VALUES
(1, 'pulicasi', '9988776655', 'ahahfaivididvjdivjdijv', 'kdlvjilvjilvjilvivjfv', 'dubai ', 'pulicasi@gmail.com ', 'test'),
(2, 'John Doe', '1234567890', '123 Main St', '456 Temp St', 'City1', 'john.doe@email.com', 'Merchant1'),
(3, 'Jane Smith', '9876543210', '456 Elm St', '789 Temp St', 'City2', 'jane.smith@email.com', 'Merchant2'),
(4, 'Alice ', '5551234565', '789 Oak St', '101 Temp St', 'City3', 'alice.johnson@email.com', 'test'),
(5, 'Bob Brown', '7778889999', '321 Maple St', '555 Temp St', 'City4', 'bob.brown@email.com', 'Merchant4'),
(6, 'Eva White', '1112223333', '444 Pine St', '999 Temp St', 'City5', 'eva.white@email.com', 'Merchant5'),
(7, 'Mike Davis', '4445556666', '678 Birch St', '888 Temp St', 'City6', 'mike.davis@email.com', 'Merchant6'),
(8, 'Sara Wilson', '9998887777', '987 Cedar St', '333 Temp St', 'City7', 'sara.wilson@email.com', 'Merchant7'),
(9, 'Tom Clark', '6667778888', '222 Spruce St', '111 Temp St', 'City8', 'tom.clark@email.com', 'Merchant8'),
(10, 'Laura Lee', '3334445555', '555 Redwood St', '777 Temp St', 'City9', 'laura.lee@email.com', 'Merchant9'),
(11, 'Chris Turner', '8889990000', '777 Sequoia St', '666 Temp St', 'City10', 'chris.turner@email.com', 'Merchant10'),
(12, 'Jennifer Adams', '2223334444', '123 Elm St', '456 Temp St', 'City11', 'jennifer.adams@email.com', 'Merchant11'),
(13, 'David Hall', '5555555555', '789 Oak St', '101 Temp St', 'City12', 'david.hall@email.com', 'Merchant12'),
(14, 'Emma Martin', '7777777777', '321 Maple St', '555 Temp St', 'City13', 'emma.martin@email.com', 'Merchant13'),
(15, 'Kevin Wright', '9999999999', '444 Pine St', '999 Temp St', 'City14', 'kevin.wright@email.com', 'Merchant14'),
(16, 'Olivia Harris', '1111111111', '678 Birch St', '888 Temp St', 'City15', 'olivia.harris@email.com', 'Merchant15'),
(17, 'William Turner', '3333333333', '987 Cedar St', '333 Temp St', 'City16', 'william.turner@email.com', 'Merchant16'),
(18, 'Sophia Rodriguez', '6666666666', '222 Spruce St', '111 Temp St', 'City17', 'sophia.rodriguez@email.com', 'Merchant17'),
(19, 'Michael Martinez', '4444444444', '555 Redwood St', '777 Temp St', 'City18', 'michael.martinez@email.com', 'Merchant18'),
(20, 'Ava Young', '8888888888', '777 Sequoia St', '666 Temp St', 'City19', 'ava.young@email.com', 'Merchant19');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
