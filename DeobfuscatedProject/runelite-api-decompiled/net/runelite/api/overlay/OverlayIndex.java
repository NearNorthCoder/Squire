/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.overlay;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OverlayIndex {
    private static final Logger log = LoggerFactory.getLogger(OverlayIndex.class);
    private static final Set<Integer> overlays = new HashSet<Integer>();
    private static final HashMap<Integer, Function<byte[], byte[]>> cacheTransformers = new HashMap();

    public static boolean hasCacheTransformer(int indexId, int archiveId) {
        return cacheTransformers.containsKey(indexId << 16 | archiveId);
    }

    public static Function<byte[], byte[]> getCacheTransformer(int indexId, int archiveId) {
        return cacheTransformers.get(indexId << 16 | archiveId);
    }

    public static boolean hasOverlay(int indexId, int archiveId) {
        return overlays.contains(indexId << 16 | archiveId);
    }

    public static Set<Integer> getOverlays() {
        return overlays;
    }

    public static HashMap<Integer, Function<byte[], byte[]>> getCacheTransformers() {
        return cacheTransformers;
    }

    static {
        try (InputStream indexStream = OverlayIndex.class.getResourceAsStream("/runelite/index");
             DataInputStream in = new DataInputStream(indexStream);){
            int id;
            while ((id = in.readInt()) != -1) {
                overlays.add(id);
            }
        }
        catch (IOException ex) {
            log.warn("unable to load overlay index", ex);
        }
    }
}

