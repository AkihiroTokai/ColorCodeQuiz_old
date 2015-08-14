package com.example.owner.colorcodequiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class CodetoColorActivity extends AppCompatActivity {
    private TextView progress;
    private TextView questioncode;

    private ImageView check_select1;
    private ImageView check_select2;
    private ImageView check_select3;
    private ImageView check_select4;

    private Button answer1;
    private Button answer2;
    private Button answer3;
    private Button answer4;

    private int gameCount;
    private int check_answer;
    private int NoQ;

    private boolean nextquestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codeto_color);

        gameCount = 1;
        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        progress =(TextView)findViewById(R.id.progress);
        questioncode = (TextView) findViewById(R.id.red);

        check_select1 = (ImageView)findViewById(R.id.check_select1);
        check_select2 = (ImageView)findViewById(R.id.check_select2);
        check_select3 = (ImageView)findViewById(R.id.check_select3);
        check_select4 = (ImageView)findViewById(R.id.check_select4);

        Intent intent = getIntent();
        NoQ  = intent.getIntExtra("getnumber",0);
        nextquestion = false ;
        setanswer();
    }

    public void select1(View view) {
        if (nextquestion == false)   {
            if (check_answer == 1) {
                check_select1.setImageResource(R.drawable.maru);
            } else {
                check_select1.setImageResource(R.drawable.batu);
            }
            gameCount = gameCount + 1;
            if (gameCount < NoQ) {
                progress.setText("Progress:" + gameCount + "/"+ NoQ);
                nextquestion = true;
            }
            if (gameCount == NoQ){
                new AlertDialog.Builder(CodetoColorActivity.this)
                        .setTitle("title")
                        .setMessage("message")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // OK button pressed
                                Intent intent = new Intent(CodetoColorActivity.this, MenuActivity.class);
                                startActivity(intent);
                            }
                        }).show();

            }
        }else {
                setanswer();
                nextquestion = false;
                check_select1.setImageDrawable(null);
        }
    }


    public void select2(View view) {
        if (nextquestion == false) {
            if (check_answer == 2) {
                check_select1.setImageDrawable(null);
                check_select2.setImageResource(R.drawable.maru);
                check_select3.setImageDrawable(null);
                check_select4.setImageDrawable(null);
            } else {
                check_select2.setImageResource(R.drawable.batu);
            }
            gameCount = gameCount + 1;
            if (gameCount < NoQ) {
                progress.setText("Progress:" + gameCount + "/"+NoQ);
                nextquestion = true;
            }
            if (gameCount == NoQ){
                new AlertDialog.Builder(CodetoColorActivity.this)
                        .setTitle("title")
                        .setMessage("message")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // OK button pressed
                                Intent intent = new Intent(CodetoColorActivity.this, MenuActivity.class);
                                startActivity(intent);
                            }
                        }).show();

            }
        }else {
            setanswer();
            nextquestion = false;
            check_select2.setImageDrawable(null);
        }
    }

    public void select3(View view) {
        if (nextquestion == false){
            if (check_answer == 3) {
                check_select3.setImageResource(R.drawable.maru);
            } else {
                check_select3.setImageResource(R.drawable.batu);
            }
            gameCount = gameCount + 1;
            if (gameCount < NoQ) {
                progress.setText("Progress:" + gameCount + "/"+NoQ);
            }
            nextquestion = true;
            if (gameCount ==  NoQ){
                new AlertDialog.Builder(CodetoColorActivity.this)
                        .setTitle("title")
                        .setMessage("message")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // OK button pressed
                                Intent intent = new Intent(CodetoColorActivity.this, MenuActivity.class);
                                startActivity(intent);
                            }
                        }).show();

            }
        }else {
            setanswer();
            nextquestion = false;
            check_select3.setImageDrawable(null);
        }
    }

    public void select4(View view) {
        if (nextquestion == false)   {
            if (check_answer == 4) {
                check_select4.setImageResource(R.drawable.maru);
            } else {
                check_select4.setImageResource(R.drawable.batu);
            }
            gameCount = gameCount + 1;
            if (gameCount < NoQ) {
                progress.setText("Progress:" + gameCount + "/"+ NoQ);
                nextquestion = true;
            }
             if (gameCount == NoQ){
                 new AlertDialog.Builder(CodetoColorActivity.this)
                         .setTitle("title")
                         .setMessage("message")
                         .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {
                                 // OK button pressed
                                 Intent intent = new Intent(CodetoColorActivity.this, MenuActivity.class);
                                 startActivity(intent);
                             }
                         }).show();

             }
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
        int g = rnd1.nextInt(256);
        Random rnd3 = new Random();
        int b = rnd3.nextInt(256);

        int r_a1,r_a2,r_a3,g_a1,g_a2,g_a3,b_a1,b_a2,b_a3;

        //setQuestionCode
        Random rnd4 = new Random();
        check_answer = rnd4.nextInt(3) + 1;
        String r16 = Integer.toHexString(r);
        String g16 = Integer.toHexString(g);
        String b16 = Integer.toHexString(b);

        questioncode.setText("#" + r16 + g16 + b16);


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
        switch (check_answer) {
            case 1:
                answer1.setBackgroundColor(Color.rgb(r, g, b));
                answer2.setBackgroundColor(Color.rgb(r_a1, g_a1, b_a1));
                answer3.setBackgroundColor(Color.rgb(r_a2, g_a2, b_a2));
                answer4.setBackgroundColor(Color.rgb(r_a3, g_a3, b_a3));
                break;
            case 2:
                answer1.setBackgroundColor(Color.rgb(r_a1, g_a1, b_a1));
                answer2.setBackgroundColor(Color.rgb(r, g, b));
                answer3.setBackgroundColor(Color.rgb(r_a2, g_a2, b_a2));
                answer4.setBackgroundColor(Color.rgb(r_a3, g_a3, b_a3));
                break;
            case 3:
                answer1.setBackgroundColor(Color.rgb(r_a1, g_a1, b_a1));
                answer2.setBackgroundColor(Color.rgb(r_a2, g_a2, b_a2));
                answer3.setBackgroundColor(Color.rgb(r, g, b));
                answer4.setBackgroundColor(Color.rgb(r_a3, g_a3, b_a3));
                break;
            case 4:
                answer1.setBackgroundColor(Color.rgb(r_a1, g_a1, b_a1));
                answer2.setBackgroundColor(Color.rgb(r_a2, g_a2, b_a2));
                answer3.setBackgroundColor(Color.rgb(r_a3, g_a3, b_a3));
                answer4.setBackgroundColor(Color.rgb(r, g, b));
                break;
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_codeto_color, menu);
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
