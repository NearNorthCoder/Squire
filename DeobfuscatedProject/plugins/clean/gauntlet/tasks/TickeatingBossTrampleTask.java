/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Tick-eating boss trample", priority=10)
public class TickeatingBossTrampleTask
extends GauntletTaskBase {
    private final  b bI;
    
    private  int bJ;

    private static boolean lIIIIIIlIllIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIIlIlllIII(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var1;
        z var2;
        Player player = Players.getLocal();
        if (z.lIIIIIIlIllIlIl(player)) {
            return llIlIIIllllI[1];
        }
        Item var3 = Inventory.getFirst(item -> e.aH.contains(item.getId()));
        if (z.lIIIIIIlIllIlIl(var3)) {
            return llIlIIIllllI[1];
        }
        NPC var4 = var2.ba.X().aI();
        if (z.lIIIIIIlIllIlIl(var4)) {
            return llIlIIIllllI[1];
        }
        if (z.lIIIIIIlIllIllI(var4.getWorldArea().contains(var1.getWorldLocation()) ? 1 : 0)) {
            var2.bJ = Static.getClient().getTickCount();
            return llIlIIIllllI[1];
        }
        if (z.lIIIIIIlIllIlll(var4.getAnimation(), llIlIIIllllI[2])) {
            return llIlIIIllllI[1];
        }
        if (z.lIIIIIIlIlllIII(Static.getClient().getTickCount() - var2.bJ, llIlIIIllllI[3])) {
            var3.interact(llIlIIIlllIl[llIlIIIllllI[1]]);
            var2.bI.u();
            return llIlIIIllllI[0];
        }
        return llIlIIIllllI[1];
    }

    static {
        z.lIIIIIIlIllIlII();
        z.lIIIIIIlIllIIll();
    }

    private static boolean lIIIIIIlIllIlll(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIIIIIIlIllIIll() {
        llIlIIIlllIl = new String[llIlIIIllllI[0]];
        z.llIlIIIlllIl[z.llIlIIIllllI[1]] = "Eat";
    }

    private static boolean lIIIIIIlIllIlIl(Object object) {
        return object == null;
    }

    @Inject
    public TickeatingBossTrampleTask(c c2, b b2) {
        d[] dArray = new d[llIlIIIllllI[0]];
        dArray[z.llIlIIIllllI[1]] = d.BOSS_FIGHT;
        super(c2, dArray);
        this.bI = b2;
    }
}

