package com.example.sanyam.bookifyall;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class Custom_Fragment extends Fragment {

    ListView category_ListView ;
    ListViewAdapter listViewAdapter;
    ArrayList<ListViewObject> listViewObjectsArryaList;


    public Custom_Fragment() {
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_custom_ , container ,false);
        category_ListView = (ListView)view.findViewById(R.id.custom_fragment_layout_listview);

        listViewObjectsArryaList = new ArrayList<>();
        //TODO ADD ITEM TO ARRAYLIST

        //Testing...........................................



        ArrayList<RecyclerViewObject>  current_recyclerViewObjectArrayList = new ArrayList<>();
        current_recyclerViewObjectArrayList.add(new RecyclerViewObject("This is BOOK " , "Book 1" , null));
        current_recyclerViewObjectArrayList.add(new RecyclerViewObject("This is BOOK " , "Book 2" , null));
        current_recyclerViewObjectArrayList.add(new RecyclerViewObject("This is BOOK " , "Book 3" , null));
        current_recyclerViewObjectArrayList.add(new RecyclerViewObject("This is BOOK " , "Book 4" , null));
        current_recyclerViewObjectArrayList.add(new RecyclerViewObject("This is BOOK " , "Book 5" , null));
        listViewObjectsArryaList.add(new ListViewObject("This is Category1" , "Category 1 !! " , current_recyclerViewObjectArrayList ));



          current_recyclerViewObjectArrayList = new ArrayList<>();
        current_recyclerViewObjectArrayList.add(new RecyclerViewObject("This is BOOK " , "Book 1" , null));
        current_recyclerViewObjectArrayList.add(new RecyclerViewObject("This is BOOK " , "Book 2" , null));
        current_recyclerViewObjectArrayList.add(new RecyclerViewObject("This is BOOK " , "Book 3" , null));
        current_recyclerViewObjectArrayList.add(new RecyclerViewObject("This is BOOK " , "Book 4" , null));
        current_recyclerViewObjectArrayList.add(new RecyclerViewObject("This is BOOK " , "Book 5" , null));
        listViewObjectsArryaList.add(new ListViewObject("This is Category1" , "Category 1 !! " , current_recyclerViewObjectArrayList ));





        current_recyclerViewObjectArrayList = new ArrayList<>();
        current_recyclerViewObjectArrayList.add(new RecyclerViewObject("This is BOOK " , "Book 1" , null));
        current_recyclerViewObjectArrayList.add(new RecyclerViewObject("This is BOOK " , "Book 2" , null));
        current_recyclerViewObjectArrayList.add(new RecyclerViewObject("This is BOOK " , "Book 3" , null));
        current_recyclerViewObjectArrayList.add(new RecyclerViewObject("This is BOOK " , "Book 4" , null));
        current_recyclerViewObjectArrayList.add(new RecyclerViewObject("This is BOOK " , "Book 5" , null));
        listViewObjectsArryaList.add(new ListViewObject("This is Category1" , "Category 1 !! " , current_recyclerViewObjectArrayList ));




          current_recyclerViewObjectArrayList = new ArrayList<>();
        current_recyclerViewObjectArrayList.add(new RecyclerViewObject("This is BOOK " , "Book 1" , null));
        current_recyclerViewObjectArrayList.add(new RecyclerViewObject("This is BOOK " , "Book 2" , null));
        current_recyclerViewObjectArrayList.add(new RecyclerViewObject("This is BOOK " , "Book 3" , null));
        current_recyclerViewObjectArrayList.add(new RecyclerViewObject("This is BOOK " , "Book 4" , null));
        current_recyclerViewObjectArrayList.add(new RecyclerViewObject("This is BOOK " , "Book 5" , null));
        listViewObjectsArryaList.add(new ListViewObject("This is Category1" , "Category 1 !! " , current_recyclerViewObjectArrayList ));




        listViewAdapter = new ListViewAdapter(getContext() , listViewObjectsArryaList);
        category_ListView.setAdapter(listViewAdapter);

        return view ;
    }
}
