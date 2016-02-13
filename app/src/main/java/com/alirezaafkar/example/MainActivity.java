package com.alirezaafkar.example;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ShareCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.alirezaafkar.toolbar.Toolbar;
import com.alirezaafkar.toolbar.example.R;

public class MainActivity extends AppCompatActivity
        implements Toolbar.OnMenuItemClickListener {
    DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        toolbar.setOnMenuItemClickListener(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendEmail();
            }
        });
    }

    private void sendEmail() {
        Intent intent = ShareCompat
                .IntentBuilder.from(MainActivity.this)
                .setSubject(getString(R.string.app_name))
                .addEmailTo("pesiran@gmail.com")
                .setType("message/rfc822")
                .createChooserIntent();

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    @SuppressLint("RtlHardcoded")
    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(Gravity.RIGHT);
                break;
            case R.id.action_settings:
                Toast.makeText(MainActivity.this,
                        item.getTitle(),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_email:
                sendEmail();
                break;
        }
        return true;
    }
}
