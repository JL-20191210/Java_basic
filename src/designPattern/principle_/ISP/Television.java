package designPattern.principle_.ISP;

/**
 * @author felix
 * @date 2024/5/10 15:27
 */
public class Television implements SwitchableDevice,VolumeAdjustableDevice{
    @Override
    public void turnOn() {
        System.out.println("电视开机");
    }

    @Override
    public void turnOff() {
        System.out.println("电视关机");
    }

    @Override
    public void adjustVolume() {
        System.out.println("电视调节音量");
    }
}
