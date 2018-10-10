package com.example.android.news_app;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(@NonNull Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }

//        get current position of the news article
        News currentNews = getItem(position);

//        set text of the current item on the title
        TextView titleTextView = listItemView.findViewById(R.id.list_item_title);
        String titleString = currentNews.getmTitle();
        titleTextView.setText(titleString);

//        set text of the current item on the category
        TextView categoryTextView = listItemView.findViewById(R.id.list_item_category);
        String categoryString = currentNews.getmCategory();
        categoryTextView.setText(categoryString);

//        set text of the current item on the date
        TextView dateTextView = listItemView.findViewById(R.id.list_item_date);
        String dateString = currentNews.getmDate();
        dateTextView.setText(dateString);

//        set text of the current item on the author
        TextView authorTextView = listItemView.findViewById(R.id.list_item_author);
        String authorString = currentNews.getmAuthor();
        authorTextView.setText(authorString);

        return listItemView;
    }

}
