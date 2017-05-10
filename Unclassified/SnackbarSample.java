package souza.hm.com.snackteste;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //compile 'com.android.support:design:23.2.1'
    }
    public void clicl(View view)
    {
        Snackbar snackbar = Snackbar
                .make(view, "www.hsouza.com", Snackbar.LENGTH_LONG);
        snackbar.show();
        snackbar.setAction("acaosnack", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("loggg","click");
            }
        });
    }
}
