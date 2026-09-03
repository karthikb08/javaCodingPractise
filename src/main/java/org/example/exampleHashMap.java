import java.util.*;

class Employee1{
    int id;
    String name;

//    @Override
//    public int hashCode() {
//        return 31 * id + (name == null ? 0 : name.hashCode());
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (!(obj instanceof Employee1)) return false;
//        Employee1 other = (Employee1) obj;
//        return id == other.id && Objects.equals(name, other.name);
//    }

}
public class exampleHashMap {
    public static void main(String[] args) {

        Employee1 e1 = new Employee1();
        e1.id=101;
        e1.name="karthik";

        Employee1 e2 = new Employee1();
        e2.id=101;
        e2.name="karthik";

        Employee1 e3 = new Employee1();
        e3.id=102;
        e3.name="raja";

        Map<Integer,Employee1> map = new HashMap<>();
        map.put(e1.id, e1);
        map.put(e2.id, e2);
        map.put(e3.id, e3);

        System.out.println("id "+ map.get(e2.id).id);
        System.out.println("name "+ map.get(e3.id).name);

        Set<Employee1> set = new HashSet<>();
        set.add(e1);
        set.add(e2);

        System.out.println(map.size());
        System.out.println(set.size());
    }
}
