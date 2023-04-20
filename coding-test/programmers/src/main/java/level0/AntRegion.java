package level0;

public class AntRegion {
    public int solution(int hp) {
        final int ATK_GENERAL = 5;
        final int ATK_SOLDIER = 3;
        final int ATK_WORKER = 1;
        
        int count = 0;
        
        if(hp >= ATK_GENERAL) {
            count += hp / ATK_GENERAL;
            hp %= ATK_GENERAL;
        }
        if(hp >= ATK_SOLDIER) {
            count += hp / ATK_SOLDIER;
            hp %= ATK_SOLDIER;
        }
        if(hp >= ATK_WORKER) {
            count += hp / ATK_WORKER;
        }
        
        return count;
    }
}
