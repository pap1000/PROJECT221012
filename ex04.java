import java.util.*;

public class ex04 {
    public static void main(String[] args){
        Vector<Integer> stack = new Vector<Integer>();  //Integer형의 vector를 생성
        Scanner scanner = new Scanner(System.in);

        while(true) {   //0 입력 전까지 무한루프
            System.out.print("강수량 입력 (0 입력시 종료)>>");
            int rainfall = scanner.nextInt();
            if(rainfall == 0) break;
            stack.add(rainfall);

            int sum =0;
            for(int i=0; i < stack.size(); i++) {
                System.out.print(stack.get(i)+" ");
                sum += stack.get(i);
            }

            System.out.println();
            int average = sum/stack.size();
            System.out.println("현재 평균 "+average);
        }

        scanner.close();
    }
}