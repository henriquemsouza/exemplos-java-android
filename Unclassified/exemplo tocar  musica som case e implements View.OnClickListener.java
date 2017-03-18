package souza.hm.com.somdosbichos;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    private ImageView cao;
    private ImageView gato;
    private ImageView leao;
    private ImageView macaco;
    private ImageView ovelha;
    private ImageView vaca;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cao =(ImageView)findViewById(R.id.caoID);
        gato=(ImageView)findViewById(R.id.CatID);
        leao=(ImageView)findViewById(R.id.LeaoID);
        macaco=(ImageView)findViewById(R.id.MacID);
        ovelha=(ImageView)findViewById(R.id.OveID);
        vaca=(ImageView)findViewById(R.id.VacaID);

        cao.setOnClickListener(this);
        gato.setOnClickListener(this);
        leao.setOnClickListener(this);
        macaco.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        vaca.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.caoID:
                 mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.cao);
                tocarSom();
                break;
            case R.id.CatID:
                mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.gato);
                tocarSom();
                break;
            case R.id.LeaoID:
                mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.leao);
                tocarSom();
                break;
            case R.id.MacID:
                mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.macaco);
                tocarSom();
                break;
            case R.id.OveID:
                mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.ovelha);
                tocarSom();
                break;
            case R.id.VacaID:
                mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.vaca);
                tocarSom();
                break;

        }

    }
    public  void tocarSom()
    {
        if (mediaPlayer != null)
        {
            mediaPlayer.start();
        }
    }
    @Override
    protected void onDestroy() {
        if (mediaPlayer !=null)
        {
            mediaPlayer.release();
            mediaPlayer=null;
        }

        super.onDestroy();
    }
}
