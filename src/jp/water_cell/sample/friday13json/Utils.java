package jp.water_cell.sample.friday13json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.content.Context;

public class Utils {

	public static String getRawJson(Context context) {
		InputStream is = null;
		BufferedReader br = null;

		StringBuilder sb = new StringBuilder();
		try {
			try {
				is = context.getResources().openRawResource(R.raw.aboutme);
				br = new BufferedReader(new InputStreamReader(is, "UTF-8"));

				String str;
				while ((str = br.readLine()) != null) {
					sb.append(str);
				}
			} finally {
				if (br != null) {
					br.close();
				}
				if (is != null) {
					is.close();
				}
			}
		} catch (IOException e) {
		}

		return sb.toString();
	}

}
