package taqbir.alam.com.javaforfun;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class ActivityClass_Basics_JC extends AppCompatActivity {

    Button clk;
    VideoView videov;
    MediaController mediaC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics_jc);

        clk = (Button)findViewById(R.id.b003);
        videov = (VideoView)findViewById(R.id.videoView2);
        mediaC = new MediaController(this);
    }

    public void videoplay2(View v){

        String videopath = "android.resource://taqbir.alam.com.javaforfun/"+R.raw.comments_java;

        Uri u = Uri.parse(videopath);

        videov.setVideoURI(u);

        videov.setMediaController(mediaC);

        mediaC.setAnchorView(videov);

        videov.start();

    }

}
