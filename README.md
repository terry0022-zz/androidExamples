<<<<<<< HEAD
# Android Examples

Contenido java

 * MainActivity
 * itemList
 * itemsAdapter

Contenido XML

 * activity_main
 * item_list

#### Ejemplo JSONArray

Se crea una función para obtener los items del JSONArray.

el adapter personalizado se encuentra dentro de itemsAdapter
es aquí donde se usa el layout (xml) item_list para reconocer el id tvField

```java
private ArrayList<itemList> obtenerItems(JSONArray array){
	// Se crea una lista de arreglo (ArrayList) del tipo itemList
    // importante usar el import de la clase itemList
	ArrayList<itemList> items = new ArrayList<itemList>();
		
	//Recorrer el JSONArray y colocar los valores en la lista de arreglo (ArrayList)
	for(int n = 0; n < array.length(); n++){
		try {
        	//El elemento 'array.get(n)' se guarda en la posición 'n' del ArrayList
			items.add(new itemList(n,array.get(n).toString()));
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	//Se regresa la lista de arreglos(ArrayList) ya con los valores del JSONArray
	return items;
}
```

En la sección Oncreate colocamos el siguiente código

```java
//se usa la función antes mencionada para obtener items del JSONArray
ArrayList<itemList> items = obtenerItems(array);

//Se crea el adapter personalizado con el ArrayList
itemsAdapter adapter = new itemsAdapter(this, items);

//Se invoca el spinner del xml
spn1 = (Spinner)findViewById(R.id.spinner1);

//Se coloca el adapter personalizado
spn1.setAdapter(adapter);
```

#### Ejemplo Array[]

```java
//creamos el adapter personalizado con array[]
ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,R.layout.spinner_item, R.id.item_spinner, array1);

// se invoca el spinner
spn2 = (Spinner)findViewById(R.id.spinner2);

//se coloca el adapter personalizado
spn2.setAdapter(adapter1);
```

#### Ejemplo JSONObject

Nos apoyaremos con la clase itemList.java para parsear los valores del JSONObject a nuestra lista personsalizada,

```java
//Se declara la lista y se inicializa 
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

```



Todo el programa esta [aquí](http://148.247.201.217/terry0022/androidExamples/tree/master) así que cualquier cosa me avisan.

=======
# androidExamples
>>>>>>> cd31e63386cbcf65d43fea3a61e364b5486ec800
