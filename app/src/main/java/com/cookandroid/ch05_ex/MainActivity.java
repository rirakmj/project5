package com.cookandroid.ch05_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        // 멤버 변수
        EditText Edit1, Edit2;
        Button BtnNum0, BtnNum1, BtnNum2, BtnNum3, BtnNum4, BtnNum5, BtnNum6, BtnNum7, BtnNum8, BtnNum9, BtnAdd, BtnSub, BtnMul, BtnDiv;
        TextView TextResult;
        String num1, num2;
        Float result1; // double 써도 됨
        double result2;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.ex_5_5);
            setTitle("테이블레이아웃 계산기");

            // 지역 변수, 바인딩
            Edit1 = findViewById(R.id.Edit1);
            Edit2 = findViewById(R.id.Edit2);
            BtnNum0 = findViewById(R.id.BtnNum0);
            BtnNum1 = findViewById(R.id.BtnNum1);
            BtnNum2 = findViewById(R.id.BtnNum2);
            BtnNum3 = findViewById(R.id.BtnNum3);
            BtnNum4 = findViewById(R.id.BtnNum4);
            BtnNum5 = findViewById(R.id.BtnNum5);
            BtnNum6 = findViewById(R.id.BtnNum6);
            BtnNum7 = findViewById(R.id.BtnNum7);
            BtnNum8 = findViewById(R.id.BtnNum8);
            BtnNum9 = findViewById(R.id.BtnNum9);
            BtnAdd = findViewById(R.id.BtnAdd);
            BtnSub = findViewById(R.id.BtnSub);
            BtnMul = findViewById(R.id.BtnMul);
            BtnDiv = findViewById(R.id.BtnDiv);
            TextResult = findViewById(R.id.TextResult);

            // BtnNum 개별 버튼 10개를 1개의 객체배역에 넣고 배열 멤버로 만든다
            // 객체 배열
            Button btnNumArr[] = new Button[10];
