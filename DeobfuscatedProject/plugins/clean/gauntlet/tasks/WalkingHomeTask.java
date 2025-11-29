/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import gg.squire.gauntlet.tasks.GameEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Walking home", priority=1)
public class WalkingHomeTask
extends GauntletTaskBase {

    private static boolean lllllIlllIIllI(Object object) {
        return object == null;
    }

    @Override
    public boolean be() {
        Item var1;
        N var2;
        Player player = Players.getLocal();
        if (N.lllllIlllIIllI(player)) {
            return llIIlIllIlIl[1];
        }
        if (N.lllllIlllIIlll(var2.ba.WalkingHomeTask() ? 1 : 0)) {
            if (N.lllllIlllIIlll(var2.ba.a(i2 -> {
                boolean bl;
                if (!N.lllllIlllIlIIl(i2, (Object)i.CRYSTAL_SHARD) || N.lllllIlllIlIlI(i2, (Object)i.FISH)) {
                    bl = llIIlIllIlIl[0];

                    if (((0xC9 ^ 0x95 ^ (0x64 ^ 0x77)) & (195 + 216 - 366 + 187 ^ 120 + 53 - 12 + 6 ^ -1)) != 0) {
                        return ((0x73 ^ 0x2F ^ (0xC1 ^ 0x87)) & (0x3B ^ 0x1A ^ (0x9E ^ 0xA5) ^ -1)) != 0;
                    }
                } else {
                    bl = llIIlIllIlIl[1];
                }
                return bl;
            }) ? 1 : 0)) {
                return llIIlIllIlIl[1];
            }
            if (N.lllllIlllIIlll(var2.ba.O() ? 1 : 0)) {
                return llIIlIllIlIl[1];
            }
        }
        if (N.lllllIlllIlIII(var1 = Inventory.getFirst(item -> e.ab.contains(item.getId())))) {
            var1.interact(llIIlIllIlII[llIIlIllIlIl[1]]);
            return llIIlIllIlIl[0];
        }
        return this.ba.a((l)this.ba.V().av(), player.getWorldLocation());
    }

    private static boolean lllllIlllIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIlllIlIII(Object object) {
        return object != null;
    }

    @Inject
    public WalkingHomeTask(c c2) {
        d[] dArray = new d[llIIlIllIlIl[0]];
        dArray[N.llIIlIllIlIl[1]] = d.EXTRA_FOOD_EXPLORE;
        super(c2, dArray);
    }

    private static boolean lllllIlllIlIIl(Object object, Object object2) {
        return object != object2;
    }

    static {
        N.lllllIlllIIlIl();
        N.lllllIlllIIlII();
    }

    private static boolean lllllIlllIlIlI(Object object, Object object2) {
        return object == object2;
    }

    private static void lllllIlllIIlII() {
        llIIlIllIlII = new String[llIIlIllIlIl[0]];
        N.llIIlIllIlII[N.llIIlIllIlIl[1]] = "Activate";
    }
}

