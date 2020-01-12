package home.blackharold.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class LoggingAspect {

    @Before("home.blackharold.aop.aspect.AopExpressions.forDAOPackageNoGetterSetter())")
    public void beforeAddAccountAdvice() {
        System.out.println("====> method beforeAddAccountAdvice() 2");
    }

}
