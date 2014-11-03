package example;

import com.didww.*;
import java.security.*;
import java.util.UUID;

public class DidwwApiClient {

    // contact with support@didww.com
    public static final String API_USERNAME = "example@email.com"; // insert your API username here
    public static final String API_KEY = "SOMEAPIKEY1234"; // insert your API key here

  public static void main(String[] argv) {
      try {
          DIDWWLocator locator = new DIDWWLocator();
          DIDWWPortType service = locator.getDIDWWPort();

          // invoke business method
          MappingDataIn mapping = new MappingDataIn();
          mapping.setMap_type("URI");
          mapping.setMap_proto("SIP");
          mapping.setMap_detail("127.0.0.1/3763126666123");

          String uniqHash = generateUniqHash();

          Service_data orderData = service.didww_ordercreate(generateAuthString(), "0", "US", "864", 1, mapping, "0.00", uniqHash, "1536", 1);

          System.out.println("DID number is: " + orderData.getDid_number());


      } catch (javax.xml.rpc.ServiceException ex) {
          ex.printStackTrace();
      } catch (java.rmi.RemoteException ex) {
          ex.printStackTrace();
      } catch (Exception e) {
          e.printStackTrace();
      }
  }

    private static String generateAuthString() throws Exception
    {
        String message = API_USERNAME + API_KEY; // and ... + "sandbox" for sandbox mode

        return createHash(message, "SHA-1");
    }

    private static String generateUniqHash() throws Exception
    {
        String message = UUID.randomUUID().toString();

        return createHash(message, "MD5");
    }

    private static String createHash(String message, String algo) throws Exception
    {
        String digest;
        MessageDigest md = MessageDigest.getInstance(algo);
        byte[] hash = md.digest(message.getBytes("UTF-8")); //converting byte array to Hexadecimal String
        StringBuilder sb = new StringBuilder(2*hash.length);
        for(byte b : hash){
            sb.append(String.format("%02x", b&0xff));
        }
        digest = sb.toString();

        return digest;
    }

}
