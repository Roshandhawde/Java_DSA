package polymorphism;

public class ChildClass extends  ParentClass{
    @Override
    public void parentMethod(){
        System.out.println("Child");
    }

public void childMethod(){
    System.out.println("Child Method CAll : "+parentId+" "+protectedVar );
    super.parentMethod();
    System.out.println(finalVar);
}

}
