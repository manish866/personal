package old.company;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Application {

    public static void main(String[] args) throws IOException, InterruptedException {
        var url = "https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/calendarByPin?pincode=829144&date=14-05-2021";

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .GET()
                .header("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.114 Safari/537.36")
                .uri(URI.create(url))
                .build();

        HttpClient client = HttpClient.newBuilder().build();

        HttpResponse httpResponse = client.send(httpRequest,HttpResponse.BodyHandlers.ofString());

        System.out.println(httpResponse.statusCode());
        System.out.println(httpResponse.body());


        Gson gson = new Gson();

        Centres centres = gson.fromJson(httpResponse.body().toString(), Centres.class);

        //System.out.println("availableCapacity : " + centres.getCenters().get(0).getSessions().get(0).getAvailable_capacity());

        for (Center center : centres.getCenters()) {
            for (Session session : center.getSessions()) {
                if(session.getAvailable_capacity() > 0){
                    System.out.println("stockAvailable : " + center.getAddress() + " --->> "+ session.getAvailable_capacity() + session.getMin_age_limit() + session.getVaccine());
                }else{
                    //System.out.println("Out of Stock");
                }
            }
        }
    }
}

