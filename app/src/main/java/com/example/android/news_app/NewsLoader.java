package com.example.android.news_app;

import android.content.Context;
import android.support.annotation.Nullable;
import android.content.AsyncTaskLoader;

import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<News>> {

    /** Query URL */
    private static String REQUEST_URL =
            "http://content.guardianapis.com/search?show-tags=contributor&api-key=test";


    public NewsLoader(Context context) {
        super(context);
    }
    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if (REQUEST_URL == null) {
            return null;
        }

//        Perform the network request, parse the response, and extract a list of news.
        List<News> newsList = QueryUtils.fetchNewsData(REQUEST_URL);
        return newsList;
    }
}
