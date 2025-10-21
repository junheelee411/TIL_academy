CONNECT SKY/"java$!"

CREATE TABLE emp_score (
    empNo  VARCHAR2(10) PRIMARY KEY
    ,com   NUMBER(3)
    ,excel NUMBER(3)
    ,word  NUMBER(3)
    ,CONSTRAINT fk_emp_score_no FOREIGN KEY(empNo) REFERENCES emp(empNo)
);

INSERT INTO emp_score(empNo)
            SELECT empNo FROM emp;
COMMIT;

UPDATE emp_score SET com=35, excel=95, word=100 WHERE empNo='1001';
UPDATE emp_score SET com=85, excel=80, word=80 WHERE empNo='1002';
UPDATE emp_score SET com=45, excel=65, word=55 WHERE empNo='1003';
UPDATE emp_score SET com=75, excel=75, word=60 WHERE empNo='1004';
UPDATE emp_score SET com=85, excel=85, word=80 WHERE empNo='1005';
UPDATE emp_score SET com=85, excel=65, word=85 WHERE empNo='1006';
UPDATE emp_score SET com=65, excel=90, word=80 WHERE empNo='1007';
UPDATE emp_score SET com=90, excel=80, word=85 WHERE empNo='1008';
UPDATE emp_score SET com=100, excel=35, word=90 WHERE empNo='1009';
UPDATE emp_score SET com=55, excel=70, word=50 WHERE empNo='1010';

UPDATE emp_score SET com=80, excel=70, word=70 WHERE empNo='1011';
UPDATE emp_score SET com=90, excel=90, word=80 WHERE empNo='1012';
UPDATE emp_score SET com=65, excel=60, word=60 WHERE empNo='1013';
UPDATE emp_score SET com=100, excel=80, word=50 WHERE empNo='1014';
UPDATE emp_score SET com=35, excel=95, word=100 WHERE empNo='1015';
UPDATE emp_score SET com=80, excel=40, word=55 WHERE empNo='1016';
UPDATE emp_score SET com=55, excel=100, word=50 WHERE empNo='1017';
UPDATE emp_score SET com=40, excel=85, word=90 WHERE empNo='1018';
UPDATE emp_score SET com=90, excel=60, word=65 WHERE empNo='1019';
UPDATE emp_score SET com=70, excel=80, word=90 WHERE empNo='1020';

UPDATE emp_score SET com=75, excel=100, word=65 WHERE empNo='1021';
UPDATE emp_score SET com=80, excel=90, word=100 WHERE empNo='1022';
UPDATE emp_score SET com=70, excel=70, word=90 WHERE empNo='1023';
UPDATE emp_score SET com=60, excel=65, word=60 WHERE empNo='1024';
UPDATE emp_score SET com=100, excel=90, word=100 WHERE empNo='1025';
UPDATE emp_score SET com=65, excel=60, word=80 WHERE empNo='1026';
UPDATE emp_score SET com=90, excel=70, word=60 WHERE empNo='1027';
UPDATE emp_score SET com=95, excel=80, word=80 WHERE empNo='1028';
UPDATE emp_score SET com=30, excel=30, word=40 WHERE empNo='1029';
UPDATE emp_score SET com=95, excel=90, word=35 WHERE empNo='1030';

UPDATE emp_score SET com=100, excel=100, word=100 WHERE empNo='1031';
UPDATE emp_score SET com=25, excel=35, word=50 WHERE empNo='1032';
UPDATE emp_score SET com=40, excel=55, word=60 WHERE empNo='1033';
UPDATE emp_score SET com=60, excel=70, word=80 WHERE empNo='1034';
UPDATE emp_score SET com=70, excel=80, word=80 WHERE empNo='1035';
UPDATE emp_score SET com=90, excel=75, word=90 WHERE empNo='1036';
UPDATE emp_score SET com=95, excel=90, word=90 WHERE empNo='1037';
UPDATE emp_score SET com=60, excel=70, word=75 WHERE empNo='1038';
UPDATE emp_score SET com=85, excel=70, word=90 WHERE empNo='1039';
UPDATE emp_score SET com=80, excel=80, word=80 WHERE empNo='1040';

UPDATE emp_score SET com=80, excel=65, word=85 WHERE empNo='1041';
UPDATE emp_score SET com=70, excel=70, word=80 WHERE empNo='1042';
UPDATE emp_score SET com=95, excel=80, word=90 WHERE empNo='1043';
UPDATE emp_score SET com=65, excel=65, word=55 WHERE empNo='1044';
UPDATE emp_score SET com=45, excel=80, word=50 WHERE empNo='1045';
UPDATE emp_score SET com=95, excel=30, word=90 WHERE empNo='1046';
UPDATE emp_score SET com=45, excel=70, word=55 WHERE empNo='1047';
UPDATE emp_score SET com=80, excel=70, word=50 WHERE empNo='1048';
UPDATE emp_score SET com=50, excel=70, word=65 WHERE empNo='1049';
UPDATE emp_score SET com=90, excel=80, word=90 WHERE empNo='1050';

UPDATE emp_score SET com=100, excel=100, word=95 WHERE empNo='1051';
UPDATE emp_score SET com=75, excel=80, word=80 WHERE empNo='1052';
UPDATE emp_score SET com=80, excel=90, word=80 WHERE empNo='1053';
UPDATE emp_score SET com=90, excel=80, word=100 WHERE empNo='1054';
UPDATE emp_score SET com=60, excel=70, word=65 WHERE empNo='1055';
UPDATE emp_score SET com=70, excel=90, word=70 WHERE empNo='1056';
UPDATE emp_score SET com=40, excel=80, word=95 WHERE empNo='1057';
UPDATE emp_score SET com=50, excel=60, word=50 WHERE empNo='1058';
UPDATE emp_score SET com=35, excel=75, word=65 WHERE empNo='1059';
UPDATE emp_score SET com=75, excel=70, word=80 WHERE empNo='1060';

COMMIT;
