package br.edu.ifsp.scl.sdm.dpm_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();
    private ArrayList<String> arraylistItens = new ArrayList<>();
    private AdapterListItens mAdapter;

    private RecyclerView listaItens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.mViewHolder.txtItem = findViewById(R.id.txt_item);
        this.mViewHolder.btnBuscar = findViewById(R.id.btn_buscar);
        this.mViewHolder.listItens = findViewById(R.id.list_item);

        this.mViewHolder.btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String item;

                item = mViewHolder.txtItem.getText().toString();
                mAdapter.addItem(item);
                mViewHolder.txtItem.setText("");

            }
        });

        // cria o LayoutManager
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getApplicationContext());

        // configura o layout manager no recyclerview
        mViewHolder.listItens.setLayoutManager(lm);

        // cria o adapter, passando o arraylist no construtor
       //  AdapterListItens adapter = new AdapterListItens(arraylistItens);
        mAdapter = new AdapterListItens();


        // configura o adapter no recyclerview
        mViewHolder.listItens.setAdapter(mAdapter);

        // otimizacao do recyclerview
        mViewHolder.listItens.setHasFixedSize(true);

        // cria uma linha horizontal
        DividerItemDecoration linha = new DividerItemDecoration(this, LinearLayout.VERTICAL);
        // configura a linha horizontal no recyclerview
        mViewHolder.listItens.addItemDecoration(linha);

    }

    public static class ViewHolder {
        EditText txtItem;
        Button btnBuscar;
        RecyclerView listItens;
    }
}
