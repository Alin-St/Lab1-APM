package repository;

import model.IAnimal;

public class AnimalsRepository implements IAnimalRepository
{
    static final int REPOSITORY_SIZE = 420;

    private final IAnimal[] _animals = new IAnimal[REPOSITORY_SIZE];
    private int _count = 0;

    @Override
    public int getSize() throws Exception  { return _count; }

    public void save(IAnimal animal) throws Exception
    {
        if (animal == null)
            throw new Exception("The given animal is null.");

        if (_count == REPOSITORY_SIZE)
            throw new Exception("Repository full.");

        _animals[_count] = animal;
        _count++;
    }

    public IAnimal read(int index) throws Exception
    {
        if (index < 0 || index >= _count)
            throw new Exception("Index out of range");

        return _animals[index];
    }

    @Override
    public void erase(int index) throws Exception
    {
        _animals[index] = null;

        for (int i = index + 1; i < _count; ++i)
            _animals[i - 1] = _animals[i];

        _count--;
    }
}
