import org.junit.Test;

public class CellTest {
    @Test
    public void testOpen() {
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
        var Cell = new Cell(null);
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
        assert true;
    }
    @Test
    public void testPaintBomb() {

        assert true;
    }
    @Test
    public void testPaintString() {
        assert true;
    }
    @Test
    public void testPaint() {
        assert true;
    }

}
