package br.com.unisys.cadastrodeclientes.holder;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import br.com.unisys.cadastrodeclientes.R;

public class ClienteHolder extends RecyclerView.ViewHolder {

    public TextView nomeCliente;
    public ImageButton btnEditar;
    public ImageButton btnExcluir;

    public ClienteHolder(View itemView) {
        super(itemView);
        nomeCliente = (TextView) itemView.findViewById(R.id.nomeCliente);
        btnEditar = (ImageButton) itemView.findViewById(R.id.btnEdit);
        btnExcluir = (ImageButton) itemView.findViewById(R.id.btnDelete);
    }
}