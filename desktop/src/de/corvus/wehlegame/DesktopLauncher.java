package de.corvus.wehlegame;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import de.corvus.wehlegame.WehleGame;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.useVsync(true);
		config.setTitle("wehlegame");
		config.setFullscreenMode(null);
		config.setFullscreenMode(Lwjgl3ApplicationConfiguration.getDisplayMode());
		new Lwjgl3Application(new WehleGame(), config);
	}
}
