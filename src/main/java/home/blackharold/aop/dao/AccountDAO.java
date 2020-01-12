package home.blackharold.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    private String name;
    private String serviceCode;


    public void addAccount(Account account, boolean vipFlag) {
        System.out.println(getClass().getSimpleName() + ": addAccount(account, vipFlag) ");
    }

    public boolean doWork(){
        System.out.println(getClass().getSimpleName() + ": doWork()");
        return false;
    }


    public String getName() {
        System.out.println(getClass().getSimpleName()+ ": getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass().getSimpleName() + ": setName()");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass().getSimpleName() + ": getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass().getSimpleName() + ": setServiceCode()");
        this.serviceCode = serviceCode;
    }
}
