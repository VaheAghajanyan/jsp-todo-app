package com.company.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static int COUNTER = 0;
    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(++COUNTER, "in28minutes", "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++COUNTER, "in28minutes", "Learn Devops", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++COUNTER, "in28minutes", "Learn Full Stack Development", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }

    public void addTodo(String name, String description, LocalDate date, boolean isDone) {
        todos.add(new Todo(++COUNTER, name, description, date, isDone));
    }

    public void deleteTodo(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;
    }

    public void updateTodo(Todo todo) {
        deleteTodo(todo.getId());
        todos.add(todo);
    }
}
