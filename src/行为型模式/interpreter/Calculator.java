package 行为型模式.interpreter;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class Calculator {
    //定义表达式
    private Expression expression;

    //构造函数传参，并解析
    public Calculator(String expStr) {//expStr = a+b-c
        //安排运算先后顺序
        Deque<Expression> stack = new ArrayDeque<>();
        //表达式拆分成字符数组
        char[] charArray = expStr.toCharArray();//[a,+,b,-,c]

        Expression left;
        Expression right;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();//从 stack 中取出 left => "a"
                    right = new VarExpression(String.valueOf(charArray[++i]));//取出右表达式 "b"
                    stack.push(new AddExpression(left, right));//然后根据得到的 left 和 right 构建 AddExpression 加入到 stack
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    //如果是一个 var 就创建要给 VarExpression 对象，并push到
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        //当遍历完整个 charArray 数组后，stack 就得到最后Expression
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        //最后将表达式a+b和var = {a=10，b=20}
        //最后传递给 expression的interpreter解释执行
        return this.expression.interpreter(var);
    }
}
