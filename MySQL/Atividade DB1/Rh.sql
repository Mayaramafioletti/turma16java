create database db_rh_servico;

use db_rh_servico;

create table tb_funcionarios(
	id bigint auto_increment,
    nome varchar(100) not null,
    idade int,
    salario float not null,
    setor varchar(150),
    primary key(id)
);

insert into tb_funcionarios(nome,idade,salario,setor) values ("José",31,10000,"Tecnologia");
insert into tb_funcionarios(nome,idade,salario,setor) values ("Fernanda",40,20000,"Juridico");
insert into tb_funcionarios(nome,idade,salario,setor) values ("Renan",21,1500,"Telemarketing");
insert into tb_funcionarios(nome,idade,salario,setor) values ("Maria",35,35000,"CEO");
insert into tb_funcionarios(nome,idade,salario,setor) values ("Marcela",18,1000,"Jovem aprendiz");

update tb_funcionarios set salario=1100 where id=5;

select*from tb_funcionarios;
select*from tb_funcionarios where salario>2000;
select*from tb_funcionarios where salario<2000;

