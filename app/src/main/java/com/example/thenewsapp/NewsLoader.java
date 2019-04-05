package com.example.thenewsapp;

import android.content.Context;
import android.content.AsyncTaskLoader;

import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<News>> {
    String mUrl;

    public NewsLoader(Context context,String url){
        super(context);
        mUrl=url;
    }
    @Override
    protected void onStartLoading(){
        forceLoad();
    }
    @Override
    public List<News> loadInBackground(){
        if(mUrl == null){
            return null;
        }
        List<News> newsList = QueryUtils.fetchNewsData(mUrl);
        return newsList;
    }
}
