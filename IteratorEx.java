import java.util.*;

public class IteratorEx {
    public static void main(String[] args){
        Vector<Integer> v = new Vector();   //정수값의 제네릭 벡터 생성
        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2, 100);

        Iterator<Integer> it = v.iterator();    //Iterator로 벡터의 모든 정수 출력
        while(it.hasNext()){    //방문할 요소가 남았을 경우 반복
            int n = it.next();
            System.out.println(n);  //정수를 출력
        }

        int sum = 0;
        it = v.iterator();
        while(it.hasNext()){    //방문할 요소가 남았을 경우 반복
            int n = it.next();
            sum += n;   //합을 구함
        }

        System.out.println("벡터에 있는 정수 합 : " + sum);
    }
}
