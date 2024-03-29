// How to install the library at https://github.com/amadeus4dev/amadeus-java
import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.TransferCancellation;

public class TransferManagement {

  public static void main(String[] args) throws ResponseException {

    Amadeus amadeus = Amadeus
        .builder("YOUR_AMADEUS_API_KEY", "YOUR_AMADEUS_API_SECRET")
        .build();
    Params params = Params.with("confirmNbr", "12029761");

    TransferCancellation transfers = amadeus.ordering
        .transferOrder("VEg0Wk43fERPRXwyMDIzLTA2LTE1VDE1OjUwOjE4").transfers.cancellation.post(params);
    if (transfers.getResponse().getStatusCode() != 200) {
      System.out.println("Wrong status code: " + transfers.getResponse().getStatusCode());
      System.exit(-1);
    }

    System.out.println(transfers);
  }
}
