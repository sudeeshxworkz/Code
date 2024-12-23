package com.xworkz.cinema.pvr;

import com.xworkz.cinema.theatre.Theatre;

public class PVR  {
    public PVR(){
        super();
        System.out.println("PVR cons is invoked");
    }
    public String toString(){
        return getClass().getName() + "HI" + Integer.toHexString(hashCode());
    }
        public void movieName(String movieName){
        System.out.println("Movie Name:"+movieName);
    }
}
