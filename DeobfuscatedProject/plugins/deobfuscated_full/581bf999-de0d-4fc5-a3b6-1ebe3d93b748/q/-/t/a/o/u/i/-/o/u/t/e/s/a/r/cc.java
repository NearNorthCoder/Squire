/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.e;

/* TASK: Decanting potions -> DecantingpotionsTask */
@TaskDesc(name="Decanting potions", priority=1000, blocking=true)
public class cc
extends Z {
    private static /* synthetic */ int[] llIlIlIlllI;
    private static /* synthetic */ String[] llIlIlIlIIl;

    private int n(String string) {
        return Integer.parseInt(string.split(llIlIlIlIIl[llIlIlIlllI[2]])[llIlIlIlllI[0]].split(llIlIlIlIIl[llIlIlIlllI[3]])[llIlIlIlllI[1]]);
    }

    static {
        cc.lIlIIlllIlIIll();
        cc.lIlIIllIllllIl();
    }

    private static String lIlIIllIllllII(String var2, String var5) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), llIlIlIlllI[8]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(llIlIlIlllI[2], var14);
            return new String(var13.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static String lIlIIllIlllIll(String var26, String var24) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var20 = Cipher.getInstance("Blowfish");
            var20.init(llIlIlIlllI[2], var3);
            return new String(var20.doFinal(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static String lIlIIllIlllIlI(String var9, String var19) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var4 = var19.toCharArray();
        int var21 = llIlIlIlllI[1];
        char[] var8 = var9.toCharArray();
        int var1 = var8.length;
        int var25 = llIlIlIlllI[1];
        while (cc.lIlIIlllIllIlI(var25, var1)) {
            char var15 = var8[var25];
            var6.append((char)(var15 ^ var4[var21 % var4.length]));
            0;
            ++var21;
            ++var25;
            0;
            if (((0x68 ^ 0x21 ^ (0x52 ^ 0x1F)) & (0 ^ 0xE ^ (0x33 ^ 0x39) ^ -1)) <= 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public boolean run() {
        String[] stringArray = new String[llIlIlIlllI[0]];
        stringArray[cc.llIlIlIlllI[1]] = llIlIlIlIIl[llIlIlIlllI[1]];
        Item item2 = Inventory.getFirst((String[])stringArray);
        if (cc.lIlIIlllIlIlII(item2)) {
            item2.interact(llIlIlIlIIl[llIlIlIlllI[0]]);
            return llIlIlIlllI[0];
        }
        Set var18 = Inventory.getAll(item -> item.getName().contains(llIlIlIlIIl[llIlIlIlllI[7]])).stream().filter(item -> {
            String[] stringArray = new String[llIlIlIlllI[0]];
            stringArray[cc.llIlIlIlllI[1]] = llIlIlIlIIl[llIlIlIlllI[6]];
            return item.hasAction(stringArray);
        }).map(item -> item.getName().split(llIlIlIlIIl[llIlIlIlllI[5]])[llIlIlIlllI[1]].trim()).collect(Collectors.toSet());
        Iterator var16 = var18.iterator();
        while (cc.lIlIIlllIlIlIl(var16.hasNext() ? 1 : 0)) {
            cc var7;
            String var12 = (String)var16.next();
            if (cc.lIlIIlllIlIlIl(var7.m(var12) ? 1 : 0)) {
                return llIlIlIlllI[0];
            }
            0;
            if (-3 < 0) continue;
            return ((109 + 84 - 67 + 2 ^ 108 + 122 - 133 + 64) & (0x1B ^ 0x27 ^ (0x6E ^ 0x73) ^ -1)) != 0;
        }
        return llIlIlIlllI[1];
    }

    private static boolean lIlIIlllIlIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIlllIllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIlllIlIlIl(int n2) {
        return n2 != 0;
    }

    private static void lIlIIlllIlIIll() {
        llIlIlIlllI = new int[9];
        cc.llIlIlIlllI[0] = 1;
        cc.llIlIlIlllI[1] = (0x64 ^ 0x31) & ~(0x5A ^ 0xF);
        cc.llIlIlIlllI[2] = 2;
        cc.llIlIlIlllI[3] = 3;
        cc.llIlIlIlllI[4] = 0xEF ^ 0xA0 ^ (3 ^ 0x48);
        cc.llIlIlIlllI[5] = 0xB2 ^ 0xB7;
        cc.llIlIlIlllI[6] = 0xC0 ^ 0xC6;
        cc.llIlIlIlllI[7] = 0x4C ^ 0x2C ^ (0xA7 ^ 0xC0);
        cc.llIlIlIlllI[8] = 8 ^ 0;
    }

    private static boolean lIlIIlllIlIlll(Object object) {
        return object == null;
    }

    private static boolean lIlIIlllIllIII(Object object, Object object2) {
        return object != object2;
    }

    private static void lIlIIllIllllIl() {
        llIlIlIlIIl = new String[llIlIlIlllI[8]];
        cc.llIlIlIlIIl[cc.llIlIlIlllI[1]] = cc."Vial";
        cc.llIlIlIlIIl[cc.llIlIlIlllI[0]] = cc."Drop";
        cc.llIlIlIlIIl[cc.llIlIlIlllI[2]] = cc."\\(";
        cc.llIlIlIlIIl[cc.llIlIlIlllI[3]] = cc."\\)";
        cc.llIlIlIlIIl[cc.llIlIlIlllI[4]] = cc."4";
        cc.llIlIlIlIIl[cc.llIlIlIlllI[5]] = cc."\\(";
        cc.llIlIlIlIIl[cc.llIlIlIlllI[6]] = cc."Drink";
        cc.llIlIlIlIIl[cc.llIlIlIlllI[7]] = cc."(";
    }

    @Inject
    protected cc(Client client) {
        super(client);
    }

    private static boolean lIlIIlllIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean m(String string) {
        void var4_4;
        void var3_3;
        cc llllllllllllllllIIllIIlIlIIIIlll;
        void var22;
        List list = Inventory.getAll(item -> {
            int n2;
            if (cc.lIlIIlllIlIlll((Object)e.c(item.getId())) && cc.lIlIIlllIlIlIl(item.getName().contains(string) ? 1 : 0) && cc.lIlIIlllIllIIl(item.getName().contains(llIlIlIlIIl[llIlIlIlllI[4]]) ? 1 : 0)) {
                n2 = llIlIlIlllI[0];
                0;
                if (-1 >= 3) {
                    return false;
                }
            } else {
                n2 = llIlIlIlllI[1];
            }
            return n2 != 0;
        });
        if (cc.lIlIIlllIlIllI(list.size(), llIlIlIlllI[0])) {
            return llIlIlIlllI[1];
        }
        Item var17 = var22.stream().min(Comparator.comparingInt(item -> this.n(item.getName()))).orElse(null);
        Item var23 = var22.stream().filter(item2 -> {
            boolean bl2;
            if (cc.lIlIIlllIllIII(item2, var17)) {
                bl2 = llIlIlIlllI[0];
                0;
                if (1 == 0) {
                    return ((109 + 17 - 1 + 11 ^ 18 + 151 - 68 + 71) & (0x42 ^ 0x2B ^ (0x22 ^ 0x6F) ^ -1)) != 0;
                }
            } else {
                bl2 = llIlIlIlllI[1];
            }
            return bl2;
        }).max(Comparator.comparingInt(item -> this.n(item.getName()))).orElse(null);
        if (cc.lIlIIlllIlIlll(var23)) {
            return llIlIlIlllI[1];
        }
        var3_3.useOn((Item)var4_4);
        return llIlIlIlllI[0];
    }

    private static boolean lIlIIlllIlIlII(Object object) {
        return object != null;
    }
}

