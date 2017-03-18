package souza.hm.com.signos;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView ListaSignos;
    private String[] signos= {
            "Aries","Touro","Gemeos","Cancer","Leao","Virgem","Libra","Escorpiao","Sagitario","Capricornio","Aquario","Peixes"
    };
    private String[] perfis={
            startActivity(new Intent(MainActivity.this,TelaActivity.class))
            ,"Touro legal","Gemeos 2","Cancer é doença","Leao é animal","Virgem = 1",
            "Libra é doki","Escorpiao zodiaco","Sagitario legal","Capricornio sei la","Aquario house","Peixes food"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListaSignos=(ListView) findViewById(R.id.ListViewID);
        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(
                getApplicationContext(),android.R.layout.simple_list_item_1,android.R.id.text1,signos
                );
        ListaSignos.setAdapter(adaptador);
        ListaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int codigoPosi=position;
                Toast.makeText(getApplicationContext(),perfis[codigoPosi],Toast.LENGTH_LONG).show();

            }
        });

    }
}
