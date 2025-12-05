/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.pf4j.update.DefaultUpdateRepository
 *  org.pf4j.update.FileDownloader
 *  org.pf4j.update.FileVerifier
 *  org.pf4j.update.PluginInfo
 *  org.pf4j.update.PluginInfo$PluginRelease
 *  org.pf4j.update.SimpleFileDownloader
 *  org.pf4j.update.UpdateRepository
 *  org.pf4j.update.util.LenientDateTypeAdapter
 *  org.pf4j.update.verifier.CompoundVerifier
 */
package net.runelite.client.plugins;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import net.unethicalite.client.Static;
import org.apache.commons.lang3.StringUtils;
import org.pf4j.update.DefaultUpdateRepository;
import org.pf4j.update.FileDownloader;
import org.pf4j.update.FileVerifier;
import org.pf4j.update.PluginInfo;
import org.pf4j.update.SimpleFileDownloader;
import org.pf4j.update.UpdateRepository;
import org.pf4j.update.util.LenientDateTypeAdapter;
import org.pf4j.update.verifier.CompoundVerifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OPRSUpdateRepository
implements UpdateRepository {
    private static final String DEFAULT_PLUGINS_JSON_FILENAME = "plugins.json";
    private static final Logger log = LoggerFactory.getLogger(DefaultUpdateRepository.class);
    private final String id;
    private final URL url;
    private String pluginsJsonFileName;
    protected Map<String, PluginInfo> plugins;

    public OPRSUpdateRepository(String id, URL url) {
        this(id, url, DEFAULT_PLUGINS_JSON_FILENAME);
    }

    public OPRSUpdateRepository(String id, URL url, String pluginsJsonFileName) {
        this.id = id;
        this.url = url;
        this.pluginsJsonFileName = pluginsJsonFileName;
    }

    public String getId() {
        return this.id;
    }

    public URL getUrl() {
        return this.url;
    }

    public Map<String, PluginInfo> getPlugins() {
        if (this.plugins == null) {
            this.initPlugins();
        }
        return this.plugins;
    }

    public PluginInfo getPlugin(String id) {
        return this.getPlugins().get(id);
    }

    public void initPlugins() {
        PluginInfo[] items;
        InputStreamReader pluginsJsonReader;
        if (Static.getPluginRepoManager().isRepoMalicious(this.getOwner())) {
            return;
        }
        try {
            URL pluginsUrl = new URL(this.getUrl(), this.getPluginsJsonFileName());
            log.debug("Read plugins of '{}' repository from '{}'", (Object)this.id, (Object)pluginsUrl);
            pluginsJsonReader = new InputStreamReader(pluginsUrl.openStream());
        }
        catch (FileNotFoundException e) {
            log.error("{}{} could not be loaded (file missing)", (Object)this.getUrl(), (Object)this.getPluginsJsonFileName());
            this.plugins = Collections.emptyMap();
            return;
        }
        catch (Exception e) {
            log.error(e.getMessage(), e);
            this.plugins = Collections.emptyMap();
            return;
        }
        Gson gson = new GsonBuilder().registerTypeAdapter((Type)((Object)Date.class), new LenientDateTypeAdapter()).create();
        try {
            items = gson.fromJson((Reader)pluginsJsonReader, PluginInfo[].class);
        }
        catch (JsonSyntaxException | IllegalStateException ex) {
            items = new PluginInfo[]{};
        }
        this.plugins = new HashMap<String, PluginInfo>(items.length);
        for (PluginInfo p : items) {
            for (PluginInfo.PluginRelease r : p.releases) {
                try {
                    r.url = new URL(this.getUrl(), r.url).toString();
                    if (r.date.getTime() != 0L) continue;
                    log.warn("Illegal release date when parsing {}@{}, setting to epoch", (Object)p.id, (Object)r.version);
                }
                catch (MalformedURLException e) {
                    log.warn("Skipping release {} of plugin {} due to failure to build valid absolute URL. Url was {}{}", r.version, p.id, this.getUrl(), r.url);
                }
            }
            p.setRepositoryId(this.getId());
            this.plugins.put(p.id, p);
        }
        log.debug("Found {} plugins in repository '{}'", (Object)this.plugins.size(), (Object)this.id);
    }

    public void refresh() {
        this.plugins = null;
    }

    public FileDownloader getFileDownloader() {
        return new SimpleFileDownloader();
    }

    public FileVerifier getFileVerifier() {
        return new CompoundVerifier();
    }

    public String getPluginsJsonFileName() {
        if (this.pluginsJsonFileName == null) {
            this.pluginsJsonFileName = DEFAULT_PLUGINS_JSON_FILENAME;
        }
        return this.pluginsJsonFileName;
    }

    public String getOwner() {
        return StringUtils.substringBetween(this.id, "gh:", "/");
    }
}

