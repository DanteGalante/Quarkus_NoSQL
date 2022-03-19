package dev.djov.repositories;

import java.util.ArrayList;
import java.util.List;

import com.couchbase.client.java.json.JsonObject;
import com.couchbase.client.java.query.QueryResult;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dev.djov.db.Connection;
import dev.djov.entity.Person;

public class PersonRepo {
    public List<Person> getPersons() {
        Connection conn = new Connection();
        conn.createConnection();
        List<Person> persons = new ArrayList<>();
        Gson gs = new GsonBuilder().setPrettyPrinting().create();

        QueryResult qs = conn.getCluster().query("SELECT * FROM Person.Data.Person");
        List<JsonObject> jsonList = qs.rowsAsObject();

        if (jsonList.size() > 0) {
            for (int i = 0; jsonList.size() < i; i++) {
                JsonObject personJson = jsonList.get(i).getObject("Person");
                persons.add(gs.fromJson(personJson.toString(), Person.class));
            }
        }

        return persons;
    }
}
