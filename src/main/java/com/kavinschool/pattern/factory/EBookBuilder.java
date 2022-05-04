package com.kavinschool.pattern.factory;

public final class EBookBuilder {
    private String title;
    private String author;
    private int pageCount;
    private boolean hardCover;
    private double price;
    private int size;
    private String soldBy;

    private EBookBuilder() {
    }

    public static EBookBuilder anEBook() {
        return new EBookBuilder();
    }

    public EBookBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public EBookBuilder withAuthor(String author) {
        this.author = author;
        return this;
    }

    public EBookBuilder withPageCount(int pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    public EBookBuilder withHardCover(boolean hardCover) {
        this.hardCover = hardCover;
        return this;
    }

    public EBookBuilder withPrice(double price) {
        this.price = price;
        return this;
    }

    public EBookBuilder withSize(int size) {
        this.size = size;
        return this;
    }

    public EBookBuilder withSoldBy(String soldBy) {
        this.soldBy = soldBy;
        return this;
    }

    public EBook build() {
        EBook eBook = new EBook();
        eBook.setTitle(title);
        eBook.setAuthor(author);
        eBook.setPageCount(pageCount);
        eBook.setHardCover(hardCover);
        eBook.setPrice(price);
        eBook.setSize(size);
        eBook.setSoldBy(soldBy);
        return eBook;
    }
}
