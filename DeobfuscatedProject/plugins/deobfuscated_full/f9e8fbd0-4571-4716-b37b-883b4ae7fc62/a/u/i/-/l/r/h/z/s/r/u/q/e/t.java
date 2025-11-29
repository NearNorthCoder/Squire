/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Item
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.items.Inventory
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.items.Inventory;

@Singleton
public class t {
    private static final /* synthetic */ List<Integer> t;
    private static final /* synthetic */ List<Integer> s;
    private final /* synthetic */ SquireZulrahConfig w;
    private static /* synthetic */ int[] lIllIlIIIIIIl;
    private static /* synthetic */ String[] lIllIIllllllI;
    private static final /* synthetic */ List<Integer> u;
    private static final /* synthetic */ List<List<Integer>> v;

    private static void llIIIlllIIlIlll() {
        lIllIIllllllI = new String[lIllIlIIIIIIl[11]];
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIIllllllI[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[0]] = a.u.i.-.l.r.h.z.s.r.u.q.e.t."None";
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIIllllllI[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[2]] = a.u.i.-.l.r.h.z.s.r.u.q.e.t."Wield";
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIIllllllI[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[3]] = a.u.i.-.l.r.h.z.s.r.u.q.e.t."Wear";
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIIllllllI[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[4]] = a.u.i.-.l.r.h.z.s.r.u.q.e.t."Equip";
    }

