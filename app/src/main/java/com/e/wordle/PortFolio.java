package com.e.wordle;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import static java.lang.System.exit;

public class PortFolio extends AppCompatActivity {

    Button linkButton;
    ImageButton quit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        setupLinkButton();

        quit = (ImageButton) findViewById(R.id.quit_icon);

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit(1);
            }
        });
    }


    void setupLinkButton() {
        linkButton = (Button) findViewById(R.id.info_visit);
        linkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/sarthak1206"));
                startActivity(browserIntent);
            }
        });
    }
}
