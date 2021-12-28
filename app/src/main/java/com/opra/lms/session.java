package com.opra.lms;

import android.app.ProgressDialog;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class session extends AppCompatActivity {
VideoView video;
String url="https://vod-progressive.akamaized.net/exp=1640691886~acl=%2Fvimeo-prod-skyfire-std-us%2F01%2F2126%2F26%2F660631341%2F3036970847.mp4~hmac=1360d9ce7e46993c0072e857cfc90a110e6c5a3f5ae4e54547cc6388de4e6f15/vimeo-prod-skyfire-std-us/01/2126/26/660631341/3036970847.mp4";
ProgressDialog pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session);
        video= findViewById(R.id.videoView);
        pd = new ProgressDialog(session.this);
        pd.setMessage("Buffering...");
        pd.show();
        Uri uri= Uri.parse(url);
        video.setVideoURI(uri);
        video.start();
        video.setOnPreparedListener(mp -> pd.dismiss());

    }
}