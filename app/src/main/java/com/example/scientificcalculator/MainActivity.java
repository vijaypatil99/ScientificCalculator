package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.mariuszgromada.math.mxparser.*;
// FOR LICENSE https://mathparser.org/mxparser-license/

public class MainActivity extends AppCompatActivity {

    EditText editText,editText2;

    Button button0,button00,button1,button2,button3,button4,button5,button6,button7,button8,button9,
            buttonDot,buttonPi,buttonSum,buttonSub,buttonMul,buttonDiv,buttonClr,buttonDel,buttonEq,
                buttonPow,buttonln,buttonSquare,buttonSqRoot,buttonSin,buttonCos,buttonTan,buttonFact,
                    buttonOpParentheses,buttonClParentheses,buttonE,buttonC,buttonP,buttonMod,buttonComma,buttonlog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tried to make cursor visible but not working,hiding keyboard only.
        editText=findViewById(R.id.editText);
        editText.setInputType(InputType.TYPE_NULL);
        editText.setTextIsSelectable(true);

        editText2=findViewById(R.id.editText2);
        editText2.setInputType(InputType.TYPE_NULL);
        editText2.setTextIsSelectable(true);


        button0=findViewById(R.id.button0);
        button00=findViewById(R.id.button00);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);

        buttonDot=findViewById(R.id.buttonDot);
        buttonPi=findViewById(R.id.buttonPi);

        buttonSum=findViewById(R.id.buttonSum);
        buttonSub=findViewById(R.id.buttonSub);
        buttonMul=findViewById(R.id.buttonMul);
        buttonDiv=findViewById(R.id.buttonDiv);
        buttonClr=findViewById(R.id.buttonClr);
        buttonDel=findViewById(R.id.buttonDel);
        buttonEq=findViewById(R.id.buttonEq);

        buttonSin=findViewById(R.id.buttonSin);
        buttonCos=findViewById(R.id.buttonCos);
        buttonTan=findViewById(R.id.buttonTan);
        buttonFact=findViewById(R.id.buttonFact);

        buttonln=findViewById(R.id.buttonln);
        buttonPow=findViewById(R.id.buttonPow);
        buttonSquare=findViewById(R.id.buttonSquare);
        buttonSqRoot=findViewById(R.id.buttonSqRoot);

        buttonOpParentheses=findViewById(R.id.buttonOpParentheses);
        buttonClParentheses=findViewById(R.id.buttonClParentheses);
        buttonE=findViewById(R.id.buttonE);
        buttonC=findViewById(R.id.buttonC);
        buttonP=findViewById(R.id.buttonP);
        buttonComma=findViewById(R.id.buttonComma);
        buttonMod=findViewById(R.id.buttonMod);
        buttonlog=findViewById(R.id.buttonlog);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"0");

            }
        });
        button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"00");

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"1");

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"2");

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"3");

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"4");

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"5");

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"6");

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"7");

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"8");

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"9");

            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+".");

            }
        });
        buttonPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"π");

            }
        });

        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=editText.getText().toString();
                if(str.equals(""))
                    editText.setText("");
                else {
                    if (str.charAt(str.length() - 1) != '+')
                        editText.setText(editText.getText() + "+");
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=editText.getText().toString();
                if(str.equals(""))
                    editText.setText("-");
                else {
                    if (str.charAt(str.length() - 1) != '-')
                        editText.setText(editText.getText() + "-");
                }
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=editText.getText().toString();
                if(str.equals(""))
                    editText.setText("");
                else {
                    if (str.charAt(str.length() - 1) != '*')
                        editText.setText(editText.getText() + "*");
                }
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=editText.getText().toString();
                if(str.equals(""))
                    editText.setText("");
                else {
                    if (str.charAt(str.length() - 1) != '/')
                        editText.setText(editText.getText() + "/");
                }
            }
        });
        buttonClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
                editText2.setText("");
            }
        });
        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=editText.getText().toString();
                if(str.equals(""))
                    editText.setText("");
                else {
                    str = str.substring(0, str.length() - 1);
                    editText.setText(str);
                }
            }
        });
        buttonEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userExpr=editText.getText().toString();
                if(userExpr.equals("")) {
                    editText.setText("");
                }
                else {
                    Expression expr = new Expression(userExpr);
                    String result = String.valueOf(expr.calculate());
                    editText2.setText(result);
                }
            }
        });
        buttonSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"sin(");
            }
        });
        buttonCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"cos(");
            }
        });
        buttonTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"tan(");
            }
        });
        buttonFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"!");
            }
        });
        buttonln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"ln(");
            }
        });
        buttonPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"^");
            }
        });
        buttonSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"^2");
            }
        });
        buttonSqRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"sqrt(");
            }
        });



        buttonOpParentheses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"(");
            }
        });
        buttonClParentheses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+")");
            }
        });
        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"e");
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"nCk(");
            }
        });
        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"nPk(");
            }
        });
        buttonComma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+",");
            }
        });
        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"mod(");
            }
        });
        buttonlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"log(");
            }
        });
    }
}