create database Empresa_mercancia
use Empresa_mercancia

create table Origen(
Origen_rif varchar(50) primary key,
Origen_nom varchar(100),
Orign_act varchar(30),
Orign_ciudad varchar(30),
Orign_dir varchar(30),
Orign_tel varchar(30),
Orign_Cel varchar(30),)

create table Destino(
Dest_id varchar(40) primary key,
dest_nom varchar(100),
Dest_cod_ciudad varchar (40),
Dest_ciudad varchar(50),
Dest_dir varchar(30),
Dest_tel varchar(30),
Dest_km int)

create table Guia(
Guia_no varchar(50) primary key,
Guia_fecha date,
Guia_hora time,
Origen_rif varchar(50),
Dest_id varchar(40),
constraint apodo1 foreign key (Origen_rif) references Origen (Origen_rif),
constraint apodo2 foreign key (Dest_id) references Destino (dest_id))

create table Paquete(
Codigo varchar(30) primary key,
Tipo varchar(30),
Nombre_paq varchar(30),
Valor int,
Guia_no varchar(50),
constraint apodo3 foreign key (Guia_no) references Guia (Guia_no))






