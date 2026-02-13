package sudoku.uicustom.button;

import javax.swing.*;

public class CheckGameStatusButton extends JButton {

    public CheckGameStatusButton() {
        this.setText("Verificar jogo");
        this.addActionListener(actionListener);
    }
}
