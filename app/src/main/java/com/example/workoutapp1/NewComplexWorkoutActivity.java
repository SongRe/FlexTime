package com.example.workoutapp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class NewComplexWorkoutActivity extends AppCompatActivity {
    LinearLayout cwLinearLayout;
    Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_complex_workout);
        cwLinearLayout = findViewById(R.id.complex_workout_unit_list);
        addBtn = findViewById(R.id.add_interval_button);
        //TODO: Add functionality for this by letting the "Add" button add either a rest time, workout time, or prolonged rest time.
        //TODO: THis should create a new  complex workout unit (cardview) , with a default photoID based on selection
        //TODO: Saving functionality should read each card and save it into a new workout
    }
}
