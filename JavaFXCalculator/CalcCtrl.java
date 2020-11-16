package sample;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
public class CalcCtrl {
    public TextArea displayfield;
    boolean  answer=false;
    public void num1click(MouseEvent event) {numOneActivate(displayfield);}
    public void num2click(MouseEvent event) {numTwoActivate(displayfield);}
    public void num3click(MouseEvent event) {numThreeActivate(displayfield);}
    public void num4click(MouseEvent event) {numFourActivate(displayfield);}
    public void num5click(MouseEvent event) {numFiveActivate(displayfield);}
    public void num6click(MouseEvent event) {numSixActivate(displayfield);}
    public void num7click(MouseEvent event) {numSevenActivate(displayfield);}
    public void num8click(MouseEvent event) {numEightActivate(displayfield);}
    public void num9click(MouseEvent event) {numNineActivate(displayfield);}
    public void num0click(MouseEvent event) {numZeroActivate(displayfield);}
    public void clearclick(MouseEvent event) {clearActivate(displayfield);}
    public void bckspaceclick(MouseEvent event) {bckSpaceActivate(displayfield);}
    public void reciprocalclick(MouseEvent event) {reciprocalActivate(displayfield);}
    public void squareclick(MouseEvent event) {squareActivate(displayfield);}
    public void sqrootclick(MouseEvent event) {sqrootActivate(displayfield);}
    public void negateclick(MouseEvent event) {negateActivate(displayfield);}
    public void decimalclick(MouseEvent event) {decimalActivate(displayfield);}
    public void addclick(MouseEvent event) {addActivate(displayfield);}
    public void subtractclick(MouseEvent event) {subtractActivate(displayfield);}
    public void multiplyclick(MouseEvent event) {multiplyActivate(displayfield);}
    public void divisionclick(MouseEvent event) {divisionActivate(displayfield);}
    public void equalsclick(MouseEvent event) {equalsActivate(displayfield); answer=true;}
    public void percentclick(MouseEvent event) {percentActivate(displayfield);}
    public void onKeyPressedInCalc(KeyEvent event) {
        if (event.getCode()==KeyCode.DIGIT0) numZeroActivate(displayfield);
        if (event.getCode()==KeyCode.DIGIT1) numOneActivate(displayfield);
        if (event.getCode()==KeyCode.DIGIT2) numTwoActivate(displayfield);
        if (event.getCode()==KeyCode.DIGIT3) numThreeActivate(displayfield);
        if (event.getCode()==KeyCode.DIGIT4) numFourActivate(displayfield);
        if (event.getCode()==KeyCode.DIGIT5 && !(event.isShiftDown())) numFiveActivate(displayfield);
        if (event.getCode()==KeyCode.DIGIT6 && !(event.isShiftDown())) numSixActivate(displayfield);
        if (event.getCode()==KeyCode.DIGIT7) numSevenActivate(displayfield);
        if (event.getCode()==KeyCode.DIGIT8 && !(event.isShiftDown())) numEightActivate(displayfield);
        if (event.getCode()==KeyCode.DIGIT9) numNineActivate(displayfield);
        if (event.getCode()==KeyCode.C) clearActivate(displayfield);
        if (event.getCode()==KeyCode.BACK_SPACE) bckSpaceActivate(displayfield);
        if (event.getCode()==KeyCode.SLASH && event.isShiftDown()) reciprocalActivate(displayfield);
        if (event.getCode()==KeyCode.DIGIT6 && event.isShiftDown()) squareActivate(displayfield);
        if (event.getCode()==KeyCode.MINUS && event.isShiftDown()) negateActivate(displayfield);
        if (event.getCode()==KeyCode.PERIOD) decimalActivate(displayfield);
        if (event.getCode()==KeyCode.EQUALS && event.isShiftDown()) addActivate(displayfield);
        if (event.getCode()==KeyCode.MINUS && !(event.isShiftDown())) subtractActivate(displayfield);
        if (event.getCode()==KeyCode.DIGIT8 && event.isShiftDown()) multiplyActivate(displayfield);
        if (event.getCode()==KeyCode.SLASH && !(event.isShiftDown())) divisionActivate(displayfield);
        if (event.getCode()==KeyCode.EQUALS && !(event.isShiftDown())) {equalsActivate(displayfield); answer=true;}
        if (event.getCode()==KeyCode.DIGIT5 && event.isShiftDown()) percentActivate(displayfield);
        if (event.getCode()==KeyCode.ENTER) {equalsActivate(displayfield); answer=true;}
    }
    public  void numOneActivate(TextArea display) {
        if (display.getText().equals("0") || answer==true) display.setText("");
        display.setText(display.getText()+"1");
    }
    public  void numTwoActivate(TextArea display) {
        if (display.getText().equals("0") || answer==true) display.setText("");
        display.setText(display.getText()+"2");
    }
    public  void numThreeActivate(TextArea display) {
        if (display.getText().equals("0") || answer==true) display.setText("");
        display.setText(display.getText()+"3");
    }
    public  void numFourActivate(TextArea display) {
        if (display.getText().equals("0") || answer==true) display.setText("");
        display.setText(display.getText()+"4");
    }
    public  void numFiveActivate(TextArea display) {
        if (display.getText().equals("0") || answer==true) display.setText("");
        display.setText(display.getText()+"5");
    }
    public  void numSixActivate(TextArea display) {
        if (display.getText().equals("0") || answer==true) display.setText("");
        display.setText(display.getText()+"6");
    }
    public  void numSevenActivate(TextArea display) {
        if (display.getText().equals("0") || answer==true) display.setText("");
        display.setText(display.getText()+"7");
    }
    public  void numEightActivate(TextArea display) {
        if (display.getText().equals("0") || answer==true) display.setText("");
        display.setText(display.getText()+"8");
    }
    public  void numNineActivate(TextArea display) {
        if (display.getText().equals("0") || answer==true) display.setText("");
        display.setText(display.getText()+"9");
    }
    public  void numZeroActivate(TextArea display) {
        if (answer==true) display.setText("");
        if(!(display.getText().equals("0"))) display.setText(display.getText()+"0");
    }
    public  void bckSpaceActivate(TextArea display) {
        display.setText(display.getText().substring(0,display.getText().length()-1));
        if (display.getText()=="") display.setText("0");
    }
    public  void clearActivate(TextArea display) {display.setText("0");}
    public  void reciprocalActivate(TextArea display) {
        equalsActivate(display);
        display.setText(String.valueOf(1/Float.parseFloat(display.getText())));
    }
    public  void sqrootActivate(TextArea display) {
        equalsActivate(display);
        display.setText(String.valueOf(Math.sqrt(Float.parseFloat(display.getText()))));
    }
    public  void squareActivate(TextArea display) {
        equalsActivate(display);
        display.setText(String.valueOf(Math.pow(Float.parseFloat(display.getText()),2)));
    }
    public  void negateActivate(TextArea display) {
        equalsActivate(display);
        if (display.getText().contains("-")) {
            display.setText(display.getText().replace("-","+"));
        } else {
            display.setText("-"+display.getText());
        }
    }
    public  void decimalActivate(TextArea display) {
        display.setText(display.getText()+".");
    }
    public  void divisionActivate(TextArea display) {
        equalsActivate(display);
        if (!(display.getText().equals("0"))) display.setText(display.getText()+"÷");
    }
    public  void multiplyActivate(TextArea display) {
        equalsActivate(display);
        if (!(display.getText().equals("0"))) display.setText(display.getText()+"×");
    }
    public  void addActivate(TextArea display) {
        equalsActivate(display);
        if (!(display.getText().equals("0"))) display.setText(display.getText()+"+");
    }
    public  void subtractActivate(TextArea display) {
        equalsActivate(display);
        if (!(display.getText().equals("0"))) display.setText(display.getText()+"-");
    }
    public  void equalsActivate(TextArea display) {
        if (display.getText().contains("+") && !(display.getText().endsWith("+"))) {
            float val1=Float.parseFloat(display.getText().substring(0,display.getText().indexOf("+")));
            float val2=Float.parseFloat(display.getText().substring(display.getText().indexOf("+"),display.getText().length()));
            display.setText(String.valueOf(val1+val2));
        }
        if (display.getText().contains("-") && !(display.getText().endsWith("-"))) {
            float val1=Float.parseFloat(display.getText().substring(0,display.getText().indexOf("-")));
            float val2=Float.parseFloat(display.getText().substring(display.getText().indexOf("-"),display.getText().length()));
            display.setText(String.valueOf(val1-val2));
        }
        if (display.getText().contains("×") && !(display.getText().endsWith("×"))) {
            float val1=Float.parseFloat(display.getText().substring(0,display.getText().indexOf("×")));
            float val2=Float.parseFloat(display.getText().substring(display.getText().indexOf("×")+1,display.getText().length()));
            display.setText(String.valueOf(val1*val2));
        }
        if (display.getText().contains("÷") && !(display.getText().endsWith("÷"))) {
            float val1=Float.parseFloat(display.getText().substring(0,display.getText().indexOf("÷")));
            float val2=Float.parseFloat(display.getText().substring(display.getText().indexOf("÷")+1,display.getText().length()));
            display.setText(String.valueOf(val1/val2));
        }
        if (display.getText().endsWith(".0")) {
            display.setText(display.getText().substring(0,display.getText().indexOf(".")));
        }
    }
    public  void percentActivate(TextArea display) {
        if (display.getText().contains("÷") && !(display.getText().endsWith("÷"))) {
            float val1=Float.parseFloat(display.getText().substring(0,display.getText().indexOf("÷")));
            float val2=Float.parseFloat(display.getText().substring(display.getText().indexOf("÷")+1,display.getText().length()));
            float val3=val1/val2;
            display.setText(String.valueOf(val3*100));
        }
    }
}
