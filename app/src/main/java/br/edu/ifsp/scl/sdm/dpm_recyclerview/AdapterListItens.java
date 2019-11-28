package br.edu.ifsp.scl.sdm.dpm_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterListItens extends RecyclerView.Adapter<AdapterListItens.SaveListItens> {


    private List<String> listItens;

    public AdapterListItens() {
        this.listItens = new ArrayList<>();
    }

    public void addItem(String item){
        this.listItens.add(item);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SaveListItens onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        LayoutInflater li = LayoutInflater.from(viewGroup.getContext());
        View view = li.inflate(android.R.layout.simple_list_item_1, viewGroup, false);

        return new SaveListItens(view);
    }

    public class SaveListItens extends RecyclerView.ViewHolder {

        private TextView text1;
        public SaveListItens(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(android.R.id.text1);
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
