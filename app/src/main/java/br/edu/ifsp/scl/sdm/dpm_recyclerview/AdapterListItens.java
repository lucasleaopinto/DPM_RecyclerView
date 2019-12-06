package br.edu.ifsp.scl.sdm.dpm_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterListItens extends RecyclerView.Adapter<AdapterListItens.SaveListItens> {


    private List<Product> listItens;

    public AdapterListItens(ArrayList<Product> products) {

        this.listItens = products;
    }

    public void addItem(Product item) {
        this.listItens.add(item);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SaveListItens onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        LayoutInflater li = LayoutInflater.from(viewGroup.getContext());
        View view = li.inflate(R.layout.list_layout, viewGroup, false);

        return new SaveListItens(view);
    }

    public class SaveListItens extends RecyclerView.ViewHolder {

        private TextView lblTitulo;
        private TextView lblDescricao;
        private TextView lblRating;
        private TextView lblPreco;
        private ImageView imgFoto;

        // codigo aqui do cardwiew
        public SaveListItens(@NonNull View itemView) {
            super(itemView);
           // text1 = itemView.findViewById(android.R.id.text1);

            lblTitulo = itemView.findViewById(R.id.lblTitulo);
            lblDescricao = itemView.findViewById(R.id.lblDescricao);
            lblRating = itemView.findViewById(R.id.lblRating);
            lblPreco = itemView.findViewById(R.id.lblPreco);
            imgFoto = itemView.findViewById(R.id.imgFoto);
        }
    }


    @Override
    public void onBindViewHolder(@NonNull SaveListItens holder, int position) {


        Product product = listItens.get(position);

        holder.lblTitulo.setText(product.getTitle());
        holder.lblDescricao.setText(product.getShortdesc());
        holder.lblRating.setText(String.valueOf(product.getRate()));
        holder.lblPreco.setText(String.valueOf(product.getPrice()));
        holder.imgFoto.setImageResource(product.getImage());

    }

    @Override
    public int getItemCount() {
        return listItens.size();
    }


}
