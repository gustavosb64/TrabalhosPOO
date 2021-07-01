public class Classe1 extends ClasseCalculo{
    private int chec_classe;

    public Classe1(ClasseCalculo cCalculo){
        super(cCalculo);    
        this.chec_classe = 2;
    } 

    protected boolean isMultipleOfThis(int num){

        System.out.println("Passou por Classe1");

        if (num%chec_classe == 0){
            return true;
        }

        return false;
    }

    public void calcula(int num){
        super.calcula(num);
        if (this.isMultipleOfThis(num)){
            System.out.println("Processado por Classe1");
        }
        return;
    }

}
