package com.nitrr.cse.incredible.eduone.Courses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nitrr.cse.incredible.eduone.Login_Register.Login;
import com.nitrr.cse.incredible.eduone.R;

public class CourseReg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_reg);
        Button student= (Button) findViewById(R.id.buttonstu);

        Button faculty= (Button) findViewById(R.id.buttonfac);

        faculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ourintent=new Intent(CourseReg.this,Faculty.class);
                startActivity(ourintent);

            }
        });
    }
}
