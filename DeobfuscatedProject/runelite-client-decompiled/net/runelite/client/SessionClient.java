/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Named
 *  net.runelite.api.Actor
 *  net.runelite.api.GameState
 *  net.runelite.discord.DiscordUser
 *  net.unethicalite.api.events.BanRecorded
 */
package net.runelite.client;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import gg.squire.client.Squire;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.inject.Inject;
import javax.inject.Named;
import net.runelite.api.Actor;
import net.runelite.api.GameState;
import net.runelite.client.discord.DiscordService;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.PluginChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginManager;
import net.runelite.client.plugins.recorder.MouseRecording;
import net.runelite.discord.DiscordUser;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.events.BanRecorded;
import net.unethicalite.api.game.Game;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.interaction.InteractionManager;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class SessionClient {
    private static final Logger log = LoggerFactory.getLogger(SessionClient.class);
    private final OkHttpClient client;
    private final HttpUrl sessionUrl;
    private final Gson gson;
    private final PluginManager pluginManager;
    private final DiscordService discordService;

    @Inject
    private SessionClient(OkHttpClient client, @Named(value="runelite.session") HttpUrl sessionUrl, Gson gson, PluginManager pluginManager, DiscordService discordService) {
        this.client = client;
        this.sessionUrl = sessionUrl;
        this.gson = gson;
        this.pluginManager = pluginManager;
        this.discordService = discordService;
    }

    private static StringBuilder getMacAddressString(NetworkInterface networkInterface) throws SocketException {
        byte[] macAddressBytes = networkInterface.getHardwareAddress();
        if (macAddressBytes == null) {
            return null;
        }
        StringBuilder macAddressBuilder = new StringBuilder();
        for (int macAddressByteIndex = 0; macAddressByteIndex < macAddressBytes.length; ++macAddressByteIndex) {
            String macAddressHexByte = String.format("%02X", macAddressBytes[macAddressByteIndex]);
            macAddressBuilder.append(macAddressHexByte);
            if (macAddressByteIndex == macAddressBytes.length - 1) continue;
            macAddressBuilder.append(":");
        }
        return macAddressBuilder;
    }

    UUID open() throws IOException {
        HttpUrl url = this.sessionUrl.newBuilder().build();
        Request request = new Request.Builder().post(RequestBody.create(null, new byte[0])).url(url).build();
        Response response = this.client.newCall(request).execute();
        try {
            ResponseBody body = response.body();
            InputStream in = body.byteStream();
            UUID uUID = this.gson.fromJson((Reader)new InputStreamReader(in, StandardCharsets.UTF_8), UUID.class);
            if (response != null) {
                response.close();
            }
            return uUID;
        }
        catch (Throwable throwable) {
            try {
                if (response != null) {
                    try {
                        response.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
            catch (JsonParseException | IllegalArgumentException ex) {
                return null;
            }
        }
    }

    void ping(UUID uuid, boolean loggedIn) throws IOException {
        HttpUrl url = this.sessionUrl.newBuilder().addPathSegment("ping").addQueryParameter("session", uuid.toString()).addQueryParameter("logged-in", String.valueOf(loggedIn)).build();
        Request request = new Request.Builder().post(RequestBody.create(null, new byte[0])).url(url).build();
        try (Response response = this.client.newCall(request).execute();){
            if (!response.isSuccessful()) {
                throw new IOException("Unsuccessful ping");
            }
        }
    }

    @Subscribe
    public void onPluginsChanged(PluginChanged changed) {
        if (Squire.isReloading()) {
            return;
        }
        if (!(changed.getPlugin() instanceof SquirePlugin)) {
            return;
        }
        try {
            this.pingPlugins(Squire.getUuid(), false);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void pingPlugins(UUID uuid, boolean shutdown) throws IOException {
        if (Game.getState() != GameState.LOGGED_IN) {
            return;
        }
        Map<String, Object> map = this.getSessionPropertiesMap(uuid, shutdown);
        String json = this.gson.toJson(map);
        OkHttpClient client = new OkHttpClient.Builder().callTimeout(Duration.ofSeconds(10L)).connectTimeout(Duration.ofSeconds(10L)).build();
        Request request = new Request.Builder().url(new HttpUrl.Builder().scheme("https").host("g0dp8zyku3.execute-api.eu-west-1.amazonaws.com").port(443).addPathSegments("test/Session-Test").addQueryParameter("auth", Squire.getKey()).addQueryParameter("session", uuid.toString()).build()).addHeader("X-Authentication-Key", Squire.getKey()).addHeader("X-Hardware-Id", Squire.getIdentifier()).post(RequestBody.create(MediaType.parse("application/json"), json)).build();
        try (Response response = client.newCall(request).execute();){
            ResponseBody body;
            if (!response.isSuccessful()) {
                // empty if block
            }
            if ((body = response.body()) == null) {
                return;
            }
            boolean kill = body.string().equals("true");
            if (kill) {
                System.exit(0);
            }
        }
    }

    @Subscribe
    public void onBanRecorded(BanRecorded banRecorded) {
        Map<String, Object> properties = this.getSessionPropertiesMap(Squire.getUuid(), false);
        properties.put("timestamp", banRecorded.getTime());
        properties.put("login", banRecorded.getUsername());
        StringBuilder encoded = new StringBuilder();
        for (String property : properties.keySet()) {
            String encodedProperty = URLEncoder.encode(property, StandardCharsets.UTF_8);
            String nullSafe = properties.get(property) == null ? "" : properties.get(property);
            String encodedValue = URLEncoder.encode(nullSafe.toString(), StandardCharsets.UTF_8);
            encoded.append(encodedProperty).append("=").append(encodedValue).append("&");
        }
        String url = "https://shcffifyqswutoehafzebal3ye0bogdh.lambda-url.eu-west-1.on.aws/?" + String.valueOf(encoded);
        try {
            HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");
            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                log.debug("Recorded a ban");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Map<String, Object> getSessionPropertiesMap(UUID uuid, boolean shutdown) {
        DiscordUser currentUser;
        ArrayList<String> plugins = new ArrayList<String>();
        ArrayList<String> otherPlugins = new ArrayList<String>();
        for (Plugin plugin : this.pluginManager.getPlugins()) {
            if (!this.pluginManager.isPluginEnabled(plugin)) continue;
            if (plugin instanceof SquirePlugin) {
                plugins.add(((SquirePlugin)plugin).getResourceName());
                continue;
            }
            if (plugin.getClass().isAnnotationPresent(SquireUtil.class)) {
                String descriptor = plugin.getClass().getAnnotation(PluginDescriptor.class).name();
                plugins.add(descriptor);
                continue;
            }
            if (plugin.getClass().getSuperclass() == Plugin.class) continue;
            otherPlugins.add(plugin.getClass().getAnnotation(PluginDescriptor.class).name());
        }
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("plugins", plugins);
        map.put("otherPlugins", otherPlugins);
        map.put("auth", Squire.getKey());
        map.put("session", uuid.toString());
        map.put("shutdown", shutdown);
        map.put("ip", Squire.getIp());
        map.put("build", "experimental");
        map.put("members_world", Static.getClient().isMembersWorld());
        map.put("os", System.getProperty("os.name", "generic").toLowerCase());
        map.put("proxy", System.getProperty("socksProxyHost"));
        map.put("java_vendor", System.getProperty("java.vendor"));
        map.put("java_version", System.getProperty("java.version"));
        map.put("os_version", System.getProperty("os.version"));
        map.put("os_arch", System.getProperty("os.arch"));
        map.put("memory", Runtime.getRuntime().maxMemory());
        map.put("processors", Runtime.getRuntime().availableProcessors());
        map.put("coordinates", Optional.ofNullable(Players.getLocal()).map(Actor::getWorldLocation).orElse(null));
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                StringBuilder macAddressBuilder;
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                if (networkInterface == null || (macAddressBuilder = SessionClient.getMacAddressString(networkInterface)) == null) continue;
                map.put("mac_address", macAddressBuilder.toString());
                break;
            }
        }
        catch (SocketException e) {
            log.debug("Issue recording socket");
        }
        MouseRecording mr = InteractionManager.getRecording();
        if (mr != null) {
            map.put("recording_size", mr.getMousePaths().size());
        }
        map.put("discord", (currentUser = this.discordService.getCurrentUser()) != null ? currentUser.userId : null);
        map.put("computer", this.getComputerName());
        String user = Static.getClient().getUsername();
        String realUser = user == null || user.isEmpty() ? Static.getClient().getJagexCharacterId() : user;
        map.put("user", realUser);
        map.put("rsn", Game.getState() == GameState.LOGGED_IN ? Players.getLocal().getName() : realUser);
        return map;
    }

    private String getComputerName() {
        Map<String, String> env = System.getenv();
        if (env.containsKey("COMPUTERNAME")) {
            return env.get("COMPUTERNAME");
        }
        return env.getOrDefault("HOSTNAME", "Unknown Computer");
    }

    void delete(UUID uuid) throws IOException {
        HttpUrl url = this.sessionUrl.newBuilder().addQueryParameter("session", uuid.toString()).build();
        Request request = new Request.Builder().delete().url(url).build();
        this.client.newCall(request).execute().close();
    }
}

