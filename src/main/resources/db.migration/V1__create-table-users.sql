create table users
(
    userId        bigint auto_increment,
    name          varchar(100) not null,
    cpf           varchar(20)  not null,
    address       varchar(100) not null,
    email         varchar(100) not null,
    telephone     varchar(30)  not null,
    register_date DATE         not null,

    PRIMARY KEY (userId)
);