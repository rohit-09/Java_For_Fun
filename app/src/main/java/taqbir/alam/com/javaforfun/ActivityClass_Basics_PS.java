package taqbir.alam.com.javaforfun;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class ActivityClass_Basics_PS extends AppCompatActivity {

    Button clk;
    VideoView videov;
    MediaController mediaC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics_ps);


        clk = (Button)findViewById(R.id.b002);
        videov = (VideoView)findViewById(R.id.videoView1);
        mediaC = new MediaController(this);
    }


    public void videoplay(View v){

        String videopath = "android.resource://taqbir.alam.com.javaforfun/"+R.raw.final_basics;

        Uri u = Uri.parse(videopath);

        videov.setVideoURI(u);

        videov.setMediaController(mediaC);

        mediaC.setAnchorView(videov);

        videov.start();

    }
}
