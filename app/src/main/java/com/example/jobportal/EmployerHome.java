package com.example.jobportal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class EmployerHome extends AppCompatActivity implements PostedJobsListFragment.OnJobSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employer_home);

        Button btnPostJob = (Button)findViewById(R.id.btnPostJob);
        btnPostJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmployerHome.this,PostJob.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public void onJobSelected(int jobId) {
        Intent intent = new Intent(this,EmployerJobView.class);
        intent.putExtra("JobId",jobId);
        startActivity(intent);
    }
}
