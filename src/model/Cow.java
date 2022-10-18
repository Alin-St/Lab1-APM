package model;

public class Cow implements IAnimal
{
    private final int _weight;

    public Cow(int weight)
    {
        _weight = weight;
    }

    @Override
    public int getWeight() { return _weight; }

    @Override
    public String toString()
    {
        return "This is a cow with weight " + _weight + ".";
    }
}
