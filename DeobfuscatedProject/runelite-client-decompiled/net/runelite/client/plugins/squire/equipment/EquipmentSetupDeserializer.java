/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.plugins.squire.equipment;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EquipmentSetupDeserializer
implements JsonDeserializer<EquipmentSetup> {
    private static final Logger log = LoggerFactory.getLogger(EquipmentSetupDeserializer.class);

    @Override
    public EquipmentSetup deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        try {
            Gson gson = new Gson();
            Object equipmentSetup = null;
            int hk = -1;
            if (json.getAsJsonObject().get("hotkey") != null) {
                JsonElement hotkey = json.getAsJsonObject().get("hotkey");
                if (hotkey.isJsonPrimitive()) {
                    return gson.fromJson(json, EquipmentSetup.class);
                }
                String val = hotkey.getAsString();
                if (val.length() == 1) {
                    hk = val.toUpperCase().charAt(0);
                }
            }
            int[] ids = gson.fromJson(json.getAsJsonObject().get("ids"), int[].class);
            int[] qts = gson.fromJson(json.getAsJsonObject().get("amounts"), int[].class);
            boolean active = json.getAsJsonObject().get("active").getAsBoolean();
            EquipmentSetup setup = new EquipmentSetup(ids, qts, new String[14]);
            setup.setActive(active);
            setup.setHotkey(hk);
            return setup;
        }
        catch (IllegalArgumentException ie) {
            log.warn("Unable to deserialize equipment setup", ie);
            return null;
        }
    }
}

