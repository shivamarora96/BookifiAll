package com.example.sanyam.bookifyall;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ShivamArora on 01-08-2016.
 */
public class Custom_Recycler_Adapter extends RecyclerView.Adapter<CustomHolder> {

Context context ;
    ArrayList<RecyclerViewObject> recyclerViewObjectArrayList;


    public Custom_Recycler_Adapter(Context context, ArrayList<RecyclerViewObject> recyclerViewObjectArrayList) {
        this.context = context;
        this.recyclerViewObjectArrayList = recyclerViewObjectArrayList;
    }

    @Override
    public CustomHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View recyclerView = LayoutInflater.from(this.context).inflate(R.layout.recyclerview_item , parent , false);
        CustomHolder customHolder = new CustomHolder(recyclerView);
        return customHolder;
    }

    @Override
    public void onBindViewHolder(CustomHolder holder, int position) {
        RecyclerViewObject currentrecyclerViewObject = recyclerViewObjectArrayList.get(position);
        //TODO    FInd textview from holder and update it
    }

    @Override
    public int getItemCount() {
        return recyclerViewObjectArrayList.size();
    }
}


//Recycler Object.................................................................

class RecyclerViewObject {


    String mBookTitle ;
    String mBookDescription ;
    String mImageUrl ;

    public RecyclerViewObject(String mBookDescription, String mBookTitle, String mImageUrl) {
        this.mBookDescription = mBookDescription;
        this.mBookTitle = mBookTitle;
        this.mImageUrl = mImageUrl;
    }

    public String getmBookDescription() {
        return mBookDescription;
    }

    public void setmBookDescription(String mBookDescription) {
        this.mBookDescription = mBookDescription;
    }

    public String getmBookTitle() {
        return mBookTitle;
    }

    public void setmBookTitle(String mBookTitle) {
        this.mBookTitle = mBookTitle;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }
}








// Holder..........................................................................

class CustomHolder extends RecyclerView.ViewHolder{

    TextView mBookTitle_textView;
    TextView mBookDescription_textView;
    ImageView mBookPoster_ImageView;

    public CustomHolder(View itemView) {
        super(itemView);

//TODO  FIND ABOVE PARAMETERS

    }


    public TextView getmBookDescription_textView() {
        return mBookDescription_textView;
    }

    public ImageView getmBookPoster_ImageView() {
        return mBookPoster_ImageView;
    }

    public TextView getmBookTitle_textView() {
        return mBookTitle_textView;
    }
}