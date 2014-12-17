package com.example.anastassiyaneznanova.learnhiragana;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.anastassiyaneznanova.learnhiragana.R;

public class MyActivity5 extends ActionBarActivity {
    ImageButton im, im1, im2, im3, im4, im5, im6, im7, im8, im9, im10, im11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity5);

        im = (ImageButton) findViewById(R.id.imageButton1);
        im1 = (ImageButton) findViewById(R.id.imageButton2);
        im2 = (ImageButton) findViewById(R.id.imageButton3);
        im3 = (ImageButton) findViewById(R.id.imageButton4);
        im4 = (ImageButton) findViewById(R.id.imageButton5);
        im5 = (ImageButton) findViewById(R.id.imageButton6);
        im6 = (ImageButton) findViewById(R.id.imageButton7);
        im7 = (ImageButton) findViewById(R.id.imageButton8);
        im8 = (ImageButton) findViewById(R.id.imageButton9);
        im9 = (ImageButton) findViewById(R.id.imageButton10);
        im10 = (ImageButton) findViewById(R.id.imageButton11);
        im11 = (ImageButton) findViewById(R.id.imageButton12);

    }

    public void onClick(View v) {
        if (v.getId() == R.id.imageButton1) {
            Toast toast = Toast.makeText(this, "きりん - KIRIN", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        } else if (v.getId() == R.id.imageButton2) {
            Toast toast = Toast.makeText(this, "わに - WANI", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        } else if (v.getId() == R.id.imageButton3) {
            Toast toast = Toast.makeText(this, "らくだ - RAKUDA", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);

        } else if (v.getId() == R.id.imageButton4) {
            Toast toast = Toast.makeText(this, "やま - YAMA", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        } else if (v.getId() == R.id.imageButton5) {
            Toast toast = Toast.makeText(this, "まくら - MAKURA", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        } else if (v.getId() == R.id.imageButton6) {
            Toast toast = Toast.makeText(this, "  はた - HATA", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        } else if (v.getId() == R.id.imageButton7) {
            Toast toast = Toast.makeText(this, "  なす - NASU", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton8) {
            Toast toast = Toast.makeText(this, "  たけ - TAKE", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton9) {
            Toast toast = Toast.makeText(this, "さかな - SAKANA", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton10) {
            Toast toast = Toast.makeText(this, "かさ - KASA", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton11) {
            Toast toast = Toast.makeText(this, " あいする - AISURU", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton12) {
            Toast toast = Toast.makeText(this, "りんご - RINGO - APPLE", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton13) {
            Toast toast = Toast.makeText(this, "みかん - MIKAN - ORANGE", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton14) {
            Toast toast = Toast.makeText(this, "ひぐま - HIGUMA - BROWN BEAR", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton15) {
            Toast toast = Toast.makeText(this, "にほん - NIHON - JAPAN", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton16) {
            Toast toast = Toast.makeText(this, "ちかてつ - CHIKATETSU - SUBWAY", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton17) {
            Toast toast = Toast.makeText(this, "しあわせな - SHIAWASENA - HAPPY", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton18) {
            Toast toast = Toast.makeText(this, "きいろい - KIIROI - YELLOW", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton19) {
            Toast toast = Toast.makeText(this, "いい - II - GOOD", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton20) {
            Toast toast = Toast.makeText(this, "つる - TSURU - CRANE", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton21) {
            Toast toast = Toast.makeText(this, "ゆうじん - YUUJIN - FRIEND", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton22) {
            Toast toast = Toast.makeText(this, "むし - MUSHI - BUG", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton23) {
            Toast toast = Toast.makeText(this, "ふね - FUNE - BOAT", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton24) {
            Toast toast = Toast.makeText(this, "ぬの - NUNO - CLOTH", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton25) {
            Toast toast = Toast.makeText(this, "つき - TSUKI - MOON", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }

        else if (v.getId() == R.id.imageButton26) {
            Toast toast = Toast.makeText(this, "すいか - SUIKA - WATERMELON", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton27) {
            Toast toast = Toast.makeText(this, "くるま - KURUMA - CAR", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }

        else if (v.getId() == R.id.imageButton28) {
            Toast toast = Toast.makeText(this, "うえる - UERU - PLANT", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton29) {
            Toast toast = Toast.makeText(this, "れんじゅう - RENJUU - PARTY", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }

        else if (v.getId() == R.id.imageButton30) {
            Toast toast = Toast.makeText(this, "めがね - MEGANE - GLASSES", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton31) {
            Toast toast = Toast.makeText(this, "へいわ - HEIVA - PEACE", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton32) {
            Toast toast = Toast.makeText(this, "ねこ - NEKO - CAT", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton33) {
            Toast toast = Toast.makeText(this, "てがみ - TEGAMI - LETTER", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton34) {
            Toast toast = Toast.makeText(this, "せかい - SEKAI - WORLD", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton35) {
            Toast toast = Toast.makeText(this, "けいい - KEII - FEATHER", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton36) {
            Toast toast = Toast.makeText(this, "えいご - EIGO - ENGLISH", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton37) {
            Toast toast = Toast.makeText(this, "ろく - ROKU - SIX", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton38) {
            Toast toast = Toast.makeText(this, "ようこそ - YOUKOSO - WELCOME", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.imageButton39) {
            Toast toast = Toast.makeText(this, "もも - MOMO - PEACH", Toast.LENGTH_SHORT);
            toast.setGravity(190, 50, 40);
            toast.show();
        }

    }
}
