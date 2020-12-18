package com.kodilla.good.patterns.challenges.order;

public class Cd {
    private final String author;
    private final String title;
    private final int yearOfPublication;
    private final String signature;

    public Cd(final String author, final String title, final int yearOfPublication, final String signature) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "Cd{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", signature='" + signature + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }
}