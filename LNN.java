import java.util.*;

public class LNN {
  public static void main(String[] args){
    
    // N, M, K 공백으로 입력받기
    Scanner sc = new Scanner(System.in);
    
    int n, m, k;
    int[] arr;
    int max, sec;

    n = sc.nextInt();
    m = sc.nextInt();
    k = sc.nextInt();
    // 그 다음줄 배열 입력받기
    arr = new int[n];

    for (int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }

    
    // 가장 큰 수, 두 번째 큰 수 찾기
    Arrays.sort(arr);   // $$직접 찾는 코드를 썼었음.
    max = arr[n-1];     // sort는 내림차순이다. 가장 큰 수는 맨 뒤에 있음.
    sec = arr[n-2];


    int result = 0;

    // 가장 큰 수 반복 돌리고 개수가 K되면 두 번째 큰 수 넣기
    int f_cnt = m/(k+1);

    result += sec*f_cnt;
    result += max*(m-f_cnt);

    System.out.println(result);
    


  }
}
