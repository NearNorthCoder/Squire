/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.pf4j.PluginManager
 *  org.pf4j.PluginRuntimeException
 *  org.pf4j.PluginState
 *  org.pf4j.PluginWrapper
 *  org.pf4j.VersionManager
 *  org.pf4j.update.FileDownloader
 *  org.pf4j.update.FileVerifier
 *  org.pf4j.update.FileVerifier$Context
 *  org.pf4j.update.PluginInfo
 *  org.pf4j.update.PluginInfo$PluginRelease
 *  org.pf4j.update.SimpleFileDownloader
 *  org.pf4j.update.UpdateManager
 *  org.pf4j.update.verifier.CompoundVerifier
 */
package net.runelite.client.plugins;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.client.plugins.OPRSUpdateRepository;
import org.pf4j.PluginManager;
import org.pf4j.PluginRuntimeException;
import org.pf4j.PluginState;
import org.pf4j.PluginWrapper;
import org.pf4j.VersionManager;
import org.pf4j.update.FileDownloader;
import org.pf4j.update.FileVerifier;
import org.pf4j.update.PluginInfo;
import org.pf4j.update.SimpleFileDownloader;
import org.pf4j.update.UpdateManager;
import org.pf4j.update.verifier.CompoundVerifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OPRSUpdateManager {
    private static final Logger log = LoggerFactory.getLogger(UpdateManager.class);
    private final PluginManager pluginManager;
    private final VersionManager versionManager;
    private final String systemVersion;
    private final Path repositoriesJson;
    private final Map<String, PluginInfo.PluginRelease> lastPluginRelease = new HashMap<String, PluginInfo.PluginRelease>();
    protected List<OPRSUpdateRepository> repositories;

    public OPRSUpdateManager(PluginManager pluginManager) {
        this.pluginManager = pluginManager;
        this.versionManager = pluginManager.getVersionManager();
        this.systemVersion = pluginManager.getSystemVersion();
        this.repositoriesJson = Paths.get("repositories.json", new String[0]);
    }

    public OPRSUpdateManager(PluginManager pluginManager, List<OPRSUpdateRepository> repos) {
        this(pluginManager);
        this.repositories = repos == null ? new ArrayList() : repos;
    }

    public List<PluginInfo> getAvailablePlugins() {
        ArrayList<PluginInfo> availablePlugins = new ArrayList<PluginInfo>();
        for (PluginInfo plugin : this.getPlugins()) {
            if (this.pluginManager.getPlugin(plugin.id) != null) continue;
            availablePlugins.add(plugin);
        }
        return availablePlugins;
    }

    public List<PluginInfo> getUpdates() {
        ArrayList<PluginInfo> updates = new ArrayList<PluginInfo>();
        for (PluginWrapper installed : this.pluginManager.getPlugins()) {
            String pluginId = installed.getPluginId();
            if (!this.hasPluginUpdate(pluginId)) continue;
            updates.add(this.getPluginsMap().get(pluginId));
        }
        return updates;
    }

    public boolean hasUpdates() {
        return this.getUpdates().size() > 0;
    }

    public List<PluginInfo> getPlugins() {
        ArrayList<PluginInfo> list = new ArrayList<PluginInfo>(this.getPluginsMap().values());
        Collections.sort(list);
        return list;
    }

    public Map<String, PluginInfo> getPluginsMap() {
        HashMap<String, PluginInfo> pluginsMap = new HashMap<String, PluginInfo>();
        for (OPRSUpdateRepository repository : this.getRepositories()) {
            pluginsMap.putAll(repository.getPlugins());
        }
        return pluginsMap;
    }

    public List<OPRSUpdateRepository> getRepositories() {
        if (this.repositories == null && this.repositoriesJson != null) {
            this.refresh();
        }
        return this.repositories;
    }

    public void addRepository(String id, URL url) {
        for (OPRSUpdateRepository ur : this.repositories) {
            if (!ur.getId().equals(id)) continue;
            throw new RuntimeException("Repository with id " + id + " already exists");
        }
        this.repositories.add(new OPRSUpdateRepository(id, url));
    }

    public void addRepository(OPRSUpdateRepository newRepo) {
        for (OPRSUpdateRepository ur : this.repositories) {
            if (!ur.getId().equals(newRepo.getId())) continue;
            throw new RuntimeException("Repository with id " + newRepo.getId() + " already exists");
        }
        newRepo.refresh();
        this.repositories.add(newRepo);
    }

    public void removeRepository(String id) {
        for (OPRSUpdateRepository repo : this.getRepositories()) {
            if (!id.equals(repo.getId())) continue;
            this.repositories.remove(repo);
            break;
        }
        log.warn("Repository with id " + id + " not found, doing nothing");
    }

    public synchronized void refresh() {
        if (this.repositoriesJson != null && Files.exists(this.repositoriesJson, new LinkOption[0])) {
            this.initRepositoriesFromJson();
        }
        for (OPRSUpdateRepository updateRepository : this.repositories) {
            updateRepository.refresh();
        }
        this.lastPluginRelease.clear();
    }

    public synchronized boolean installPlugin(String id, String version) {
        Path downloaded = this.downloadPlugin(id, version);
        Path pluginsRoot = this.pluginManager.getPluginsRoot();
        Path file = pluginsRoot.resolve(downloaded.getFileName());
        try {
            Files.move(downloaded, file, StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException e) {
            throw new PluginRuntimeException((Throwable)e, "Failed to write file '{}' to plugins folder", new Object[]{file});
        }
        String pluginId = this.pluginManager.loadPlugin(file);
        PluginState state = this.pluginManager.startPlugin(pluginId);
        return PluginState.STARTED.equals((Object)state);
    }

    protected Path downloadPlugin(String id, String version) {
        try {
            PluginInfo.PluginRelease release = this.findReleaseForPlugin(id, version);
            Path downloaded = this.getFileDownloader(id).downloadFile(new URL(release.url));
            this.getFileVerifier(id).verify(new FileVerifier.Context(id, release), downloaded);
            return downloaded;
        }
        catch (IOException e) {
            throw new PluginRuntimeException((Throwable)e, "Error during download of plugin {}", new Object[]{id});
        }
    }

    protected FileDownloader getFileDownloader(String pluginId) {
        for (OPRSUpdateRepository ur : this.repositories) {
            if (ur.getPlugin(pluginId) == null || ur.getFileDownloader() == null) continue;
            return ur.getFileDownloader();
        }
        return new SimpleFileDownloader();
    }

    protected FileVerifier getFileVerifier(String pluginId) {
        for (OPRSUpdateRepository ur : this.repositories) {
            if (ur.getPlugin(pluginId) == null || ur.getFileVerifier() == null) continue;
            return ur.getFileVerifier();
        }
        return new CompoundVerifier();
    }

    protected PluginInfo.PluginRelease findReleaseForPlugin(String id, String version) {
        PluginInfo pluginInfo = this.getPluginsMap().get(id);
        if (pluginInfo == null) {
            log.info("Plugin with id {} does not exist in any repository", (Object)id);
            throw new PluginRuntimeException("Plugin with id {} not found in any repository", new Object[]{id});
        }
        if (version == null) {
            return this.getLastPluginRelease(id);
        }
        for (PluginInfo.PluginRelease release : pluginInfo.releases) {
            if (this.versionManager.compareVersions(version, release.version) != 0 || release.url == null) continue;
            return release;
        }
        throw new PluginRuntimeException("Plugin {} with version @{} does not exist in the repository", new Object[]{id, version});
    }

    public boolean updatePlugin(String id, String version) {
        if (this.pluginManager.getPlugin(id) == null) {
            throw new PluginRuntimeException("Plugin {} cannot be updated since it is not installed", new Object[]{id});
        }
        PluginInfo pluginInfo = this.getPluginsMap().get(id);
        if (pluginInfo == null) {
            throw new PluginRuntimeException("Plugin {} does not exist in any repository", new Object[]{id});
        }
        if (!this.hasPluginUpdate(id)) {
            log.warn("Plugin {} does not have an update available which is compatible with system version {}", (Object)id, (Object)this.systemVersion);
            return false;
        }
        Path downloaded = this.downloadPlugin(id, version);
        if (!this.pluginManager.deletePlugin(id)) {
            return false;
        }
        Path pluginsRoot = this.pluginManager.getPluginsRoot();
        Path file = pluginsRoot.resolve(downloaded.getFileName());
        try {
            Files.move(downloaded, file, StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException e) {
            throw new PluginRuntimeException("Failed to write plugin file {} to plugin folder", new Object[]{file});
        }
        String newPluginId = this.pluginManager.loadPlugin(file);
        PluginState state = this.pluginManager.startPlugin(newPluginId);
        return PluginState.STARTED.equals((Object)state);
    }

    public PluginInfo.PluginRelease getLastPluginRelease(String id) {
        PluginInfo pluginInfo = this.getPluginsMap().get(id);
        if (pluginInfo == null) {
            return null;
        }
        if (!this.lastPluginRelease.containsKey(id)) {
            for (PluginInfo.PluginRelease release : pluginInfo.releases) {
                if (!this.systemVersion.equals("0.0.0") && !this.versionManager.checkVersionConstraint(this.systemVersion, release.requires)) continue;
                if (this.lastPluginRelease.get(id) == null) {
                    this.lastPluginRelease.put(id, release);
                    continue;
                }
                if (this.versionManager.compareVersions(release.version, this.lastPluginRelease.get((Object)id).version) <= 0) continue;
                this.lastPluginRelease.put(id, release);
            }
        }
        return this.lastPluginRelease.get(id);
    }

    public boolean hasPluginUpdate(String id) {
        PluginInfo pluginInfo = this.getPluginsMap().get(id);
        if (pluginInfo == null) {
            return false;
        }
        String installedVersion = this.pluginManager.getPlugin(id).getDescriptor().getVersion();
        PluginInfo.PluginRelease last = this.getLastPluginRelease(id);
        return last != null && this.versionManager.compareVersions(last.version, installedVersion) > 0;
    }

    protected synchronized void initRepositoriesFromJson() {
        log.debug("Read repositories from '{}'", (Object)this.repositoriesJson);
        try (FileReader reader = new FileReader(this.repositoriesJson.toFile());){
            Gson gson = new GsonBuilder().create();
            OPRSUpdateRepository[] items = gson.fromJson((Reader)reader, OPRSUpdateRepository[].class);
            this.repositories = Arrays.asList(items);
        }
        catch (IOException e) {
            e.printStackTrace();
            this.repositories = Collections.emptyList();
        }
    }
}

