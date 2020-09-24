package com.example.session11;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    private ArrayList<Task> todoList = new ArrayList<>();

    public static void main(String[] args) {

        ToDoList toDoList = new ToDoList();

        toDoList.addNewTask();
        System.out.print("=======");
        toDoList.printTodoList();
    }

    public void printTodoList() {
        for (int i = 0; i < todoList.size(); i++) {
            Task task = todoList.get(i);

            System.out.print(i);
            System.out.print(": " + task.getTitle());
        }
    }

    public void addNewTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Make a new task:");
        System.out.println("Please enter title:");
        String title = scanner.nextLine();

        System.out.println("Please enter description:");
        String description = scanner.nextLine();

        Task task = new Task(title, description, false);
        todoList.add(task);
    }

    public void finishTask(int index) {
        Task task = todoList.get(index);
        task.setDone(true);
    }


}
