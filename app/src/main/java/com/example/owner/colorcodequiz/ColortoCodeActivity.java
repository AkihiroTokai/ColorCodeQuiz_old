package com.example.owner.colorcodequiz;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.ActionBarActivity;
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
    private TextView red;
    private TextView green;
    private TextView blue;

    private ImageView question;
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

    private boolean nextquestion;
    private RelativeLayout backGround;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colorto_code);
        check_answer =1 ;
        gameCount = 1;
        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.select4);

        progress =(TextView)findViewById(R.id.progress);
        red = (TextView) findViewById(R.id.red);
        green = (TextView) findViewById(R.id.green);
        blue = (TextView) findViewById(R.id.blue);

        check_select1 = (ImageView)findViewById(R.id.check_select1);
        check_select2 = (ImageView)findViewById(R.id.check_select2);
        check_select3 = (ImageView)findViewById(R.id.check_select3);
        check_select4 = (ImageView)findViewById(R.id.check_select4);

        backGround = (RelativeLayout)findViewById(R.id.RelativeLayout);

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
            //if (gameCount <= 10) {
                progress.setText("Progress:" + gameCount + "/10");
            //}
            nextquestion = true;
            }else {
                setanswer();
                nextquestion = false;
                check_select1.setImageDrawable(null);
            }
        }

    public void select2(View view) {
        if (nextquestion == false) {
            if (check_answer == 2) {
                check_select2.setImageResource(R.drawable.maru);
            } else {
                check_select2.setImageResource(R.drawable.batu);
            }
            gameCount = gameCount + 1;
            //if (gameCount <= 10) {
                progress.setText("Progress:" + gameCount + "/10");
            //}
            nextquestion = true;
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
            //if (gameCount <= 10) {
                progress.setText("Progress:" + gameCount + "/10");
            //}
            nextquestion = true;
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
            //if (gameCount <= 10) {
                progress.setText("Progress:" + gameCount + "/10");
            //}
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
         int g = rnd1.nextInt(256);
         Random rnd3 = new Random();
         int b = rnd3.nextInt(256);

         //setQuestionImage
         Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);

         Canvas canvas;
         canvas = new Canvas(bitmap);
         canvas.drawColor(Color.WHITE);

         Paint paint;
         paint = new Paint();
         question.setBackgroundColor(Color.rgb(r, g, b));
         paint.setStyle(Paint.Style.FILL);
         paint.setAntiAlias(true);

         canvas.drawCircle(100, 100, 10, paint);

         question.setImageBitmap(bitmap);


         //createChoicesColorcode
         int limit = 20;
         while (true) {

             Random rnd5 = new Random();
             int r_a1 = rnd5.nextInt(256);
             Random rnd6 = new Random();
             int r_a2 = rnd6.nextInt(256);
             Random rnd7 = new Random();
             int r_a3 = rnd7.nextInt(256);

             int abs_r1_2 = Math.abs(r_a1 - r_a2);
             int abs_r2_3 = Math.abs(r_a2 - r_a3);
             int abs_r3_1 = Math.abs(r_a3 - r_a1);

             if ((abs_r1_2 >= limit) && (abs_r2_3 >= limit) && (abs_r3_1 >= limit)) {
                 break;
             }
         }

         while (true) {

             Random rnd8 = new Random();
             int r_g1 = rnd8.nextInt(256);
             Random rnd9 = new Random();
             int r_g2 = rnd9.nextInt(256);
             Random rnd10 = new Random();
             int r_g3 = rnd10.nextInt(256);

             int abs_g1_2 = Math.abs(r_g1 - r_g2);
             int abs_g2_3 = Math.abs(r_g2 - r_g3);
             int abs_g3_1 = Math.abs(r_g3 - r_g1);

             if ((abs_g1_2 >= limit) && (abs_g2_3 >= limit) && (abs_g3_1 >= limit)) {
                 break;
             }

         }

         while (true) {

             Random rnd11 = new Random();
             int r_b1 = rnd11.nextInt(256);
             Random rnd12 = new Random();
             int r_b2 = rnd12.nextInt(256);
             Random rnd13 = new Random();
             int r_b3 = rnd13.nextInt(256);

             int abs_b1_2 = Math.abs(r_b1 - r_b2);
             int abs_b2_3 = Math.abs(r_b2 - r_b3);
             int abs_b3_1 = Math.abs(r_b3 - r_b1);

             if ((abs_b1_2 >= limit) && (abs_b2_3 >= limit) && (abs_b3_1 >= limit)) {
                 break;
             }
         }
         // setRightanswer
         Random rnd4 = new Random();
         check_answer = rnd4.nextInt(3) + 1;
         String r16 = Integer.toHexString(r);
         String g16 = Integer.toHexString(g);
         String b16 = Integer.toHexString(b);
         switch (check_answer) {
             case 1:
                 answer1.setText("#" + "r16" + "g16" + "b16");

                 break;
             case 2:
                 answer2.setText("#" + "r16" + "g16" + "b16");

                 break;
             case 3:
                 answer3.setText("#" + "r16" + "g16" + "b16");

                 break;
             case 4:
                 answer4.setText("#" + "r16" + "g16" + "b16");

                 break;
         }

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
