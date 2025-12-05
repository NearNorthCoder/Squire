/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.config;

import com.google.gson.Gson;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Serializer;

class ConfigStorageBoxSerializer
implements Serializer<ConfigStorageBox<?>> {
    private static final Gson GSON = new Gson();

    ConfigStorageBoxSerializer() {
    }

    @Override
    public String serialize(ConfigStorageBox<?> value) {
        return GSON.toJson(value);
    }

    @Override
    public ConfigStorageBox<?> deserialize(String s) {
        return GSON.fromJson(s, ConfigStorageBox.class);
    }
}

