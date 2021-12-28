package com.opra.lms;

import android.app.ProgressDialog;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class session extends AppCompatActivity {
VideoView video;
String url="https://rr5---sn-cvh7knzr.googlevideo.com/videoplayback?expire=1640705290&ei=qtjKYf3_A6TI4-EPvdkW&ip=2409%3A4042%3A2703%3Ab7bd%3A90f6%3A4ccb%3A1727%3A3949&id=o-ANGfYHqHyk0rgF28uiolaYpyKBxe_ajOFwX923OixRm_&itag=22&source=youtube&requiressl=yes&vprv=1&mime=video%2Fmp4&ns=zVJxTBlXDBrsvRjcV8B7qowG&cnr=14&ratebypass=yes&dur=252.238&lmt=1577620360213379&fexp=24001373,24007246&c=WEB&txp=5535432&n=OPUQkjLMSnp7FlOV&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cns%2Ccnr%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRgIhAPJ6tffw6jYEvJ_9BKuVYwZjeRKLck3uloXJ6qAZYRifAiEAmneyJgAGB_6Pe1gFDG3wobgAit87KkXX2W6cBpBjvlE%3D&rm=sn-gwpa-o5bee76,sn-gwpa-cvhy7l&req_id=3ea5495afa98a3ee&redirect_counter=2&cms_redirect=yes&ipbypass=yes&mh=Y3&mm=30&mn=sn-cvh7knzr&ms=nxu&mt=1640685633&mv=m&mvi=5&pl=41&lsparams=ipbypass,mh,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIhAKSE9xJRWQnPvZEt2vn_f3FCMyGCBmGrbCjL0z6LGL40AiAzNEJyuG8mKMMMvjQkrN9pBZ-kMqZY7WkrR2WPI2DBkw%3D%3D";
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