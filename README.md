- # basic-blog-dev

  ## 최근 업데이트 내용
  Spring Data JPA를 활용한 간단한 API 구현 및 H2 인메모리 데이터베이스 설정

  ## 상세 내용
  1. Spring Data JPA를 사용하여 엔티티와 리포지토리 정의
  2. H2 인메모리 데이터베이스 설정 및 초기 데이터 삽입
  3. RESTful API 엔드포인트 구현 (GET 요청)

  ## 사용 기술
  * Spring Boot 3.2.0
  * Spring Data JPA
  * H2 인메모리 데이터베이스
  * Lombok

  ## 프로젝트 구조
  * `Member`: JPA 엔티티 클래스
  * `MemberRepository`: Spring Data JPA 리포지토리 인터페이스
  * `TestService`: 비즈니스 로직을 처리하는 서비스 클래스
  * `TestController`: API 엔드포인트를 정의하는 컨트롤러 클래스

  ## 데이터베이스 설정
  * H2 인메모리 데이터베이스 사용
  * `application.yml`에서 JPA 및 데이터베이스 관련 설정
  * `data.sql` 파일을 통해 애플리케이션 시작 시 초기 데이터 삽입

  ## 테스트 방법
  1. 애플리케이션 실행
  2. 브라우저 또는 API 클라이언트에서 `/test` 엔드포인트에 GET 요청 전송
  3. 응답으로 Member 목록 확인

  ## 주의사항
  * H2 인메모리 데이터베이스는 애플리케이션 재시작 시 초기화됨
