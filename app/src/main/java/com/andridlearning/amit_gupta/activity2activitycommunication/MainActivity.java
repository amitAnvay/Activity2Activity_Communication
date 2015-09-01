package com.andridlearning.amit_gupta.activity2activitycommunication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.andridlearning.amit_gupta.activity2activitycommunication.model.Book;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  sendMessage(View view){
        Intent i = new Intent(this,Activity2.class);
        Bundle b = new Bundle();
        b.putString("KEY1", "One");
        b.putString("KEY2", "Two");
        i.putExtra("KEY3", "Three");
        i.putExtra("MyBundle", b);
        i.putExtra("KEY4", 99);
        startActivity(i);
    }

    public void sendParcelable(View view){
        Intent i = new Intent(this,Activity3.class);
        i.putExtra("BookDetail",new Book("Android Essentials", "Mike", 10));

        startActivity(i);
    }

    public void sendAppInstanceData(View view){
        Intent i = new Intent(this, Activity4.class);
        MyApplication application = (MyApplication)getApplication();
        application.book = new Book("IOS Learning", "Jack", 15);
        startActivity(i);
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
