package designPattern.proxy_.proxy02;

//游戏者接口
public interface IGamePlayer {

    //登录
    void login(String user,String password);

    //游戏
    void killBoss();

    //升级
    void upgrade();
}
