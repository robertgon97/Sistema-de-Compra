-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-08-2017 a las 04:30:38
-- Versión del servidor: 10.1.21-MariaDB
-- Versión de PHP: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dbferreteria`
--
CREATE DATABASE IF NOT EXISTS `dbferreteria` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `dbferreteria`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE `clientes` (
  `idCliente` int(11) NOT NULL,
  `nomCliente` varchar(50) NOT NULL,
  `apeCliente` varchar(50) NOT NULL,
  `dniCliente` varchar(50) NOT NULL,
  `telCliente` varchar(20) NOT NULL,
  `rucCliente` text NOT NULL,
  `dirCliente` text NOT NULL,
  `emailCliente` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Truncar tablas antes de insertar `clientes`
--

TRUNCATE TABLE `clientes`;
--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`idCliente`, `nomCliente`, `apeCliente`, `dniCliente`, `telCliente`, `rucCliente`, `dirCliente`, `emailCliente`) VALUES
(1, 'Elias', 'Oropeza', '26793213', '04145887207', 'wefsdf', 'alayon calle principal', 'robertelias64@gmail.com'),
(2, 'Alfonzo', 'Maica', '25123432', '2345678', 'Cliente', '', 'asdasd');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comprobantes`
--

DROP TABLE IF EXISTS `comprobantes`;
CREATE TABLE `comprobantes` (
  `idComprobante` int(11) NOT NULL,
  `fechaComprobante` varchar(50) NOT NULL,
  `tipoComprobante` varchar(50) NOT NULL,
  `numComprobante` int(50) NOT NULL,
  `idCliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Truncar tablas antes de insertar `comprobantes`
--

TRUNCATE TABLE `comprobantes`;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallecomprobantes`
--

DROP TABLE IF EXISTS `detallecomprobantes`;
CREATE TABLE `detallecomprobantes` (
  `idComprobante` int(11) NOT NULL,
  `idNotaPedido` int(11) NOT NULL,
  `montoTotal` int(50) NOT NULL,
  `montoIgv` int(50) NOT NULL,
  `montoNeto` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Truncar tablas antes de insertar `detallecomprobantes`
--

TRUNCATE TABLE `detallecomprobantes`;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

DROP TABLE IF EXISTS `empleados`;
CREATE TABLE `empleados` (
  `idEmpleado` int(11) NOT NULL,
  `nomEmpleado` varchar(50) NOT NULL,
  `apeEmpleado` varchar(50) NOT NULL,
  `dniEmpleado` varchar(50) NOT NULL,
  `dirEmpleado` text NOT NULL,
  `emailEmpleado` varchar(50) NOT NULL,
  `userEmpleado` varchar(50) NOT NULL,
  `claveEmpleado` varchar(50) NOT NULL,
  `cargoEmpleado` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Truncar tablas antes de insertar `empleados`
--

TRUNCATE TABLE `empleados`;
--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`idEmpleado`, `nomEmpleado`, `apeEmpleado`, `dniEmpleado`, `dirEmpleado`, `emailEmpleado`, `userEmpleado`, `claveEmpleado`, `cargoEmpleado`) VALUES
(1, 'Robert', 'Gonzalez', '26793213', 'alayon', 'robertelias64@gmail.com', 'robert', 'motorola', 'Vendedor'),
(2, 'Pedrito', 'Pedroso', '123456789', 'Mariara', 'pedritopedroso@gmail.com', 'pedrito', 'motorola', 'Expecialista');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

DROP TABLE IF EXISTS `productos`;
CREATE TABLE `productos` (
  `idProductos` int(11) NOT NULL,
  `nomProducto` varchar(50) NOT NULL,
  `stockProducto` varchar(50) NOT NULL,
  `desProducto` text NOT NULL,
  `precioUnitarioProducto` varchar(50) NOT NULL,
  `ubicacionProducto` text NOT NULL,
  `tipoProducto` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Truncar tablas antes de insertar `productos`
--

TRUNCATE TABLE `productos`;
--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`idProductos`, `nomProducto`, `stockProducto`, `desProducto`, `precioUnitarioProducto`, `ubicacionProducto`, `tipoProducto`) VALUES
(1, 'Vasitos', '50', 'Vasito hermoso blanco de tamaño mediano que cave estrechamente en ele ano', '150', 'Caja', 'Plastico'),
(2, 'Zapato', '135', 'Zapato nike de talla 40', '25000', 'Caja', 'Calzado');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indices de la tabla `comprobantes`
--
ALTER TABLE `comprobantes`
  ADD PRIMARY KEY (`idComprobante`);

--
-- Indices de la tabla `detallecomprobantes`
--
ALTER TABLE `detallecomprobantes`
  ADD PRIMARY KEY (`idComprobante`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`idEmpleado`),
  ADD UNIQUE KEY `unico` (`userEmpleado`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`idProductos`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `comprobantes`
--
ALTER TABLE `comprobantes`
  MODIFY `idComprobante` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `detallecomprobantes`
--
ALTER TABLE `detallecomprobantes`
  MODIFY `idComprobante` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `idEmpleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `idProductos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
