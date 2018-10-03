import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        float v1=scn.nextFloat();
        float v2=v1*(float)1.6;
        v2=Math.round(v2*100)/100f;
        System.out.println(v2);
    }
}
