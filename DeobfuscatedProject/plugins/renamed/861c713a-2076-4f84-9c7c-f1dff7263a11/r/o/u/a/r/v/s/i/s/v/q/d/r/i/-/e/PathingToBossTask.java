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
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

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
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.e_Unknown;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.q_Unknown;

/* TASK: Pathing to Boss -> PathingtobossTask */
@TaskDesc(name="Pathing to Boss", priority=2147483547, blocking=true)
public class PathingToBossTask
extends q_Unknown {
    private static /* synthetic */ WorldPoint ai;
    private static final /* synthetic */ int ah;
    private final /* synthetic */ int am = 4661;
    private /* synthetic */ WorldArea an;
    private static /* synthetic */ int[] lIlIlIIIIIllI;
    private final /* synthetic */ SquireVardorvisConfig al;
    private static /* synthetic */ String[] lIlIlIIIIIlIl;
    private final /* synthetic */ SquireVardorvis aj;
    private final /* synthetic */ e ak;

    @Inject
    public s(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig) {
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
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIllllIlIIIIIII(this.aj.h() ? 1 : 0)) {
            return lIlIlIIIIIllI[3];
        }
        return this.l();
    }

    private static boolean lIllllIlIIIIIII(int n2) {
        return n2 != 0;
    }

    static {
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIllllIIlllllll();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIllllIIllllllI();
        ah = lIlIlIIIIIllI[12];
        ai = new WorldPoint(lIlIlIIIIIllI[13], lIlIlIIIIIllI[14], lIlIlIIIIIllI[3]);
    }

    /*
     * WARNING - void declaration
     */
    private void a(String string, String string2, int n2, Player player) {
        void var16;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n3;
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIllllIlIIIIIll(tileObject.getId(), n2) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIllllIlIIIIIII(tileObject.getName().equals(string) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIIIIllI[6]];
                stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[3]] = string2;
                if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIllllIlIIIIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n3 = lIlIlIIIIIllI[6];
                    0;
                    if (((74 + 106 - 159 + 107 ^ 55 + 50 - 22 + 60) & (34 + 9 - 30 + 125 ^ 78 + 34 - 80 + 101 ^ -1)) <= 0) return n3 != 0;
                    return ((99 + 43 - 30 + 29 ^ 34 + 152 - 44 + 35) & (0xAC ^ 0xB7 ^ (0x99 ^ 0xBE) ^ -1)) != 0;
                }
            }
            n3 = lIlIlIIIIIllI[3];
            return n3 != 0;
        });
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIllllIlIIIIIIl(tileObject2)) {
            return;
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIllllIlIIIIIII(var16.isMoving() ? 1 : 0)) {
            return;
        }
        tileObject2.interact(string2);
    }

    private static void lIllllIIllllllI() {
        lIlIlIIIIIlIl = new String[lIlIlIIIIIllI[15]];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIlIl[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[3]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask."No";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIlIl[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[6]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask."Rocks";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIlIl[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[7]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask."Climb-over";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIlIl[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[10]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask."Ring of shadows";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIlIl[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[11]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask."Teleport";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIlIl[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[9]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask."Ring of shadows";
    }

    private static String lIllllIIlllllIl(String var18, String var20) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), lIlIlIIIIIllI[16]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lIlIlIIIIIllI[7], var12);
            return new String(var1.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
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
        s var5;
        void var2;
        int[] nArray = this.w.getMapRegions();
        int var14 = lIlIlIIIIIllI[3];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIllllIlIIIIIlI(var14, ((void)var2).length)) {
            ++var14;
            0;
            if (2 >= 1) continue;
            return false;
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIllllIlIIIIIII(IntStream.of((int[])var2).noneMatch(n2 -> {
            boolean bl;
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIllllIlIIIIIll(n2, lIlIlIIIIIllI[0])) {
                bl = lIlIlIIIIIllI[6];
                0;
                if (-2 > 0) {
                    return false;
                }
            } else {
                bl = lIlIlIIIIIllI[3];
            }
            return bl;
        }) ? 1 : 0) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIllllIlIIIIIll(var5.w.getVarbitValue(lIlIlIIIIIllI[12]), lIlIlIIIIIllI[6])) {
            String[] stringArray = new String[lIlIlIIIIIllI[6]];
            stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[3]] = lIlIlIIIIIlIl[lIlIlIIIIIllI[9]];
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIllllIlIIIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                n3 = lIlIlIIIIIllI[6];
                0;
                if (-3 <= 0) return n3 != 0;
                return false;
            }
        }
        n3 = lIlIlIIIIIllI[3];
        return n3 != 0;
    }

    private static String lIllllIIlllllII(String var19, String var13) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var11 = lIlIlIIIIIllI[3];
        char[] var4 = var19.toCharArray();
        int var3 = var4.length;
        int var21 = lIlIlIIIIIllI[3];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIllllIlIIIIIlI(var21, var3)) {
            char var6 = var4[var21];
            var8.append((char)(var6 ^ var15[var11 % var15.length]));
            0;
            ++var11;
            ++var21;
            0;
            if (((0x83 ^ 0xBC ^ (0x6A ^ 0xF)) & (175 + 184 - 141 + 19 ^ 149 + 82 - 136 + 88 ^ -1)) != 1) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static void lIllllIIlllllll() {
        lIlIlIIIIIllI = new int[17];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[0] = 0xFFFF9AFD & 0x7737;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[1] = 0xFFFFD6DF & 0x2D79;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[2] = -(0xFFFFEAB5 & 0x77DB) & (0xFFFFEFFF & 0x7FF3);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[3] = (33 + 135 - 110 + 107 ^ 69 + 112 - 151 + 139) & (0xE ^ 0x4A ^ (0x2E ^ 0x66) ^ -1);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[4] = 0xFFFF8F6C & 0x74F3;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[5] = -(0xFFFFF75D & 0x5AB7) & (0xFFFFDF7F & Short.MAX_VALUE);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[6] = 1;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[7] = 2;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[8] = 0xFFFFDD57 & 0xE3FF;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[9] = 0xA ^ 0x7B ^ (0xFB ^ 0x8F);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[10] = 3;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[11] = 0x75 ^ 0x45 ^ (0x64 ^ 0x50);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[12] = 0xFFFFBF2F & 0x7BF4;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[13] = 0xFFFF9D5F & 0x66FD;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[14] = -(0xFFFFFAE4 & 0x779F) & (0xFFFFFFFF & 0x7FE7);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[15] = 146 + 45 - 46 + 39 ^ 179 + 137 - 301 + 175;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[16] = 19 + 70 - -4 + 48 ^ 125 + 5 - 40 + 43;
    }

    @Override
    public boolean l() {
        s var17;
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIllllIlIIIIIII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lIlIlIIIIIllI[3];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIllllIlIIIIIII(var17.aj.i() ? 1 : 0)) {
            return lIlIlIIIIIllI[6];
        }
        Player var9 = Players.getLocal();
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIllllIlIIIIIIl(var9)) {
            return lIlIlIIIIIllI[3];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIllllIlIIIIIII(var17.an.contains((Locatable)var9) ? 1 : 0)) {
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIllllIlIIIIIII(Dialog.isViewingOptions() ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIIIIllI[6]];
                stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[3]] = lIlIlIIIIIlIl[lIlIlIIIIIllI[3]];
                Dialog.chooseOption((String[])stringArray);
                0;
                return lIlIlIIIIIllI[6];
            }
            var17.a(lIlIlIIIIIlIl[lIlIlIIIIIllI[6]], lIlIlIIIIIlIl[lIlIlIIIIIllI[7]], lIlIlIIIIIllI[8], var9);
            return lIlIlIIIIIllI[6];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIllllIlIIIIIII(var17.S() ? 1 : 0)) {
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIllllIlIIIIIII(Dialog.isOpen() ? 1 : 0) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIllllIlIIIIIII(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption((int)lIlIlIIIIIllI[9]);
                0;
            }
            String[] stringArray = new String[lIlIlIIIIIllI[6]];
            stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.PathingToBossTask.lIlIlIIIIIllI[3]] = lIlIlIIIIIlIl[lIlIlIIIIIllI[10]];
            Item var10 = Inventory.getFirst((String[])stringArray);
            var10.interact(lIlIlIIIIIlIl[lIlIlIIIIIllI[11]]);
            return lIlIlIIIIIllI[6];
        }
        Movement.walkTo((WorldPoint)ai);
        0;
        return lIlIlIIIIIllI[6];
    }

    private static boolean lIllllIlIIIIIIl(Object object) {
        return object == null;
    }
}

