package com.example.wjb.recyclerviewtest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {





   private List<Fruit> mFruitList;


    static class ViewHolder extends RecyclerView.ViewHolder{
          ImageView fruitImage;
          TextView fruitname;
        public ViewHolder( View view) {
            super(view);
            fruitImage=(ImageView)view.findViewById(R.id.fruit_image);
            fruitname=(TextView)view.findViewById(R.id.fruit_name);



        }
    }
    public FruitAdapter(List<Fruit> fruitList){
        mFruitList=fruitList;
    }

    public ViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {

        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fruit_item,viewGroup);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {
      Fruit fruit=mFruitList.get(i);
      holder.fruitImage.setImageResource(fruit.getImageId());
      holder.fruitname.setText(fruit.getName());

    }

    @Override
    public int getItemCount() {
        return mFruitList.size();
    }
}
