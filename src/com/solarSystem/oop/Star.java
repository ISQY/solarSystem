package com.solarSystem.oop;

/**
 * 抽象出星体特征
 * @author Leon
 */
import java.awt.Graphics;
import java.awt.Image;

import com.solarSystem.util.oop.GameUtil;

public class Star {
	private Image img;
	private Double x;
	private Double y;

	public Star(Image img, Double x, Double y) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
	}

	public Star(String imgpath, double x, double y) {
		super();
		this.img = GameUtil.getImage(imgpath);
		this.x = x;
		this.y = y;
	}

	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(img, x.intValue(), y.intValue(), null);

	}
}
