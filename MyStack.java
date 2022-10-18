class GStack<T>{    //매개변수 T의 제네릭 클래스 선언
    int top;
    Object [] stack;
    public GStack(){    //stack 객체 생성자
        top =0;
        stack =new Object[10];  //객체 배열을 선언
    }
    public void push(T item){
        if(top ==10)
            return;
        stack[top] = item;
        top++;
    }
    public T pop(){
        if(top ==0)
            return null;
        top--;
        return (T) stack[top];
    }
}

public class MyStack {
    public static void main(String[] args) {
        //String형의 새로운 GStack 객체 'stringStack'을 생성
        GStack<String> stringStack = new GStack();
        stringStack.push("seoul");  //세 개의 문자열 입력
        stringStack.push("busan");
        stringStack.push("LA");
        for(int n=0; n<3; n++)  //스택의 값을 세번 pop
            System.out.println(stringStack.pop());

        //Integer형의 새로운 GStack 객체 'intStack'을 생성
        GStack<Integer> intStack = new GStack<Integer>();
        intStack.push(1);   //세 개의 정수값을 입력
        intStack.push(3);
        intStack.push(5);
        for(int n=0; n<3; n++)  //스택의 값을 세번 pop
            System.out.println(intStack.pop());
    }
}
