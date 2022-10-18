package model;

public class Bird implements IAnimal
{
    private final int _weight;

    public Bird(int weight)
    {
        _weight = weight;
    }

    @Override
    public int getWeight() { return _weight; }

    @Override
    public String toString()
    {
        return "This is a bird with weight " + _weight + ".";
    }
}
