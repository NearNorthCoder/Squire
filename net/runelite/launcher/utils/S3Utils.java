/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.launcher.utils;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.LinkedTreeMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.SwingUtilities;
import net.runelite.launcher.Launcher;
import net.runelite.launcher.SquireSplashScreen;
import net.runelite.launcher.beans.BootstrapMode;
import net.runelite.launcher.beans.SignedBsMode;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class S3Utils {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static SignedBsMode[] getBootstrapMode(String auth) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("https://g0dp8zyku3.execute-api.eu-west-1.amazonaws.com/default/GetBootloadJars").header("x-authentication-key", auth).header("x-hardware-id", "launcher_id").header("Accept", "application/json").build();
        try (Response response = client.newCall(request).execute();){
            ResponseBody body = response.body();
            if (!response.isSuccessful() || body == null) {
                SignedBsMode[] signedBsModeArray = null;
                return signedBsModeArray;
            }
            String json = body.string();
            SignedBsMode[] signedBsModeArray = new Gson().fromJson(json, SignedBsMode[].class);
            return signedBsModeArray;
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Map<String, BootstrapMode> getBootstrapModes() {
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        MediaType mediaType = MediaType.parse("text/plain");
        Request request = new Request.Builder().url("https://jyb5ino5ucg4ylf6dhj7xp6lpe0fvycm.lambda-url.eu-west-1.on.aws/").header("auth", Launcher.getSquireAuth()).build();
        Response response = client.newCall(request).execute();
        try {
            List codes = new Gson().fromJson(response.body().string(), List.class);
            HashMap<String, BootstrapMode> result = new HashMap<String, BootstrapMode>();
            for (LinkedTreeMap ltm : codes) {
                result.put(ltm.get("label").toString().toLowerCase(), new BootstrapMode(ltm.get("label").toString().toLowerCase(), String.format("https://squire-hosting.s3.eu-west-1.amazonaws.com/bootstrap-%s.json", ltm.get("code"))));
            }
            HashMap<String, BootstrapMode> hashMap = result;
            if (response != null) {
                response.close();
            }
            return hashMap;
        }
        catch (Throwable codes) {
            try {
                if (response != null) {
                    try {
                        response.close();
                    }
                    catch (Throwable throwable) {
                        codes.addSuppressed(throwable);
                    }
                }
                throw codes;
            }
            catch (IOException e) {
                System.out.println("Error trying to launch squire using auth " + Launcher.getSquireAuth());
            }
            catch (JsonSyntaxException e) {
                try {
                    SwingUtilities.invokeAndWait(() -> {
                        SquireSplashScreen.init(null);
                        while (!Launcher.authenticated && SquireSplashScreen.getINSTANCE().isShowing()) {
                            try {
                                Thread.sleep(1000L);
                            }
                            catch (InterruptedException exception) {
                                exception.printStackTrace();
                            }
                        }
                    });
                }
                catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                catch (InvocationTargetException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
        return Collections.emptyMap();
    }
}
