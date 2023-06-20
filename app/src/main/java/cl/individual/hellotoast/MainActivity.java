package cl.individual.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListeners();

    }

    private void initListeners() {
        Button botonSuperior = findViewById(R.id.botonShowToast);
        Button botonInferior = findViewById(R.id.botonCount);
        TextView textCentral = findViewById(R.id.textViewContador);
        botonSuperior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Hello Toast!", Toast.LENGTH_SHORT).show();
            }
        });

        botonInferior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer numero = Integer.parseInt(textCentral.getText().toString());
                numero++;
                textCentral.setText(numero.toString());
            }
        });
    }
}