package decorator;

public class DecoratorMain {
    
    public static void main(String[] args) {

        System.err.println("******Normal Text********");
        TextView normalText = new NormalText();
        normalText.performOperation();
        
       // System.err.println("Normal Text with Italic");
        /***
         *  Applying Italic text on top of normal text.
         */
        System.err.println("******Italic Text********");
        TextView italicText = new ItalicText(normalText);
        italicText.performOperation();

        /***
         * On top of Italic , bold operation is performed.
         */
        System.err.println("****** Bold Text********");
        TextView boldItalicText = new BoldText(italicText);
        boldItalicText.performOperation();


    }

}
