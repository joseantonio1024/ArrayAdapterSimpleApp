package com.example.android.arrayadaptersimpleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create a list of words.
        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("hola","hello"));
        words.add(new Word("adios","goodbye"));
        words.add(new Word("hola","hello"));
        words.add(new Word("adios","goodbye"));
        words.add(new Word("hola","hello"));
        words.add(new Word("adios","goodbye"));
        words.add(new Word("hola","hello"));
        words.add(new Word("adios","goodbye"));
        words.add(new Word("hola","hello"));
        words.add(new Word("adios","goodbye"));
        words.add(new Word("hola","hello"));
        words.add(new Word("adios","goodbye"));
        words.add(new Word("hola","hello"));
        words.add(new Word("adios","goodbye"));
        words.add(new Word("hola","hello"));
        words.add(new Word("adios","goodbye"));
        words.add(new Word("hola","hello"));
        words.add(new Word("adios","goodbye"));
        words.add(new Word("hola","hello"));
        words.add(new Word("adios","goodbye"));
        words.add(new Word("hola","hello"));
        words.add(new Word("adios","goodbye"));
        words.add(new Word("hola","hello"));
        words.add(new Word("adios","goodbye"));


        WordAdapter adapter = new WordAdapter(this,words);
        ListView list = (ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
