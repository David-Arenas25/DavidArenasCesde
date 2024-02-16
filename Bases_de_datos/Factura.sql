create database Factura_venta
use Factura_venta

create table Cliente(
Rif_cliente varchar(50) primary key,
Nom_cliente varchar(100),
Dir_cliente varchar(40),
Telef_cliente bigint)

create table Factura(
Num_Fac varchar(50) primary key,
Fecha_fac date,
Rif_cliente varchar(50),
constraint apodo1 foreign key (Rif_cliente) references Cliente (Rif_cliente))

create table Producto(
Cod_prod varchar(50) primary key,
Categoria varchar(50),
Descripcion varchar(100),
Cant_prod int,
Val_unit int)

create table Factura_prod(
Num_fact varchar(50),
Cod_prod varchar(50),
constraint apodo2 foreign key (Num_fact) references Factura (Num_fac),
constraint apodo3 foreign key (Cod_prod) references Producto (Cod_prod))