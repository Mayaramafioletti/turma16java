create database db_ecommerce;
use db_ecommerce;
CREATE TABLE categoria (
	id int NOT NULL AUTO_INCREMENT,
	nome varchar(255) NOT NULL, -- categoria
	classificacao varchar(255) NOT NULL, -- subcategoria
	ativo BOOLEAN NOT NULL,
	PRIMARY KEY (id)
);
CREATE TABLE produto (
	id INT NOT NULL AUTO_INCREMENT,
	nome varchar(255) NOT NULL,
	descricao varchar(255) NOT NULL,
	localizacao varchar(255) NOT NULL,
	valor DECIMAL NOT NULL, -- preco do produto para o usuário
	estoque FLOAT NOT NULL, -- permitir o controle de estoque
	categoria_id INT NOT NULL, --
	PRIMARY KEY (id),
    FOREIGN KEY (categoria_id) REFERENCES categoria(id)
);
CREATE TABLE usuario (
	id INT NOT NULL AUTO_INCREMENT,
	nome varchar(255) NOT NULL,
	email varchar(255) NOT NULL,
	senha varchar(255) NOT NULL,
	localizacao varchar(255) NOT NULL, -- sustentabilidade exige o mínimo de transporte
	vendedor BOOLEAN NOT NULL, -- caso seja vendedor 
	comprador BOOLEAN NOT NULL, -- caso seja comprador, permitimos que o mesmo usuário use as duas funçoes
	PRIMARY KEY (id)
);