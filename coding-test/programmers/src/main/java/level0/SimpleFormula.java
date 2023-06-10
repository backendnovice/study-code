package level0;

public class SimpleFormula {
    public int solution(String binomial) {
        // binomial을 공백을 기준으로 분리하여 배열로 생성.
        String[] formulaElements = binomial.split(" ");
        
        // 숫자(number1, number2), 연산자(operation)을 초기화.
        int number1 = Integer.parseInt(formulaElements[0]);
        int number2 = Integer.parseInt(formulaElements[2]);
        String operation = formulaElements[1];
        
        // 연산자에 따라서 계산하고 반환.
        if(operation.equals("+"))
            return number1 + number2;
        if(operation.equals("-"))
            return number1 - number2;
        if(operation.equals("*"))
            return number1 * number2;
        
        return -1;
    }
}
