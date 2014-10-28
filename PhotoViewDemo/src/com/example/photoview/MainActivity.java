package com.example.photoview;

import uk.co.senab.photoview.PhotoViewAttacher;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {

	private ImageView img;

	private PhotoViewAttacher attacher;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		img = (ImageView) findViewById(R.id.img);
		Drawable drawable = getResources().getDrawable(R.drawable.ico);
		img.setImageDrawable(drawable);
		attacher = new PhotoViewAttacher(img);
		attacher.update();
	}

}
