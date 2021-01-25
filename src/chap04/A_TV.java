package chap04;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

public class A_TV {
    String company;
    int year;
    int inch;
    A_TV(String company, int year, int inch){
        this.company = company;
        this.year = year;
        this.inch = inch;
    }

    void show(){
        System.out.println(company+"에서 만든 "+year+"년 "+inch+"인치 Tv");
    }
}