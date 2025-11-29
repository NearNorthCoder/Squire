/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bg_Unknown;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/* TASK: Prep Getting Tools -> PrepgettingtoolsTask */
@TaskDesc(name="Prep Getting Tools", priority=21003, blocking=true)
public class PrepGettingToolsTask
extends bg_Unknown {
    private static /* synthetic */ String[] lIlIlIllllII;
    private final /* synthetic */ int eh = 7603;
    private static /* synthetic */ int[] lIlIlIllllIl;
    private final /* synthetic */ int eg = 29742;

    private static boolean llIlllllIlllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlllllIlllll(int n2) {
        return n2 == 0;
    }

    private static void llIlllllIllIlI() {
        lIlIlIllllII = new String[lIlIlIllllIl[14]];
        bb.lIlIlIllllII[bb.lIlIlIllllIl[2]] = bb."CANT FIND TOOLS!!!";
        bb.lIlIlIllllII[bb.lIlIlIllllIl[3]] = bb."TAKING SEED DIBBLER";
        bb.lIlIlIllllII[bb.lIlIlIllllIl[8]] = bb."Take Seed Dibber";
        bb.lIlIlIllllII[bb.lIlIlIllllIl[10]] = bb."TAKING RAKE, NO SEEDS!";
        bb.lIlIlIllllII[bb.lIlIlIllllIl[11]] = bb."Take Rake";
        bb.lIlIlIllllII[bb.lIlIlIllllIl[12]] = bb."TAKING SPADE";
        bb.lIlIlIllllII[bb.lIlIlIllllIl[13]] = bb."Take Spade";
    }

    @Inject
    protected bb(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.eg = lIlIlIllllIl[0];
        this.eh = lIlIlIllllIl[1];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var1_1;
        if (bb.llIlllllIlllII(this.cq(), this.el)) {
            return lIlIlIllllIl[2];
        }
        int[] nArray = new int[lIlIlIllllIl[3]];
        nArray[bb.lIlIlIllllIl[2]] = lIlIlIllllIl[4];
        if (bb.llIlllllIlllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIlIlIllllIl[3]];
            nArray2[bb.lIlIlIllllIl[2]] = lIlIlIllllIl[5];
            if (bb.llIlllllIlllIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                return lIlIlIllllIl[2];
            }
        }
        int[] nArray3 = new int[lIlIlIllllIl[3]];
        nArray3[bb.lIlIlIllllIl[2]] = lIlIlIllllIl[6];
        TileObject var5 = TileObjects.getNearest((int[])nArray3);
        if (bb.llIlllllIllllI(var5)) {
            bb var9;
            System.out.println(lIlIlIllllII[lIlIlIllllIl[2]]);
            Movement.setDestination((WorldPoint)var9.ak.bq.dx(lIlIlIllllIl[7]).dy(lIlIlIllllIl[7]));
            return lIlIlIllllIl[3];
        }
        int[] nArray4 = new int[lIlIlIllllIl[3]];
        nArray4[bb.lIlIlIllllIl[2]] = lIlIlIllllIl[4];
        if (bb.llIlllllIlllll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            System.out.println(lIlIlIllllII[lIlIlIllllIl[3]]);
            var5.interact(lIlIlIllllII[lIlIlIllllIl[8]]);
            return lIlIlIllllIl[3];
        }
        int[] nArray5 = new int[lIlIlIllllIl[3]];
        nArray5[bb.lIlIlIllllIl[2]] = lIlIlIllllIl[9];
        if (bb.llIlllllIlllll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
            System.out.println(lIlIlIllllII[lIlIlIllllIl[10]]);
            var5.interact(lIlIlIllllII[lIlIlIllllIl[11]]);
            return lIlIlIllllIl[3];
        }
        System.out.println(lIlIlIllllII[lIlIlIllllIl[12]]);
        var1_1.interact(lIlIlIllllII[lIlIlIllllIl[13]]);
        return lIlIlIllllIl[3];
    }

    private static void llIlllllIllIll() {
        lIlIlIllllIl = new int[16];
        bb.lIlIlIllllIl[0] = 0xFFFFF4AE & 0x7F7F;
        bb.lIlIlIllllIl[1] = -(0xFFFFC28D & 0x3F77) & (0xFFFF9FB7 & Short.MAX_VALUE);
        bb.lIlIlIllllIl[2] = (0x78 ^ 0x3B) & ~(3 ^ 0x40);
        bb.lIlIlIllllIl[3] = 1;
        bb.lIlIlIllllIl[4] = -(0xFFFFEB4F & 0x3EB1) & (0xFFFFBEDF & Short.MAX_VALUE);
        bb.lIlIlIllllIl[5] = -(0xFFFFE867 & 0x7F9B) & (0xFFFFEFBA & 0x7BFF);
        bb.lIlIlIllllIl[6] = -(0xFFFFDDB3 & 0x2B4D) & (0xFFFFFF4B & 0x7DFF);
        bb.lIlIlIllllIl[7] = 0x6C ^ 0x69 ^ (0x58 ^ 0x52);
        bb.lIlIlIllllIl[8] = 2;
        bb.lIlIlIllllIl[9] = -(0xFFFFFFD9 & 0xA37) & (0xFFFFFFFF & 0x5BBD);
        bb.lIlIlIllllIl[10] = 3;
        bb.lIlIlIllllIl[11] = 134 + 14 - 115 + 140 ^ 98 + 127 - 123 + 67;
        bb.lIlIlIllllIl[12] = 57 + 132 - 101 + 78 ^ 74 + 92 - 39 + 36;
        bb.lIlIlIllllIl[13] = 0xA2 ^ 0xA4;
        bb.lIlIlIllllIl[14] = 0x3B ^ 0x3C;
        bb.lIlIlIllllIl[15] = 0x7B ^ 0x73;
    }

    private static String llIlllllIllIII(String var8, String var15) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIlIlIllllIl[15]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lIlIlIllllIl[8], var13);
            return new String(var1.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static String llIlllllIlIlll(String var10, String var16) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var6 = var16.toCharArray();
        int var19 = lIlIlIllllIl[2];
        char[] var2 = var10.toCharArray();
        int var17 = var2.length;
        int var3 = lIlIlIllllIl[2];
        while (bb.llIllllllIIIII(var3, var17)) {
            char var7 = var2[var3];
            var18.append((char)(var7 ^ var6[var19 % var6.length]));
            0;
            ++var19;
            ++var3;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    private static boolean llIlllllIllllI(Object object) {
        return object == null;
    }

    private static String llIlllllIllIIl(String var14, String var12) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var21 = Cipher.getInstance("Blowfish");
            var21.init(lIlIlIllllIl[8], var11);
            return new String(var21.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static boolean llIllllllIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlllllIlllIl(int n2) {
        return n2 != 0;
    }

    static {
        bb.llIlllllIllIll();
        bb.llIlllllIllIlI();
    }
}

