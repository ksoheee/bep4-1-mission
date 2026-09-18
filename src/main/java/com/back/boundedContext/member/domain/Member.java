package com.back.boundedContext.member.domain;


import com.back.global.jpa.entity.BaseIdAndTime;
import com.back.shared.member.domain.SourceMember;
import com.back.shared.member.dto.MemberDto;
import com.back.shared.member.event.MemberModifiedEvent;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "MEMBER_MEMBER")
@NoArgsConstructor
public class Member extends SourceMember {

    public Member(String username, String password, String nickname) {
        super(username, password, nickname);
    }
    public int increaseActivityScore(int amount) {
        if(amount == 0) return getActivityScore();  //0점일때는 0점으로 덮어쓰기때문에 이벤트 발행 x

        setActivityScore(getActivityScore() + amount);

        publishEvent(
                new MemberModifiedEvent(new MemberDto(this))
        );
        return getActivityScore();
    }
}
