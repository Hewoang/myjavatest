package com.javatest.polypara;

public class Manager extends Emp{
    private double bonus;

    public Manager(String name, int ygz, double bonus) {
        super(name, ygz);
        this.bonus = bonus;
    }

    @Override
    public String getAnnual() {
        return getName()+" "+(getYgz()*12+bonus)+"元/年";
    }

    public String manage(){
        return "管理";
    }
}
