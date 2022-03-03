package maasHesaplayici;

import java.math.BigDecimal;

public class Employee {
    public String name;
    public double salary;
    public int workHours;
    public int hireYear;
    //Employee(name,salary,workHours,hireYear)

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){
        if (salary<=1000){
            return 0;
        }
        else if (salary>1000){
            return salary*0.03;
        }
        return 0;
    }
    public double bonus(){
        if (this.workHours>40){
            return (this.workHours-40)*30;
        }
        return 0 ;
    }
    public double raiseSalary(){
        if (2021-this.hireYear<10){
            return salary*0.05;
        }
        else if (2021-this.hireYear>9 && 2021-this.hireYear<20){
            return salary*0.1;
        }
        else if (2021-this.hireYear>19){
            return salary*0.15;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Adı:"+this.name+"\n"+
                "Maaşı:"+this.salary+"\n"+
                "Çalışma Saati:"+this.workHours+"\n"+
                "Başlangıç yılı:"+this.hireYear+"\n"+
                "Vergi:"+this.tax()+"\n"+
                "Bonus:"+this.bonus()+"\n"+
                "Maaş Artışı:"+this.raiseSalary()+"\n"+
                "vergi ve bonuslarla maaş:"+(this.salary-this.tax()+this.bonus())+"\n"+
                "Toplam Maaş:"+ (this.salary+this.raiseSalary());


    }
}
