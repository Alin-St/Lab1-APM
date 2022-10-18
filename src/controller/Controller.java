package controller;

import model.IAnimal;
import repository.IAnimalRepository;

import java.util.ArrayList;

public class Controller
{
    private final IAnimalRepository _repository;

    public Controller(IAnimalRepository repository)
    {
        _repository = repository;
    }

    public void addAnimal(IAnimal animal) throws Exception
    {
        _repository.save(animal);
    }

    public void removeAnimal(IAnimal animal) throws Exception
    {
        for (int i = 0; i < _repository.getSize(); ++i)
        {
            if (_repository.read(i) == animal) {
                _repository.erase(i);
                return;
            }
        }
    }

    public ArrayList<IAnimal> getAllAnimals() throws Exception
    {
        ArrayList<IAnimal> result = new ArrayList<>();

        for (int i = 0; i < _repository.getSize(); ++i)
            result.add(_repository.read(i));

        return result;
    }

    public ArrayList<IAnimal> getAllAnimalsWithWeight(int minWeight, int maxWeight) throws Exception
    {
        ArrayList<IAnimal> result = new ArrayList<>();

        for (IAnimal animal : getAllAnimals())
        {
            if ((minWeight < 0 || animal.getWeight() >= minWeight) && (maxWeight < 0 || animal.getWeight() <= maxWeight))
                result.add(animal);
        }

        return result;
    }
}
