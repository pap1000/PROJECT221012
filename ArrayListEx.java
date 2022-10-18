import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();  //문자열의 ArrayList 컬렉션 생성
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) { //4개의 문자열을 입력받음
            System.out.print("이름을 입력하세요>>");
            String s = scanner.next();
            a.add(s);   //ArrayList에 삽입
        }

        for (int i = 0; i < a.size(); i++) {    //ArrayList의 모든 이름 출력
            String name = a.get(i);
            System.out.print(name + " ");
        }

        int longest = 0;
        for (int i = 1; i < a.size(); i++) {  //가장 긴 이름을 찾아서 인덱스값을 저장
            if (a.get(longest).length() < a.get(i).length())
                longest = i;
        }

        System.out.println("\n가장 긴 이름은 : " + a.get(longest));  //가장 긴 이름을 출력
        scanner.close();
    }
}