import controller.Controller;
import repository.AnimalsRepository;
import repository.IAnimalRepository;
import view.MainView;

public class Program {

    public static void main(String[] args) throws Exception
    {
        IAnimalRepository repository = new AnimalsRepository();
        Controller controller = new Controller(repository);
        MainView mainView = new MainView(controller);

        mainView.run();
    }
}
