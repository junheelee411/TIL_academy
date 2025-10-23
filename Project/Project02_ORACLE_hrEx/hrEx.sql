-- 계정 생성 쿼리
ALTER SESSION SET "_ORACLE_SCRIPT" = true;
GRANT CONNECT, RESOURCE, UNLIMITED TABLESPACE TO hrEx IDENTIFIED BY "hrEx$";
ALTER USER hrEx DEFAULT TABLESPACE USERS;
ALTER USER hrEx TEMPORARY TABLESPACE TEMP;

-- 테이블 생성
-- REGIONS 테이블 생성
CREATE TABLE REGIONS (
    region_id NUMBER CONSTRAINT reg_id_nn NOT NULL,
    region_name VARCHAR2(25),
    CONSTRAINT reg_id_pk PRIMARY KEY(region_id)
);

-- COUNTRIES 테이블 생성
CREATE TABLE COUNTRIES (
    country_id CHAR(2) CONSTRAINT countr_id_nn NOT NULL,
    country_name VARCHAR2(40),
    region_id NUMBER,
    CONSTRAINT countr_id_pk PRIMARY KEY(country_id)
);

-- JOB_HISTORY 테이블 생성
CREATE TABLE JOB_HISTORY (
    employee_id NUMBER(6),
    start_date DATE,
    end_date DATE NOT NULL,
    job_id VARCHAR2(10) NOT NULL,
    department_id NUMBER(4) NOT NULL,
    PRIMARY KEY(employee_id, start_date)
);

-- LOCATIONS 테이블 생성
CREATE TABLE locations (
    LOCATION_ID NUMBER(4) PRIMARY KEY,
    STREET_ADDRESS VARCHAR2(40),
    POSTAL_CODE VARCHAR2(12),
    CITY VARCHAR2(30) NOT NULL,
    STATE_PROVINCE VARCHAR2(25),
    COUNTRY_ID CHAR(2)
);

-- DEPARTMENTS 테이블 생성
CREATE TABLE DEPARTMENTS (
    department_id NUMBER PRIMARY KEY,
    department_name VARCHAR2(30) NOT NULL,
    manager_id NUMBER,
    location_id NUMBER
);

-- JOBS 테이블 생성
CREATE TABLE JOBS (
    job_id  VARCHAR2(35) PRIMARY KEY,
    job_title VARCHAR2(10) NOT NULL,
    min_salary NUMBER,
    max_salary NUMBER
);

-- EMPLOYEES 테이블 생성
CREATE TABLE EMPLOYEES(
    employee_id NUMBER(6) NOT NULL,
    first_name VARCHAR(20) ,
    last_name VARCHAR(25) NOT NULL,
    email VARCHAR(25) NOT NULL,
    phone_number VARCHAR(20),
    hire_date DATE NOT NULL,
    job_id VARCHAR(10) ,
    salary VARCHAR(25) ,
    commission_pct NUMBER(2,2),
    manager_id NUMBER(6),
    department_id NUMBER(4),
    PRIMARY KEY(employee_id)
);

-- 제약조건 설정
-- COUNTRIES 제약조건 
ALTER TABLE countries ADD CONSTRAINT countr_reg_fk
        FOREIGN KEY(region_id) REFERENCES REGIONS(region_id);

-- JOB_HISTORY 제약조건
ALTER TABLE JOB_HISTORY ADD FOREIGN KEY(employee_ID) REFERENCES employees(employee_ID);   
ALTER TABLE JOB_HISTORY ADD FOREIGN KEY(job_id) REFERENCES jobs(job_id);
ALTER TABLE JOB_HISTORY ADD FOREIGN KEY(department_id) REFERENCES DEPARTMENTS(department_id);
ALTER TABLE JOB_HISTORY ADD CHECK(start_date<end_date);

-- LOCATION 제약조건
ALTER TABLE locations ADD FOREIGN KEY(COUNTRY_ID) REFERENCES countries(COUNTRY_ID);

-- DEPARTMENTS 제약조건
ALTER TABLE DEPARTMENTS add FOREIGN KEY(location_id) REFERENCES LOCATIONS(location_id);

-- 데이터 삽입
-- REGIONS 데이터 삽입
INSERT INTO REGIONS(region_id, region_name) VALUES(1, 'Asia');
INSERT INTO REGIONS(region_id, region_name) VALUES(2, 'Europe');
INSERT INTO REGIONS(region_id, region_name) VALUES(3, 'Americas');

