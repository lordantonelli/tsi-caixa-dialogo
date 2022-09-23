package com.example.navegaoactivities.caixadedilogo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnSair = findViewById(R.id.btnSair);
this.btnSair.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        // Criando a caixa de diálogo
        AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
        // Definindo o título da caixa de diálogo
        dialogo.setTitle("FECHANDO O APLICATIVO");
        //Definindo um ícone
        dialogo.setIcon(R.drawable.logo_ufms);
        // Definindo o texto principal
        dialogo.setMessage("Deseja mesmo fechar o aplicativo?");
        // Definindo o botão de ação positiva
        dialogo.setPositiveButton("Fechar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // Fecha a activity e, por consequência, o aplicativo
                finish();
                // Mostra um toast
                Toast.makeText(getApplicationContext(), "Saindo...", Toast.LENGTH_SHORT).show();
            }
        });
        // Definindo o botão de ação negativa
        dialogo.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // Cancelando a caixa de diálogo
                dialogInterface.cancel();
                // Mostra um toast
                Toast.makeText(getApplicationContext(), "Cancelando...", Toast.LENGTH_SHORT).show();
            }
        });
        // Proibindo que o usuário clique fora da caixa
        // Isso obriga que ele faça uma escolha
        dialogo.setCancelable(false);
        // Criando e exibindo a caixa de diálogo
        dialogo.create();
        dialogo.show();
    }
});
    }
}