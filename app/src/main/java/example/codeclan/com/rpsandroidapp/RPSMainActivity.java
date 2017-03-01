package example.codeclan.com.rpsandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class RPSMainActivity extends AppCompatActivity {

    TextView scoreTitle;
    TextView score;
    TextView rockText;
    Button rockbtn;
    TextView paperText;
    Button paperbtn;
    TextView scissorsText;
    Button scissorsbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpsmain);

        scoreTitle = (TextView) findViewById(R.id.scoreTitle);
        score = (TextView) findViewById(R.id.scoreTally);
        rockText = (TextView) findViewById(R.id.RockView);
        rockbtn = (Button) findViewById(R.id.RockBtn);
        paperText = (TextView) findViewById(R.id.PaperView);
        paperbtn = (Button) findViewById(R.id.PaperBtn);
        scissorsText = (TextView) findViewById(R.id.ScissorsView);
        scissorsbtn = (Button) findViewById(R.id.ScissorsBtn);

    }

    public void onRPSClick(){

    }


}
