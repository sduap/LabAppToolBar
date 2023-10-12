package co.edu.unipiloto.labappbars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_Peaton(View view){
        Intent intent = new Intent(this, Reportar.class);
        startActivity(intent);
        finish();
    }

    public void btn_Funcionario(View view){
        Intent intent = new Intent(this, Aprobar.class);
        startActivity(intent);
        finish();
    }
}