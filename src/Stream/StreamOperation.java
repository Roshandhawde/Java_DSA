package Stream;

import java.util.*;
import java.util.stream.Collectors;

//enum Gender {
//    male,
//    female
//}

class NameComparator implements Comparator<Students>{


    @Override
    public int compare(Students o1, Students o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class AgeComparator implements Comparator<Students>{
    @Override
    public int compare(Students o1, Students o2) {
        if(o1.getAge()==o2.getAge()){
            return 0;
        } else if (o1.getAge()>o2.getAge()) {
            return 1;
        }else{
            return -1;
        }
    }
}

class Students implements Comparable<Students> {
    private String name;
    private int age;
    private String gender;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Students)) return false;
        Students s = (Students) o;
        return name.equals(s.getName()) && Objects.equals(name, s.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name);
    }




    public Students(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", Gender='" + gender + '\'' +
                '}';
    }

    @Override
    public int compareTo(Students o) {
        return this.name.compareTo(o.getName());
    }
}

public class StreamOperation {
    public static void main(String[] args) {
        Students st1 = new Students("rosghan", 18, "male");
        Students st2 = new Students("flcjnjf", 25, "female");
        Students st3 = new Students("cnjkrflencrf", 10, "male");
        Students st4 = new Students("rosghan", 9, "male");

        List<Students> stud = new ArrayList<>(Arrays.asList(st1, st2, st3, st4));


        // Filter
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 2, 14, 34);
        List<Integer> evenNum = num.stream().filter(n -> n % 2 == 0).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(evenNum);


        ArrayList<Students> st = stud.stream().filter(n -> n.getAge() >= 18).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(st);


        // MAp


        List<String> addAll = stud.stream().map(s -> s.getName() + "---" + s.getAge() + "---" + s.getGender()).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(addAll);


        // distinct

List<Students> unqstd= stud.stream().distinct().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(unqstd);



        // sort
        List<Students> sortstd= stud.stream().sorted().collect(Collectors.toList());
        System.out.println(sortstd);
        System.out.println(stud);
        List<Students> comparatorstd= stud.stream().sorted(new AgeComparator()).collect(Collectors.toList());
        System.out.println(comparatorstd);
// Reduce


         String str = "I like java  and java is good language";

        Map<String, Integer> wordCount = Arrays.stream(str.split("\\s+"))
                .map(String::toLowerCase)  // optional: normalize case
                .reduce(
                        new HashMap<String, Integer>(), // identity
                        (map, word) -> {                // accumulator
                            map.put(word, map.getOrDefault(word, 0) + 1);
                            return map;
                        },
                        (map1, map2) -> {               // combiner (parallel streams)
                            map2.forEach((k, v) -> map1.merge(k, v, Integer::sum));
                            return map1;
                        }
                );

        System.out.println(wordCount);

        HashMap<String, Integer> wordCounts= Arrays.stream(str.split("\\s+")).map(String::toLowerCase)
                .reduce(new HashMap<String,Integer>(), (map, word)->{
                    map.put(word, map.getOrDefault(word, 0)+1);
                    return map;

        },(map1, map2)->{
                    System.out.println("map1:  "+map1);
                    return map2;
                });

        System.out.println(wordCounts);


        // GroupBy

        Map<String , Long> colectWord= Arrays.stream(str.split("\\s+"))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(word-> word, Collectors.counting()));

        System.out.println(colectWord.values().stream().max(Comparator.comparing(Long::longValue)));

    }
}
