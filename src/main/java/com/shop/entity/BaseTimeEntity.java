package com.shop.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@EntityListeners(value={AuditingEntityListener.class}) //Auditing 적용
@MappedSuperclass //공통 매핑정보가 필요할 때 사용. 상속 받는 자식 클래스에 매핑 정보만 제공함.
@Getter @Setter
public class BaseTimeEntity { // 등록자, 수정자를 넣지 않는 테이블은 이 클래스 상속

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime regTime;

    @LastModifiedDate
    private LocalDateTime updateTime;
}
