package br.edu.list.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class principal extends AppCompatActivity {

    private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        pessoas.add(new Pessoa("Joana"));
        pessoas.add(new Pessoa("Rogério"));
        pessoas.add(new Pessoa("Adriana"));

        listView = (ListView) findViewById(R.id.listaPessoas);

        ArrayAdapter<Pessoa> adapter = new ArrayAdapter<Pessoa>(this,android.R.layout.simple_list_item_1,pessoas);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Selecionado: "+position,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
