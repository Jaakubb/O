-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Czas generowania: 06 Lis 2022, 13:54
-- Wersja serwera: 10.4.11-MariaDB
-- Wersja PHP: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `auta`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `auta`
--

CREATE TABLE `auta` (
  `id` int(11) NOT NULL,
  `marka` varchar(15) NOT NULL,
  `kolor` varchar(15) NOT NULL,
  `przyspieszenie` int(11) DEFAULT NULL,
  `rocznik` int(11) DEFAULT NULL,
  `predkosc` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `auta`
--

INSERT INTO `auta` (`id`, `marka`, `kolor`, `przyspieszenie`, `rocznik`, `predkosc`) VALUES
(2, 'bmw', 'niebieski', 3, 2020, 100),
(3, 'audi', 'czerwony', 3, 2020, 200);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `generator`
--

CREATE TABLE `generator` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `generator`
--

INSERT INTO `generator` (`next_val`) VALUES
(151);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `ocena`
--

CREATE TABLE `ocena` (
  `id_o` int(11) NOT NULL,
  `ocena` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `wagi`
--

CREATE TABLE `wagi` (
  `id_w` int(11) NOT NULL,
  `predkosc` int(11) NOT NULL,
  `przyspieszenie` int(11) NOT NULL,
  `rocznik` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `wagi`
--

INSERT INTO `wagi` (`id_w`, `predkosc`, `przyspieszenie`, `rocznik`) VALUES
(1, 10, 5, 3);

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `auta`
--
ALTER TABLE `auta`
  ADD PRIMARY KEY (`id`);

--
-- Indeksy dla tabeli `ocena`
--
ALTER TABLE `ocena`
  ADD PRIMARY KEY (`id_o`);

--
-- Indeksy dla tabeli `wagi`
--
ALTER TABLE `wagi`
  ADD PRIMARY KEY (`id_w`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
