package com.lethanh98.examplejunit.apiTest;

import com.google.gson.Gson;
import com.lethanh98.examplejunit.repo.ConfigDatabase;
import com.lethanh98.examplejunit.repo.Couchdbpost;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Objects;

public class ApiTest {
    @Test
    public void testLogin() throws InterruptedException, IOException {
        //connect to db
        Gson gson = new Gson();
        //get all data from db
        String DBurl = "http://afe9033d4a27.ngrok.io/api/loginUser";
        String jsonOut = Couchdbpost.httppost(DBurl, "POST", "{ \"email\": \"m@2\", \"password\": \"2\" }");
        try {
            Response ResVar = gson.fromJson(jsonOut, Response.class);
            if (Objects.nonNull(ResVar) && Objects.nonNull(ResVar.getRep()) && Objects.nonNull(ResVar.getRep().getMessage())) {
                Assert.assertNotNull(ResVar.getRep().getMessage().getToken());
            } else {
                Assert.fail();
            }
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @lombok.Data
    class Response {
        Data rep;
    }

    @lombok.Data
    class Data {
        Message message;
    }

    @lombok.Data
    class Message {
        String token;
    }
}
