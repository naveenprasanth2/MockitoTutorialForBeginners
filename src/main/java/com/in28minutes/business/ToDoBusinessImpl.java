package com.in28minutes.business;

import com.in28minutes.data.api.ToDoService;

import java.util.List;


//TodoServiceImpl is the System Under Testing (SUT)
//TodoService is the dependency
public class ToDoBusinessImpl {
    private final ToDoService toDoService;

    public ToDoBusinessImpl(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String user){
        return toDoService.retrieveTodos(user).stream().filter(x -> x.contains("Spring")).toList();
    }
}
