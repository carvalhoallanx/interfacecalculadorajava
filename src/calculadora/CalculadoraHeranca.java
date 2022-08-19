package calculadora;

public class CalculadoraHeranca implements Interface2{
    private double number1;
    private double number2;
    
    public void setnumber1 (double num1){
        this.number1 = num1;
    }
    public double getnumber1(){
        return this.number1;
    }
    
    public void setnumber2 (double num2){
        this.number2 = num2;
    }
    public double getnumber2(){
        return this.number2;
    }

    @Override
    public double getsomar(){
        return ((getnumber1() + getnumber2())*100)/100;
    }
    @Override
    public double getsubtrair(){
        return ((getnumber1() - getnumber2())*100)/100;
    }
    @Override
    public double getdividir(){
        return ((getnumber1() / getnumber2())*100)/100;
    }
    @Override
    public double getmultiplicar(){
        return ((getnumber1() * getnumber2())*100)/100;
    }
}