package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import java.util.List;

public class wordAdapter extends ArrayAdapter {
    int colorResource;
    /**
     * Constructor
     *
     * @param context            The current context.
     * @param resource           The resource ID for a layout file containing a layout to use when
     *                           instantiating views.
     * @param objects            The objects to represent in the ListView.
     */
    public wordAdapter(@NonNull Context context, int resource, @NonNull List objects, int colourResource) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, objects);
        //initialize color
        colorResource = colourResource;
    }

    /**
     * @param position              index of current object's position in a list
     * @param convertView           view used as template return view
     * @param parent                parent view
     * @return listItemView         return view that input into the text views
     */
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
        final word currentWord = (word) getItem(position);

        //find the TextViews in list_item.xml
        TextView miwokWord = listItemView.findViewById(R.id.top_text);
        TextView englishWord = listItemView.findViewById(R.id.below_text);

        //set the text to current object value
        assert currentWord != null;
        miwokWord.setText(currentWord.getMiwokTranslation());
        englishWord.setText(currentWord.getEnglishTranslation());

        //find the imageView in list_item
        ImageView currentImage = listItemView.findViewById(R.id.image_view_translation);

        //set the text to current object value if exist
        if (currentWord.hasImage()){
            currentImage.setImageResource(currentWord.getImageAssetId());
        }
        else {
            currentImage.setVisibility(View.GONE);
        }

        //set background color of Linear Layout color
        LinearLayout mainLinear = listItemView.findViewById(R.id.card_linear_layout);
        mainLinear.setBackgroundColor(ContextCompat.getColor(getContext(), colorResource));

        if(currentWord.hasAudio()){
            //media player
            ImageButton play = listItemView.findViewById(R.id.play_button);
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    audioPlayer audioPlayer = new audioPlayer(currentWord.getAudioAssetId(),getContext());
                    audioPlayer.play();
                }
            });
        }

        //return listItemView now containing modified value
        return  listItemView;
    }
}
