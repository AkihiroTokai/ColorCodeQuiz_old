package com.example.owner.colorcodequiz;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class ColortoCodeActivity extends AppCompatActivity {


    private TextView progress;

    private ImageView question;
    private ImageView check_select1;
    private ImageView check_select2;
    private ImageView check_select3;
    private ImageView check_select4;

    private TextView answer1;
    private TextView answer2;
    private TextView answer3;
    private TextView answer4;

    private int gameCount;
    private int check_answer;
    private int noq;
    private int noca;

    private boolean nextquestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colorto_code);
        gameCount = 1;
        noca = 0 ;

        answer1 = (TextView) findViewById(R.id.answer1);
        answer2 = (TextView) findViewById(R.id.answer2);
        answer3 = (TextView) findViewById(R.id.answer3);
        answer4 = (TextView) findViewById(R.id.answer4);

        progress =(TextView)findViewById(R.id.progress);

        check_select1 = (ImageView)findViewById(R.id.check_select1);
        check_select2 = (ImageView)findViewById(R.id.check_select2);
        check_select3 = (ImageView)findViewById(R.id.check_select3);
        check_select4 = (ImageView)findViewById(R.id.check_select4);
        question = (ImageView)findViewById(R.id.imageView);

        Intent intent = getIntent();
        noq  = intent.getIntExtra("getnumber",0);
        setanswer();
    }
    public void select1(View view) {
        if (!nextquestion)   {
            if (check_answer == 1) {
                check_select1.setImageResource(R.drawable.maru);
                noca = noca+1;
            } else {
                check_select1.setImageResource(R.drawable.batu);
            }
            gameCount = gameCount + 1;
            if (gameCount <= noq) {
                progress.setText("Progress:" + gameCount + "/"+noq);
                nextquestion = true;
            }
            if (gameCount == noq){
              //IntenttoMenu
            }
            }else {
                setanswer();
                nextquestion = false;
                check_select1.setImageDrawable(null);
            }
        }

    public void select2(View view) {
        if (!nextquestion)   {
            if (check_answer == 2) {
                check_select2.setImageResource(R.drawable.maru);
                noca = noca+1;
            } else {
                check_select2.setImageResource(R.drawable.batu);
            }
            gameCount = gameCount + 1;
            if (gameCount <= noq) {
                progress.setText("Progress:" + gameCount + "/"+noq);
            }
            nextquestion = true;
        }else {
            setanswer();
            nextquestion = false;
            check_select2.setImageDrawable(null);
        }
    }

    public void select3(View view) {
        if (!nextquestion) {
            if (check_answer == 3) {
                check_select3.setImageResource(R.drawable.maru);
                noca = noca+1;
            } else {
                check_select3.setImageResource(R.drawable.batu);
            }
            gameCount = gameCount + 1;
            if (gameCount <= noq) {
            progress.setText("Progress:" + gameCount + "/" + noq);
            nextquestion = true;
            }
        }else {
            setanswer();
            nextquestion = false;
            check_select3.setImageDrawable(null);
        }
    }

    public void select4(View view) {
        if (!nextquestion )   {
            if (check_answer == 4) {
                check_select4.setImageResource(R.drawable.maru);
            } else {
                check_select4.setImageResource(R.drawable.batu);
            }
            gameCount = gameCount + 1;
            if (gameCount <=noq) {
                progress.setText("Progress:" + gameCount + "/"+noq);
            }
            nextquestion = true;
        }else {
            setanswer();
            nextquestion = false;
            check_select4.setImageDrawable(null);
        }

    }
     public void setanswer() {
         //createColorCode
         Random rnd1 = new Random();
         int r = rnd1.nextInt(256);
         Random rnd2 = new Random();
         int g = rnd2.nextInt(256);
         Random rnd3 = new Random();
         int b = rnd3.nextInt(256);

         int r_a1,r_a2,r_a3,g_a1,g_a2,g_a3,b_a1,b_a2,b_a3;

         //createChoicesColorcode
         int limit = 20;
         while (true) {

             Random rnd5 = new Random();
              r_a1 = rnd5.nextInt(256);
             Random rnd6 = new Random();
              r_a2 = rnd6.nextInt(256);
             Random rnd7 = new Random();
              r_a3 = rnd7.nextInt(256);

             int abs_r1_2 = Math.abs(r_a1 - r_a2);
             int abs_r2_3 = Math.abs(r_a2 - r_a3);
             int abs_r3_1 = Math.abs(r_a3 - r_a1);

             if ((abs_r1_2 >= limit) && (abs_r2_3 >= limit) && (abs_r3_1 >= limit)) {
                 break;
             }
         }

         while (true) {

             Random rnd8 = new Random();
              g_a1 = rnd8.nextInt(256);
             Random rnd9 = new Random();
              g_a2 = rnd9.nextInt(256);
             Random rnd10 = new Random();
              g_a3 = rnd10.nextInt(256);

             int abs_g1_2 = Math.abs(g_a1 - g_a2);
             int abs_g2_3 = Math.abs(g_a2 - g_a3);
             int abs_g3_1 = Math.abs(g_a3 - g_a1);

             if ((abs_g1_2 >= limit) && (abs_g2_3 >= limit) && (abs_g3_1 >= limit)) {
                 break;
             }

         }

         while (true) {

             Random rnd11 = new Random();
              b_a1 = rnd11.nextInt(256);
             Random rnd12 = new Random();
              b_a2 = rnd12.nextInt(256);
             Random rnd13 = new Random();
              b_a3 = rnd13.nextInt(256);

             int abs_b1_2 = Math.abs(b_a1 - b_a2);
             int abs_b2_3 = Math.abs(b_a2 - b_a3);
             int abs_b3_1 = Math.abs(b_a3 - b_a1);

             if ((abs_b1_2 >= limit) && (abs_b2_3 >= limit) && (abs_b3_1 >= limit)) {
                 break;
             }
         }
         // setanswer
         Random rnd4 = new Random();
         check_answer = rnd4.nextInt(3) + 1;
         String r16 = Integer.toHexString(r);
         String g16 = Integer.toHexString(g);
         String b16 = Integer.toHexString(b);

         String r_a1_16 = Integer.toHexString(r_a1);
         String g_a1_16 = Integer.toHexString(g_a1);
         String b_a1_16 = Integer.toHexString(b_a1);

         String r_a2_16 = Integer.toHexString(r_a2);
         String g_a2_16 = Integer.toHexString(g_a2);
         String b_a2_16 = Integer.toHexString(b_a2);

         String r_a3_16 = Integer.toHexString(r_a3);
         String g_a3_16 = Integer.toHexString(g_a3);
         String b_a3_16 = Integer.toHexString(b_a3);

         switch (check_answer) {
             case 1:
                 answer1.setText("#" + r16 + g16 + b16);
                 answer2.setText("#"+r_a1_16+g_a1_16+b_a1_16);
                 answer3.setText("#"+r_a2_16+g_a2_16+b_a2_16);
                 answer4.setText("#"+r_a3_16+g_a3_16+b_a3_16);
                 break;
             case 2:
                 answer1.setText("#"+r_a1_16+g_a1_16 + b_a1_16);
                 answer2.setText("#" + r16 + g16 + b16);
                 answer3.setText("#"+r_a2_16+g_a2_16+b_a2_16);
                 answer4.setText("#"+r_a3_16+g_a3_16+b_a3_16);
                 break;
             case 3:
                 answer1.setText("#"+r_a1_16+g_a1_16 + b_a1_16);
                 answer2.setText("#"+r_a2_16+g_a2_16+b_a2_16);
                 answer3.setText("#" + r16 + g16 + b16);
                 answer4.setText("#"+r_a3_16+g_a3_16+b_a3_16);
                 break;
             case 4:
                 answer1.setText("#"+r_a1_16+g_a1_16 + b_a1_16);
                 answer2.setText("#"+r_a2_16+g_a2_16+b_a2_16);
                 answer3.setText("#"+r_a3_16+g_a3_16+b_a3_16);
                 answer4.setText("#" + r16 + g16 + b16);
                 break;
         }
                           question.setBackgroundColor(Color.rgb(r, g, b));
     }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_colorto_code, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
