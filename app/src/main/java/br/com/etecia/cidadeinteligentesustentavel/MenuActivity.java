package br.com.etecia.cidadeinteligentesustentavel;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    MaterialToolbar toolbar;

    DrawerLayout drawerLayout;

    NavigationView navigationView;

    ActionBarDrawerToggle toggle;


    List<DescLixo> listaLixo;
    RecyclerView idRecyclerView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        idRecyclerView = findViewById(R.id.idListaLixo);

        listaLixo = new ArrayList<>();

        listaLixo.add(
                new DescLixo("Impacto ambiental", "Olá", "Impacto", R.drawable.natureza)
        );

        idRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        idRecyclerView.setHasFixedSize(true);

        toolbar = findViewById(R.id.idToolBar);
        drawerLayout = findViewById(R.id.idDrawerLayout);
        navigationView = findViewById(R.id.navigationView);

        navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);

        //Clique no menu para abrir e fechar o NavigationView
        toggle = new ActionBarDrawerToggle(
                this, drawerLayout,
                toolbar,
                R.string.opennav,
                R.string.closenav);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.idContainerNav, new ImportFragment()).commit();

            navigationView.setCheckedItem(R.id.mImport);
    }
}}