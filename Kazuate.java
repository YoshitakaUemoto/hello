import java.io.*;
import java.util.Scanner;

public class Kazuate{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int ans = 39;
        int num;

        System.out.println("2桁の整数を入力してください");
        for(int i=0;i<5;i++){
            num = scanner.nextInt();
            if(ans == num){
                System.out.println("当たりです。");
                break;
            }else{
                if(ans>num){
                    System.out.println("正解より小さいです。再入力してください。");
                }else{
                    System.out.println("正解より大きいです。再入力してください。");
                }
                
                if(Math.abs(num-ans)>=20){
                    System.out.println("正解と20以上離れています");
                }
            }

            if(i == 4){
                System.out.println("5回以内に成功しませんでした.");
                System.out.println("正解は39です");
            }
        }
        
    }
}