package com.in28minutes.data.api;

import java.util.List;

public interface ToDoService {
    List<String> retrieveTodos(String user);
}
