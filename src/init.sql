create table if not exists categories (id serial primary key, title varchar(250));
insert into categories (title) values ('продовольственный');
insert into categories (title) values ('хозяйственный');
create table if not exists categories (id serial primary key, title varchar(250));
insert into categories (title) values ('продовольственный');
insert into categories (title) values ('хозяйственный');
insert into categories (title) values ('спортивный');
insert into categories (title) values ('зоомагазин');

create table if not exists stores (id serial primary key, title varchar (250), address varchar (250),
    phone varchar (50), email varchar (50), site varchar (250),
    categoryId integer REFERENCES categories(id) on delete cascade, description text);
insert into stores (title, address, phone,email, site, categoryId, description)values
    ('Зверушка', 'Адрес: Кавалерийская ул., 9, Новосибирск', '8 (383) 310-07-43', 'info@zoo54.ru','https://zoo54.ru/',4,
     'Интернет-зоомагазин ЗверУшка. Корма, лакомства, игрушки, аксессуары для Ваших домашних питомцев');
insert into stores (title, address, phone,email, site, categoryId, description)values
    ('Спортмастер', 'Адрес: г. Новосибирск, ТЦ "Мега", ул. Ватутина, д. 107', '8 800 777-777-1','distribution@sportmaster.ru', 'https://www.sportmaster.ru/',3,
     'Коллекция товаров для спорта, фитнеса, туризма и активного отдыха');
insert into stores (title, address, phone,email, site, categoryId, description)values
    ('Посудацентр', 'Адрес: г. Новосибирск, ул. Никитина, 112А', '8 (800) 100-00-40','posuda@posuda.ru', '
https://posudacenter.ru',2,
     'огромный ассортимент посуды и товаров для дома по демократичным ценамСоздавайте дом своей мечты');
insert into stores (title, address, phone,email, site, categoryId, description)values
    ('Магнит', 'Адрес: г. Новосибирск, ул. Сухарная 35', '8 800 707-68-88','magnit@magnit.ru', '
https://magnit.ru/',1,
     'Доставка продуктов и товаров из магазина МАГНИТ');

