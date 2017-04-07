package com.solarSystem.util.oop;

/**
 * 按路径加载图片
 * @author Leon
 */
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class GameUtil {

	private GameUtil() {
	}

	public static Image getImage(String path) {
		// BufferedImage img = null;
		// URL u = GameUtil.class.getClassLoader().getResource(path);
		// try {
		// img = ImageIO.read(u);
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// return img;
		return Toolkit.getDefaultToolkit().getImage(GameUtil.class.getClassLoader().getResource(path));
	}

}
