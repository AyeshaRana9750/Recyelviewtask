package com.example.sportsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.ArrayList;

import Adapterclasses.playersAdapter;
import Adapterclasses.sportsAdapter;
import Adapterclasses.teamAdapter;
import Modelclasses.Playersmodel;
import Modelclasses.Sportmodel;
import Modelclasses.Teamsmodel;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewsport,recyclerViewteam,recyclerViewplayers;

ArrayList<Sportmodel> sportmodelsList=new ArrayList<>();
sportsAdapter sportAdapter;
    ArrayList<Teamsmodel> teamsList=new ArrayList<>();
    teamAdapter teamAdapter;

    ArrayList<Playersmodel> playersList=new ArrayList<>();
    playersAdapter playersAdapter;
    private EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewsport=findViewById(R.id.SportsRecycler);
        recyclerViewteam=findViewById(R.id.team_rv);
        recyclerViewplayers=findViewById(R.id.player_recyerview);

        LinearLayoutManager layoutManagersport = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,true);
        recyclerViewsport.setLayoutManager(layoutManagersport);
        LinearLayoutManager layoutManagerteams = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,true);
       recyclerViewteam.setLayoutManager(layoutManagerteams);
        LinearLayoutManager layoutManagerplayers = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,true);
        recyclerViewplayers.setLayoutManager(layoutManagerplayers);



        sportmodelsList.add(new Sportmodel("Tennis",R.drawable.ic_tennis));
        sportmodelsList.add(new Sportmodel("rugby",R.drawable.ic_rugby));
        sportmodelsList.add(new Sportmodel("soccer",R.drawable.ic_soccer));
        sportmodelsList.add(new Sportmodel("football",R.drawable.ic_football));
        sportmodelsList.add(new Sportmodel("volleyball",R.drawable.ic_volleyball));
        sportmodelsList.add(new Sportmodel("Sports",R.drawable.ic_baseline_sports_baseball_24));

        sportAdapter=new sportsAdapter(sportmodelsList,MainActivity.this);
        recyclerViewsport.setAdapter(sportAdapter);


        teamsList.add(new Teamsmodel(R.drawable.logo,"Paris Saint-","Germain","1A0000"));
        teamsList.add(new Teamsmodel(R.drawable.logo2,"Beyarn","Munchen","678983"));
        teamsList.add(new Teamsmodel(R.drawable.logo3,"Borussia","Dortmund","E1D7C6"));
        teamsList.add(new Teamsmodel(R.drawable.logo4,"ayesha","Rana","EAE7B1"));
        teamsList.add(new Teamsmodel(R.drawable.logo6,"Aqsa","naseer","AD8E70"));
        teamsList.add(new Teamsmodel(R.drawable.logo6,"Mano","billi","61876E"));


        teamAdapter =new teamAdapter(teamsList,MainActivity.this);
        recyclerViewteam.setAdapter(teamAdapter);


        playersList.add(new Playersmodel(R.drawable.babarazam,"Babar Azam"));
        playersList.add(new Playersmodel(R.drawable.logo2,"Gerard pique"));
        playersList.add(new Playersmodel(R.drawable.babarazam,"Muhammad hafeez"));
        playersList.add(new Playersmodel(R.drawable.babarazam,"AntonieGriezman"));
        playersList.add(new Playersmodel(R.drawable.babarazam,"shaheed Afridi"));

        playersAdapter =new playersAdapter(playersList,MainActivity.this);
        recyclerViewplayers.setAdapter(playersAdapter);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {



            }


        });


    }





    }
