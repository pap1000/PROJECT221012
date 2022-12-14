import java.util.*;

public class ex02 {
    public static void main(String[] args){
        ArrayList<Character> grade = new ArrayList<Character>();    //Character 타입의 ArrayList를 생성
        Scanner scanner = new Scanner(System.in);
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");

        for(int i=0; i<6; i++) {    //ArrayList에 학점을 저장
            char gr = scanner.next().charAt(0);
            grade.add(gr);
        }
        int sum=0;
        //모든 학점의 합을 구함
        for(int i=0; i<6; i++) {
            char c = grade.get(i);
            switch(c) {
                case 'A':
                    sum+=4;
                    break;
                case 'B':
                    sum+=3;
                    break;
                case 'C':
                    sum+=2;
                    break;
                case 'D':
                    sum+=1;
                    break;
                case 'F':
                    sum+=0;
                    break;
            }
        }

        double average = (double)sum/6;
        System.out.println(average);
        scanner.close();
    }
}
