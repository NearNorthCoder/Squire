/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.api.game;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.time.Duration;
import java.util.concurrent.ExecutionException;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.client.Static;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Prices {
    private static final Logger logger = LoggerFactory.getLogger(Prices.class);
    private static final LoadingCache<Integer, Integer> CACHE = CacheBuilder.newBuilder().expireAfterWrite(Duration.ofMinutes(5L)).build(new CacheLoader<Integer, Integer>(){

        @Override
        public Integer load(@NotNull Integer itemId) {
            logger.debug("Caching item {} price", (Object)itemId);
            return GameThread.invokeLater(() -> Static.getItemManager().getItemPrice(itemId));
        }
    });

    public static int getItemPrice(int id) {
        try {
            return CACHE.get(id);
        }
        catch (ExecutionException e) {
            return -1;
        }
    }
}

