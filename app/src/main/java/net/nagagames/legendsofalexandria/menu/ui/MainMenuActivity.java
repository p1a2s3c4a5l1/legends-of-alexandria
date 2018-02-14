package net.nagagames.legendsofalexandria.menu.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import net.nagagames.legendsofalexandria.R;


/**
 * This is becoming the main menu screen
 *
 * @author Raphael Million
 */
public class MainMenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }


    public void toast(View v) {
        Toast t = Toast.makeText(this,"Du magst Bananen", Toast.LENGTH_LONG);
        t.show();
    }
}
