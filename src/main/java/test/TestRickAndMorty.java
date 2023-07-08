package test;

import java1.Rest;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRickAndMorty {
    static JSONObject jsonObject =null;
    @BeforeClass
    public static void before(){
      Assert.assertEquals(200,Rest.getStatusCode("https://rickandmortyapi.com/api"));
          jsonObject=new JSONObject(Rest.getRest("https://rickandmortyapi.com/api"));

      }

    @Test
    public void test1(){
    Assert.assertEquals(200,Rest.getStatusCode(jsonObject.getString("characters")));

    }
    @Test
    public void test2(){
        Assert.assertEquals(200,Rest.getStatusCode(jsonObject.getString("locations")));

    }
    @Test
    public void test3(){
        Assert.assertEquals(200,Rest.getStatusCode(jsonObject.getString("episodes")));

    }
}
