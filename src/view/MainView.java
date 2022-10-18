package view;

import controller.Controller;
import model.Bird;
import model.Cow;
import model.IAnimal;
import model.Pig;

public class MainView
{
    private final Controller _controller;

    public MainView(Controller controller)
    {
        _controller = controller;
    }

    public void run() throws Exception
    {
        System.out.println("Adding a bird with weight 2.");
        _controller.addAnimal(new Bird(2));

        System.out.println("Adding a cow with weight 500.");
        Cow cow = new Cow(500);
        _controller.addAnimal(cow);

        System.out.println("Adding a pig with weight 400.");
        _controller.addAnimal(new Pig(400));

        System.out.println();

        System.out.println("Printing all animals.");
        for (IAnimal animal : _controller.getAllAnimals())
            System.out.println(animal.toString());

        System.out.println();

        System.out.println("Printing all animals with weight greater than 3.");
        for (IAnimal animal : _controller.getAllAnimalsWithWeight(4, -1))
            System.out.println(animal.toString());

        System.out.println();

        System.out.println("Removing the cow.");
        _controller.removeAnimal(cow);

        System.out.println();

        System.out.println("Printing all animals.");
        for (IAnimal animal : _controller.getAllAnimals())
            System.out.println(animal.toString());

        System.out.println();

        System.out.println("Printing all animals with weight greater than 3.");
        for (IAnimal animal : _controller.getAllAnimalsWithWeight(4, -1))
            System.out.println(animal.toString());
    }
}
