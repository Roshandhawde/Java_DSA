package polymorphism;

public  class ParentClass {
   public String parentId= "Parent";
   private String privatleVar= "Private";
   protected String protectedVar= "Protected";

   final String finalVar= "FinalVAr";




    public void parentMethod(){
        System.out.println("Parent");
    }

    public void parentMethod(String message){
        System.out.println("Parent "+ message);
    }

}
