package by.learn.proj.runner;

import by.learn.proj.entity.Engineer;
import by.learn.proj.entity.Supervisor;

public class Runner {
    public static void main(String[] args) {
        Engineer engineer = new Engineer("John",1,1000);
        Engineer supervisor = new Supervisor("Andrew",0,1500);
        System.out.println(engineer);
        System.out.println(supervisor);

        engineer.doWork();
        supervisor.doWork();

        engineer.receiveSalary();
        supervisor.receiveSalary();

        supervisor.giveWarn(engineer);
        System.out.println(engineer);
        supervisor.giveWork(engineer);
        engineer.giveWarn(supervisor);
    }
}
