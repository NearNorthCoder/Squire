/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  net.unethicalite.client.Static
 *  org.jetbrains.annotations.NotNull
 */
package net.unethicalite.api.game;

import com.google.common.cache.CacheLoader;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.client.Static;
import org.jetbrains.annotations.NotNull;

class Prices.1
extends CacheLoader<Integer, Integer> {
    Prices.1() {
    }

    public Integer load(@NotNull Integer itemId) {
        logger.debug("Caching item {} price", (Object)itemId);
        return GameThread.invokeLater(() -> Static.getItemManager().getItemPrice(itemId.intValue()));
    }
}
