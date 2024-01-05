-- Drop the tables if they exist
DROP TABLE IF EXISTS t_sales;
DROP TABLE IF EXISTS t_customer;
DROP TABLE IF EXISTS t_product;
DROP TABLE IF EXISTS t_region;
-- Create the t_region table
CREATE TABLE t_region (
region_code varchar(3) not null,
region_name varchar(10) not null,
primary key(region_code)
);
-- Create the t_customer table
CREATE TABLE t_customer (
id int not null auto_increment,
customer_name varchar(10) not null,
phone varchar(20) not null unique,
email varchar(50) not null unique,
address varchar(100) not null,
regist_date datetime default now(),
region_code varchar(3) not null,
primary key(id)
);
-- Create the t_product table
CREATE TABLE t_product(
id int not null auto_increment,
product_code varchar(12) not null unique,
product_name varchar(50) not null,
price int,
primary key(id)
);
-- Create the t_sales table
CREATE TABLE t_sales (
id int not null auto_increment,
customer_id int not null,
product_code varchar(12) not null,
qty int not null,
sales_date datetime default now(),
primary key(id)
);

ALTER TABLE t_customer
ADD CONSTRAINT fk_region_code FOREIGN KEY (region_code) REFERENCES t_region(region_code);


ALTER TABLE t_sales
ADD CONSTRAINT fk_customer_id FOREIGN KEY (customer_id) REFERENCES t_customer (id),
ADD CONSTRAINT fk_product_code FOREIGN KEY (product_code) REFERENCES t_product (product_code);

select * from information_schema.table_constraints;


INSERT INTO t_region (region_code, region_name) 
VALUES
('02', '서울특별시'),
('031', '경기도'),
('032', '인천광역시'),
('033', '강원특별자치도'),
('041', '충청남도'),
('042', '대전광역시'),
('043', '충청북도'),
('044', '세종특별자치시'),
('051', '부산광역시'),
('052', '울산광역시'),
('053', '대구광역시'),
('054', '경상북도'),
('055', '경상남도'),
('061', '전라남도'),
('062', '광주광역시'),
('063', '전라북도'),
('064', '제주특별자치도');

select* from t_region;

-- t_customer 테이블에 데이터 추가
INSERT INTO t_customer (customer_name, phone, email, address, region_code)
VALUES
('홍길동', '010-1234-5678', 'hong@example.com', '서울시 강남구', '02'),
('김철수', '010-9876-5432', 'kim@example.com', '경기도 수원시', '031'),
('이영희', '010-1111-2222', 'lee@example.com', '인천시 남구', '032'),
('박민지', '010-5555-7777', 'park@example.com', '강원도 춘천시', '033'),
('정기호', '010-9999-8888', 'jung@example.com', '대전시 중구', '042');

select*from t_customer;

-- t_product 테이블에 데이터 추가
INSERT INTO t_product
(product_code, product_name, price)
VALUES
('P001', '노트북', 1500000),
('P002', '스마트폰', 1000000),
('P003', '키보드', 50000),
('P004', '마우스', 30000),
('P005', '이어폰', 70000);

select*from t_product;

-- t_sales 테이블에 데이터 추가
INSERT INTO t_sales
(customer_id, product_code, qty)
VALUES
(1, 'P001', 2),
(2, 'P002', 1),
(3, 'P003', 5),
(4, 'P004', 3),
(5, 'P005', 2),
(1, 'P002', 3),
(3, 'P001', 1),
(2, 'P004', 2),
(4, 'P003', 4),
(5, 'P005', 1);

select*from t_sales;