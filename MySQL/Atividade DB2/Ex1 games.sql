create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
	id bigint(5) auto_increment,
    posição varchar(150) not null,
    ativo boolean not null,
    primary key(id)
);

insert tb_classe (posição, ativo) values("arqueiro",true);
insert tb_classe (posição, ativo) values("defesa",true);
insert tb_classe (posição, ativo) values("ataque primeira linha",true);
insert tb_classe (posição, ativo) values("cavaleiro",false);
insert tb_classe (posição, ativo) values("cuidadores",true);

select*from tb_classe;

create table tb_personagens(
id bigint(8) auto_increment,
nome varchar(150) not null,
poder_ataque int not null,
poder_defesa int not null,
classe_id bigint,
primary key(id),
foreign key (classe_id) references tb_classe (id)
);

insert tb_personagens(nome,poder_ataque,poder_defesa,classe_id) values("Maia",5000,950,3);
insert tb_personagens(nome,poder_ataque,poder_defesa,classe_id) values("John",500,1550,5);
insert tb_personagens(nome,poder_ataque,poder_defesa,classe_id) values("Luigi",10000,8050,1);
insert tb_personagens(nome,poder_ataque,poder_defesa,classe_id) values("Carl",50000,150,3);
insert tb_personagens(nome,poder_ataque,poder_defesa,classe_id) values("Nath",1000,1150,4);
insert tb_personagens(nome,poder_ataque,poder_defesa,classe_id) values("Kath",150,19950,2);
insert tb_personagens(nome,poder_ataque,poder_defesa,classe_id) values("Mario",5400,3950,2);
insert tb_personagens(nome,poder_ataque,poder_defesa,classe_id) values("Lori",400,950,5);

select*from tb_personagens;
select*from tb_personagens where poder_ataque>2000;
select*from tb_personagens where poder_defesa>1000 and poder_defesa<2000;
select*from tb_personagens where nome like "%c%";
select nome, poder_ataque,poder_defesa, tb_classe.ativo,tb_classe.posição from tb_personagens inner join tb_classe on tb_classe.id = tb_personagens.classe_id;
select nome, poder_ataque,poder_defesa, tb_classe.ativo,tb_classe.posição from tb_personagens inner join tb_classe on tb_classe.id = tb_personagens.classe_id where posição="arqueiro";
select*from tb_classe inner join tb_personagens on tb_classe.id = tb_personagens.classe_id;
