import junit.framework.TestCase;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class GameMinesTest extends TestCase {

    public void testOpenCells() {
    }

    @Test
    public void testInitField() {
        var mockedGame = mock(GameMines.class);
        doNothing().when(mockedGame).initUI();
        mockedGame.initField();
        assert true;
    }
}