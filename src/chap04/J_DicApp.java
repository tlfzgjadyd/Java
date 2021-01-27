package chap04;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

import java.util.Scanner;
class Dictionary{
    private static String [] kor = {"사람", "아기", "돈", "미래", "희망"};
    private static String [] eng = {"love", "baby", "money", "future", "hope"};
    public static String kor2Eng(String word){
        if(word.equals("그만"))
            System.exit(0);

        int findNum=-1;
        for(int i=0;i<kor.length;i++)
        {
            if(kor[i].equals(word))
                findNum=i;
        }
        if(findNum==-1)
            return null;
        else
            return eng[findNum];
            /* 검색 코드 작성*/}
}
public class J_DicApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();
        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true) {
            System.out.print("한글 단어?");
            String word = sc.next();
            String res = dictionary.kor2Eng(word);
            if (res == null)
                System.out.println(word + "는 저의 사전에 없습니다.");
            else
                System.out.println(word + "은 " + res);
        }
    }
}
