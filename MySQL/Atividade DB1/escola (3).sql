create database db_escola;

use db_escola;

create table tb_alunos(
	id bigint auto_increment,
    nome varchar(50) not null,
    idade int,
    nota float not null,
    sala int,
    primary key(id)
);

insert into tb_alunos(nome,idade,sala,nota) values ("Maia",8,12,8.5);
insert into tb_alunos(nome,idade,sala,nota) values ("João",7,11,6.5);
insert into tb_alunos(nome,idade,sala,nota) values ("Pedro",9,13,7.5);
insert into tb_alunos(nome,idade,sala,nota) values ("Carla",8,12,5.5);
insert into tb_alunos(nome,idade,sala,nota) values ("Maia",8,12,8.5);
insert into tb_alunos(nome,idade,sala,nota) values ("Luana",10,14,9.5);
insert into tb_alunos(nome,idade,sala,nota) values ("Carlos",8,12,3.5);
insert into tb_alunos(nome,idade,sala,nota) values ("Carol",7,11,4.5);

update tb_alunos set nome="Marcely",idade=7,sala=11,nota=7 where id=1;

select*from tb_alunos;
select*from tb_alunos where nota<7;
select*from tb_alunos where nota>=7;