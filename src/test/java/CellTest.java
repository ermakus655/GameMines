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
    @Test
    public void testIsNotOpen() {
        var Cell = new Cell(null);
        Cell.isNotOpen();
        assert Cell.isNotOpen();
    }

    @Test
    public void testIsMined() {
        var cell = new Cell(null);
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
