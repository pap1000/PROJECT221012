import java.util.*;

class Word{
    public String eng, kr;
    public Word(String eng, String kr){
        this.eng = eng;
        this.kr = kr;
    }

    public String getEng() {
        return eng;
    }
    public String getKr(){
        return kr;
    }
}

public class WordQuiz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Vector<Word> word = new Vector();
        word.add(new Word("university", "대학"));
        word.add(new Word("freshman", "신입생"));
        word.add(new Word("study", "학업"));
        word.add(new Word("computer", "컴퓨터"));
        word.add(new Word("student", "학생"));
        word.add(new Word("course", "강좌"));
        word.add(new Word("artificial", "인공의"));
        word.add(new Word("error", "오류"));
        word.add(new Word("book", "책"));
        word.add(new Word("blackboard", "칠판"));

        System.out.println("\"명품영어\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.\n");
        System.out.println("현재 10개의 단어가 들어있습니다.");

        while(true) {
            int[] quiz = random();
            int answer = ((int) (Math.random() * 4));
            Word w = word.get(quiz[answer]);
            String eng = w.getEng();
            String kr = w.getKr();

            System.out.println(eng + "?");
            System.out.println("(1)" + word.get(quiz[0]).getKr() + " (2)" + word.get(quiz[1]).getKr()
                    + " (3)" + word.get(quiz[2]).getKr() + " (4)" + word.get(quiz[3]).getKr() + " :>");
            int s = scanner.nextInt();
            if(s==-1) break;
            if(kr==word.get(quiz[s-1]).getKr())
                System.out.print("Exellent !!\n");
            else
                System.out.print("No. !!\n");
        }
        System.out.print("\"명품영어\"를 종료합니다...");
    }

    public static int[] random(){
        int count = 0;
        int[] a = {0, 0, 0, 0};
        while(count!=4){
            a[count] = (int) (Math.random() * 10);
            for(int i=0; i<4; i++){
                if(a[count]==a[i])
                    continue;
            }
            count++;
        }
        return a;
    }
}
