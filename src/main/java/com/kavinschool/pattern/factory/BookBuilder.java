package com.kavinschool.pattern.factory;

public final class BookBuilder {
    private String title;
    private String author;
    private int pageCount;
    private boolean hardCover;
    private double price;

    private BookBuilder() {
    }

    public static BookBuilder aBook() {
        return new BookBuilder();
    }

    public BookBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder withAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder withPageCount(int pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    public BookBuilder withHardCover(boolean hardCover) {
        this.hardCover = hardCover;
        return this;
    }

    public BookBuilder withPrice(double price) {
        this.price = price;
        return this;
    }

    public Book build() {
        return new Book(title, author, pageCount, hardCover, price);
    }
}
