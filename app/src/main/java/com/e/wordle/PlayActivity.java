package com.e.wordle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class PlayActivity extends AppCompatActivity {

    ImageButton Back, Help;
    EditText Et11, Et12, Et13, Et14, Et15;
    EditText Et21, Et22, Et23, Et24, Et25;
    EditText Et31, Et32, Et33, Et34, Et35;
    EditText Et41, Et42, Et43, Et44, Et45;
    EditText Et51, Et52, Et53, Et54, Et55;
    EditText Et61, Et62, Et63, Et64, Et65;
    String name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        // Back Button Working.
        Back = findViewById(R.id.quit_icon);
        Help = findViewById(R.id.help);

        Help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlayActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        // EditText Linking.
        Et11 = (EditText) findViewById(R.id.word1_1);
        Et12 = (EditText) findViewById(R.id.word1_2);
        Et13 = (EditText) findViewById(R.id.word1_3);
        Et14 = (EditText) findViewById(R.id.word1_4);
        Et15 = (EditText) findViewById(R.id.word1_5);

        Et21 = (EditText) findViewById(R.id.word2_1);
        Et22 = (EditText) findViewById(R.id.word2_2);
        Et23 = (EditText) findViewById(R.id.word2_3);
        Et24 = (EditText) findViewById(R.id.word2_4);
        Et25 = (EditText) findViewById(R.id.word2_5);

        Et31 = (EditText) findViewById(R.id.word3_1);
        Et32 = (EditText) findViewById(R.id.word3_2);
        Et33 = (EditText) findViewById(R.id.word3_3);
        Et34 = (EditText) findViewById(R.id.word3_4);
        Et35 = (EditText) findViewById(R.id.word3_5);

        Et41 = (EditText) findViewById(R.id.word4_1);
        Et42 = (EditText) findViewById(R.id.word4_2);
        Et43 = (EditText) findViewById(R.id.word4_3);
        Et44 = (EditText) findViewById(R.id.word4_4);
        Et45 = (EditText) findViewById(R.id.word4_5);

        Et51 = (EditText) findViewById(R.id.word5_1);
        Et52 = (EditText) findViewById(R.id.word5_2);
        Et53 = (EditText) findViewById(R.id.word5_3);
        Et54 = (EditText) findViewById(R.id.word5_4);
        Et55 = (EditText) findViewById(R.id.word5_5);

        Et61 = (EditText) findViewById(R.id.word6_1);
        Et62 = (EditText) findViewById(R.id.word6_2);
        Et63 = (EditText) findViewById(R.id.word6_3);
        Et64 = (EditText) findViewById(R.id.word6_4);
        Et65 = (EditText) findViewById(R.id.word6_5);


        Intent iin= getIntent();
        Bundle b = iin.getExtras();

        Context context = this;

        if(b!=null)
        {
            name = (String) b.get("word");
            System.out.println("Sp: "+name);
        }

        if(name.equals(""))
        {
            finish();
            Toast.makeText(this,"Some Error Occured",Toast.LENGTH_SHORT).show();
        }

        // 1-1
        Et11.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et11.getText().length();
                if (textlength1 >= 1) {
                    Et12.requestFocusFromTouch();
                    Et12.setFocusableInTouchMode(true);
                }
            }
        });

        // 1-2
        Et12.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et12.getText().length();
                if (textlength1 >= 1) {
                    Et13.requestFocusFromTouch();
                    Et13.setFocusableInTouchMode(true);

                }
            }
        });

        // 1-3
        Et13.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et13.getText().length();
                if (textlength1 >= 1) {
                    Et14.requestFocusFromTouch();
                    Et14.setFocusableInTouchMode(true);
                }
            }
        });

        // 1-4
        Et14.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et14.getText().length();
                if (textlength1 >= 1) {
                    Et15.requestFocusFromTouch();
                    Et15.setFocusableInTouchMode(true);
                }
            }
        });

        // 1-5
        Et15.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                checker(context, Et11, Et12, Et13, Et14, Et15, 1);
                Et21.requestFocusFromTouch();
                Et21.setFocusableInTouchMode(true);

                Et11.setFocusableInTouchMode(false);
                Et12.setFocusableInTouchMode(false);
                Et13.setFocusableInTouchMode(false);
                Et14.setFocusableInTouchMode(false);
                Et15.setFocusableInTouchMode(false);
            }
        });


        // 2-1
        Et21.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et21.getText().length();
                if (textlength1 >= 1) {
                    Et22.requestFocusFromTouch();
                    Et22.setFocusableInTouchMode(true);
                }
            }
        });

        // 2-2
        Et22.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et22.getText().length();
                if (textlength1 >= 1) {
                    Et23.requestFocusFromTouch();
                    Et23.setFocusableInTouchMode(true);
                }
            }
        });

        // 2-3
        Et23.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et23.getText().length();
                if (textlength1 >= 1) {
                    Et24.requestFocusFromTouch();
                    Et24.setFocusableInTouchMode(true);
                }
            }
        });

        // 2-4
        Et24.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et24.getText().length();
                if (textlength1 >= 1) {
                    Et25.requestFocusFromTouch();
                    Et25.setFocusableInTouchMode(true);
                }
            }
        });

        // 2-5
        Et25.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                checker(context, Et21, Et22, Et23, Et24, Et25, 2);
                Et31.requestFocusFromTouch();
                Et31.setFocusableInTouchMode(true);

                Et21.setFocusableInTouchMode(false);
                Et22.setFocusableInTouchMode(false);
                Et23.setFocusableInTouchMode(false);
                Et24.setFocusableInTouchMode(false);
                Et25.setFocusableInTouchMode(false);
            }
        });


        // 3-1
        Et31.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et31.getText().length();
                if (textlength1 >= 1) {
                    Et32.requestFocusFromTouch();
                    Et32.setFocusableInTouchMode(false);

                }
            }
        });

        // 3-2
        Et32.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et32.getText().length();
                if (textlength1 >= 1) {
                    Et33.requestFocusFromTouch();

                    Et33.setFocusableInTouchMode(false);
                }
            }
        });

        // 3-3
        Et33.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et33.getText().length();
                if (textlength1 >= 1) {
                    Et34.requestFocusFromTouch();
                    Et34.setFocusableInTouchMode(false);
                }
            }
        });

        // 3-4
        Et34.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et34.getText().length();
                if (textlength1 >= 1) {
                    Et35.requestFocusFromTouch();
                    Et35.setFocusableInTouchMode(false);
                }
            }
        });

        // 3-5
        Et35.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                checker(context, Et31, Et32, Et33, Et34, Et35, 3);
                Et41.requestFocusFromTouch();
                Et41.setFocusableInTouchMode(true);

                Et31.setFocusableInTouchMode(false);
                Et32.setFocusableInTouchMode(false);
                Et33.setFocusableInTouchMode(false);
                Et34.setFocusableInTouchMode(false);
                Et35.setFocusableInTouchMode(false);
            }
        });


        // 4-1
        Et41.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et41.getText().length();
                if (textlength1 >= 1) {
                    Et42.requestFocusFromTouch();
                    Et42.setFocusableInTouchMode(false);
                }
            }
        });

        // 4-2
        Et42.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et42.getText().length();
                if (textlength1 >= 1) {
                    Et43.requestFocusFromTouch();
                    Et43.setFocusableInTouchMode(false);
                }
            }
        });

        // 4-3
        Et43.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et43.getText().length();
                if (textlength1 >= 1) {
                    Et44.requestFocusFromTouch();
                    Et44.setFocusableInTouchMode(false);
                }
            }
        });

        // 4-4
        Et44.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et44.getText().length();
                if (textlength1 >= 1) {
                    Et45.requestFocusFromTouch();
                    Et45.setFocusableInTouchMode(false);
                }
            }
        });

        // 4-5
        Et45.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                checker(context, Et41, Et42, Et43, Et44, Et45, 4);
                Et51.requestFocusFromTouch();
                Et51.setFocusableInTouchMode(true);

                Et41.setFocusableInTouchMode(false);
                Et42.setFocusableInTouchMode(false);
                Et43.setFocusableInTouchMode(false);
                Et44.setFocusableInTouchMode(false);
                Et45.setFocusableInTouchMode(false);
            }
        });


        // 5-1
        Et51.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et51.getText().length();
                if (textlength1 >= 1) {
                    Et52.requestFocusFromTouch();
                    Et52.setFocusableInTouchMode(false);
                }
            }
        });

        // 5-2
        Et52.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et52.getText().length();
                if (textlength1 >= 1) {
                    Et53.requestFocusFromTouch();
                    Et53.setFocusableInTouchMode(false);
                }
            }
        });

        // 5-3
        Et53.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et53.getText().length();
                if (textlength1 >= 1) {
                    Et54.requestFocusFromTouch();
                    Et54.setFocusableInTouchMode(false);
                }
            }
        });

        // 5-4
        Et54.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et54.getText().length();
                if (textlength1 >= 1) {
                    Et55.requestFocusFromTouch();
                    Et55.setFocusableInTouchMode(false);
                }
            }
        });

        // 5-5
        Et55.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                checker(context, Et51, Et52, Et53, Et54, Et55, 5);
                Et61.requestFocusFromTouch();
                Et61.setFocusableInTouchMode(true);

                Et51.setFocusableInTouchMode(false);
                Et52.setFocusableInTouchMode(false);
                Et53.setFocusableInTouchMode(false);
                Et54.setFocusableInTouchMode(false);
                Et55.setFocusableInTouchMode(false);
            }
        });


        // 6-1
        Et61.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et61.getText().length();
                if (textlength1 >= 1) {
                    Et62.requestFocusFromTouch();
                    Et62.setFocusableInTouchMode(false);
                }
            }
        });

        // 6-2
        Et62.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et62.getText().length();
                if (textlength1 >= 1) {
                    Et63.requestFocusFromTouch();
                    Et63.setFocusableInTouchMode(false);
                }
            }
        });

        // 6-3
        Et63.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et63.getText().length();
                if (textlength1 >= 1) {
                    Et64.requestFocusFromTouch();
                    Et64.setFocusableInTouchMode(false);
                }
            }
        });

        // 6-4
        Et64.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Integer textlength1 = Et64.getText().length();
                if (textlength1 >= 1) {
                    Et65.requestFocusFromTouch();
                    Et65.setFocusableInTouchMode(false);
                }
            }
        });

        // 6-5
        Et65.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                checker(context, Et61, Et62, Et63, Et64, Et65, 6);
            }
        });
    }

    public void checker(Context context, EditText et1,EditText et2,EditText et3, EditText et4, EditText et5, int t)
    {
        String text1= et1.getText().toString().toLowerCase();
        String text2= et2.getText().toString().toLowerCase();
        String text3= et3.getText().toString().toLowerCase();
        String text4= et4.getText().toString().toLowerCase();
        String text5= et5.getText().toString().toLowerCase();

        String text = text1+text2+text3+text4+text5;
        text = text.toLowerCase();
        System.out.println("Sp: "+name);

        if(text.equalsIgnoreCase(name))
        {
            // Display infinite dialog.
            et1.setBackground(ContextCompat.getDrawable(context, R.drawable.edttxt_curve_bg_grn));
            et2.setBackground(ContextCompat.getDrawable(context, R.drawable.edttxt_curve_bg_grn));
            et3.setBackground(ContextCompat.getDrawable(context, R.drawable.edttxt_curve_bg_grn));
            et4.setBackground(ContextCompat.getDrawable(context, R.drawable.edttxt_curve_bg_grn));
            et5.setBackground(ContextCompat.getDrawable(context, R.drawable.edttxt_curve_bg_grn));
            showWinDialog(t);
        }
        else
        {
            // Text1
            if(text1.charAt(0)==name.charAt(0))
            {
                et1.setBackground(ContextCompat.getDrawable(context, R.drawable.edttxt_curve_bg_grn));
            }
            else if(text1.charAt(0)==name.charAt(1)||text1.charAt(0)==(name.charAt(2))||
                    text1.charAt(0)==(name.charAt(3))||text1.charAt(0)==(name.charAt(4)))
            {
                et1.setBackground(ContextCompat.getDrawable(context, R.drawable.edttxt_curve_bg_ylw));
            }
            else
            {
                et1.setBackground(ContextCompat.getDrawable(context, R.drawable.edttxt_curve_bg_grey));
            }

            // Text2
            if(text2.charAt(0)==name.charAt(1))
            {
                et2.setBackground(ContextCompat.getDrawable(context, R.drawable.edttxt_curve_bg_grn));
            }
            else if(text2.charAt(0)==name.charAt(0)||text2.charAt(0)==(name.charAt(2))||
                    text2.charAt(0)==(name.charAt(3))||text2.charAt(0)==(name.charAt(4)))
            {
                et2.setBackground(ContextCompat.getDrawable(context, R.drawable.edttxt_curve_bg_ylw));
            }
            else
            {
                et2.setBackground(ContextCompat.getDrawable(context, R.drawable.edttxt_curve_bg_grey));
            }

            if(text3.charAt(0)==name.charAt(2))
            {
                et3.setBackground(ContextCompat.getDrawable(context, R.drawable.edttxt_curve_bg_grn));
            }
            else if(text3.charAt(0)==name.charAt(1)||text3.charAt(0)==(name.charAt(0))||
                    text3.charAt(0)==(name.charAt(3))||text3.charAt(0)==(name.charAt(4)))
            {
                et3.setBackground(ContextCompat.getDrawable(context, R.drawable.edttxt_curve_bg_ylw));
            }
            else
            {
                et3.setBackground(ContextCompat.getDrawable(context, R.drawable.edttxt_curve_bg_grey));
            }

            if(text4.charAt(0)==name.charAt(3))
            {
                et4.setBackground(ContextCompat.getDrawable(context, R.drawable.edttxt_curve_bg_grn));
            }
            else if(text4.charAt(0)==name.charAt(1)||text4.charAt(0)==(name.charAt(2))||
                    text4.charAt(0)==(name.charAt(0))||text4.charAt(0)==(name.charAt(4)))
            {
                et4.setBackground(ContextCompat.getDrawable(context, R.drawable.edttxt_curve_bg_ylw));
            }
            else
            {
                et4.setBackground(ContextCompat.getDrawable(context, R.drawable.edttxt_curve_bg_grey));
            }

            if(text5.charAt(0)==name.charAt(4))
            {
                et5.setBackground(ContextCompat.getDrawable(context, R.drawable.edttxt_curve_bg_grn));
            }
            else if(text5.charAt(0)==name.charAt(1)||text5.charAt(0)==(name.charAt(2))||
                    text5.charAt(0)==(name.charAt(3))||text5.charAt(0)==(name.charAt(0)))
            {
                et5.setBackground(ContextCompat.getDrawable(context, R.drawable.edttxt_curve_bg_ylw));
            }
            else
            {
                et5.setBackground(ContextCompat.getDrawable(context, R.drawable.edttxt_curve_bg_grey));
            }

            if(t==6)
            {
                DataBaseHelper myDB = new DataBaseHelper(this);
                boolean insertData = myDB.insert(7, false);

                showLoseDialog();

            }
        }
    }

    public void showLoseDialog()
    {
        Dialog dialog = new Dialog(PlayActivity.this);
        dialog.setContentView(R.layout.dialog_losebox);
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.dialog_win);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);

        TextView Show = (TextView) dialog.findViewById(R.id.word);

        Show.setText("The word was: "+name);

        Button Next = (Button) dialog.findViewById(R.id.next_btn);
        dialog.show();

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                finish();
            }
        });
    }

    public void showWinDialog(int t)
    {
        Dialog dialog = new Dialog(PlayActivity.this);
        dialog.setContentView(R.layout.dialog_winbox);
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.dialog_win);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);


        DataBaseHelper myDB = new DataBaseHelper(this);
        boolean insertData = myDB.insert(t, true);

        if(insertData)
        {
            Toast.makeText(this, "Successfully Saved", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Something Went Wrong.", Toast.LENGTH_SHORT).show();
        }

        Button Next = (Button) dialog.findViewById(R.id.next_btn);
        dialog.show();

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();

                int truth = myDB.checkName("TRUTH").getCount();
                double trup = Math.sqrt(truth);
                if(trup==(int)trup)
                {
                    showLevelDialog();
                }
                else
                {
                    finish();
                }
            }
        });
    }

    public void showLevelDialog()
    {
        Dialog dialog = new Dialog(PlayActivity.this);
        dialog.setContentView(R.layout.dialog_levelbox);
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.dialog_win);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);

        Button Next = (Button) dialog.findViewById(R.id.next_btn);
        dialog.show();

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                finish();
            }
        });
    }
}