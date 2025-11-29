/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 */
package gg.squire.vardorvis.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import gg.squire.vardorvis.tasks.VardorvisManager;
import gg.squire.vardorvis.tasks.VardorvisTaskBase;

@TaskDesc(name="Pathing to Boss", priority=2147483547, blocking=true)
public class PathingToBossTask
extends VardorvisTaskBase {
    private static  WorldPoint ai;
    private static final  int ah;
    private final  int am = 4661;
    private  WorldArea an;
    
    private final  SquireVardorvisConfig al;
    
    private final  SquireVardorvis aj;
    private final  e ak;

    @Inject
    public PathingToBossTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig) {
        this.am = lIlIlIIIIIllI[0];
        this.an = new WorldArea(new WorldPoint(lIlIlIIIIIllI[1], lIlIlIIIIIllI[2], lIlIlIIIIIllI[3]), new WorldPoint(lIlIlIIIIIllI[4], lIlIlIIIIIllI[5], lIlIlIIIIIllI[3]));
        this.aj = squireVardorvis;
        this.ak = squireVardorvis.j();
        this.al = squireVardorvisConfig;
    }

    private static boolean lIllllIlIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean run() {
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(this.aj.h() ? 1 : 0)) {
            return lIlIlIIIIIllI[3];
        }
        return this.l();
    }

    private static boolean lIllllIlIIIIIII(int n2) {
        return n2 != 0;
    }

    static {
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIIlllllll();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIIllllllI();
        ah = lIlIlIIIIIllI[12];
        ai = new WorldPoint(lIlIlIIIIIllI[13], lIlIlIIIIIllI[14], lIlIlIIIIIllI[3]);
    }

    /*
     * WARNING - void declaration
     */
    private void a(String string, String string2, int n2, Player player) {
        void var1;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n3;
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIll(tileObject.getId(), n2) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(tileObject.getName().equals(string) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIIIIllI[6]];
                stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[3]] = string2;
                if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n3 = lIlIlIIIIIllI[6];

                    if (((74 + 106 - 159 + 107 ^ 55 + 50 - 22 + 60) & (34 + 9 - 30 + 125 ^ 78 + 34 - 80 + 101 ^ -1)) <= 0) return n3 != 0;
                    return ((99 + 43 - 30 + 29 ^ 34 + 152 - 44 + 35) & (0xAC ^ 0xB7 ^ (0x99 ^ 0xBE) ^ -1)) != 0;
                }
            }
            n3 = lIlIlIIIIIllI[3];
            return n3 != 0;
        });
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIIl(tileObject2)) {
            return;
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(var1.isMoving() ? 1 : 0)) {
            return;
        }
        tileObject2.interact(string2);
    }

    private static void lIllllIIllllllI() {
        lIlIlIIIIIlIl = new String[lIlIlIIIIIllI[15]];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIlIl[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[3]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."No";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIlIl[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[6]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Rocks";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIlIl[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[7]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Climb-over";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIlIl[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[10]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Ring of shadows";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIlIl[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[11]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Teleport";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIlIl[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[9]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Ring of shadows";
    }

    private static boolean lIllllIlIIIIIll(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean S() {
        int n3;
        s var2;
        void var3;
        int[] nArray = this.w.getMapRegions();
        int var4 = lIlIlIIIIIllI[3];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIlI(var4, ((void)var3).length)) {
            ++var4;

            if (2 >= 1) continue;
            return false;
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(IntStream.of((int[])var3).noneMatch(n2 -> {
            boolean bl;
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIll(n2, lIlIlIIIIIllI[0])) {
                bl = lIlIlIIIIIllI[6];

            } else {
                bl = lIlIlIIIIIllI[3];
            }
            return bl;
        }) ? 1 : 0) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIll(var2.w.getVarbitValue(lIlIlIIIIIllI[12]), lIlIlIIIIIllI[6])) {
            String[] stringArray = new String[lIlIlIIIIIllI[6]];
            stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[3]] = lIlIlIIIIIlIl[lIlIlIIIIIllI[9]];
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                n3 = lIlIlIIIIIllI[6];

                if (-3 <= 0) return n3 != 0;
                return false;
            }
        }
        n3 = lIlIlIIIIIllI[3];
        return n3 != 0;
    }

        return String.valueOf(var5);
    }

    @Override
    public boolean l() {
        s var6;
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lIlIlIIIIIllI[3];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(var6.aj.i() ? 1 : 0)) {
            return lIlIlIIIIIllI[6];
        }
        Player var7 = Players.getLocal();
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIIl(var7)) {
            return lIlIlIIIIIllI[3];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(var6.an.contains((Locatable)var7) ? 1 : 0)) {
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(Dialog.isViewingOptions() ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIIIIllI[6]];
                stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[3]] = lIlIlIIIIIlIl[lIlIlIIIIIllI[3]];
                Dialog.chooseOption((String[])stringArray);

                return lIlIlIIIIIllI[6];
            }
            var6.a(lIlIlIIIIIlIl[lIlIlIIIIIllI[6]], lIlIlIIIIIlIl[lIlIlIIIIIllI[7]], lIlIlIIIIIllI[8], var7);
            return lIlIlIIIIIllI[6];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(var6.S() ? 1 : 0)) {
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(Dialog.isOpen() ? 1 : 0) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIllllIlIIIIIII(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption((int)lIlIlIIIIIllI[9]);

            }
            String[] stringArray = new String[lIlIlIIIIIllI[6]];
            stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.lIlIlIIIIIllI[3]] = lIlIlIIIIIlIl[lIlIlIIIIIllI[10]];
            Item var8 = Inventory.getFirst((String[])stringArray);
            var8.interact(lIlIlIIIIIlIl[lIlIlIIIIIllI[11]]);
            return lIlIlIIIIIllI[6];
        }
        Movement.walkTo((WorldPoint)ai);

        return lIlIlIIIIIllI[6];
    }

    private static boolean lIllllIlIIIIIIl(Object object) {
        return object == null;
    }
}

