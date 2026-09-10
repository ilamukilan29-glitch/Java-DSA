package Training;
import java.util.*;

import Training.info;

public class HashMa{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,info> map = new HashMap<>();
        HashMap<Integer,String> pass = new HashMap<>();
        HashMap<Integer,String> fail = new HashMap<>();
        System.out.println("Enter the NO of Students: ");
        int n = sc.nextInt();
        sc.nextLine();
        int roll = 100;
        for(int i=0;i<n;i++){
            System.out.println("Enter the value of Student "+(i+1));
            info stu = new info();
            System.out.println("Enter the Student Name ");
            stu.name = sc.nextLine();
            stu.reg=++roll;
            System.out.println("Enter the Mark of Sub 1: ");
            stu.sb1 = sc.nextInt();
            System.out.println("Enter the Mark of sub 2: ");
            stu.sb2 = sc.nextInt();
            System.out.println("Enter the Mark of Sub 3: ");
            stu.sb3 = sc.nextInt();
            sc.nextLine();
            stu.tot = (stu.sb1+stu.sb2+stu.sb3);
            stu.avg = stu.tot/3;
            map.put(stu.reg,stu);
        }
        for(int i=0;i<n;i++){
            info ob = map.get(101+i);
            if(ob.sb1<50 || ob.sb2<50 || ob.sb3<50){
                fail.put(ob.reg,ob.name);
            }
            else{
                pass.put(ob.reg,ob.name);
            }
            System.out.println("Name Of the Student: "+ob.name);
            System.out.println("Register Number: "+ob.reg);
            System.out.println("Mark 1: "+ob.sb1);
            System.out.println("Mark 2: "+ob.sb2);
            System.out.println("Mark 3: "+ob.sb3);
            System.out.println("Total Marks: "+ob.tot+"/300");
            System.out.println("Average Of 3 Sub: "+ob.avg);
        }
        System.out.println("Pass Students List");
        for(int key: pass.keySet()){
            System.out.println(pass.get(key));
        }
          System.out.println("Fail Students List");
        for(int key: fail.keySet()){
            System.out.println(fail.get(key));
        }
    }
}
