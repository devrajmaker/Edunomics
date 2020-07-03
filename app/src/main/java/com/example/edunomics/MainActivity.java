package com.example.edunomics;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
       int oldVaue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeEditTextValueRandomlyOnButtonCLick();
        changeTextOnce();
    }


    private void changeEditTextValueRandomlyOnButtonCLick() {
        final TextView changingText = (TextView) findViewById(R.id.searchk);

        Button changeTextButton = (Button) findViewById(R.id.career);
        Button changeTextButton1 = (Button) findViewById(R.id.skill);

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] manyDifferentStrings = {"How to get a Career ?"};
                int random = (int) (Math.random() * manyDifferentStrings.length);
                if (random == oldVaue) {
                    random = (int) (Math.random() * manyDifferentStrings.length);
                }
                changingText.setText(manyDifferentStrings[random]);
                oldVaue = random;

            }

            });
        changeTextButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] manyDifferentStrings = {"How to Learn a Skill ?"};
                int random = (int) (Math.random() * manyDifferentStrings.length);
                if (random == oldVaue) {
                    random = (int) (Math.random() * manyDifferentStrings.length);
                }
                changingText.setText(manyDifferentStrings[random]);
                oldVaue = random;

            }

        });

    }
    public void changeTextOnce(){
        final TextView changingText = (TextView) findViewById(R.id.searchk);
        Button changeTextButton = (Button) findViewById(R.id.career);
        Button changeTextButton1 = (Button) findViewById(R.id.skill);

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                changingText.setText("How to get a Career ?");
            }
        });
        changeTextButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                changingText.setText("How to Learn a Skill ?");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu,menu);
        return true ;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case R.id.impact:
                Intent i = new Intent(MainActivity.this,impact1.class);
                startActivity(i);

                Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
                return false;

            case R.id.opporunites:
                Intent in = new Intent(MainActivity.this,oppo1.class);
                startActivity(in);

                Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
                return false;

            case R.id.initiatives:
                Intent ino = new Intent(MainActivity.this,initia.class);
                startActivity(ino);

                Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
                return false;

            case R.id.blog:
                Intent inon = new Intent(MainActivity.this,blod1.class);
                startActivity(inon);

                Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
                return false;

        }
        return super.onOptionsItemSelected(item);
    }

    public void onsearch(View view)
    {
        Toast.makeText(this, "edunomics.in Requested Blog is not present", Toast.LENGTH_SHORT).show();
    }

    public void alpha(View view)
    {
        Intent alp = new Intent(MainActivity.this,login.class);
        startActivity(alp);
    }
}