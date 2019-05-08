package com.example.owner.ppkrinc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class    ConfirmationPage extends AppCompatActivity {
    private  Bundle extraMatchData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation_page);
        extraMatchData = getIntent().getExtras();



        Button cancelButton = (Button) findViewById(R.id.CancelMatch);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                return;
            }
        });
    }

    public void goToMessaging(View view) {
        Intent intent = new Intent(this, Users.class);
        startActivity(intent);
    }
}
