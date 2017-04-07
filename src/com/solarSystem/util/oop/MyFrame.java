package com.solarSystem.util.oop;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2789709130860930302L;

	public void launchFrame() {
		setTitle("游戏窗口");
		setSize(Constant.Game_WIDTH, Constant.Game_HEIGHT);
		setVisible(true);
		new PaintFrame().start(); // 启动重画线程
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

		});
	}

	/**
	 * 定义一个重画窗口的线程类，是一个内部类
	 * 
	 * @author Leon
	 *
	 */
	class PaintFrame extends Thread {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (true) {
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}

}
