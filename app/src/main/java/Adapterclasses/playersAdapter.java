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
import Modelclasses.Teamsmodel;


public class playersAdapter extends RecyclerView.Adapter<playersAdapter.Viewholder> {

    ArrayList<Playersmodel> playerList;
    Context context;

    public playersAdapter(ArrayList<Playersmodel> playerList, Context context) {
        this.playerList = playerList;
        this.context = context;
    }


    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.players_details,parent,false);
        Viewholder viewholder=new Viewholder(view);
        return viewholder;


    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        Playersmodel playersmodel=playerList.get(position);
        holder.playersname.setText(playersmodel.getPlayername());
       holder.playerimgs.setImageResource(playersmodel.getPlayersimgs());

    }

    @Override
    public int getItemCount() {

return playerList.size();

    }

    public class Viewholder extends RecyclerView.ViewHolder{
        ImageView playerimgs;
        TextView playersname;
        LinearLayout linearLayout;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            playerimgs=itemView.findViewById(R.id.player_image);
            playersname=itemView.findViewById(R.id.player_txt3);
            linearLayout=itemView.findViewById(R.id.player_llp);
        }
    }
}
