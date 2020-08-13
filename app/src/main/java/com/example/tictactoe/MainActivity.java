package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tv_1_1;
    private TextView tv_1_2;
    private TextView tv_1_3;
    private TextView tv_2_1;
    private TextView tv_2_2;
    private TextView tv_2_3;
    private TextView tv_3_1;
    private TextView tv_3_2;
    private TextView tv_3_3;
    private String symbol;
    private String[] symbols = new String[9];
    private final String symbolX = "X";
    private final String symbolO = "O";
    private int randomNumber;
    private int position;
    private int counter = 0;
    private boolean isComputerPutSymbol = false;
    private boolean isGameContinue = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        tv_1_1 = findViewById(R.id.tv_1_1);
        tv_1_2 = findViewById(R.id.tv_1_2);
        tv_1_3 = findViewById(R.id.tv_1_3);
        tv_2_1 = findViewById(R.id.tv_2_1);
        tv_2_2 = findViewById(R.id.tv_2_2);
        tv_2_3 = findViewById(R.id.tv_2_3);
        tv_3_1 = findViewById(R.id.tv_3_1);
        tv_3_2 = findViewById(R.id.tv_3_2);
        tv_3_3 = findViewById(R.id.tv_3_3);

        tv_1_1.setOnClickListener(this);
        tv_1_2.setOnClickListener(this);
        tv_1_3.setOnClickListener(this);
        tv_2_1.setOnClickListener(this);
        tv_2_2.setOnClickListener(this);
        tv_2_3.setOnClickListener(this);
        tv_3_1.setOnClickListener(this);
        tv_3_2.setOnClickListener(this);
        tv_3_3.setOnClickListener(this);

        Arrays.fill(symbols, ".");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_1_1:
                if (tv_1_1.getText().toString().equals("")) {
                    tv_1_1.setText(symbolX);
                    position = 0;
                    methodPlayer();
                }
                if (isGameContinue) {
                    computerSetSymbol();
                }
                break;
            case R.id.tv_1_2:
                if (tv_1_2.getText().toString().equals("")) {
                    tv_1_2.setText(symbolX);
                    position = 1;
                    methodPlayer();
                }
                if (isGameContinue) {
                    computerSetSymbol();
                }
                break;
            case R.id.tv_1_3:
                if (tv_1_3.getText().toString().equals("")) {
                    tv_1_3.setText(symbolX);
                    position = 2;
                    methodPlayer();
                }
                if (isGameContinue) {
                    computerSetSymbol();
                }
                break;
            case R.id.tv_2_1:
                if (tv_2_1.getText().toString().equals("")) {
                    tv_2_1.setText(symbolX);
                    position = 3;
                    methodPlayer();
                }
                if (isGameContinue) {
                    computerSetSymbol();
                }
                break;
            case R.id.tv_2_2:
                if (tv_2_2.getText().toString().equals("")) {
                    tv_2_2.setText(symbolX);
                    position = 4;
                    methodPlayer();
                }
                if (isGameContinue) {
                    computerSetSymbol();
                }
                break;
            case R.id.tv_2_3:
                if (tv_2_3.getText().toString().equals("")) {
                    tv_2_3.setText(symbolX);
                    position = 5;
                    methodPlayer();
                }
                if (isGameContinue) {
                    computerSetSymbol();
                }
                break;
            case R.id.tv_3_1:
                if (tv_3_1.getText().toString().equals("")) {
                    tv_3_1.setText(symbolX);
                    position = 6;
                    methodPlayer();
                }
                if (isGameContinue) {
                    computerSetSymbol();
                }
                break;
            case R.id.tv_3_2:
                if (tv_3_2.getText().toString().equals("")) {
                    tv_3_2.setText(symbolX);
                    position = 7;
                    methodPlayer();
                }
                if (isGameContinue) {
                    computerSetSymbol();
                }
                break;
            case R.id.tv_3_3:
                if (tv_3_3.getText().toString().equals("")) {
                    tv_3_3.setText(symbolX);
                    position = 8;
                    methodPlayer();
                }
                if (isGameContinue) {
                    computerSetSymbol();
                }
                break;
            default:
                break;
        }
    }

    private void getRandomNumber() {
        randomNumber = (int) (Math.random() * (8 + 1)) + 1;
    }

    private void computerSetSymbol() {
        if (counter < 9) {
            if (!isComputerPutSymbol) {
                checkBestResultComputerPlay();
            }
            while (!isComputerPutSymbol) {
                getRandomNumber();
                switch (randomNumber) {
                    case 1:
                        if (tv_1_1.getText().toString().equals("")) {
                            tv_1_1.setText(symbolO);
                            position = 0;
                            methodComputer();
                            break;
                        } else if (tv_1_1.getText().toString().equals(symbolX) || tv_1_1.getText().toString().equals(symbolX)) {
                            computerSetSymbol();
                        }
                        break;
                    case 2:
                        if (tv_1_2.getText().toString().equals("")) {
                            tv_1_2.setText(symbolO);
                            position = 1;
                            methodComputer();
                            break;
                        } else if (tv_1_2.getText().toString().equals(symbolX) || tv_1_2.getText().toString().equals(symbolX)) {
                            computerSetSymbol();
                        }
                        break;
                    case 3:
                        if (tv_1_3.getText().toString().equals("")) {
                            tv_1_3.setText(symbolO);
                            position = 2;
                            methodComputer();
                            break;
                        } else if (tv_1_3.getText().toString().equals(symbolX) || tv_1_3.getText().toString().equals(symbolX)) {
                            computerSetSymbol();
                        }
                        break;
                    case 4:
                        if (tv_2_1.getText().toString().equals("")) {
                            tv_2_1.setText(symbolO);
                            position = 3;
                            methodComputer();
                            break;
                        } else if (tv_2_1.getText().toString().equals(symbolX) || tv_2_1.getText().toString().equals(symbolX)) {
                            computerSetSymbol();
                        }
                        break;
                    case 5:
                        if (tv_2_2.getText().toString().equals("")) {
                            tv_2_2.setText(symbolO);
                            position = 4;
                            methodComputer();
                            break;
                        } else if (tv_2_2.getText().toString().equals(symbolX) || tv_2_2.getText().toString().equals(symbolX)) {
                            computerSetSymbol();
                        }
                        break;
                    case 6:
                        if (tv_2_3.getText().toString().equals("")) {
                            tv_2_3.setText(symbolO);
                            position = 5;
                            methodComputer();
                            break;
                        } else if (tv_2_3.getText().toString().equals(symbolX) || tv_2_3.getText().toString().equals(symbolX)) {
                            computerSetSymbol();
                        }
                        break;
                    case 7:
                        if (tv_3_1.getText().toString().equals("")) {
                            tv_3_1.setText(symbolO);
                            position = 6;
                            methodComputer();
                            break;
                        } else if (tv_3_1.getText().toString().equals(symbolX) || tv_3_1.getText().toString().equals(symbolX)) {
                            computerSetSymbol();
                        }
                        break;
                    case 8:
                        if (tv_3_2.getText().toString().equals("")) {
                            tv_3_2.setText(symbolO);
                            position = 7;
                            methodComputer();
                            break;
                        } else if (tv_3_2.getText().toString().equals(symbolX) || tv_3_2.getText().toString().equals(symbolX)) {
                            computerSetSymbol();
                        }
                        break;
                    case 9:
                        if (tv_3_3.getText().toString().equals("")) {
                            tv_3_3.setText(symbolO);
                            position = 8;
                            methodComputer();
                            break;
                        } else if (tv_3_3.getText().toString().equals(symbolX) || tv_3_3.getText().toString().equals(symbolX)) {
                            computerSetSymbol();
                        }
                        break;
                    default:
                        break;
                }
            }
        }
    }

    private void fillCharArraySymbols(String s, int position) {
        symbols[position] = s;
    }

    private void checkWinner() {
        // check 1st horizontal line
        if (symbols[0].equals(symbols[1]) && symbols[1].equals(symbols[2])
                && !symbols[0].equals(".") && symbols[0].equals(symbolX)) {
            openResultActivityIfPlayerIsWinner();
            isGameContinue = false;
        } else if (symbols[0].equals(symbols[1]) && symbols[1].equals(symbols[2])
                && !symbols[0].equals(".") && symbols[0].equals(symbolO)) {
            openResultActivityIfComputerIsWinner();
            isGameContinue = false;
            // check 2nd horizontal line
        } else if (symbols[3].equals(symbols[4]) && symbols[4].equals(symbols[5])
                && !symbols[3].equals(".") && symbols[3].equals(symbolX)) {
            openResultActivityIfPlayerIsWinner();
            isGameContinue = false;
        } else if (symbols[3].equals(symbols[4]) && symbols[4].equals(symbols[5])
                && !symbols[3].equals(".") && symbols[3].equals(symbolO)) {
            openResultActivityIfComputerIsWinner();
            isGameContinue = false;
            // check 3rd horizontal line
        } else if (symbols[6].equals(symbols[7]) && symbols[7].equals(symbols[8])
                && !symbols[6].equals(".") && symbols[6].equals(symbolX)) {
            openResultActivityIfPlayerIsWinner();
            isGameContinue = false;
        } else if (symbols[6].equals(symbols[7]) && symbols[7].equals(symbols[8])
                && !symbols[6].equals(".") && symbols[6].equals(symbolO)) {
            openResultActivityIfComputerIsWinner();
            isGameContinue = false;
            // check 1st vertical line
        } else if (symbols[0].equals(symbols[3]) && symbols[3].equals(symbols[6])
                && !symbols[0].equals(".") && symbols[0].equals(symbolX)) {
            openResultActivityIfPlayerIsWinner();
            isGameContinue = false;
        } else if (symbols[0].equals(symbols[3]) && symbols[3].equals(symbols[6])
                && !symbols[0].equals(".") && symbols[0].equals(symbolO)) {
            openResultActivityIfComputerIsWinner();
            isGameContinue = false;
            // check 2nd vertical line
        } else if (symbols[1].equals(symbols[4]) && symbols[4].equals(symbols[7])
                && !symbols[1].equals(".") && symbols[1].equals(symbolX)) {
            openResultActivityIfPlayerIsWinner();
            isGameContinue = false;
        } else if (symbols[1].equals(symbols[4]) && symbols[4].equals(symbols[7])
                && !symbols[1].equals(".") && symbols[1].equals(symbolO)) {
            openResultActivityIfComputerIsWinner();
            isGameContinue = false;
            // check 3rd vertical line
        } else if (symbols[2].equals(symbols[5]) && symbols[5].equals(symbols[8])
                && !symbols[2].equals(".") && symbols[2].equals(symbolX)) {
            openResultActivityIfPlayerIsWinner();
            isGameContinue = false;
        } else if (symbols[2].equals(symbols[5]) && symbols[5].equals(symbols[8])
                && !symbols[2].equals(".") && symbols[2].equals(symbolO)) {
            openResultActivityIfComputerIsWinner();
            isGameContinue = false;
            // check 1st diagonal line
        } else if (symbols[0].equals(symbols[4]) && symbols[4].equals(symbols[8])
                && !symbols[0].equals(".") && symbols[0].equals(symbolX)) {
            openResultActivityIfPlayerIsWinner();
            isGameContinue = false;
        } else if (symbols[0].equals(symbols[4]) && symbols[4].equals(symbols[8])
                && !symbols[0].equals(".") && symbols[0].equals(symbolO)) {
            openResultActivityIfComputerIsWinner();
            isGameContinue = false;
            // check 2nd diagonal line
        } else if (symbols[2].equals(symbols[4]) && symbols[4].equals(symbols[6])
                && !symbols[2].equals(".") && symbols[2].equals(symbolX)) {
            openResultActivityIfPlayerIsWinner();
            isGameContinue = false;
        } else if (symbols[2].equals(symbols[4]) && symbols[4].equals(symbols[6])
                && !symbols[2].equals(".") && symbols[2].equals(symbolO)) {
            openResultActivityIfComputerIsWinner();
            isGameContinue = false;
        } else if (counter == 9 && isGameContinue) {
            openResultActivityIfNoWinner();
        } else {
            isGameContinue = true;
        }
    }

    private void methodPlayer() {
        symbol = symbolX;
        fillCharArraySymbols(symbol, position);
        counter++;
        checkWinner();
        isComputerPutSymbol = false;
    }

    private void methodComputer() {
        isComputerPutSymbol = true;
        counter++;
        symbol = symbolO;
        fillCharArraySymbols(symbol, position);
        checkWinner();
    }

    private void methodComputerForBestResult() {
        isComputerPutSymbol = true;
        counter++;
        checkWinner();
    }

    private void openResultActivityIfPlayerIsWinner() {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    private void openResultActivityIfComputerIsWinner() {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

    private void openResultActivityIfNoWinner() {
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }

    private void checkBestResultComputerPlay() {
        // to put all symbols 'O':
        // first horizontal line
        if (symbols[0].equals(symbols[1]) && symbols[0].equals(symbolO) && symbols[2].equals(".")) {
            symbols[2] = symbolO;
            tv_1_3.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[0].equals(symbols[2]) && symbols[0].equals(symbolO) && symbols[1].equals(".")) {
            symbols[1] = symbolO;
            tv_1_2.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[1].equals(symbols[2]) && symbols[1].equals(symbolO) && symbols[0].equals(".")) {
            symbols[0] = symbolO;
            tv_1_1.setText(symbolO);
            methodComputerForBestResult();
            // second horizontal line
        } else if (symbols[3].equals(symbols[4]) && symbols[3].equals(symbolO) && symbols[5].equals(".")) {
            symbols[5] = symbolO;
            tv_2_3.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[3].equals(symbols[5]) && symbols[3].equals(symbolO) && symbols[4].equals(".")) {
            symbols[4] = symbolO;
            tv_2_2.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[4].equals(symbols[5]) && symbols[4].equals(symbolO) && symbols[3].equals(".")) {
            symbols[3] = symbolO;
            tv_2_1.setText(symbolO);
            methodComputerForBestResult();
            // third horizontal line
        } else if (symbols[6].equals(symbols[7]) && symbols[6].equals(symbolO) && symbols[8].equals(".")) {
            symbols[8] = symbolO;
            tv_3_3.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[6].equals(symbols[8]) && symbols[6].equals(symbolO) && symbols[7].equals(".")) {
            symbols[7] = symbolO;
            tv_3_2.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[7].equals(symbols[8]) && symbols[7].equals(symbolO) && symbols[6].equals(".")) {
            symbols[6] = symbolO;
            tv_3_1.setText(symbolO);
            methodComputerForBestResult();
            // first vertical line
        } else if (symbols[0].equals(symbols[3]) && symbols[0].equals(symbolO) && symbols[6].equals(".")) {
            symbols[6] = symbolO;
            tv_3_1.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[0].equals(symbols[6]) && symbols[0].equals(symbolO) && symbols[3].equals(".")) {
            symbols[3] = symbolO;
            tv_2_1.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[3].equals(symbols[6]) && symbols[3].equals(symbolO) && symbols[0].equals(".")) {
            symbols[0] = symbolO;
            tv_1_1.setText(symbolO);
            methodComputerForBestResult();
            // second vertical line
        } else if (symbols[1].equals(symbols[4]) && symbols[1].equals(symbolO) && symbols[7].equals(".")) {
            symbols[7] = symbolO;
            tv_3_2.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[1].equals(symbols[7]) && symbols[1].equals(symbolO) && symbols[4].equals(".")) {
            symbols[4] = symbolO;
            tv_2_2.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[4].equals(symbols[7]) && symbols[4].equals(symbolO) && symbols[1].equals(".")) {
            symbols[1] = symbolO;
            tv_1_2.setText(symbolO);
            methodComputerForBestResult();
            // third vertical line
        } else if (symbols[2].equals(symbols[5]) && symbols[2].equals(symbolO) && symbols[8].equals(".")) {
            symbols[8] = symbolO;
            tv_3_3.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[2].equals(symbols[8]) && symbols[2].equals(symbolO) && symbols[5].equals(".")) {
            symbols[5] = symbolO;
            tv_2_3.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[5].equals(symbols[8]) && symbols[5].equals(symbolO) && symbols[2].equals(".")) {
            symbols[2] = symbolO;
            tv_1_3.setText(symbolO);
            methodComputerForBestResult();
            // first diagonal line
        } else if (symbols[6].equals(symbols[4]) && symbols[6].equals(symbolO) && symbols[2].equals(".")) {
            symbols[2] = symbolO;
            tv_1_3.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[6].equals(symbols[2]) && symbols[6].equals(symbolO) && symbols[4].equals(".")) {
            symbols[4] = symbolO;
            tv_2_2.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[4].equals(symbols[2]) && symbols[4].equals(symbolO) && symbols[6].equals(".")) {
            symbols[6] = symbolO;
            tv_3_1.setText(symbolO);
            methodComputerForBestResult();
            // second diagonal line
        } else if (symbols[0].equals(symbols[4]) && symbols[0].equals(symbolO) && symbols[8].equals(".")) {
            symbols[8] = symbolO;
            tv_3_3.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[0].equals(symbols[8]) && symbols[0].equals(symbolO) && symbols[4].equals(".")) {
            symbols[4] = symbolO;
            tv_2_2.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[4].equals(symbols[8]) && symbols[4].equals(symbolO) && symbols[0].equals(".")) {
            symbols[0] = symbolO;
            tv_1_1.setText(symbolO);
            methodComputerForBestResult();
            // to put symbol 'O' in line of symbols 'X':
            // first horizontal line
        } else if (symbols[0].equals(symbols[1]) && symbols[0].equals(symbolX) && symbols[2].equals(".")) {
            symbols[2] = symbolO;
            tv_1_3.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[0].equals(symbols[2]) && symbols[0].equals(symbolX) && symbols[1].equals(".")) {
            symbols[1] = symbolO;
            tv_1_2.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[1].equals(symbols[2]) && symbols[1].equals(symbolX) && symbols[0].equals(".")) {
            symbols[0] = symbolO;
            tv_1_1.setText(symbolO);
            methodComputerForBestResult();
            // second horizontal line
        } else if (symbols[3].equals(symbols[4]) && symbols[3].equals(symbolX) && symbols[5].equals(".")) {
            symbols[5] = symbolO;
            tv_2_3.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[3].equals(symbols[5]) && symbols[3].equals(symbolX) && symbols[4].equals(".")) {
            symbols[4] = symbolO;
            tv_2_2.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[4].equals(symbols[5]) && symbols[4].equals(symbolX) && symbols[3].equals(".")) {
            symbols[3] = symbolO;
            tv_2_1.setText(symbolO);
            methodComputerForBestResult();
            // third horizontal line
        } else if (symbols[6].equals(symbols[7]) && symbols[6].equals(symbolX) && symbols[8].equals(".")) {
            symbols[8] = symbolO;
            tv_3_3.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[6].equals(symbols[8]) && symbols[6].equals(symbolX) && symbols[7].equals(".")) {
            symbols[7] = symbolO;
            tv_3_2.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[7].equals(symbols[8]) && symbols[7].equals(symbolX) && symbols[6].equals(".")) {
            symbols[6] = symbolO;
            tv_3_1.setText(symbolO);
            methodComputerForBestResult();
            // first vertical line
        } else if (symbols[0].equals(symbols[3]) && symbols[0].equals(symbolX) && symbols[6].equals(".")) {
            symbols[6] = symbolO;
            tv_3_1.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[0].equals(symbols[6]) && symbols[0].equals(symbolX) && symbols[3].equals(".")) {
            symbols[3] = symbolO;
            tv_2_1.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[3].equals(symbols[6]) && symbols[3].equals(symbolX) && symbols[0].equals(".")) {
            symbols[0] = symbolO;
            tv_1_1.setText(symbolO);
            methodComputerForBestResult();
            // second vertical line
        } else if (symbols[1].equals(symbols[4]) && symbols[1].equals(symbolX) && symbols[7].equals(".")) {
            symbols[7] = symbolO;
            tv_3_2.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[1].equals(symbols[7]) && symbols[1].equals(symbolX) && symbols[4].equals(".")) {
            symbols[4] = symbolO;
            tv_2_2.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[4].equals(symbols[7]) && symbols[4].equals(symbolX) && symbols[1].equals(".")) {
            symbols[1] = symbolO;
            tv_1_2.setText(symbolO);
            methodComputerForBestResult();
            // third vertical line
        } else if (symbols[2].equals(symbols[5]) && symbols[2].equals(symbolX) && symbols[8].equals(".")) {
            symbols[8] = symbolO;
            tv_3_3.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[2].equals(symbols[8]) && symbols[2].equals(symbolX) && symbols[5].equals(".")) {
            symbols[5] = symbolO;
            tv_2_3.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[5].equals(symbols[8]) && symbols[5].equals(symbolX) && symbols[2].equals(".")) {
            symbols[2] = symbolO;
            tv_1_3.setText(symbolO);
            methodComputerForBestResult();
            // first diagonal line
        } else if (symbols[6].equals(symbols[4]) && symbols[6].equals(symbolX) && symbols[2].equals(".")) {
            symbols[2] = symbolO;
            tv_1_3.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[6].equals(symbols[2]) && symbols[6].equals(symbolX) && symbols[4].equals(".")) {
            symbols[4] = symbolO;
            tv_2_2.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[4].equals(symbols[2]) && symbols[4].equals(symbolX) && symbols[6].equals(".")) {
            symbols[6] = symbolO;
            tv_3_1.setText(symbolO);
            methodComputerForBestResult();
            // second diagonal line
        } else if (symbols[0].equals(symbols[4]) && symbols[0].equals(symbolX) && symbols[8].equals(".")) {
            symbols[8] = symbolO;
            tv_3_3.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[0].equals(symbols[8]) && symbols[0].equals(symbolX) && symbols[4].equals(".")) {
            symbols[4] = symbolO;
            tv_2_2.setText(symbolO);
            methodComputerForBestResult();
        } else if (symbols[4].equals(symbols[8]) && symbols[4].equals(symbolX) && symbols[0].equals(".")) {
            symbols[0] = symbolO;
            tv_1_1.setText(symbolO);
            methodComputerForBestResult();
        }
    }

    @Override
    public void onBackPressed() {
        exit();
    }

    public void exit() {
        ActivityCompat.finishAffinity(this);
        System.exit(0);
    }
}
