import java.util.HashSet;
/**
 *  Borrower 객체에 관한 클래스 
 * 
 * @author (2018315022 이지연,2017315056 이토아야카,2018315010 박채린, 2018315059 이와사키 메구미) 
 * @version (2019.11.29)
 */
public class Borrower
{
    private String name;
    public HashSet<Borrower> borrower;
    public Borrower(String name){
        HashSet<Borrower> borrower = new HashSet<Borrower>();
    }

    public void AttachBook(){
        new loan();
    }

    public void DetachBook(){
    }

    public String CheckOneBorrower(String name){
        return name;
    }
    
    public String toString(){   
    }
}
