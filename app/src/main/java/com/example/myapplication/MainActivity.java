package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2;
    TextView txt_result;
    Button btnAdd,btnSub,btnMul,btnDiv;
    Integer result;

    private  int geteditText1(){
        return Integer.parseInt(editText2.getText().toString());
    }
    private  int geteditText2(){
        return Integer.parseInt(editText1.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("초간단 계산기");
        txt_result.setTextSize(20);

        txt_result = (TextView)findViewById(R.id.txt_result);

        editText1 = (EditText)findViewById(R.id.editText1); //final로 local 변수 접근가능
        editText2 = (EditText)findViewById(R.id.editText2);

        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnMul = (Button)findViewById(R.id.btnMul);
        btnDiv = (Button)findViewById(R.id.btnDiv);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("계산결과:"+(geteditText1()+geteditText2()));
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText1.getText().toString().equals("")  || editText2.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "값을 입력하세요",Toast.LENGTH_SHORT).show();
                }else{
                    num1 = editText1.getText().toString();
                    num2 = editText2.getText().toString();
                    result = Integer.parseInt(num1) - Integer.parseInt(num2);
                    txt_result.setText("계산 결과 : " + result.toString());
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText1.getText().toString().equals("")  || editText2.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "값을 입력하세요",Toast.LENGTH_SHORT).show();
                }else{
                    num1 = editText1.getText().toString();
                    num2 = editText2.getText().toString();
                    result = Integer.parseInt(num1) * Integer.parseInt(num2);
                    txt_result.setText("계산 결과 : " + result.toString());
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText1.getText().toString().equals("")  || editText2.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "값을 입력하세요",Toast.LENGTH_SHORT).show();
                }else{
                    num1 = editText1.getText().toString();
                    num2 = editText2.getText().toString();
                    result = Integer.parseInt(num1) / Integer.parseInt(num2);
                    txt_result.setText("계산 결과 : " + result.toString());
                }
            }
        });

    }
}