package chap05;

/*작업폴더, 프로젝트명 등이 문제에서 하라고 한것과 다르므로 주의*/

class IPTV extends ColorTV{
    private String ip;
    IPTV(String ip, int size, int color){
        super(size, color);
        this.ip = ip;
    }
    public String getIp(){return ip;}
    public void printProperty(){
        System.out.print("\""+ip+"\" 주소에 "+getSize()+"인치, "+getColor()+" 컬러");
    }
}

public class B_IPTV {
    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}
