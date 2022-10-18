public class GenericMethodExample {
    public static <T> GStack<T> reverse(GStack<T> a) {  //T를 매개 변수로 가지는 제네릭 메소드
        GStack<T> s = new GStack<T>(); //T를 타입으로 하는 GStack 's' 생성
        while (true) {
            T tmp;
            tmp = a.pop(); //s에서 pop
            if (tmp==null) //스택이 빈 경우
                break;
            else
                s.push(tmp); //스택에 요소를 저장
        }
        return s; //스택을 반환
    }

    public static void main(String[] args) {
        GStack<Double> gs = new GStack<Double>();   //Double형의 Gstack 객체 'gs'를 생성
        for (int i=0; i<5; i++) {   //gs에 int형 i값을 double형으로 변환하여 push
            gs.push((double)i);
        }

        gs = reverse(gs);   //반대로 정렬
        for (int i=0; i<5; i++) {   //gs에서 5개의 값을 모두 pop하여 출력
            System.out.println(gs.pop());
        }
    }
}
