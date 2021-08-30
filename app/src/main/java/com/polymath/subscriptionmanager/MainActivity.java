package com.polymath.subscriptionmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
<<<<<<< HEAD
    protected void onCreate(Bundle savedInstanceState)
    {
=======
    protected void onCreate(Bundle savedInstanceState) {
>>>>>>> dfc86672c3f1165e61ff6d79b4976c8985bf6216
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EditorActivity.class);
                startActivity(intent);
            }
        });
<<<<<<< HEAD


=======
>>>>>>> dfc86672c3f1165e61ff6d79b4976c8985bf6216
    }
}