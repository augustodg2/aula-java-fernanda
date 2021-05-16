create table marca_veiculo (
	marca_id serial primary key,
	nome varchar(80)
)

create table modelo_veiculo (
	modelo_id serial primary key,
	marca_id integer references marca_veiculo (marca_id),
	nome varchar (80),
	descricao text
)

insert into marca_veiculo (nome) values
('Chevrolet'),
('Ford'),
('Fiat'),
('Jeep'),
('Volkswagen')

select * from marca_veiculo mv

insert into modelo_veiculo (marca_id, nome, descricao) values
(1, 'Onix', 'Volume de carga: Básica: 303 l / Bancos rebatidos: 1.151 l\nTanque de combustível: 44 l'),
(2, 'Ecosport', 'Volume de carga: Básica: 356 - 362 l / Bancos rebatidos: 1.178 l\nTanque de combustível: 52 l'),
(3, 'Uno', 'Peso: 988 - 1.057 kg\nTanque de combustível: 1 - 48 l\nPotência: 75 - 109 HP'),
(3, 'Toro', 'Motor:	2.0L I4 16v Diesel\nPotência: D: 170 cv (130 kW) @ 3750 rpm'),
(4, 'Renegade', 'Volume de carga: Básica: 276 - 320 l / Bancos rebatidos: 1.347 l\nPeso: 1.448 - 1.674 kg'),
(5, 'Gol', 'Tanque de combustível: 1 - 55 l\nVolume de carga: 285 l')

select mv.modelo_id, mv2.nome marca, mv.nome modelo, mv.descricao from modelo_veiculo mv
inner join marca_veiculo mv2 on mv.marca_id = mv2.marca_id

create table veiculo (
	veiculo_id serial primary key,
	marca_id integer references marca_veiculo(marca_id),
	modelo_id integer references modelo_veiculo(modelo_id),
	descricao text,
	cor	varchar (30),
	placa varchar (8)
)

insert into veiculo (marca_id, modelo_id, descricao, cor, placa) values
(1, 1, '4 portas, automatico, ar condicionado', 'Branco', 'HOU-8424'),
(3, 3, '4 portas, vidro fumê, ar condicionado', 'Vermelho', 'JYT-7289'),
(3, 4, '2 portas, automatico, injecao eletrica ar condicionado', 'Preto', 'LVI-0956'),
(5, 6, '4 portas, vidro fumê, ar condicionado', 'Prata', 'LWH-7604')

select v.veiculo_id, mv.nome marca, mv2.nome modelo, v.descricao, v.cor, v.placa from veiculo v
inner join marca_veiculo mv on mv.marca_id = v.marca_id
inner join modelo_veiculo mv2 on mv2.modelo_id = v.modelo_id

create table cliente (
cliente_id serial primary key,
nome varchar (200),
endereco text,
cpf char (11)
)

insert into cliente (nome, endereco, cpf) values
('Marlene Milena Evelyn Castro', 'Avenida Rio Oiapoque, 361, Macapá - AP', '15929074402'),
('Larissa Jaqueline Figueiredo', 'Rua Lago Pantanal, 427, Paulo Afonso - BA', '62438527684'),
('Vicente Henry Costa', 'Rua da Sorveira, 239, Natal - RN', '51229650059')

select * from cliente

create table contrato (
contrato_id serial primary key,
data_contrato date,
preco_diario money,
veiculo_id integer references veiculo (veiculo_id),
cliente_id integer references cliente (cliente_id),
valor_seguro money
)

insert into contrato (data_contrato, preco_diario, veiculo_id, cliente_id, valor_seguro ) values
('2020-03-20', 71.29, 3, 1, 123.40),
('2021-08-12', 80.59, 4, 3, 123.40),
('2021-01-24', 50.19, 2, 2, 123.40),
('2018-05-27', 90.20, 2, 3, 123.40),
('2020-09-07', 50.09, 1, 1, 123.40)

select * from contrato

select * from marca_veiculo

select * from cliente
order by nome

select mv.modelo_id, mv2.nome marca, mv.nome, mv.descricao from modelo_veiculo mv
inner join marca_veiculo mv2 on mv.marca_id = mv2.marca_id

select veiculo_id, mv.nome marca, mv2.nome modelo, v.descricao, v.cor, v.placa from veiculo v
inner join marca_veiculo mv ON mv.marca_id = v.marca_id
inner join modelo_veiculo mv2 on mv2.modelo_id = v.modelo_id

select contrato_id, data_contrato, mv2.nome marca, mv.nome modelo, v.placa, c2.nome, c2.cpf, preco_diario, valor_seguro from contrato c
inner join cliente c2 on c.cliente_id = c2.cliente_id
inner join veiculo v on v.veiculo_id = c.veiculo_id
inner join modelo_veiculo mv on mv.modelo_id = v.modelo_id
inner join marca_veiculo mv2 on mv2.marca_id = v.marca_id
order by data_contrato desc

select contrato_id, data_contrato, mv2.nome marca, mv.nome modelo, v.placa, c2.nome, c2.cpf, preco_diario, valor_seguro from contrato c
inner join cliente c2 on c.cliente_id = c2.cliente_id
inner join veiculo v on v.veiculo_id = c.veiculo_id
inner join modelo_veiculo mv on mv.modelo_id = v.modelo_id
inner join marca_veiculo mv2 on mv2.marca_id = v.marca_id
where v.placa = 'LVI-0956'
order by data_contrato desc

select contrato_id, data_contrato, mv2.nome marca, mv.nome modelo, v.placa, c2.nome, c2.cpf, preco_diario, valor_seguro from contrato c
inner join cliente c2 on c.cliente_id = c2.cliente_id
inner join veiculo v on v.veiculo_id = c.veiculo_id
inner join modelo_veiculo mv on mv.modelo_id = v.modelo_id
inner join marca_veiculo mv2 on mv2.marca_id = v.marca_id
where mv.nome = 'Uno'
order by data_contrato desc

select count(*), mv.nome from veiculo v
inner join marca_veiculo mv on mv.marca_id = v.marca_id
group by mv.nome

select count(*) from veiculo v

select count(*), mv.nome modelo from contrato c
inner join veiculo v on c.veiculo_id = v.veiculo_id
inner join modelo_veiculo mv on mv.modelo_id = v.modelo_id
group by mv.nome

select avg(c.preco_diario::numeric), mv.nome from contrato c
inner join veiculo v on c.veiculo_id = v.veiculo_id
inner join modelo_veiculo mv on mv.modelo_id = v.modelo_id
group by mv.nome

select * from veiculo v

update veiculo set placa = 'LVI-1056' where veiculo_id = 3

select * from contrato

delete from contrato where contrato_id = 4

select * from marca_veiculo mv

delete from marca_veiculo where marca_id = 1

select * from modelo_veiculo mv

drop table marca_veiculo

alter table

select * from veiculo v

select * from contrato c

