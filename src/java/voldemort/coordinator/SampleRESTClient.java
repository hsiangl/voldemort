package voldemort.coordinator;

public class SampleRESTClient {

    public static void main(String[] args) {

        // Create the client
        RESTClient<String, String> clientStore = new RESTClient<String, String>("http://localhost:8080",
                                                                                "test");

        // Sample put
        clientStore.put("a", "How goesasdfsafsadf it  adsfasdfasdf!!!");

        // Do a sample operation:
        System.out.println("Received response : " + clientStore.get("a"));
    }
}
