package Comparator;

import java.util.Comparator;
import java.util.Objects;




public class Employee implements Comparable<Employee> {
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name); // Only hashCode is overridden
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return id == employee.id && Objects.equals(name, employee.name);
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

@Override
    public int compareTo(Employee o) {
         if(this.id==o.id){
             return 0;
         } else if (this.id>o.id) {
             return 1;
         }else return -1;
    }
}
