package com.example.madrasazapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class  MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);

        Button addStudent = findViewById(R.id.button);
        Button showStudents = findViewById(R.id.button2);
        Button insertStudent = findViewById(R.id.button3);
        Button showTasks = findViewById(R.id.button4);
        //Button visitGithub = findViewById(R.id.visit_github_btn);
        ImageButton git=findViewById(R.id.imageButton);

        addStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveActivity = new Intent(MainActivity.this, AddStudent.class);
                startActivity(moveActivity);
            }
        });
        showStudents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveActivity = new Intent(MainActivity.this, ShowStudents.class);
                startActivity(moveActivity);
            }
        });

        insertStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveActivity = new Intent(MainActivity.this, InsertDailyTask.class);
                startActivity(moveActivity);
            }
        });

        showTasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveActivity = new Intent(MainActivity.this, ShowTasksActivity.class);
                startActivity(moveActivity);
            }
        });

        /*visitGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String githubUri = "https://github.com/mzubair746/MadarasaApp.git";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(githubUri));
                startActivity(intent);
            }
        });*/
        git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gituri="https://github.com/mzubair746/MadarasaApp.git";
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(gituri));
                startActivity(intent);
            }
        });
    }
}