/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.http.api.telemetry.Telemetry
 */
package net.runelite.client;

import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import net.runelite.http.api.telemetry.Telemetry;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TelemetryClient {
    private static final Logger log = LoggerFactory.getLogger(TelemetryClient.class);
    private final OkHttpClient okHttpClient;
    private final Gson gson;
    private final HttpUrl apiBase;

    private static Telemetry buildTelemetry() {
        Telemetry telemetry = new Telemetry();
        return telemetry;
    }

    void submitTelemetry() {
    }

    void submitVmErrors(File logsDir) {
        try {
            long yesterday = System.currentTimeMillis() - Duration.ofDays(1L).toMillis();
            for (File f : logsDir.listFiles()) {
                if (!f.getName().startsWith("jvm_crash_") || !f.getName().endsWith(".log") || f.getName().endsWith("_r.log") || f.lastModified() < yesterday) continue;
                String hsErr = Files.readString(f.toPath());
                String destName = f.getName().substring(0, f.getName().length() - 4) + "_r.log";
                File dest = new File(logsDir, destName);
                if (!f.renameTo(dest)) continue;
                String username = System.getProperty("user.name");
                String home = System.getProperty("user.home");
                hsErr = hsErr.replace(username, "%USERNAME%").replace(home, "%HOME%");
                this.submitError("vm crash", hsErr);
            }
        }
        catch (Exception ex) {
            log.error("error reporting errors", ex);
        }
    }

    public void submitError(String type, String error) {
        HttpUrl url = this.apiBase.newBuilder().addPathSegment("telemetry").addPathSegment("error").addQueryParameter("type", type).build();
        Request request = new Request.Builder().url(url).post(RequestBody.create(MediaType.get("text/plain"), error)).build();
        this.okHttpClient.newCall(request).enqueue(new Callback(){

            @Override
            public void onFailure(Call call, IOException e) {
                log.debug("Error submitting error", e);
            }

            @Override
            public void onResponse(Call call, Response response) {
                log.debug("Submitted error");
                response.close();
            }
        });
    }

    public TelemetryClient(OkHttpClient okHttpClient, Gson gson, HttpUrl apiBase) {
        this.okHttpClient = okHttpClient;
        this.gson = gson;
        this.apiBase = apiBase;
    }
}

