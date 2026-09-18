package com.back.shared.member.domain;


import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


/**
 * 복제 Member 클래스용 상위 클래스
 * id와 날짜 직접
 */
@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class ReplicaMember extends BaseMember {
    @Id
    private int id;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;

    public ReplicaMember(String username, String password, String nickname) {
        super(username, password, nickname);
    }
}
