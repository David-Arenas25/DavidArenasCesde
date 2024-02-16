create database registro_matricula
use registro_matricula

create table alumno(
cod_alumno varchar(30) primary key,
nom_alumno varchar(100))

create table cursos(
cod_curso varchar(30) primary key,
nom_curso varchar(30),
especialidad varchar(40))

create table docente(
id_docente varchar(40) primary key,
nom_docente varchar(100),
oficina varchar(10),
curso varchar(10))

create table curso_alu(
cod_alumno varchar (30),
cod_curso varchar(30),
constraint fkcod_alum foreign key (cod_alumno) references alumno (cod_alumno),
constraint fkcod_curso foreign key (cod_curso) references cursos (cod_curso))

create table cursos_docente(
cod_curso varchar(30),
id_docente varchar (40),
constraint fk_codcurso foreign key (cod_curso) references cursos (cod_curso),
constraint fk_docente foreign key (id_docente) references docente (id_docente))

