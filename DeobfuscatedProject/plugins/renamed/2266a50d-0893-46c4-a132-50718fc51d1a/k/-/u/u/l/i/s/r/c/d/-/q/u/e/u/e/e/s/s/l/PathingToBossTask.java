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
 *  net.unethicalite.api.game.House
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a_Unknown;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.n_Unknown;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.House;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;

/* TASK: Pathing to Boss -> PathingtobossTask */
@TaskDesc(name="Pathing to Boss", priority=2147483547, blocking=true)
public class PathingToBossTask
extends n_Unknown {
    private /* synthetic */ WorldArea av;
    private final /* synthetic */ a ar;
    private /* synthetic */ WorldArea at;
    private /* synthetic */ WorldArea aw;
    private /* synthetic */ WorldArea au;
    private /* synthetic */ WorldArea ay;
    private final /* synthetic */ SquireDukeSucellus aq;
    private /* synthetic */ WorldPoint aA;
    private /* synthetic */ WorldArea ax;
    private final /* synthetic */ SquireDukeSucellusConfig as;
    private /* synthetic */ WorldPoint az;
    private static /* synthetic */ int[] lIllIIllIIlI;
    private /* synthetic */ WorldPoint aB;
    private static final /* synthetic */ int ap;
    private static /* synthetic */ String[] lIllIIllIIIl;

    private static String lllIIlIlllIIIl(String var4, String var20) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), lIllIIllIIlI[39]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIllIIllIIlI[31], var11);
            return new String(var18.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIlIllllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllIIlIlllIIII(String var17, String var12) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var6 = var12.toCharArray();
        int var23 = lIllIIllIIlI[2];
        char[] var3 = var17.toCharArray();
        int var24 = var3.length;
        int var16 = lIllIIllIIlI[2];
        while (p.lllIIlIllllIIl(var16, var24)) {
            char var8 = var3[var16];
            var5.append((char)(var8 ^ var6[var23 % var6.length]));
            0;
            ++var23;
            ++var16;
            0;
            if (2 >= 0) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    private static void lllIIlIlllIIlI() {
        lIllIIllIIIl = new String[lIllIIllIIlI[45]];
        p.lIllIIllIIIl[p.lIllIIllIIlI[2]] = p."Stairs";
        p.lIllIIllIIIl[p.lIllIIllIIlI[29]] = p."Descend";
        p.lIllIIllIIIl[p.lIllIIllIIlI[31]] = p."Broken fence";
        p.lIllIIllIIIl[p.lIllIIllIIlI[32]] = p."Squeeze-through";
        p.lIllIIllIIIl[p.lIllIIllIIlI[35]] = p."Open";
        p.lIllIIllIIIl[p.lIllIIllIIlI[36]] = p."Consume the awakener's orb";
        p.lIllIIllIIIl[p.lIllIIllIIlI[37]] = p."No.";
        p.lIllIIllIIIl[p.lIllIIllIIlI[38]] = p."Gate";
        p.lIllIIllIIIl[p.lIllIIllIIlI[39]] = p."Open";
        p.lIllIIllIIIl[p.lIllIIllIIlI[41]] = p."Ring of shadows";
        p.lIllIIllIIIl[p.lIllIIllIIlI[43]] = p."Ring of shadows";
        p.lIllIIllIIIl[p.lIllIIllIIlI[44]] = p."Teleport";
    }

    @Override
    public boolean R() {
        p var10;
        if (p.lllIIlIlllIlII(Static.getClient().isInInstancedRegion() ? 1 : 0) && p.lllIIlIlllIlIl(House.isInside() ? 1 : 0)) {
            return lIllIIllIIlI[2];
        }
        if (p.lllIIlIlllIlII(var10.aq.m() ? 1 : 0)) {
            var10.aq.forceStop();
            return lIllIIllIIlI[29];
        }
        var10.ar.t();
        Player var1 = Players.getLocal();
        if (p.lllIIlIlllIllI(var1)) {
            return lIllIIllIIlI[2];
        }
        if (p.lllIIlIlllIlII(var10.av.contains((Locatable)var1) ? 1 : 0)) {
            var10.a(lIllIIllIIIl[lIllIIllIIlI[2]], lIllIIllIIIl[lIllIIllIIlI[29]], lIllIIllIIlI[30], var1);
            return lIllIIllIIlI[29];
        }
        if (p.lllIIlIlllIlII(var10.au.contains((Locatable)var1) ? 1 : 0)) {
            var10.a(lIllIIllIIIl[lIllIIllIIlI[31]], lIllIIllIIIl[lIllIIllIIlI[32]], lIllIIllIIlI[33], var1);
            return lIllIIllIIlI[29];
        }
        int[] nArray = new int[lIllIIllIIlI[29]];
        nArray[p.lIllIIllIIlI[2]] = lIllIIllIIlI[34];
        TileObject var13 = TileObjects.getFirstAt((WorldPoint)var10.aA, (int[])nArray);
        if (p.lllIIlIlllIlll(var13)) {
            var13.interact(lIllIIllIIIl[lIllIIllIIlI[35]]);
            return lIllIIllIIlI[29];
        }
        if (p.lllIIlIlllIlII(var10.ay.contains((Locatable)var1) ? 1 : 0)) {
            if (p.lllIIlIlllIlII(Dialog.getName().contains(lIllIIllIIIl[lIllIIllIIlI[36]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIIllIIlI[29]];
                stringArray[p.lIllIIllIIlI[2]] = lIllIIllIIIl[lIllIIllIIlI[37]];
                Dialog.chooseOption((String[])stringArray);
                0;
                return lIllIIllIIlI[29];
            }
            var10.a(lIllIIllIIIl[lIllIIllIIlI[38]], lIllIIllIIIl[lIllIIllIIlI[39]], lIllIIllIIlI[40], var1);
            return lIllIIllIIlI[29];
        }
        if (p.lllIIlIlllIlIl(var10.ax.contains((Locatable)var1) ? 1 : 0) && p.lllIIlIlllIlIl(var10.ay.contains((Locatable)var1) ? 1 : 0)) {
            String[] stringArray = new String[lIllIIllIIlI[29]];
            stringArray[p.lIllIIllIIlI[2]] = lIllIIllIIIl[lIllIIllIIlI[41]];
            if (p.lllIIlIlllIlII(Inventory.contains((String[])stringArray) ? 1 : 0) && p.lllIIlIllllIII(Vars.getBit((int)lIllIIllIIlI[42]), lIllIIllIIlI[29])) {
                if (p.lllIIlIlllIlII(Dialog.isOpen() ? 1 : 0) && p.lllIIlIlllIlII(Dialog.isViewingOptions() ? 1 : 0)) {
                    Dialog.chooseOption((int)lIllIIllIIlI[31]);
                    0;
                }
                String[] stringArray2 = new String[lIllIIllIIlI[29]];
                stringArray2[p.lIllIIllIIlI[2]] = lIllIIllIIIl[lIllIIllIIlI[43]];
                Item var15 = Inventory.getFirst((String[])stringArray2);
                var15.interact(lIllIIllIIIl[lIllIIllIIlI[44]]);
                return lIllIIllIIlI[29];
            }
        }
        Movement.walkTo((WorldPoint)this.aB);
        0;
        return lIllIIllIIlI[29];
    }

    @Override
    public boolean run() {
        if (p.lllIIlIlllIlII(this.aq.p() ? 1 : 0)) {
            return lIllIIllIIlI[2];
        }
        return this.R();
    }

    static {
        p.lllIIlIlllIIll();
        p.lllIIlIlllIIlI();
        ap = lIllIIllIIlI[42];
    }

    private static String lllIIlIllIllll(String var7, String var19) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var22 = Cipher.getInstance("Blowfish");
            var22.init(lIllIIllIIlI[31], var2);
            return new String(var22.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIlIlllIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIlIlllIllI(Object object) {
        return object == null;
    }

    private static boolean lllIIlIllllIII(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public p(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.at = new WorldArea(new WorldPoint(lIllIIllIIlI[0], lIllIIllIIlI[1], lIllIIllIIlI[2]), new WorldPoint(lIllIIllIIlI[3], lIllIIllIIlI[4], lIllIIllIIlI[2]));
        this.au = new WorldArea(new WorldPoint(lIllIIllIIlI[5], lIllIIllIIlI[6], lIllIIllIIlI[2]), new WorldPoint(lIllIIllIIlI[7], lIllIIllIIlI[8], lIllIIllIIlI[2]));
        this.av = new WorldArea(new WorldPoint(lIllIIllIIlI[7], lIllIIllIIlI[9], lIllIIllIIlI[2]), new WorldPoint(lIllIIllIIlI[10], lIllIIllIIlI[11], lIllIIllIIlI[2]));
        this.aw = new WorldArea(new WorldPoint(lIllIIllIIlI[12], lIllIIllIIlI[13], lIllIIllIIlI[2]), new WorldPoint(lIllIIllIIlI[14], lIllIIllIIlI[15], lIllIIllIIlI[2]));
        this.ax = new WorldArea(new WorldPoint(lIllIIllIIlI[16], lIllIIllIIlI[17], lIllIIllIIlI[2]), new WorldPoint(lIllIIllIIlI[18], lIllIIllIIlI[19], lIllIIllIIlI[2]));
        this.ay = new WorldArea(new WorldPoint(lIllIIllIIlI[20], lIllIIllIIlI[21], lIllIIllIIlI[2]), new WorldPoint(lIllIIllIIlI[22], lIllIIllIIlI[23], lIllIIllIIlI[2]));
        this.az = new WorldPoint(lIllIIllIIlI[24], lIllIIllIIlI[25], lIllIIllIIlI[2]);
        this.aA = new WorldPoint(lIllIIllIIlI[24], lIllIIllIIlI[26], lIllIIllIIlI[2]);
        this.aB = new WorldPoint(lIllIIllIIlI[27], lIllIIllIIlI[28], lIllIIllIIlI[2]);
        this.aq = squireDukeSucellus;
        this.ar = squireDukeSucellus.s();
        this.as = squireDukeSucellusConfig;
    }

    private static boolean lllIIlIlllIlll(Object object) {
        return object != null;
    }

    private static void lllIIlIlllIIll() {
        lIllIIllIIlI = new int[46];
        p.lIllIIllIIlI[0] = 0xFFFFDF9D & 0x2B77;
        p.lIllIIllIIlI[1] = 0xFFFF8FFF & 0x7F57;
        p.lIllIIllIIlI[2] = (0xB5 ^ 0xBB ^ (0x82 ^ 0xAA)) & (0x7B ^ 0x5F ^ 2 ^ -1);
        p.lIllIIllIIlI[3] = -(0xFFFFEEDF & 0x757D) & (0xFFFFEFFF & 0x7F7F);
        p.lIllIIllIIlI[4] = -(8 + 112 - 23 + 33) & (0xFFFF9FF9 & 0x6FEF);
        p.lIllIIllIIlI[5] = -(0xFFFFFCFE & 0x375D) & (0xFFFFBF7F & Short.MAX_VALUE);
        p.lIllIIllIIlI[6] = 0xFFFF8FDB & 0x7F7F;
        p.lIllIIllIIlI[7] = 0xFFFF8B7F & 0x7FB2;
        p.lIllIIllIIlI[8] = 0xFFFFEFFF & 0x1F65;
        p.lIllIIllIIlI[9] = -(0xFFFFF79F & 0x7865) & (0xFFFFFF7E & 0x7FDF);
        p.lIllIIllIIlI[10] = 0xFFFFCB7F & 0x3FBF;
        p.lIllIIllIIlI[11] = -(0xFFFFD2EB & 0x3D15) & (0xFFFFFF7F & 0x1FE7);
        p.lIllIIllIIlI[12] = 0xFFFFFB5F & 0xFA9;
        p.lIllIIllIIlI[13] = -(0xFFFFB7F3 & 0x5FAF) & (0xFFFFFFF7 & 0x3FFE);
        p.lIllIIllIIlI[14] = 0xFFFFCF73 & 0x3BBF;
        p.lIllIIllIIlI[15] = 0xFFFFFA77 & 0x2DFE;
        p.lIllIIllIIlI[16] = 0xFFFFAB7A & 0x5FD5;
        p.lIllIIllIIlI[17] = 0xFFFFAC7A & 0x7BDF;
        p.lIllIIllIIlI[18] = -(0xFFFFB4EA & 0x5F97) & (0xFFFFBFFD & 0x5FFB);
        p.lIllIIllIIlI[19] = 0xFFFFFBF7 & 0x2C7D;
        p.lIllIIllIIlI[20] = -(0xFFFFBFE5 & 0x743F) & (0xFFFFBFFD & 0x7FF6);
        p.lIllIIllIIlI[21] = -(0xFFFFFE45 & 0x7FB) & (0xFFFFDF6F & 0x3FDE);
        p.lIllIIllIIlI[22] = 0xFFFF9BEF & 0x6FFE;
        p.lIllIIllIIlI[23] = -(0xFFFFFBFD & 0x24D7) & (0xFFFFFBF7 & 0x3DFD);
        p.lIllIIllIIlI[24] = 0xFFFFFFEF & 0xB7F;
        p.lIllIIllIIlI[25] = -3 & (0xFFFFF97B & 0x2EF7);
        p.lIllIIllIIlI[26] = 0xFFFFB9FD & 0x6E67;
        p.lIllIIllIIlI[27] = 0xFFFFCBFF & 0x3FDF;
        p.lIllIIllIIlI[28] = -(0xFFFFB07F & 0x6F87) & (0xFFFFFFBF & 0x3957);
        p.lIllIIllIIlI[29] = 1;
        p.lIllIIllIIlI[30] = 0xFFFF95F3 & 0xEBDE;
        p.lIllIIllIIlI[31] = 2;
        p.lIllIIllIIlI[32] = 3;
        p.lIllIIllIIlI[33] = -(0xFFFFCF63 & 0x399D) & (0xFFFFBFDF & 0xFFFF);
        p.lIllIIllIIlI[34] = 0xFFFFFF56 & 0xB6EB;
        p.lIllIIllIIlI[35] = 0x21 ^ 0x25;
        p.lIllIIllIIlI[36] = 0x27 ^ 0x64 ^ (0x87 ^ 0xC1);
        p.lIllIIllIIlI[37] = 0x83 ^ 0x85;
        p.lIllIIllIIlI[38] = 0x45 ^ 8 ^ (0xC4 ^ 0x8E);
        p.lIllIIllIIlI[39] = 0x2E ^ 0x26;
        p.lIllIIllIIlI[40] = 0xFFFFFFFB & 0xBFF6;
        p.lIllIIllIIlI[41] = 0x77 ^ 0x59 ^ (0x26 ^ 1);
        p.lIllIIllIIlI[42] = -(0xFFFFCCFD & 0x37C3) & (0xFFFFBFEE & 0x7FF7);
        p.lIllIIllIIlI[43] = 0x60 ^ 0x44 ^ (0x30 ^ 0x1E);
        p.lIllIIllIIlI[44] = 0x80 ^ 0x93 ^ (0xDA ^ 0xC2);
        p.lIllIIllIIlI[45] = 0xB8 ^ 0xB4;
    }

    private static boolean lllIIlIlllIlIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private void a(String string, String string2, int n2, Player player) {
        void var21;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n3;
            if (p.lllIIlIllllIII(tileObject.getId(), n2) && p.lllIIlIlllIlII(tileObject.getName().equals(string) ? 1 : 0)) {
                String[] stringArray = new String[lIllIIllIIlI[29]];
                stringArray[p.lIllIIllIIlI[2]] = string2;
                if (p.lllIIlIlllIlII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n3 = lIllIIllIIlI[29];
                    0;
                    if (null == null) return n3 != 0;
                    return ((0x5A ^ 0x54) & ~(0x9B ^ 0x95) & ~((0x74 ^ 0x54) & ~(0x41 ^ 0x61))) != 0;
                }
            }
            n3 = lIllIIllIIlI[2];
            return n3 != 0;
        });
        if (p.lllIIlIlllIllI(tileObject2)) {
            return;
        }
        if (p.lllIIlIlllIlII(var21.isMoving() ? 1 : 0)) {
            return;
        }
        tileObject2.interact(string2);
    }
}

