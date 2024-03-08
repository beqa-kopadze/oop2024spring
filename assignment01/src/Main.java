import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Print your name
        System.out.println("Hello dear user, please enter your name and press 'Enter'");
        String name = input.nextLine();
        System.out.println("Nice to meet you " + name);


        //Simple Math Operations
        System.out.println("Now " + name + ", for first let's do simple calculations." +
                           " Give me two numbers, write first one and press enter," +
                           " than write second one and, again, press enter");
        float a = input.nextFloat();
        float b = input.nextFloat();

        float res_add = a+b;
        float res_sub = a-b;
        float res_mul = a*b;
        float res_div = a/b;
        System.out.println(a + "+" + b + " = " + res_add);
        System.out.println(a + "-" + b + " = " + res_sub);
        System.out.println(a + "*" + b + " = " + res_mul);
        System.out.println(a + "/" + b + " = " + res_div);


        //Area of a Circle
        System.out.println(name + " for next don't you want to calculate circle area?" +
                                  " Give me any circle radius, press Enter and i will calculate it for you ");
        double radius = input.nextDouble();
        double circle_area = Math.PI * radius * radius;
        System.out.println("area of "+ radius + " radius circle is: " + circle_area);

        //Convert Minutes to Seconds
        System.out.println("Now let's convert minutes into seconds. give me any minute and press Enter");
        float minutes = input.nextFloat();
        float seconds = minutes * 60;
        System.out.println(minutes + " - minutes to seconds is: " + seconds);

        //Print a Pattern
        System.out.println("For last let's draw triangle from stars. From you "+ name +" I only wont you to specify height." +
                           " Write any natural number and press enter");
        int count = input.nextInt();
        for (int i = 0; i <= count; i++){
            for(int j = 0; j < i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("That was it. Thank you for staying <3");
    }
}