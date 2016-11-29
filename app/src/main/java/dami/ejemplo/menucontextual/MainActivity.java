package dami.ejemplo.menucontextual;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.simpleBtn);
        registerForContextMenu(mButton);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu,v,menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_contextual, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.itemRojo:
                mButton.setBackgroundColor(Color.RED);
                return true;
            case R.id.itemAzul:
                mButton.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.itemVerde:
                mButton.setBackgroundColor(Color.GREEN);
                return true;
            default:
                return super.onContextItemSelected(item);

        }

    }
}
