public class Employee {
    String name;
    int age;
    String designation;
    double salary;


    public Employee(String name){
        this.name=name;
    }
    
    public void emAge(int emAge){
        age=emAge;
    }
    public void emDesignation(String emDse){
        designation=emDse;
    }
    public void emSalary(double emSalary){
        salary=emSalary;
    }
    public void printMes(){
        System.out.println("名字" + name);
        System.out.println("年龄" + age);
        System.out.println("职位" + designation);
        System.out.println("薪水" + salary);
    }
}
