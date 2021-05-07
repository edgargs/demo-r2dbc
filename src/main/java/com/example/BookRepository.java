package com.example;

import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.r2dbc.annotation.R2dbcRepository;
import io.micronaut.data.repository.reactive.ReactiveStreamsCrudRepository;

@R2dbcRepository(dialect = Dialect.H2)
public interface BookRepository extends ReactiveStreamsCrudRepository<Book, Long> {
}