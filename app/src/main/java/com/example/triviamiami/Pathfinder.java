package com.example.triviamiami;

import java.util.ArrayList;

public class Pathfinder {

    public Pathfinder(){
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < 11; i++){
            list.add(i);
        }
    }

    public Pathfinder(int id){

    }

    public int findNextActivity(ArrayList<Integer> list, int activityID){
        for (int i = 0; i < list.size(); i++){
            if(list.get(i) == activityID){

            }
        }

        return 5;
    }
}
