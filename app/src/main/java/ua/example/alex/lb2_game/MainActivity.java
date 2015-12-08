package ua.example.alex.lb2_game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick_Pre(View view) {
        Intent clk=new Intent(this, Pre_History.class);
        startActivity(clk);
    }
    public void onClick_Start(View view){
        Intent clk = new Intent(this, maingame.class);
        startActivity(clk);
    }
}
