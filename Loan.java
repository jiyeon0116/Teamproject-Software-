import javax.swing.*;
import java.util.*;
/**
 *  Loan 객체에 관한 클래스 
 * 
 * @author (2018315022 이지연,2017315056 이토아야카,2018315010 박채린, 2018315059 이와사키 메구미) 
 * @version (2019.11.29)
 */
public class Loan
{
    Calendar oCalendar = Calendar.getInstance();
    private int Loan_Date;
    private int Return_Date;
    private int Year = oCalendar.get(Calendar.YEAR);
    private int Month = oCalendar.get(Calendar.MONTH +1);
    private int Day = oCalendar.get(Calendar.DAY_OF_MONTH);
    
    public void Loan_Date()
    {
        if(Attach()=true)
        {
            System.out.println("년: " + Year);
            System.out.println("월: " + Month);
            System.out.println("일: " + Day);
        }
    }
    public void Return_Date()
    {
        if(Attach()=true)
        {
            System.out.println("년: " + Year);
            System.out.println("월: " + Month);
            System.out.println("일: " + (Day+14));
        }
        
    }
}
