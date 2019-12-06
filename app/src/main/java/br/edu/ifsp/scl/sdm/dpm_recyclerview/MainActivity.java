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
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();
    private ArrayList<String> arraylistItens = new ArrayList<>();
    private AdapterListItens mAdapter;
    private RecyclerView listaItens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.mViewHolder.listItens = findViewById(R.id.list_item);

        // cria o LayoutManager
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getApplicationContext());

        // configura o layout manager no recyclerview
        mViewHolder.listItens.setLayoutManager(lm);

        // cria o adapter, passando o arraylist no construtor
       //  AdapterListItens adapter = new AdapterListItens(arraylistItens);
        mAdapter = new AdapterListItens(geraProdutos());

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

    private ArrayList<Product> geraProdutos() {
        ArrayList<Product> list = new ArrayList<>();
        list.add(
                new Product(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.drawable.macbook)
        );
        list.add(
                new Product(
                        2,
                        "Dell Inspiron 7000 Core i5 7th Gen - (8 GB/1 TB HDD/Windows 10 Home)",
                        "14 inch, Gray, 1.659 kg",
                        4.3,
                        60000,
                        R.drawable.dellinspiron)
        );
        list.add(
                new Product(
                        3,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.drawable.surface)
        );
        list.add(
                new Product(
                        4,
                        "Iphone 4, 1GB 16G Memororia ",
                        "Iphone 4, 5x9 cm, 170g",
                        4.2,
                        10000,
                        R.drawable.macbook)
        );

        list.add(
                new Product(
                        5,
                        "Iphone 5, 2GB 32G Memoria ",
                        "Iphone 5, 5x9 cm, 170g",
                        5,
                        20000,
                        R.drawable.surface)
        );

        list.add(
                new Product(
                        6,
                        "Iphone 6, 4GB 64G Memoria,5x10 cm, 320g ",
                        "Iphone 6",
                        5.5,
                        30000,
                        R.drawable.macbook)
        );

        list.add(
                new Product(
                        7,
                        "Iphone 7, 8GB 128G Memoria, 5x10 cm, 320g",
                        "Iphone 7, ",
                        6.0,
                        40000,
                        R.drawable.surface)
        );

        list.add(
                new Product(
                        7,
                        "Iphone 7, 8GB 128G Memoria, 5x10 cm, 320g",
                        "Iphone 7, ",
                        6.0,
                        40000,
                        R.drawable.surface)
        );

        list.add(
                new Product(
                        8,
                        "Iphone 8, 16GB 256G Memoria, 5x10 cm, 320g",
                        "Iphone 8, ",
                        6.5,
                        50000,
                        R.drawable.star_off)
        );

        list.add(
                new Product(
                        9,
                        "Iphone 9, 32GB 512G Memoria, 10x10 cm, 500g",
                        "Iphone 9, ",
                        7.0,
                        60000,
                        R.drawable.star)
        );
        list.add(
                new Product(
                        10,
                        "Iphone 10, 64GB 1TG Memoria, 15x10 cm, 500g",
                        "Iphone 10, ",
                        8.0,
                        80000,
                        R.drawable.star)
        );
        list.add(
                new Product(
                        11,
                        "Iphone 11, 128GB 2TG Memoria, 15x10 cm, 500g",
                        "Iphone 11, ",
                        8.0,
                        120000,
                        R.drawable.surface)
        );
        return list;
    }
}
