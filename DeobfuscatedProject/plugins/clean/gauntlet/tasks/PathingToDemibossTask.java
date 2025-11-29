/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import gg.squire.gauntlet.tasks.GameEnum18;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Pathing to Demiboss", priority=1)
public class PathingToDemibossTask
extends GauntletTaskBase {
    
    private final  c bU;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var5_6;
        I var1;
        Player player = Players.getLocal();
        if (!I.lIIIIIIllIlIlII(player) || I.lIIIIIIllIlIlII(player.getInteracting())) {
            return llIlIIlIIIlI[1];
        }
        if (I.lIIIIIIllIlIlIl(Movement.shouldWalk() ? 1 : 0)) {
            return llIlIIlIIIlI[1];
        }
        g var2 = var1.bU.J();
        if (I.lIIIIIIllIlIllI((Object)var2)) {
            return llIlIIlIIIlI[1];
        }
        if (I.lIIIIIIllIlIlll(Inventory.getCount((boolean)llIlIIlIIIlI[0], (int[])var2.an().aB()))) {
            return llIlIIlIIIlI[1];
        }
        h var3 = var1.bU.V();
        if (I.lIIIIIIllIlIllI(var3)) {
            Log.info((String)llIlIIlIIIIl[llIlIIlIIIlI[1]]);
            return llIlIIlIIIlI[1];
        }
        List<l> var4 = var3.b(l2 -> {
            boolean bl;
            if (I.lIIIIIIllIllIIl((Object)l2.aZ(), (Object)var2)) {
                bl = llIlIIlIIIlI[0];

                if (((0xFA ^ 0xB3 ^ (0x3F ^ 0x64)) & (43 + 156 - 77 + 61 ^ 57 + 99 - 17 + 26 ^ -1)) > 0) {
                    return ((0x9E ^ 0xC0 ^ 3) & (0x53 ^ 7 ^ (0xB8 ^ 0xB1) ^ -1)) != 0;
                }
            } else {
                bl = llIlIIlIIIlI[1];
            }
            return bl;
        });
        if (I.lIIIIIIllIlIlIl(var4.isEmpty() ? 1 : 0)) {
            void var5;
            l var6 = var4.get(llIlIIlIIIlI[1]);
            if (I.lIIIIIIllIlIlIl(var6.e(var5.getWorldLocation()) ? 1 : 0)) {
                if (I.lIIIIIIllIlIlll(I.lIIIIIIllIlIIll(var6.aQ().distanceTo((Locatable)var5), 1.5 * (double)var6.aQ().distanceTo(var3.av().aQ())))) {
                    Item var7 = Inventory.getFirst(item -> e.ab.contains(item.getId()));
                    if (I.lIIIIIIllIlIlII(var7)) {
                        var7.interact(llIlIIlIIIIl[llIlIIlIIIlI[0]]);

                        if ((0x10 ^ 0x42 ^ (0x58 ^ 0xE)) == 3) {
                            return ((0xC8 ^ 0xBE ^ (0xB9 ^ 0x8B)) & (130 + 125 - 39 + 16 ^ 133 + 17 - 103 + 125 ^ -1)) != 0;
                        }
                    } else {
                        var1.bU.a((l)var3.av(), var5.getWorldLocation());

                    }

                    }
                } else {
                    var1.bU.a(var6, var5.getWorldLocation());

                }
                return llIlIIlIIIlI[0];
            }
            return llIlIIlIIIlI[1];
        }
        List<l> var6 = var3.b(l2 -> {
            int n2;
            if (I.lIIIIIIllIlIlIl(l2.aY() ? 1 : 0) && I.lIIIIIIllIllIII(l2.aS() ? 1 : 0)) {
                n2 = llIlIIlIIIlI[0];

                if (2 == (0x64 ^ 0x3B ^ (0x5A ^ 1))) {
                    return ((0xE9 ^ 0xBE ^ (0x65 ^ 0x69)) & (0x78 ^ 0x69 ^ (0x16 ^ 0x5C) ^ -1)) != 0;
                }
            } else {
                n2 = llIlIIlIIIlI[1];
            }
            return n2 != 0;
        });
        if (I.lIIIIIIllIllIII(var6.isEmpty() ? 1 : 0)) {
            Log.info((String)llIlIIlIIIIl[llIlIIlIIIlI[2]]);
            return llIlIIlIIIlI[1];
        }
        var5_6.sort(Comparator.comparingInt(l2 -> l2.aW().distanceTo(player.getWorldLocation())));
        l l3 = (l)var5_6.get(llIlIIlIIIlI[1]);
        Log.info((String)llIlIIlIIIIl[llIlIIlIIIlI[3]]);
        return this.bU.a(l3, player.getWorldLocation());
    }

    private static void lIIIIIIllIlIIIl() {
        llIlIIlIIIIl = new String[llIlIIlIIIlI[4]];
        I.llIlIIlIIIIl[I.llIlIIlIIIlI[1]] = "Gauntlet Map is null";
        I.llIlIIlIIIIl[I.llIlIIlIIIlI[0]] = "Activate";
        I.llIlIIlIIIIl[I.llIlIIlIIIlI[2]] = "Potentials are empty";
        I.llIlIIlIIIIl[I.llIlIIlIIIlI[3]] = "Pathing to best potential room";
    }

    private static boolean lIIIIIIllIlIlll(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIIIIllIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIIIllIlIlIl(int n2) {
        return n2 == 0;
    }

    static {
        I.lIIIIIIllIlIIlI();
        I.lIIIIIIllIlIIIl();
    }

    private static boolean lIIIIIIllIlIllI(Object object) {
        return object == null;
    }

    @Inject
    public PathingToDemibossTask(c c2) {
        d[] dArray = new d[llIlIIlIIIlI[0]];
        dArray[I.llIlIIlIIIlI[1]] = d.DEMI_BOSS_EXPLORE;
        super(c2, dArray);
        this.bU = c2;
    }

        return String.valueOf(var8);
    }

    private static boolean lIIIIIIllIllIIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIIIIllIlIlII(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIllIllIII(int n2) {
        return n2 != 0;
    }

    private static int lIIIIIIllIlIIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }
}

