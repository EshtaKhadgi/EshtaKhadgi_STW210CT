-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 13, 2020 at 08:20 AM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javaquiz`
--

-- --------------------------------------------------------

--
-- Table structure for table `computer`
--

CREATE TABLE `computer` (
  `QuestionNo` int(5) NOT NULL,
  `Question` varchar(150) NOT NULL,
  `OptionA` varchar(150) NOT NULL,
  `OptionB` varchar(150) NOT NULL,
  `OptionC` varchar(150) NOT NULL,
  `OptionD` varchar(150) NOT NULL,
  `Answer` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `computer`
--

INSERT INTO `computer` (`QuestionNo`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Who is the father of Computer?', 'Allen Turing', 'Charles Babbage', 'Simur Cray', 'Augusta Adaming', 'Charles Babbage'),
(2, 'You organize files by storing them in', 'archives', 'folders', 'indexes', 'list', 'folders'),
(3, 'CD-ROM stands for', 'Compactable Read Only Memory', ' Compact Data Read Only Memory', 'Compactable Disk Read Only Memory', 'Compact Disk Read Only Memory', 'Compact Disk Read Only Memory'),
(4, 'ALU is', 'Arithmetic Logic Unit', 'Application Logic Unit', 'Array Logic Unit', 'None of above', 'Arithmetic Logic Unit'),
(5, 'Which of the following is a part of the Central Processing Unit?', 'Printer', 'Mouse', 'Key board', 'Arithmetic & Logic unit', 'Arithmetic & Logic unit'),
(6, 'Examples of output devices are', 'Screen', 'Printer', 'Speaker', 'All of these', 'All of these'),
(7, 'Which of the following is also known as brain of computer', 'Control unit', 'Central Processing unit', 'Arithmetic and language unit', 'Monitor', 'Central Processing unit'),
(8, 'RAM stands for', 'Random origin money', ' Random only memory', 'Read only memory', 'Random access memory', 'Random access memory'),
(9, 'Which one of the following is NOT a computer language?', 'MS-Excel', 'BASIC', 'COBOL', 'C++', 'MS-Excel'),
(10, 'Select the Odd one', 'Operating system', 'Interpreter', 'Compiler', 'Assembler', 'Operating system');

-- --------------------------------------------------------

--
-- Table structure for table `effectivecommunication`
--

CREATE TABLE `effectivecommunication` (
  `QuestionNo` int(5) NOT NULL,
  `Question` varchar(150) NOT NULL,
  `OptionA` varchar(150) NOT NULL,
  `OptionB` varchar(150) NOT NULL,
  `OptionC` varchar(150) NOT NULL,
  `OptionD` varchar(150) NOT NULL,
  `Answer` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `effectivecommunication`
--

INSERT INTO `effectivecommunication` (`QuestionNo`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'Which of these is not an information based system?', 'MIS', 'DSS', 'SIS', 'SDS', 'SDS'),
(2, 'Which of these factors is not required for communication growth?', 'Growth in size of organisations', ' Negative atmosphere', 'Globalisation', 'Public relations', ' Negative atmosphere'),
(3, 'Which of these does not come under behavioural sciences?', 'Globalization', 'Psychology', 'Sociology', 'Transactional Analysis', 'Globalization'),
(4, 'Which of these is the third element of communication?', 'Sender', 'Channel', 'Message', ' Receiver', 'Channel'),
(5, 'Which of these does not come under the four S’s?', 'Simplicity', 'Strength', ' Sincerity', 'Shock', 'Shock'),
(6, 'Globalization, growth of trade unions, public relations and a positive atmosphere are some of the factors that enable ____________.', 'Good friendships', 'Isolation from society', 'Happiness', 'Communication growth', 'Communication growth'),
(7, 'Which of these element is not involved in the process of communication?', 'Pipe', 'Sender', 'Message', 'Channel', 'Pipe'),
(8, 'For effective communication, which of these commandments should one not follow?', 'Objective of communication', 'Inadequate medium', 'Clarity', 'Adequate medium', 'Inadequate medium'),
(9, 'To make our communication effective, we should follow _____ C’s and _____ S’s.', ' seven, four', 'seven, three', ' six, four', 'six, three', ' seven, four'),
(10, 'When speaking on the phone, what type of communication is being used?', 'Verbal and body language', 'Nonverbal communication', 'Face to face', 'Verbal and tone of voice', 'Verbal and tone of voice');

-- --------------------------------------------------------

--
-- Table structure for table `english`
--

CREATE TABLE `english` (
  `QuestionNo` int(5) NOT NULL,
  `Question` varchar(150) NOT NULL,
  `OptionA` varchar(150) NOT NULL,
  `OptionB` varchar(150) NOT NULL,
  `OptionC` varchar(150) NOT NULL,
  `OptionD` varchar(150) NOT NULL,
  `Answer` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `english`
--

INSERT INTO `english` (`QuestionNo`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'I wish I _____ those words. But now it\'s too late. ', 'not having said', 'have never said', 'never said', 'had never said', 'never said'),
(2, 'She was working on her computer with her baby next to _____.', 'herself', 'her', 'her own', 'hers', 'her'),
(3, '_____ in trying to solve this problem. It\'s clearly unsolvable. ', 'There\'s no point', 'It\'s no point', 'There isn\'t point', 'It\'s no need', 'There\'s no point'),
(4, 'We\'ll never know what might have happened _____ the email earlier.', 'if he sent', 'had he sent', 'if he has sent', 'did he sent', 'if he has sent'),
(5, '____ to offend anyone, she said both cakes were equally good.', 'Not wanting', 'As not wanting', 'She didn\'t want', 'Because not wanting', 'She didn\'t want'),
(6, '_____ forced to do anything. He acted of his own free will. ', 'In no way was he', 'No way he was ', 'In any way he was', 'Because not wanting', ' In any way was he'),
(7, 'They didn\'t reach an agreement ______ their differences.', 'on account of', 'due', 'because', 'owing', 'on account of'),
(8, 'He _____ robbed as he was walking out of the bank', 'had', 'did', 'got', 'were', 'got'),
(9, 'If success _____, we need to prepare ourselves for every possible scenario.', 'is to be achieved', 'is achieved', 'will be achieved', 'is due to achieve', 'is to be achieved'),
(10, '______ gifts to the judges. ', 't\'s not allowed offering', 'It\'s not permitted to offer', 'It\'s not permitted offering', 'It\'s not allowed to offer', 'It\'s not allowed to offer');

-- --------------------------------------------------------

--
-- Table structure for table `maths`
--

CREATE TABLE `maths` (
  `QuestionNo` int(5) NOT NULL,
  `Question` varchar(150) NOT NULL,
  `OptionA` varchar(150) NOT NULL,
  `OptionB` varchar(150) NOT NULL,
  `OptionC` varchar(150) NOT NULL,
  `OptionD` varchar(150) NOT NULL,
  `Answer` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `maths`
--

INSERT INTO `maths` (`QuestionNo`, `Question`, `OptionA`, `OptionB`, `OptionC`, `OptionD`, `Answer`) VALUES
(1, 'What is the average of the numbers: 0, 0, 4, 10, 5, and 5 ?', '2', '3', '4', '5', '4'),
(2, '0.003 ? 0.02 = ?', ' 0.06', '0.006', ' 0.0006', '0.00006', '0.00006'),
(3, 'What is the value of x in the equation 3x – 15 – 6 = 0 ?', '7', '8', '9', '-9', '7'),
(4, '|–4| + |4| – 4 + 4 = ?', '0', '2', '4', '8', '8'),
(5, 'What is the rate of discount if a car which price was $4,000 was sold for $3,200 ?', '14%', '16%', '18%', '20%', '20%'),
(6, 'What comes next in the sequence: 1, 3, 11, 43, ____ ?', '161', '171', ' 181', '191', '171'),
(7, 'In a class of 40 students 20% are girls. How many boys are there in the class?', '26', '28', '30', '32', '32'),
(8, '2 + 2 ? 2 ? 2 ÷ 2 = ?', '0', '1', '2', '4', '2'),
(9, 'What comes next in the sequence: 2, 4, 10, 28, ___ ?', '64', '70', '76', '82', '82'),
(10, '|2| + |–2| + (2)2 + (–2)2 = ?', '6', '8', '10', '12', '12');

-- --------------------------------------------------------

--
-- Table structure for table `resigtration`
--

CREATE TABLE `resigtration` (
  `Firstname` varchar(60) NOT NULL,
  `Lastname` varchar(60) NOT NULL,
  `Username` varchar(60) NOT NULL,
  `Password` varchar(60) NOT NULL,
  `Confirm` varchar(60) NOT NULL,
  `Address` varchar(60) NOT NULL,
  `Email` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `resigtration`
--

INSERT INTO `resigtration` (`Firstname`, `Lastname`, `Username`, `Password`, `Confirm`, `Address`, `Email`) VALUES
('eshta', 'shahi', 'eshta', 'eshts', 'eshta', 'DATE', 'eshta@gmail.com'),
('', '', '', '', '', '', ''),
('', '', '', '', '', '', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `computer`
--
ALTER TABLE `computer`
  ADD PRIMARY KEY (`QuestionNo`);

--
-- Indexes for table `effectivecommunication`
--
ALTER TABLE `effectivecommunication`
  ADD PRIMARY KEY (`QuestionNo`);

--
-- Indexes for table `english`
--
ALTER TABLE `english`
  ADD PRIMARY KEY (`QuestionNo`);

--
-- Indexes for table `maths`
--
ALTER TABLE `maths`
  ADD PRIMARY KEY (`QuestionNo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
