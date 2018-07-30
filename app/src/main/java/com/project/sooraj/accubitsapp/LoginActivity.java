package com.project.sooraj.accubitsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {
    private EditText editTextMobile;
    private Button btnContinue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextMobile =(EditText) findViewById(R.id.editTextMobile);
        btnContinue=(Button) findViewById(R.id.buttonContinue);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mobile = editTextMobile.getText().toString().trim();
                Pattern p = Pattern.compile("^[6-9]\\d{9}$");
                Matcher matcher = p.matcher(mobile);
                System.out.println( matcher.matches());
                if(mobile.isEmpty() || mobile.length() < 10|| !matcher.matches()){
                    editTextMobile.setError("Enter a valid mobile");
                    editTextMobile.requestFocus();

                    return;
                }else{
                   if(FirebaseAuth.getInstance().getCurrentUser()==null){
                       Log.d("TAG",""+FirebaseAuth.getInstance().getCurrentUser());

                Intent intent = new Intent(LoginActivity.this, VerifyPhoneActivity.class);
                intent.putExtra("mobile", mobile);
                startActivity(intent);}else{

                       Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                       startActivity(intent);
                   }
                }
            }
        });
    }
}
