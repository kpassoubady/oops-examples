package com.kavinschool.pattern.factory;

public class EBook extends Book {
    private int size;
    private String soldBy;

    public EBook(String title, String author, int pageCount, boolean hardCover, double price) {
        super(title, author, pageCount, hardCover, price);
    }

    public EBook(String title, String author, int pageCount, boolean hardCover, double price, int size, String soldBy) {
        super(title, author, pageCount, hardCover, price);
        this.size = size;
        this.soldBy = soldBy;
    }

    public EBook() {
        super();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSoldBy() {
        return soldBy;
    }

    public void setSoldBy(String soldBy) {
        this.soldBy = soldBy;
    }

    @Override
    public String toString() {
        return "EBook{" +
                "size=" + size +
                ", soldBy='" + soldBy + '\'' +
                "} \n" + super.toString();
    }
}
