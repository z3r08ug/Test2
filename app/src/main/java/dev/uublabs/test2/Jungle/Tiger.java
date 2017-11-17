package dev.uublabs.test2.Jungle;

/**
 * Created by Admin on 11/17/2017.
 */

public class Tiger extends Animal
{

    public Tiger()
    {
        super("Tiger");
        setSound("Rawr");
    }
    public Tiger(int numAlike, int energy, String sound)
    {
        super(numAlike, energy, sound);
    }

    @Override
    public void eat(String food)
    {
        if(food.equalsIgnoreCase("grain"))
        {
            System.out.println("Tigers cannot eat grain");
        }
        else
        {
            super.eat(food);
        }
    }

    @Override
    public void sleep()
    {
        setEnergy(energy+5);
    }
}
