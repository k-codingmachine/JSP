#DB 생성 및 기본 data 입력
create table board(
num number(5) primary key ,
pass varchar2(30),
name varchar2(30),
email varchar2(30),
title varchar2(50),
content varchar2(1000),
readcount number(4) default 0,
writedate date default sysdate
);

create SEQUENCE board_seq start with 1 INCREMENT by 1;

insert into board (num, name, email, pass, title, content)
values(board_seq.nextval, '성윤정', 'pink@naver.com', '1234', '첫방문', '반값습니다.');

insert into board (num, name, email, pass, title, content)
values(board_seq.nextval, '전수빈', 'spring@naver.com', '1234', '바보', '반값습니다.');

insert into board (num, name, email, pass, title, content)
values(board_seq.nextval, '전원지', 'react@naver.com', '1234', '집에가자', '반값습니다.');

insert into board (num, name, email, pass, title, content)
values(board_seq.nextval, '조조', 'java@naver.com', '1234', '졸려', '반값습니다.');

insert into board (num, name, email, pass, title, content)
values(board_seq.nextval, '관우', 'javascript@naver.com', '1234', '맛있다', '반값습니다.');

commit;

select *from board;

#커넥션 풀 설정

-server 적용
<Resource name="jdbc/myoracle" auth="Container"
type="javax.sql.DataSource" driverClassName="oracle.jdbc.OracleDriver"
url="jdbc:oracle:thin:@127.0.0.1:1521:xe"
username="scott" password="tiger" maxTotal="20" maxIdle="10"
maxWaitMillis="-1"/>
		              
- 01_DBCP.jsp 적용
Context initContext = new InitialContext();
Context envContext  = (Context)initContext.lookup("java:/comp/env");
DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
Connection conn = ds.getConnection();
System.out.println("conn : " + conn);
