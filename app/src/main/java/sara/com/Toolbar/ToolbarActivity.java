package sara.com.Toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import sara.com.materialdesign.R;

public class ToolbarActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        SetupToolbar();
    }

    private void SetupToolbar() {
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        
        setSupportActionBar(toolbar);
    }
}
