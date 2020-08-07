package com.ns.tbe.repository;

import com.ns.tbe.model.Member;
import org.neo4j.springframework.data.repository.ReactiveNeo4jRepository;
import reactor.core.publisher.Mono;

import java.math.BigInteger;

public interface MemberRepository extends ReactiveNeo4jRepository<Member, Long> {

    Mono<Member> findByMemberId(String memberId);
}
