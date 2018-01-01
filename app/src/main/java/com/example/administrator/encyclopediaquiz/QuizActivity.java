package com.example.administrator.encyclopediaquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;
    private TextView mQuestionTextView;

    private Question[] mQuestionsBank = new Question[]{
      new Question(R.string.question_geo,false),
            new Question(R.string.question_edu,false),
            new Question(R.string.question_it,true),
            new Question(R.string.question_phy,true),
            new Question(R.string.question_history,true),
    };

    private int mCurrentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

         mQuestionTextView = (TextView)findViewById(R.id.question_text_view);
        int question = mQuestionsBank[mCurrentIndex].getTextResId();
        mQuestionTextView.setText(question);

        mTrueButton = (Button)findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(QuizActivity.this,R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });
        mFalseButton = (Button)findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(QuizActivity.this,R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
