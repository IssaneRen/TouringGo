package soafinal.tourtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import cn.bmob.v3.BmobUser;


public class MyInfo extends AppCompatActivity {
     private TextView user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myinfo);
        BmobUser bmobUser=BmobUser.getCurrentUser();
        user = (TextView) findViewById(R.id.user);
        user.setText(bmobUser.getUsername());
    }
    public void Bkmain(View view){
        Intent intent = new Intent();
        intent.setClass(MyInfo.this, Main.class);
        startActivity(intent);
    }
    public void logout(View view){
        BmobUser bmobUser=BmobUser.getCurrentUser();
        if(bmobUser!=null) {
            BmobUser.logOut();
            BmobUser currentUser = BmobUser.getCurrentUser();
            Intent intent = new Intent();
            intent.setClass(MyInfo.this, LoginActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "当前未登录！", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent();
            intent.setClass(MyInfo.this, LoginActivity.class);
            startActivity(intent);
        }

    }

}