package me.kimdongjoon.springbootdeveloper;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Entity // Member 객체를 JPA가 관리하는 엔티티로 지정
public class Member {
    @Id // Id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id; // DB 테이블의 'id' 컬럼과 매칭

    @Column(name = "name", nullable = false)
    private String name; // DB 테이블의 'name' 컬럼과 매칭

    /**
     * Transactional 애너테이션이 포함된 메서드에서 호출되면
     * JPA의 변경 감지 기능으로 엔티티의 필드값이 변경될 때
     * 변경 사항을 데이터베이스에 자동으로 반영
     * 엔티티가 영속 상태일 때 필드값을 변경하고 트랜잭션이 커밋되면
     * JPA는 변경 사항을 데이터베이스에 자동으로 적용
     */
    public void changeName(String name) {
        this.name = name;
    }
}
