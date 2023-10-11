package com.example.shivamsportfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView list=findViewById(R.id.recycler_view_projects);
        Project [] projects={
                new Project("Getting started app","A default hello world app",R.drawable.getting_started),
                new Project("Motivational Quote","Making a simple change to layout, with my personal quote",R.drawable.quote),
                new Project("BMI Calculator","A real life BMI calculator built using condition logic",R.drawable.calculator),
                new Project("Inches Convertor","A basic convertor use to convert inches into metre",R.drawable.tape),
                new Project("The Hungry Developer","A basic food menu app consist of starters,main course and dessert using List view and Intents ",R.drawable.hungry_developer),
                new Project("Temperature convertor","Celsius to fahrenheit convertor and vice versa using logical operator",R.drawable.download),
                new Project("Calculator","A calculation app for basic operator of two numbers",R.drawable.download__1_)
        };
        ProjectsAdapter adapter=new ProjectsAdapter(projects);
        list.setAdapter(adapter);
    }
}