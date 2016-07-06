package maximbravo.com.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView popularMovies = (TextView) findViewById(R.id.project_popular_movies);
        popularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t = Toast.makeText(getApplicationContext(), "This will show my Popular Movies App", Toast.LENGTH_SHORT);
                t.show();
            }
        });
        TextView stockHawk = (TextView) findViewById(R.id.project_stock_hawk);
        stockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t = Toast.makeText(getApplicationContext(), "This will show my Stock Hawk App", Toast.LENGTH_SHORT);
                t.show();
            }
        });
        TextView buildItBigger = (TextView) findViewById(R.id.project_build_it_bigger);
        buildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t = Toast.makeText(getApplicationContext(), "This will show my Build It Bigger App", Toast.LENGTH_SHORT);
                t.show();
            }
        });
        TextView makeYourAppMaterial = (TextView) findViewById(R.id.project_make_your_app_material);
        makeYourAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t = Toast.makeText(getApplicationContext(), "This will show my Material App", Toast.LENGTH_SHORT);
                t.show();
            }
        });
        TextView goUbiquitous = (TextView) findViewById(R.id.project_go_ubiquitous);
        goUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t = Toast.makeText(getApplicationContext(), "This will show my Ubiquitous App", Toast.LENGTH_SHORT);
                t.show();
            }
        });
        TextView capstone = (TextView) findViewById(R.id.project_capstone);
        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t = Toast.makeText(getApplicationContext(), "This will show my Capstone App", Toast.LENGTH_SHORT);
                t.show();
            }
        });

    }
}
