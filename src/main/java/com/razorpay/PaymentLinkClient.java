package com.razorpay;

import java.util.List;

import org.json.JSONObject;


public class PaymentLinkClient extends ApiClient {

    PaymentLinkClient(String auth) {
        super(auth);
    }

    public PaymentLink create(JSONObject request) throws RazorpayException {
        return post(Constants.PAYMENTLINK_CREATE, request);
    }
    
    public PaymentLink fetch(String id) throws RazorpayException {
        return get(String.format(Constants.PAYMENTLINK_GET, id), null);
    }
    
    public List<PaymentLink> fetchAll() throws RazorpayException {
        return fetchAll(null);
    }

    public List<PaymentLink> fetchAll(JSONObject request) throws RazorpayException {
        return getCollection(Constants.PAYMENTLINK_LIST, request);
    }

    public PaymentLink cancel(String id) throws RazorpayException {
        return post(String.format(Constants.PAYMENTLINK_CANCEL, id), null);
    }

    public PaymentLink edit(String id, JSONObject request) throws RazorpayException {
        return patch(String.format(Constants.PAYMENTLINK_EDIT, id), request);
    }

    public PaymentLink notifyBy(String id, String medium) throws RazorpayException {
        return post(String.format(Constants.PAYMENTLINK_NOTIFYBY, id, medium), null);
    }
}
