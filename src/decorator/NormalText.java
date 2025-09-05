package decorator;

public class NormalText implements TextView {

    
    @Override
    public void performOperation() {
        System.out.println("Performing normal text operation.");
    }   

    
}
