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
package gg.squire.zulrah.tasks;

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
public class THelper {
    private static final  List<Integer> t;
    private static final  List<Integer> s;
    private final  SquireZulrahConfig w;

    private static final  List<Integer> u;
    private static final  List<List<Integer>> v;

    private static void llIIIlllIIlIlll() {
        lIllIIllllllI = new String[lIllIlIIIIIIl[11]];
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIIllllllI[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[0]] = a.u.i.-.l.r.h.z.s.r.u.q.e."None";
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIIllllllI[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[2]] = a.u.i.-.l.r.h.z.s.r.u.q.e."Wield";
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIIllllllI[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[3]] = a.u.i.-.l.r.h.z.s.r.u.q.e."Wear";
        a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIIllllllI[a.u.i.-.l.r.h.z.s.r.u.q.e.t.lIllIlIIIIIIl[4]] = a.u.i.-.l.r.h.z.s.r.u.q.e."Equip";
    }

    /*
     * WARNING - void declaration
     */
    public List<Integer> f(int n2) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(n2);

        Iterator<List<Integer>> var1 = v.iterator();
        while (a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIlllIl(var1.hasNext() ? 1 : 0)) {
            void var2;
            List<Integer> var3 = var1.next();
            if (a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIlllIl(var3.contains((int)var2) ? 1 : 0)) {
                void var4;
                var4.addAll(var3);

            }

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

    public int[] O() {
        if (a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIlllIl(this.w.mageGear().getSelected().equals(lIllIIllllllI[lIllIlIIIIIIl[0]]) ? 1 : 0)) {
            return this.a(this.w.rangedGear());
        }
        return this.a(this.w.mageGear());
    }

    private static boolean llIIIlllIIlllll(int n2) {
        return n2 == 0;
    }

    public int[] P() {
        return this.a(this.w.rangedGear());
    }

    private  boolean a(int n2, Item item) {
        int n3;
        if (a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIlIIIII(item.getId(), lIllIlIIIIIIl[5]) && a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIlllIl(this.f(n2).contains(item.getId()) ? 1 : 0)) {
            n3 = lIllIlIIIIIIl[2];

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
        void var5;
        void llllllllllllllIllIIlIIIIlIIIllll2;
        ArrayList arrayList = new ArrayList();
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int var6 = lIllIlIIIIIIl[0];
        while (a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIlllII(var6, (int)llllllllllllllIllIIlIIIIlIIIllll2)) {
            t var7;
            void var8;
            void var9 = var8[var6];
            var5.addAll(Inventory.getAll(arg_0 -> var7.a((int)var9, arg_0)));

            ++var6;

            if ((0xA6 ^ 0xA2) > 1) continue;
            return false;
        }
        if (a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIlllIl(var5.isEmpty() ? 1 : 0)) {
            return lIllIlIIIIIIl[0];
        }
        int var8 = lIllIlIIIIIIl[0];
        while (a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIlllII(var8, Math.min(var5.size(), lIllIlIIIIIIl[1]))) {
            Item llllllllllllllIllIIlIIIIlIIIllll2 = (Item)var5.get(var8);
            llllllllllllllIllIIlIIIIlIIIllll2.interact(string -> {
                int n2;
                if (a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIllllI(string) && (!a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIlllll(string.equals(lIllIIllllllI[lIllIlIIIIIIl[2]]) ? 1 : 0) || !a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIlllll(string.equals(lIllIIllllllI[lIllIlIIIIIIl[3]]) ? 1 : 0) || a.u.i.-.l.r.h.z.s.r.u.q.e.t.llIIIlllIIlllIl(string.equals(lIllIIllllllI[lIllIlIIIIIIl[4]]) ? 1 : 0))) {
                    n2 = lIllIlIIIIIIl[2];

                    if (((1 + 175 - 48 + 76 ^ 103 + 74 - 57 + 20) & (18 + 156 - 149 + 169 ^ 125 + 124 - 135 + 16 ^ -1)) >= 3) {
                        return ((0x63 ^ 0x39 ^ (3 ^ 0x60)) & (0x9E ^ 0x93 ^ (0xA6 ^ 0x92) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIllIlIIIIIIl[0];
                }
                return n2 != 0;
            });
            ++var8;

            if (2 > ((0xF7 ^ 0xB2) & ~(0xD1 ^ 0x94))) continue;
            return false;
        }
        return lIllIlIIIIIIl[2];
    }

    private static boolean llIIIlllIlIIIII(int n2, int n3) {
        return n2 != n3;
    }

        return String.valueOf(var10);
    }

    @Inject
    public THelper(SquireZulrahConfig squireZulrahConfig) {
        this.w = squireZulrahConfig;
    }

    private static boolean llIIIlllIIlllIl(int n2) {
        return n2 != 0;
    }
}

