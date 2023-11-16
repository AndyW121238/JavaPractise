package Homework06;

public class PingpongPlayer extends Player implements SpeakEnglish{
    public PingpongPlayer() {
    }

    public PingpongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("乒乓球运动员学习乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员说英语");
    }
}
