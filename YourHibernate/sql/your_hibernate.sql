-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 29-Set-2017 às 01:53
-- Versão do servidor: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `your_hibernate`
--
CREATE DATABASE IF NOT EXISTS `your_hibernate` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `your_hibernate`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbcategory`
--

CREATE TABLE IF NOT EXISTS `tbcategory` (
  `idCategory` int(11) NOT NULL,
  `description` varchar(20) NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbcategory`
--

INSERT INTO `tbcategory` (`idCategory`, `description`, `status`) VALUES
(1, 'Comida', 1),
(2, 'Bebida', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbproduct`
--

CREATE TABLE IF NOT EXISTS `tbproduct` (
  `idProduct` int(11) NOT NULL,
  `description` varchar(20) NOT NULL,
  `qtd` int(11) NOT NULL,
  `idCategory` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbproduct`
--

INSERT INTO `tbproduct` (`idProduct`, `description`, `qtd`, `idCategory`) VALUES
(1, 'Arroz', 52, 1),
(2, 'Leite', 30, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbcategory`
--
ALTER TABLE `tbcategory`
  ADD PRIMARY KEY (`idCategory`);

--
-- Indexes for table `tbproduct`
--
ALTER TABLE `tbproduct`
  ADD PRIMARY KEY (`idProduct`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbcategory`
--
ALTER TABLE `tbcategory`
  MODIFY `idCategory` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `tbproduct`
--
ALTER TABLE `tbproduct`
  MODIFY `idProduct` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
