package jp.water_cell.sample.friday13json.jpp;

import net.vvakame.util.jsonpullparser.annotation.JsonKey;
import net.vvakame.util.jsonpullparser.annotation.JsonModel;

@JsonModel
public class Org {
	
	@JsonKey
	String name;
	
	@JsonKey
	String activity;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}

	@Override
	public String toString() {
		return "Org [name=" + name + ", activity=" + activity + "]";
	}
	
}
