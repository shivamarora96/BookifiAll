package com.example.sanyam.bookifyall;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends ArrayAdapter<ListViewObject> {

    Context context;
    ArrayList<ListViewObject> listViewObjects;



    public ListViewAdapter(Context context,  ArrayList<ListViewObject> listViewObjects) {
        super(context, 0 ,listViewObjects );
        this.context = context;
        this.listViewObjects = listViewObjects;
    }


    @Override
    public int getCount() {
        return  listViewObjects.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = LayoutInflater.from(this.context).inflate(R.layout.listview_item , parent , false);

        //TODO SOMETHING..... CategoryTitle and Category description...


        //TODO recyclerView



//        ArrayList<RecyclerViewObject> recyclerViewObjectArrayList  = new ArrayList<>();
//
//        //TODO ADD DATA TO ABOVE ARRAYLIST
//


        TextView current_category_title = (TextView)v.findViewById(R.id.list_item_Title);
        current_category_title.setText(listViewObjects.get(position).getmCategoryTitle());

        TextView current_description = (TextView)v.findViewById(R.id.list_item_Title_description);
        current_description.setText(listViewObjects.get(position).getmCategoryDescription());

        RecyclerView recyclerView = (RecyclerView)v.findViewById(R.id.list_item_recyclerview);
        Custom_Recycler_Adapter custom_recycler_adapter = new Custom_Recycler_Adapter(getContext() ,listViewObjects.get(position).getRecyclerViewObjectArrayList() );
        recyclerView.setAdapter(custom_recycler_adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext() , LinearLayoutManager.HORIZONTAL , false));

        return v;
    }
}


class ListViewObject {

    String mCategoryTitle;
    String mCategoryDescription;
    ArrayList<RecyclerViewObject> recyclerViewObjectArrayList ;

    public ListViewObject(String mCategoryDescription, String mCategoryTitle, ArrayList<RecyclerViewObject> recyclerViewObjectArrayList) {
        this.mCategoryDescription = mCategoryDescription;
        this.mCategoryTitle = mCategoryTitle;
        this.recyclerViewObjectArrayList = recyclerViewObjectArrayList;
    }


    public String getmCategoryDescription() {
        return mCategoryDescription;
    }

    public void setmCategoryDescription(String mCategoryDescription) {
        this.mCategoryDescription = mCategoryDescription;
    }

    public String getmCategoryTitle() {
        return mCategoryTitle;
    }

    public void setmCategoryTitle(String mCategoryTitle) {
        this.mCategoryTitle = mCategoryTitle;
    }

    public ArrayList<RecyclerViewObject> getRecyclerViewObjectArrayList() {
        return recyclerViewObjectArrayList;
    }

    public void setRecyclerViewObjectArrayList(ArrayList<RecyclerViewObject> recyclerViewObjectArrayList) {
        this.recyclerViewObjectArrayList = recyclerViewObjectArrayList;
    }
}
