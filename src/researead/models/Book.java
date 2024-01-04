package researead.models;

public class Book {
    private String title;
    private String author;
    private String status;
    private int currentPage;
    private int totalPage;
    private byte[] coverBook;

    public Book(String title, String author, String status, int currentPage, int totalPage, byte[] coverBook) {
        this.title = title;
        this.author = author;
        this.status = status;
        this.currentPage = currentPage;
        this.totalPage = totalPage;
        this.coverBook = coverBook;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getCurrentPage() {
        return currentPage;
    }
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
    public int getTotalPage() {
        return totalPage;
    }
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
    public byte[] getCoverBook() {
        return coverBook;
    }
    public void setCoverBook(byte[] coverBook) {
        this.coverBook = coverBook;
    }
}