package chap04;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

public class B_Grade {
    int math;
    int science;
    int english;

    B_Grade(int math, int science, int english){
        this.math = math;
        this.science = science;
        this.english = english;
    }

    int average(){
        return ((math+science+english)/3);
    }
}
