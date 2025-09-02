package Comparator;

import java.util.*;


class CompareId implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        if(e1.getId()==e2.getId()){
            return 0;
        } else if (e1.getId()> e2.getId()) {
            return 1;

        }else{
            return -1;
        }
    }
}
class CompareName implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
       return e1.getName().compareTo(e2.getName());

    }
}

public class TestHash {

    public static void main(String[] args) {
        Employee e3= new Employee(3,"zjohn");
        Employee e1= new Employee(1, "gjohn");
        Employee e2= new Employee(2,"ajohn");


        String qqq="ilfjijrgig";


        System.out.println("Compare "+ e1.equals(e2));
        List<Employee> emp = new ArrayList<>();
        emp.add(e3);
        emp.add(e1);
        emp.add(e2);

        System.out.println(emp);
        Collections.sort(emp, new CompareName());
        System.out.println(emp);





    }
}
