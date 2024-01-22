package com.spbt.traditonaltodoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spbt.traditonaltodoapp.models.TodoItem;


public interface TodoItemRepository extends JpaRepository<TodoItem,Long>{

}
