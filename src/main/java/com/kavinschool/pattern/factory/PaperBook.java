package com.kavinschool.pattern.factory;

import java.util.Date;

public class PaperBook extends Book {
    private Date printedDate;

    public PaperBook(String title, String author, int pageCount, boolean hardCover, double price) {
        super(title, author, pageCount, hardCover, price);
    }

    public PaperBook(String title, String author, int pageCount, boolean hardCover, double price, Date printedDate) {
        super(title, author, pageCount, hardCover, price);
        this.printedDate = printedDate;
    }

    public PaperBook() {
    }

    public Date getPrintedDate() {
        return printedDate;
    }

    public void setPrintedDate(Date printedDate) {
        this.printedDate = printedDate;
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "printedDate=" + printedDate +
                "} \n" + super.toString();
    }
}
