import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorMonedas {
    public DatosExchangeRateAPI resultadoDeConversion(String base_code, String target_code, double cantidad)
            throws IOException, InterruptedException {
        String API_KEY = "TU-CLAVE-API";
        URI URL = URI.create("https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + base_code + "/"
                + target_code + "/" + cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URL)
                .GET()
                .build();
        HttpResponse<String> respuesta = client
                .send(solicitud, HttpResponse.BodyHandlers.ofString());

        return new Gson().fromJson(respuesta.body(), DatosExchangeRateAPI.class);
    }
}
