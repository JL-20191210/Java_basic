package designPattern.principle_.ISP;

/**
 * @author felix
 * @date 2024/5/10 15:35
 * 接口隔离
 */
public class Client {
    public static void main(String[] args) {
        Television television = new Television();

        television.turnOn();
        television.adjustVolume();
        television.turnOff();

        Stereo stereo = new Stereo();
        stereo.turnOff();
        stereo.playMusic();
        stereo.turnOff();
    }
}
