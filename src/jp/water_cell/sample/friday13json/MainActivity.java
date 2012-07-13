package jp.water_cell.sample.friday13json;

import java.util.ArrayList;
import java.util.List;

import jp.water_cell.sample.friday13json.gson.GsonActivity;
import jp.water_cell.sample.friday13json.jpp.JppActivity;
import jp.water_cell.sample.friday13json.jsonic.JsonicActivity;
import jp.water_cell.sample.friday13json.orgjson.OrgJsonActivity;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity implements OnItemClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        List<String> menu = new ArrayList<String>();
        menu.add("org.json");
        menu.add("JSONIC");
        menu.add("google-gson");
        menu.add("JsonPullParser");
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu);
        
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

		Class<? extends Activity> clazz = null;
		switch (position) {
		case 0:
			clazz = OrgJsonActivity.class;
			break;
		case 1:
			clazz = JsonicActivity.class;
			break;
		case 2:
			clazz = GsonActivity.class;
			break;
		case 3:
			clazz = JppActivity.class;
			break;
		}
		
		Intent intent = new Intent(this, clazz);
		startActivity(intent);
	}
    
}
