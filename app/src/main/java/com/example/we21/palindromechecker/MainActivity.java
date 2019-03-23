package com.example.we21.palindromechecker;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8;
    int status=0;
    Button chkBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
System.out.println("Test");
        setContentView(R.layout.activity_main);
        txt1=(EditText) findViewById(R.id.txt1);
        txt2=(EditText) findViewById(R.id.txt2);
        txt3=(EditText) findViewById(R.id.txt3);
        txt4=(EditText) findViewById(R.id.txt4);
        txt5=(EditText) findViewById(R.id.txt5);
        txt6=(EditText) findViewById(R.id.txt6);
        txt7=(EditText) findViewById(R.id.txt7);
        txt8=(EditText) findViewById(R.id.txt8);
        chkBtn=(Button) findViewById(R.id.btnCheck);
    }

    public void checkPalidrome(View view) {
        palidromecheker p=new palidromecheker();
       /* Editable t=txt1.getText();
        String qq=t.toString();*/
        if(status==0) {
            if (p.check(txt1.getText().toString())) {
                txt1.setBackgroundColor(Color.rgb(119, 179, 0));
            } else {
                txt1.setBackgroundColor(Color.rgb(153, 0, 0));
            }

            if (p.check(txt2.getText().toString())) {
                txt2.setBackgroundColor(Color.rgb(119, 179, 0));
            } else {
                txt2.setBackgroundColor(Color.rgb(153, 0, 0));
            }

            if (p.check(txt3.getText().toString())) {
                txt3.setBackgroundColor(Color.rgb(119, 179, 0));
            } else {
                txt3.setBackgroundColor(Color.rgb(153, 0, 0));
            }

            if (p.check(txt4.getText().toString())) {
                txt4.setBackgroundColor(Color.rgb(119, 179, 0));
            } else {
                txt4.setBackgroundColor(Color.rgb(153, 0, 0));
            }

            if (p.check(txt5.getText().toString())) {
                txt5.setBackgroundColor(Color.rgb(119, 179, 0));
            } else {
                txt5.setBackgroundColor(Color.rgb(153, 0, 0));
            }

            if (p.check(txt6.getText().toString())) {
                txt6.setBackgroundColor(Color.rgb(119, 179, 0));
            } else {
                txt6.setBackgroundColor(Color.rgb(153, 0, 0));
            }

            if (p.check(txt7.getText().toString())) {
                txt7.setBackgroundColor(Color.rgb(119, 179, 0));
            } else {
                txt7.setBackgroundColor(Color.rgb(153, 0, 0));
            }

            if (p.check(txt8.getText().toString())) {
                txt8.setBackgroundColor(Color.rgb(119, 179, 0));
            } else {
                txt8.setBackgroundColor(Color.rgb(153, 0, 0));
            }
            chkBtn.setText("Reset");
            status=1;

        }else if(status==1){
            chkBtn.setText("Check");
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");
            txt5.setText("");
            txt6.setText("");
            txt7.setText("");
            txt8.setText("");

            txt1.setBackgroundColor(Color.rgb(170,170,170));
            txt2.setBackgroundColor(Color.rgb(170,170,170));
            txt3.setBackgroundColor(Color.rgb(170,170,170));
            txt4.setBackgroundColor(Color.rgb(170,170,170));
            txt5.setBackgroundColor(Color.rgb(170,170,170));
            txt6.setBackgroundColor(Color.rgb(170,170,170));
            txt7.setBackgroundColor(Color.rgb(170,170,170));
            txt8.setBackgroundColor(Color.rgb(170,170,170));
            status=0;
        }
    }
}
