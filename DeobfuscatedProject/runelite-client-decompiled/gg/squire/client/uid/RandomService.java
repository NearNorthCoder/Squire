/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 *  net.unethicalite.api.events.RandomDatReceived
 *  net.unethicalite.api.events.RandomDatSent
 */
package gg.squire.client.uid;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.inject.Singleton;
import gg.squire.client.Squire;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.events.RandomDatReceived;
import net.unethicalite.api.events.RandomDatSent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class RandomService {
    private static final Logger log = LoggerFactory.getLogger(RandomService.class);
    private static final Type UID_MAP_TYPE = new TypeToken<Map<String, byte[]>>(){}.getType();
    private static final int EXPECTED_LENGTH = 24;
    private static final byte[] NULL_UID = new byte[24];
    private Map<String, byte[]> repository = new HashMap<String, byte[]>();

    @Subscribe
    public void onRandomDatSent(RandomDatSent randomDatSent) {
        this.readRepositoryLocal();
        String username = randomDatSent.getUsername();
        randomDatSent.setData(this.repository.getOrDefault(username, NULL_UID));
        log.debug("Sending {} to packet for {}", (Object)Arrays.toString(randomDatSent.getData()), (Object)username);
    }

    @Subscribe
    public void onRandomDatReceived(RandomDatReceived randomDatReceived) {
        this.readRepositoryLocal();
        String username = randomDatReceived.getUsername();
        byte[] data = randomDatReceived.getData();
        log.debug("Received {} for random.dat to write for {}", (Object)Arrays.toString(data), (Object)username);
        this.repository.put(username, data);
        this.writeRepositoryLocal();
    }

    private void writeRepositoryLocal() {
        Gson gson = new Gson();
        File repository = new File(Squire.SQUIRE_HOME, "random_repository.json");
        if (!repository.exists()) {
            try {
                repository.createNewFile();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (FileWriter writer = new FileWriter(repository);){
            gson.toJson(this.repository, (Appendable)writer);
            log.debug("Wrote random.dat to repository");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readRepositoryLocal() {
        Gson gson = new Gson();
        File repository = new File(Squire.SQUIRE_HOME, "random_repository.json");
        if (!repository.exists()) {
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(repository));){
            Map local = (Map)gson.fromJson((Reader)reader, UID_MAP_TYPE);
            this.repository.putAll(local);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    static {
        Arrays.fill(NULL_UID, (byte)-1);
    }
}

