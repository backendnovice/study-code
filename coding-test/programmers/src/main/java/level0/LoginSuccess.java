package level0;

import java.util.HashMap;
import java.util.Map;

public class LoginSuccess {
    public String solution(String[] id_pw, String[][] db) {
        Map<String, String> map_db = arrayToMap(db);
        
        String id = id_pw[0];
        String pw = id_pw[1];
        
        if(map_db.containsKey(id))
            return map_db.get(id).equals(pw) ? "login" : "wrong pw";
        
        return "fail";
    }
    
    private Map<String, String> arrayToMap(String[][] db) {
        Map<String, String> map_db = new HashMap<>();
        
        for(String[] data : db) {
            String id = data[0];
            String pw = data[1];
            map_db.put(id, pw);
        }
        
        return map_db;
    }
}
