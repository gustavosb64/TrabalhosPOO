import java.util.Observable;
import java.util.Observer;

public class LenObserver implements Observer{

    public void update(Observable obj, Object arg){
        StringObservable sObj = (StringObservable)obj;
        int len = sObj.getString().length(); 

        String lenString = Integer.toString(len);
        int newLen = len + lenString.length();

        String newString = sObj.getString().concat(Integer.toString(newLen));

        sObj.setString(newString);
    }

}
