/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.a_Unknown;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.b_Unknown;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.e_Unknown;

/* TASK: Eating food -> EatingfoodTask */
@TaskDesc(name="Eating food", priority=10000)
public class EatingFoodTask
extends a_Unknown {
    private static /* synthetic */ int[] lIlIlIIlllllI;
    private static /* synthetic */ String[] lIlIlIIllIIlI;

    private static void lIlllllIIlIIllI() {
        lIlIlIIlllllI = new int[6];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask.lIlIlIIlllllI[0] = 1;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask.lIlIlIIlllllI[1] = (0xAC ^ 0xBF) & ~(0x7C ^ 0x6F);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask.lIlIlIIlllllI[2] = 3;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask.lIlIlIIlllllI[3] = 2;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask.lIlIlIIlllllI[4] = 0x8A ^ 0xA9 ^ (0x69 ^ 0x4E);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask.lIlIlIIlllllI[5] = 0x6E ^ 0x27 ^ (0x22 ^ 0x63);
    }

    static {
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask.lIlllllIIlIIllI();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask.lIlllllIIlIIlIl();
    }

    private static boolean lIlllllIIlIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlllllIIlIIlIl() {
        lIlIlIIllIIlI = new String[lIlIlIIlllllI[4]];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask.lIlIlIIllIIlI[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask.lIlIlIIlllllI[1]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask."No food";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask.lIlIlIIllIIlI[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask.lIlIlIIlllllI[0]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask."Eat";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask.lIlIlIIllIIlI[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask.lIlIlIIlllllI[3]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask."Eat";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask.lIlIlIIllIIlI[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask.lIlIlIIlllllI[2]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask."Eat";
    }

    @Inject
    protected z(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
    }

    private static String lIlllllIIIIlllI(String var1, String var4) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(lIlIlIIlllllI[3], var14);
            return new String(var19.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllIIlIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIlllllIIIIllII(String var8, String var5) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIlIlIIlllllI[5]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(lIlIlIIlllllI[3], var15);
            return new String(var11.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllIIlIIlll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean l() {
        void var1_2;
        z var16;
        int n2;
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask.lIlllllIIlIIlll(this.t.earlyBank() ? 1 : 0) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask.lIlllllIIlIlIII(n2 = Inventory.getCount(item -> {
            String[] stringArray = new String[lIlIlIIlllllI[0]];
            stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask.lIlIlIIlllllI[1]] = lIlIlIIllIIlI[lIlIlIIlllllI[2]];
            return item.hasAction(stringArray);
        }), lIlIlIIlllllI[0])) {
            this.s.c(lIlIlIIlllllI[0]);
            return lIlIlIIlllllI[1];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask.lIlllllIIlIlIIl(Combat.getCurrentHealth(), var16.t.eatAt())) {
            return lIlIlIIlllllI[1];
        }
        Item var17 = Inventory.getFirst(item -> {
            String[] stringArray = new String[lIlIlIIlllllI[0]];
            stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask.lIlIlIIlllllI[1]] = lIlIlIIllIIlI[lIlIlIIlllllI[3]];
            return item.hasAction(stringArray);
        });
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask.lIlllllIIlIlIlI(var17)) {
            Log.error((String)lIlIlIIllIIlI[lIlIlIIlllllI[1]]);
            var16.s.c(lIlIlIIlllllI[0]);
            return lIlIlIIlllllI[1];
        }
        var1_2.interact(lIlIlIIllIIlI[lIlIlIIlllllI[0]]);
        this.sleep(lIlIlIIlllllI[2]);
        return lIlIlIIlllllI[0];
    }

    private static boolean lIlllllIIlIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlllllIIIIllIl(String var21, String var2) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var3 = var2.toCharArray();
        int var12 = lIlIlIIlllllI[1];
        char[] var6 = var21.toCharArray();
        int var18 = var6.length;
        int var9 = lIlIlIIlllllI[1];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.EatingFoodTask.lIlllllIIlIlIll(var9, var18)) {
            char var10 = var6[var9];
            var13.append((char)(var10 ^ var3[var12 % var3.length]));
            0;
            ++var12;
            ++var9;
            0;
            if (((0xA6 ^ 0xB8 ^ (0x14 ^ 0x3D)) & (47 + 58 - 89 + 171 ^ 109 + 127 - 191 + 95 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static boolean lIlllllIIlIlIlI(Object object) {
        return object == null;
    }
}

