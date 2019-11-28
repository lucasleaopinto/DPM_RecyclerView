package br.edu.ifsp.scl.sdm.dpm_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterListItens extends RecyclerView.Adapter<AdapterListItens.SaveListItens> {

    private TextView text;
    private ArrayList<String> listItens;

    public AdapterListItens(ArrayList<String> listItens) {
        this.listItens = listItens;
    }

    @NonNull
    @Override
    public SaveListItens onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        LayoutInflater li = LayoutInflater.from(viewGroup.getContext());
        View view = li.inflate(android.R.layout.simple_list_item_1, viewGroup, false);

        return new SaveListItens(view);
    }

    public class SaveListItens extends RecyclerView.ViewHolder {

        public SaveListItens(@NonNull View itemView) {
            super(itemView);

            text = itemView.findViewById(R.id.text);

        }
    }


    @Override
    public void onBindViewHolder(@NonNull SaveListItens holder, int position) {

        holder.text1.setText(listItens.get(position));
    }

    @Override
    public int getItemCount() {
        return listItens.size();
    }


}
