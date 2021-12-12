import org.junit.Test;

public class CellTest {
    @Test
    public void testOpen() {
        var cell = new Cell(null);
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
        assert true;
    }
    @Test
    public void testGetCountBomb() {
        var cell = new Cell(null);
        assert true;
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
    @Test
    public void testInverseFlag() {
        var cell = new Cell(null);
        assert true;
    }
    @Test
    public void testPaintBomb() {
        var cell = new Cell(null);
        assert true;
    }
    @Test
    public void testPaintString() {
        var cell = new Cell(null);
        assert true;
    }
    @Test
    public void testPaint() {
        var cell = new Cell(null);
        assert true;
    }

}
