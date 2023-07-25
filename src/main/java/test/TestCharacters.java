package test;

import JsonObject.Characters;
import JsonObject.Result;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java1.Rest;
import org.junit.Test;

public class TestCharacters {
    @Test
    public void PrintName() throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper();
         Characters characters = om.readValue(Rest.getRest("https://rickandmortyapi.com/api/episode"),Characters.class);
         int i=1;
        do {
            i++;
            for (Result l: characters.results) {
                System.out.println(l.name +": "+l.air_date);

            }
            if (characters.info.next!=null){
                characters=om.readValue(Rest.getRest(characters.info.next),Characters.class);
            }

        }while (characters.info.next!=null);
        System.out.println("=========="+i);

    }
}