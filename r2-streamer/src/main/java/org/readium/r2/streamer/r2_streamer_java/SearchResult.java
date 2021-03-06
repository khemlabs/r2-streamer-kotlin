package org.readium.r2.streamer.r2_streamer_java;

public class SearchResult {

    private int searchIndex;
    private String href;
    private String title;
    private String searchQuery;
    private String matchQuery;
    private String sentence;
    private String textBefore;
    private String textAfter;
    private int occurrenceInChapter;

    public SearchResult() {
    }

    public SearchResult(int searchIndex, String href, String title, String searchQuery,
                        String matchQuery, String sentence, String textBefore, String textAfter,
                        int occurrenceInChapter) {
        this.searchIndex = searchIndex;
        this.href = href;
        this.title = title;
        this.searchQuery = searchQuery;
        this.matchQuery = matchQuery;
        this.sentence = sentence;
        this.textBefore = textBefore;
        this.textAfter = textAfter;
        this.occurrenceInChapter = occurrenceInChapter;
    }

    public int getSearchIndex() {
        return searchIndex;
    }

    public void setSearchIndex(int searchIndex) {
        this.searchIndex = searchIndex;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
    }

    public String getMatchQuery() {
        return matchQuery;
    }

    public void setMatchQuery(String matchQuery) {
        this.matchQuery = matchQuery;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getTextBefore() {
        return textBefore;
    }

    public void setTextBefore(String textBefore) {
        this.textBefore = textBefore;
    }

    public String getTextAfter() {
        return textAfter;
    }

    public void setTextAfter(String textAfter) {
        this.textAfter = textAfter;
    }

    public int getOccurrenceInChapter() {
        return occurrenceInChapter;
    }

    public void setOccurrenceInChapter(int occurrenceInChapter) {
        this.occurrenceInChapter = occurrenceInChapter;
    }
}