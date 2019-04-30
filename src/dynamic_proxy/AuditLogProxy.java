package dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AuditLogProxy implements InvocationHandler {

    private Object target;

    public AuditLogProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Logging before executing a method...");
        Object result = method.invoke(target, args);
        return null;
    }
}
