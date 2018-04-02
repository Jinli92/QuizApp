package com.example.jinliyu.quizapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button loginbtn;
EditText username;
EditText password;
String pw;
String user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

       public void clickhandle(View view) {
           switch (view.getId()) {



               case R.id.loginbutton:


                   loginbtn = findViewById(R.id.loginbutton);
                   username = findViewById(R.id.usernameTxt);
                   user = username.getText().toString();
                   password = findViewById(R.id.pwTxt);
                   pw = password.getText().toString();

               if (pw.equals("123")) {
                   Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                   intent.putExtra("key", user);
                   startActivity(intent);
               } else {
                   showDialog();
               }
           }
       }





    private void showDialog() {
        AlertDialog.Builder alertDialog = new
                AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle("Something wrong");
        alertDialog.setMessage("password or username is not correct");
        alertDialog.setCancelable(false);

        alertDialog.setPositiveButton("ok, try it again", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
               // Toast.makeText(MainActivity.this,"dialog ok button clicked",Toast.LENGTH_SHORT).show();
            }
        });

        alertDialog.setNegativeButton("don't want to login", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        alertDialog.show();
    }


}
