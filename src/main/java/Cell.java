import java.awt.*;

class Cell {
    private final GameMines gameMines;
    private int countBombNear;
    private boolean isOpen, isMine, isFlag;

    public Cell(GameMines gameMines) {
        this.gameMines = gameMines;
    }

    void open() {
        isOpen = true;
        gameMines.bangMine = isMine;
        if (!isMine) gameMines.countOpenedCells++;
    }

    void mine() {
        isMine = true;
    }

    void setCountBomb(int count) {
        countBombNear = count;
    }

    int getCountBomb() {
        return countBombNear;
    }

    boolean isNotOpen() {
        return !isOpen;
    }

    boolean isMined() {
        return isMine;
    }

    void inverseFlag() {
        isFlag = !isFlag;
    }

    void paintBomb(Graphics g, int x, int y, Color color) {
        g.setColor(color);
        g.fillRect(x * gameMines.BLOCK_SIZE + 7, y * gameMines.BLOCK_SIZE + 10, 18, 10);
        g.fillRect(x * gameMines.BLOCK_SIZE + 11, y * gameMines.BLOCK_SIZE + 6, 10, 18);
        g.fillRect(x * gameMines.BLOCK_SIZE + 9, y * gameMines.BLOCK_SIZE + 8, 14, 14);
        g.setColor(Color.white);
        g.fillRect(x * gameMines.BLOCK_SIZE + 11, y * gameMines.BLOCK_SIZE + 10, 4, 4);
    }

    void paintString(Graphics g, String str, int x, int y, Color color) {
        g.setColor(color);
        g.setFont(new Font("", Font.BOLD, gameMines.BLOCK_SIZE));
        g.drawString(str, x * gameMines.BLOCK_SIZE + 8, y * gameMines.BLOCK_SIZE + 26);
    }

    void paint(Graphics g, int x, int y) {
        g.setColor(Color.lightGray);
        g.drawRect(x * gameMines.BLOCK_SIZE, y * gameMines.BLOCK_SIZE, gameMines.BLOCK_SIZE, gameMines.BLOCK_SIZE);
        if (!isOpen) {
            if ((gameMines.bangMine || gameMines.youWon) && isMine) paintBomb(g, x, y, Color.black);
            else {
                g.setColor(Color.lightGray);
                g.fill3DRect(x * gameMines.BLOCK_SIZE, y * gameMines.BLOCK_SIZE, gameMines.BLOCK_SIZE, gameMines.BLOCK_SIZE, true);
                if (isFlag) paintString(g, gameMines.SIGN_OF_FLAG, x, y, Color.red);
            }
        } else if (isMine) paintBomb(g, x, y, gameMines.bangMine ? Color.red : Color.black);
        else if (countBombNear > 0)
            paintString(g, Integer.toString(countBombNear), x, y, new Color(gameMines.COLOR_OF_NUMBERS[countBombNear - 1]));
    }
}
