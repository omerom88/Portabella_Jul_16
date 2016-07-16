package com.example.omerrom.facebooklogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

import num.app.fblogin.R;

/**
 * Created by omerrom on 13/07/16.
 */
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //////////////// the gesture  /////////////////
        final GestureDetector gdt = new GestureDetector(new com.example.omerrom.facebooklogin.GestureListener());

        /////////////// string buttons  ///////////////
        ImageButton E_LOW_but = (ImageButton) findViewById(R.id.E_LOW);
        assert E_LOW_but != null;
        E_LOW_but.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                arg1.setSource(1);
                gdt.onTouchEvent(arg1);
                return true;
            }
        });

        ImageButton A_but = (ImageButton) findViewById(R.id.A);
        assert A_but != null;
        A_but.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                arg1.setSource(2);
                gdt.onTouchEvent(arg1);
                return true;
            }
        });

        ImageButton D_but = (ImageButton) findViewById(R.id.D);
        assert D_but != null;
        D_but.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                arg1.setSource(3);
                gdt.onTouchEvent(arg1);
                return true;
            }
        });

        ImageButton G_but = (ImageButton) findViewById(R.id.G);
        assert G_but != null;
        G_but.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                arg1.setSource(4);
                gdt.onTouchEvent(arg1);
                return true;
            }
        });

        ImageButton B_but = (ImageButton) findViewById(R.id.B);
        assert B_but != null;
        B_but.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                arg1.setSource(5);
                gdt.onTouchEvent(arg1);
                return true;
            }
        });

        ImageButton E_HIGH = (ImageButton) findViewById(R.id.E_HIGH);
        assert E_HIGH != null;
        E_HIGH.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                arg1.setSource(6);
                gdt.onTouchEvent(arg1);
                return true;
            }
        });
    }
}
