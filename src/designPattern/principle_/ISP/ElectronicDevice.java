package designPatterns.ISP;

/**
 * @author felix
 * @date 2024/5/10 15:23
 *
 * 被拆的接口
 */
public interface ElectronicDevice {

    void turnOn();

    void turnOff();

    void adjustVolume();

    void playMusic();
}
