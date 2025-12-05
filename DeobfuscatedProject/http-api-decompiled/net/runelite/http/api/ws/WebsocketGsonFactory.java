/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.http.api.ws;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import net.runelite.http.api.RuneLiteAPI;
import net.runelite.http.api.ws.RuntimeTypeAdapterFactory;
import net.runelite.http.api.ws.WebsocketMessage;
import net.runelite.http.api.ws.messages.Handshake;
import net.runelite.http.api.ws.messages.LoginResponse;
import net.runelite.http.api.ws.messages.party.Join;
import net.runelite.http.api.ws.messages.party.Part;
import net.runelite.http.api.ws.messages.party.PartyChatMessage;
import net.runelite.http.api.ws.messages.party.UserJoin;
import net.runelite.http.api.ws.messages.party.UserPart;
import net.runelite.http.api.ws.messages.party.UserSync;

public class WebsocketGsonFactory {
    private static final Collection<Class<? extends WebsocketMessage>> MESSAGES;

    public static RuntimeTypeAdapterFactory<WebsocketMessage> factory(Collection<Class<? extends WebsocketMessage>> messages) {
        RuntimeTypeAdapterFactory<WebsocketMessage> factory = RuntimeTypeAdapterFactory.of(WebsocketMessage.class);
        for (Class<? extends WebsocketMessage> message : MESSAGES) {
            factory.registerSubtype(message);
        }
        for (Class<? extends WebsocketMessage> message : messages) {
            factory.registerSubtype(message);
        }
        return factory;
    }

    public static Gson build(RuntimeTypeAdapterFactory<WebsocketMessage> factory) {
        return RuneLiteAPI.GSON.newBuilder().registerTypeAdapterFactory(factory).create();
    }

    public static Gson build() {
        return WebsocketGsonFactory.build(WebsocketGsonFactory.factory(Collections.emptyList()));
    }

    static {
        ArrayList<Class<? extends WebsocketMessage>> messages = new ArrayList<Class<? extends WebsocketMessage>>();
        messages.add(Handshake.class);
        messages.add(LoginResponse.class);
        messages.add(Join.class);
        messages.add(Part.class);
        messages.add(UserJoin.class);
        messages.add(UserPart.class);
        messages.add(UserSync.class);
        messages.add(PartyChatMessage.class);
        MESSAGES = messages;
    }
}

