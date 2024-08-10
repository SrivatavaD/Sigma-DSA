public class OOPS {
    // public static void main(String[] args) {
        // Pen p1 = new Pen(); //created a pen object called p1
        // p1.setColor("Blue");
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tip);
        

        //Getter and Setter 
        // Pen p1 = new Pen();
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());
        // p1.setColor("Yellow");
        // System.out.println(p1.getColor());


        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "DevanshSrivastava";
        // myAcc.setPassword("abcdefghij");

    // }


    //Contructor 
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("devansh");
        Student s3 = new Student(123);
         
    }


    
}

// class BankAccount{
//     public String username;
//     private String password;
//     public void setPassword(String pwd){
//         password = pwd;
//     }
// }

// class Pen {
//     String color;
//     int tip;

//     void setColor(String newColor) {
//         color = newColor;
//     }

//     void setTip(int newTip){
//         tip=newTip;
//     }
// }

//Getter && Setter

// class Pen{
// String color;
// private int tip;

//     String getColor(){
//         return this.color;
//     }

//     int getTip(){
//         return this.tip;
//     }

//     void setColor(String newColor){
//         this.color = newColor;
//     }

//     void setTip(int tip){
//         this.tip=tip;
//     }
// }

//Constructor




class Student{
    String name;
    int roll;

    Student(){
        System.out.println("contructor is called...."); //Non parameterized ctor
    }

    Student (String name){ 
        this.name = name;      //parameterized ctor
    }

    Student (int roll){
        this.roll = roll;
    }
}


