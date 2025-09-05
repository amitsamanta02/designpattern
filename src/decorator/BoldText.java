package decorator;

public class BoldText extends TextDecorator{
    public BoldText(TextView textView) {
        super(textView);
    }

    @Override
    public void performOperation(){

        textView.performOperation();
        System.out.println("Bold operations is performs");
    }
}
