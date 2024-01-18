INSERT INTO customer (customer_id, password, customer_name, age, rating, occupation, reserves)
VALUES
('CUST001', 'CUST001', '홍길동', 30, 'Gold', '엔지니어', 100),
('CUST002', 'CUST002', '이영희', 25, 'Silver', '교사', 50),
('CUST003', 'CUST003', '김철수', 40, 'VIP', '의사', 75),
('CUST004', 'CUST004', '박영훈', 35, 'Silver', '변호사', 25),
('CUST005', 'CUST005', '최미영', 28, 'Gold', '예술가', 150);

INSERT INTO product (product_name, inventory, price, manufacturer)
VALUES
('제품 A', 50, 20000, 'ABC 주식회사'),
('제품 B', 30, 35000, 'XYZ 기업'),
('제품 C', 80, 15000, 'LMN 산업'),
('제품 D', 40, 25000, 'PQR 주식회사'),
('제품 E', 20, 30000, 'JKL 기업');

INSERT INTO customer_product (customer_id, product_number, quantity)
VALUES
('CUST001', 1, 2),
('CUST002', 3, 1),
('CUST003', 2, 3),
('CUST004', 4, 2),
('CUST005', 5, 1),
('CUST001', 2, 1),
('CUST002', 4, 2),
('CUST003', 1, 3),
('CUST004', 5, 1),
('CUST005', 3, 2);


-- Q 주문테이블에서 CUST005 고객이 주문한 제품의 이름과 제조업체를 출력하세요.

select * from product;
select * from customer;
select * from customer_product;
 
 
 select *
 from product
 where product_number in (
	 select product_number
	 from customer_product
	 where customer_id='cust005'
 );
 
select *
from customer_product as cp      -- as는 뒤에 단축단어가 앞에서로부터 온거다
inner join product as p        -- 합칠거야
on cp.product_number = p.product_number                -- 근데, 조건이 있어
where cp.customer_id = 'cust005';     -- 
 
 
 
 
 
 
 
 
 select product_name,manufacturer
 from product
 where product_number in (
select product_number
from customer_product
where customer_id ='cust005'
);

-- Q. 고객테이블에서 나이가 30세 이상인 고객이 주문한 제품의 번호와 주문일자를 출력하세요.
--    (제품번호 주문일자)
select * from product;
select * from customer;
select * from customer_product;

select order_number , order_date
from customer_product
where customer_id in(
select customer_id
from customer
where age >=30
);
-- 
-- select from 
-- orderby 해당컬럼 dsc,dec ;-- 내림차순 정렬

-- select from 오더테이블 불르고
-- like '

-- 제품의 가겨을 모두 10% 인상해보자
update product
set

