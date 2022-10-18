import java.util.*;

public class WordQuizVer2 {
    public static void main(String[] args){
        int number_word = 10;
        Scanner scanner = new Scanner(System.in);
        Vector<Word> word = new Vector<>();
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

        System.out.println("\"명품영어\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다. -2를 입력하면 단어를 추가합니다.\n");
        System.out.println("현재 10개의 단어가 들어있습니다.");

        while(true) {
            int[] quiz = random(number_word);
            int answer = ((int) (Math.random() * 4));
            Word w = word.get(quiz[answer]);
            String eng = w.getEng();
            String kr = w.getKr();

            System.out.println(eng + "?");
            System.out.println("(1)" + word.get(quiz[0]).getKr() + " (2)" + word.get(quiz[1]).getKr()
                    + " (3)" + word.get(quiz[2]).getKr() + " (4)" + word.get(quiz[3]).getKr() + " :>");
            int s = scanner.nextInt();
            if(s==-1) break;
            if(s==-2) {
                System.out.print("영단어와 한국어를 차례로 띄어서 입력하십시오. ");
                String s1 = scanner.next();
                String s2 = scanner.next();
                word.add(new Word(s1, s2));
                System.out.print("단어를 추가하였습니다.\n");
                number_word++;
                continue;
            }
            if(Objects.equals(kr, word.get(quiz[s - 1]).getKr()))
                System.out.print("Exellent !!\n");
            else
                System.out.print("No. !!\n");
        }
        System.out.print("\"명품영어\"를 종료합니다...");
    }

    public static int[] random(int n){
        int count = 0;
        int[] a = {0, 0, 0, 0};
        while(count!=4){
            a[count] = (int) (Math.random() * n);
            for(int i=0; i<4; i++){
                if(a[count]==a[i])
                    break;
            }
            count++;
        }
        return a;
    }
}