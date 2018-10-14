package com.example.smartvote;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        final Button nextButton = findViewById(R.id.Check_Button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText idcardEditText = findViewById(R.id.ID_card);
                String id = idcardEditText.getText().toString();
                if(id.length()!= 13){
                    Toast t = Toast.makeText(SecondPage.this,"กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก", Toast.LENGTH_LONG);
                    t.show();
                }else{
                    if(id.equals("1111111111111")||id.equals("2222222222222")){
                        AlertDialog.Builder dialog = new AlertDialog.Builder(SecondPage.this);
                        dialog.setTitle("ผลการสอบสิทธิเลือกตั้ง");
                        dialog.setMessage("คูณเป็นผู้มีสิทธิเลือกตั้ง");

                        //ถ้าเป็น negative button นั้นจะอยู่ทางขวาสุด

                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //finish();
                            }
                        });
                        dialog.setCancelable(false);
                        dialog.show();
                    }else{
                        AlertDialog.Builder dialog = new AlertDialog.Builder(SecondPage.this);
                        dialog.setTitle("ผลการสอบสิทธิเลือกตั้ง");
                        dialog.setMessage("คูณไม่มีสิทธิเลือกตั้ง");

                        //ถ้าเป็น negative button นั้นจะอยู่ทางขวาสุด

                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                               // finish();
                            }
                        });
                        dialog.setCancelable(false);
                        dialog.show();
                    }
                }
            }
        });
        }
    }
