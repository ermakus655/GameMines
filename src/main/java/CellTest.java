import org.junit.Test;

public class CellTest {
    @Test
    public void testOpen() {
    }

    public void testMine() {
    }

    public void testSetCountBomb() {
    }

    public void testGetCountBomb() {
    }

    public void testIsNotOpen() {
    }

    @Test
    public void testIsMined() {
        var cell = new Cell(new GameMines());
        cell.mine();
        assert cell.isMined();
    }

    public void testInverseFlag() {
    }

    public void testPaintBomb() {
    }

    public void testPaintString() {
    }

    public void testPaint() {
    }
}
