import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        int ans= 0;
        int line = sc.nextInt();
        for(int i = 0; i < line; i++){
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            if(num1 == num2){
                ans += num1 * num2;
            }else{
                ans += num1 + num2;
            }
        }
        System.out.println(ans);
    }
}
