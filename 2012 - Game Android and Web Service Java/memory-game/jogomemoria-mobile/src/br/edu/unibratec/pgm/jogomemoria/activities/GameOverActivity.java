package br.edu.unibratec.pgm.jogomemoria.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import br.edu.unibratec.pgm.jogomemoria.constants.EScreens;
import br.edu.unibratec.pgm.jogomemoria.managers.ScreenManager;
import br.edu.unibratec.pgm.jogomemoria.screens.GameOverView;


public class GameOverActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().setWindowAnimations(Intent.FLAG_ACTIVITY_NO_ANIMATION);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(new GameOverView(this, EScreens.TITLE_SCREEN));
	}
	
	@Override
	public void onBackPressed() {
		ScreenManager.screenControl(this, EScreens.MAIN_GAME_SCREEN);
		super.onBackPressed();
	}	
}