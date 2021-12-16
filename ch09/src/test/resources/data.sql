-- call next value for hibernate_sequence;
insert into user (`id`, `name`, `email`, `created_at`, `updated_at`)
values (1, 'martin', 'martin@fastcampus.com', now(), now());

-- call next value for hibernate_sequence;
insert into user (`id`, `name`, `email`, `created_at`, `updated_at`)
values (2, 'dennis', 'dennis@fastcampus.com', now(), now());

-- call next value for hibernate_sequence;
insert into user (`id`, `name`, `email`, `created_at`, `updated_at`)
values (3, 'sophia', 'sophia@slowcampus.com', now(), now());

-- call next value for hibernate_sequence;
insert into user (`id`, `name`, `email`, `created_at`, `updated_at`)
values (4, 'james', 'james@slowcampus.com', now(), now());

-- call next value for hibernate_sequence;
insert into user (`id`, `name`, `email`, `created_at`, `updated_at`)
values (5, 'martin', 'martin@another.com', now(), now());

insert into publisher(`id`, `name`) value (1,'패스트캠퍼스');

insert into book(`id`, `name`, `publisher_id`, `deleted`) value (1,'JPA 초격차 패키지 1',1 , false);

insert into book(`id`, `name`, `publisher_id`, `deleted`) value (2,'JPA 초격차 패키지 2',1, false);

insert into book(`id`, `name`, `publisher_id`, `deleted`) value (3,'JPA 초격차 패키지 3',1, false);

insert into book(`id`, `name`, `publisher_id`, `deleted`) value (4,'JPA 초격차 패키지 4',1, true);
insert into book(`id`, `name`, `publisher_id`, `deleted`) value (5,'JPA 초격차 패키지 5',1, true);
insert into book(`id`, `name`, `publisher_id`, `deleted`) value (6,'JPA 초격차 패키지 6',1, false);

