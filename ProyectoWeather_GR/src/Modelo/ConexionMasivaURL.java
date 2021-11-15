package Modelo;


import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map; 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
public class ConexionMasivaURL {


	//Método para crear la conexión a la URL, conectarse 
	//y almacenar la info en un fichero .json

		public String[] devolverNombresCiudades() {
			// Array de los nombres de las ciudades
			String[] nombresC = new String[10];

				nombresC[0] = "Albacete";
				nombresC[1] = "CiudadReal";
				nombresC[2] = "Madrid";
				nombresC[3] = "Murcia";
				nombresC[4] = "Badajoz";
				nombresC[5] = "Barcelona";
				nombresC[6] = "Bilbao";
				nombresC[7] = "Huelva";
				nombresC[8] = "Ourense";
				nombresC[9] = "Palencia";
				
				return nombresC;
		}
		
		public String[] crearConexionUrl(String [] nombresCity) throws Exception {
			try {

				// Array para almacenar las urls
					String[] urls = new String[10];

				// Array de los nombres de las ciudades
					String[] nombresC = nombresCity;
				
				// Creacion del objeto Properties
					Properties config = new Properties();

				// Lectura del fichero .properties
					config.load(new FileReader("src/resources/config.properties"));

				// Almacenar las urls en un array
					for (int i = 0; i < nombresC.length; i++) {

						urls[i] = config.getProperty("url." + nombresC[i]);

					}

				// Conexiones a las distintas urls y la creacion de los ficheros .json
					for (int i = 0; i < urls.length; i++) {
						File tiempo = new File("files_json/" + nombresC[i] + ".json");
					
						// Creación del objeto URL al cual le metemos la posición del array segun la
						// variable incremental del for
							URL url = new URL(urls[i]);

							// Lo siguiente es crear la conexión con la url
								URLConnection hc = url.openConnection();

									hc.connect();

						// Una vez hemos conectado con la URL, lo siguiente es leer el String
						// que nos devuelve la misma, y escribirlo en el fichero tiempo
							InputStream in = hc.getInputStream();
							OutputStream out = new FileOutputStream(tiempo);

								int b = 0;

									while (b != -1) {
										b = in.read();
										if (b != -1)
											out.write(b);
										}

									out.close();
									in.close();
					}//fin for
				
				return nombresC;

			} catch (Exception e) {
				e.printStackTrace();
				throw e;
			}
			
			
		}
		
		
		//De fichero a objeto
		
		public ArrayList <Forecast> fileToObject (String [] nombresC) throws ParseException{
			//Array de retorno el cual va a contener u objeto forecast de cada ciudad
				ArrayList <Forecast> datosCiudades = new <Forecast> ArrayList();
			
				for(int i = 0; i<nombresC.length;i++) {
					
					//Objeto Forecast
			        
			    	Forecast foCa = null;
					try {
						//Información del fichero .json almacenada en el String json
							 	Object obj = new JSONParser().parse(new FileReader("files_json/"+nombresC[i]+".json"));
					          
							//Creación del objeto JSONObject para acceder a los atributos
							 	
							 	JSONObject jo = (JSONObject) obj;
							 
							 //He creado un objeto Map, donde almaceno la info del atributo city
							 	
							 	 Map ciudad = ((Map)jo.get("city"));
							 	 
						     //Esta varibale va a almacenar el forecast
							 	 String sfc="";
							       
							 	//Me creo el iterator para recorrer el Map
							        Iterator<Map.Entry> itr1 = ciudad.entrySet().iterator();
							        
							        //Con un while recorremos el Map para acceder al atributo forecast y 
							        //almacenarlo en una variable
								        while (itr1.hasNext()) {
								        	
								        	//En este obejto pair vamos almacenando las parejas de clave-valor
								            	Map.Entry pair = itr1.next();
								            	
								            	//Comprobamos si la clave es igual a forecast, la variable fr 
								            	//obtiene los valores del atributo forecast
									            	if(pair.getKey().equals("forecast")) {
									            		sfc = pair.getValue().toString();
									            	}
								        }
							        
							        //Paso de string json a objeto Forecast
								        GsonBuilder builder = new GsonBuilder();
							            builder.setPrettyPrinting();
							            Gson gson = builder.create();
							            foCa = gson.fromJson(sfc,Forecast.class);
							        			        
							           datosCiudades.add(foCa);

							     
									
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
			
		
			return datosCiudades;
		}

		
		
	//MAIN
		public static void main(String[] args) throws Exception {

			// Creación del objeto de la clase ConexionURL para acceder a los métodos de la
			// misma
			ConexionMasivaURL cmurl = new ConexionMasivaURL();

			//Devolver nombres de las ciudades
			String[] nombresC = cmurl.devolverNombresCiudades();
				
			//Crear conexion y obtener los ficheros .json
				cmurl.crearConexionUrl(nombresC);
					System.out.println("Los ficheros .json se han creado correctamente");
					
			//Array el cual contiene los objetos forecast de cada Ciudad
					ArrayList <Forecast> datosCiudades = null;
			
					datosCiudades=cmurl.fileToObject(nombresC);
					
			//PRUEBA
			for(int i=0;i<datosCiudades.size();i++) {
				for(int j=0;j<4;j++) {
					System.out.println("CIUDADES");
					System.out.println();
					System.out.println(nombresC[i]);
					System.out.println(datosCiudades.get(i).toString());
					System.out.println(datosCiudades.get(i).getForecastDay().get(j).getWeather());
					System.out.println(datosCiudades.get(i).getForecastDay().get(j).getWeatherIcon());
					System.out.println(datosCiudades.get(i).getForecastDay().get(j).getForecastDate());
					System.out.println(datosCiudades.get(i).getForecastDay().get(j).getWeather());
					System.out.println(datosCiudades.get(i).getForecastDay().get(j).getMaxTemp());
					System.out.println(datosCiudades.get(i).getForecastDay().get(j).getMinTemp());
					System.out.println("--------------------------------------");
				}
				System.out.println("--------------------------------------");
				
			}
		}
	}

