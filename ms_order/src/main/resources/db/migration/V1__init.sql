create table order_items
(
    id             bigserial primary key,
    title          varchar(255),
    quantity       int,
    price_per_item double precision,
    price          double precision
);
