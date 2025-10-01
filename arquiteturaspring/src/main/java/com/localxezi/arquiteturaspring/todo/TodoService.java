package com.localxezi.arquiteturaspring.todo;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private TodoRepository repository;
	
	public TodoService(TodoRepository repository) {
		this.repository = repository;
	}
	
	public TodoEntity salvar(TodoEntity novoTodo) {
		return repository.save(novoTodo);
	}
}