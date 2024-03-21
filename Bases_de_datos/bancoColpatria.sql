create database bancoColpatria
use bancoColpatria

create table cliente(
id_cliente int primary key,
nom_cliente varchar (60),
saldo_cliente float,
id_cliente2 int)

create table factura(
id_factura int,
valor_factura float,
id_cliente int,
constraint fkfactura foreign key (id_cliente) references cliente (id_cliente))

create proc añadirCliente
@id_cliente int,
@nom_cliente varchar(60),
@saldo_Cliente float
as 
insert into cliente (id_cliente, nom_cliente, saldo_cliente)
values (@id_cliente, @nom_cliente, @saldo_cliente)

create procedure crearFactura
@id_factura int,
@valor_factura float,
@id_cliente int
as
insert into factura (id_factura, valor_factura, id_cliente)
values (@id_factura, @valor_factura, @id_cliente)

create procedure retiro
@id_cliente int,
@valor_retiro float
as
update cliente set saldo_cliente = saldo_cliente - @valor_retiro where id_cliente = @id_cliente
and saldo_cliente > @valor_retiro

create procedure consignacion
@id_cliente int,
@valor_consigna float
as
update cliente set saldo_cliente = saldo_cliente + @valor_consigna where id_cliente = @id_cliente

create procedure consultarSaldo
@id_cliente int
as 
select id_cliente, nom_cliente, saldo_cliente from cliente where id_cliente = @id_cliente

create procedure transferencia
@id_cliente1 int,
@id_cliente2 int,
@monto float
as 
update cliente set saldo_cliente = saldo_cliente + @monto where id_cliente = @id_cliente2
and (select saldo_cliente from cliente where id_cliente = @id_cliente1) > @monto
update cliente set saldo_cliente = saldo_cliente - @monto where id_cliente = @id_cliente1 and saldo_cliente > @monto 


create procedure pagarFactura
@id_cliente int,
@id_factura int,
@valor_pago float
as
update cliente set saldo_cliente = saldo_cliente - @valor_pago where id_cliente = @id_cliente and saldo_cliente >= @valor_pago and @valor_pago = (select valor_Factura from factura where id_factura = @id_factura) and (select estado from factura where id_factura = @id_factura) is null
update factura set estado = 'pagado' where id_factura = @id_factura and valor_factura = @valor_pago and id_cliente = @id_cliente and estado is null