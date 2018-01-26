package com.xyz.www.setawaycars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.xyz.www.setawaycars.Corporate.HomeActivity;

public class LoginActivity extends AppCompatActivity {

    Button loginbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        loginbutton=(Button)findViewById(R.id.btn_home_login);


        //loginButtonClick

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(it);
            }
        });

        //

    }
}
