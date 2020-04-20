package com.example.learnnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ChipNavigationBar navBar = findViewById(R.id.bottomNav);
        navBar.setItemSelected(R.id.home,true);
        navBar.setOnItemSelectedListener(navListener);
        loadFragment(new HomeFragment());
    }

    private ChipNavigationBar.OnItemSelectedListener navListener = new ChipNavigationBar.OnItemSelectedListener() {
        @Override
        public void onItemSelected(int i) {
            switch (i){
                case R.id.home:
                    loadFragment(new HomeFragment());
                    break;
                case R.id.community:
                    loadFragment(new ForumFragment());
                    break;
                case R.id.search:
                    loadFragment(new SearchFragment());
                    break;
                case R.id.account:
                    loadFragment(new AccountFragment());
                    break;
            }
        }
    };

    public void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
