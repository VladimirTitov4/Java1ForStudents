package com.geekbrains.lesson8.examples.tictac;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TicTacToeGui {

    private static final String FRAME_TITLE = "Крестики-Нолики";
    private static final String START_GAME_MSG = "Игра началачь!";

    private final JLabel[][] gameField = new JLabel[TicTacToe.SIZE][TicTacToe.SIZE];

    private JLabel gameStateLabel;
    private JPanel gamePanel;
    private JFrame frame;

    public TicTacToeGui() {
        initFrame();
        frame.setVisible(true);
    }

    private void initFrame() {
        frame = new JFrame();
        frame.setTitle(FRAME_TITLE);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(400, 400);

        gameStateLabel = new JLabel(START_GAME_MSG);
        gameStateLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(gameStateLabel, BorderLayout.NORTH);

        JButton restartGameButton = new JButton("Начать заново");
        restartGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startGame();
            }
        });

        frame.add(restartGameButton, BorderLayout.SOUTH);

        gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(TicTacToe.SIZE, TicTacToe.SIZE));
        initCells(gamePanel);
        frame.add(gamePanel, BorderLayout.CENTER);
    }

    private void initCells(JPanel gamePanel) {
        Font font = new Font("Arial", Font.BOLD, 32);
        for (int i = 0; i < TicTacToe.SIZE; i++) {
            for (int j = 0; j < TicTacToe.SIZE; j++) {
                JLabel cell = new JLabel(String.valueOf(TicTacToe.DOT_EMPTY));
                cell.setHorizontalAlignment(SwingConstants.CENTER);
                cell.setVerticalAlignment(SwingConstants.CENTER);
                cell.setFont(font);
                cell.setBorder(BorderFactory.createLineBorder(Color.black));

                final int rowIndex = i;
                final int colIndex = j;
                cell.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (!cell.isEnabled()) {
                            return;
                        }

                        TicTacToe.setCell(rowIndex, colIndex, TicTacToe.DOT_X);
                        makeTurn(TicTacToe.DOT_X, cell);

                        if (checkEndGameState(TicTacToe.DOT_X, "Игрок")) {
                            return;
                        }

                        int[] computerCellIndex = TicTacToe.computerTurn();
                        JLabel computerCell = gameField[computerCellIndex[0]][computerCellIndex[1]];
                        makeTurn(TicTacToe.DOT_O, computerCell);

                        checkEndGameState(TicTacToe.DOT_O, "Компьютер");
                    }
                });

                gamePanel.add(cell);
                gameField[i][j] = cell;
            }
        }
    }

    private void makeTurn(char symbol, JLabel cell) {
        cell.setText(String.valueOf(symbol));
        cell.setEnabled(false);
    }

    private boolean checkEndGameState(char symbol, String playerName) {
        if (TicTacToe.isWin(symbol)) {
            setEndGameState(String.format("%s победил!", playerName));
            return true;
        }
        else if (TicTacToe.isMapFull()) {
            setEndGameState("Ничья!");
            return true;
        }

        return false;
    }

    private void setEndGameState(String messageState) {
        setEnabledGameField(false);
        gameStateLabel.setText(messageState);
    }

    private void startGame() {
        setEnabledGameField(true);
        gameStateLabel.setText(START_GAME_MSG);
        TicTacToe.initMap();
        refreshGameField();
    }

    private void refreshGameField() {
        for (int i = 0; i < TicTacToe.SIZE; i++) {
            for (int j = 0; j < TicTacToe.SIZE; j++) {
                gameField[i][j].setText(String.valueOf(TicTacToe.map[i][j]));
            }
        }
    }

    private void setEnabledGameField(boolean enabled) {
        gamePanel.setEnabled(true);
        for (int i = 0; i < TicTacToe.SIZE; i++) {
            for (int j = 0; j < TicTacToe.SIZE; j++) {
                gameField[i][j].setEnabled(enabled);
            }
        }
    }

    public static void main(String[] args) {
        TicTacToeGui ticTacToeGui = new TicTacToeGui();
        ticTacToeGui.startGame();
    }
}
