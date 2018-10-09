package stud.sanak.ws_soap_test;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class ShopInfo {

    @WebMethod
    @WebResult(partName = "lookupOutput")
    public String getShopInfo(@WebParam(partName = "lookupInput") String property) throws Exception {
        String response = null;
        if (property.equals("shopName")) {
            response = "Test Shop";
        } else if (property.equals("since")) {
            response = "since 2018";
        }
        if (response == null) {
            throw new Exception("no defined property found for " + property);
        }
        return response;
    }
}
