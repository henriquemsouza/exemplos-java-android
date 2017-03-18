package com.hm.souza.trytodofloatingbtn;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private ListView ListaItens;
    private FloatingActionButton FAB1;

    private String[] itens={
            "intro","IDE","TESTE1","teste2","1","2","3","5","6","7","8","9"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FAB1=(FloatingActionButton)findViewById(R.id.FabBtnID );
        FAB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( MainActivity.this, Main2Activity.class ));


            }
        });


        ListaItens=(ListView)findViewById(R.id.ListViewID);
        ArrayAdapter<String> adapatador= new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,
                android.R.id.text1, itens);
        //
        //


        ListaItens.setAdapter(adapatador);


        ListaItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {

                int codigoPos=position;
                String valorCliacado= ListaItens.getItemAtPosition(codigoPos).toString();
                Toast.makeText(getApplicationContext(),valorCliacado,Toast.LENGTH_LONG).show();
            }
        });


    }
}
