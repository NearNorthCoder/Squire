/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.GameObject
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import gg.squire.gauntlet.tasks.GameEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.GameObject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Harvesting resources", priority=2, blocking=true)
public class HarvestingResourcesTask
extends GauntletTaskBase {

    private final  String[] bW;
    private final  b bV;

    static {
        L.lIIIIIIIIlIIIII();
        L.lIIIIIIIIIlllll();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        L var1;
        Player player = Players.getLocal();
        if (L.lIIIIIIIIlIIIIl(player)) {
            return llIIlllllIIl[1];
        }
        if (L.lIIIIIIIIlIIIlI(var1.ba.M(), llIIlllllIIl[5])) {
            return llIIlllllIIl[1];
        }
        Item var2 = var1.bC();
        if (L.lIIIIIIIIlIIIll(var2)) {
            var2.interact(llIIllllIIlI[llIIlllllIIl[0]]);
            return llIIlllllIIl[2];
        }
        if (L.lIIIIIIIIlIIlII(var1.ba.R() ? 1 : 0)) {
            return llIIlllllIIl[1];
        }
        if (L.lIIIIIIIIlIIlII(Inventory.isFull() ? 1 : 0)) {
            return llIIlllllIIl[1];
        }
        if (L.lIIIIIIIIlIIlII(var1.bV.p() ? 1 : 0)) {
            return llIIlllllIIl[2];
        }
        Player var3 = Players.getLocal();
        GameObject var4 = var1.ba.U();
        if (L.lIIIIIIIIlIIIll(var4)) {
            void var5;
            if (L.lIIIIIIIIlIIIll(var3.getInteracting())) {
                var1.bV.e(Rand.nextInt((int)llIIlllllIIl[3], (int)llIIlllllIIl[0]));
                return llIIlllllIIl[2];
            }
            h var6 = var1.ba.V();
            if (L.lIIIIIIIIlIIIIl(var6)) {
                return llIIlllllIIl[1];
            }
            l var7 = var6.d(var4.getWorldLocation());
            if (L.lIIIIIIIIlIIIIl(var7)) {
                return llIIlllllIIl[1];
            }
            if (L.lIIIIIIIIlIIlIl(var7.e(var5.getWorldLocation()) ? 1 : 0)) {
                return var1.ba.a(var7, var5.getWorldLocation());
            }
            if (L.lIIIIIIIIlIIlII(var4.hasAction(var1.bW) ? 1 : 0)) {
                var4.interact(var1.bW);
                var1.bV.e(Rand.nextInt((int)llIIlllllIIl[3], (int)llIIlllllIIl[0]));
                return llIIlllllIIl[2];
            }
            Object[] objectArray = new Object[llIIlllllIIl[3]];
            objectArray[L.llIIlllllIIl[1]] = var4.getName();
            objectArray[L.llIIlllllIIl[2]] = var4.getActions();
            Log.info((String)llIIllllIIlI[llIIlllllIIl[6]], (Object[])objectArray);
            return llIIlllllIIl[1];
        }
        return llIIlllllIIl[1];
    }

    private static boolean lIIIIIIIIlIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIIIIIlIIIll(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIIIlIIllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIIIIIIlIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public HarvestingResourcesTask(c c2, b b2) {
        d[] dArray = new d[llIIlllllIIl[0]];
        dArray[L.llIIlllllIIl[1]] = d.FIRST_ROTATION_EXPLORE;
        dArray[L.llIIlllllIIl[2]] = d.DEMI_BOSS_EXPLORE;
        dArray[L.llIIlllllIIl[3]] = d.EXTRA_FOOD_EXPLORE;
        dArray[L.llIIlllllIIl[4]] = d.PREPARE_BOSS_FIGHT;
        super(c2, dArray);
        String[] stringArray = new String[llIIlllllIIl[0]];
        stringArray[L.llIIlllllIIl[1]] = llIIllllIIlI[llIIlllllIIl[1]];
        stringArray[L.llIIlllllIIl[2]] = llIIllllIIlI[llIIlllllIIl[2]];
        stringArray[L.llIIlllllIIl[3]] = llIIllllIIlI[llIIlllllIIl[3]];
        stringArray[L.llIIlllllIIl[4]] = llIIllllIIlI[llIIlllllIIl[4]];
        this.bW = stringArray;
        this.bV = b2;
    }

    private static boolean lIIIIIIIIlIlIII(int n2) {
        return n2 <= 0;
    }

    private static void lIIIIIIIIIlllll() {
        llIIllllIIlI = new String[llIIlllllIIl[7]];
        L.llIIllllIIlI[L.llIIlllllIIl[1]] = "Chop";
        L.llIIllllIIlI[L.llIIlllllIIl[2]] = "Mine";
        L.llIIllllIIlI[L.llIIlllllIIl[3]] = "Fish";
        L.llIIllllIIlI[L.llIIlllllIIl[4]] = "Pick";
        L.llIIllllIIlI[L.llIIlllllIIl[0]] = "Drop";
        L.llIIllllIIlI[L.llIIlllllIIl[6]] = "No action found for target: {}, available actions: {}";
    }

    private static boolean lIIIIIIIIlIIIIl(Object object) {
        return object == null;
    }

        return String.valueOf(var8);
    }

    private static boolean lIIIIIIIIlIIlII(int n2) {
        return n2 != 0;
    }

    private static  boolean a(Item item, i i2) {
        return i2.ay().contains(item.getId());
    }

    private static boolean lIIIIIIIIlIIlll(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIIIIIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private Item bC() {
        return Inventory.getFirst(item -> {
            boolean bl;
            void var9;
            Optional<i> lllllllllllllllIlIIIllllllIlIIlI2;
            L var10;
            if (L.lIIIIIIIIlIIlII(i.FISH.ay().contains(item.getId()) ? 1 : 0)) {
                if (!L.lIIIIIIIIlIIllI((Object)this.ba.W(), (Object)d.DEMI_BOSS_EXPLORE) || L.lIIIIIIIIlIIlll(Inventory.getFreeSlots())) {
                    return llIIlllllIIl[1];
                }
                int lllllllllllllllIlIIIllllllIlIIlI2 = var10.ba.E().getOrDefault((Object)i.FISH, llIIlllllIIl[1]);
                if (L.lIIIIIIIIlIIllI((Object)var10.ba.W(), (Object)d.DEMI_BOSS_EXPLORE) && L.lIIIIIIIIlIIlll(lllllllllllllllIlIIIllllllIlIIlI2)) {
                    return llIIlllllIIl[1];
                }
            }
            if (L.lIIIIIIIIlIIlII((lllllllllllllllIlIIIllllllIlIIlI2 = Arrays.stream(i.values()).filter(arg_0 -> L.a((Item)var9, arg_0)).findFirst()).isEmpty() ? 1 : 0)) {
                return llIIlllllIIl[1];
            }
            int var11 = var10.ba.E().getOrDefault((Object)lllllllllllllllIlIIIllllllIlIIlI2.get(), llIIlllllIIl[1]);
            if (L.lIIIIIIIIlIlIII(var11)) {
                bl = llIIlllllIIl[2];

                if (((0xAC ^ 0xA9) & ~(2 ^ 7)) != 0) {
                    return (3 & ~3) != 0;
                }
            } else {
                bl = llIIlllllIIl[1];
            }
            return bl;
        });
    }
}

