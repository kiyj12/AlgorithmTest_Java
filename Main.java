import java.util.*;

public class Main{
    public static void main(String[] args){
        // N과 K 입력받기
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int cnt = 0;

        int rmn;    // 나머지

        // n이 k 이상이라면 계속해서 k로 나누거나 1씩 빼는 것을 반복
        while (n >= k){
            rmn = n % k;
            // n이 k로 나누어 떨어지지 않을 때 : 1씩 뺌
            if (rmn != 0){
                n = n - rmn;
                cnt += rmn;
            }
            // n이 k로 나누어 떨어질 때 : n을 k로 나눔
            else{
                n = n/k;
                cnt += 1;
            }

        }

        // n이 k보다 작아졌을 때, n에서 1을 뺀 수만큼 1을 뺄 것으로 상정하여 count를 센다.
        cnt += (n-1);

        System.out.println(cnt);

        
    }
}