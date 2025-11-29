/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathTaskBase;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Dodge", priority=25)
public class DodgeTask
extends VorkathTaskBase {
    
     int cc;
    
    @Inject
     d l;

    private static boolean llIIIIIIllllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIIIlllIlll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean i(WorldPoint worldPoint) {
        int n2;
        v var1;
        void var2;
        if (v.llIIIIIIlllllII(Math.abs(this.cf.getTickCount() - this.cg.G()), lIlIllIIlllll[5])) {
            return lIlIllIIlllll[0];
        }
        WorldPoint var3 = Players.getLocal().getWorldLocation();
        int var4 = Math.abs(var3.getY() - var2.getWorldY());
        WorldPoint var5 = var3.dy(lIlIllIIlllll[1]);
        int var6 = lIlIllIIlllll[6];
        if (v.llIIIIIIllllIII(Equipment.contains(item -> item.getName().toLowerCase().contains(lIlIllIIllllI[lIlIllIIlllll[0]])) ? 1 : 0)) {
            var6 = lIlIllIIlllll[7];
        }
        if (v.llIIIIIIllllIII(var1.cg.C() ? 1 : 0)) {
            var6 = lIlIllIIlllll[2];
        }
        if (v.llIIIIIIlllllIl(var4, var6) && v.llIIIIIIllllIII(TileObjects.getAll(tileObject -> {
            int n2;
            if (v.llIIIIIIllllllI(tileObject.getId(), lIlIllIIlllll[4]) && v.llIIIIIIllllIII(tileObject.getWorldLocation().equals((Object)var5) ? 1 : 0)) {
                n2 = lIlIllIIlllll[1];

                if (1 >= 2) {
                    return false;
                }
            } else {
                n2 = lIlIllIIlllll[0];
            }
            return n2 != 0;
        }).isEmpty() ? 1 : 0)) {
            n2 = lIlIllIIlllll[1];

            if (3 == 0) {
                return ((9 + 66 - -46 + 6 ^ (0x42 ^ 0x31)) & (0x6F ^ 0x16 ^ (0x7F ^ 0xA) ^ -1)) != 0;
            }
        } else {
            n2 = lIlIllIIlllll[0];
        }
        return n2 != 0;
    }

    private static boolean llIIIIIIlllllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIIIIIlllllII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected DodgeTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
        this.cc = lIlIllIIlllll[0];
    }

    static {
        v.llIIIIIIlllIllI();
        v.llIIIIIIlllIlIl();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b(NPC nPC) {
        int n2;
        block3: {
            block2: {
                if (!v.llIIIIIIllllIlI(nPC.getAnimation(), lIlIllIIlllll[3])) break block2;
                int[] nArray = new int[lIlIllIIlllll[1]];
                nArray[v.lIlIllIIlllll[0]] = lIlIllIIlllll[4];
                if (!v.llIIIIIIllllIll(TileObjects.getNearest((int[])nArray))) break block3;
            }
            n2 = lIlIllIIlllll[1];

            if (null == null) return n2 != 0;
            return (1 & ~1) != 0;
        }
        n2 = lIlIllIIlllll[0];
        return n2 != 0;
    }

    private static void llIIIIIIlllIlIl() {
        lIlIllIIllllI = new String[lIlIllIIlllll[1]];
        v.lIlIllIIllllI[v.lIlIllIIlllll[0]] = "blowpipe";
    }

    private static boolean llIIIIIIllllIlI(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var5_5;
        WorldPoint var7;
        WorldPoint worldPoint;
        WorldPoint var8;
        void var9;
        v var10;
        NPC nPC = this.cg.c(lIlIllIIlllll[1]);
        if (v.llIIIIIIlllIlll(nPC)) {
            return lIlIllIIlllll[0];
        }
        int n2 = var10.b((NPC)var9);
        if (v.llIIIIIIllllIII(Movement.isRunEnabled() ? 1 : 0) && v.llIIIIIIllllIII(n2)) {
            Movement.toggleRun();

            if (1 < -1) {
                return ((0xC8 ^ 0xA4 ^ (0xB2 ^ 0x94)) & (1 ^ 0xF ^ (0x47 ^ 3) ^ -1)) != 0;
            }
        } else if (v.llIIIIIIllllIIl(Movement.isRunEnabled() ? 1 : 0) && v.llIIIIIIllllIIl(n2)) {
            Movement.toggleRun();
        }
        WorldPoint var11 = var10.l.n();
        if (v.llIIIIIIllllIII(n2) && v.llIIIIIIllllIIl(var10.cg.C() ? 1 : 0)) {
            var11 = var10.l.o();
        }
        if (v.llIIIIIIllllIII(var11.equals((Object)(var8 = Players.getLocal().getWorldLocation())) ? 1 : 0)) {
            return lIlIllIIlllll[0];
        }
        if (v.llIIIIIIllllIIl(n2) && v.llIIIIIIllllIII(var10.cc % lIlIllIIlllll[2])) {
            var10.cc += lIlIllIIlllll[1];
            return lIlIllIIlllll[0];
        }
        if (v.llIIIIIIllllIII(n2) && v.llIIIIIIllllIII(var10.i(var9.getWorldLocation()) ? 1 : 0)) {
            return lIlIllIIlllll[0];
        }
        if (v.llIIIIIIllllIII(n2)) {
            worldPoint = var10.l.p();

            if (1 >= (0x10 ^ 0x14)) {
                return false;
            }
        } else {
            worldPoint = var7 = var10.l.n();
        }
        if (v.llIIIIIIllllIII(var10.cg.z() ? 1 : 0)) {
            Movement.toggleRun();
            var7 = var10.l.t();
        }
        Movement.setDestination((WorldPoint)var5_5);
        this.cc += lIlIllIIlllll[1];
        return lIlIllIIlllll[1];
    }

    private static boolean llIIIIIIllllIll(Object object) {
        return object != null;
    }

    private static boolean llIIIIIIllllIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIIIllllllI(int n2, int n3) {
        return n2 == n3;
    }
}

