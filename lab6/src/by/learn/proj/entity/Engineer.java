package by.learn.proj.entity;

public class Engineer implements IEmployee {
    private String name;
    private int warns;
    private int salary;

    public Engineer(String name, int warns, int salary) {
        this.name = name;
        this.warns = warns;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWarns() {
        return warns;
    }

    public void setWarns(int warns) {
        this.warns = warns;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void doWork() {
        System.out.println(this.getName() + ": I am working!");
    }

    @Override
    public void giveWork(Engineer engineer) {
        throw new UnsupportedOperationException("An engineer can only perform.");
    }

    @Override
    public void receiveSalary() {
        System.out.println("Nice, " + this.salary + "$ looks so good.");
    }

    @Override
    public void giveWarn(Engineer engineer) {
        throw new UnsupportedOperationException("An engineer doesn't have subordinates.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Engineer{");
        sb.append("name='").append(name).append('\'');
        sb.append(", warns=").append(warns);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
