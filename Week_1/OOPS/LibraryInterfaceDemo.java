interface LibraryUser{
  void registerAccount();
  void requestBook();
}
class KidUsers implements LibraryUser{
  int age;
  String BookType;  
  public void registerAccount(){
    if(age<12){
      System.out.println("You have successfully registered under a Kids Account");
    }
    else{
      System.out.println("Sorry,age must be less than 12 to register as a kid");
    }
  }
  public void requestBook(){
    if(BookType.equals("Kids")){
      System.out.println("Book Issued successfully,please return thee book within 10 days");
    }
    else{
      System.out.println("Oops you are allowed to take only Kids book");
    }
  }
}
class AdultUser implements LibraryUser{
   int age;
   String BookType;
   public void registerAccount(){
       if(age>12){
           System.out.println("You have successfully registered under an Adult Account");
       }
       else{
           System.out.println("Sorry age must be greater then 12 to register as an Adult");
       }
   }
    public void requestBook(){
        if(BookType.equals("Fiction")){
            System.out.println("Book issued successfully,please return the book within 7 days");
        }
        else{
            System.out.println("Oops you are allowed to take only adult fiction book");
        }
    }
}
public class LibraryInterfaceDemo{
    public static void main(String args[]){
        KidUsers k=new KidUsers();
        k.age=10;
        k.registerAccount();
        k.age=18;
        k.registerAccount();
        k.BookType="Kids";
        k.requestBook();
        k.BookType="Fiction";
        k.requestBook();
        AdultUser a=new AdultUser();
        a.age=5;
        a.registerAccount();
        a.age=23;
        a.registerAccount();
        a.BookType="Kids";
        a.requestBook();
        a.BookType="Fiction";
        a.requestBook();
    }
}

        
                                
            
       
     

    
