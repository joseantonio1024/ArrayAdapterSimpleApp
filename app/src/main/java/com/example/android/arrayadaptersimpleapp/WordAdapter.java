package com.example.android.arrayadaptersimpleapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Word} objects.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * Create a new {@link WordAdapter} object.
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of {@link Word}s to be displayed.
     */
    public WordAdapter(@NonNull Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {Word} object located at this position in the list
        Word currentWord = getItem(position);
        // Lookup view for data population
        TextView textView1 = listItemView.findViewById(R.id.texto_1);
        TextView textView2 = listItemView.findViewById(R.id.texto_2);
        // Populate the data into the template view using the data object
        textView1.setText(currentWord.getPalabraCastellano());
        textView2.setText(currentWord.getPalabraIngles());
        // Return the completed view to render on screen
        return listItemView;

    }// End getView method.

}// End class WordAdapter.
