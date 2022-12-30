package Adapterclasses;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sportsapp.MainActivity;
import com.example.sportsapp.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

import Modelclasses.Teamsmodel;

public class teamAdapter extends RecyclerView.Adapter<teamAdapter.ViewHolder> {
   ArrayList<Teamsmodel>teamList;
   Context  context;

    public teamAdapter(ArrayList<Teamsmodel> teamList, Context context) {
        this.teamList = teamList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.teams_details,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       Teamsmodel teamsmodel=teamList.get(position);
        holder.teamimg.setImageResource(teamsmodel.getTeamimg());
        holder.teamname.setText(teamsmodel.getTeamname());
        holder.textView.setText(teamsmodel.getTeamname2());

        holder.cardView.setBackgroundColor(Color.parseColor(teamsmodel.getColor()));




    }

    @Override
    public int getItemCount() {
        return teamList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView teamimg;
        TextView teamname;
        TextView textView;
       CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            teamimg =itemView.findViewById(R.id.team_img);
            teamname=itemView.findViewById(R.id.team_text1);
            textView=itemView.findViewById(R.id.team_text2);
            cardView=itemView.findViewById(R.id.CardLayout);
        }
    }
}
