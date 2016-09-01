package xyz.fmsoft.fortuneteller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button fortuneButton;
    private TextView fortune;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fortuneButton = (Button)findViewById(R.id.fortune_button);
        fortune = (TextView)findViewById(R.id.text_fortune);

    }

    public void pickFortune(){
        String[] fortunes = getResources().getStringArray(R.array.fortunes);
        Random random = new Random();

        fortune.setText(fortunes[random.nextInt(8)]);

    }

    public void onClick(View v){

        switch (v.getId()){
            case R.id.fortune_button:
                pickFortune();
                break;
        }
    }
}
