package dev.uublabs.test2.Jungle;

abstract class Animal
{
    int numAlike;
    int energy;
    String sound;
    String kind;

    public Animal(String type)
    {
        numAlike=0;
        energy =0;
        sound ="";
        kind = type;
    }
    public Animal(int numAlike, int energy, String sound)
    {
        this.numAlike = numAlike;
        this.energy = energy;
        this.sound = sound;
    }

    public Animal(int numAlike, int energy)
    {
        this.numAlike = numAlike;
        this.energy = energy;
    }

    public void eat(String food)
    {
        setEnergy(energy+5);
        System.out.println("Munch Munch Munch");
    }
    public void sleep()
    {
        setEnergy(energy + 10);
        System.out.println("Zzzzzzzzzzzzzzz");
    }
    public void play()
    {

    }
    public void makeSound()
    {
        if (energy>=3) {
            setEnergy(energy - 3);
            System.out.println(sound);
        }
        else
        {
            System.out.println("Too tired to make a sound.");
        }
    }


    public void getNumAlike(String type)
    {
        System.out.println(type+": "+numAlike);
    }

    public void setNumAlike(int numAlike) {
        this.numAlike = numAlike;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
