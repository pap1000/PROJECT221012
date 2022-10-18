import java.util.*;

class Student{
    int id;
    String tel;
    public Student(int id, String tel){
        this.id = id;
        this.tel = tel;
    }
    public int getID(){
        return id;
    }
    public String getTEL(){
        return tel;
    }
}

public class HashMapStudentEx {
    public static void main(String[] args){
        HashMap<String, Student> map = new HashMap<String, Student>();  //HashMap 컬렉션 생성 후 이름과 Student 객체를 저장
        map.put("황기태", new Student(1, "010-111-1111"));
        map.put("이재문", new Student(2, "010-222-2222"));
        map.put("김남윤", new Student(3, "010-333-3333"));

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("검색할 이름?");
            String name = scanner.nextLine();
            if(name.equals("exit")) //exit 입력 시 종료
                break;
            Student student = map.get(name);    //이름으로 검색 후 student 객체를 출력
            if(student == null)
                System.out.println(name + "은 없는 사람입니다.");
            else
                System.out.println("id:" + student.getID() + ", 전화:" + student.getTEL());   //메소드 호출
        }
        scanner.close();
    }
}
