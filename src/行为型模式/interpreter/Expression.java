package 行为型模式.interpreter;

import java.util.HashMap;

/**
 * 抽象类表达式，通过 HashMap的键值对，可以获取到各个变量的值
 */
public abstract class Expression {
    //解释公式和数值，key 就是公式（表达式）参数【a，b，c】，value 是具体值
    //HashMap {a=10,b=20}
    public abstract int interpreter(HashMap<String, Integer> var);
}
