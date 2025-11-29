/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.widgets.Widgets
 */
package m.u.a.-.e.s.q.t.i.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.util.Log;
import gg.squire.mta.SquireMTA;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.u.a.-.e.s.q.t.i.r.b;
import m.u.a.-.e.s.q.t.i.r.CEnum;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.widgets.Widgets;

public abstract class w_Unknown<T extends b>
extends Task {
    protected final /* synthetic */ SquireMTA aC;
    private static /* synthetic */ int[] lllIlIlIIllI;
    private static /* synthetic */ String[] lllIlIlIIlIl;
    protected final /* synthetic */ T aB;

    static {
        w.lIIIllIIIIIIIlI();
        w.lIIIllIIIIIIIIl();
    }

    private static String lIIIlIlllllllll(String var5, String var9) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), lllIlIlIIllI[6]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lllIlIlIIllI[2], var1);
            return new String(var6.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIIIIIIlII(Object object) {
        return object == null;
    }

    private static boolean lIIIllIIIIIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIIIllIIIIIIIII(String var18, String var3) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var28 = var3.toCharArray();
        int var19 = lllIlIlIIllI[0];
        char[] var12 = var18.toCharArray();
        int var27 = var12.length;
        int var17 = lllIlIlIIllI[0];
        while (w.lIIIllIIIIIlIIl(var17, var27)) {
            char var10 = var12[var17];
            var13.append((char)(var10 ^ var28[var19 % var28.length]));
            0;
            ++var19;
            ++var17;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    protected void P() {
    }

    private static void lIIIllIIIIIIIlI() {
        lllIlIlIIllI = new int[7];
        w.lllIlIlIIllI[0] = (42 + 171 - 180 + 184 ^ 122 + 118 - 126 + 30) & (45 + 181 - 14 + 7 ^ 70 + 58 - 35 + 53 ^ -1);
        w.lllIlIlIIllI[1] = 1;
        w.lllIlIlIIllI[2] = 2;
        w.lllIlIlIIllI[3] = 3;
        w.lllIlIlIIllI[4] = 41 + 100 - 2 + 37 ^ 31 + 81 - 48 + 116;
        w.lllIlIlIIllI[5] = 0xF0 ^ 0x87 ^ (0x3B ^ 0x49);
        w.lllIlIlIIllI[6] = 0x1C ^ 0x14;
    }

    public boolean run() {
        w var16;
        if (w.lIIIllIIIIIIIll(((b)this.aB).c() ? 1 : 0)) {
            return this.O();
        }
        c var2 = ((b)var16.aB).d();
        Widget var4 = Widgets.get((int)var2.f(), (int)var2.h());
        if (w.lIIIllIIIIIIlII(var4)) {
            return lllIlIlIIllI[0];
        }
        int var25 = Integer.parseInt(var4.getText().replaceAll(lllIlIlIIlIl[lllIlIlIIllI[0]], lllIlIlIIlIl[lllIlIlIIllI[1]]));
        int var22 = var16.aC.d(var2);
        var16.aC.a(var2, var25);
        if (w.lIIIllIIIIIIlIl(var25, var22)) {
            Log.info((String)lllIlIlIIlIl[lllIlIlIIllI[2]]);
            var16.Q();
            return lllIlIlIIllI[1];
        }
        Item var8 = Inventory.getFirst(var16::a);
        Spell var23 = var16.L();
        if (w.lIIIllIIIIIIIll(var23.canCast() ? 1 : 0)) {
            if (w.lIIIllIIIIIIllI(var8)) {
                var8.interact(lllIlIlIIlIl[lllIlIlIIllI[3]]);
                return lllIlIlIIllI[1];
            }
            var16.Q();
            return lllIlIlIIllI[1];
        }
        return this.M();
    }

    private static boolean lIIIllIIIIIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIIllIIIIIIIIl() {
        lllIlIlIIlIl = new String[lllIlIlIIllI[5]];
        w.lllIlIlIIlIl[w.lllIlIlIIllI[0]] = w.",";
        w.lllIlIlIIlIl[w.lllIlIlIIllI[1]] = w."";
        w.lllIlIlIIlIl[w.lllIlIlIIllI[2]] = w."Exiting because we should";
        w.lllIlIlIIlIl[w.lllIlIlIIllI[3]] = w."Wield";
        w.lllIlIlIIlIl[w.lllIlIlIIllI[4]] = w."Exit Teleport";
    }

    private static boolean lIIIllIIIIIIllI(Object object) {
        return object != null;
    }

    protected void Q() {
        this.aC.a(((b)this.aB).d());
        String[] stringArray = new String[lllIlIlIIllI[1]];
        stringArray[w.lllIlIlIIllI[0]] = lllIlIlIIlIl[lllIlIlIIllI[4]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (w.lIIIllIIIIIIlII(tileObject)) {
            return;
        }
        tileObject.interact(lllIlIlIIllI[0]);
    }

    private static boolean lIIIllIIIIIIIll(int n2) {
        return n2 == 0;
    }

    public abstract boolean a(Item var1);

    public abstract Spell L();

    private static String lIIIlIllllllllI(String var24, String var11) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lllIlIlIIllI[2], var14);
            return new String(var7.doFinal(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIIIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean O() {
        void var1_1;
        w var21;
        if (!w.lIIIllIIIIIIlll(this.aC.c(((b)this.aB).d()), this.aC.d(((b)this.aB).d())) || w.lIIIllIIIIIlIII(this.aC.b(((b)this.aB).d()) ? 1 : 0)) {
            return lllIlIlIIllI[0];
        }
        String[] stringArray = new String[lllIlIlIIllI[1]];
        stringArray[w.lllIlIlIIllI[0]] = ((b)var21.aB).d().g();
        TileObject var20 = TileObjects.getNearest((String[])stringArray);
        if (w.lIIIllIIIIIIlII(var20)) {
            return lllIlIlIIllI[0];
        }
        var1_1.interact(lllIlIlIIllI[0]);
        return lllIlIlIIllI[1];
    }

    @Inject
    public w(T t2, SquireMTA squireMTA) {
        this.aB = t2;
        this.aC = squireMTA;
    }

    private static boolean lIIIllIIIIIlIII(int n2) {
        return n2 != 0;
    }

    public abstract boolean M();
}

