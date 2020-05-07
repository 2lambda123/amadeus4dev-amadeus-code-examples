import Amadeus

var amadeus: Amadeus = Amadeus(
    client_id: "YOUR_API_ID",
    client_secret: "YOUR_API_SECRET"
)
amadeus.travel.predictions.tripPurpose.get(params: ["originLocationCode": "NYC",
                                                    "destinationLocationCode": "MAD",
                                                    "departureDate": "2020-08-01",
                                                    "returnDate": "2020-08-12",
                                                    "searchDate": "2020-06-11"],
                                           onCompletion: {
                                               response, error in
                                               if error == nil {
                                                   print(response!.data)
                                               }
                                        })
