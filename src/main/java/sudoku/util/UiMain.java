package sudoku.util;

import sudoku.uicustom.frame.MainFrame;
import sudoku.uicustom.panel.MainPanel;

import javax.swing.*;
import java.awt.*;
import java.util.Dictionary;

public class UiMain {

    static void main(String[] args) {
        var dimension = new Dimension(600, 600);
        JPanel mainPanel = new MainPanel(dimension);
        JFrame mainFrame = new MainFrame(dimension, mainPanel);
        mainFrame.revalidate();
        mainFrame.repaint();
    }
}
