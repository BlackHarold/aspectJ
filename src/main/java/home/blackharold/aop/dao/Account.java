package home.blackharold.aop.dao;

public class Account {

    private String name;
    private String level;

    public String getName() {
        System.out.println(getClass().getSimpleName() + ": getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass().getSimpleName() + ": setName()");
        this.name = name;
    }

    public String getLevel() {
        System.out.println(getClass().getSimpleName() + ": getLevel()");
        return level;
    }

    public void setLevel(String level) {
        System.out.println(getClass().getSimpleName() + ": setLevel()");
        this.level = level;
    }
}
