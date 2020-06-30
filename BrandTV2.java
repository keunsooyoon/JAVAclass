package JavaClass;

public class BrandTV2 extends TV2 {
    
    String brand;

    public BrandTV2(int intValue, String strValue) {
        super.channel = intValue;
        this.brand = strValue;
    }

    public static void main(String args[]) {
        BrandTV2 objTV = new BrandTV2(11, "삼성TV");
        objTV.channelUp();
      //  objTV.channelDown();
        System.out.println(objTV.brand + " 현재 채널은 " + objTV.channel + "번입니다.");
    }
}