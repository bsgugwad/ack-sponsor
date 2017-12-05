package ack.util;

import ack.model.AckSponsor;
import ack.model.SearchResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HttpClientUtil {

    public static List<AckSponsor> connectAndGetResponse(HttpGet httpGet) {
        String strResponse = null;
        CloseableHttpClient httpClient = HttpClients.createDefault();

        ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
            @Override
            public String handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
                /* Get status code */
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 300) {
                    /* Convert response to String */
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("Unexpected response status: " + status);
                }
            }
        };

        List<AckSponsor> result = new ArrayList();

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            HttpResponse response = httpClient.execute(httpGet);
            strResponse = EntityUtils.toString(response.getEntity());
            SearchResponse searchResponse = objectMapper.readValue(strResponse, SearchResponse.class);
            searchResponse.getHits().getHits().forEach(hit -> {
                result.add(hit.getSource());
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
