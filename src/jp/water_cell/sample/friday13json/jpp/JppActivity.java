package jp.water_cell.sample.friday13json.jpp;

import java.io.IOException;
import java.io.StringWriter;

import jp.water_cell.sample.friday13json.R;
import jp.water_cell.sample.friday13json.Utils;
import net.vvakame.util.jsonpullparser.JsonFormatException;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class JppActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		String json = Utils.getRawJson(this);
		
		AboutMe aboutMe = null;
		
		try {
			aboutMe = AboutMeGen.get(json);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JsonFormatException e) {
			e.printStackTrace();
		}
		
		StringWriter sw = new StringWriter();
		try {
			AboutMeGen.encodeNullToNull(sw, aboutMe);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String jsonAboutMe = sw.toString();  
		
		TextView tv1 = (TextView) findViewById(R.id.tv1);
		tv1.setText(aboutMe.toString());
		TextView tv2 = (TextView) findViewById(R.id.tv2);
		tv2.setText(jsonAboutMe);
	}
	
}
