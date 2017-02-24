SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Database: `springtest`
--
CREATE DATABASE `springtest` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `springtest`;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `emp_id` int(10) NOT NULL auto_increment,
  `name` varchar(10) NOT NULL,
  `image` blob,
  PRIMARY KEY  (`emp_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

