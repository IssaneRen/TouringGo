package soafinal.tourtest;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;

public class Main extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void myInfo(View view) {
        Intent intent = new Intent();
        intent.setClass(Main.this, MyInfo.class);
        startActivity(intent);
    }
    public void map(View view){
        Intent intent = new Intent();
        intent.setClass(Main.this,Map.class);
        startActivity(intent);
    }
}