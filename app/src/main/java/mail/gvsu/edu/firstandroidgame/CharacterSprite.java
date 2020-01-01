package mail.gvsu.edu.firstandroidgame;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;

public class CharacterSprite {
    private Bitmap image;
    private int x,y;
    private int xVelocity = 4;
    private int yVelocity = 2;
    private int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    private int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;
    public CharacterSprite(Bitmap img){
        image = img;

//        image.setHeight(350);
//        image.setWidth(350);
        x = 100;
        y = 100;
    }

    public void draw(Canvas canvas){

        canvas.drawBitmap(image, x,y, null);
    }

    public void update() {
        x += xVelocity;
        y += yVelocity;
        if((x> screenWidth - image.getWidth())|| x < 0){
            xVelocity = xVelocity*-1;
        }
        if((y > screenHeight - image.getHeight()) || y < 0){
            yVelocity = yVelocity*-1;
        }
    }
}
