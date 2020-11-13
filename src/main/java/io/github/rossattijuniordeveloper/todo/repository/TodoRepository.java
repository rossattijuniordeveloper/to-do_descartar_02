package io.github.rossattijuniordeveloper.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.rossattijuniordeveloper.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
