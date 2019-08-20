package com.example.earthquakereport;

import java.lang.String;

    public class Earthquake{

        private Double mMagnitude;
        private String mPlace;
        private long mTimeInMilliseconds;
        private String mUrl;

        public Earthquake(Double magnitude,String place,long timeinMilliseconds,String url)
        {
            mMagnitude=magnitude;
            mPlace=place;
            mTimeInMilliseconds=timeinMilliseconds;
            mUrl=url;
        }
        public  Double getmMagnitude(){return mMagnitude;}
        public  String getmPlace(){ return mPlace;}
        public  long getmTimeInMilliseconds(){ return mTimeInMilliseconds;}
        public String getmUrl(){return mUrl;}


    }

