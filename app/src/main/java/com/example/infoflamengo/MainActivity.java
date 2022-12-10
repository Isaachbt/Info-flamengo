package com.example.infoflamengo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.infoflamengo.fragmente.NoticiasFragment;
import com.example.infoflamengo.fragmente.SobreFragment;
import com.example.infoflamengo.fragmente.VitoriaFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView navigationView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = findViewById(R.id.button_navegation);

        home();
        habilitarNavegacao();
    }


    public void home(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.viewPage,new NoticiasFragment()).commit();
    }

    private void habilitarNavegacao(){

        navigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                switch (item.getItemId()){
                    case R.id.menu_noticias:
                        fragmentTransaction.replace(R.id.viewPage,new NoticiasFragment()).commit();
                        int colorNoticias = ResourcesCompat.getColor(getResources(),R.color.branco,null);
                        navigationView.setBackgroundColor(colorNoticias);
                        return true;

                    case R.id.menu_sobre:
                        fragmentTransaction.replace(R.id.viewPage,new SobreFragment()).commit();

                        //dessa forma ele pega qualquer drawable e usa na maiactivity
                        Drawable myImage = ResourcesCompat.getDrawable(getResources(), R.drawable.degrader_sobre, null);
                        navigationView.setBackground(myImage);

                        return true;

                    case R.id.menu_vitorias:
                        fragmentTransaction.replace(R.id.viewPage,new VitoriaFragment()).commit();
                        int colorVitorias = ResourcesCompat.getColor(getResources(),R.color.cinza,null);
                        navigationView.setBackgroundColor(colorVitorias);

                        return true;
                }
                return false;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate( R.menu.menu_navegation,menu );
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {//nesse metodo pode clicar nos menu


        return super.onOptionsItemSelected(item);
    }
}