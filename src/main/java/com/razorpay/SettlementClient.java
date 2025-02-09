package com.razorpay;

import java.util.List;

import org.json.JSONObject;

public class SettlementClient extends ApiClient {

    SettlementClient(String auth) {
        super(auth);
    }

    /**
     * It is wrapper of fetchAll with parameter here sending null defines fetchAll
     * with a default values without filteration
     * @throws RazorpayException RazorpayException
     * @return list of settlements
     */
    public List<Settlement> fetchAll() throws RazorpayException {
        return fetchAll(null);
    }

    /**
     * This method get list of Settlements filtered by parameters @request
     * @throws RazorpayException RazorpayException
     * @param request JSONObject request
     * @return list of settlements
     */
    public List<Settlement> fetchAll(JSONObject request) throws RazorpayException {
        return getCollection(Constants.SETTLEMENTS, request);
    }

    public Settlement fetch(String id) throws RazorpayException {
        return get(String.format(Constants.SETTLEMENT, id), null);
    }

    public List<Settlement> reports(JSONObject request) throws RazorpayException {
        return getCollection(Constants.SETTLEMENTS_REPORTS, request);
    }

    public List<Settlement> reports() throws RazorpayException {
        return reports(null);
    }

    public Settlement create(JSONObject request) throws RazorpayException {
        return post(Constants.SETTLEMENTS_INSTANT, request);
    }

    /**
     * It is wrapper of fetchAllDemand with parameter here sending null defines fetchAllDemand
     * with a default values without filteration
     * @throws RazorpayException RazorpayException
     * @return list of settlements

     */
    public List<Settlement> fetchAllDemand() throws RazorpayException {
        return fetchAllDemand(null);
    }

    /**
     * This method get list of demand Settlements filtered by parameters @request
     * @throws RazorpayException RazorpayException
     * @param request JSONObject request
     * @return List of Settlements
     */
    public List<Settlement> fetchAllDemand(JSONObject request) throws RazorpayException {
        return getCollection(Constants.SETTLEMENTS_INSTANT, request);
    }

    public Settlement fetchDemandSettlement(String id) throws RazorpayException {
        return get(String.format(Constants.SETTLEMENT_INSTANT, id), null);
    }
}
