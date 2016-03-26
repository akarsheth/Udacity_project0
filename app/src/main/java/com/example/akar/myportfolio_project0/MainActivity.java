package com.example.akar.myportfolio_project0;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btn1,btn2,btn3,btn4,btn5,btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("My App Portfolio");
        setSupportActionBar(toolbar);
        btn1= (Button) findViewById(R.id.btn1);
        btn2= (Button) findViewById(R.id.btn2);
        btn3= (Button) findViewById(R.id.btn3);
        btn4= (Button) findViewById(R.id.btn4);
        btn5= (Button) findViewById(R.id.btn5);
        btn6= (Button) findViewById(R.id.btn6);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);





    }
    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.btn1:
                Toast.makeText(this, "This button will launch my " + btn1.getText().toString() + " app!", Toast.LENGTH_SHORT).show();
                return;
            case R.id.btn2:
                Toast.makeText(this, "This button will launch my " + btn2.getText().toString() + "!", Toast.LENGTH_SHORT).show();
                return;
            case R.id.btn3:
                Toast.makeText(this, "This button will launch my " + btn3.getText().toString() + "!", Toast.LENGTH_SHORT).show();
                return;
            case R.id.btn4:
                Toast.makeText(this, "This button will launch my " + btn4.getText().toString() + " app!", Toast.LENGTH_SHORT).show();
                return;
            case R.id.btn5:
                Toast.makeText(this, "This button will launch my " + btn5.getText().toString() + " app!", Toast.LENGTH_SHORT).show();
                return;
            case R.id.btn6:
                Toast.makeText(this, "This button will launch my capstone app!", Toast.LENGTH_SHORT).show();
                return;
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
