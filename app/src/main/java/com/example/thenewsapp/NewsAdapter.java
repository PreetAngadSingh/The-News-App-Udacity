package com.example.thenewsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Context context, ArrayList<News> news){
        super(context,0,news);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item,parent,false);
        }

        News currentNews = getItem(position);
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        String title = currentNews.getTitle();
        titleTextView.setText(title);

        TextView categoryTextView = (TextView) listItemView.findViewById(R.id.category_text_view);
        String category = currentNews.getCategory();
        categoryTextView.setText(category);

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_text_view);
        String date = currentNews.getDate();
        dateTextView.setText(date);

        TextView authorTextView=(TextView) listItemView.findViewById(R.id.author_TextView);
        String authorName = currentNews.getAuthor();
        //if the authorName is unknown
        if(authorName.equals("")){
            authorName = getContext().getString(R.string.unknownAuthor);
        }
        authorTextView.setText(authorName);
        return listItemView;
    }
}
