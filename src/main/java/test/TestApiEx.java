package test;

import java1.Curency;
import java1.Rest;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestApiEx {
    Curency curency;
    static JSONArray jsonArray;

    @Parameterized.Parameters
    public static Collection options() {
        return Arrays.asList(Curency.values());
    }

    public TestApiEx(Curency curency) {

        this.curency = curency;
                jsonArray = new JSONArray(Rest.getRest(("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode="
                        + curency.getCurency() + "&json")));
        }



    @Test
    public void test() {
        JSONObject exchange = jsonArray.getJSONObject(0);
        System.out.println(exchange.getString("cc"));
        System.out.println(exchange.getFloat("rate"));
    }
}
