package com.back.boundedContext.market.out;

import com.back.boundedContext.market.domain.MarketMember;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MarketMemberRepository extends CrudRepository<MarketMember, Integer> {
    Optional<MarketMember> findByUsername(String username);
}
