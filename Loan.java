import javax.swing.*;
import java.util.*;
/**
 * 여기에 Loan 클래스 설명을 작성하십시오.
 * 
 * @author (2018315022 이지연,2017315056 이토아야카,2018315010 박채린, 2018315059 이와사키 메구미) 
 * @version (버전번호나 날짜)
 */
public class Loan
{
    private int Loan_Date;
    private int Return_Date;
    
    public Loan()
    {
        b = new Book();
        this.add(b);
        
        if (b.AttachBook()= false) //대출
        {
            b.AttachBook();
            Calendar oCalendar = Calendar.getInstance();
            l_Month = oCalendar.get(Calendar.MONTH);
            l_Day = oCalendar.get(Calendar.DAY_OF_MONTH);
            Loan_Date = l_Month.l_Day;
            Return_Date = l_Month.l_Day+14;
        }
    }
    public void Return()
    {
        if (b.AttachBook() = true)
        {
            b.DettachBook();
            Calendar oCalendar = Calendar.getInstance();
            r_Month = oCalendar.get(Calendar.MONTH);
            r_Day = oCalendar.get(Calendar.DAY_OF_MONTH);
            ReturnBook_Date = r_Month.r_Day;
        }
    }
}
