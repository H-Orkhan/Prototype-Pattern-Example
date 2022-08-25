package com.example.pattern.prototype;

public class Application {
    public static void main(String[] args) {
        Project master = new Project(1, "My_Super_Project", "print(Hello World)");
        System.out.printf("Orignal Project = %s%n", master);


        Project masterClone = (Project) master.copy();
        System.out.printf("Cloned Project = %s%n", masterClone);

        ProjectFactory projectFactory = new ProjectFactory(master);
        Project masterCloneFromFactory = projectFactory.copyObject();
        System.out.printf("Cloned Project from Factory = %s%n", masterCloneFromFactory);
    }
}
