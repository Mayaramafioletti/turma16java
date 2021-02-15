create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categorias(
id bigint(5) auto_increment,
tipo varchar(100) not null,
borda varchar(100) not null,
massa varchar(100),
primary key(id)
);

insert tb_categorias (tipo, borda, massa) values ("doce","chocolte","fina");
insert tb_categorias (tipo, borda, massa) values ("salgada","catupiry","média");
insert tb_categorias (tipo, borda, massa) values ("vegana","tofu","fina");
insert tb_categorias (tipo, borda, massa) values ("salgada","chedder","grossa");
insert tb_categorias (tipo, borda, massa) values ("vegana","sem recheio","fina");
select*from tb_categorias;

create table tb_pizza(
id bigint(8) auto_increment,
nome varchar(255) not null,
valor float not null,
descrição varchar(255),
disponível boolean,
categoria_id bigint,
primary key(id),
foreign key(categoria_id) references tb_categorias(id)
);

insert tb_pizza(nome,valor,descrição,disponível,categoria_id) values ("portuguesa", 39.9, "ovo,cebola,presunto",true,2);
insert tb_pizza(nome,valor,descrição,disponível,categoria_id) values ("4 queijos", 24.9, "catupiry,cheddat,muzarela,prato",true,2);
insert tb_pizza(nome,valor,descrição,disponível,categoria_id) values ("milho", 44.9, "milho, tofu",true,5);
insert tb_pizza(nome,valor,descrição,disponível,categoria_id) values ("portuguesa", 39.9, "ovo,cebola,presunto",true,2);
insert tb_pizza(nome,valor,descrição,disponível,categoria_id) values ("carne seca", 47.9, "carne seca, cebola, muzarela",false,2);
insert tb_pizza(nome,valor,descrição,disponível,categoria_id) values ("banana com canela", 39.9, "banana e canela",true,1);
insert tb_pizza(nome,valor,descrição,disponível,categoria_id) values ("calabrea", 39.9, "calabresa e cebola",true,4);
insert tb_pizza(nome,valor,descrição,disponível,categoria_id) values ("Abobrinha", 39.9, "abobrinha e cebola",true,3);

update tb_pizza set nome="frango com catupiry", descrição="frango e catupiry", valor=29.99 where id=2;
select*from tb_pizza;

select*from tb_pizza where valor>45;
select*from tb_pizza where valor>29 and valor<60;
select*from tb_pizza where nome like"%c%";
select nome,valor,descrição,tb_categorias.tipo,disponível from tb_pizza inner join tb_categorias on tb_categorias.id = tb_pizza.categoria_id;
select nome,valor,descrição,tb_categorias.tipo,disponível from tb_pizza inner join tb_categorias on tb_categorias.id = tb_pizza.categoria_id where tipo="vegana";