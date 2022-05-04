package com.kavinschool.pattern.factory;

public class BookFactory {
    private static BookFactory bookFactoryInstance;

    private BookFactory() {
    }

    public static BookFactory getInstance() {
        if (bookFactoryInstance == null) {
            bookFactoryInstance = new BookFactory();
        }
        return bookFactoryInstance;
    }

    public Book getBook(BookEnum bookEnum) {
        switch (bookEnum) {
            case PAPER_BOOK: {
                return new PaperBook();
            }
            case E_BOOK: {
                return new EBook();
            }
            default: {
                return null;
            }
        }
    }
}