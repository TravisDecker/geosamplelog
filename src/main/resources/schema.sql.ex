create table users(
                      username varchar(50) not null,
                      password varchar(100) not null,
                      enabled tinyint not null default 1,
                      primary key (username)
);

create table authorities (
                             username varchar(50) not null,
                             authority varchar(50) not null,
                             foreign key(username) references users(username)
);
create unique index ix_auth_username on authorities (username,authority);