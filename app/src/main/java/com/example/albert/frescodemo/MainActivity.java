package com.example.albert.frescodemo;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends Activity {

    private ListView mListView;
    private MyAdapter mMyAdapter;
    private ArrayList<Uri> mArray;
    private Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView)findViewById(R.id.listView);
        initArray();
        mMyAdapter = new MyAdapter(getBaseContext(),mArray);
        mListView.setAdapter(mMyAdapter);

    }

    private void initArray(){
        mArray = new ArrayList<>();
         uri = Uri.parse(getString(R.string.liudehua0));
        mArray.add(uri);
        uri = Uri.parse(getString(R.string.liudehua1));
        mArray.add(uri);

        uri = Uri.parse(getString(R.string.liudehua2));
        mArray.add(uri);

        uri = Uri.parse(getString(R.string.liudehua3));
        mArray.add(uri);

        uri = Uri.parse(getString(R.string.liudehua4));
        mArray.add(uri);


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
