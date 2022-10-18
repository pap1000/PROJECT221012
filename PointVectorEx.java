import java.util.Vector;

class Point{
    private int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}

public class PointVectorEx {
    public static void main(String[] args){
        Vector<Point> v = new Vector<Point>();  //객체 Point를 요소로 가지는 벡터 생성 후 객체 삽입
        v.add(new Point(2, 3));
        v.add(new Point(-5, 20));
        v.add(new Point(30, -8));
        v.remove(1);    //인덱스 1번의 값을 삭제

        for(int i=0; i<v.size(); i++){  //벡터의 모든 객체 출력하기
            Point p = v.get(i); //벡터의 i번째 벡터 p
            System.out.println(p);
        }
    }
}