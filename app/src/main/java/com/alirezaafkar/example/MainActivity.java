package com.alirezaafkar.example;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.alirezaafkar.toolbar.Toolbar;
import com.alirezaafkar.toolbar.example.R;


public class MainActivity extends AppCompatActivity implements Toolbar.OnMenuItemClickListener {
    DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        toolbar.setOnMenuItemClickListener(this);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @SuppressLint("RtlHardcoded")
            @Override
            public void onClick(View v) {
                mDrawerLayout.openDrawer(Gravity.RIGHT);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Toast.makeText(MainActivity.this,
                    R.string.action_settings,
                    Toast.LENGTH_SHORT).show();
        }
        return false;
    }
}
