import java.util.Observable;
import java.util.Observer;

public class UpperObserver implements Observer{

    public void update(Observable obj, Object arg){
        StringObservable sObj = (StringObservable)obj;
        sObj.setString(sObj.getString().toUpperCase());
    }

}
