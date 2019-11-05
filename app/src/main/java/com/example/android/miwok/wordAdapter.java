package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class wordAdapter extends ArrayAdapter {
    /**
     * Constructor
     *
     * @param context            The current context.
     * @param resource           The resource ID for a layout file containing a layout to use when
     *                           instantiating views.
     * @param objects            The objects to represent in the ListView.
     */
    public wordAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //get current object located from list
        word currentWord = (word) getItem(position);

        //find the TextViews in list_item.xml
        TextView englishWord = listItemView.findViewById(R.id.top_text);
        TextView miwokWord = listItemView.findViewById(R.id.below_text);

        //set the text to current object value
        englishWord.setText(currentWord.getEnglishTranslation());
        miwokWord.setText(currentWord.getMiwokTranslation());

        //return listItemView now containing modified value
        return  listItemView;
    }
}
