package Platty;

/**
 * Created by Cody on 3/16/2016.
 */
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

public class IsKeyPressed {
    private static boolean wPressed = false;
    public static boolean isWPressed() {
        synchronized (IsKeyPressed.class) {
            return wPressed;
        }
    }
    private static boolean aPressed = false;
    public static boolean isAPressed() {
        synchronized (IsKeyPressed.class) {
            return aPressed;
        }
    }
    private static boolean sPressed = false;
    public static boolean isSPressed() {
        synchronized (IsKeyPressed.class) {
            return sPressed;
        }
    }
    private static boolean dPressed = false;
    public static boolean isDPressed() {
        synchronized (IsKeyPressed.class) {
            return dPressed;
        }
    }
    public static void main(String[] args) {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {

            @Override
            public boolean dispatchKeyEvent(KeyEvent ke) {
                synchronized (IsKeyPressed.class) {
                    switch (ke.getID()) {
                        case KeyEvent.KEY_PRESSED:
                            if (ke.getKeyCode() == KeyEvent.VK_W) {
                                wPressed = true;
                            }
                            if (ke.getKeyCode() == KeyEvent.VK_A) {
                                aPressed = true;
                            }
                            if (ke.getKeyCode() == KeyEvent.VK_S) {
                                sPressed = true;
                            }
                            if (ke.getKeyCode() == KeyEvent.VK_D) {
                                dPressed = true;
                            }
                            break;

                        case KeyEvent.KEY_RELEASED:
                            if (ke.getKeyCode() == KeyEvent.VK_W) {
                                wPressed = false;
                            }
                            if (ke.getKeyCode() == KeyEvent.VK_A) {
                                sPressed = false;
                            }
                            if (ke.getKeyCode() == KeyEvent.VK_S) {
                                sPressed = false;
                            }
                            if (ke.getKeyCode() == KeyEvent.VK_D) {
                                dPressed = false;
                            }
                            break;
                    }
                }
                return false;
            }
        });
    }
}