package home.blackharold.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public void addAccount() {
        System.out.println(getClass().getSimpleName() + ": addAccount()");
    }
}
