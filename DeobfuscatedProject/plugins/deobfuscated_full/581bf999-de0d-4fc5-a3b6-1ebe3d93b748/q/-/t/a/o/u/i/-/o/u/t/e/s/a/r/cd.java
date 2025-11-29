/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
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
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.e;

/* TASK: Withdrawing supplies -> WithdrawingsuppliesTask */
@TaskDesc(name="Withdrawing supplies", priority=5000, blocking=true)
public class cd
extends Z {
    private static /* synthetic */ String[] llIIlllIIII;
    private static /* synthetic */ int[] llIIlllIIIl;
    private final /* synthetic */ C hK;

    private static boolean lIlIIIllIlIIII(Object object) {
        return object == null;
    }

    private static /* synthetic */ boolean a(e e2, Item item) {
        return e2.p().contains(item.getId());
    }

    private static boolean lIlIIIllIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIllIlIlIl(int n2) {
        return n2 > 0;
    }

    private static String lIlIIIllIIlIll(String var10, String var14) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(llIIlllIIIl[2], var11);
            return new String(var5.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIllIIlllI() {
        llIIlllIIII = new String[llIIlllIIIl[8]];
        cd.llIIlllIIII[cd.llIIlllIIIl[1]] = cd."Supplies";
        cd.llIIlllIIII[cd.llIIlllIIIl[0]] = cd."Open";
        cd.llIIlllIIII[cd.llIIlllIIIl[2]] = cd."Withdraw All";
        cd.llIIlllIIII[cd.llIIlllIIIl[3]] = cd."Supplies";
        cd.llIIlllIIII[cd.llIIlllIIIl[4]] = cd."Open";
        cd.llIIlllIIII[cd.llIIlllIIIl[5]] = cd."restore";
        cd.llIIlllIIII[cd.llIIlllIIIl[6]] = cd."prayer";
        cd.llIIlllIIII[cd.llIIlllIIIl[7]] = cd."sanfew";
    }

    static {
        cd.lIlIIIllIIllll();
        cd.lIlIIIllIIlllI();
    }

    private static boolean lIlIIIllIlIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIllIlIlII(int n2) {
        return n2 <= 0;
    }

    private static String lIlIIIllIIllIl(String var13, String var6) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var25 = var6.toCharArray();
        int var23 = llIIlllIIIl[1];
        char[] var7 = var13.toCharArray();
        int var24 = var7.length;
        int var18 = llIIlllIIIl[1];
        while (cd.lIlIIIllIlIllI(var18, var24)) {
            char var15 = var7[var18];
            var12.append((char)(var15 ^ var25[var23 % var25.length]));
            0;
            ++var23;
            ++var18;
            0;
            if (-(0xD5 ^ 0x9C ^ (0x3A ^ 0x77)) < 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static void lIlIIIllIIllll() {
        llIIlllIIIl = new int[9];
        cd.llIIlllIIIl[0] = 1;
        cd.llIIlllIIIl[1] = (0x1A ^ 0) & ~(0x83 ^ 0x99);
        cd.llIIlllIIIl[2] = 2;
        cd.llIIlllIIIl[3] = 3;
        cd.llIIlllIIIl[4] = 0xCC ^ 0xC0 ^ (0x3A ^ 0x32);
        cd.llIIlllIIIl[5] = 0xE3 ^ 0xB6 ^ (0xC6 ^ 0x96);
        cd.llIIlllIIIl[6] = 0x43 ^ 0x32 ^ (0x50 ^ 0x27);
        cd.llIIlllIIIl[7] = 0x73 ^ 0x74;
        cd.llIIlllIIIl[8] = 0x84 ^ 0xB8 ^ (0x85 ^ 0xB1);
    }

    /*
     * WARNING - void declaration
     */
    private boolean b(e e2) {
        void var19;
        cd var16;
        String[] stringArray = new String[llIIlllIIIl[0]];
        stringArray[cd.llIIlllIIIl[1]] = llIIlllIIII[llIIlllIIIl[3]];
        Item item = Inventory.getFirst((String[])stringArray);
        if (cd.lIlIIIllIlIIII(item)) {
            return llIIlllIIIl[1];
        }
        if (cd.lIlIIIllIlIlII(var16.hK.av().getOrDefault(var19, llIIlllIIIl[1]))) {
            return llIIlllIIIl[1];
        }
        Item var3 = Inventory.getFirst(arg_0 -> cd.a((e)var19, arg_0));
        if (cd.lIlIIIllIlIIII(var3)) {
            void var20;
            if (cd.lIlIIIllIlIIIl(Inventory.isFull() ? 1 : 0)) {
                return llIIlllIIIl[1];
            }
            if (cd.lIlIIIllIlIlIl(var16.aX())) {
                return llIIlllIIIl[1];
            }
            if (cd.lIlIIIllIlIIIl(var16.hK.au() ? 1 : 0)) {
                var16.hK.a((e)var19);
                return llIIlllIIIl[0];
            }
            var20.interact(llIIlllIIII[llIIlllIIIl[4]]);
            return llIIlllIIIl[0];
        }
        return llIIlllIIIl[1];
    }

    private static boolean lIlIIIllIlIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIllIlIIll(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4;
        cd var21;
        String[] stringArray = new String[llIIlllIIIl[0]];
        stringArray[cd.llIIlllIIIl[1]] = llIIlllIIII[llIIlllIIIl[1]];
        Item item2 = Inventory.getFirst((String[])stringArray);
        if (cd.lIlIIIllIlIIII(item2)) {
            return llIIlllIIIl[1];
        }
        if (cd.lIlIIIllIlIIIl(var21.hK.av().isEmpty() ? 1 : 0)) {
            var4.interact(llIIlllIIII[llIIlllIIIl[0]]);
            return llIIlllIIIl[0];
        }
        if (cd.lIlIIIllIlIIIl(var21.b(e.SMELLING_SALTS) ? 1 : 0)) {
            return llIIlllIIIl[0];
        }
        if (cd.lIlIIIllIlIIlI(var21.aq() ? 1 : 0)) {
            return llIIlllIIIl[1];
        }
        if (cd.lIlIIIllIlIIIl(Inventory.isFull() ? 1 : 0) && cd.lIlIIIllIlIIlI(Inventory.contains(item -> e.LIQUID_ADRENALINE.d(item.getId())) ? 1 : 0)) {
            var21.b((Item item) -> {
                boolean bl2;
                if (!cd.lIlIIIllIlIIlI(item.getName().toLowerCase().contains(llIIlllIIII[llIIlllIIIl[5]]) ? 1 : 0) || !cd.lIlIIIllIlIIlI(item.getName().toLowerCase().contains(llIIlllIIII[llIIlllIIIl[6]]) ? 1 : 0) || cd.lIlIIIllIlIIIl(item.getName().toLowerCase().contains(llIIlllIIII[llIIlllIIIl[7]]) ? 1 : 0)) {
                    bl2 = llIIlllIIIl[0];
                    0;
                    if (((0xB ^ 0x63 ^ (0x7F ^ 0x46)) & (2 ^ (0x6B ^ 0x38) ^ -1)) > 0) {
                        return ((0x2D ^ 1 ^ (0x43 ^ 0x48)) & (80 + 35 - 30 + 45 ^ 147 + 77 - 120 + 61 ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIIlllIIIl[1];
                }
                return bl2;
            });
        }
        if (cd.lIlIIIllIlIIIl(var21.aq() ? 1 : 0) && cd.lIlIIIllIlIIll(Inventory.getFreeSlots(), llIIlllIIIl[0]) && cd.lIlIIIllIlIIIl(Prayers.anyActive() ? 1 : 0)) {
            var4.interact(llIIlllIIII[llIIlllIIIl[2]]);
        }
        if (cd.lIlIIIllIlIIIl(var21.b(e.LIQUID_ADRENALINE) ? 1 : 0)) {
            return llIIlllIIIl[0];
        }
        if (cd.lIlIIIllIlIIIl(var21.b(e.AMBROSIA) ? 1 : 0)) {
            return llIIlllIIIl[0];
        }
        if (cd.lIlIIIllIlIIIl(var21.b(e.NECTAR) ? 1 : 0)) {
            return llIIlllIIIl[0];
        }
        if (cd.lIlIIIllIlIIIl(var21.b(e.SILK_DRESSING) ? 1 : 0)) {
            return llIIlllIIIl[0];
        }
        if (cd.lIlIIIllIlIIIl(var21.b(e.TEARS_OF_ELIDINIS) ? 1 : 0)) {
            return llIIlllIIIl[0];
        }
        return llIIlllIIIl[1];
    }

    private static String lIlIIIllIIllII(String var9, String var17) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), llIIlllIIIl[8]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(llIIlllIIIl[2], var22);
            return new String(var2.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    @Inject
    protected cd(Client client, C c2) {
        super(client);
        this.hK = c2;
    }
}

