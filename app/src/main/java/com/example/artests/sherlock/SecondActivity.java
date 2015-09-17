package com.example.artests.sherlock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    public final static String THIEF="com.example.artests.sherlock.THIEF";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
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
    public void onRadioClick(View v){
        Intent answerIntent=new Intent();
        switch (v.getId()){
            case R.id.radioButtonDog:
                answerIntent.putExtra(THIEF,getResources().getString(R.string.radioButtonDog));
                break;
            case R.id.radioButtonCrow:
                answerIntent.putExtra(THIEF,getResources().getString(R.string.radioButtonCrow));
                break;
            case R.id.radioButtonCat:
                answerIntent.putExtra(THIEF,getResources().getString(R.string.radioButtonCat));
                break;
            default:
                break;
        }
        setResult(RESULT_OK,answerIntent);
        finish();
    }
}
