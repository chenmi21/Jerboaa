package com.example.danchen.jerboa.Model;

import android.content.Context;

/**
 * Created by mshzhb on 9/1/2015.
 */
public class ProductCardView
{
    public String name;
    public String picName;
    public int id;

    public ProductCardView(String name, String picName, int id)
    {
        this.name = name;
        this.picName = picName;
        this.id = id;
    }

    public int getImageResourceId( Context context )
    {
        try
        {
            return context.getResources().getIdentifier(this.picName, "drawable", context.getPackageName());

        }
        catch (Exception e)
        {
            e.printStackTrace();
            return -1;
        }
    }

    public String getPicName(){
        return this.picName;
    }
    public int getId() { return this.id; }
}