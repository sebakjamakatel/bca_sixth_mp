package app.sixthbca.revisionclass;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import app.sixthbca.R;

public class DemoLifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_demo_life_cycle);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.map), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Onstart", "I am a start method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("OnResume", "I am a resume method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("OnPause", "I am a pause method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("OnStop", "I am a stop method");
    }
}