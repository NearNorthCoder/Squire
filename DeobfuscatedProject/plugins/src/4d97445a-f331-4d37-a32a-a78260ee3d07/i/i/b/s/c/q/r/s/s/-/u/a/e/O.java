/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.util.HotkeyListener
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.combat.Lure.SquireLurer;
import java.util.function.Supplier;
import net.runelite.client.util.HotkeyListener;

public class O
extends HotkeyListener {
    final /* synthetic */ SquireLurer bZ;

    public void hotkeyPressed() {
        this.bZ.bW.aH();
    }

    public O(SquireLurer squireLurer, Supplier supplier) {
        this.bZ = squireLurer;
        super(supplier);
    }
}

