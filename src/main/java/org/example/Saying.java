package org.example;

public class Saying {
    private int index;
    private String content;
    private String author;

    public Saying(int index, String content, String author) {
        this.index = index;
        this.content = content;
        this.author = author;
    }

    public int getIndex() { return index; }
    public String getContent() { return content; }
    public String getAuthor() { return author; }
}
