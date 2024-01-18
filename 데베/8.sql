-- Q : 모든 고객의 정보를 (이름, 전화번호)출력하세요
select * from t_customer;
select customer_name,phone from t_customer;

insert into t_customer(customer_name, phone, email, address, region_code)
values('손흥민','010-1234-7894','son@gmail.com','서울특별시 강남구 삼성동','02');

insert into t_customer(customer_name, phone, email, address, region_code)
values('박태환','010-1234-5555','park@gmail.com','제주특별자치도 제주시 일도','064');

-- Q : 손흥민 고객의 주소를 수정하세요(서울특별시 강남구 

select*from t_product;

-- Q2. 특정 지역(예: '서울특별시')에 사는 고객의 이름과 전화번호를 가져오는 질의
select*from t_customer where region_code='02';

select tc.id, tc.customer_name, tr.region_name
from t_customer tct_customer
inner join t_region tr
on tc.region_code=tr.region_code;






