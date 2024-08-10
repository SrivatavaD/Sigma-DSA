import java.util.*;

public class one{
    // public static void main(String[] args) {
    //     int marks[] = new int[100];
    //     Scanner sc = new Scanner (System.in);
    //     // int phy = sc.nextInt();
    //     marks[0] = sc.nextInt();
    //     marks[1] = sc.nextInt();
    //     marks[2] = sc.nextInt();
    //     System.out.println("phy: " +marks[0]);
    //     System.out.println("phy: " +marks[1]);
    //     System.out.println("phy: " +marks[2]);

    //     marks[2] = 100;
    //     System.out.println("math : "  +marks[2]);

    //     int percentage = (marks[0] + marks[1] + marks[2]) /3;
    //     System.out.println("percentage = " + percentage + "%" );


        //Arrays are always pass by refrence hence one of the examples for the same is:
         
        public static void update(int marks[]) {
            for(int i = 0; i<marks.length; i++) {
                marks[i] = marks[i]+1;
            }
        }
        public static void main(String[] args) {
            int marks[] = {97,98,99};
            update(marks);

            //print our marks

            for(int i =0; i<marks.length; i++){
                System.out.print(marks[i] + " ");
            }
            System.out.println();
        }

    }
