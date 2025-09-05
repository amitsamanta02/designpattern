package decorator;

public abstract class TextDecorator implements TextView {
    
    protected TextView textView;
    
    public TextDecorator(TextView textView) {
        this.textView = textView;
    }
    
    @Override
    public void performOperation() {
        textView.performOperation();
    }
}