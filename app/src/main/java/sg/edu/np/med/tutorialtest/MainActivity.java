package sg.edu.np.med.tutorialtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View v){
        Button btn = (Button) findViewById(R.id.button);
        if(btn.getText().equals("Follow")){
            btn.setText("Unfollow");
        }
        else{
            btn.setText("Follow");
        }

    }
}