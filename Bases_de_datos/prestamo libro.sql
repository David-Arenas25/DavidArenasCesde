create database prestamo_libro
use prestamo_libro

create table asignaturas(
asignautra varchar(50) primary key,
aula varchar(20),
curso varchar(20))

create table libros(
libro varchar(50) primary key,
editorial varchar(50),
fecha_prestamo date)

create table profesores(
colegio varchar(50) primary key,
profesor varchar(50))

create table asig_prof(
colegio varchar(50),
asignatura varchar(50),
constraint fkcolegio foreign key (colegio) references profesores (colegio),
constraint fkasignatura foreign key (asignatura) references asignaturas (asignautra))

create table libros_prof(
colegio varchar(50),
libro varchar(50),
constraint fkcolegio1 foreign key (colegio) references profesores (colegio),
constraint fklibro foreign key (libro) references libros (libro))