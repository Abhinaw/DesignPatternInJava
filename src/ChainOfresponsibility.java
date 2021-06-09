import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfresponsibility
{
    private static final Logger logger = Logger.getLogger(ChainOfresponsibility.class.getName());
    public static void main(String[] args)
    {
        logger.setLevel(Level.FINER);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.FINER);
        logger.addHandler(handler);
        logger.finest("Finest");
        logger.finer("Finer");
        logger.fine("Fine");
    }
}
