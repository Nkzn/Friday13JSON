package jp.water_cell.sample.friday13json.jsonic;

import net.arnx.jsonic.JSON;
import jp.water_cell.sample.friday13json.R;
import jp.water_cell.sample.friday13json.Utils;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class JsonicActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		String json = Utils.getRawJson(this);
		
		AboutMe aboutMe = JSON.decode(json, AboutMe.class);
		
		TextView tv1 = (TextView) findViewById(R.id.tv1);
		tv1.setText(aboutMe.toString());
		TextView tv2 = (TextView) findViewById(R.id.tv2);
		tv2.setText(JSON.encode(aboutMe));
	}
	
}
