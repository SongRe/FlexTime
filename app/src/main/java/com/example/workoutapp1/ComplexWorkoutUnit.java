package com.example.workoutapp1;

public class ComplexWorkoutUnit {
    String title;
    int time;
    int photoId;

    //TODO: Add photoID drawables to distinguish between workout, rest, prolonged rest.
    public ComplexWorkoutUnit(String title, int time, int photoId) {
        this.title = title;
        this.time = time;
        this.photoId = photoId;
    }

}
