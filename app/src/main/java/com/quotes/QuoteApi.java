package com.quotes;

public class QuoteApi {
    String quoteAuthor;
    String quoteText;

    @Override
    public String toString() {
        return "" +
                "quoteAuthor='" + quoteAuthor + '\'' +
                ", quoteText='" + quoteText + '\'';
    }
}
