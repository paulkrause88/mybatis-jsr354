drop table debt if exists;

create table public_debt (
	country_code char(2) not null,
	external_debt_usd decimal(20, 2) not null,
	as_of date not null,
	per_capita_usd decimal(10, 2),
	percent_gdp double,
	constraint pk_debt primary key (country_code, as_of) 
);

create table net_intl_invst_pos (
	country_code char(2) not null,
	for_year int not null,
	domestic_product varchar(32) not null,
	net_position varchar(32) not null,
);