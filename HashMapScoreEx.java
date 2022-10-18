import java.util.*;

public class HashMapScoreEx {
    public static void main(String[] args){
        HashMap<String, Integer> javaScore = new HashMap(); //HashMap을 생생하여 사용자 name과 score를 저장
        javaScore.put("김성동", 97);   //5명의 기록을 저장
        javaScore.put("황기태", 88);
        javaScore.put("김남윤", 98);
        javaScore.put("이재문", 70);
        javaScore.put("한원선", 99);
        System.out.println("HashMap의 요소 개수 :" + javaScore.size());  //요소의 개수를 출력

        Set<String> keys = javaScore.keySet();  //javaScore의 모든 키값을 keys에 저장
        Iterator<String> it = keys.iterator();  //Iterator를 이용하여 모든 키값을 출력

        while(it.hasNext()){
        String name = it.next();    //다음 키값을 읽음
        int score = javaScore.get(name);    //읽은 키값의 value를 반환 후 출력
        System.out.println(name + " : " + score);
    }
}
}