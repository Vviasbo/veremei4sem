package by.learn.proj.entity;

public class Supervisor extends Engineer implements IEmployee {
    public Supervisor(String name, int warns, int salary) {
        super(name, warns, salary);
    }

    @Override
    public void doWork() {
        System.out.println(this.getName() + ": I am working!");
    }

    @Override
    public void giveWork(Engineer engineer) {
        System.out.println("An engineer have received some work");;
    }

    @Override
    public void giveWarn(Engineer engineer) {
        engineer.setWarns(engineer.getWarns() + 1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Supervisor{");
        sb.append("name='").append(this.getName()).append('\'');
        sb.append(", warns=").append(this.getWarns());
        sb.append(", salary=").append(this.getSalary());
        sb.append('}');
        return sb.toString();
    }
}
