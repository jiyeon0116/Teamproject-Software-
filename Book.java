import java.util.*;
/**
 *  Book 객체에 관한 클래스 
 * 
 * @author (2018315022 이지연,2017315056 이토아야카,2018315010 박채린, 2018315059 이와사키 메구미)
 * @version (2019.11.29)
 */
public class Book
{
    private int catalogNumber;
    private String author;
    private String title;
    
    public Book(int catalogNumber,String author,String title){
       this.catalogNumber = catalogNumber;
       this.author = author;
       this.title = title;
     }
    
    public void AttachBook(){
        new Loan();
     }
    
    public void DettachBook(){
        
    }
    
    public void CheckOneBook(){
        return catalogNumber;
    }
    
    public String toString(Book book){
        return "[catalogNumber: " + catalogNumber+ ", author: " 
                 +author+ ", title: " +title+ "]";
    }
}
