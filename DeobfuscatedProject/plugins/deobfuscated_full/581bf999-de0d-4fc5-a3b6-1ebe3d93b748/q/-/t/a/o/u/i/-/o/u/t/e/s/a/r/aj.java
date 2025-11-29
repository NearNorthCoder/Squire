/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.a;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.e;

/* TASK: Dropping unnecessary supplies -> DroppingunnecessarysuppliesTask */
@TaskDesc(name="Dropping unnecessary supplies", priority=10)
public class aj
extends Z {
    private static /* synthetic */ int[] llIlIIlllII;
    private static /* synthetic */ String[] llIlIIllIll;
    private final /* synthetic */ C cM;

    private static boolean lIlIIllIIIIlll(int n2) {
        return n2 == 0;
    }

    private static void lIlIIllIIIIIII() {
        llIlIIlllII = new int[9];
        aj.llIlIIlllII[0] = (3 ^ 0x50) & ~(0xC6 ^ 0x95);
        aj.llIlIIlllII[1] = 2;
        aj.llIlIIlllII[2] = 1;
        aj.llIlIIlllII[3] = 3;
        aj.llIlIIlllII[4] = 0x8D ^ 0x89;
        aj.llIlIIlllII[5] = 0x2D ^ 0x28;
        aj.llIlIIlllII[6] = 192 + 119 - 163 + 51 ^ 48 + 177 - 133 + 101;
        aj.llIlIIlllII[7] = 0x5C ^ 0x5B;
        aj.llIlIIlllII[8] = 0x26 ^ 0x2E;
    }

    private static boolean lIlIIllIIIIllI(int n2) {
        return n2 > 0;
    }

    private static String lIlIIlIlllllII(String var19, String var9) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(llIlIIlllII[1], var7);
            return new String(var10.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    @Inject
    protected aj(Client client, C c2) {
        super(client);
        this.cM = c2;
    }

    private static boolean lIlIIllIIIlIII(Object object) {
        return object == null;
    }

    private static boolean lIlIIllIIIIIlI(int n2) {
        return n2 <= 0;
    }

    private static String lIlIIlIllllllI(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var23 = llIlIIlllII[0];
        char[] var18 = var14.toCharArray();
        int var4 = var18.length;
        int var20 = llIlIIlllII[0];
        while (aj.lIlIIllIIIIlII(var20, var4)) {
            char var21 = var18[var20];
            var3.append((char)(var21 ^ var17[var23 % var17.length]));
            0;
            ++var23;
            ++var20;
            0;
            if (1 < (0x23 ^ 0x27)) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    private static void lIlIIlIlllllll() {
        llIlIIllIll = new String[llIlIIlllII[8]];
        aj.llIlIIllIll[aj.llIlIIlllII[0]] = aj."Drop";
        aj.llIlIIllIll[aj.llIlIIlllII[2]] = aj."Drop";
        aj.llIlIIllIll[aj.llIlIIlllII[1]] = aj."Drink";
        aj.llIlIIllIll[aj.llIlIIlllII[3]] = aj."Drop";
        aj.llIlIIllIll[aj.llIlIIlllII[4]] = aj."Drink";
        aj.llIlIIllIll[aj.llIlIIlllII[5]] = aj."Drop";
        aj.llIlIIllIll[aj.llIlIIlllII[6]] = aj."anti";
        aj.llIlIIllIll[aj.llIlIIlllII[7]] = aj."anti";
    }

    static {
        aj.lIlIIllIIIIIII();
        aj.lIlIIlIlllllll();
    }

    public boolean run() {
        aj var1;
        if (!aj.lIlIIllIIIIIIl(this.aq() ? 1 : 0) || aj.lIlIIllIIIIIlI(this.aX())) {
            return llIlIIlllII[0];
        }
        if (aj.lIlIIllIIIIIll(Inventory.getFreeSlots(), llIlIIlllII[1])) {
            return llIlIIlllII[0];
        }
        if (aj.lIlIIllIIIIIIl(Inventory.contains(item -> item.getName().toLowerCase().contains(llIlIIllIll[llIlIIlllII[7]])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIlIIllIll[llIlIIlllII[6]])).interact(llIlIIllIll[llIlIIlllII[0]]);
            return llIlIIlllII[2];
        }
        Item var5 = a.values();
        int llllllllllllllllIIllIlIllIllllll22 = ((a[])var5).length;
        int var11 = llIlIIlllII[0];
        while (aj.lIlIIllIIIIlII(var11, llllllllllllllllIIllIlIllIllllll22)) {
            a var22 = var5[var11];
            Item var24 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(var22.l().toLowerCase()));
            if (aj.lIlIIllIIIIlIl(var24)) {
                var24.interact(llIlIIllIll[llIlIIlllII[2]]);
                return llIlIIlllII[2];
            }
            ++var11;
            0;
            if (((0xA6 ^ 0xBD) & ~(0x87 ^ 0x9C)) <= ((0x42 ^ 0x18) & ~(0x17 ^ 0x4D))) continue;
            return false;
        }
        var5 = Inventory.getFirst(item -> e.TEARS_OF_ELIDINIS.d(item.getId()));
        if (aj.lIlIIllIIIIllI(var1.cM.av().getOrDefault((Object)e.AMBROSIA, llIlIIlllII[0])) && aj.lIlIIllIIIIlIl(var5) && aj.lIlIIllIIIIIIl(var1.be() ? 1 : 0) && aj.lIlIIllIIIIlll(Inventory.contains(item -> e.AMBROSIA.d(item.getId())) ? 1 : 0)) {
            String string;
            if (aj.lIlIIllIIIIlII(Prayers.getPoints(), Skills.getLevel((Skill)Skill.PRAYER))) {
                string = llIlIIllIll[llIlIIlllII[1]];
                0;
                if (((0x79 ^ 0x65 ^ (0xD ^ 0x71)) & (0x40 ^ 0x36 ^ (0x34 ^ 0x22) ^ -1)) >= 3) {
                    return false;
                }
            } else {
                string = llIlIIllIll[llIlIIlllII[3]];
            }
            var5.interact(string);
            var1.sleep(llIlIIlllII[4]);
            return llIlIIlllII[2];
        }
        Item llllllllllllllllIIllIlIllIllllll22 = Inventory.getFirst(item -> e.NECTAR.d(item.getId()));
        if (aj.lIlIIllIIIIllI(var1.cM.av().getOrDefault((Object)e.AMBROSIA, llIlIIlllII[0])) && aj.lIlIIllIIIIIIl(var1.be() ? 1 : 0) && aj.lIlIIllIIIIlll(Inventory.contains(item -> e.AMBROSIA.d(item.getId())) ? 1 : 0)) {
            String string;
            if (aj.lIlIIllIIIlIII(llllllllllllllllIIllIlIllIllllll22)) {
                return llIlIIlllII[0];
            }
            if (aj.lIlIIllIIIIllI(Combat.getMissingHealth())) {
                string = llIlIIllIll[llIlIIlllII[4]];
                0;
                if (2 >= 3) {
                    return false;
                }
            } else {
                string = llIlIIllIll[llIlIIlllII[5]];
            }
            llllllllllllllllIIllIlIllIllllll22.interact(string);
            var1.sleep(llIlIIlllII[4]);
            return llIlIIlllII[2];
        }
        return llIlIIlllII[0];
    }

    private static boolean lIlIIllIIIIlIl(Object object) {
        return object != null;
    }

    private static String lIlIIlIlllllIl(String var16, String var6) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), llIlIIlllII[8]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(llIlIIlllII[1], var12);
            return new String(var8.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIIIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIllIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIllIIIIIIl(int n2) {
        return n2 != 0;
    }
}

