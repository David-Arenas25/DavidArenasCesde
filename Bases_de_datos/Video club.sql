create database Video_club
use Video_club

create table cliente(
cod_cliente varchar(50) primary key,
num_mebresia varchar(50),
nom_cliente varchar(100),
telef_cliente varchar(20),
dir_cliente varchar (50))

create table pelicula(
cod_pelicula varchar(50) primary key,
cod_tipo varchar (30),
categoria varchar (30),
nom_pelicula varchar (40))

create table actor(
cod_actor varchar(50) primary key,
nom_actor varchar(100),
fechanac_actor date)

create table actor_pel(
cod_pelicula varchar(50),
cod_actor varchar (50),
constraint apodo1 foreign key (cod_pelicula) references pelicula (cod_pelicula),
constraint apodo2 foreign key (cod_actor) references actor (cod_actor))

create table alquiler(
cod_alquiler varchar(50) primary key,
fecha_alquiler date,
valor_alquiler bigint,
fecha_dev date,
cantidad int,
cod_cliente varchar(50),
constraint apodo3 foreign key (cod_cliente) references cliente (cod_cliente))

create table cassete(
cod_cassete varchar(50) primary key,
num_copias int,
formato varchar(30),
cod_pelicula varchar(50),
constraint apodo4 foreign key (cod_pelicula) references pelicula (cod_pelicula))

create table cassete_alquiler(
cod_cassete varchar(50),
cod_alquiler varchar(50),
constraint apodo5 foreign key (cod_cassete) references cassete (cod_cassete),
constraint apodo6 foreign key (cod_alquiler) references alquiler (cod_alquiler))