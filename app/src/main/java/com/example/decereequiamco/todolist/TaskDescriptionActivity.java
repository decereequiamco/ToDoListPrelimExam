package com.example.decereequiamco.todolist;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TaskDescriptionActivity extends AppCompatActivity {


    // nikki's
    public static final String EXTRA_TASK_DESCRIPTION = "task";

    private EditText mDescriptionView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.decereequiamco.todolist.R.layout.activity_task_description);

        mDescriptionView = (EditText) findViewById(com.example.decereequiamco.todolist.R.id.descriptionText);

    }

    public void doneClicked(View view) {
        String taskDescription = mDescriptionView.getText().toString();

        if (!taskDescription.isEmpty()) {
            // 2
            Intent result = new Intent();
            result.putExtra(EXTRA_TASK_DESCRIPTION, taskDescription);
            setResult(RESULT_OK, result);

            if( mDescriptionView.getText().toString().length() == 0 )
                mDescriptionView.setError( "First name is required!" );
        } else {
            // 3
            Toast.makeText(getApplicationContext(), "Input Details!",
                    Toast.LENGTH_LONG).show();
            setResult(RESULT_CANCELED);
        }
// 4
        finish();
    }
}