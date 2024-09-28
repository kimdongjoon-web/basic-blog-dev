# Basic Blog Dev

## 업데이트 내용
단위 테스트 추가

## 상세 내용
1. MockMvc를 사용한 컨트롤러 단위 테스트 추가

## 사용 기술
- Spring Boot 3.2.0
- Spring Data JPA
- H2 인메모리 데이터베이스
- Lombok
- JUnit 5
- MockMvc

## 단위 테스트
- MockMvc를 사용하여 컨트롤러 레벨의 단위 테스트 구현
- `TestControllerTest`와 `QuizControllerTest` 클래스에서 각 컨트롤러의 엔드포인트 테스트

### MockMvc 설명
MockMvc는 실제 서버를 구동하지 않고도 Spring MVC 동작을 재현할 수 있게 해주는 테스트 프레임워크

주요 특징:

- HTTP 요청을 시뮬레이션하여 컨트롤러를 테스트
- 응답의 상태 코드, 헤더, 본문 등을 검증
- `@AutoConfigureMockMvc` 어노테이션을 사용하여 쉽게 설정 가능
- 테스트 메소드에서 `perform()` 메소드를 통해 요청을 보내고, `andExpect()` 메소드로 응답을 검증

예시:
```java
mockMvc.perform(get("/test"))
       .andExpect(status().isOk())
       .andExpect(jsonPath("$[0].name").value("홍길동"));
```

## 주의사항
- H2 인메모리 데이터베이스는 애플리케이션 재시작 시 초기화됨
- 단위 테스트 실행 시 실제 데이터베이스에 영향을 주지 않음
