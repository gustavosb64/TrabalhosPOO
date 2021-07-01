public abstract class ClasseCalculo{
    private ClasseCalculo successor;

    public ClasseCalculo(ClasseCalculo successor){
        this.successor = successor;
    }

    //Checa se o número é divisível pela própria classe
    protected abstract boolean isMultipleOfThis(int num);

    public void calcula(int num){

        if (this.isMultipleOfThis(num) == true){
            System.out.println(num+"^2 = "+Math.pow(num,2));
            System.out.println("sqrt("+num+") = "+(Math.sqrt(num)));
        }
        else if(this.successor != null){
            this.successor.calcula(num);
        }
    }




}
