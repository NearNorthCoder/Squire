/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  org.pf4j.update.FileDownloader
 *  org.pf4j.update.FileVerifier
 *  org.pf4j.update.PluginInfo
 *  org.pf4j.update.UpdateRepository
 *  org.pf4j.update.verifier.BasicVerifier
 */
package gg.squire.client.core.loader;

import gg.squire.client.Squire;
import gg.squire.client.core.loader.SquireDownloader;
import java.net.URL;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.pf4j.update.FileDownloader;
import org.pf4j.update.FileVerifier;
import org.pf4j.update.PluginInfo;
import org.pf4j.update.UpdateRepository;
import org.pf4j.update.verifier.BasicVerifier;

@Singleton
public class SquirePluginRepository
implements UpdateRepository {
    private final Squire squire;

    @Inject
    public SquirePluginRepository(Squire squire) {
        this.squire = squire;
    }

    public String getId() {
        return "squire-jar-server";
    }

    public URL getUrl() {
        return null;
    }

    public Map<String, PluginInfo> getPlugins() {
        return null;
    }

    public PluginInfo getPlugin(String id) {
        return null;
    }

    public void refresh() {
    }

    public FileDownloader getFileDownloader() {
        return new SquireDownloader();
    }

    public FileVerifier getFileVerifier() {
        return new BasicVerifier();
    }
}
