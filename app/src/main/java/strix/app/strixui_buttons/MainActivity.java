package strix.app.strixui_buttons;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*Created by Strix - http://strixdev.co.uk*/

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CreateButtonListener();

    }

    public void CreateButtonListener() {

        button = findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent browserIntent =
                        new Intent(Intent.ACTION_VIEW, Uri.parse("http://strixdev.co.uk"));
                startActivity(browserIntent);

            }

        });

    }
}