package com.example.letterforkids;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    String[] sky_arr = {"b","d","f","h","l","t"};
    String[] grass_arr = {"a","c","i","e","m","n","o","r","s","u","v","w","x"};
    String[] root_arr = {"g","j","p","q","y","z"};
    TextView txtvw , out;
    Random r;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtvw = findViewById(R.id.letter);
        out = findViewById(R.id.output);
        r = new Random();
        String letter;
        int no = r.nextInt(26) + 'a';
        letter = Character.toString((char) no);
        txtvw.setText(letter);
    }
    @SuppressLint("SetTextI18n")
    public void check_sky(View view) {
        String letter = txtvw.getText().toString();
        for (String s : sky_arr) {
            if (s.equals(letter)) {
                out.setText("Right Answer");
                break;
            } else {
                out.setText("Wrong Answer");
            }
        }
    }

    @SuppressLint("SetTextI18n")
    public void check_grass(View view)
    {
        String letter = txtvw.getText().toString();
        out.setText("Right Answer");
        for (String s : grass_arr) {
            if (s.equals(letter)) {
                out.setText("Right Answer");
                break;
            } else {
                out.setText("Wrong Answer");
            }
        }
    }
    @SuppressLint("SetTextI18n")
    public void check_root(View view)
    {
        String letter = txtvw.getText().toString();
        for (String s : root_arr) {
            if (s.equals(letter)) {
                out.setText("Right Answer");
                break;
            } else {
                out.setText("Wrong Answer");
            }
        }
    }
}