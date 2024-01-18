INSERT INTO department (department_name) VALUES
('컴퓨터공학과'),
('국어국문과'),
('정보통신과'),
('전자공학과');

select * from student;

INSERT INTO Student (student_name, student_height, department_code) VALUES
('가길동', 170.5, 1),
('나길동', 165.2, 1),
('다길동', 180.0, 2),
('라길동', 175.8, 3),
('마길동', 160.7, 4),
('바길동', 168.3, 1),
('사길동', 172.1, 2),
('아길동', 175.0, 1);

select * from department;
select s.student_name, d.department_name
from department d
inner join student s
on s.department_code=d.department_code;

select s.student_name, d.department_name 
from student s, department d
where s.department_code=d.department_code;

select * from department;

select d.department_name, count(*)cnt 
from department d
inner join student s
on s.department_code=d.department_code
group by d.department_name
having cnt>=2;

select * from department;

select s.student_name, d.department_name
from departmnet d
inner join student s
on s.department_code=d.department_code
where d.department_name='국문어학과';

select * from student
where student_name like'%길%'; -- like는 검색

select * from student
where student_height like '17%';

select * from student
where student_height between 170 and 180;

select student_name from student
order by student_height desc
limit 1;

 INSERT INTO Professor (professor_name, department_code) VALUES
('가 교수', 1),
('나 교수', 1),
('다 교수', 2),
('빌 게이츠', 3),
('스티브 잡스', 4);

select * from professor;

-- Q컴퓨터공학과에 소속된 교수 이름을 출력하세요(학과명, 교수이름)

select d.department_name,p.professor_name
from department d 
inner join professor p
on d.department_code =p.professor_code
where d.department_name ="컴퓨터공학과";

-- Q학과별 교수의 수를 출력하세요
select d.department_name, count(*) as cnt
from department d
inner join professor p
on d.department_code=p.professor_code
group by d.department_name;

-- q교수의 수가 2명 이상인 학과의 이름을 출력하세요
select d.department_name, count(*) as cnt
from department d
inner join professor p
on d.department_code=p.professor_code
group by d.department_name
having cnt>=2;

-- Q가장 많은 학생이 있는 학과 명을 출력하세요
select d.department_name, count(*) cnt
from student s
inner join department d
on s.department_code=d.department_code
group by d.department_name
order by cnt desc
limit 1;

select department_name
from department
where department_code=(
select department_code from student
group by department_code
having count(department_code)=(
select count(department_code) cnt from student group by department_code
order by cnt desc limit 1
)
);

-- Q 학생중 성이 아인 학생이 속한 학과명과 학생명을 출력호사요
select s.student_name,d.department_name
from student s
inner join department d
on s.department_code=d.department_code
where s.student_name like"아%";


-- Q 키가 175~180사이에 속한 학생수를 출력하세요
select count(student_id) cnt
from student 
where s.student_height between 170 and 185;

select st.student_name from student st
where st.department_code=( 
select s.department_code from student s
where s.student_name="다길동"
);

select st.student_name from student st
where st.department_code=(
   select s.department_code from student s
   where s.student_name='다길동'
);

-- q.학과별 키의 최고값과, 평균값을 출력하시오.
select d.department_name,max(s.student_height),avg(s.student_height)
from department d
inner join student s
on s.department_code=d.department_code
group by d.department_name;

INSERT INTO Course (course_name, professor_code, start_date, 
end_date) VALUES
('교양 영어', 1, '2023-07-01', '2023-08-15'),
('데이터베이스 입문', 2, '2023-07-01', '2023-08-31'),
('회로이론', 3, '2023-07-15', '2023-09-15'),
('공학수학', 4, '2023-07-15', '2023-09-30'),
('객체지향 프로그래밍', 5, '2023-07-01', '2023-08-31');

select * from course;
select p.professor_name,c.course_name
from professor p
inner join course c
on p.professor_code=c.professor_code
where p.professor_name="빌 게이츠";


INSERT INTO Student_Course (id, student_id, course_code) VALUES
(1, 1, 1),
(2, 2, 1),
(3, 3, 2),
(4, 4, 3),
(5, 5, 4),
(6, 6, 5),
(7, 7, 5);

select * from student_course;
-- Q.과목별 수강자 수를 출력하시오.(과목이름.수강자 수)
select c.course_name, count(*)cnt
from course c
inner join student_course sc
on c.course_code=sc.course_code
group by c.course_name	
having cnt>=2
order by c.course_name asc;

-- Q. 빌게이츠 교수의 과목을 수강신청한 학생을 출력하세요?


select*
from student_course sc
where sc.course_code=(

select c.course_code
from course c
where c.professor_code=(

select p.professor_code
from professor p
where p.professor_name='빌 게이츠'
)
);

select s.student_name 
from student s
where s.student_id IN (
   select sc.student_id
   from student_course sc
   where sc.course_code=(
      select c.course_code 
      from course c
      where c.professor_code=(
         select p.professor_code 
         from professor p
         where p.professor_name='가 교수'
      )
   )
);

-- q 스티브 잡스 교수의 / 과목을/ 수강신청한 학생이름을 출력하세요

select department_name, student_name
from department d
inner join 
(select s.student_name, s.department_code 
from student s
where s.student_id IN (
   select sc.student_id
   from student_course sc
   where sc.course_code=(
      select c.course_code 
      from course c
      where c.professor_code=(
         select p.professor_code 
         from professor p 
         where p.professor_name='스티브 잡스' 
      )
   )
 )
) A
on A.department_code=d.department_code;

-- Q. 사길동 학생과 같은 과목을 수강신청한 학생 이름을 출력하세요

select s.student_name
from student s
where s.student_id in(


select sc.student_id
from student_course sc
where sc.course_code=(
select sc.course_code
from student_course sc
where sc.student_id=(
    select s.student_id
    from student s
    where s.student_name='사길동'
    )));
    select s.student_name
from student s
where s.student_id IN (
   select sc.student_id
   from student_course sc
   where sc.course_code=(
      select sc.course_code
      from student_course sc
      where sc.student_id=(
         select s.student_id
         from student s
         where s.student_name='사길동'
      )
   )
);
