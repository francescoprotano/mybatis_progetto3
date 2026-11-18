create table prodotto(
id int(11) not null auto_increment primary key
, nome varchar(255) not null
)engine=innodb;

alter table prodotto add prezzo decimal(11,2);
alter table prodotto add quantita_disponibile int(3);

create table cliente (
id int(11) not null auto_increment primary key
, nome varchar(30) not null
, cognome varchar(40) not null
, indirizzo varchar(255) not null
, citta varchar(30) not null
, telefono varchar(15) not null unique
)engine=innodb;

create table ordine (
id int(11) not null auto_increment primary key
, data_ordine timestamp not null
, id_cliente int(11) not null
, id_prodotto int(11) not null
, prezzo_acquisto decimal(11,2) not null
, quantita_acquista int(3) not null
, stato_lavorazione smallint(1)
, foreign key (id_cliente) references cliente(id)
, foreign key (id_prodotto) references prodotto(id)
)engine=innodb;