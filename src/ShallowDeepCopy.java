
class Salary{
    public Salary(int baseSalary, int bonous) {
        this.baseSalary = baseSalary;
        this.bonous = bonous;
    }

    int baseSalary;
    int bonous;
}
class Employee implements Cloneable {

    public Employee(String name, Salary salary) {
        this.name = name;
        this.salary = salary;
    }

    String name;
    Salary salary;

    public Employee copy(boolean deep){

        if(deep){
            return new Employee(this.name,new Salary(this.salary.baseSalary,this.salary.bonous));
        }else{
            return new Employee(this.name,this.salary);
        }
    }
}

public class ShallowDeepCopy {
    public static void main(String[] args) {
        Salary s1 = new Salary(50000, 1000);
        Employee empObj = new Employee("John", s1);

// 2. Perform Shallow Copy (Shared Salary)
        Employee hrView = empObj.copy(false);

// 3. Real-time Change: Give the copy a raise
                hrView.salary.bonous = 100;
// 4. THE RESULT:
        System.out.println("Mngr view = " + empObj.salary.bonous);
        System.out.println("HR view = " + hrView.salary.bonous);

        // Output: 5000.0



        // 1. Original Employee
        Salary s2 = new Salary(90000, 1000);
        Employee empObj1 = new Employee("Alice", s2);

// 2. Perform Deep Copy (Independent Salary)
        Employee empObjDeepCopy = empObj1.copy(true);

// 3. Real-time Change: Simulate a massive bonus
        empObjDeepCopy.salary.bonous = 200;

// 4. THE RESULT:
        System.out.println("Deep Copy Mngr View= " + empObj1.salary.bonous); // Output: 1000.0
        System.out.println("Deep Copy HR view= " + empObjDeepCopy.salary.bonous); // Output: 20000.0
    }
}
