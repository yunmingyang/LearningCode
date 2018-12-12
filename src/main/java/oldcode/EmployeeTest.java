public class EmployeeTest {
    public static void main(String[] args){
        //实例化对象
        Employee emOne=new Employee("TEST1");
        Employee emTwo=new Employee("TEST2");


        //调用对象成员方法
        emOne.emAge(15);
        emOne.emDesignation("初级程序员");
        emOne.emSalary(3000);
        emOne.printMes();

        emTwo.emAge(20);
        emTwo.emDesignation("高级程序员");
        emTwo.emSalary(30000);
        emTwo.printMes();
    }
}
