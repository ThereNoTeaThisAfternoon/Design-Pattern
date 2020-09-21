package 行为型模式.interpreter;

import java.util.HashMap;

/**
 * 抽象运算符号解析器，每个运算符号斗志和自己左右两个数字有关
 * 但左右两个数字有可能也是一个解析器的结果，无论何种类型，都是Expression类的实现类
 */
public class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    //因为SymbolExpression 是让其子类来实现的，因此 interpreter 是一个默认实现
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
