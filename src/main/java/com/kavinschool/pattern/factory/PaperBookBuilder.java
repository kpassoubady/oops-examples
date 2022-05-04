package com.kavinschool.pattern.factory;

import java.util.Date;

public final class PaperBookBuilder {
    private String title;
    private String author;
    private int pageCount;
    private boolean hardCover;
    private double price;
    private Date printedDate;

    private PaperBookBuilder() {
    }

    public static PaperBookBuilder aPaperBook() {
        return new PaperBookBuilder();
    }

    public PaperBookBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public PaperBookBuilder withAuthor(String author) {
        this.author = author;
        return this;
    }

    public PaperBookBuilder withPageCount(int pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    public PaperBookBuilder withHardCover(boolean hardCover) {
        this.hardCover = hardCover;
        return this;
    }

    public PaperBookBuilder withPrice(double price) {
        this.price = price;
        return this;
    }

    public PaperBookBuilder withPrintedDate(Date printedDate) {
        this.printedDate = printedDate;
        return this;
    }

    public PaperBook build() {
        PaperBook paperBook = new PaperBook();
        paperBook.setTitle(title);
        paperBook.setAuthor(author);
        paperBook.setPageCount(pageCount);
        paperBook.setHardCover(hardCover);
        paperBook.setPrice(price);
        paperBook.setPrintedDate(printedDate);
        return paperBook;
    }
}
