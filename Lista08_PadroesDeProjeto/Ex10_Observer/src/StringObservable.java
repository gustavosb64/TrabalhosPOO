import java.util.Observable;

public class StringObservable extends Observable{
    private String string;

    public StringObservable(String string){
        this.string = string;
        this.setChanged();
    }

    public void setString(String string){
        this.string = string;     
        this.setChanged();
    }

    public String getString(){
        return this.string;
    }

}
