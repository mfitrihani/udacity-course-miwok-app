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

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set content view
        setContentView(R.layout.activity_list);

        //create list of word class
        ArrayList<word> words = new ArrayList<>();

        words.add(new word("one","lutti",R.drawable.number_one,R.raw.number_one));
        words.add(new word("two","ottiko",R.drawable.number_two,R.raw.number_two));
        words.add(new word("three","tolookosu",R.drawable.number_three,R.raw.number_three));
        words.add(new word("four","oyyisa",R.drawable.number_four,R.raw.number_four));
        words.add(new word("five","massokka",R.drawable.number_five,R.raw.number_five));
        words.add(new word("six","temmokka",R.drawable.number_six,R.raw.number_six));
        words.add(new word("seven","kawinta",R.drawable.number_seven,R.raw.number_seven));
        words.add(new word("eight","wo'e",R.drawable.number_eight,R.raw.number_eight));
        words.add(new word("nine","na'aacha",R.drawable.number_nine,R.raw.number_nine));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        wordAdapter adapter = new wordAdapter(this, R.layout.list_item, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_listl layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

    }
}
