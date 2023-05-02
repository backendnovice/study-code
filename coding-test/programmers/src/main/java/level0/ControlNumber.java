package level0;

public class ControlNumber {
    public int solution(int n, String control) {
        String[] strings = control.split("");
        
        for(String string : strings) {
            n += provide(string);
        }
        
        return n;
    }
    
    private int provide(String string) {
        if(string.equals("w")) {
            return 1;
        }
        if(string.equals("s")) {
            return -1;
        }
        if(string.equals("d")) {
            return 10;
        }
        if(string.equals("a")) {
            return -10;
        }
        
        return 0;
    }
}
