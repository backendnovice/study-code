package level0;

public class CodeProcess {
    public String solution(String code) {
        String[] codes = code.split("");
        
        StringBuilder string = new StringBuilder();
        
        boolean flag = false;
        
        for(int i = 0; i < codes.length; i++) {
            if(codes[i].equals("1")) {
                flag = !flag;
            }else {
                if(flag && i % 2 != 0) {
                    string.append(codes[i]);
                }
                if(!flag && i % 2 == 0) {
                    string.append(codes[i]);
                }
            }
        }
        
        return string.length() > 0 ? string.toString() : "EMPTY";
    }
}
