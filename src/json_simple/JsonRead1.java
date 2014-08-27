package json_simple;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRead1 {

    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {
            //v2b.json se encuentra en la carpeta raiz del proyecto 
            Object base = parser.parse(new FileReader("v2b.json"));

            JSONObject jsonBase = (JSONObject) base;

            JSONArray lstbase = (JSONArray) jsonBase.get("v2b");
            for (Object articulo : lstbase) {
                JSONObject Articulo = (JSONObject) articulo;
                //Etiquetas [x]
                JSONArray Etiquetas = (JSONArray) Articulo.get("Etiquetas");
                for (Object etiquetas : Etiquetas) {
                    System.out.println("" + etiquetas);
                }
                //Titulo
                String Titulo = (String) Articulo.get("Titulo");
                System.out.println(Titulo);
                //Sinopsis
                String Sinopsis = (String) Articulo.get("Sinopsis");
                System.out.println(Sinopsis);
                //Imagen
                String Imagen = (String) Articulo.get("Imagen");
                System.out.println(Imagen);
                //Formadores [x]
                JSONArray Formadores = (JSONArray) Articulo.get("Formadores");
                for (Object formadores : Formadores) {
                    System.out.println("" + formadores);
                }
                //Fecha de publicacion
                String Fecha_de_publicacion = (String) Articulo.get("Fecha de publicacion");
                System.out.println(Fecha_de_publicacion);
                //Duracion
                String Duracion = (String) Articulo.get("Duracion");
                System.out.println(Duracion);
                //Enlaces [x]
                JSONArray Enlaces = (JSONArray) Articulo.get("Enlaces");
                for (Object enlaces : Enlaces) {
                    System.out.println("" + enlaces);
                }
            }

        } catch (ParseException e) {
            System.out.println("ERROR EN EL PARSER DE JSON");
        } catch (IOException e) {
            System.out.println("ERROS AL ABRIR EL ARCHIVO");
        }

    }

}
