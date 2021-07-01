public class Main{

    public static void main(String args[]){

        StringObservable str = new StringObservable("Texto");

        UpperObserver obsUpper = new UpperObserver();
        YearObserver obsYear = new YearObserver();
        LenObserver obsLen = new LenObserver();

        str.addObserver(obsLen);
        str.addObserver(obsYear);
        str.addObserver(obsUpper);

        str.notifyObservers(str);
        System.out.println(str.getString());

        str.setString("tExtOnovo");
        str.notifyObservers(str);
        System.out.println(str.getString());

    }

}
