package nl.hsleiden.politiebrochureapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import Fragments.AboutAppFragment;
import Fragments.AboutHandreikingFragment;
import Fragments.ColofonFragment;
import Fragments.Hoofdstuk1Fragment;
import Fragments.Hoofdstuk2Fragment;
import Fragments.Hoofdstuk3Fragment;
import Fragments.Hoofdstuk4Fragment;
import Fragments.InhoudsopgaveFragment;
import Fragments.StatistiekenFragment;
import Fragments.TitelbladFragment;
import Fragments.WaaromEenHandreikingFragment;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    private int titelpaginaCounter = 0;
    private int colofonCounter = 0;
    private int waaromHandreikingCounter = 0;
    private int aboutHnadreikingCounter = 0;
    private int hoofdstuk1Counter = 0;
    private int hoofdstuk2Counter = 0;
    private int hoofdstuk3Counter = 0;
    private int hoofdstuk4Counter = 0;

    Bundle bundle = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        NavigationView nvDrawer = findViewById(R.id.nav);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setupDrawerContent(nvDrawer);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void selectItemDrawer(MenuItem menuItem) {
        Fragment myFragment = null;
        Class fragmentClass;
        switch (menuItem.getItemId()) {
            case R.id.hfst1:
                fragmentClass = Hoofdstuk1Fragment.class;
                hoofdstuk1Counter++;
                break;
            case R.id.h1_1:
                fragmentClass = Hoofdstuk1Fragment.class;
                hoofdstuk1Counter++;
                break;
            case R.id.h1_2:
                fragmentClass = Hoofdstuk1Fragment.class;
                hoofdstuk1Counter++;
                break;
            case R.id.h1_3:
                fragmentClass = Hoofdstuk1Fragment.class;
                hoofdstuk1Counter++;
                break;
            case R.id.h1_4:
                fragmentClass = Hoofdstuk1Fragment.class;
                hoofdstuk1Counter++;
                break;
            case R.id.hfst2:
                fragmentClass = Hoofdstuk2Fragment.class;
                hoofdstuk2Counter++;
                break;
            case R.id.h2_1:
                fragmentClass = Hoofdstuk2Fragment.class;
                hoofdstuk2Counter++;
                break;
            case R.id.h2_2:
                fragmentClass = Hoofdstuk2Fragment.class;
                hoofdstuk2Counter++;
                break;
            case R.id.h2_3:
                fragmentClass = Hoofdstuk2Fragment.class;
                hoofdstuk2Counter++;
                break;
            case R.id.h2_4:
                fragmentClass = Hoofdstuk2Fragment.class;
                hoofdstuk2Counter++;
                break;
            case R.id.h2_5:
                fragmentClass = Hoofdstuk2Fragment.class;
                hoofdstuk2Counter++;
                break;
            case R.id.h2_6:
                fragmentClass = Hoofdstuk2Fragment.class;
                hoofdstuk2Counter++;
                break;
            case R.id.hfst3:
                fragmentClass = Hoofdstuk3Fragment.class;
                hoofdstuk3Counter++;
                break;
            case R.id.h3_1:
                fragmentClass = Hoofdstuk3Fragment.class;
                hoofdstuk3Counter++;
                break;
            case R.id.h3_2:
                fragmentClass = Hoofdstuk3Fragment.class;
                hoofdstuk3Counter++;
                break;
            case R.id.h3_3:
                fragmentClass = Hoofdstuk3Fragment.class;
                hoofdstuk3Counter++;
                break;
            case R.id.h3_4:
                fragmentClass = Hoofdstuk3Fragment.class;
                hoofdstuk3Counter++;
                break;
            case R.id.h3_5:
                fragmentClass = Hoofdstuk3Fragment.class;
                hoofdstuk3Counter++;
                break;
            case R.id.h3_6:
                fragmentClass = Hoofdstuk3Fragment.class;
                hoofdstuk3Counter++;
                break;
            case R.id.hfst4:
                fragmentClass = Hoofdstuk4Fragment.class;
                hoofdstuk4Counter++;
                break;
            case R.id.colofon:
                fragmentClass = ColofonFragment.class;
                colofonCounter++;
                break;
            case R.id.about_handleiding:
                fragmentClass = AboutHandreikingFragment.class;
                aboutHnadreikingCounter++;
                break;
            case R.id.waarom_handreiking:
                fragmentClass = WaaromEenHandreikingFragment.class;
                waaromHandreikingCounter++;
                break;
            case R.id.inhoudsopgave:
                fragmentClass = InhoudsopgaveFragment.class;
                break;
            case R.id.statistieken:
                fragmentClass = StatistiekenFragment.class;
                break;
            case R.id.titelblad:
                fragmentClass = TitelbladFragment.class;
                titelpaginaCounter++;
                break;
            case R.id.about_App:
                fragmentClass = AboutAppFragment.class;
                break;
            default:
                fragmentClass = TitelbladFragment.class;
        }
        try {
            myFragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.flcontent, myFragment).commit();
        menuItem.setChecked(true);
        setTitle(menuItem.getTitle());
        mDrawerLayout.closeDrawers();
    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                if (item.getItemId() == R.id.statistieken){
//                    startActivity(new Intent(MainActivity.this, StatistiekenActivity.class));
//                }
                selectItemDrawer(item);
                return true;
            }
        });
    }
}