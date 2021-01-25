import java.util.*;

public class NumberCard{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 2차원 행렬 입력받기
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[][] arr = new int[x][y];

        for (int i = 0; i < x; i++){
            for (int j = 0; j< y; j++){
                arr[i][j] = sc.nextInt();
            }
        }


        int answer = arr[0][0];

        for (int i = 0; i < x; i++){
            // 각 행에서 가장 작은 카드 뽑기
            int min = arr[i][0];            // int min = 10001
            for (int j = 0; j < y; j++){
                if (min >= arr[i][j]){      // int x = sc.nextInt();
                    min = arr[i][j];        // min = Math.min(min, x);
                }
            }
            // 가장 작은 카드들 중 가장 큰 것 뽑기
            // answer = Math.max(answer, min);
            if (i == 0){
                answer = min;
            }
            else if (answer <= min){
                answer = min;
            }
        }


        System.out.println(answer);

    }
}