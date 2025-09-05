package decorator;

public class ItalicText extends TextDecorator {
    

    public ItalicText(TextView textView) {
        super(textView);
       
    }

    @Override
    public void performOperation() {
        textView.performOperation();
        System.out.println("Applying italic style.");
    }

    
}
