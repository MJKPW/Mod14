package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static Task makeTask(Tasks task) {

        switch(task) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "milk", 2);
            case PAINTING:
                return new PaintingTask("Painting", "green", "wall");
            case DRIVING:
                return new DrivingTask("Driving", "Warsaw", "truck");
            default:
                return null;

        }
    }

}
