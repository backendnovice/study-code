package level1;

public class HidePhoneNumber {
    public String solution(String phone_number) {
        final int LIMIT = phone_number.length() - 4;
        
        StringBuilder stars = new StringBuilder();
        for(int i = 0; i < LIMIT; i++) {
            stars.append("*");
        }
        
        return stars + phone_number.substring(LIMIT);
    }
}
