package ack.service;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

public class GetExample {

    public static void main(String[] args) {

        String elastic_search_url = "https://search-awselasticsearch-ztwnkdiuuxp3yujo6otxasffiu.us-west-1.es.amazonaws.com/ack/_search?q=123456";

        HttpGet httpGet = new HttpGet(elastic_search_url);
        httpGetRequest(httpGet);
    }

    public static List<AckSponsor> httpGetRequest(HttpGet httpGet) {
        String strResponse = null;
        /* Create object of CloseableHttpClient */
        CloseableHttpClient httpClient = HttpClients.createDefault();

        /* Response handler for after request execution */
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

            /* Execute URL and attach after execution response handler */
            HttpResponse response = httpClient.execute(httpGet);
            /* Print the response */
            strResponse = EntityUtils.toString(response.getEntity());

            SearchResponse searchResponse = objectMapper.readValue(strResponse, SearchResponse.class);

            searchResponse.getHits().getHits().forEach(hit -> {
                result.add(hit.getSource());
            });

            System.out.println("new Response: " + response.getEntity().getContent());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}

