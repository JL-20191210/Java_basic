package designPatterns.ISP;

import java.awt.*;

/**
 * @author felix
 * @date 2024/5/10 15:33
 */
public class Stereo implements SwitchableDevice, MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("音响播放");
    }

    @Override
    public void turnOn() {
        System.out.println("音响开机");
    }

    @Override
    public void turnOff() {
        System.out.println("音响关机");
    }
}
