create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
id bigint auto_increment,
categoria varchar(100) not null,
receita boolean,
primary key(id)
);

insert tb_categoria (categoria,receita) values("maquiagem", false);
insert tb_categoria (categoria,receita) values("mediacamentos", false);
insert tb_categoria (categoria,receita) values("infantil", false);
insert tb_categoria (categoria,receita) values("medicamentos", true);
insert tb_categoria (categoria,receita) values("suplementos", true);

select*from tb_categoria;

create table tb_produto(
id bigint auto_increment,
nome varchar(100)  not null,
proposito varchar(255),
valor float not null,
disponível boolean,
categoria_id bigint,
primary key(id),
foreign key (categoria_id) references tb_categoria(id)
);

insert tb_produto (nome,proposito,valor,disponível,categoria_id) values("neosaldina","dor de cabeça",27.29, true,2);
insert tb_produto (nome,proposito,valor,disponível,categoria_id) values("rivotril","tranquilizante",169.9, false,4);
insert tb_produto (nome,proposito,valor,disponível,categoria_id) values("pó compacto","estética",34.29, true,1);
insert tb_produto (nome,proposito,valor,disponível,categoria_id) values("fraldas","-",33.99, true,3);
insert tb_produto (nome,proposito,valor,disponível,categoria_id) values("mascara de cilios","-",44.29, true,1);
insert tb_produto (nome,proposito,valor,disponível,categoria_id) values("esomex","dor de estomago",119.9, true,2);
insert tb_produto (nome,proposito,valor,disponível,categoria_id) values("amoxicilina","antibiotico",51.9, true,4);
insert tb_produto (nome,proposito,valor,disponível,categoria_id) values("talco","-",16.9, true,3);

select*from tb_produto;
select*from tb_produto where valor>50;
select*from tb_produto where valor>3 and valor<60;
select*from tb_produto where nome like "%b%";
select nome, valor, disponível, proposito, tb_categoria.categoria, tb_categoria. receita from tb_produto inner join tb_categoria on tb_categoria.id=tb_produto.categoria_id;
select nome, valor, disponível, proposito, tb_categoria.categoria, tb_categoria. receita from tb_produto inner join tb_categoria on tb_categoria.id=tb_produto.categoria_id
	where categoria="infantil";


