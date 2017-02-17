package com.example.p1410764.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bouton;
    EditText nom;
    EditText prenom;
    EditText date;
    EditText mail;
    EditText tel;
    RadioButton sex;
    EditText postal;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom = (EditText) findViewById(R.id.editText) ;
        prenom = (EditText) findViewById(R.id.editText2) ;
        date = (EditText) findViewById(R.id.editText3) ;
        mail = (EditText) findViewById(R.id.editText4) ;
        tel = (EditText) findViewById(R.id.editText5) ;
        sex = (RadioButton) findViewById(R.id.radioMale) ;
        postal = (EditText) findViewById(R.id.editText6);



        bouton = (Button) findViewById(R.id.button);
        bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message="Validation : "+"\n";



                message += " nom : " + nom.getText() +"\n";
                message += " prenom : " + prenom.getText()+"\n";
                message += " date : " + date.getText()+"\n";
                message += " mail : " + mail.getText()+"\n";
                message += " tel : " + tel.getText()+"\n";
                message += " Adresse : " + postal.getText()+"\n";
                if(sex.isChecked()){
                    message += " sex : Homme \n";
                }
                else{
                    message += " sex : Femme \n";
                }


                Log.d("MainActivity", "onClick");
                openDialog(message);
            }
        });
    }
    public void openDialog(String mesg) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage(mesg);

        alertDialogBuilder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(MainActivity.this, "You clicked ok button", Toast.LENGTH_LONG).show();
            }
        });
/*
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });*/

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }


}
