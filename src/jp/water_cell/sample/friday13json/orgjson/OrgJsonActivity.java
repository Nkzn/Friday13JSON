package jp.water_cell.sample.friday13json.orgjson;

import jp.water_cell.sample.friday13json.R;
import jp.water_cell.sample.friday13json.Utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class OrgJsonActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		String json = Utils.getRawJson(this); // ç°âÒégÇ§JSONÇì«Ç›èoÇ∑
		
		AboutMe aboutMe = new AboutMe();
		try {
			JSONObject rootObject = new JSONObject(json);
			
			// name
			if(rootObject.has("name")) {
				String name = rootObject.getString("name");
				aboutMe.setName(name);
			}
			
			// nick_name
			if(rootObject.has("nick_name")) {
				String nickName = rootObject.getString("nick_name");
				aboutMe.setNickName(nickName);
			}
			
			// screen_name
			if(rootObject.has("screen_name")) {
				String screenName = rootObject.getString("screen_name");
				aboutMe.setScreenName(screenName);
			}
			
			// orgs
			if(rootObject.has("orgs")) {
				JSONArray orgs = rootObject.getJSONArray("orgs");
				for(int i=0; i < orgs.length(); i++) {
					JSONObject jo = orgs.getJSONObject(i);
					String name = null;
					String activity = null;
					if(jo.has("name")) {
						name = jo.getString("name");
					}
					if(jo.has("activity")) {
						activity = jo.getString("activity");
					}
					aboutMe.addOrg(name, activity);
				}
			}
			
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		TextView tv1 = (TextView) findViewById(R.id.tv1);
		tv1.setText(aboutMe.toString());
		
		JSONObject jobj = new JSONObject();
		try {
			jobj.put("name", "hogehoge");
			jobj.put("nick_name", "fugafuga");
			jobj.put("screen_name", "geek_niigata");
			JSONArray array = new JSONArray();
			array.put(new JSONObject().put("name", "foo").put("activity", "bar"));
			array.put(new JSONObject().put("name", "piyo").put("activity", "piyopiyo"));
			jobj.put("orgs", array);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		TextView tv2 = (TextView) findViewById(R.id.tv2);
		tv2.setText(jobj.toString());

	}
	
}
