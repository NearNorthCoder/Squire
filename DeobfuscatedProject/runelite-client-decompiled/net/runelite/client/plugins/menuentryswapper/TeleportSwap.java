/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.plugins.menuentryswapper;

import java.util.ArrayList;
import java.util.List;
import net.runelite.client.plugins.menuentryswapper.TeleportSub;

class TeleportSwap {
    boolean worn;
    boolean held;
    String option;
    List<TeleportSub> subs = new ArrayList<TeleportSub>();

    TeleportSwap() {
    }

    TeleportSwap addSub(String option, Runnable r) {
        TeleportSub sub = new TeleportSub();
        sub.option = option;
        sub.execute = r;
        this.subs.add(sub);
        return this;
    }

    TeleportSwap worn() {
        this.worn = true;
        return this;
    }

    TeleportSwap held() {
        this.held = true;
        return this;
    }
}

