package Test_Data_Modules;

public enum TestData {

    Token_endpoint("https://keycloak.dev.skycell.ch"),
    Lora_Config_Endpoints("https://sensor-data-ingestion.dev.skycell.ch"),
    Lora_config_resources("/v1/lora/configuration"),

    Sensor_config_resources("/v1/lora/uplink"),
    APIKEY(" NNSXS.RPNRQUVEAQHYIBRJPYB5BMF36VT2E4ZIQWLCO6Y.ZP7FKSYX6J2XO2SRNBPHWQJHIBB5ZWTULHPI27N7C4IMQAKB6QYA"),
    Invalid_APIKEY(" ZP7FKSYX6J2XO2SRNBPHWQJHIBB5ZWTULHPI27N7C4IMQAKB6QYA"),
    Empty_APIKEY(" "),
    Sensor_REQ_MR_812P("{\n" +
            " \"end_device_ids\": {\n" +
            " \"device_id\": \"eui-1AFFa11AFFa11AF1\",\n" +
            " \"dev_eui\": \"1AFFa11AFFa11AF1\"\n" +
            " },\n" +
            " \"received_at\": \"2023-11-27T18:12:46\",\n" +
            " \"uplink_message\": {\n" +
            " \"decoded_payload\": {\n" +
            " \"sensorData\": [\n" +
            " {\n" +
            " \"amount\": 1,\n" +
            " \"dataPoints\": [\n" +
            " {\n" +
            " \"index\": 10,\n" +
            " \"temperature\": 23.1\n" +
            " }\n" +
            " ],\n" +
            " \"isLogged\": 0,\n" +
            " \"type\": 0,\n" +
            " \"typeText\": \"Internal Temperature Sensor\"\n" +
            " },\n" +
            " {\n" +
            " \"amount\": 1,\n" +
            " \"dataPoints\": [\n" +
            " {\n" +
            " \"index\": 20,\n" +
            " \"voltage\": 1.3\n" +
            " }\n" +
            " ],\n" +
            " \"isLogged\": 0,\n" +
            " \"type\": 1,\n" +
            " \"typeText\": \"Battery voltage\"\n" +
            " },\n" +
            " {\n" +
            " \"amount\": 1,\n" +
            " \"dataPoints\": [\n" +
            " {\n" +
            " \"index\": 4,\n" +
            " \"temperature\": 23.1\n" +
            " }\n" +
            " ],\n" +
            " \"isLogged\": 0,\n" +
            " \"type\": 3,\n" +
            " \"typeText\": \"RTD Temperature Sensor\"\n" +
            " }\n" +
            " ]\n" +
            " },\n" +
            " \"rx_metadata\": [\n" +
            " {\n" +
            " \"gateway_ids\": {\n" +
            " \"gateway_id\": \"9c65f94334d8\",\n" +
            " \"eui\": \"9C65F9FFFE4334D8\"\n" +
            " },\n" +
            " \"timestamp\": 39945773,\n" +
            " \"rssi\": -44,\n" +
            " \"channel_rssi\": -44,\n" +
            " \"snr\": 5\n" +
            " }\n" +
            " ]\n" +
            " }\n" +
            "}\n"),

    Sensor_REQ_MR_MR_810T("{\n" +
            " \"end_device_ids\": {\n" +
            " \"device_id\": \"eui-1AFF1AFFa11AFFa1\",\n" +
            " \"dev_eui\": \"1AFF1AFFa11AFFa1\"\n" +
            " },\n" +
            " \"received_at\": \"2023-11-27T18:12:46\",\n" +
            " \"uplink_message\": {\n" +
            " \"decoded_payload\": {\n" +
            " \"sensorData\": [\n" +
            " {\n" +
            " \"amount\": 1,\n" +
            " \"dataPoints\": [\n" +
            " {\n" +
            " \"index\": 10,\n" +
            " \"temperature\": 23.1\n" +
            " }\n" +
            " ],\n" +
            " \"isLogged\": 0,\n" +
            " \"type\": 0,\n" +
            " \"typeText\": \"Internal Temperature Sensor\"\n" +
            " },\n" +
            " {\n" +
            " \"amount\": 1,\n" +
            " \"dataPoints\": [\n" +
            " {\n" +
            " \"index\": 20,\n" +
            " \"voltage\": 1.3\n" +
            " }\n" +
            " ],\n" +
            " \"isLogged\": 0,\n" +
            " \"type\": 1,\n" +
            " \"typeText\": \"Battery voltage\"\n" +
            " },\n" +
            " {\n" +
            " \"amount\": 1,\n" +
            " \"dataPoints\": [\n" +
            " {\n" +
            " \"index\": 4,\n" +
            " \"temperature\": 23.1\n" +
            " }\n" +
            " ],\n" +
            " \"isLogged\": 0,\n" +
            " \"type\": 3,\n" +
            " \"typeText\": \"RTD Temperature Sensor\"\n" +
            " }\n" +
            " ]\n" +
            " },\n" +
            " \"rx_metadata\": [\n" +
            " {\n" +
            " \"gateway_ids\": {\n" +
            " \"gateway_id\": \"9c65f94334d8\",\n" +
            " \"eui\": \"9C65F9FFFE4334D8\"\n" +
            " },\n" +
            " \"timestamp\": 39945773,\n" +
            " \"rssi\": -44,\n" +
            " \"channel_rssi\": -44,\n" +
            " \"snr\": 5\n" +
            " }\n" +
            " ]\n" +
            " }\n" +
            "}\n"),


    loggerNumber_Type_MR_812P("1AFFa11AFFa11AF1"),
    loggerNumber_Type_MR_810T("1AFF1AFFa11AFFa1"),
    baseInterval("600"),
    Token_path_resources("/realms/skycell/protocol/openid-connect/token"),
    Token_content_Type("application/x-www-form-urlencoded"),
    Token_Invalid_Content_Type("application/json"),
    Content_Type("application/json"),
    unsupported_Content_Type("application/xml"),
    Token_Req_Body("client_id=webapp&grant_type=password&username=qa_interview@skycell.ch&password=Qa_interview2023!"),
    Token_Req_Body_invalidUser_name("client_id=webapp&grant_type=password&username=qa_interview&password=Qa_interview2023!"),
    Token_Req_Body_Invalid_Password("client_id=webapp&grant_type=password&username=qa_interview@skycell.ch&password=Qa_inter"),
    Token_REQ_Body_Invalid_Client_ID("client_id=we&grant_type=password&username=qa_interview@skycell.ch&password=Qa_interview2023!"),
    Token_Req_Body_invalid_GrantType("client_id=webapp&grant_type=passw&username=qa_interview@skycell.ch&password=Qa_interview2023!"),
     ;
    private String testdata;
    TestData(String testdata) {
        this.testdata = testdata;
    }

    public String getValue() {
        return testdata;
    }

}
