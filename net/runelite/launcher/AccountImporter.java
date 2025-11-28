/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.launcher;

import com.google.gson.Gson;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import me.friwi.jcefmaven.CefAppBuilder;
import me.friwi.jcefmaven.EnumProgress;
import me.friwi.jcefmaven.MavenCefAppHandlerAdapter;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.cef.CefApp;
import org.cef.CefClient;
import org.cef.browser.CefBrowser;
import org.cef.handler.CefDisplayHandlerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccountImporter {
    private static final Logger log = LoggerFactory.getLogger(AccountImporter.class);
    public static final String CONSENT_CLIENT_ID = "1fddee4e-b100-4f4e-b2b0-097f9088f9d2";
    private static final Gson GSON = new Gson();
    public static final String NONCE = "YTYyMTU3ODgtZjlkOC00ZmFkLTk4NmQtZTIzNmY3MmMxOTRj";
    public static final String STATE = "sVAapQAFKnQK";
    private static String userId = "";
    private static String bearer = "";
    private static String idToken = "";

    public static void importAccounts(Runnable refresh) {
        MyCookieJar cookieJar = new MyCookieJar();
        OkHttpClient okHttpClient = new OkHttpClient.Builder().cookieJar(cookieJar).readTimeout(60L, TimeUnit.SECONDS).writeTimeout(60L, TimeUnit.SECONDS).callTimeout(60L, TimeUnit.SECONDS).followRedirects(false).build();
        Object loginChallenge = AccountImporter.getLoginChallenge(okHttpClient, refresh);
    }

    private static String createNewSession(String realIdToken, OkHttpClient okHttpClient) {
        String sessionId;
        String sessionRequestJson = String.format("{\"idToken\":\"%s\"}", realIdToken);
        RequestBody sessionRequestBody = RequestBody.create(MediaType.parse("application/json"), sessionRequestJson);
        Request createSessionRequest = new Request.Builder().url("https://auth.runescape.com/game-session/v1/sessions").post(sessionRequestBody).build();
        try (Response res = okHttpClient.newBuilder().callTimeout(25L, TimeUnit.SECONDS).build().newCall(createSessionRequest).execute();){
            Map results = GSON.fromJson(res.body().string(), Map.class);
            sessionId = (String)results.get("sessionId");
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        return sessionId;
    }

    private static void getAccountsAndWriteToFile(String sessionId, CookieJar cookieJar) {
        OkHttpClient client = new OkHttpClient.Builder().cookieJar(cookieJar).build();
        Request getAccounts = new Request.Builder().url("https://auth.runescape.com/game-session/v1/accounts").header("Authorization", String.format("Bearer %s", sessionId)).build();
        try (Response res = client.newCall(getAccounts).execute();){
            List results = (List)GSON.fromJson(res.body().string(), Object.class);
            AccountImporter.writeResultsToFile(results, sessionId);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeResultsToFile(List<Map<String, String>> results, String sessionId) {
        String accountId;
        File launcher;
        HashMap<String, Map<String, String>> byAccountId = new HashMap<String, Map<String, String>>();
        int amount = results.size();
        for (Map<String, String> result : results) {
            String accountId2 = result.get("accountId");
            HashMap<String, String> copy = new HashMap<String, String>(result);
            copy.put("sessionId", sessionId);
            if (!copy.containsKey("displayName")) {
                copy.put("displayName", "NO_DISPLAY_NAME");
            }
            byAccountId.put(accountId2, copy);
        }
        File squireHome = new File(System.getProperty("user.home"), ".squire");
        if (!squireHome.exists()) {
            squireHome.mkdirs();
        }
        if (!(launcher = new File(squireHome, "launcher.dat")).exists()) {
            try {
                launcher.createNewFile();
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        try (Scanner scanner = new Scanner(launcher);){
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                String[] parts = nextLine.split(":");
                accountId = parts[3];
                Map<String, String> forThisAccount = Map.of("accountId", accountId, "displayName", parts.length == 5 ? parts[4] : "NO_DISPLAY_NAME", "sessionId", parts[2]);
                if (!byAccountId.containsKey(accountId)) {
                    byAccountId.put(accountId, forThisAccount);
                    continue;
                }
                Map currentlyExisting = (Map)byAccountId.get(accountId);
                if (currentlyExisting.containsKey("displayName") && !((String)currentlyExisting.get("displayName")).isEmpty()) continue;
                byAccountId.put(accountId, forThisAccount);
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try (FileWriter fileWriter = new FileWriter(launcher, false);){
            for (Map accountData : byAccountId.values()) {
                accountId = (String)accountData.get("accountId");
                String cSessionId = (String)accountData.get("sessionId");
                String accountName = accountData.getOrDefault("displayName", "");
                fileWriter.write(String.format("::%s:%s:%s\n", cSessionId, accountId, accountName));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, String.format("Successfully imported %d characters, have a total of %d characters now!", amount, byAccountId.size()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String getDisplayName(String bearer, OkHttpClient okHttpClient) {
        Request accountsRequest = new Request.Builder().url(String.format("https://api.jagex.com/v1/users/%s/displayName", userId)).header("Authorization", String.format("Bearer %s", bearer)).build();
        try (Response res = okHttpClient.newCall(accountsRequest).execute();){
            ResponseBody body = res.body();
            if (body == null) {
                String string = "NO_DISPLAY_NAME";
                return string;
            }
            String responseBody = body.string();
            if (responseBody == null) {
                String string = "NO_DISPLAY_NAME";
                return string;
            }
            Map responseProperties = GSON.fromJson(responseBody, Map.class);
            String string = responseProperties.getOrDefault("displayName", "NO_DISPLAY_NAME");
            return string;
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void getRealIdToken(String hint, CefBrowser browser) {
        HttpUrl httpUrl = HttpUrl.parse("https://account.jagex.com/oauth2/auth").newBuilder().addEncodedQueryParameter("id_token_hint", hint).addEncodedQueryParameter("nonce", NONCE).addEncodedQueryParameter("prompt", "consent").addEncodedQueryParameter("redirect_uri", "http://localhost").addEncodedQueryParameter("response_type", "id_token code").addEncodedQueryParameter("state", STATE).addEncodedQueryParameter("client_id", CONSENT_CLIENT_ID).addQueryParameter("scope", "openid offline").build();
        browser.loadURL(httpUrl.toString());
    }

    private static String getOauthUrl(String consentChallenge, OkHttpClient okHttpClient) {
        String consentChallengeCode = consentChallenge.split("=")[1];
        String json = String.format("{\"consentChallenge\":\"%s\"}", consentChallengeCode);
        RequestBody body = RequestBody.create(MediaType.parse("application/json"), json);
        Request accountsRequest = new Request.Builder().url("https://account.jagex.com/api/auth/consent").post(body).build();
        Response res = okHttpClient.newCall(accountsRequest).execute();
        try {
            String responseBody = res.body().string();
            Map responseProperties = GSON.fromJson(responseBody, Map.class);
            String string = responseProperties.get("redirectTo").toString();
            if (res != null) {
                res.close();
            }
            return string;
        }
        catch (Throwable throwable) {
            try {
                if (res != null) {
                    try {
                        res.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static String getConsentChallenge(String redirectUri, OkHttpClient okHttpClient) {
        String consentChallengeLocation = "";
        Request tokenRequest = new Request.Builder().url(redirectUri).build();
        try (Response res = okHttpClient.newCall(tokenRequest).execute();){
            consentChallengeLocation = res.headers().get("location");
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request consentChallenge = new Request.Builder().url(consentChallengeLocation).build();
        try {
            Response res = okHttpClient.newCall(consentChallenge).execute();
            if (res != null) {
                res.close();
            }
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        return consentChallengeLocation;
    }

    private static String getRedirectUri(Map<String, Object> flowMap, OkHttpClient okHttpClient) {
        Request emailVerifyRequest;
        boolean isMfa = flowMap.getOrDefault("state", "").toString().equalsIgnoreCase("SELECT_MFA");
        String flowId = flowMap.get("flowId").toString();
        if (isMfa) {
            Map data = (Map)flowMap.get("data");
            List availableMfas = (List)data.get("availableMfas");
            String totpId = "";
            for (Map available : availableMfas) {
                if (!((String)available.get("type")).equalsIgnoreCase("TOTP")) continue;
                totpId = (String)available.get("id");
                break;
            }
            String selectMfaJson = String.format("{\"id\":\"%s\", \"type\":\"TOTP\"}", totpId);
            RequestBody selectMfaBody = RequestBody.create(MediaType.parse("application/json"), selectMfaJson);
            Request selectMfaRequest = new Request.Builder().url(String.format("https://account.jagex.com/login/api/auth/login/%s/selectMfa", flowId)).put(selectMfaBody).build();
            try (Response res = okHttpClient.newCall(selectMfaRequest).execute();){
                System.out.println("Selected TOTP as MFA");
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
            String code = JOptionPane.showInputDialog(null, "Please enter the code from your 2FA authenticator", "Squire Jagex Acc Importer", 3);
            String json = String.format("{\"totp\":\"%s\"}", code);
            RequestBody body = RequestBody.create(MediaType.parse("application/json"), json);
            emailVerifyRequest = new Request.Builder().url(String.format("https://account.jagex.com/login/api/auth/login/%s/totpCode", flowId)).put(body).build();
        } else {
            String code = JOptionPane.showInputDialog(null, "Please enter the code sent to your e-mail", "Squire Jagex Acc Importer", 3);
            String json = String.format("{\"code\":\"%s\"}", code);
            RequestBody body = RequestBody.create(MediaType.parse("application/json"), json);
            emailVerifyRequest = new Request.Builder().url(String.format("https://account.jagex.com/login/api/auth/login/%s/emailCode", flowId)).put(body).build();
        }
        Response res = okHttpClient.newCall(emailVerifyRequest).execute();
        try {
            String responseBody = res.body().string();
            Map responseProperties = GSON.fromJson(responseBody, Map.class);
            Map data = (Map)responseProperties.get("data");
            userId = (String)data.get("userId");
            String string = (String)data.get("redirectTo");
            if (res != null) {
                res.close();
            }
            return string;
        }
        catch (Throwable throwable) {
            try {
                if (res != null) {
                    try {
                        res.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Map<String, Object> getFlowMap(OkHttpClient client, String loginChallenge) {
        String email = JOptionPane.showInputDialog(null, "Please enter your e-mail", "Squire Jagex Acc Importer", 3);
        String password = JOptionPane.showInputDialog(null, "Please enter your password!", "Squire Jagex Acc Importer", 3);
        String json = String.format("{\"email\":\"%s\", \"password\":\"%s\", \"loginChallenge\":\"%s\"}", email, password, loginChallenge);
        RequestBody body = RequestBody.create(MediaType.parse("application/json"), json);
        Request loginRequest = new Request.Builder().url("https://account.jagex.com/api/auth/login/jagex").post(body).build();
        try (Response res = client.newCall(loginRequest).execute();){
            if (res.code() != 200) {
                JOptionPane.showMessageDialog(null, "Invalid user/pass combination", "Squire Jagex Acc Importer", 0);
                Map<String, Object> map = null;
                return map;
            }
            Map map = GSON.fromJson(res.body().string(), Map.class);
            return map;
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static Object getLoginChallenge(OkHttpClient client, Runnable runnable) {
        String url = "https://account.jagex.com/oauth2/auth?auth_method=&login_type=&flow=launcher&response_type=code&client_id=com_jagex_auth_desktop_launcher&redirect_uri=https://secure.runescape.com/m=weblogin/launcher-redirect&prompt=login&scope=openid+offline+gamesso.token.create+user.profile.read+user.entitlement.read+user.game.read+user.sku.read&state=XDsvlMYKfQsZ";
        AccountImporter.createCefApp(url, client, runnable);
        return null;
    }

    private static void createCefApp(String url, final OkHttpClient client, final Runnable runnable) {
        try {
            final JFrame frame = new JFrame("Import Jagex Account characters");
            frame.addWindowListener(new WindowAdapter(){

                @Override
                public void windowClosing(WindowEvent e) {
                    try {
                        CefApp.getInstance().dispose();
                    }
                    catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    finally {
                        frame.dispose();
                    }
                }
            });
            CefAppBuilder builder = new CefAppBuilder();
            builder.getCefSettings().windowless_rendering_enabled = false;
            builder.setProgressHandler((enumProgress, v) -> {
                if (enumProgress == EnumProgress.DOWNLOADING && v == 0.0f) {
                    JOptionPane.showMessageDialog(null, "Downloading Browser Package...");
                }
                if (enumProgress == EnumProgress.DOWNLOADING && v == 100.0f) {
                    JOptionPane.showMessageDialog(null, "Downloaded Browser Package");
                }
            });
            builder.setAppHandler(new MavenCefAppHandlerAdapter(){

                @Override
                public boolean onBeforeTerminate() {
                    return super.onBeforeTerminate();
                }
            });
            CefApp cefApp = builder.build();
            CefClient browserClient = cefApp.createClient();
            CefBrowser browser = browserClient.createBrowser(url, false, true);
            browserClient.addDisplayHandler(new CefDisplayHandlerAdapter(){

                @Override
                public void onTitleChange(CefBrowser browser, String title) {
                    String url = browser.getURL();
                    if (url.contains("localhost")) {
                        idToken = url.split("id_token=")[1].split("&")[0];
                        String sessionId = AccountImporter.createNewSession(idToken, client);
                        SwingUtilities.invokeLater(() -> {
                            browser.close(true);
                            frame.setVisible(false);
                            AccountImporter.getAccountsAndWriteToFile(sessionId, new MyCookieJar());
                            runnable.run();
                        });
                    }
                    if (title.contains("Launcher Redirect")) {
                        String code = url.split("code=")[1].split("&")[0];
                        FormBody formBody = new FormBody.Builder().add("grant_type", "authorization_code").add("client_id", "com_jagex_auth_desktop_launcher").add("code", code).add("redirect_uri", "https://secure.runescape.com/m=weblogin/launcher-redirect").build();
                        Request accountsRequest = new Request.Builder().url("https://account.jagex.com/oauth2/token").post(formBody).build();
                        try (Response res = client.newCall(accountsRequest).execute();){
                            Map results = GSON.fromJson(res.body().string(), Map.class);
                            bearer = (String)results.get("access_token");
                            idToken = (String)results.get("id_token");
                        }
                        catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        AccountImporter.getRealIdToken(idToken, browser);
                    }
                }
            });
            frame.add(browser.getUIComponent(), "Center");
            frame.setDefaultCloseOperation(2);
            frame.setLocationRelativeTo(null);
            frame.pack();
            frame.setSize(500, 600);
            frame.setVisible(true);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class MyCookieJar
    implements CookieJar {
        private Map<String, Cookie> cookies;

        public Collection<Cookie> getCookies() {
            if (!this.cookies.containsKey("cf_clearance")) {
                this.cookies.put("cf_clearance", new Cookie.Builder().domain(".runescape.com").path("/").name("cf_clearance").value("w_uCdcELypRxLW8FVSQHwVN8rMRvQAEW2rtEJbw3_ao-1708982203-1.0-Ab8bXt8RM53rUyij5UhdcF5IFvZ/1//ZIRkYHQrtd1Xt0/YIUW9WvuaPauFyx4+Cu64rYJ4ZjcPphh3ErE1vkxg=").httpOnly().secure().build());
            }
            return this.cookies.values();
        }

        @Override
        public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
            if (this.cookies == null) {
                this.cookies = new HashMap<String, Cookie>();
            }
            for (Cookie newCookie : cookies) {
                this.cookies.put(newCookie.name(), newCookie);
            }
        }

        @Override
        public List<Cookie> loadForRequest(HttpUrl url) {
            if (this.cookies != null) {
                return new ArrayList<Cookie>(this.cookies.values());
            }
            return new ArrayList<Cookie>();
        }
    }
}
