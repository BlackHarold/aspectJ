package home.blackharold.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {

    @Pointcut("execution(* home.blackharold.aop.dao.*.*(..))")
    public void forDAOPackage() {
        System.out.println("pointcut for all classes and methods home.blackharold.aop.dao package");
    }

    //    create point cut for getter methods
    @Pointcut("execution(* home.blackharold.aop.dao.*.get*(..))")
    public void forGetters() {
        System.out.println("for all G etters methods in home.blackharold.aop.dao package");
    }

    //    create point cut for setter methods
    @Pointcut("execution(* home.blackharold.aop.dao.*.set*(..))")
    public void forSetters() {
        System.out.println("for all S etters methods in home.blackharold.aop.dao package");
    }

    //    create pointcut include package ... exclude getters / setters
    @Pointcut("forDAOPackage() && !forSetters())")
    public void forDAOPackageNoGetterSetter() {
        System.out.println("exclude get set methods");
    }
}
