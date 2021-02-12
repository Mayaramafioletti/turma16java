create database ecommerce;

use ecommerce;

create table tb_produtos(
	id bigint auto_increment,
	nome varchar(100) not null,
    preco float not null,
    tamanho char(2),
    cor varchar(100),
    primary key(id)
);

insert into tb_produtos (nome,preco, cor,tamanho) values("Urso de pelucia",49.99,"rosa","P");
insert into tb_produtos (nome,preco, cor,tamanho) values("Urso de pelucia",169.90,"azul","M");
insert into tb_produtos (nome,preco, cor,tamanho) values("Urso de pelucia",499.90,"rosa","G");
insert into tb_produtos (nome,preco, cor,tamanho) values("Urso de pelucia",569.9,"roxo","GG");
insert into tb_produtos (nome,preco, cor,tamanho) values("Coruja de pelucia",69.99,"roxo","P");
insert into tb_produtos (nome,preco, cor,tamanho) values("Coruja de pelucia",589.99,"rosa","GG");
insert into tb_produtos (nome,preco, cor,tamanho) values("Vaca de pelucia",29.99,"branco e preto","P");
insert into tb_produtos (nome,preco, cor,tamanho) values("Coruja de pelucia",500,"azul","G");

update tb_produtos set preco=159.9, tamanho = "M" where id=7;

select*from tb_produtos;
select*from tb_produtos where preco<500;
select*from tb_produtos where preco>500;



