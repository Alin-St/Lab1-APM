package repository;

import model.IAnimal;

public interface IAnimalRepository
{
    public int getSize() throws Exception;
    public void save(IAnimal animal) throws Exception;
    public IAnimal read(int index) throws Exception;
    public void erase(int index) throws Exception;
}
