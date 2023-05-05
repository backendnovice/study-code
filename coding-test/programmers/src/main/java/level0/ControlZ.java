package level0;

public class ControlZ {
    public int solution(String s) {
        String[] expressions = s.split(" ");
        
        int result = 0;
        int previous = 0;
        for(int i = 0; i < expressions.length; i++) {
            if(expressions[i].equals("Z")) {
                result -= previous;
            }else {
                previous = Integer.parseInt(expressions[i]);
                result += previous;
            }
        }
        
        return result;
    }
}
