package level0;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class StringCalculate {
    public int solution(String my_string) throws ScriptException {
        ScriptEngineManager scriptManager = new ScriptEngineManager();
        ScriptEngine engine = scriptManager.getEngineByName("javascript");
        
        return (int)engine.eval(my_string);
    }
}
