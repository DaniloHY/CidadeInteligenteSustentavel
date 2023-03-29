package br.com.etecia.cidadeinteligentesustentavel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<DescLixo> listaLixo;
    RecyclerView idRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idRecyclerView = findViewById(R.id.idListaLixo);

        listaLixo = new ArrayList<>();

        listaLixo.add(
                new DescLixo("Causas Ambientais",
                        "Desmatamento",
                        R.drawable.natureza));
    }
}