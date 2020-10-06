import java.util.Scanner; 

public class Main{

  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Press 1 to start program, 0 to exit.");
    int cin = scan.nextInt(); 
    if (cin == 1){
      System.out.println("Hello! Today we will be calculating you're BMI. Please enter '1' for metric; '2' for standard.");
      int unit = scan.nextInt();

       if(unit == 1){
        System.out.println("Please enter your height in meters.");
        double height = scan.nextDouble();
        height = height * height; 

      System.out.println("Please enter your weight in kilograms.");
        int weight = scan.nextInt();

          double BMI = weight/height;
            System.out.println("You're BMI is: " + BMI);

     if(BMI < 18.5)
              System.out.println("You are underweight.");
            else if(BMI <= 24.9)
              System.out.println("You are normal weight.");
            else if(BMI >= 25 & BMI <= 29.9)
              System.out.println("You are overweight.");
            else if(BMI >= 30)
              System.out.println("You are obese.");
      }

else if(unit ==2){
        System.out.println("Please enter your height in inches.");
        double height = scan.nextDouble();
        height = height * height; 

        System.out.println("Please enter your weight in pounds.");
        int weight = scan.nextInt();

         double BMI = weight/height;
            System.out.println("You're BMI is: " + BMI);

        if(BMI < 18.5)
              System.out.println("You are underweight.");
            else if(BMI <= 24.9)
              System.out.println("You are normal weight.");
            else if(BMI >= 25 & BMI <= 29.9)
              System.out.println("You are overweight.");
            else if(BMI >= 30)
              System.out.println("You are obese.");
        }
    }

       else if(cin == 0)
      System.exit(0);
    scan.close();
  }
}
