package com.example.letterforkids;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Predicate;

public class MainActivity<check_sky> extends AppCompatActivity {
    Button sky, grass, root;
    String sky_arr[] = {"b","d","f","h","l","t"};
    String grass_arr[] = {"a","c","i","e","m","n","o","r","s","u","v","w","x"};
    String root_arr[] = {"g","j","p","q","y","z"};
    TextView txtvw , out;
    Random r;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sky = findViewById(R.id.Sky);
        grass = findViewById(R.id.Grass);
        root = findViewById(R.id.Root);
        txtvw = findViewById(R.id.letter);
        out = findViewById(R.id.output);
        r = new Random();
        String letter;
        int no = r.nextInt(123);
        if (no >= 97 && no <= 122) {
            letter = String.valueOf(Character.toString((char) no));
            txtvw.setText(letter);
        } else {
            txtvw.setText("l");
        }
    }
    public void check_sky(View view) {
         String letter = txtvw.getText().toString();
        for (int i = 0; i < sky_arr.length; i++) {
            if (sky_arr[i].equals(letter)) {
                out.setText("Right Answer");
                break;
            } else {
                out.setText("Wrong Answer");
            }
        }
    }

    public void check_grass(View view)
    {
        String letter = txtvw.getText().toString();
        out.setText("Right Answer");
        for(int i=0; i<grass_arr.length; i++)
        {
            if(grass_arr[i].equals(letter))
            {
                out.setText("Right Answer");
                break;
            }
            else
            {
                out.setText("Wrong Answer");
            }
        }
    }
    public void check_root(View view)
    {
        String letter = txtvw.getText().toString();
        for(int i=0; i<root_arr.length; i++)
        {
            if(root_arr[i].equals(letter))
            {
                out.setText("Right Answer");
                break;
            }
            else
            {
                out.setText("Wrong Answer");
            }
        }
    }
}