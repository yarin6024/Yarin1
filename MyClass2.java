import java.util.Random;
public class MyClass {
    public static void main(String[] args) { 
        Random r = new Random();
        double sizeAmount;
        sizeAmount = r.nextInt(20)+3;
        System.out.println("sizeAmount="+sizeAmount);
        if (sizeAmount%2 ==0)
        {
            double Angle= 360/sizeAmount;
            System.out.println("each angle size is:"+Angle);
        }
       else 
       {
           int num=3;
           double area=(15*15)*Math.sqrt(num)*sizeAmount;
           area= area/4;
        System.out.print("The elaborate polygon area is:"+ area);
        }
            
       
    }
}
