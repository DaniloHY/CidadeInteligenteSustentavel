package br.com.etecia.cidadeinteligentesustentavel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Context mContexto;
    private List<DescLixo> listaLixo;

    public MyAdapter(Context mContexto, List<DescLixo> listaLixo) {
        this.mContexto = mContexto;
        this.listaLixo = listaLixo;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView idCausaLixo;
        ImageView idImgLixo;
        CardView idCardViewLixo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idCausaLixo = itemView.findViewById(R.id.idCausaLixo);
            idImgLixo = itemView.findViewById(R.id.idImglixo);
            idCardViewLixo = itemView.findViewById(R.id.idCardViewLixo);
        }
    }
}
