package com.example.abhin.iot;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ProductAdapter2 extends RecyclerView.Adapter<ProductAdapter2.ProductViewHolder> {


    private Context mCtx;
    private List<STable> productList2;

    public ProductAdapter2(Context mCtx, List<STable> productList) {
        this.mCtx = mCtx;
        this.productList2 = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.stable, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        STable product = productList2.get(position);

        holder.textViewCourse.setText(product.getCourse_id());
        holder.textViewCName.setText(product.getCourse_name());
        holder.textViewAttendance.setText(String.valueOf(product.getAttendance()));
        holder.textViewLecture.setText(String.valueOf(product.getLectures()));
    }

    @Override
    public int getItemCount() {
        return productList2.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewCourse, textViewCName, textViewAttendance, textViewLecture;

        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewCourse = itemView.findViewById(R.id.textViewCourse);
            textViewCName = itemView.findViewById(R.id.textViewCName);
            textViewAttendance = itemView.findViewById(R.id.textViewAttendance);
            textViewLecture = itemView.findViewById(R.id.textViewLecture);
        }
    }
}