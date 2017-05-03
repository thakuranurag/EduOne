package com.nitrr.cse.incredible.eduone;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

        import java.util.ArrayList;

public class Doubt extends AppCompatActivity {

    private TextView question,answer;
    private EditText editTextAnswer,editQuestion;
    private Button submitButton,submitQues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doubt);

        question = (TextView)findViewById(R.id.textView1);
        answer = (TextView)findViewById(R.id.textView2);
        editTextAnswer = (EditText)findViewById(R.id.editTextAnswer);
        submitButton  =(Button)findViewById(R.id.submitButton);
        editQuestion = (EditText)findViewById(R.id.editQuestion);
        submitQues= (Button)findViewById(R.id.quesButton);





        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                submitButton.setVisibility(View.GONE);
                String ans=  editTextAnswer.getText().toString();
                answer.setText(ans);
                editTextAnswer.setVisibility(View.GONE);

            }
        });

        submitQues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String qs = editQuestion.getText().toString();
                question.setVisibility(View.VISIBLE);
                question.setText(qs);
                editQuestion.setText("");

            }
        });

    }


}


