package com.example.bolabesar2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ball_adapter extends BaseAdapter {
        private Context context;
        private ArrayList<Ball> balls;

        public void setBalls(ArrayList<Ball>balls){
            this.balls=balls;
        }
        public ball_adapter(Context context){
            this.context = context;
            balls = new ArrayList<>();
        }

    @Override
    public int getCount() {
        return balls.size();
    }

    @Override
    public Object getItem(int i) {
        return balls.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_ball, viewGroup, false);
            }
            ViewHolder viewHolder = new ViewHolder(view);
            Ball ball = (Ball) getItem(i);
            viewHolder.bind(ball);
            return view;
    }
}
    class ViewHolder {
        private TextView txtName;
        private TextView txtDescription;
        private ImageView imgPhoto;
        ViewHolder(View view) {
            txtName = view.findViewById(R.id.txt_name);
            txtDescription = view.findViewById(R.id.txt_description);
            imgPhoto = view.findViewById(R.id.img_photo);
            }
        void bind(Ball ball) {
            txtName.setText(ball.getName());
            txtDescription.setText(ball.getDescription());
            imgPhoto.setImageResource(ball.getPhoto());
            }
    }