public class Main{

    public static void main(String[] args){
        ClasseCalculo classe3 = new Classe3(null);
        ClasseCalculo classe2 = new Classe2(classe3);
        ClasseCalculo classe1 = new Classe1(classe2);

        for (int i=1; i<=10; i++){
            System.out.println("----------"+i+"----------");
            classe1.calcula(i);
        }
    }

}