-- COUNTRIES 데이터 삽입
INSERT INTO COUNTRIES(country_id, country_name, region_id) VALUES('KR', 'Korea', 1);
INSERT INTO COUNTRIES(country_id, country_name, region_id) VALUES('JP', 'Japan', 1);
INSERT INTO COUNTRIES(country_id, country_name, region_id) VALUES('UK', 'United Kingdom', 2);
INSERT INTO COUNTRIES(country_id, country_name, region_id) VALUES('US', 'United States of America', 3);

-- LOCATIONS 데이터 삽입
INSERT INTO locations(LOCATION_ID,STREET_ADDRESS,POSTAL_CODE,CITY,STATE_PROVINCE,COUNTRY_ID) 
    VALUES(11,'abc_street1111',11111,'SEOUL','SEOUL','KR');

INSERT INTO locations(LOCATION_ID,STREET_ADDRESS,POSTAL_CODE,CITY,STATE_PROVINCE,COUNTRY_ID) 
    VALUES(22,'def_street2222',2222,'BUSAN','BUSAN','KR');     

INSERT INTO locations(LOCATION_ID,STREET_ADDRESS,POSTAL_CODE,CITY,STATE_PROVINCE,COUNTRY_ID) 
    VALUES(33,'ghi_street2222',3333,'OSAKA','OSAKA','JP');   

-- JOBS 데이터 삽입
INSERT INTO JOBS(job_id, job_title, min_salary, max_salary) VALUES('CH_MAN', 'ProGamer', 300000, 50000000);
INSERT INTO JOBS(job_id, job_title, min_salary, max_salary) VALUES('DH_HAD', 'ProAdd', 310000, 51000000);
INSERT INTO JOBS(job_id, job_title, min_salary, max_salary) VALUES('TH_MAC', 'ProGem', 320000, 52000000);

-- EMPLOYEES 데이터 삽입
INSERT INTO EMPLOYEES(EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,HIRE_DATE) VALUES(2001,'haneul','choi','grgrgr','0101234567','2017-02-04');
INSERT INTO EMPLOYEES(EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,HIRE_DATE) VALUES(2002,'rara','kim','potato','0105557777','2015-10-15');
INSERT INTO EMPLOYEES(EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,HIRE_DATE) VALUES(1982,'jisun','park','honghong','0108884545','2024-01-07');

-- DEPARTMENTS 데이터 삽입
INSERT INTO DEPARTMENTS(department_id, department_name, manager_id, location_id) VALUES (2001, 'LOLplay', 2001, 11);
INSERT INTO DEPARTMENTS(department_id, department_name, manager_id, location_id) VALUES (2002, 'STARplay', 2002, 22);
INSERT INTO DEPARTMENTS(department_id, department_name, manager_id, location_id) VALUES (1982, 'BATTLEplay', 1982, 33);

-- 서로 참조하고 있는 테이블 제약조건 설정

    -- DEPARTMENTS 제약조건
    ALTER TABLE DEPARTMENTS add FOREIGN KEY(manager_id) REFERENCES EMPLOYEES(employee_id);

    -- EMPLOYEES 제약조건
    ALTER TABLE EMPLOYEES ADD FOREIGN KEY(JOB_ID) REFERENCES JOBS(JOB_ID);
    ALTER TABLE EMPLOYEES ADD FOREIGN KEY(MANAGER_ID) REFERENCES EMPLOYEES(EMPLOYEE_ID);
    ALTER TABLE EMPLOYEES ADD FOREIGN KEY(DEPARTMENT_ID) REFERENCES DEPARTMENTS(DEPARTMENT_ID);

-- JOB_HISTORY 데이터 삽입
INSERT INTO JOB_HISTORY(employee_id, start_date, end_date, job_id, department_id) VALUES( 2001,'2000-10-10','2010-10-13','CH_MAN', 2001);
INSERT INTO JOB_HISTORY(employee_id, start_date, end_date, job_id, department_id) VALUES( 2002,'2000-09-10','2017-12-15','DH_HAD', 2002);
INSERT INTO JOB_HISTORY(employee_id, start_date, end_date, job_id, department_id) VALUES( 1982,'2000-08-10','2021-04-20','TH_MAC', 1982);

