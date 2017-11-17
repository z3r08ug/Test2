package dev.uublabs.test2.Jungle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jungle
{
    List<Animal> animals;

    public Jungle()
    {
        animals = new ArrayList<>();
    }
    public void addAnimal(Animal a)
    {
        animals.add(a);

        int monkeys = 0;
        int tigers = 0;
        int snakes = 0;
        for (Animal animal : animals)
        {

            if(animal.getKind().equals("Monkey")) {
                monkeys++;
            }
            if(animal.getKind().equals("Snake")) {
                snakes++;
            }
            if(animal.getKind().equals("Tiger")) {
                tigers++;
            }
        }
        for (Animal animal : animals)
        {
            if(animal.getKind().toString().equals("Monkey"))
                animal.setNumAlike(monkeys);
            if(animal.getKind().equals("Snake"))
                animal.setNumAlike(snakes);
            if(animal.getKind().equals("Tiger"))
                animal.setNumAlike(tigers);
        }
    }
    public void soundOff()
    {

        System.out.println("Sound OFF!");
        for(Animal a : animals)
        {
            a.makeSound();
            System.out.println("Energy: "+a.getEnergy());
        }
    }

    public void rollCall()
    {
        for (Animal a : animals)
        {
            a.getNumAlike(a.getKind());
        }
    }

    public void sleep()
    {
        for(Animal a : animals)
            a.sleep();
    }

    public void eatGrain()
    {
        for(Animal a : animals)
        {
            a.eat("grain");
        }
    }

    public void eatFish()
    {
        for(Animal a : animals)
        {
            a.eat("fish");
        }
    }

    public void eatMeat()
    {
        for(Animal a : animals)
        {
            a.eat("meat");
        }
    }
    public void eatBugs()
    {
        for(Animal a : animals)
        {
            a.eat("bugs");
        }
    }

    public void randomAction()
    {
        Random r = new Random();
        int rand = r.nextInt(7 - 1) + 1;

        for (Animal a : animals)
        {
            switch (rand)
            {
                case 1:
                    a.eat("grain");
                    break;
                case 2:
                    a.sleep();
                    break;
                case 3:
                    a.makeSound();
                    break;
                case 4:
                    a.play();
                    break;
                case 5:
                    a.eat("meat");
                    break;
                case 6:
                    a.eat("bugs");
                    break;
                case 7:
                    a.eat("fish");
                    break;
            }
        }

    }
}
