public class Classe3 extends ClasseCalculo{
    private int chec_classe;

    public Classe3(ClasseCalculo cCalculo){
        super(cCalculo);    
        //como todo número é divisível por 1, ao chegar em Classe3, qualquer valor é processado
        this.chec_classe = 1; 
    } 

    protected boolean isMultipleOfThis(int num){

        System.out.println("Passou por Classe3");

        if (num%chec_classe == 0){
            return true;
        }

        return false;
    }

    public void calcula(int num){
        
        System.out.println(num+"^2 = "+Math.pow(num,2));
        System.out.println("sqrt("+num+") = "+(Math.sqrt(num)));

        System.out.println("Processado por Classe3");
        return;
    }

}
