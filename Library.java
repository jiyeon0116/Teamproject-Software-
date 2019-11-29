import java.util.*;
/**
 * Library에 대한 클래스
 *
 * @author (2018315022 이지연,2017315056 이토아야카,2018315010 박채린, 2018315059 이와사키 메구미)
 * @version (2019.11.29)
 */
public class Library
{
    private String name;
    private TreeSet<Book> registeredBook;
    private HashSet<Borrower> registeredBorrower;
    private LinkedList<Loan> loan;
     public Library(){
        this.name = name;
    }
    public void registerOneBorrower(String name){
        if(CheckBorrower(name)){
            Borrower borrower = new Borrower(name);
            boolean result = registeredBorrower.add(borrower);
            if(result == true){
                System.out.println("등록되었습니다.");
            }
            else{
                System.out.println("이미 등록되어 있습니다.");
            }
        }
    }
    public void registerOneBook(String title,String author, int catalogNumber){
        if(CheckBook(catalogNumber)){
            Book book = new Book(catalogNumber,title,author);
            boolean result = registeredBook.add(book);
            if(result == true){
                System.out.println("등록되었습니다.");
            }
            else{
                System.out.println("실패했습니다.");
            }
        }
    }
    public void displayBooksForLoan(String book){
    }
    public void displayBooksOnLoan(String book){
    }
    public void loanOneBook(String name, int catalogNumber){
        if(FindOneBorrower(name)){
            if(FindOneBook(catalogNumber)){
                Loan l = new Loan();
                System.out.println("대츨처리가 완료되었습니다.");
            }
            else{
                System.out.println("대츨처리가 안됩니다.");
            }
        }
        else{
                System.out.println("대츨처리가 안됩니다.");
        }
    }
    public void returnOneBook(int catalogNumber){
        if(CheckBorrower(name)){
        }
    } 
}
