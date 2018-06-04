-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-06-2018 a las 01:31:05
-- Versión del servidor: 10.1.31-MariaDB
-- Versión de PHP: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdprestomas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `avaluos`
--

CREATE TABLE `avaluos` (
  `idavaluos` int(11) NOT NULL,
  `familia` varchar(25) NOT NULL,
  `subfamilia` varchar(25) NOT NULL,
  `marca` varchar(15) NOT NULL,
  `modelo` varchar(15) NOT NULL,
  `fecha` date NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `descripcion` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `avaluos`
--

INSERT INTO `avaluos` (`idavaluos`, `familia`, `subfamilia`, `marca`, `modelo`, `fecha`, `precio`, `descripcion`) VALUES
(1, 'Electronicos', 'Item 1', 'Item 1', '23423', '2018-05-17', '3454.00', 'fsdgdfsd'),
(2, 'Electronicos', 'Item 2', 'Item 4', 'fdsf233', '2018-05-10', '44555.00', 'asgfdgdfgs dfsdfs'),
(3, 'Electronicos', 'Item 1', 'Item 1', 'hijkkg', '2018-06-02', '67756.00', 'ygjkhh'),
(4, 'Articulos Industriales', 'Item 3', 'Item 4', 'xbn42-sd32', '2002-06-08', '5000.75', 'Es un equipo muy capaz'),
(5, 'Articulos Industriales', 'Item 2', 'Item 3', '3432sada', '1997-06-20', '6434.00', 'safdgd dsfadf sfasfds a '),
(6, 'Articulos Industriales', 'Item 3', 'Item 3', '4edf42', '2014-06-06', '5326.00', 'saf asfas  faf'),
(7, 'Electronicos', 'Item 1', 'Item 1', '32sdf23', '2016-06-19', '435324.00', 'sdfsd dsfsd  sdfsd '),
(8, 'Vehiculos', 'Item 3', 'Item 4', '134', '2018-06-09', '3424.00', 'sdf  sdf ss sf'),
(9, 'Motocicletas', 'Item 3', 'Item 3', '2342342', '2018-06-16', '56534.00', 'dfsd sd s dfsdfsd '),
(10, 'Instrumentos Musicales', 'Item 4', 'Item 3', '23bve23v', '2018-06-16', '32543.00', 'dsfsd sdfsdf '),
(11, 'Instrumentos Musicales', 'Item 4', 'Item 4', '452dfvsd', '2018-06-21', '5432.00', 'dsf  asdasdas asdasda '),
(12, 'Motocicletas', 'Item 4', 'Item 4', 'xcgddfw44', '2018-06-15', '4234.00', 'dfsfds shgfh tye efsdt ujrthn ');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `avaluos`
--
ALTER TABLE `avaluos`
  ADD PRIMARY KEY (`idavaluos`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `avaluos`
--
ALTER TABLE `avaluos`
  MODIFY `idavaluos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
