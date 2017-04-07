package com.solarSystem.oop;

/**
 * 游戏主程序
 * @author Leon
 */
import java.awt.Graphics;
import java.awt.Image;

import com.solarSystem.util.oop.Constant;
import com.solarSystem.util.oop.GameUtil;
import com.solarSystem.util.oop.MyFrame;

public class SolarSystem extends MyFrame{

	private static final long serialVersionUID = -789782819524784797L;
	Image bg = GameUtil.getImage("image/bg.jpg");
	Star sun = new Star("image/sun.jpg", Constant.Game_WIDTH/2, Constant.Game_HEIGHT/2);
	@Override
	public void paint(Graphics g) {
		g.drawImage(bg, 0,0, null);
		sun.draw(g);
	}
	public static void main(String[] args) {
		new SolarSystem().launchFrame();
	}

}
