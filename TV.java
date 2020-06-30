package JavaClass;

public class TV {
    int channel;

    public TV() {}

    public TV(int intValue) {
        this.channel = intValue;
    }

    public void channelUp() {
        channel = channel + 1;

    }

    public void channelDown() {
        channel = channel - 1;
        if (channel <0){
            channel = 0;
        }
    }

    public static void main(String args[]) {
        TV objTV = new TV(11);
        System.out.println("현재 채널은 " + objTV.channel + "번입니다.");
    }
}