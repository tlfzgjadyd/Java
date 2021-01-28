package chap05;

import java.util.Scanner;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

class Km2Mile extends Converter{
    Km2Mile(double ratio){
        this.ratio=ratio;
    }
    protected double convert(double src){
        return (src/ratio);
    }
    protected String getSrcString(){
        return "Km";
    }
    protected String getDestString(){
        return "mile";
    }
}
public class D_Km2Mile {
    public static void main(String[] args) {
        Km2Mile toMile = new Km2Mile(1.6); //1마일은 1.6km
        toMile.run();
    }
}
