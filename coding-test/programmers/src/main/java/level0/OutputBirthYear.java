package level0;

public class OutputBirthYear {
    public int solution(int age) {
        final int CURRENT_YEAR = 2022;
        final int BIRTH_AGE = 1;
        
        return CURRENT_YEAR - age + BIRTH_AGE;
    }
}
