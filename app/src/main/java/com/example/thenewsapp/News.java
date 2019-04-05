package com.example.thenewsapp;

public class News {
    private String mTitle;
    private String mCategory;
    private String mDate;
    private String mUrl;
    private String mAuthor;

    public News(String title,String category,String date,String url,String author){
        mTitle=title;
        mCategory=category;
        mDate=date;
        mUrl=url;
        mAuthor=author;
    }
    public String getTitle(){return mTitle;}
    public String getCategory(){return mCategory;}
    public String getDate(){return mDate;}
    public String getUrl(){return mUrl;}
    public String getAuthor(){return mAuthor;}
}
