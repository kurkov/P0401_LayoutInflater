package com.kurkov.p0401_layoutinflater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    final String LOG_TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater layoutInflater = getLayoutInflater();

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linLayout);
        View view1 = layoutInflater.inflate(R.layout.text, linearLayout, true);
        LayoutParams layoutParams1 = view1.getLayoutParams();

//        Log.d(LOG_TAG, "Class of view: " + view1.getClass().toString());
//        Log.d(LOG_TAG, "LayoutParams of view is null: " + (layoutParams1 == null));
//        Log.d(LOG_TAG, "Text of view: " + ((TextView) view1).getText());

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relLayout);
        View view2 = layoutInflater.inflate(R.layout.text, relativeLayout, true);
        LayoutParams layoutParams2 = view2.getLayoutParams();

//        Log.d(LOG_TAG, "Class of view: " + view2.getClass().toString());
//        Log.d(LOG_TAG, "LayoutParams of view is null: " + (layoutParams2 == null));
//        Log.d(LOG_TAG, "Text of view: " + ((TextView) view2).getText());
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