    /*
     * WARNING - void declaration
     */
    public List<Integer> f(int n2) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(n2);
        0;
        Iterator<List<Integer>> var3 = v.iterator();
        while (a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIlllIl(var3.hasNext() ? 1 : 0)) {
            void var14;
            List<Integer> var16 = var3.next();
            if (a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIlllIl(var16.contains((int)var14) ? 1 : 0)) {
                void var24;
                var24.addAll(var16);
                0;
            }
            0;
            if (-1 != 3) continue;
            return null;
        }
        return arrayList;
    }

    private static boolean llIIIlllIIllllI(Object object) {
        return object != null;
    }

    public int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        int[] nArray;
        EquipmentSetup equipmentSetup = (EquipmentSetup)configStorageBox.selected(EquipmentSetup.class);
        if (a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIllllI(equipmentSetup)) {
            nArray = equipmentSetup.getIds();
            0;
            if (-2 > 0) {
                return null;
            }
        } else {
            nArray = new int[lIllIlIIIIIIl[0]];
        }
        return nArray;
    }

    private static boolean llIIIlllIIlllII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIllIll();
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIlIlll();
        Integer[] integerArray = new Integer[lIllIlIIIIIIl[6]];
        integerArray[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[0]] = lIllIlIIIIIIl[7];
        integerArray[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[2]] = lIllIlIIIIIIl[8];
        integerArray[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[3]] = lIllIlIIIIIIl[9];
        integerArray[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[4]] = lIllIlIIIIIIl[10];
        integerArray[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[11]] = lIllIlIIIIIIl[12];
        integerArray[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[13]] = lIllIlIIIIIIl[14];
        s = Arrays.asList(integerArray);
        Integer[] integerArray2 = new Integer[lIllIlIIIIIIl[6]];
        integerArray2[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[0]] = lIllIlIIIIIIl[15];
        integerArray2[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[2]] = lIllIlIIIIIIl[16];
        integerArray2[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[3]] = lIllIlIIIIIIl[17];
        integerArray2[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[4]] = lIllIlIIIIIIl[18];
        integerArray2[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[11]] = lIllIlIIIIIIl[19];
        integerArray2[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[13]] = lIllIlIIIIIIl[20];
        t = Arrays.asList(integerArray2);
        Integer[] integerArray3 = new Integer[lIllIlIIIIIIl[6]];
        integerArray3[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[0]] = lIllIlIIIIIIl[21];
        integerArray3[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[2]] = lIllIlIIIIIIl[22];
        integerArray3[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[3]] = lIllIlIIIIIIl[23];
        integerArray3[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[4]] = lIllIlIIIIIIl[24];
        integerArray3[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[11]] = lIllIlIIIIIIl[25];
        integerArray3[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[13]] = lIllIlIIIIIIl[26];
        u = Arrays.asList(integerArray3);
        List[] listArray = new List[lIllIlIIIIIIl[4]];
        listArray[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[0]] = s;
        listArray[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[2]] = t;
        listArray[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[3]] = u;
        v = Arrays.asList(listArray);
    }

    private static String llIIIlllIIlIlII(String var9, String var17) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lIllIlIIIIIIl[3], var21);
            return new String(var4.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    public int[] O() {
        if (a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIlllIl(this.w.mageGear().getSelected().equals(lIllIIllllllI[lIllIlIIIIIIl[0]]) ? 1 : 0)) {
            return this.a(this.w.rangedGear());
        }
        return this.a(this.w.mageGear());
    }

    private static boolean llIIIlllIIlllll(int n2) {
        return n2 == 0;
    }

    private static String llIIIlllIIlIllI(String var10, String var1) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lIllIlIIIIIIl[27]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lIllIlIIIIIIl[3], var5);
            return new String(var8.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    public int[] P() {
        return this.a(this.w.rangedGear());
    }

    private /* synthetic */ boolean a(int n2, Item item) {
        int n3;
        if (a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIlIIIII(item.getId(), lIllIlIIIIIIl[5]) && a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIlllIl(this.f(n2).contains(item.getId()) ? 1 : 0)) {
            n3 = lIllIlIIIIIIl[2];
            0;
            if (1 > 1) {
                return false;
            }
        } else {
            n3 = lIllIlIIIIIIl[0];
        }
        return n3 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(int[] nArray) {
        void var27;
        void llllllllllllllIllIIlIIIIlIIIllll2;
        ArrayList arrayList = new ArrayList();
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int var19 = lIllIlIIIIIIl[0];
        while (a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIlllII(var19, (int)llllllllllllllIllIIlIIIIlIIIllll2)) {
            t var15;
            void var23;
            void var20 = var23[var19];
            var27.addAll(Inventory.getAll(arg_0 -> var15.a((int)var20, arg_0)));
            0;
            ++var19;
            0;
            if ((0xA6 ^ 0xA2) > 1) continue;
            return false;
        }
        if (a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIlllIl(var27.isEmpty() ? 1 : 0)) {
            return lIllIlIIIIIIl[0];
        }
        int var23 = lIllIlIIIIIIl[0];
        while (a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIlllII(var23, Math.min(var27.size(), lIllIlIIIIIIl[1]))) {
            Item llllllllllllllIllIIlIIIIlIIIllll2 = (Item)var27.get(var23);
            llllllllllllllIllIIlIIIIlIIIllll2.interact(string -> {
                int n2;
                if (a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIllllI(string) && (!a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIlllll(string.equals(lIllIIllllllI[lIllIlIIIIIIl[2]]) ? 1 : 0) || !a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIlllll(string.equals(lIllIIllllllI[lIllIlIIIIIIl[3]]) ? 1 : 0) || a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIlllIl(string.equals(lIllIIllllllI[lIllIlIIIIIIl[4]]) ? 1 : 0))) {
                    n2 = lIllIlIIIIIIl[2];
                    0;
                    if (((1 + 175 - 48 + 76 ^ 103 + 74 - 57 + 20) & (18 + 156 - 149 + 169 ^ 125 + 124 - 135 + 16 ^ -1)) >= 3) {
                        return ((0x63 ^ 0x39 ^ (3 ^ 0x60)) & (0x9E ^ 0x93 ^ (0xA6 ^ 0x92) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIllIlIIIIIIl[0];
                }
                return n2 != 0;
            });
            ++var23;
            0;
            if (2 > ((0xF7 ^ 0xB2) & ~(0xD1 ^ 0x94))) continue;
            return false;
        }
        return lIllIlIIIIIIl[2];
    }

    private static void llIIIlllIIllIll() {
        lIllIlIIIIIIl = new int[28];
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[0] = (0x17 ^ 0x11 ^ (0x36 ^ 0x61)) & (81 + 94 - 106 + 123 ^ 22 + 39 - -15 + 69 ^ -1);
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[1] = 0x43 ^ 0x44;
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[2] = 1;
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[3] = 2;
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[4] = 3;
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[5] = 0xFFFFEBFF & 0x1DF6;
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[6] = 0xC0 ^ 0xB4 ^ (0xC6 ^ 0xB4);
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[7] = 0xFFFF93FF & 0x7EFC;
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[8] = -(0xFFFFFF53 & 0x21AD) & (0xFFFFFFFB & 0x33FF);
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[9] = 0xFFFF92FE & 0x7FFB;
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[10] = 0xFFFFF6F9 & 0x1BFF;
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[11] = 119 + 42 - 43 + 80 ^ 189 + 29 - 24 + 0;
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[12] = 0xFFFF9BFC & 0x76FB;
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[13] = 0x8A ^ 0x8F;
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[14] = -(0xFFFFCCDF & 0x3FB1) & (0xFFFFFFF4 & 0x1EFF);
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[15] = 0xFFFFFF68 & 0x139F;
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[16] = -(0xFFFFF4FF & 0x4F79) & (0xFFFFF77F & 0x5FFF);
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[17] = -(0xFFFFBA32 & 0x6DDF) & (0xFFFFFF17 & 0x3BFF);
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[18] = -(0xFFFFEAD3 & 0x55EF) & (0xFFFFFBDF & 0x57E7);
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[19] = -(0xFFFFEEDF & 0x3DFA) & (0xFFFFBFFD & 0x7FDF);
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[20] = 0xFFFFBA6F & 0x57F8;
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[21] = 0xFFFF9F3F & 0x73CE;
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[22] = 0xFFFFBBEF & 0x571D;
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[23] = -(0xFFFFDCAD & 0x2776) & (0xFFFFBFAF & 0x577F);
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[24] = 0xFFFFF75F & 0x1BAB;
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[25] = -(0xFFFFFFBB & 0x64F5) & (0xFFFFFFFF & 0x77BA);
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[26] = -(0xFFFFEF06 & 0x79FF) & (0xFFFFFF6F & 0x7BFF);
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[27] = 0x18 ^ 0x10;
    }

    private static boolean llIIIlllIlIIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static String llIIIlllIIlIIll(String var11, String var28) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var26 = var28.toCharArray();
        int var6 = lIllIlIIIIIIl[0];
        char[] var2 = var11.toCharArray();
        int var13 = var2.length;
        int var7 = lIllIlIIIIIIl[0];
        while (a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIlllII(var7, var13)) {
            char var25 = var2[var7];
            var12.append((char)(var25 ^ var26[var6 % var26.length]));
            0;
            ++var6;
            ++var7;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    @Inject
    public t(SquireZulrahConfig squireZulrahConfig) {
        this.w = squireZulrahConfig;
    }

    private static boolean llIIIlllIIlllIl(int n2) {
        return n2 != 0;
    }
}

