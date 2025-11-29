/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.e;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

/* TASK: Destroying Spare Ingredients -> DestroyingspareingredientsTask */
@TaskDesc(name="Destroying Spare Ingredients", priority=250)
public class F
extends Task {
    final /* synthetic */ a bk;
    private static /* synthetic */ int[] lIllIlIllIIl;
    private static /* synthetic */ String[] lIllIlIllIII;
    final /* synthetic */ SquireDukeSucellus bj;

    @Inject
    public F(SquireDukeSucellus squireDukeSucellus) {
        this.bj = squireDukeSucellus;
        this.bk = squireDukeSucellus.s();
    }

    private static void lllIlIIIIIllIl() {
        lIllIlIllIII = new String[lIllIlIllIIl[8]];
        F.lIllIlIllIII[F.lIllIlIllIIl[2]] = F."Musca powder";
        F.lIllIlIllIII[F.lIllIlIllIIl[1]] = F."Destroy";
        F.lIllIlIllIII[F.lIllIlIllIIl[0]] = F."Arder powder";
        F.lIllIlIllIII[F.lIllIlIllIIl[3]] = F."Destroy";
        F.lIllIlIllIII[F.lIllIlIllIIl[4]] = F."Salax salt";
        F.lIllIlIllIII[F.lIllIlIllIIl[5]] = F."Destroy";
        F.lIllIlIllIII[F.lIllIlIllIIl[6]] = F."Eat";
        F.lIllIlIllIII[F.lIllIlIllIIl[7]] = F."Eat";
    }

    public boolean run() {
        int lllllllllllllllIlIllllIlIIlIlIII2;
        Item lllllllllllllllIlIllllIlIIlIlIII2;
        F var6;
        if (F.lllIlIIIIIllll(this.bk.w(), lIllIlIllIIl[0])) {
            String[] stringArray = new String[lIllIlIllIIl[1]];
            stringArray[F.lIllIlIllIIl[2]] = lIllIlIllIII[lIllIlIllIIl[2]];
            Item item2 = Inventory.getFirst((String[])stringArray);
            if (F.lllIlIIIIlIIII(item2)) {
                item2.interact(lIllIlIllIII[lIllIlIllIIl[1]]);
                return lIllIlIllIIl[1];
            }
        }
        if (F.lllIlIIIIIllll(var6.bk.v(), lIllIlIllIIl[0])) {
            String[] stringArray = new String[lIllIlIllIIl[1]];
            stringArray[F.lIllIlIllIIl[2]] = lIllIlIllIII[lIllIlIllIIl[0]];
            lllllllllllllllIlIllllIlIIlIlIII2 = Inventory.getFirst((String[])stringArray);
            if (F.lllIlIIIIlIIII(lllllllllllllllIlIllllIlIIlIlIII2)) {
                lllllllllllllllIlIllllIlIIlIlIII2.interact(lIllIlIllIII[lIllIlIllIIl[3]]);
                return lIllIlIllIIl[1];
            }
        }
        if (F.lllIlIIIIIllll(var6.bk.x(), lIllIlIllIIl[0])) {
            String[] stringArray = new String[lIllIlIllIIl[1]];
            stringArray[F.lIllIlIllIIl[2]] = lIllIlIllIII[lIllIlIllIIl[4]];
            lllllllllllllllIlIllllIlIIlIlIII2 = Inventory.getFirst((String[])stringArray);
            if (F.lllIlIIIIlIIII(lllllllllllllllIlIllllIlIIlIlIII2)) {
                lllllllllllllllIlIllllIlIIlIlIII2.interact(lIllIlIllIII[lIllIlIllIIl[5]]);
                return lIllIlIllIIl[1];
            }
        }
        if (F.lllIlIIIIlIIIl((lllllllllllllllIlIllllIlIIlIlIII2 = Inventory.getCount((boolean)lIllIlIllIIl[2], item -> e.U.contains(item.getName()))) + Inventory.getFreeSlots(), lIllIlIllIIl[0])) {
            Item var8 = Inventory.getFirst(item -> {
                String[] stringArray = new String[lIllIlIllIIl[1]];
                stringArray[F.lIllIlIllIIl[2]] = lIllIlIllIII[lIllIlIllIIl[7]];
                return item.hasAction(stringArray);
            });
            if (F.lllIlIIIIlIIlI(var8)) {
                var6.bj.f(lIllIlIllIIl[2]);
                var6.bj.g(lIllIlIllIIl[1]);
                return lIllIlIllIIl[2];
            }
            var8.interact(lIllIlIllIII[lIllIlIllIIl[6]]);
            return lIllIlIllIIl[1];
        }
        return lIllIlIllIIl[2];
    }

    private static String lllIlIIIIIllII(String var11, String var1) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var5 = var1.toCharArray();
        int var3 = lIllIlIllIIl[2];
        char[] var13 = var11.toCharArray();
        int var14 = var13.length;
        int var9 = lIllIlIllIIl[2];
        while (F.lllIlIIIIlIIIl(var9, var14)) {
            char var21 = var13[var9];
            var15.append((char)(var21 ^ var5[var3 % var5.length]));
            0;
            ++var3;
            ++var9;
            0;
            if (((0x44 ^ 0x79) & ~(0xB1 ^ 0x8C)) == 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static String lllIlIIIIIlIlI(String var16, String var20) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), lIllIlIllIIl[8]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIllIlIllIIl[0], var10);
            return new String(var2.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    static {
        F.lllIlIIIIIlllI();
        F.lllIlIIIIIllIl();
    }

    private static boolean lllIlIIIIlIIII(Object object) {
        return object != null;
    }

    private static boolean lllIlIIIIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIlIIIIlIIlI(Object object) {
        return object == null;
    }

    private static boolean lllIlIIIIIllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lllIlIIIIIlIll(String var4, String var18) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lIllIlIllIIl[0], var19);
            return new String(var12.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static void lllIlIIIIIlllI() {
        lIllIlIllIIl = new int[9];
        F.lIllIlIllIIl[0] = 2;
        F.lIllIlIllIIl[1] = 1;
        F.lIllIlIllIIl[2] = (0x42 ^ 0x2B ^ (0xBF ^ 0x98)) & (0x38 ^ 0x40 ^ (0xA9 ^ 0x9F) ^ -1);
        F.lIllIlIllIIl[3] = 3;
        F.lIllIlIllIIl[4] = 0xD6 ^ 0xB1 ^ (0xA1 ^ 0xC2);
        F.lIllIlIllIIl[5] = 47 + 92 - 84 + 84 ^ 130 + 78 - 201 + 135;
        F.lIllIlIllIIl[6] = 0xFD ^ 0xC1 ^ (0x32 ^ 8);
        F.lIllIlIllIIl[7] = 0x32 ^ 0x23 ^ (0xAA ^ 0xBC);
        F.lIllIlIllIIl[8] = 0xAD ^ 0xC0 ^ (0x3D ^ 0x58);
    }
}

