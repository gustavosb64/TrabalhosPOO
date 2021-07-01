import java.time.LocalDate;
import java.util.Observable;
import java.util.Observer;

public class YearObserver implements Observer{

    public void update(Observable obj, Object arg){
        LocalDate dt = LocalDate.now();
        int year = dt.getYear();
        StringObservable sObj = (StringObservable)obj;
        String newString = sObj.getString().concat(Integer.toString(year));
        sObj.setString(newString);
    }

}
