public class Calculator {
    private int firstNumber;
    private int secondNumber;

    public Calculator(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber(){
        return this.firstNumber;
    }

    public int getSecondNumber(){
        return this.secondNumber;
    }

    public int Add(){
        return this.firstNumber + this.secondNumber;
    }
}
