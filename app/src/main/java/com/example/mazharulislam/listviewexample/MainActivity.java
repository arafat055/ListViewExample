package com.example.mazharulislam.listviewexample;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {
    ListView list;
//    String[] web = {
//            "Google Plus",
//            "Twitter",
//            "Windows",
//            "Bing",
//            "Itunes",
//            "Wordpress",
//            "Drupal"
//    } ;
    Integer[] imageId = {
            R.drawable.cat_edu,
            R.drawable.cat_fun,
            R.drawable.cat_govt,
            R.drawable.cat_health,
            R.drawable.cat_job,
            R.drawable.cat_law,
            R.drawable.cat_money

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomList adapter = new
                CustomList(MainActivity.this, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " , Toast.LENGTH_SHORT).show();

            }
        });

    }

}