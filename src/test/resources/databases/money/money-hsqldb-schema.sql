drop table debt if exists;

create table public_debt (
	country_code char(2) not null,
	external_debt_usd decimal(20, 2) not null,
	as_of date not null,
	per_capita_usd decimal(10, 2),
	percent_gdp double,
	constraint pk_debt primary key (country_code, as_of) 
);
