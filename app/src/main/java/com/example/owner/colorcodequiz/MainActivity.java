package com.example.owner.colorcodequiz;

import android.graphics.Color;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private TextView progress;
    private TextView red;
    private TextView green;
    private TextView blue;
    private Button answer1;
    private Button answer2;
    private Button answer3;
    private Button answer4;
    private int gameCount;
    private int check_answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        check_answer = 1;
        gameCount = 1;
        Button answer1 = (Button) findViewById(R.id.answer1);
        Button answer2 = (Button) findViewById(R.id.answer2);
        Button answer3 = (Button) findViewById(R.id.answer3);
        Button answer4 = (Button) findViewById(R.id.answer4);

        TextView progress =(TextView)findViewById(R.id.progress);
        TextView red = (TextView) findViewById(R.id.red);
        TextView green = (TextView) findViewById(R.id.green);
        TextView blue = (TextView) findViewById(R.id.blue);

    }
    public void select1(View view) {
        if (check_answer == 1) {
            //ImageView2.setImage(R.id.true)

        } else {
            // ImageView1.setImage(R.id.false)/
        }
        gameCount = gameCount + 1;
        progress.setText("Progress:" + gameCount + "/10");
        setanswer();
    }

    public void select2(View view) {
        if (check_answer == 2) {
            //ImageView2.setImage(R.id.true)

        } else {
            // ImageView2.setImage(R.id.false)/
        }
        //gameCount = gameCount + 1;
        progress.setText("Progress:" + gameCount + "/10");
        setanswer();
    }

    public void select3(View view) {
        if (check_answer == 3) {
            //ImageView3.setImage(R.id.true)
        } else {
            // ImageView3.setImage(R.id.false)/
        }
        gameCount = gameCount + 1;
        progress.setText("Progress:" + gameCount + "/10");
        setanswer();
    }

    public void select4(View view) {
        if (check_answer == 4) {
            //ImageView4.setImage(R.id.true)

        } else {
            // ImageView4.setImage(R.id.false)
        }
        gameCount = gameCount + 1;
        progress.setText("Progress:" + gameCount + "/10");
        setanswer();
    }

    public void setanswer() {
        if (gameCount == 2) {
            red.setText("ff");
            green.setText("ff");
            blue.setText("ff");
            answer1.setBackgroundColor(Color.parseColor("#00ffff"));
            answer2.setBackgroundColor(Color.parseColor("#ffffff"));
            answer3.setBackgroundColor(Color.parseColor("#ffff00"));
            answer4.setBackgroundColor(Color.parseColor("#ff00ff"));
            check_answer = 2;
        }

        if (gameCount == 3) {
            red.setText("00");
            green.setText("ff");
            blue.setText("ff");
            answer1.setBackgroundColor(Color.parseColor("#00ffff"));
            answer2.setBackgroundColor(Color.parseColor("#ffff00"));
            answer3.setBackgroundColor(Color.parseColor("#0088ff"));
            answer4.setBackgroundColor(Color.parseColor("#ff00ff"));
            check_answer = 1;
        }

        if (gameCount == 4) {
            red.setText("ff");
            green.setText("00");
            blue.setText("ff");
            answer1.setBackgroundColor(Color.parseColor("#00ffff"));
            answer2.setBackgroundColor(Color.parseColor("#ff00ff"));
            answer3.setBackgroundColor(Color.parseColor("#ffff00"));
            answer4.setBackgroundColor(Color.parseColor("#ff88ff"));
            check_answer = 2;
        }

        if (gameCount == 5) {
            red.setText("ff");
            green.setText("ff");
            blue.setText("00");
            answer1.setBackgroundColor(Color.parseColor("#00ffff"));
            answer2.setBackgroundColor(Color.parseColor("#ffff00"));
            answer3.setBackgroundColor(Color.parseColor("#88ff00"));
            answer4.setBackgroundColor(Color.parseColor("#ff00ff"));
            check_answer = 2;
        }

        if (gameCount == 6) {
            red.setText("ff");
            green.setText("00");
            blue.setText("00");
            answer1.setBackgroundColor(Color.parseColor("#ff0000"));
            answer2.setBackgroundColor(Color.parseColor("#ffffff"));
            answer3.setBackgroundColor(Color.parseColor("#ffff00"));
            answer4.setBackgroundColor(Color.parseColor("#ff00ff"));
            check_answer = 1;
        }

        if (gameCount == 7) {
            red.setText("00");
            green.setText("ff");
            blue.setText("00");
            answer1.setBackgroundColor(Color.parseColor("#00ffff"));
            answer2.setBackgroundColor(Color.parseColor("#00ff00"));
            answer3.setBackgroundColor(Color.parseColor("#ffff00"));
            answer4.setBackgroundColor(Color.parseColor("#ff0088"));
            check_answer = 2;
        }

        if (gameCount == 8) {
            red.setText("00");
            green.setText("00");
            blue.setText("ff");
            answer1.setBackgroundColor(Color.parseColor("#008888"));
            answer2.setBackgroundColor(Color.parseColor("#000088"));
            answer3.setBackgroundColor(Color.parseColor("#88ff00"));
            answer4.setBackgroundColor(Color.parseColor("#ff00ff"));
            check_answer = 2;
        }

        if (gameCount == 9) {
            red.setText("88");
            green.setText("00");
            blue.setText("88");
            answer1.setBackgroundColor(Color.parseColor("#880088"));
            answer2.setBackgroundColor(Color.parseColor("#888888"));
            answer3.setBackgroundColor(Color.parseColor("#888800"));
            answer4.setBackgroundColor(Color.parseColor("#ff8888"));
            check_answer = 1;
        }

        if (gameCount == 10) {
            red.setText("00");
            green.setText("88");
            blue.setText("88");
            answer1.setBackgroundColor(Color.parseColor("#8800ff"));
            answer2.setBackgroundColor(Color.parseColor("#ff88ff"));
            answer3.setBackgroundColor(Color.parseColor("#88ff00"));
            answer4.setBackgroundColor(Color.parseColor("#008888"));
            check_answer = 4;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
