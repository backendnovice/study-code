package level0;

public class DateComparison {
    public int solution(int[] date1, int[] date2) {
        int number1 = convert(date1);
        int number2 = convert(date2);
        
        return (number1 - number2) >= 0 ? 0 : 1;
    }
    
    private int convert(int[] dates) {
        StringBuilder stringBuilder = new StringBuilder();
        
        for(int date : dates) {
            if(date > 9) {
                stringBuilder.append(date);
            }else {
                stringBuilder.append("0" + date);
            }
        }
        
        return Integer.parseInt(stringBuilder.toString());
    }
}
