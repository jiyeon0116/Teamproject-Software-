import java.util.HashSet;
/**
 * 여기에 Borrower 클래스 설명을 작성하십시오.
 * 
 * @author (2018315022 이지연,2017315056 이토아야카,2018315010 박채린, 2018315059 이와사키 메구미) 
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
        new Loan(); //새로운 대출 생성
    }

    public void DetachBook(){
    }

    public String CheckOneBorrower(String name){
        return name;
    }
}
