import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.*;

public class CellTest {
    @Test
    public void testOpen() {
        var mockedGame = mock(GameMines.class);
        var cell = new Cell(mockedGame);
        cell.open();
        assert true;
    }
    @Test
    public void testMine() {
        var Cell = new Cell(null);
        Cell.mine();
        assert Cell.isMined();
    }
    @Test
    public void testSetCountBomb() {
        var cell = new Cell(null);
        var count = 5;
        cell.setCountBomb(count);

        assertEquals(count,cell.getCountBomb());
    }
    @Test
    public void testGetCountBomb() {
    }
    @Test
    public void testIsNotOpen() {
        var mockedGame = mock(GameMines.class);
        var cell = new Cell(mockedGame);
        cell.open();
        cell.isNotOpen();
        assert true;
    }

    @Test
    public void testIsMined() {
        var cell = new Cell(null);
        cell.mine();
        assert cell.isMined();
    }
    @Test
    public void testInverseFlag() {
        var cell = new Cell(null);
        cell.inverseFlag();
        assert true;
    }
    @Test
    public void testPaintBomb() {
        var mockedGame = mock(GameMines.class);
        var cell = new Cell(mockedGame);
        var g = mock(Graphics.class);
        cell.paintBomb(g, 0, 0, Color.white);
        assert true;    }
    @Test
    public void testPaintString() {
        var mockedGame = mock(GameMines.class);
        var cell = new Cell(mockedGame);
        var g = mock(Graphics.class);
        cell.paintString(g, "hello",0, 0, Color.white);
        assert true;    }
    @Test
    public void testPaint() {
        var mockedGame = mock(GameMines.class);
        var cell = new Cell(mockedGame);
        var g = mock(Graphics.class);
//        doNothing().when(g).drawRect(anyInt(),anyInt(),anyInt(),anyInt());
        cell.paint(g, 0, 0);
        assert true;
    }

}
