package Homework06;

public class PIngpongCoach extends Coach implements SpeakEnglish{
    public PIngpongCoach() {
    }

    public PIngpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教学乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练说英语");
    }
}
