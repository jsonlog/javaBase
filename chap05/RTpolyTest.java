// RTpolyTest.java
class Parent{
    public void function(){
        System.out.println("I am in Parent!");
     }
    }
 class Child extends Parent{
    private void function(){
        System.out.println("I am in Child!");
     }
    }
public class RTpolyTest{
    public static void main(String args[]){
    Parent p1=new Parent( );
    Parent p2=new Child( );
      p1.function( );
      p2.function( );
     }
   }