
/**
 * Library에대한 클래스
 *
 * @author (2018315059 이와사키 메구미)
 * @version (2019.11.26)
 */
public class Library
{
    private String name;
    private String title;
    private String author;
    private int catalogNumber;
    private String book;
    public Library(){
        this.name = name;
    }
    public void registerOneBorrower(String name){
        b = new Borrower();
        this.add(b);
    }
    public void registerOneBook(String title,String author, int catalogNumber){
        a = new Book();
        this.add(a);
    }
    public void displayBooksForLoan(String book){
        this.book = book;
    }
    public void displayBooksOnLoan(String book){
        this.book = book;
    }
    public void loanOneBook(String name, int catalogNumber){
        this.name = name;
        this.catalogNumber = catalogNumber;
    }
    public void returnOneBook(int catalogNumber){
        this.catalogNumber = catalogNumber;
    } 
}
