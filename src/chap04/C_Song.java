package chap04;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

public class C_Song {
    String title;
    String artist;
    int year;
    String country;
    C_Song(){
        this.title="미정";
        this.artist="미정";
        this.year=0;
        this.country="미정";
    }

    C_Song(String title, String artist, int year, String country){
        this.title=title;
        this.artist=artist;
        this.year=year;
        this.country=country;
    }

    void show(){
        System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
    }
}
