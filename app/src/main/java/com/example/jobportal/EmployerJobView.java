package com.example.jobportal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class EmployerJobView extends AppCompatActivity {
    private int jobId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String s = intent.getExtras().get("JobId").toString();
        jobId = Integer.parseInt(s);
        setContentView(R.layout.activity_employer_job_view);

        ((TextView)findViewById(R.id.textViewJobDescription)).setText(s);

        Button btnViewApplicants = (Button)findViewById(R.id.btnViewApplicants);
        btnViewApplicants.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(EmployerJobView.this,ApplicantsList.class);
                startActivity(intent);
            }
        });
    }
}
