package ec.epn.detri.awm.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_Suma;
    private Button btn_Resta;
    private Button btn_Multiplicacion;
    private Button btn_Division;

    private TextView respuesta;
    private TextView nota;

    private EditText num1;
    private EditText num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        respuesta = findViewById(R.id.textResultado);
        nota = findViewById(R.id.notas);

        num1 = findViewById(R.id.numero1);
        num2 = findViewById(R.id.numero2);

        btn_Suma = findViewById(R.id.btnSuma);
        btn_Suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().toString().trim().equalsIgnoreCase("") || num2.getText().toString().trim().equalsIgnoreCase("")){
                    nota.setText("No tiene que haber campos vacios");
                }
                else{
                    respuesta.setText(suma(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()))+"");

                }

            }
        });

        btn_Resta= findViewById(R.id.btnResta);
        btn_Resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().toString().trim().equalsIgnoreCase("") || num2.getText().toString().trim().equalsIgnoreCase("")){
                    nota.setText("No tiene que haber campos vacios");
                }
                else{
                respuesta.setText(resta(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()))+"");
            }}
        });

        btn_Multiplicacion = findViewById(R.id.btnMultipli);
        btn_Multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().toString().trim().equalsIgnoreCase("") || num2.getText().toString().trim().equalsIgnoreCase("")){
                    nota.setText("No tiene que haber campos vacios");
                }
                else{
                respuesta.setText(multiplicacion(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()))+"");
            }}
        });

        btn_Division = findViewById(R.id.btnDivision);
        btn_Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(num2.getText().toString()) == 0){
                    nota.setText("El divisor debe ser diferente de 0");
                }
                else{
                    if(num1.getText().toString().trim().equalsIgnoreCase("") || num2.getText().toString().trim().equalsIgnoreCase("")){
                        nota.setText("No tiene que haber campos vacios");
                    }
                    else{
                    respuesta.setText(division(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()))+"");
                }}

            }
        });


    }

    public static double suma(int a, int b){
        return a+b;
    }

    public static double resta(int a, int b){
        return a-b;
    }

    public static double multiplicacion(int a, int b){
        return a*b;
    }

    public static double division(int a, int b){
        if(b == 0){

            return 0;
        }
        else{
            return a/b;
        }
    }
}