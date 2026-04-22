package es.gva.edu.iesjuandegaray.bicis;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

public class ValenbisiAPI26T1v2_1 {

    private static final String API_URL =
            "https://geoportal.valencia.es/server/rest/services/OPENDATA/Trafico/MapServer/228/query"
            + "?where=1%3D1"
            + "&outFields=*"
            + "&returnGeometry=true"
            + "&f=json";

    public static void main(String[] args) {

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

            HttpGet request = new HttpGet(API_URL);
            HttpResponse response = httpClient.execute(request);

            HttpEntity entity = response.getEntity();

            if (entity != null) {

                String result = EntityUtils.toString(entity);

                JSONObject jsonObject = new JSONObject(result);

                JSONArray features = jsonObject.getJSONArray("features");

                System.out.println("Número de estaciones: " + features.length());
                System.out.println();

                for (int i = 0; i < features.length(); i++) {

                    JSONObject feature = features.getJSONObject(i);

                    JSONObject attributes = feature.getJSONObject("attributes");

                    JSONObject geometry = feature.getJSONObject("geometry");

                    String nombre = attributes.optString("address", "Sin dirección");
                    int numero = attributes.optInt("number", -1);
                    int bicisDisponibles = attributes.optInt("available", -1);
                    int anclajesDisponibles = attributes.optInt("free", -1);

                    double lat = geometry.optDouble("y", 0);
                    double lon = geometry.optDouble("x", 0);

                    System.out.println("Estación #" + (i + 1));
                    System.out.println("Número: " + numero);
                    System.out.println("Dirección: " + nombre);
                    System.out.println("Bicis disponibles: " + bicisDisponibles);
                    System.out.println("Anclajes libres: " + anclajesDisponibles);
                    System.out.println("Latitud: " + lat);
                    System.out.println("Longitud: " + lon);
                    System.out.println("-----------------------------");
                }
            }

        } catch (IOException e) {
            System.out.println("Error en la petición HTTP:");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error procesando JSON:");
            e.printStackTrace();
        }
    }
}