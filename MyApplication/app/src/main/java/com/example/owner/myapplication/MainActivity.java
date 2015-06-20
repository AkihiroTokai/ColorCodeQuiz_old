package com.example.owner.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private ImageView []images=new ImageView [15];
    private int answer;
    private int answer2;
    private boolean a1;
    private boolean a2;
    private TextView status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer =(int)( Math.random   () * 15);
        answer2 =(int)( Math.random   () * 15);
        a1=false;
        a2=false;
        status=(TextView)findViewById(R.id.textView);



      while (answer==answer2){
            answer2 =(int)( Math.random   () * 15);
             }

        for(int i=0;i<15;i++ ){
            images [i]=(ImageView)findViewById(getResources().getIdentifier("image"+i,"id",getPackageName()));
            images[i].setImageResource(R.drawable.question);
        }
    }
    public void find (View view){
        int click_number = Integer.parseInt((String)view.getTag());
        if(click_number==answer){
            images[click_number] .setImageResource(R.drawable.mon);
            a1=true;
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.correct);
            mediaPlayer.start();
        }

        else if(click_number==answer2){
            images[click_number] .setImageResource(R.drawable.mon);
            a2=true;
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.correct);
            mediaPlayer.start();
        }

        else{
            images[click_number] .setImageResource(R.drawable.batu);
        }

       if(a1==true&&a2==true){
            status.setText("GAMECLEAR!");
           new Handler().postDelayed(new Runnable() {
               @Override
               public void run() {
                   Intent intent = new Intent(MainActivity.this, MainActivity.class);
                   startActivity(intent);

               }
           }, 3000);
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
