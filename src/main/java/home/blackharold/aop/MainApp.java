package home.blackharold.aop;

import home.blackharold.aop.config.AopConfig;
import home.blackharold.aop.dao.Account;
import home.blackharold.aop.dao.AccountDAO;
import home.blackharold.aop.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

//        read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

//        get the bean from spring container
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
//        call the business method
        accountDAO.addAccount(new Account(), true);
        accountDAO.doWork();

//        call get- and set- methods
        accountDAO.setName("foobar");
        accountDAO.getName();

        accountDAO.setServiceCode("silver");
        accountDAO.getServiceCode();

//        get membership bean from spring container
        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
//        call the membership business method
        membershipDAO.addAccount();

//        close context
        context.close();

    }
}
