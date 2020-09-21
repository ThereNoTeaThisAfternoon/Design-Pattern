package 结构型模式.proxy.cglibproxy;

/**
 * 记得导cglib的4个jar包
 *
 * @author しゅうはく
 */
//public class ProxyFactory implements MethodInterceptor {
//    // 维护一个目标对象
//    private Object target;
//
//    public ProxyFactory() {
//
//    }
//
//    // 构造器，传入一个被代理方法
//    public ProxyFactory(Object target) {
//        super();
//        this.target = target;
//    }
//
//    // 返回一个代理对象，是target对象的代理对象
//    public Object getProxyInstance() {
//        // 1、创建一个工具类
//        Enhancer enhancer = new Enhancer();
//        // 2、设置父类
//        enhancer.setSuperclass(target.getClass());
//        // 3、设置回调函数
//        enhancer.setCallback(this);
//        // 4、创建子类对象，即代理对象
//        return enhancer.create();
//    }
//
//    // 重写 intercept 方法，会调用目标对象的方法
//    @Override
//    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy arg3) throws Throwable {
//        System.out.println("cglib代理模式开启");
//        Object returnVal = method.invoke(target, args);
//        return returnVal;
//    }
//}
