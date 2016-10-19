package com.example.android.newsapp;

/**
 * {@link News} represents a detail of the news.
 * It contains several relevant information's of the news.
 */

public class News {

    /**
     * Reference the Web Tile of the news.
     */
    private String mWebTitle;

    /**
     * The author of an article in the news.
     */
    private String mAuthor;

    /**
     * Website URL of the news
     */
    private String mUrl;

    /**
     * Create a new News object.
     *
     * @param WebTitle is the Web Title of the news.
     * @param Author   is author of an article in the news.
     * @param Url      is the url of a specific news.
     */
    public News(String WebTitle, String Author, String Url) {
        mWebTitle = WebTitle;
        mAuthor = Author;
        mUrl = Url;
    }

    /**
     * Get the Web Title of the news.
     */
    public String getWebTitle() {
        return mWebTitle;
    }

    /**
     * Get the author of an article in the news.
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Returns the website url of a specific news to get more information.
     */
    public String getUrl() {
        return mUrl;
    }

}
