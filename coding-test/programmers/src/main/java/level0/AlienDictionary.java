package level0;

public class AlienDictionary {
    public int solution(String[] spell, String[] dic) {
        boolean isContains = false;
        
        for(int i = 0; i < dic.length; i++) {
            int count = 0;
            for(int j = 0; j < spell.length; j++) {
                if(dic[i].contains(spell[j]))
                    count++;
            }
            if(count == spell.length) {
                isContains = true;
                break;
            }
        }
        
        return isContains ? 1 : 2;
    }
}
