# Basic Blog Dev

## 업데이트 내용
- 테스트용 데이터 추가
- 테스트 설정 추가
- Member 클래스에 수정 메서드 추가
- MemberRepository 클래스에 쿼리 메서드 추가
- MemberRepositoryTest 추가

![JPA drawio](https://github.com/user-attachments/assets/360883b8-f30f-42f7-b1a0-dc16861fddfa)

## 학습 내용
- ORM(Object-relational mapping) : 자바의 객체와 데이터베이스를 연결하는 프로그래밍 기법
  - 객체와 데이터베이스를 연결해 자바 언어로 데이터베이스를 다룰 수 있게 하는 도구
  - ORM에는 여러 종류가 있다. 자바에서는 JPA를 표준으로 사용한다.


  - JPA(Java persistence API)
    - 자바에서 관계형 데이터베이스를 사용하는 방식을 정의한 인터페이스
    - 인터페이스이므로 실제 사용을 위해서는 ORM 프레임워크를 추가로 선택해야 함
      - 대표적으로는 하이버네이트(hibernate)를 많이 사용
      - Hibernate : JPA 인터페이스를 구현한 구현체이자 자바용 ORM 프레임워크
        - 내부적으로는 JDBC API를 사용
        - 하이버네이트의 목표는 자바 객체를 통해 DB종류에 상관없이 DB를 자유롭게 사용하는 것


- Entity : 데이터베이스의 테이블과 매핑되는 객체


- Spring Data JPA : 스프링 데이터의 공통적인 기능에 JPA의 유용한 기술이 추가된 기술


- JPA에서 데이터를 수정할 때는 @Transactional 애너테이션 사용
  - Transactional 애너테이션이 포함된 메서드에서 호출되면 JPA는 변경 감지 기능을 통해 엔티티의 필드값이 변경될 때 그 변경 사항을 데이터베이스에 자동으로 반영
  - 만약 엔티티가 영속 상태일 때 필드값을 변경하고 트랜잭션이 커밋되면 JPA는 변경 사항을 데이터베이스에 자동으로 적용


- @Entity 애너테이션은 객체를 JPA가 관리하는 엔티티로 지정
  - 즉, 클래스와 실제 데이터베이스의 테이블을 매핑


- Repository는 Entity에 있는 데이터를 조회하거나 저장, 변경, 삭제를 할 때 사용하는 인터페이스
- 스프링 데이터 JPA에서 제공하는 인터페이스인 JpaRepository 클래스를 상속받아 간단하게 구현 가능
- JpaRepository 클래스를 상속받을 때, 엔티티 + 엔티티의 기본키 타입(ex. Member, Long)을 인수로 넣어준다