package dynamic_proxy;

import java.lang.reflect.Proxy;

public class DynamicProxyDemo {

    public static void main(String[] args) {
        BankService bankService = new BankServiceImp();
        AuditLogProxy auditLogProxy = new AuditLogProxy(bankService);
        bankService.deposit();
        bankService.withdraw();

        ClassLoader classLoader = DynamicProxyDemo.class.getClassLoader();
        BankService proxiedService = (BankService) Proxy
            .newProxyInstance(classLoader, new Class[]{BankService.class}, auditLogProxy);

        proxiedService.deposit();
        proxiedService.withdraw();
    }
}
