package InterfaceFutebol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {


    public static void main(String[] args){
        ArrayList listaTimes = new ArrayList<TimeFutebol>();

        listaTimes.add(new TimeFutebol("Time1", 2, 4, 3, 9, 24, 6, 3));
        listaTimes.add(new TimeFutebol("Time2", 4, 3, 3, 4, 19, 5, 2));
        listaTimes.add(new TimeFutebol("Time3", 5, 4, 3, 7, 14, 9, 5));
        listaTimes.add(new TimeFutebol("Time4", 9, 1, 0, 39, 9, 12, 9));
        listaTimes.add(new TimeFutebol("Time5", 7, 1, 2, 25, 7, 6, 5));
        listaTimes.add(new TimeFutebol("Time6", 5, 1, 8, 6, 28, 6, 3));
        listaTimes.add(new TimeFutebol("Time7", 6, 4, 1, 21, 9, 7, 2));
        listaTimes.add(new TimeFutebol("Time8", 6, 3, 1, 18, 15, 4, 0));
        listaTimes.add(new TimeFutebol("Time9", 0, 8, 2, 4, 35, 2, 1));
        listaTimes.add(new TimeFutebol("Time10", 2, 0, 8, 6, 22, 2, 2));

        Collections.sort(listaTimes);
        TimeFutebol time;
        for (int i=0; i < listaTimes.size(); i++){
            time = (TimeFutebol)listaTimes.get(i);
            System.out.println(time.getNomeTime());
        }

    } 
}
