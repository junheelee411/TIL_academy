-- ■ 데이터 조작언어(DML)
--데이터 처리(추가,수정,삭제 등)를 하는 언어
--자동 commit도지ㅣ 않으므로 트랜잭션을 처리해야함
--rollback 가능
--자바 등에서 insert,update,delete 명령을 실행하면 자동 commit됨
--자동 commit 유무 확인
SHOW AUTOCOMMIT;
 --on이면 자동으로 커밋됨 -> ROLLBACK 불가
 --of이면 자동으로 커밋 X -> commit 또는 rollback으로 트랜잭션 완료해야함 
--만약 on으로 나오는 경우 -> off로 변경
SET AUTOCOMMIT OFF;

-- 트랜잭션(Transaction)
    -- 데이터베이스의 상태를 변환시키는 하나의 논리적 기능을 수행하기 위한 작업 단위
    -- A->B 천원 입급 - A천원빼기, B천원넣기 / 묶어서 트랜잭션
    -- DDL이나 DCL문장은 자동 COMMIT
    -- COMMIT; 
      --  트랜잭션이 완료(INSERT, UPDATE, DELETE 완료) - 데이터베이스에 저장 된다.
    -- ROLLBACK;
      --  트랜잭션이 취소(INSERT, UPDATE, DELETE 취소) - 데이터베이스에 저장 되지 않는다.

    

 -- ※ INSERT
   -- ο 단일 행 입력
     -------------------------------------------------------
     -- 기본형식
         INSERT INTO 테이블명 VALUES (값, 값);
         INSERT INTO 테이블명 (컬럼, 컬럼) VALUES (값, 값);

         --테이블 작성
         CREATE TABLE test1(
            num NUMBER PRIMARY KEY,
            name VARCHAR2(30) NOT NULL,
            birth DATE NOT NULL,
            memo VARCHAR2(1000)
         );
        
            INSERT INTO test1 VALUES(1,'홍길동','2000-10-10','테스트');
            INSERT INTO test1 VALUES(2,'김길동','2001-8-10');
            INSERT INTO test1 VALUES(2,'김길동','테스트','2001-08-10');

            --컬럼형 명시
            INSERT INTO test1 (NUM,NAME,BIRTH,MEMO)VALUES(2,'김길동','2001-08-10','테스트2');
            INSERT INTO test1 (NUM,NAME,BIRTH)VALUES(3,'이길동','2001-07-07');
            INSERT INTO test1(num,name,memo, birth)ValuEs(4,'하길동','메모','2002-06-10');
            
            SELECT * FROM test1;

            --트랜잭션 완료 : DB에 실제 저장
            COMMIT;
         

         -- 테이블의 모든 컬럼에 값 추가
         -- 모든 컬럼에 값을 추가하는 경우 컬럼명 생략 가능
         -- 컬럼명을 생략할 경우 반드시 테이블을 만들 때 컬럼의 순서대로 값을 입력해야함
         -- 날짜는 시스템 환경에 따라 문제를 발생시킬 수 있으므로 TO_DATE를 사용하여 날짜로 변경

  

    SELECT * FROM test1;

    INSERT INTO test1 (num,name,birth) VALUES (5,'너자바','2001-07-07'); --에러 ORA-00001

    INSERT INTO test1 (num,name,birth) VALUES (6,'너자바','05/05/95'); --에러ORA-01847: 달의 날짜는 1에서 말일 사이어야 합니다

    INSERT INTO test1 (num,name,birth) VALUES(6,'너자바',TO_DATE('05/05/95','MM/DD/RR'));

    INSERT INTO test1 (num,name,birth,memo) VALUES(7,'이자바너자바다자바뭘자바',TO_DATE('05/05/95','MM/DD/RR'),'테스트');  
    --ORA-12899: "SKY"."TEST1"."NAME" 열에 대한 값이 너무 큼(실제: 36, 최대값: 30)

    INSERT INTO test1 (num,name,birth) VALUES(7,'이자바',SYSDATE);
    -- 시스템 날짜 등록
    
    COMMIT; -- 트랜잭션 완료(DB에 저장) / ROLLBACK;은 DB 저장 취소

    SELECT * FROM test1;

    --test1에 다음의 컬럼 추가
    -- created / TIMESTAMP
    ALTER TABLE test1 add created TIMESTAMP;

    --test1 테이블에 다음의 데이터 추가
    --num:8,name:마자바,birth:2000-07-08,created:202510161010123

    INSERT INTO test1 (num,name,birth,created) VALUES
    (8,'마자바',TO_DATE('2000-07-08','YYYY-MM-DD'),
        TO_TIMESTAMP('202510161010123','YYYYMMDDHH24MISSFF3'));
        commit;

        SELECT * FROM test1;

    --test2 테이블 작성
    -- hak 문자(30) PRIMARY KEY
    -- name 문자(30) NOT NULL
    -- kor 숫자(3) NOT NULL
    -- eng 숫자(3) NOT NULL
    -- mat 숫자(3) NOT NULL
    -- tot 숫자(3) 가상컬럼 kor+eng+mat
    -- ave 숫자(4,1) 가상컬럼 (kor+eng+mat)/3

    CREATE TABLE test2 (
    hak VARCHAR2(30) PRIMARY KEY,
    name VARCHAR2(30) NOT NULL,
    kor NUMBER(3) NOT NULL,
    eng NUMBER(3) NOT NULL,
    mat NUMBER(3) NOT NULL,
    tot NUMBER(3) GENERATED ALWAYS AS (kor + eng + mat) VIRTUAL,
    ave NUMBER(4,1) GENERATED ALWAYS AS ((kor + eng + mat) / 3) VIRTUAL
);

    --test2 테이블에 다음의 데이터 추가
    -- hak name kor eng mat
    -- 01 감자바 80  90  80
    -- 02 하자바 90  95  100

    INSERT INTO test2(hak,name,kor,eng,mat) VALUES('01','김자바',80,90,80);
    INSERT INTO test2(hak,name,kor,eng,mat) VALUES('02','하자바',90,95,100);

    -- 결과 확인
    commit;
    SELECT * FROM test2;

    
    INSERT INTO test2 VALUES('03','다자바',80,80,80); 
    --ORA-00947: 값의 수가 충분하지 않습니다

    INSERT INTO test2 VALUES('03','다자바',80,80,80,240,80); 
    --ORA-54013: INSERT 작업은 가상 열에서 허용되지 않습니다.
    


   -- ο subquery를 이용한 다중 행 입력
     -------------------------------------------------------
     -- 기본형식
          INSERT INTO 테이블명 [( 컬럼, 컬럼 )]  SELECT 문;

          CREATE TABLE emp1 AS  

        SELECT empNo,name,dept,pos FROM emp WHERE 1=0;

        SELECT * FROM tab;
        DESC emp1;
        SELECT * FROM emp1;

        SELECT empNo,name,dept,pos FROM emp WHERE dept='개발부';

        INSERT INTO emp1
          SELECT empNo,name,dept,pos FROM emp WHERE dept='개발부';

        SELECT * FROM emp1;
        commit;



   -- ο unconditional INSERT ALL
     -------------------------------------------------------
     -- 기본형식 : 여러개의 테이블에 여러 행 추가
        INSERT ALL
              INTO 테이블명1 [( 컬럼, 컬럼 )] VALUES (수식1,수식2)
              INTO 테이블명2 [( 컬럼, 컬럼 )] VALUES (수식1,수식2)
              ...
         subquery; --기억하새요!!

          CREATE TABLE emp2 AS
            SELECT empNo,name,dept,pos FROM emp WHERE 1=0;

            
          CREATE TABLE emp3 AS
            SELECT empNo,sal,bonus FROM emp WHERE 1=0;

            SELECT * FROM emp where dept = '개발부';

          INSERT ALL
            INTO emp2(empNo,name,dept,pos) VALUES (empNo,name,dept,pos)
            INTO emp3(empNo,sal,bonus) VALUES (empNo,sal,bonus)
          SELECT * FROM emp WHERE dept='개발부';
         
          COMMIT;

          SELECT * FROM emp2;
          SELECT * FROM emp3;

          DROP TABLE emp2;
          DROP TABLE emp3;


          --두 개의 테이블에 다음의 데이터를 추가
          --empNo:'7788',name:'다바자,'dept':'개발부,pos:'과장',sal:4000000,bonus:100000

          INSERT ALL
            INTO emp2(empNo,name,dept,pos) VALUES ('7788','다바자','개발부','과장')
            INTO emp3(empNo,sal,bonus) VALUES ('7788',4000000,100000)
          SELECT * FROM dual;

          SELECT * FROM emp2;
          SELECT * FROM emp3;
          COMMIT;
          ROLLBACK;

          UPDATE emp2 SET name='다자바' WHERE name='다바자';


      

   -- ο conditional INSERT {ALL | FIRST}
      -------------------------------------------------------
     -- 기본형식
        INSERT ALL
               WHEN 조건1 THEN
                   INTO 테이블명1 [( 컬럼, 컬럼 )] VALUES (수식1,수식2)
               WHEN 조건2 THEN
                   INTO 테이블명2 [( 컬럼, 컬럼 )] VALUES (수식1,수식2)
                  ...
               ELSE
                   INTO 테이블명n [( 컬럼, 컬럼 )] VALUES (수식1,수식2)
         subquery;

         
         CREATE TABLE emp4 AS
          SELECT empNo,name,rrn,dept,pos FROM emp WHERE 1=0;
         CREATE TABLE emp5 AS
          SELECT empNo,name,rrn,dept,pos FROM emp WHERE 1=0;
          COMMIT;

        --남자 사원/여자 사원을 구분하여 저장
        INSERT ALL
          WHEN MOD(SUBSTR(rrn,8,1),2)=0 THEN  
            INTO emp4 VALUES(empNO,name,rrn,dept,pos)
          WHEN MOD(SUBSTR(rrn,8,1),2)=1 THEN  
            INTO emp5 VALUES(empNO,name,rrn,dept,pos)
          SELECT * FROM emp;

          SELECT * FROM emp4;
          SELECT * FROM emp5;

          commit;

          DROP TABLE emp1 PURGE;
          DROP TABLE emp2 PURGE;
          DROP TABLE emp3 PURGE;
          DROP TABLE emp4 PURGE;
          DROP TABLE emp5 PURGE;

          SELECT * FROM RECYCLEBIN;
          
          PURGE RECYCLEBIN;

          SELECT * FROM tab;
          SELECT * FROM emp_Score;
          

 -- ※ UPDATE
   -- ο UPDATE  : 데이터 수정
     -------------------------------------------------------
     -- 기본형식
       UPDATE 테이블명 SET 컬럼=값, 컬럼=값 WHERE 조건;
       UPDATE 테이블명 SET 컬럼=값, 컬럼=값;   -- 모든레코드 수정

       -- emp_score : empNo=1002의 레코드 중 com=90,excel=95로 수정
       SELECT * FROM emp_score;

       UPDATE emp_score SET com=90,excel=95;
       --모든 레코드 수정
       rollback;

       UPDATE emp_score SET com=90,excel=95 WHERE empNo='1002'; 
       SELECT * FROM emp_score;
       COMMIT;

       --emp_score: empNo,com,excel,word,tot(com+excel+word),
       --ave(세과목 평균, 소수점 둘째 자리 반올림), grade 출력
       --grade는 세과목 모두 40점 이상이며 반올림하지 않은 평균이 60점 이상이면 합격
       --grade는 세과목 중 한 과목이라도 40점 미만이며 반올림하지 않은 평균이 60점 이상이면 과락
       --나머지는 불합격 출력

       SELECT empNo,com,excel,word,(com+excel+word) tot, ROUND((com+excel+word)/3,1) ave,
        CASE
          WHEN (com+excel+word)/3>=60 AND (com<40 or excel<40 or word<40) THEN '과락'
          WHEN (com+excel+word)/3>=60 AND (com>=40 or excel>=40 or word>=40) THEN '합격'
          ELSE '불합격'
        END grade
        FROM emp_score;

        --emp테이블을 참조하여 개발부 직원의 점수만 출력
        SELECT empNO,name,dept FROM emp WHERE dept='개발부';
        
        SELECT * FROM emp_Score
        WHERE empNo IN(SELECT empNO FROM emp WHERE dept='개발부');

        --서브쿼리 조건으로 수정 : 영업부 excel 점수 + 100
        UPDATE emp_score SET excel=excel+100
        WHERE empNO IN(SELECT empNo FRom emp WHERE dept='영업부');
        SELECT * FROM emp_score;
        ROLLBACK;

        --서브쿼리로 수정
        UPDATE emp_score SET (excel,word) = (SELECT 100,100 FROM dual)
        WHERE empNo='1001';
        SELECT * FROM emp_score;
        ROLLBACK;

        --제약조건을 위반하면 수정 불가
    


        
        
 -- ※ DELETE
   -- ο DELETE : 데이터 삭제
     -------------------------------------------------------
     -- 기본형식
       DELETE FROM 테이블명 WHERE 조건;
       DELETE FROM 테이블명;  -- 모든레코드 삭제
        --오라클에서 FROM 키워드는 생략 가능
        --MYSQL, MARIA DB에서는 생략 불가

       CREATE TABLE emp1 AS
       SELECT * FROM emp;

       CREATE TABLE emp_score1 AS
       SELECT * FROM emp_score;

       SELECT * FROm emp1;
       SELECT * FROM emp_score1;

       --제약조건을 위반하면 삭제 불가

       --emp_score1,emp1 테이블에서 영업부 사원의 자료 삭제
       SELECT * FROM emp1 WhERE dept = '영업부';

       DELETE FROM emp_score1WHERE empNO IN(SELECT empNo FROM emp1 WHERE dept = '영업부');

       DELETE FROM emp_score1
       WHERE dept='영업부';

       SELECT * FROM emp1;
       SELECT * FROM emp_score1;

       --모든 레코드 삭제
       DELETE FROM emp_score1; --테이블 구조는 삭제 X
       --TRUNCATE TABLE 테이블; -- 모든 레코드를 삭제할 떄는 TRUNCATE가 더 빠름
       SELECT * FROM emp_score1;
       ROLLBACK;

       DROP TABLE emp_score PURGE; --자동 commit
       DROP TABLE emp_score1 PURGe;
       DROP TABLE emp1 PURGE;

       SELECT * FROM tab;
       SELECT * FROM RECYCLEBIN;
       
       --잘못 삭제한 레코드 원상복구(drop은 불가)
       DELETE FROM emp WHERE city='서울';
       COMMIT;
       SELECT * FROM emp;

      --20분 전의 emp 테이블
       SELECT * from emp
       AS OF TIMESTAMP (SYSTIMESTAMP-INTERVAL '20' MINUTE);

       --20분 전의 emp테이블로 복원(테이블 삭제 시 복구 불가)
       INSERT INTO emp(
        SELECT * from emp
        AS OF TIMESTAMP (SYSTIMESTAMP-INTERVAL '20' MINUTE)
        WHERE city = '서울'
       );
       COMMIT;
       SELECT * FROM emp;



 -- ※ MERGE
   -- ο MERGE : 데이터 병합
     -------------------------------------------------------
     -- 기본형식
       MERGE INTO 대상테이블명
           USING 비교할테이블 ON ( 조건 )
             WHEN MATCHED THEN
                 UPDATE SET 컬럼=값, 컬럼=값
            WHEN NOT MATCHED THEN
                INSERT [ (컬럼, 컬럼) ] VALUES (값, 값)
             ;
          
      --예
      CREATE TABLE emp1 AS 
        SELECT empNO,name,city,dept,sal FROM emp WHERE city='인천';

      CREATE TABLE emp2 AS 
        SELECT empNO,name,city,dept,sal FROM emp WHERE dept='개발부';

      MERGE INTO emp1 e1 --대상
            USING emp2 e2 --비교 테이블(서브쿼리도 가능)
            ON(e1.empNo-e2.empNo) --조건
            WHEN MATCHED THENUPDATE SET e1.sal = e1.sal+e2.sal
            WHEN NOT MATCHED THEN 
                     INSERT (e1.empNo,e1.name,e1.city,e1.dept,e1.sal) VALUES 
                                        (e2.empNo,e2.name,e2.city,e2.dept,e2.sal);

      SELECT * FROM emp1;
      SELECT * FROM emp2;

      COMMIT;



