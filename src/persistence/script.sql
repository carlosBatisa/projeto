drop database if exists proj1;

create database proj1;
use proj1;

create table funcionario (
	idFuncionario int primary key,
	nome varchar(35),
	email varchar(50) unique,
	salario double);
	
create table funcionarioCLT(
	id_Funcionario int primary key,
	dataCadastro date,
	foreign key(id_Funcionario) references funcionario(idFuncionario));
);

insert into funcionario values(10,'jose','jose@hotmail.com',2000.);
insert into funcionarioCLT values(10,now());

insert into funcionario values(12,'sergio','sergio@hotmail.com',3000.);
insert into funcionarioCLT values(12,now());

select * from funcionario;
select * from funcionarioCLT;