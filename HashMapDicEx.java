import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {
    public static void main(String[] args){
        HashMap<String, String> dic = new HashMap<>();  //단어를 한글과 영어로 쌍을 이뤄 저장하는 Hashmap 컬렉션 생성
        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");

        Scanner scanner = new Scanner(System.in);
        while(true){    //exit을 입력하기 전까지 반복
            System.out.print("찾고 싶은 단어는?");
            String eng = scanner.next();    //찾고자 하는 영단어를 입력
            if(eng.equals("exit")){
                System.out.println("종료합니다...");
                break;
            }
            String kr = dic.get(eng);   //입력한 영단어를 key로 가진 value를 반환
            if(kr==null)
                System.out.println(eng + "는 없는 단어입니다.");
            else
                System.out.println(kr);
        }
        scanner.close();
    }
}
