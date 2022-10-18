package model;

public class Pig implements IAnimal
{
        private final int _weight;

        public Pig(int weight)
        {
                _weight = weight;
        }

        @Override
        public int getWeight() { return _weight; }

        @Override
        public String toString()
        {
                return "This is a pig with weight " + _weight + ".";
        }
}
