package level0;

public class HateEnglish {
    public long solution(String numbers) {
        final String[] template = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        StringBuilder result = new StringBuilder(numbers);
        
        for(int i = 0; i < template.length; i++) {
            while(result.indexOf(template[i]) != -1) {
                result.replace(result.indexOf(template[i]), result.indexOf(template[i]) + template[i].length(), String.valueOf(i));
            }
        }
        
        return Long.parseLong(result.toString());
    }
}
