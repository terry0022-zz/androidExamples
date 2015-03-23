package com.example.terryexample;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

//importante las clases de adapter personalizado
import com.example.terry.librery.itemList;
import com.example.terry.librery.itemsAdapter;

import android.app.Activity;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {

	Spinner spn1,spn2,spn3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
// ----------------------- ejemplo jsonarray
		
		// creamos el JsonArray
		JSONArray array = new JSONArray();
		try {
			array.put(0, "uno");
			array.put(1, "dos");
			array.put(2, "tres");
			array.put(3, "cuatro");
			array.put(4, "cinco");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		//usamos una funcion para obtener items del JSONArray
		ArrayList<itemList> items = obtenerItems(array);
		
		//creamos el adapter personalizado con JSONArray[]
		itemsAdapter adapter = new itemsAdapter(this, items);
		
		//se invoca el spinner
		spn1 = (Spinner)findViewById(R.id.spinner1);
		
		//se coloca el adapter personalizado
		spn1.setAdapter(adapter);
		
//------------------------ ejemplo de array
		
		// creamos el Array[]
		String[] array1 = new String[]{
				"value 1",
				"value 2",
				"value 3",
				"value 4",
				"value 5"};
		
		//creamos el adapter personalizado con array[]
		ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,R.layout.item_list, R.id.tvField, array1);

		// se invoca el spinner
		spn2 = (Spinner)findViewById(R.id.spinner2);
		
		//se coloca el adapter personalizado
		spn2.setAdapter(adapter1);

//------------------------ ejemplo JSONObject
		
		//Se crea el JSONObject
		JSONObject array2 = new JSONObject();
		
		//Se rellena
		try {
			array2.put("1", "item 1");
			array2.put("2", "item 2");
			array2.put("3", "item 3");
			array2.put("4", "item 4");
			array2.put("5", "item 5");
		} catch (JSONException e) {
			e.printStackTrace();
		}		
		
		//se usa la clase como base para parsear los items
		ArrayList<itemList> items1 = new ArrayList<itemList>();
		
		// conociendo la key del JSONOnject tomamos su valor y lo metemos en el a lista de arreglos 
		try {
			items1.add(new itemList(0,array2.get("1").toString()));
			items1.add(new itemList(1,array2.get("2").toString()));
			items1.add(new itemList(2,array2.get("3").toString()));
			items1.add(new itemList(3,array2.get("4").toString()));
			items1.add(new itemList(4,array2.get("5").toString()));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		//creamos el adapter personalizado con la lista de arreglos
		itemsAdapter adapter2 = new itemsAdapter(this, items1);
		
		// se invoca el spinner
		spn3 = (Spinner)findViewById(R.id.spinner3);
		
		//se coloca el adapter personalizado
		spn3.setAdapter(adapter2);
		
	}
	
	//funcion para obtener items de JSONArray
	private ArrayList<itemList> obtenerItems(JSONArray array){
		// creamos una lista de arreglo (ArrayList)
		ArrayList<itemList> items = new ArrayList<itemList>();
		
		//recorrer el JSONArray y meter los valores en la lista de arreglo (ArrayList)
		for(int n = 0; n < array.length(); n++){
			try {
				items.add(new itemList(n,array.get(n).toString()));
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		//regresamos la lista de arreglos(ArrayList)
		return items;
	}
}
