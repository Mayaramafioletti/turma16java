create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria(
id bigint auto_increment,
categoria varchar(100),
disponível boolean,
primary key(id)
);

insert tb_categoria (categoria, disponível) values ("bovino",true);
insert tb_categoria (categoria, disponível) values ("suino",true);
insert tb_categoria (categoria, disponível) values ("aves",true);
insert tb_categoria (categoria, disponível) values ("imbutidos",true);
insert tb_categoria (categoria, disponível) values ("vegetariano",true);

create table tb_produto(
id bigint auto_increment,
nome varchar(100),
valor float,
quantidade int,
categoria_id bigint,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)
);

insert tb_produto(nome, valor, quantidade,  categoria_id) values ("Asa de frando",40.00,30,3);
insert tb_produto(nome, valor, quantidade,  categoria_id) values ("Picanha",20.00,30,1);
insert tb_produto(nome, valor, quantidade, categoria_id) values ("coxa de frango",20.00,30,3);
insert tb_produto(nome, valor, quantidade, categoria_id) values ("Bacon",30.00,30,5);
insert tb_produto(nome, valor, quantidade,  categoria_id) values ("hamburguer",60.00,30,5);
insert tb_produto(nome, valor, quantidade, categoria_id) values ("Cupim",20.00,30,1);
insert tb_produto(nome, valor, quantidade, categoria_id) values ("Salame",18.00,30,4);
insert tb_produto (nome, valor, quantidade, categoria_id) values ("mocoto",20.00,30,2);

select*from tb_produto;
select*from tb_produto where valor>50;
select*from tb_produto where valor>3 and valor<60;
select nome, tb_categoria.categoria, valor, tb_categoria.disponível, quantidade from tb_produto inner join tb_categoria on tb_categoria.id =tb_produto.categoria_id;
select nome, tb_categoria.categoria, valor, tb_categoria.disponível, quantidade from tb_produto inner join tb_categoria on tb_categoria.id =tb_produto.categoria_id 
	where categoria = "vegetariano";
