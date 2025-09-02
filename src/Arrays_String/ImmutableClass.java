package Arrays_String;
class Address{
   private String city;
   private int zip;

    public Address(int zip, String name) {
        this.zip = zip;
        this.city = name;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + city + '\'' +
                ", zip=" + zip +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String name) {
        this.city = name;
    }

    public void setZip(int zip) {
        zip = zip;
    }

    public int getZip() {
        return zip;
    }
}


final class Employee{
    private int id;
   final private  String name;
   final private Address address;


    public Employee(int id, String name, Address address) {
        this.id=id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return new Address(address.getZip(), address.getCity());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}


public final  class ImmutableClass {
    public static void main(String[] args) {
        Address add= new Address(12345,"bangal" );

        Employee nam= new Employee(1, "roshan", add);
nam.getAddress().setCity("dcrcr" );

        System.out.println(
                nam.toString()
        );

    }
}
