package com.xworkz.collection;


    public class Book {
        private int bookId;
        private String bookName;

        public void setBookId(int bookId) {
            this.bookId = bookId;
        }

        public int getBookId() {
            return bookId;
        }

        public void setBookName(String bookName) {
            this.bookName = bookName;
        }

        public String getBookName() {
            return bookName;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "bookId=" + bookId +
                    ", bookName='" + bookName + '\'' +
                    '}';
        }
    }

