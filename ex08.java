import java.util.*;

public class ex08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> ScoreBoard = new HashMap<>();
        System.out.println("** 포인트 관리 프로그램입니다 **");
        while(true) {
            System.out.print("이름과 포인트 입력 >> ");
            String name = scanner.next();
            if(name.equals("그만")) break;    //그만 입력 시 break
            int point = scanner.nextInt();
            ScoreBoard.merge(name, point, Integer::sum);    //같은 key일 경우 합을 입력
            Set<String> key = ScoreBoard.keySet();
            for (String people : key) { //key가 빌 때까지 대해 이름과 점수 출력
                Integer sum = ScoreBoard.get(people);
                System.out.print("(" + people + "," + sum + ")");
            }
            System.out.println();
        }
        scanner.close();
    }
}
