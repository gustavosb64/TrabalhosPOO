public class Classe2 extends ClasseCalculo{
    private int chec_classe;

    public Classe2(ClasseCalculo cCalculo){
        super(cCalculo);    
        this.chec_classe = 3;
    } 

    protected boolean isMultipleOfThis(int num){

        System.out.println("Passou por Classe2");

        if (num%chec_classe == 0){
            return true;
        }

        return false;
    }

    public void calcula(int num){
        super.calcula(num);
        if (this.isMultipleOfThis(num)){
            System.out.println("Processado por Classe2");
        }
        return;
    }

}
