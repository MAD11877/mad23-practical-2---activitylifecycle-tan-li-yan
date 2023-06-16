package sg.edu.np.med.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User myUser = new User();
        //Saving the user's name
        String name = myUser.name;
        //saving the user's description
        String description = myUser.description;
        Button myButton = findViewById(R.id.button4);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set the boolean to not equal the orignial state when the button is clicked.
                myUser.followed = !myUser.followed;
                if(myUser.followed == false)
                {
                    myButton.setText("Follow");
                }
                else{
                    myButton.setText("Unfollow");
                }
            }
        });
    }
}