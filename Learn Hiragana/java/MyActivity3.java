package com.example.anastassiyaneznanova.learnhiragana;



   import android.app.Activity;
   import android.content.Intent;
   import android.os.Bundle;
   import android.widget.ImageButton;
   import android.widget.Toast;
   import android.view.View;
   import android.widget.Button;
   import android.view.Gravity;
   import android.media.MediaPlayer;


public class MyActivity3 extends Activity implements View.OnClickListener {
    Button b, k, n, m, f,l, d, a, e, q, r, t, z, c, v, y, o,b1,b2,b3,bu1,bu2,bu3,bu4,bu5,bu6,bu7,bu8,bu9,butn1,butn2,butn3,butn4,butn5,butn6,butn7,butn8,butn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity3);
        b = (Button) findViewById(R.id.button1);
        k = (Button) findViewById(R.id.button2);
        n = (Button) findViewById(R.id.button3);
        m = (Button) findViewById(R.id.button4);
        f = (Button) findViewById(R.id.button5);
        l = (Button) findViewById(R.id.button6);
        d = (Button) findViewById(R.id.button7);
        a = (Button) findViewById(R.id.button8);
        e = (Button) findViewById(R.id.button10);
        q = (Button) findViewById(R.id.button11);
        r = (Button) findViewById(R.id.button12);
        t = (Button) findViewById(R.id.button13);
        z = (Button) findViewById(R.id.button14);
        c = (Button) findViewById(R.id.button15);
        v = (Button) findViewById(R.id.button16);
        y = (Button) findViewById(R.id.button17);
        o = (Button) findViewById(R.id.button18);
        b1 = (Button) findViewById(R.id.button19);
        b2 = (Button) findViewById(R.id.button20);
        b3 = (Button) findViewById(R.id.button21);
        bu1 = (Button) findViewById(R.id.button22);
        bu2 = (Button) findViewById(R.id.button23);
        bu3 = (Button) findViewById(R.id.button24);
        bu4 = (Button) findViewById(R.id.button25);
        bu5 = (Button) findViewById(R.id.button26);
        bu6 = (Button) findViewById(R.id.button27);
        bu7 = (Button) findViewById(R.id.button28);
        bu8 = (Button) findViewById(R.id.button29);
        bu9 = (Button) findViewById(R.id.button30);
        butn1 = (Button) findViewById(R.id.button31);
        butn2 = (Button) findViewById(R.id.button32);
        butn3 = (Button) findViewById(R.id.button33);
        butn4 = (Button) findViewById(R.id.button34);
        butn5 = (Button) findViewById(R.id.button35);
        butn6 = (Button) findViewById(R.id.button36);
        butn7 = (Button) findViewById(R.id.button37);
        butn8 = (Button) findViewById(R.id.button38);
        butn9 = (Button) findViewById(R.id.button39);
        t1 = (Button) findViewById(R.id.button40);
        t2 = (Button) findViewById(R.id.button41);
        t3 = (Button) findViewById(R.id.button42);
        t4 = (Button) findViewById(R.id.button43);
        t5 = (Button) findViewById(R.id.button44);
        t6 = (Button) findViewById(R.id.button45);
        t7 = (Button) findViewById(R.id.button46);
        t8 = (Button) findViewById(R.id.button47);
        t9 = (Button) findViewById(R.id.button48);
        t10 = (Button) findViewById(R.id.button49);




    }

    public void onClick(View v) {
        if (v.getId() == R.id.button1) {
            Toast toast = Toast.makeText(this, "N", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL+30, 50, 40);
            toast.show();
        } else if (v.getId() == R.id.button2) {
            Toast toast = Toast.makeText(this, "WA", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if(v.getId() == R.id.button3){
            Toast toast = Toast.makeText(this, "RA", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button4){
            Toast toast = Toast.makeText(this, "YA", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button5){
            Toast toast = Toast.makeText(this, "MA", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button6){
            Toast toast = Toast.makeText(this, "HA", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button7){
            Toast toast = Toast.makeText(this, "NA", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button8){
            Toast toast = Toast.makeText(this, "TA", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button10){
            Toast toast = Toast.makeText(this, "SA", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button11){
            Toast toast = Toast.makeText(this, "KA", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button12){
            Toast toast = Toast.makeText(this, "A", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button13){
            Toast toast = Toast.makeText(this, "WI", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button14){
            Toast toast = Toast.makeText(this, "RI", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button15){
            Toast toast = Toast.makeText(this, "MI", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button16){
            Toast toast = Toast.makeText(this, "HI", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button17){
            Toast toast = Toast.makeText(this, "NI", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button18){
            Toast toast = Toast.makeText(this, "TI", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button19){
            Toast toast = Toast.makeText(this, "SI", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button20){
            Toast toast = Toast.makeText(this, "KI", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button21){
            Toast toast = Toast.makeText(this, "I", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button22){
            Toast toast = Toast.makeText(this, "RU", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button23){
            Toast toast = Toast.makeText(this, "YU", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button24){
            Toast toast = Toast.makeText(this, "MU", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button25){
            Toast toast = Toast.makeText(this, "HU", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button26){
            Toast toast = Toast.makeText(this, "NU", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button27){
            Toast toast = Toast.makeText(this, "TU", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button28){
            Toast toast = Toast.makeText(this, "SU", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button29){
            Toast toast = Toast.makeText(this, "KU", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button30){
            Toast toast = Toast.makeText(this, "U", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button31){
            Toast toast = Toast.makeText(this, "WE", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button32){
            Toast toast = Toast.makeText(this, "RE", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button33){
            Toast toast = Toast.makeText(this, "ME", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button34){
            Toast toast = Toast.makeText(this, "HE", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button35){
            Toast toast = Toast.makeText(this, "NE", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button36){
            Toast toast = Toast.makeText(this, "TE", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button37){
            Toast toast = Toast.makeText(this, "SE", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button38){
            Toast toast = Toast.makeText(this, "KE", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button39){
            Toast toast = Toast.makeText(this, "E", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button40){
            Toast toast = Toast.makeText(this, "WO", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button41){
            Toast toast = Toast.makeText(this, "RO", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button42){
            Toast toast = Toast.makeText(this, "YO", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button43){
            Toast toast = Toast.makeText(this, "MO", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button44){
            Toast toast = Toast.makeText(this, "HO", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button45){
            Toast toast = Toast.makeText(this, "NO", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button46){
            Toast toast = Toast.makeText(this, "TO", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button47){
            Toast toast = Toast.makeText(this, "SO", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }
        else if (v.getId() == R.id.button48){
            Toast toast = Toast.makeText(this, "KO", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 50, 40);
            toast.show();
        }

        else if (v.getId() == R.id.button49) {
            Intent intent = new Intent(MyActivity3.this, MyActivity5.class);
            startActivity(intent);
        }

    }
}
