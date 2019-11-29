import java.util.*;
/**
 *  Book 객체에 관한 클래스 
 * 
 * @author (2017315056 이토아야카)
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
        
     }
    
    public void DettachBook(){
        
    }
    
    public void FindOneBook(){
    }
    
    public void DisplayBook(){
    }
    
    public String toString(Book book){
        return "Book[catalogNumber: " + catalogNumber+ ", author: " 
                 +author+ ", title: " +title+ "]";
    }
}
