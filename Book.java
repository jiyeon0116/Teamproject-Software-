import java.util.*;
/**
 *  Book 객체에 관한 클래스 
 * 
 * @author (2017315056 이토아야카)
 * @version (2019.11.25)
 */
public class Book
{
    private TreeSet<Book> ts;
    private int catalogNumber;
    private String author;
    private String title;
    
    public Book(int catalogNumber, String author, String title){
        TreeSet<Book> ts = new TreeSet<Book>();
    }
    
    public AttachBook(){
        
    }
    
    public DettachBook(){
        
    }
    
    public void DisplayBook(){
        Iterator<Book> ts = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
