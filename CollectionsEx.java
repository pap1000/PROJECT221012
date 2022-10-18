import java.util.*;

public class CollectionsEx {
    static void printList(LinkedList<String> l){    //컬렉션을 받아 Iterator로 출력
        Iterator<String> iterator = l.iterator();
        while (iterator.hasNext()) {    //다음 문자열이 없을 때까지
            String e = iterator.next();
            String separator;
            if (iterator.hasNext()) //문자열이 존재하하면
                separator = "->";
            else                    //문자열이 없다면
                separator = "\n";
            System.out.print(e+separator);
        }
    }

    public static void main(String[] args){
        LinkedList<String> myList = new LinkedList<String>();   //LinkedList 컬렉션 생성 후 문자열 입력
        myList.add("트랜스포머");
        myList.add("스타워즈");
        myList.add("매트릭스");
        myList.add(0,"터미네이터");
        myList.add(2,"아바타");

        Collections.sort(myList);       //컬렉션 내부의 요소 정렬
        printList(myList);              //정렬된 요소 출력
        Collections.reverse(myList);    //요소의 순서를 반대로
        printList(myList);              //반대로 정렬된 요소 출력

        int index = Collections.binarySearch(myList, "아바타") + 1;    //이진탐색을 통해 해당 문자열의 인덱스값을 구함
        System.out.println("아바타는 " + index + "번째 요소입니다.");
    }
}
