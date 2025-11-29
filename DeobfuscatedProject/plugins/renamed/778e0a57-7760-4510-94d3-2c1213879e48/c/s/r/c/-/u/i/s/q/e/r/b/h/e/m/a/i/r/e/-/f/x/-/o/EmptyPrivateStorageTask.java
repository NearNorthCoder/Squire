/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.D_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.az_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u_Unknown;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

/* TASK: Empty Private Storage -> EmptyprivatestorageTask */
@TaskDesc(name="Empty Private Storage", priority=2147483546, blocking=true)
public class EmptyPrivateStorageTask
extends az_Unknown {
    private static /* synthetic */ String[] lIlIlIIIlIIl;
    private static /* synthetic */ int[] lIlIlIIIlIlI;
    private final /* synthetic */ int ds = 0xF0000A;

    private static void llIlllIIIIIlll() {
        lIlIlIIIlIlI = new int[19];
        au.lIlIlIIIlIlI[0] = -(0xFFFFEFDF & 0x3BF2) & (0xFFFFBFDB & 0xF06BFF);
        au.lIlIlIIIlIlI[1] = (0xC8 ^ 0x95) & ~(0x1D ^ 0x40);
        au.lIlIlIIIlIlI[2] = -(0xFFFFAF37 & 0x5EF9) & (0xFFFFAFBF & 0x5F7F);
        au.lIlIlIIIlIlI[3] = 1;
        au.lIlIlIIIlIlI[4] = -(0xFFFFBC6D & 0x6F93) & (0xFFFFFE7F & 0x7FA3);
        au.lIlIlIIIlIlI[5] = 2;
        au.lIlIlIIIlIlI[6] = 3;
        au.lIlIlIIIlIlI[7] = 1 ^ (0x47 ^ 0x42);
        au.lIlIlIIIlIlI[8] = 172 + 185 - 269 + 152;
        au.lIlIlIIIlIlI[9] = 0x98 ^ 0x82;
        au.lIlIlIIIlIlI[10] = 176 + 55 - 70 + 37 ^ 36 + 88 - -33 + 38;
        au.lIlIlIIIlIlI[11] = 0x2C ^ 0x2A;
        au.lIlIlIIIlIlI[12] = 0xAC ^ 0x95;
        au.lIlIlIIIlIlI[13] = -1;
        au.lIlIlIIIlIlI[14] = 0x61 ^ 0x66;
        au.lIlIlIIIlIlI[15] = 0x68 ^ 0x60;
        au.lIlIlIIIlIlI[16] = 0xA1 ^ 0xA8;
        au.lIlIlIIIlIlI[17] = 0x70 ^ 0x7A;
        au.lIlIlIIIlIlI[18] = 0x53 ^ 0x58;
    }

    static {
        au.llIlllIIIIIlll();
        au.llIlllIIIIIllI();
    }

    private static String llIlllIIIIIlIl(String var15, String var19) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), lIlIlIIIlIlI[15]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIlIlIIIlIlI[5], var4);
            return new String(var10.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var2_2;
        if (au.llIlllIIIlIIll(c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u_Unknown.bn() ? 1 : 0)) {
            return lIlIlIIIlIlI[1];
        }
        if (au.llIlllIIIlIlII(D.bC().bH() ? 1 : 0)) {
            return lIlIlIIIlIlI[1];
        }
        Widget var11 = Widgets.get((int)lIlIlIIIlIlI[2], widget -> {
            String[] stringArray = new String[lIlIlIIIlIlI[3]];
            stringArray[au.lIlIlIIIlIlI[1]] = lIlIlIIIlIIl[lIlIlIIIlIlI[17]];
            return widget.hasAction(stringArray);
        });
        if (au.llIlllIIIlIlIl(var11) && au.llIlllIIIlIlII(var11.isVisible() ? 1 : 0)) {
            var11.interact(lIlIlIIIlIIl[lIlIlIIIlIlI[1]]);
            return lIlIlIIIlIlI[3];
        }
        TileObject var17 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (au.llIlllIIIlIlII(tileObject.getName().contains(lIlIlIIIlIIl[lIlIlIIIlIlI[15]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIIlIlI[3]];
                stringArray[au.lIlIlIIIlIlI[1]] = lIlIlIIIlIIl[lIlIlIIIlIlI[16]];
                if (au.llIlllIIIlIlII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIIIlIlI[3];
                    0;
                    if ((0x34 ^ 0x49 ^ (0x5A ^ 0x23)) >= 2) return n2 != 0;
                    return ((0x52 ^ 0x4A ^ (9 ^ 0x20)) & (47 + 60 - 5 + 79 ^ 83 + 49 - 43 + 43 ^ -1)) != 0;
                }
            }
            n2 = lIlIlIIIlIlI[1];
            return n2 != 0;
        });
        if (au.llIlllIIIlIllI(var17)) {
            au var21;
            Movement.walkTo((WorldPoint)var21.cy);
            0;
            return lIlIlIIIlIlI[1];
        }
        var2_2.interact(lIlIlIIIlIIl[lIlIlIIIlIlI[3]]);
        return lIlIlIIIlIlI[3];
    }

    private static void llIlllIIIIIllI() {
        lIlIlIIIlIIl = new String[lIlIlIIIlIlI[18]];
        au.lIlIlIIIlIIl[au.lIlIlIIIlIlI[1]] = au."Bank all";
        au.lIlIlIIIlIIl[au.lIlIlIIIlIlI[3]] = au."Enter";
        au.lIlIlIIIlIIl[au.lIlIlIIIlIlI[5]] = au."Accept";
        au.lIlIlIIIlIIl[au.lIlIlIIIlIlI[6]] = au."Choose again";
        au.lIlIlIIIlIIl[au.lIlIlIIIlIlI[7]] = au."Accept";
        au.lIlIlIIIlIIl[au.lIlIlIIIlIlI[10]] = au."Herblore";
        au.lIlIlIIIlIIl[au.lIlIlIIIlIlI[11]] = au."Confirm";
        au.lIlIlIIIlIIl[au.lIlIlIIIlIlI[14]] = au."Commune";
        au.lIlIlIIIlIIl[au.lIlIlIIIlIlI[15]] = au."Chambers of Xeric";
        au.lIlIlIIIlIIl[au.lIlIlIIIlIlI[16]] = au."Enter";
        au.lIlIlIIIlIIl[au.lIlIlIIIlIlI[17]] = au."Bank all";
    }

    private static String llIlllIIIIIIll(String var22, String var5) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var16 = var5.toCharArray();
        int var7 = lIlIlIIIlIlI[1];
        char[] var2 = var22.toCharArray();
        int var20 = var2.length;
        int var24 = lIlIlIIIlIlI[1];
        while (au.llIlllIIIlIlll(var24, var20)) {
            char var18 = var2[var24];
            var12.append((char)(var18 ^ var16[var7 % var16.length]));
            0;
            ++var7;
            ++var24;
            0;
            
            return null;
        }
        return String.valueOf(var12);
    }

    private static String llIlllIIIIIlII(String var3, String var9) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(lIlIlIIIlIlI[5], var8);
            return new String(var13.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    public au() {
        this.ds = lIlIlIIIlIlI[0];
    }

    private static boolean llIlllIIIlIlII(int n2) {
        return n2 != 0;
    }

    private static boolean llIlllIIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlllIIIlIlIl(Object object) {
        return object != null;
    }

    private static boolean llIlllIIIlIIll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cs() {
        void var3_4;
        int[] nArray = new int[lIlIlIIIlIlI[3]];
        nArray[au.lIlIlIIIlIlI[1]] = lIlIlIIIlIlI[4];
        if (au.llIlllIIIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIlIIIlIlI[1];
        }
        if (au.llIlllIIIlIlII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIlIlIIIlIlI[3];
        }
        if (au.llIlllIIIlIlII(Dialog.isViewingOptions() ? 1 : 0) && au.llIlllIIIlIlII(Dialog.hasOption((String)lIlIlIIIlIIl[lIlIlIIIlIlI[5]]) ? 1 : 0) && au.llIlllIIIlIlII(Dialog.hasOption((String)lIlIlIIIlIIl[lIlIlIIIlIlI[6]]) ? 1 : 0)) {
            String[] stringArray = new String[lIlIlIIIlIlI[3]];
            stringArray[au.lIlIlIIIlIlI[1]] = lIlIlIIIlIIl[lIlIlIIIlIlI[7]];
            Dialog.chooseOption((String[])stringArray);
            0;
            return lIlIlIIIlIlI[3];
        }
        Widget var1 = Widgets.get((int)lIlIlIIIlIlI[8], (int)lIlIlIIIlIlI[9], (int)lIlIlIIIlIlI[1]);
        if (au.llIlllIIIlIlIl(var1) && au.llIlllIIIlIlII(var1.isVisible() ? 1 : 0) && au.llIlllIIIlIlII(var1.getText().contains(lIlIlIIIlIIl[lIlIlIIIlIlI[10]]) ? 1 : 0)) {
            Widget var23 = Widgets.get((int)lIlIlIIIlIlI[8], (int)lIlIlIIIlIlI[9]);
            if (au.llIlllIIIlIllI(var23)) {
                return lIlIlIIIlIlI[1];
            }
            var23.interact(lIlIlIIIlIIl[lIlIlIIIlIlI[11]]);
            return lIlIlIIIlIlI[3];
        }
        Widget var23 = Static.getClient().getWidget(lIlIlIIIlIlI[0]);
        if (au.llIlllIIIlIlIl(var23)) {
            var23.interact(lIlIlIIIlIlI[3], lIlIlIIIlIlI[12], lIlIlIIIlIlI[13], lIlIlIIIlIlI[0]);
            return lIlIlIIIlIlI[3];
        }
        int[] nArray2 = new int[lIlIlIIIlIlI[3]];
        nArray2[au.lIlIlIIIlIlI[1]] = lIlIlIIIlIlI[4];
        Item var25 = Inventory.getFirst((int[])nArray2);
        if (au.llIlllIIIlIllI(var25)) {
            return lIlIlIIIlIlI[1];
        }
        var3_4.interact(lIlIlIIIlIIl[lIlIlIIIlIlI[14]]);
        return lIlIlIIIlIlI[3];
    }

    private static boolean llIlllIIIlIllI(Object object) {
        return object == null;
    }
}

