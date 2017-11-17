package dev.uublabs.test2.Jungle;

public class JungleTest
{
    public static void main(String[]args)
    {
        Jungle j = new Jungle();
        j.addAnimal(new Snake());
        j.addAnimal(new Snake());
        j.addAnimal(new Snake());
        j.addAnimal(new Monkey());
        j.addAnimal(new Monkey());
        j.addAnimal(new Tiger());
        j.addAnimal(new Tiger());
        j.addAnimal(new Tiger());
        j.addAnimal(new Tiger());
        j.addAnimal(new Tiger());

        j.sleep();

        j.rollCall();

        j.soundOff();

        j.randomAction();
    }
}
