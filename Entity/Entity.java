package Entity;
import java.awt.image.BufferedImage;
public class Entity {
    //Global variables (used for generating character images and motion)
    public int worldX;
    public int worldY;
    public int speed;
    public BufferedImage up1, up2, down1, down2, left1, left2, right1, right2;
    public String direction;
    public int spriteCounter = 0;
    public int spriteNum = 1;
}
