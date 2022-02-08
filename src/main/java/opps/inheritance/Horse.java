package opps.inheritance;

public class Horse {
    public String identifyYourSelf(){
        return "I am a Horse";
    }
}

interface Flyer{
    default public String identifyYourSelf(){
        return "I am a Flyer";
    }
}

interface Mythical{
    default public String identifyYourSelf(){
        return "I am a mythical creature.";
    }
}

class Animal implements Flyer, Mythical{
    public static void main(String[] args) {
        Mythical f= new Animal();
        System.out.println( f.identifyYourSelf());
    }

    @Override
    public String identifyYourSelf() {
        return Flyer.super.identifyYourSelf();
    }
}
