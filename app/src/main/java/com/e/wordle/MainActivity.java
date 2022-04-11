package com.e.wordle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button Play, View, Exit, About;
    int randomNumber;
    Generator gen;
    Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gen = new Generator(getApplicationContext());


        // Controlling Share Button
        ImageButton Share = (ImageButton) findViewById(R.id.share);

        Share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "Please share it with your friends and family.";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Install Wordle now and brainstorm!!!");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share via"));
            }
        });

        Play = (Button) findViewById(R.id.btn4);
        View = (Button) findViewById(R.id.btn1);
        Exit = (Button) findViewById(R.id.btn3);
        About = (Button) findViewById(R.id.btn2);

        // Controlling Play Button.
        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent intent = new Intent(MainActivity.this, PlayActivity.class);
                r=new Random();
                int same=0;
                for(int i=gen.words.length-1;i>0;i--)
                {
                    if(gen.words[i].equals(gen.words[i-1]))
                    {
                        same++;
                    }
                }

                int x =gen.words.length - same;
                randomNumber=r.nextInt(x);
                for(int i=randomNumber;i<gen.words.length-1;i++)
                {
                    gen.words[i] = gen.words[i + 1];
                }
                intent.putExtra("word",gen.words[randomNumber]);
                startActivity(intent);
            }
        });

        // Controlling View Button.
        View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                showViewDialog();
            }
        });

        // Controlling About Button.
        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        // Controlling Exit Button.
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Toast.makeText(getApplicationContext(),"Thank You for Playing",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, PortFolio.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void showViewDialog(){
        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.dialog_viewbox);
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.dialog_win);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(true);

        TextView Correct = dialog.findViewById(R.id.crcttxt);
        TextView InCorrect = dialog.findViewById(R.id.incrcttxt);
        TextView Wins = dialog.findViewById(R.id.winstxt);

        DataBaseHelper myDB = new DataBaseHelper(this);

        TextView Level = dialog.findViewById(R.id.txtlvl);

        int truth = myDB.checkName("TRUTH").getCount();
        int falsed = myDB.checkName("FALSER").getCount();
        int win;
        if(truth+falsed!=0)
            win = (truth*100)/(truth+falsed);
        else
            win = (truth*100);
        int arr[] = new int[6];
        arr[0] = myDB.checkName("ONE_TRY").getCount();
        arr[1] = myDB.checkName("TWO_TRY").getCount();
        arr[2] = myDB.checkName("THREE_TRY").getCount();
        arr[3] = myDB.checkName("FOUR_TRY").getCount();
        arr[4] = myDB.checkName("FIVE_TRY").getCount();
        arr[5] = myDB.checkName("SIX_TRY").getCount();

        int levl = (int)Math.sqrt(truth);
        Level.setText("Level: "+levl);

        Correct.setText(truth+"");
        InCorrect.setText(falsed +"");
        Wins.setText(win+"%");

        int maxi = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>maxi)
                maxi = arr[i];
        }

        if(maxi==0)
            maxi= 1;

        ProgressBar progressBar1 = dialog.findViewById(R.id.prgrsbr1);
        progressBar1.setProgress(arr[0]*100/maxi);

        ProgressBar progressBar2 = dialog.findViewById(R.id.prgrsbr2);
        progressBar2.setProgress(arr[1]*100/maxi);

        ProgressBar progressBar3 = dialog.findViewById(R.id.prgrsbr3);
        progressBar3.setProgress(arr[2]*100/maxi);

        ProgressBar progressBar4 = dialog.findViewById(R.id.prgrsbr4);
        progressBar4.setProgress(arr[3]*100/maxi);

        ProgressBar progressBar5 = dialog.findViewById(R.id.prgrsbr5);
        progressBar5.setProgress(arr[4]*100/maxi);

        ProgressBar progressBar6 = dialog.findViewById(R.id.prgrsbr6);
        progressBar6.setProgress(arr[5]*100/maxi);

        Button Next = (Button) dialog.findViewById(R.id.next_btn);
        dialog.show();

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
    }
}