package de.yca.subhunter;

//import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.Window;
import android.os.Bundle;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.Display;
import android.util.Log;
import android.widget.ImageView;

import java.util.Objects;
import java.util.Random;

public class SubHunter extends Activity {

    // These variables can be "seen"
// throughout the SubHunter class
    int numberHorizontalPixels;
    int numberVerticalPixels;
    int blockSize;
    int gridWidth = 40;
    int gridHeight;
    float horizontalTouched = -100;
    float verticalTouched = -100;
    int subHorizontalPosition;
    int subVerticalPosition;
    boolean hit = false;
    int shotsTaken;
    int distanceFromSub;
    boolean debugging = true;

    /*
        Android runs this code just before
        the player sees the app.
        This makes it a good place to add
        the code for the one-time setup phase.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        Log.d("Debugging","In onCreate method");

        newGame();
        draw();
    }
    /*
        This code will execute when a new
        game needs to be started. It will
        happen when the app is first started
        and after the player wins a game.
     */
    void newGame() {
        Log.d("Debugging","In newGame method");
    }
    /*
        Here we will do all the drawing.
        The grid lines, the HUD and
        the touch indicator
     */
    void draw() {
        Log.d("Debugging","In draw method");
    }
    /*
        This part of the code will
        handle detecting that the player
        has tapped the screen
     */
    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {

        Log.d("Debugging","In onTouchEvent method");

        takeShot();

        return true;
    }
    /*
        The code here will execute when
        the player taps the screen. It will
        calculate the distance from the sub'
        and decide a hit or miss
     */
    void takeShot(){
        Log.d("Debugging","In takeShot method");
    }

    // This code says "BOOM!"
    void boom() {
        Log.d("Debugging","In boom method");

    }

    // This code prints the debugging text
    void printDebuggingText() {
        Log.d("Debugging","In printDebugging method");
    }
}