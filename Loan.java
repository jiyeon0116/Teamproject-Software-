
import javax.swing.*;
import java.util.*;
/**
 *  Loan 객체에 관한 클래스 
 * 
 * @author (2018315022 이지연,2017315056 이토아야카,2018315010 박채린, 2018315059 이와사키 메구미) 
 * @version (2019.12.03)
 */
public class Loan
{
    Calendar oCalendar = Calendar.getInstance();
    private int Loan_Date;
    private int Return_Date;
    private int Year = oCalendar.get(Calendar.YEAR);
    private int Month = oCalendar.get(Calendar.MONTH +1);
    private int Day = oCalendar.get(Calendar.DAY_OF_MONTH);
    public boolean AttachBorrower(){}
    public boolean DetachBorrower(){}
    public boolean AttachBook(){}
    public boolean DetachBook(){}
    public void CheckDate()
    {
        Loan_Date = (Year + "년" + Month + "월" + Day + "일");
        return Loan_Date;
        Return_Date = (Year + "년" + Month + "월" + (Day+14) + "일");
        return Return_Date;
    }
    public String toString()
    {   
    }
}
