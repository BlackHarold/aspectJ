package home.blackharold.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class ApiAnalyticsAspect {

    @Before("home.blackharold.aop.aspect.AopExpressions.forDAOPackageNoGetterSetter())")
    public void performApiAnalytics() {
        System.out.println("====> method performApiAnalytics() 3");
    }

}
