package uih.chalermpol_k.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //  Explicit ประกาศตัวแปร
    private ListView trafficListView;
    private Button aboutmeButton;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //  Bind Widget
        bindwidget();

    }   // Main Method

    private void bindwidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutmeButton = (button) findViewById(R.id.button);
    }

}   // Main Class
