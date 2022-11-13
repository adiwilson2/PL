package wilson_adeline;

import javax.swing.text.BadLocationException;
import java.util.NoSuchElementException;

public class CustomExceptions extends RuntimeException{
    public static class NotInRange extends Throwable{
        public NotInRange(){super();}
    }

    public static class EnteredString extends NoSuchElementException {
        public EnteredString(){super();}
    }

    public static class WrongLocation extends Throwable{
        public WrongLocation(){super();}
    }

    public static class WrongSelection extends Throwable {
        public WrongSelection(){super();}
    }
}
