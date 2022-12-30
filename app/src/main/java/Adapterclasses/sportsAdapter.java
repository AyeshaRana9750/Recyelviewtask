package Adapterclasses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sportsapp.MainActivity;
import com.example.sportsapp.R;

import java.util.ArrayList;

import Modelclasses.Playersmodel;
import Modelclasses.Sportmodel;
import Modelclasses.Teamsmodel;

public class sportsAdapter extends RecyclerView.Adapter<sportsAdapter.ViewHolder>{

    ArrayList<Sportmodel>sportList;
    Context context;

    public sportsAdapter(ArrayList<Sportmodel> sportList, Context context) {
        this.sportList = sportList;
        this.context = context;
    }
    //    Sportmodel[] sportmodelsList;
//    Context context;
//
//    public sportsAdapter(ArrayList<Sportmodel> sportmodelsList, MainActivity activity) {
//        this.sportmodelsList = sportmodelsList.toArray(new Sportmodel[0]);
//        this.context = activity;
//
//
//    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.sport_details,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       Sportmodel sportmodel=sportList.get(position);

       holder.sportimg.setImageResource(sportmodel.getSportimg());
       holder.sportnme.setText(sportmodel.getSporttext());


    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       ImageView sportimg;
       TextView sportnme;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            sportimg =itemView.findViewById(R.id.sport_imgview);
            sportnme=itemView.findViewById(R.id.sport_tv1);
        }
    }
}
