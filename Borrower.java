import java.util.HashSet;
/**
 * 여기에 Borrower 클래스 설명을 작성하십시오.
 * 
 * @author (2018315022 이지연) 
 * @version (버전번호나 날짜)
 */
public class Borrower
{
    private String name;
    public HashSet<Borrower> borrower;
    public Borrower(String name){
        HashSet<Borrower> b = new HashSet<Borrower>();
    }
    public void AttachBook(){
        new Loan();
    }
    public void DetachBook(){
    }
    public String CheckOneBorrower(String name){
        return name;
    }
}