//            btnNumArr[0] = findViewById(R.id.BtnNum0);
//            btnNumArr[1] = findViewById(R.id.BtnNum1);
//            btnNumArr[2] = findViewById(R.id.BtnNum2);
//            btnNumArr[3] = findViewById(R.id.BtnNum3);
//            btnNumArr[4] = findViewById(R.id.BtnNum4);
//            btnNumArr[5] = findViewById(R.id.BtnNum5);
//            btnNumArr[6] = findViewById(R.id.BtnNum6);
//            btnNumArr[7] = findViewById(R.id.BtnNum7);
//            btnNumArr[8] = findViewById(R.id.BtnNum8);
//            btnNumArr[9] = findViewById(R.id.BtnNum9);

            // int nBtnArr[] = new int[10];
            // int nBtnArr[] = {1,2,3,4,5,6,7,8};
            int nBtnArr[] = {R.id.BtnNum0, R.id.BtnNum1, R.id.BtnNum2, R.id.BtnNum3,
                            R.id.BtnNum4, R.id.BtnNum5, R.id.BtnNum6, R.id.BtnNum7,
                            R.id.BtnNum8, R.id.BtnNum9};

            for(int i=0; i<btnNumArr.length; ++i)
            {
                // btnNumArr[i] = findViewById(R.id.num + i);
                btnNumArr[i] = findViewById(nBtnArr[i]);
            }

            for(int i=0; i<btnNumArr.length; ++i)
            {
                final int final_i = i;
                btnNumArr[i].setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        if(Edit1.isFocused())
                        {
                            String str1 = Edit1.getText().toString()+ final_i;
                            // str1 = str1 + "0";
                            Edit1.setText(str1);
                        }
                        else if(Edit2.isFocused())
                        {   String str2 = Edit2.getText().toString()+ final_i;
                            // str1 = str1 + "0";
                            Edit2.setText(str2);
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"에디트를 선택해 주세요", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }

//            BtnNum0.setOnClickListener(new View.OnClickListener(){
//                @Override
//                public void onClick(View view){
//                    if(Edit1.isFocused())
//                    {
//                        String str1 = Edit1.getText().toString()+ "0";
//                        // str1 = str1 + "0";
//                        Edit1.setText(str1);
//                    }
//                    else if(Edit2.isFocused())
//                    {   String str2 = Edit2.getText().toString()+ "0";
//                        // str1 = str1 + "0";
//                        Edit2.setText(str2);
//                    }
//                    else
//                    {
//                    Toast.makeText(getApplicationContext(),"에디트를 선택해 주세요", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
//
//            BtnNum1.setOnClickListener(new View.OnClickListener(){
//                @Override
//                public void onClick(View view){
//                    if(Edit1.isFocused())
//                    {
//                        String str1 = Edit1.getText().toString()+ "1";
//                        // str1 = str1 + "0";
//                        Edit1.setText(str1);
//                    }
//                    else if(Edit2.isFocused())
//                    {   String str2 = Edit2.getText().toString()+ "1";
//                        // str1 = str1 + "0";
//                        Edit2.setText(str2);
//                    }
//                    else
//                    {
//                        Toast.makeText(getApplicationContext(),"에디트를 선택해 주세요", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
//
//            BtnNum2.setOnClickListener(new View.OnClickListener(){
//                @Override
//                public void onClick(View view){
//                    if(Edit1.isFocused())
//                    {
//                        String str1 = Edit1.getText().toString()+ "2";
//                        // str1 = str1 + "0";
//                        Edit1.setText(str1);
//                    }
//                    else if(Edit2.isFocused())
//                    {   String str2 = Edit2.getText().toString()+ "2";
//                        // str1 = str1 + "0";
//                        Edit2.setText(str2);
//                    }
//                    else
//                    {
//                        Toast.makeText(getApplicationContext(),"에디트를 선택해 주세요", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
//
//            BtnNum3.setOnClickListener(new View.OnClickListener(){
//                @Override
//                public void onClick(View view){
//                    if(Edit1.isFocused())
//                    {
//                        String str1 = Edit1.getText().toString()+ "3";
//                        // str1 = str1 + "0";
//                        Edit1.setText(str1);
//                    }
//                    else if(Edit2.isFocused())
//                    {   String str2 = Edit2.getText().toString()+ "3";
//                        // str1 = str1 + "0";
//                        Edit2.setText(str2);
//                    }
//                    else
//                    {
//                        Toast.makeText(getApplicationContext(),"에디트를 선택해 주세요", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
//
//            BtnNum4.setOnClickListener(new View.OnClickListener(){
//                @Override
//                public void onClick(View view){
//                    if(Edit1.isFocused())
//                    {
//                        String str1 = Edit1.getText().toString()+ "4";
//                        // str1 = str1 + "0";
//                        Edit1.setText(str1);
//                    }
//                    else if(Edit2.isFocused())
//                    {   String str2 = Edit2.getText().toString()+ "4";
//                        // str1 = str1 + "0";
//                        Edit2.setText(str2);
//                    }
//                    else
//                    {
//                        Toast.makeText(getApplicationContext(),"에디트를 선택해 주세요", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
//
//            BtnNum5.setOnClickListener(new View.OnClickListener(){
//                @Override
//                public void onClick(View view){
//                    if(Edit1.isFocused())
//                    {
//                        String str1 = Edit1.getText().toString()+ "5";
//                        // str1 = str1 + "0";
//                        Edit1.setText(str1);
//                    }
//                    else if(Edit2.isFocused())
//                    {   String str2 = Edit2.getText().toString()+ "5";
//                        // str1 = str1 + "0";
//                        Edit2.setText(str2);
//                    }
//                    else
//                    {
//                        Toast.makeText(getApplicationContext(),"에디트를 선택해 주세요", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
//
//            BtnNum6.setOnClickListener(new View.OnClickListener(){
//                @Override
//                public void onClick(View view){
//                    if(Edit1.isFocused())
//                    {
//                        String str1 = Edit1.getText().toString()+ "6";
//                        // str1 = str1 + "0";
//                        Edit1.setText(str1);
//                    }
//                    else if(Edit2.isFocused())
//                    {   String str2 = Edit2.getText().toString()+ "6";
//                        // str1 = str1 + "0";
//                        Edit2.setText(str2);
//                    }
//                    else
//                    {
//                        Toast.makeText(getApplicationContext(),"에디트를 선택해 주세요", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
//
//            BtnNum7.setOnClickListener(new View.OnClickListener(){
//                @Override
//                public void onClick(View view){
//                    if(Edit1.isFocused())
//                    {
//                        String str1 = Edit1.getText().toString()+ "7";
//                        // str1 = str1 + "0";
//                        Edit1.setText(str1);
//                    }
//                    else if(Edit2.isFocused())
//                    {   String str2 = Edit2.getText().toString()+ "7";
//                        // str1 = str1 + "0";
//                        Edit2.setText(str2);
//                    }
//                    else
//                    {
//                        Toast.makeText(getApplicationContext(),"에디트를 선택해 주세요", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
//
//            BtnNum8.setOnClickListener(new View.OnClickListener(){
//                @Override
//                public void onClick(View view){
//                    if(Edit1.isFocused())
//                    {
//                        String str1 = Edit1.getText().toString()+ "8";
//                        // str1 = str1 + "0";
//                        Edit1.setText(str1);
//                    }
//                    else if(Edit2.isFocused())
//                    {   String str2 = Edit2.getText().toString()+ "8";
//                        // str1 = str1 + "0";
//                        Edit2.setText(str2);
//                    }
//                    else
//                    {
//                        Toast.makeText(getApplicationContext(),"에디트를 선택해 주세요", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
//
//            BtnNum9.setOnClickListener(new View.OnClickListener(){
//                @Override
//                public void onClick(View view){
//                    if(Edit1.isFocused())
//                    {
//                        String str1 = Edit1.getText().toString()+ "9";
//                        // str1 = str1 + "0";
//                        Edit1.setText(str1);
//                    }
//                    else if(Edit2.isFocused())
//                    {   String str2 = Edit2.getText().toString()+ "9";
//                        // str1 = str1 + "0";
//                        Edit2.setText(str2);
//                    }
//                    else
//                    {
//                        Toast.makeText(getApplicationContext(),"에디트를 선택해 주세요", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });


            BtnAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    num1 = Edit1.getText().toString();
                    num2 = Edit2.getText().toString();
                    if (num1.equals("") || num2.equals("")) {
                        Toast.makeText(MainActivity.this, "숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                        TextResult.setText("계산 결과: ");
                    } else {
                        result1 = Float.parseFloat(num1) + Float.parseFloat(num2);
                        TextResult.setText("계산 결과: " + result1);

                    }
                }
            });

            BtnSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    num1 = Edit1.getText().toString();
                    num2 = Edit2.getText().toString();
                    if (num1.equals("") || num2.equals("")) {
                        Toast.makeText(MainActivity.this, "숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                        TextResult.setText("계산 결과: ");
                    } else {
                        result1 = Float.parseFloat(num1) - Float.parseFloat(num2);
                        TextResult.setText("계산 결과: " + result1);
                    }
                }
            });

            BtnMul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    num1 = Edit1.getText().toString();
                    num2 = Edit2.getText().toString();
                    if (num1.equals("") || num2.equals("")) {
                        Toast.makeText(MainActivity.this, "숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                        TextResult.setText("계산 결과: ");
                    } else {
                        result1 = Float.parseFloat(num1) * Float.parseFloat(num2);
                        TextResult.setText("계산 결과: " + result1);
                    }
                }
            });

            BtnDiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view){
                    num1 = Edit1.getText().toString();
                    num2 = Edit2.getText().toString();
                    if (num1.equals("") || num2.equals("")) {
                        Toast.makeText(MainActivity.this, "숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                        TextResult.setText("계산 결과: ");
                    } else if (num1.equals("0") || num2.equals("0")) {
                        Toast.makeText(MainActivity.this, "계산 오류", Toast.LENGTH_SHORT).show();
                        TextResult.setText("계산 결과: ");
                    } else {
                        result1 = Float.parseFloat(num1) / Float.parseFloat(num2);
                        result2 = (int)(result1*100)/100.0; // 소수점 둘째자리 밑으로 버림
                        TextResult.setText("계산 결과: " + result2);
                    }
                }
            });

        }
    }

 //    @Override
 //    protected void onCreate(Bundle savedInstanceState) {
 //        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main); // xml로 화면 구성
        // 실습 5-1
        // 0. 레이아웃 레이아웃 param(너비, 높이) 객체
        // 1. 레이아웃 java 객체 만들기
        // 2. 레이아웃 java 객체의 속성 설정 (orientation, backgroundcolor)
        // 3. view java 객체 만들기 (예: 버튼, 텍스트뷰, 에딧텍스트)
        // 4. view 객체의 속성 설정
        // 5. view 객체를 레이아웃 객체에 add한다
        // 6. 레이아웃과 param를 set콘텐트view한다

        // 0. 레이아웃 java 객체의 param(너비, 높이)
//        LinearLayout.LayoutParams param
//                = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
//                                                LinearLayout.LayoutParams.MATCH_PARENT);

        // 1. 레이아웃 java 객체 만들기
//        LinearLayout baseLayout = new LinearLayout(this); // 소속 액티비티 명시(=this)

        // 2. 레이아웃 java 객체의 속성 설정 (orientation, backgroundcolor)
//        baseLayout.setOrientation(LinearLayout.VERTICAL);
//        baseLayout.setBackgroundColor(Color.rgb(0,255,0));

        // 3. view java 객체 만들기 (예: 버튼, 텍스트뷰, 에딧텍스트)
//        Button btn1 = new Button(this);

        // 4. view 객체의 속성 설정(text, 배경색)
//        btn1.setText("버튼입니다.");
//        btn1.setBackgroundColor(Color.MAGENTA);

        // 5. view 객체를 레이아웃 객체에 add한다
//        baseLayout.addView(btn1);

        // 5-2. 이벤트 처리
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "클릭하였음", Toast.LENGTH_SHORT).show();
//            }
//        });

        // 6. 레이아웃과 param를 set콘텐트view한다
//        setContentView(baseLayout, param);
//    }
//}

