package Test_Data_Modules;

public enum TestData {

    Token_endpoint("https://keycloak.dev.skycell.ch"),
    Lora_Config_Endpoints("https://sensor-data-ingestion.dev.skycell.ch"),
    Lora_config_resources("/v1/lora/configuration"),
    APIKEY(" NNSXS.RPNRQUVEAQHYIBRJPYB5BMF36VT2E4ZIQWLCO6Y.ZP7FKSYX6J2XO2SRNBPHWQJHIBB5ZWTULHPI27N7C4IMQAKB6QYA"),
    Invalid_APIKEY(" ZP7FKSYX6J2XO2SRNBPHWQJHIBB5ZWTULHPI27N7C4IMQAKB6QYA"),
    Empty_APIKEY(" "),


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
