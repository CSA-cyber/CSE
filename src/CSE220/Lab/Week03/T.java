package CSE220.Lab.Week03;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Arrays;

public class T {
    public static void main(String[] args) {
        Object[] linear9 = {10, 20, -30, 20, 50, 30, null};
        Object o = new Integer(1316);
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("js");
        String className = linear9.getClass().getSimpleName();
        try {
            engine.eval("System.out.println(Arrays.toString(linear9));");
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
