public class Employee {
    String name;
    double salary;

    int workHours;
    int hireYear;

    Employee(String name,double salary,int workHours,int hireYear) {

        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }
    double tax(){
        double tax=0;
        if(this.salary<=1000){
            return tax;
        }
        else {
            tax=this.salary*0.03;
            return tax;
        }
    }
    double bonus(){
        double bonus=0;
        if(this.workHours>40){
            for(int i=40;i<this.workHours;i++){
                bonus+=30;
            }
            return bonus;
        }
        return bonus;
    }
    double raiseSalary(){
        double raiseSalary=0;
        int year=2023;
        if(year-this.hireYear<9){
            raiseSalary=this.salary*0.05;
            return raiseSalary;

        } else if ((year-this.hireYear>9 && year-this.hireYear<20)) {
            raiseSalary=this.salary*0.10;
            return raiseSalary;

        }
        else {
            raiseSalary=this.salary*0.15;
            return raiseSalary;
        }

    }
    void info(){
        System.out.println("adı: "+this.name);
        System.out.println("maaşı: "+this.salary);
        System.out.println("çalışma saati: "+this.workHours);
        System.out.println("başlangıç yılı:"+this.hireYear);
        System.out.println("vergi: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println(" maaş artışı: "+raiseSalary());
        System.out.println("vergi ve bonuslarla birlikte maaş:"+(this.salary+bonus()-tax()));
        System.out.println("toplam maaş: "+(this.salary+raiseSalary()+bonus()-tax()));

    }
}
