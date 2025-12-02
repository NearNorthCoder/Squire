/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  org.jetbrains.annotations.NotNull
 */
package net.unethicalite.api.magic;

import com.google.common.cache.CacheLoader;
import net.unethicalite.api.game.Vars;
import org.jetbrains.annotations.NotNull;

class RunePouch.RuneSlot.1
extends CacheLoader<Integer, Integer> {
    RunePouch.RuneSlot.1() {
    }

    public Integer load(@NotNull Integer type) {
        return Vars.getBit(type);
    }
}
