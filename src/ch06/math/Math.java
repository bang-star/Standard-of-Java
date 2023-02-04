package ch06.math;

public class Math {
    long add(long operand1, long operand2) { return  operand1 + operand2; }
    long substract(long operand1, long operand2) { return  operand1 - operand2; }
    long multiply(long operand1, long operand2) { return  operand1 * operand2; }
    double divide(double operand1, double operand2) {
        if(operand2 == 0){
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return  operand1 / operand2;
    }
}
