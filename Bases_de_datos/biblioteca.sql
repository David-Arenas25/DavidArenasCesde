create database biblioteca
use biblioteca

create table libros(
cod_libro varchar(20) primary key,
titulo varchar(50))

create table autores(
autor varchar(30) primary key,
editorial varchar(30))

create table lectores(
nom_lector varchar(50) primary key,
fecha_dev date)

create table lectores_libro(
cod_libro varchar(20),
nom_lector varchar (50),
constraint fk_codlibro foreign key (cod_libro) references libros (cod_libro),
constraint fk_nomlector foreign key (nom_lector) references lectores (nom_lector))

create table autores_libro(
cod_libro varchar (20),
autor varchar(30),
constraint fk_codlibro1 foreign key (cod_libro) references libros (cod_libro),
constraint fk_nomlector1 foreign key (autor) references autores (autor))