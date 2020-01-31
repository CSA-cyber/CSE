package CSE220.Theory.URI;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public class S1022 {
    public static void main(String[] args) throws ScriptException {
        Scanner in = new Scanner(System.in);
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("js");
        int test = in.nextInt();
        in.next();
        while (test-- > 0) {
            System.out.println(engine.eval(in.nextLine()));
        }
    }
}
