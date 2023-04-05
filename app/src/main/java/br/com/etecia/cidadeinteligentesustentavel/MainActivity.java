package br.com.etecia.cidadeinteligentesustentavel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
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
                new DescLixo("Impacto ambiental", "Olá", "Impacto", R.drawable.natureza)
        );

        idRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        idRecyclerView.setHasFixedSize(true);

    }
}