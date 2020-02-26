package com.udinus.instagram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    TextView caption, caption2, caption3, caption4, caption5, caption6, caption7, caption8, caption9, caption10, caption11, caption12, caption13, caption14, caption15;
    TextView like, like3, like5, like7, like9, like11, like13, like15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caption = findViewById(R.id.caption1);
        caption.setText(Html.fromHtml("<b>" + getResources().getString(R.string.feed_username)  + "</b>" + " " + getResources().getString(R.string.feed_caption)));
        like = findViewById(R.id.like1);
        like.setText(Html.fromHtml("Disukai oleh <b>septianideva_</b> dan <b>8.800 lainnya</b>"));

        caption2 = findViewById(R.id.caption2);
        caption2.setText(Html.fromHtml("<b>" + getResources().getString(R.string.feed_username)  + "</b>" + " " + getResources().getString(R.string.feed_caption)));

        caption3 = findViewById(R.id.caption3);
        caption3.setText(Html.fromHtml("<b>" + getResources().getString(R.string.feed_username)  + "</b>" + " " + getResources().getString(R.string.feed_caption)));
        like3 = findViewById(R.id.like3);
        like3.setText(Html.fromHtml("Disukai oleh <b>septianideva_</b> dan <b>8.800 lainnya</b>"));

        caption4 = findViewById(R.id.caption4);
        caption4.setText(Html.fromHtml("<b>" + getResources().getString(R.string.feed_username)  + "</b>" + " " + getResources().getString(R.string.feed_caption)));

        caption5 = findViewById(R.id.caption5);
        caption5.setText(Html.fromHtml("<b>" + getResources().getString(R.string.feed_username)  + "</b>" + " " + getResources().getString(R.string.feed_caption)));
        like5 = findViewById(R.id.like5);
        like5.setText(Html.fromHtml("Disukai oleh <b>septianideva_</b> dan <b>8.800 lainnya</b>"));

        caption6 = findViewById(R.id.caption6);
        caption6.setText(Html.fromHtml("<b>" + getResources().getString(R.string.feed_username)  + "</b>" + " " + getResources().getString(R.string.feed_caption)));

        caption7 = findViewById(R.id.caption7);
        caption7.setText(Html.fromHtml("<b>" + getResources().getString(R.string.feed_username)  + "</b>" + " " + getResources().getString(R.string.feed_caption)));
        like7 = findViewById(R.id.like7);
        like7.setText(Html.fromHtml("Disukai oleh <b>septianideva_</b> dan <b>8.800 lainnya</b>"));

        caption8 = findViewById(R.id.caption8);
        caption8.setText(Html.fromHtml("<b>" + getResources().getString(R.string.feed_username)  + "</b>" + " " + getResources().getString(R.string.feed_caption)));

        caption9 = findViewById(R.id.caption9);
        caption9.setText(Html.fromHtml("<b>" + getResources().getString(R.string.feed_username)  + "</b>" + " " + getResources().getString(R.string.feed_caption)));
        like9 = findViewById(R.id.like9);
        like9.setText(Html.fromHtml("Disukai oleh <b>septianideva_</b> dan <b>8.800 lainnya</b>"));

        caption10 = findViewById(R.id.caption10);
        caption10.setText(Html.fromHtml("<b>" + getResources().getString(R.string.feed_username)  + "</b>" + " " + getResources().getString(R.string.feed_caption)));

        caption11 = findViewById(R.id.caption11);
        caption11.setText(Html.fromHtml("<b>" + getResources().getString(R.string.feed_username)  + "</b>" + " " + getResources().getString(R.string.feed_caption)));
        like11 = findViewById(R.id.like11);
        like11.setText(Html.fromHtml("Disukai oleh <b>septianideva_</b> dan <b>8.800 lainnya</b>"));

        caption12 = findViewById(R.id.caption12);
        caption12.setText(Html.fromHtml("<b>" + getResources().getString(R.string.feed_username)  + "</b>" + " " + getResources().getString(R.string.feed_caption)));

        caption13 = findViewById(R.id.caption13);
        caption13.setText(Html.fromHtml("<b>" + getResources().getString(R.string.feed_username)  + "</b>" + " " + getResources().getString(R.string.feed_caption)));
        like13 = findViewById(R.id.like13);
        like13.setText(Html.fromHtml("Disukai oleh <b>septianideva_</b> dan <b>8.800 lainnya</b>"));

        caption14 = findViewById(R.id.caption14);
        caption14.setText(Html.fromHtml("<b>" + getResources().getString(R.string.feed_username)  + "</b>" + " " + getResources().getString(R.string.feed_caption)));

        caption15 = findViewById(R.id.caption15);
        caption15.setText(Html.fromHtml("<b>" + getResources().getString(R.string.feed_username)  + "</b>" + " " + getResources().getString(R.string.feed_caption)));
        like15 = findViewById(R.id.like15);
        like15.setText(Html.fromHtml("Disukai oleh <b>septianideva_</b> dan <b>8.800 lainnya</b>"));

        // Find the toolbar view inside the activity layout
        Toolbar toolbar = findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(null);
//        getSupportActionBar().setHomeAsUpIndicator(R.drawable.cam);// set drawable icon
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    // Menu icons are inflated just as they were with actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

}
