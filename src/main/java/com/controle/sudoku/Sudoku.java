package com.controle.sudoku;
import com.controle.sudoku.pages.TelaInicial;

public class Sudoku {

    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }
}
