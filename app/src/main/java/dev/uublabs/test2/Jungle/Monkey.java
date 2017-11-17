package dev.uublabs.test2.Jungle;

/**
 * Created by Admin on 11/17/2017.
 */

public class Monkey extends Animal
{
    public Monkey()
    {
        super("Monkey");
        setSound("Oooo Oooo Oooo");
    }
    public Monkey(int numAlike, int energy, String sound)
    {
        super(numAlike, energy, sound);
    }

    @Override
    public void eat(String food)
    {
        setEnergy(energy+2);
    }


    @Override
    public void makeSound()
    {
        if (energy>=4) {
            setEnergy(energy - 4);
            System.out.println(sound);
        }
    }

    public void play()
    {
        if(energy >= 8)
        {
            setEnergy(energy-8);
            System.out.println("Oooo Oooo Oooo");
        }
        else
            System.out.println("Monkey is too tired.");
    }
}
