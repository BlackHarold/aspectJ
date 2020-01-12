package home.blackharold.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class CloudLogAsyncAspect {

    @Before("home.blackharold.aop.aspect.AopExpressions.forDAOPackageNoGetterSetter())")
    public void logToCloudAsync() {
        System.out.println("====> method logToCloudAsync() 1");
    }

}
