package com.ns.tbe.repository;

import com.ns.tbe.model.nodes.OrderSource;
import org.neo4j.springframework.data.repository.ReactiveNeo4jRepository;
import reactor.core.publisher.Mono;

public interface OrderSourceRepository  extends ReactiveNeo4jRepository<OrderSource, Long> {

    Mono<OrderSource> findByName(String name);
}
