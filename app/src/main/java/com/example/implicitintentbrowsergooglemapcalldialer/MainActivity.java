package com.example.implicitintentbrowsergooglemapcalldialer;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



    public class MainActivity extends AppCompatActivity {

        private Button browser, gmap, call;

        @SuppressLint("MissingInflatedId")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            browser=findViewById(R.id.browser);
            gmap=findViewById(R.id.gmap);
            call=findViewById(R.id.call);

            browser.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://google.com"));
                    Intent chooseIntent=Intent.createChooser(intent, "Browser");
                    startActivity(chooseIntent);
                }
            });

            gmap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("geo:19.0760,72.8777?q=Mukesh+Patel+School+of+Technology+Management+and+Engineering,+Mumbai,+India"));
                    Intent chooserIntent=Intent.createChooser(intent,"Google Map");
                    startActivity(chooserIntent);
                }
            });

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:0123456789"));
                    Intent chooserIntent=Intent.createChooser(intent, "Call Dialer");
                    startActivity(chooserIntent);
                }
            });

        }
    }

