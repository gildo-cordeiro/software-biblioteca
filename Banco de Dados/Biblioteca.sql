-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 18-Jan-2019 às 13:38
-- Versão do servidor: 10.1.31-MariaDB
-- PHP Version: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `biblioteca`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `alunos`
--

CREATE TABLE `alunos` (
  `matricula` varchar(45) COLLATE utf8_bin NOT NULL,
  `nome` varchar(45) COLLATE utf8_bin NOT NULL,
  `turma` varchar(45) COLLATE utf8_bin NOT NULL,
  `senha` varchar(45) COLLATE utf8_bin NOT NULL,
  `email` varchar(45) COLLATE utf8_bin NOT NULL,
  `punicao` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `quant_livros` int(11) DEFAULT NULL,
  `quant_punicao` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Estrutura da tabela `autor`
--

CREATE TABLE `autor` (
  `idAutor` int(11) NOT NULL,
  `nome` varchar(45) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Estrutura da tabela `autorlivro`
--

CREATE TABLE `autorlivro` (
  `Id_Autor` int(11) NOT NULL,
  `ISBN_Livro` varchar(45) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Estrutura da tabela `editora`
--

CREATE TABLE `editora` (
  `idEditora` int(11) NOT NULL,
  `nome` varchar(45) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Estrutura da tabela `emprestimos`
--

CREATE TABLE `emprestimos` (
  `idEmprestimos` int(11) NOT NULL,
  `data_devolucao` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `data_punicao` int(45) DEFAULT NULL,
  `data_emprestimos` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `id_alunos` varchar(45) COLLATE utf8_bin NOT NULL,
  `matFun` varchar(45) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

--
-- Acionadores `emprestimos`
--
DELIMITER $$
CREATE TRIGGER `TrgAlunoDelete` AFTER DELETE ON `emprestimos` FOR EACH ROW BEGIN
	UPDATE alunos SET quant_livros = quant_livros - 1
WHERE matricula = OLD.id_alunos;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `TrgAlunoInsert` BEFORE INSERT ON `emprestimos` FOR EACH ROW BEGIN
	UPDATE alunos SET quant_livros = quant_livros + 1
WHERE matricula = NEW.id_alunos;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `mat` varchar(45) COLLATE utf8_bin NOT NULL,
  `nome` varchar(45) COLLATE utf8_bin NOT NULL,
  `senha` varchar(45) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`mat`, `nome`, `senha`) VALUES
('01', 'Gildo Cordeiro Duarte', '1234'),
('02', 'Matheus Henrique Estevam', '123'),
('03', 'Lucas Gomes Pereira', '123'),
('04', 'Layane Carolaine da Silva Sena', '123'),
('05', 'Layabe Carolaine da Silva Sena', '123'),
('69', 'Lucas Gomes', '1234');

-- --------------------------------------------------------

--
-- Estrutura da tabela `genero`
--

CREATE TABLE `genero` (
  `idGenero` int(11) NOT NULL,
  `nome` varchar(45) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Estrutura da tabela `livrogen`
--

CREATE TABLE `livrogen` (
  `ISBN_Livro` varchar(45) COLLATE utf8_bin NOT NULL,
  `id_Genero` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Estrutura da tabela `livros`
--

CREATE TABLE `livros` (
  `ISBN` varchar(45) COLLATE utf8_bin NOT NULL,
  `titulo` varchar(45) COLLATE utf8_bin NOT NULL,
  `editora` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Estrutura da tabela `livrosemprestimos`
--

CREATE TABLE `livrosemprestimos` (
  `id_ISBN` varchar(45) COLLATE utf8_bin NOT NULL,
  `id_Emp` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `alunos`
--
ALTER TABLE `alunos`
  ADD PRIMARY KEY (`matricula`);

--
-- Indexes for table `autor`
--
ALTER TABLE `autor`
  ADD PRIMARY KEY (`idAutor`);

--
-- Indexes for table `autorlivro`
--
ALTER TABLE `autorlivro`
  ADD PRIMARY KEY (`Id_Autor`,`ISBN_Livro`),
  ADD KEY `id_liv` (`ISBN_Livro`);

--
-- Indexes for table `editora`
--
ALTER TABLE `editora`
  ADD PRIMARY KEY (`idEditora`);

--
-- Indexes for table `emprestimos`
--
ALTER TABLE `emprestimos`
  ADD PRIMARY KEY (`idEmprestimos`),
  ADD KEY `emprestimos_ibfk_1` (`matFun`),
  ADD KEY `emprestimos_ibfk_2` (`id_alunos`);

--
-- Indexes for table `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`mat`);

--
-- Indexes for table `genero`
--
ALTER TABLE `genero`
  ADD PRIMARY KEY (`idGenero`);

--
-- Indexes for table `livrogen`
--
ALTER TABLE `livrogen`
  ADD PRIMARY KEY (`ISBN_Livro`,`id_Genero`),
  ADD KEY `id_Gen` (`id_Genero`);

--
-- Indexes for table `livros`
--
ALTER TABLE `livros`
  ADD PRIMARY KEY (`ISBN`),
  ADD KEY `editora` (`editora`);

--
-- Indexes for table `livrosemprestimos`
--
ALTER TABLE `livrosemprestimos`
  ADD PRIMARY KEY (`id_Emp`),
  ADD KEY `livrosemprestimos_ibfk_2` (`id_ISBN`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `autor`
--
ALTER TABLE `autor`
  MODIFY `idAutor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `editora`
--
ALTER TABLE `editora`
  MODIFY `idEditora` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `emprestimos`
--
ALTER TABLE `emprestimos`
  MODIFY `idEmprestimos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `genero`
--
ALTER TABLE `genero`
  MODIFY `idGenero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `autorlivro`
--
ALTER TABLE `autorlivro`
  ADD CONSTRAINT `autorlivro_ibfk_1` FOREIGN KEY (`Id_Autor`) REFERENCES `autor` (`idAutor`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `autorlivro_ibfk_2` FOREIGN KEY (`ISBN_Livro`) REFERENCES `livros` (`ISBN`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `emprestimos`
--
ALTER TABLE `emprestimos`
  ADD CONSTRAINT `emprestimos_ibfk_1` FOREIGN KEY (`matFun`) REFERENCES `funcionario` (`mat`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `emprestimos_ibfk_2` FOREIGN KEY (`id_alunos`) REFERENCES `alunos` (`matricula`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `livrogen`
--
ALTER TABLE `livrogen`
  ADD CONSTRAINT `livrogen_ibfk_1` FOREIGN KEY (`ISBN_Livro`) REFERENCES `livros` (`ISBN`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `livrogen_ibfk_2` FOREIGN KEY (`id_Genero`) REFERENCES `genero` (`idGenero`);

--
-- Limitadores para a tabela `livros`
--
ALTER TABLE `livros`
  ADD CONSTRAINT `livros_ibfk_1` FOREIGN KEY (`editora`) REFERENCES `editora` (`idEditora`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `livrosemprestimos`
--
ALTER TABLE `livrosemprestimos`
  ADD CONSTRAINT `livrosemprestimos_ibfk_2` FOREIGN KEY (`id_ISBN`) REFERENCES `livros` (`ISBN`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `livrosemprestimos_ibfk_3` FOREIGN KEY (`id_Emp`) REFERENCES `emprestimos` (`idEmprestimos`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
