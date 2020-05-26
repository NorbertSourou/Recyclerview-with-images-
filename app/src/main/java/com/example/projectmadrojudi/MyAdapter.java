package com.example.projectmadrojudi;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Item[] listdata;

    // RecyclerView recyclerView;
    public MyAdapter(Item[] listdata) {
        this.listdata = listdata;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.list_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Item myListData = listdata[position];
        holder.titre.setText("Titre : " + listdata[position].getTitle());
        holder.date.setText("Date : " + listdata[position].getDate());
        holder.description.setText(listdata[position].getDescriprion());

      //  holder.imageView.setImageResource(new DownloadImageFromInternet(.execute(listdata[position].getImage()));

    }


    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        protected ImageView imageView;
        public TextView titre, date, description;
        public LinearLayout relativeLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            // this.imageView = (ImageView) itemView.findViewById(R.id.);
            this.titre = (TextView) itemView.findViewById(R.id.titre);
            this.date = (TextView) itemView.findViewById(R.id.date);
            this.description = (TextView) itemView.findViewById(R.id.description);
            this.imageView = (ImageView) itemView.findViewById(R.id.image);
            relativeLayout = (LinearLayout) itemView.findViewById(R.id.linearLayout);
        }
    }
}