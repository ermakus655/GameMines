import junit.framework.TestCase;
import org.junit.Test;

public class GameMinesTest extends TestCase {

    public void testOpenCells() {
    }

    @Test
    public void testInitField() {
        var game = new GameMines();
        game.initField();
        assert true;
    }
}