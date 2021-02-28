package com.android.musicplayer;

public class MainModel
{
    Integer artists;
    String artist_name;

    public MainModel(Integer artists,String artist_name)
    {
        this.artists = artists;
        this.artist_name = artist_name;
    }
    public Integer getArtists()
    {
        return artists;
    }
    public String getArtist_name()
    {
        return artist_name;
    }


}
