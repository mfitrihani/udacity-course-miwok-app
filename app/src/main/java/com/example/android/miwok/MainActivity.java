/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        //attach click listener to the number view
        TextView numberView = findViewById(R.id.numbers);
        numberView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent numberViewIntent = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numberViewIntent);
            }
        });

        //attach click listener to the color view
        TextView colorsView = findViewById(R.id.colors);
        colorsView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent colorViewIntent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colorViewIntent);
            }
        });

        //attach click listener to the family view
        TextView FamilyView = findViewById(R.id.family);
        FamilyView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent colorViewIntent = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(colorViewIntent);
            }
        });

        //attach on click Listener to the phrase view
        TextView phraseView = findViewById(R.id.phrases);
        phraseView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phraseViewIntent = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(phraseViewIntent);
            }
        });
    }

}

