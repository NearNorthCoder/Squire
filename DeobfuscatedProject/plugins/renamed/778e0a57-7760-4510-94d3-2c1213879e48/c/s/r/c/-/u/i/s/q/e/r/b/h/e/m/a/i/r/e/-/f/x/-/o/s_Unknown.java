/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.openosrs.client.util.WeaponMap
 *  com.openosrs.client.util.WeaponStyle
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.client.game.ItemManager
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.runelite.http.api.item.ItemEquipmentStats
 *  net.runelite.http.api.item.ItemStats
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aG_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.OEnum;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.r_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.t_Unknown;
import com.openosrs.client.util.WeaponMap;
import com.openosrs.client.util.WeaponStyle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.runelite.http.api.item.ItemEquipmentStats;
import net.runelite.http.api.item.ItemStats;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

public class s_Unknown {
    private static /* synthetic */ int[] lIlIIlllIIII;
    private static /* synthetic */ String[] lIlIIllIllll;

    /*
     * WARNING - void declaration
     */
    public static Item c(o o2) {
        List<Item> list = s.a(WeaponStyle.RANGE);
        ItemManager itemManager = Static.getItemManager();
        double d2 = 0.0;
        Item item2 = null;
        Iterator<Item> var37 = list.iterator();
        while (s.llIllIlIllIlll(var37.hasNext() ? 1 : 0)) {
            double var19;
            void var11;
            o var54;
            Item var31 = var37.next();
            List<Object> var81 = s.aW();
            int[] nArray = new int[lIlIIlllIIII[2]];
            nArray[s.lIlIIlllIIII[0]] = lIlIIlllIIII[3];
            NPC var49 = NPCs.getNearest((int[])nArray);
            if (s.llIllIlIlllIIl((Object)o.MUTTADILE, (Object)var54) && s.llIllIlIllIlIl(var49)) {
                var81 = var81.stream().filter(item -> item.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[12]])).collect(Collectors.toList());
                0;
                if (((0xF ^ 0x15 ^ (0x46 ^ 0x10)) & (44 + 207 - 42 + 13 ^ 34 + 32 - -35 + 45 ^ -1)) != ((0x32 ^ 0 ^ (0x52 ^ 0x46)) & (0xFC ^ 0x8B ^ (0xC6 ^ 0x97) ^ -1))) {
                    return null;
                }
            } else {
                var81 = var81.stream().filter(item -> {
                    int n2;
                    if (!s.llIllIlIllIllI(item.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[10]]) ? 1 : 0) || s.llIllIlIllIlll(item.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[11]]) ? 1 : 0)) {
                        n2 = lIlIIlllIIII[2];
                        0;
                        if (2 != 2) {
                            return false;
                        }
                    } else {
                        n2 = lIlIIlllIIII[0];
                    }
                    return n2 != 0;
                }).collect(Collectors.toList());
            }
            if (s.llIllIlIllIllI(var81.isEmpty() ? 1 : 0)) {
                return (Item)var81.get(lIlIIlllIIII[0]);
            }
            ItemEquipmentStats var75 = var11.getItemStats(var31.getId(), lIlIIlllIIII[0]).getEquipment();
            double var41 = r.a(var75.getRstr(), 1.0, var75.getArange(), 1.0, var54.aO().getDefenceLevel(), var54.aO().getRangeDef(), var75.getAspeed());
            if (s.llIllIlllIllII(s.llIllIlllIlllI(var41, var19))) {
                Item lllllllllllllllIllIlIlIllIllIlll = var31;
                var19 = var41;
            }
            0;
            
            return null;
        }
        return item2;
    }

    private static boolean llIllIlIllIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static int llIllIllllIIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    public static int[] a(int[] nArray, int[] nArray2) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.addAll(s.a(nArray));
        0;
        hashSet.addAll(s.a(nArray2));
        0;
        return hashSet.stream().mapToInt(Integer::intValue).toArray();
    }

    private static boolean llIllIllllIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static String llIllIlIlIllll(String var61, String var38) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var38.getBytes(StandardCharsets.UTF_8)), lIlIIlllIIII[10]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lIlIIlllIIII[7], var5);
            return new String(var15.doFinal(Base64.getDecoder().decode(var61.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var40) {
            var40.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static Item bd() {
        o o2 = o.OLM_HEAD;
        List<Item> list = s.a(WeaponStyle.RANGE);
        ItemManager itemManager = Static.getItemManager();
        double d2 = 0.0;
        Item item2 = null;
        Iterator<Item> var87 = list.iterator();
        while (s.llIllIlIllIlll(var87.hasNext() ? 1 : 0)) {
            double var86;
            void var33;
            void var39;
            Item var16 = var87.next();
            if (s.llIllIlIllIlll(var16.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[7]]) ? 1 : 0)) {
                0;
                if (((0xF7 ^ 0xB4 ^ (0x29 ^ 0x7E)) & (5 ^ 0x41 ^ (0x50 ^ 0) ^ -1)) >= 0) continue;
                return null;
            }
            List<Object> var85 = s.aW();
            if (s.llIllIlIllIlll((var85 = var85.stream().filter(item -> {
                int n2;
                if (!s.llIllIlIllIllI(item.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[5]]) ? 1 : 0) || s.llIllIlIllIlll(item.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[4]]) ? 1 : 0)) {
                    n2 = lIlIIlllIIII[2];
                    0;
                    if (-1 > 0) {
                        return ((0x9D ^ 0x8F ^ (0x26 ^ 0x7A)) & (0x2B ^ 0x25 ^ (0x52 ^ 0x12) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIlIIlllIIII[0];
                }
                return n2 != 0;
            }).collect(Collectors.toList())).size())) {
                return (Item)var85.get(lIlIIlllIIII[0]);
            }
            ItemEquipmentStats var94 = var39.getItemStats(var16.getId(), lIlIIlllIIII[0]).getEquipment();
            double var104 = r.a(var94.getRstr(), 1.0, var94.getArange(), 1.0, var33.aO().getDefenceLevel(), var33.aO().getRangeDef(), var94.getAspeed());
            if (s.llIllIlllIllII(s.llIllIllllIIll(var104, var86))) {
                Item lllllllllllllllIllIlIlIlIllIIIII = var16;
                var86 = var104;
            }
            0;
            if ((0xF9 ^ 0x9A ^ (1 ^ 0x66)) >= (0x5A ^ 0x10 ^ (0x2A ^ 0x64))) continue;
            return null;
        }
        return item2;
    }

    public static List<Item> aW() {
        ItemManager itemManager = Static.getItemManager();
        Item item2 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        List<Item> list = Inventory.getAll().stream().filter(item -> {
            int n2;
            ItemStats itemStats = itemManager.getItemStats(item.getId(), lIlIIlllIIII[0]);
            if (s.llIllIlIllIlIl(itemStats) && s.llIllIlIllIlIl(itemStats.getEquipment()) && s.llIllIlIlllIII(itemStats.getEquipment().getSlot(), EquipmentInventorySlot.WEAPON.getSlotIdx())) {
                n2 = lIlIIlllIIII[2];
                0;
                if (((0x59 ^ 0x61 ^ (0x26 ^ 0x56)) & (0x2F ^ 0x29 ^ (0xDC ^ 0x92) ^ -1)) > (0x64 ^ 0x40 ^ (0xA4 ^ 0x84))) {
                    return ((0xD2 ^ 0x9B ^ (0x36 ^ 0x56)) & (0x79 ^ 0x36 ^ (0x26 ^ 0x40) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIIlllIIII[0];
            }
            return n2 != 0;
        }).collect(Collectors.toList());
        if (s.llIllIlIllIlIl(item2)) {
            list.add(item2);
            0;
        }
        return list;
    }

    private static int llIllIlllIllll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static void llIllIlIllIIlI() {
        lIlIIllIllll = new String[lIlIIlllIIII[1]];
        s.lIlIIllIllll[s.lIlIIlllIIII[0]] = s."Osmumten";
        s.lIlIIllIllll[s.lIlIIlllIIII[2]] = s."saeldor";
        s.lIlIIllIllll[s.lIlIIlllIIII[7]] = s."blowpipe";
        s.lIlIIllIllll[s.lIlIIlllIIII[5]] = s."twisted bow";
        s.lIlIIllIllll[s.lIlIIlllIIII[4]] = s."faerdhinen";
        s.lIlIIllIllll[s.lIlIIlllIIII[6]] = s."bandos godsword";
        s.lIlIIllIllll[s.lIlIIlllIIII[8]] = s."dragon warhammer";
        s.lIlIIllIllll[s.lIlIIlllIIII[9]] = s."elder maul";
        s.lIlIIllIllll[s.lIlIIlllIIII[10]] = s."twisted bow";
        s.lIlIIllIllll[s.lIlIIlllIIII[11]] = s."faerdhinen";
        s.lIlIIllIllll[s.lIlIIlllIIII[12]] = s."faerdhinen";
        s.lIlIIllIllll[s.lIlIIlllIIII[13]] = s."twisted bow";
        s.lIlIIllIllll[s.lIlIIlllIIII[14]] = s."faerdhinen";
        s.lIlIIllIllll[s.lIlIIlllIIII[15]] = s."pickaxe";
    }

    public static EquipmentSetup ba() {
        return s.b(s.a(s.b(o.OLM_RIGHT_HAND), s.aT()));
    }

    private static boolean llIllIlIlllIII(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public static Item a(o o2) {
        List<Item> list = s.a(WeaponStyle.MELEE);
        ItemManager itemManager = Static.getItemManager();
        double d2 = 0.0;
        Item item = null;
        Iterator<Item> var76 = list.iterator();
        while (s.llIllIlIllIlll(var76.hasNext() ? 1 : 0)) {
            double var58;
            void var78;
            o var74;
            Item var47 = var76.next();
            if (s.llIllIlIlllIIl((Object)var74, (Object)o.TEKTON) && s.llIllIlIllIlll(var47.getName().contains(lIlIIllIllll[lIlIIlllIIII[0]]) ? 1 : 0)) {
                return var47;
            }
            ItemEquipmentStats var69 = var78.getItemStats(var47.getId(), lIlIIlllIIII[0]).getEquipment();
            double var97 = r.a(var69.getStr(), 1.0, var69.getAcrush(), 1.0, var74.aO().getDefenceLevel(), var74.aO().getCrushDef(), var69.getAspeed());
            if (s.llIllIlllIllII(s.llIllIlllIlIll(var97, var58))) {
                Item lllllllllllllllIllIlIlIlllIlIIIl = var47;
                var58 = var97;
            }
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return item;
    }

    private static boolean llIllIlIlllIIl(Object object, Object object2) {
        return object == object2;
    }

    private static String llIllIlIllIIIl(String var93, String var70) {
        try {
            SecretKeySpec var35 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var70.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIlIIlllIIII[7], var35);
            return new String(var7.doFinal(Base64.getDecoder().decode(var93.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var59) {
            var59.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static int[] aU() {
        void var90;
        Item var32;
        void var34;
        int var26;
        ItemManager itemManager = Static.getItemManager();
        int[] nArray = new int[lIlIIlllIIII[1]];
        int[] nArray2 = Inventory.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray3 = Equipment.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray4 = s.a(nArray2, nArray3);
        EquipmentInventorySlot[] equipmentInventorySlotArray = EquipmentInventorySlot.values();
        int n2 = equipmentInventorySlotArray.length;
        int var99 = lIlIIlllIIII[0];
        while (s.llIllIlIllIlII(var99, var26)) {
            int n3;
            void var21 = var34[var99];
            var32 = Equipment.fromSlot((EquipmentInventorySlot)var21);
            int n4 = var21.getSlotIdx();
            if (s.llIllIlIllIlIl(var32)) {
                n3 = var32.getId();
                0;
                if (-2 > 0) {
                    return null;
                }
            } else {
                n3 = lIlIIlllIIII[0];
            }
            var102[n4] = n3;
            ++var99;
            0;
            if (((0xF ^ 0x3F) & ~(0x68 ^ 0x58)) == 0) continue;
            return null;
        }
        var34 = var90;
        var26 = ((void)var34).length;
        var99 = lIlIIlllIIII[0];
        while (s.llIllIlIllIlII(var99, var26)) {
            void var30;
            void var21 = var34[var99];
            var32 = var30.getItemStats((int)var21, lIlIIlllIIII[0]);
            if (s.llIllIlIllIlIl(var32) && s.llIllIlIllIlll(var32.isEquipable() ? 1 : 0)) {
                if (s.llIllIlIlllIII(var32.getEquipment().getSlot(), EquipmentInventorySlot.WEAPON.getSlotIdx())) {
                    0;
                    if (3 <= 2) {
                        return null;
                    }
                } else {
                    void var102;
                    int var82 = var32.getEquipment().getSlot();
                    if (s.llIllIlIllIllI((int)var102[var82])) {
                        var102[var82] = var21;
                        0;
                        if ((((0x1E ^ 0x48) & ~(0x45 ^ 0x13) ^ (0x39 ^ 0xF)) & ((0xA4 ^ 0x84) & ~(0xB3 ^ 0x93) ^ (0x7A ^ 0x4C) ^ -1)) < 0) {
                            return null;
                        }
                    } else {
                        ItemStats var105 = var30.getItemStats((int)var102[var82], lIlIIlllIIII[0]);
                        if (s.llIllIlIllIlII(var105.getEquipment().getStr(), var32.getEquipment().getStr())) {
                            var102[var82] = var21;
                        }
                    }
                }
            }
            ++var99;
            0;
            if (((0x1A ^ 0x22) & ~(0xA2 ^ 0x9A)) == 0) continue;
            return null;
        }
        return nArray;
    }

    private static int llIllIllllIIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    /*
     * WARNING - void declaration
     */
    private static List<Integer> a(int[] nArray) {
        void var89;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int var22 = lIlIIlllIIII[0];
        while (s.llIllIlIllIlII(var22, (int)var89)) {
            void var24;
            void var36;
            void var52 = var36[var22];
            var24.add((int)var52);
            0;
            ++var22;
            0;
            if (1 != 3) continue;
            return null;
        }
        return arrayList;
    }

    public static int[] e(N n2) {
        switch (t.bD[n2.ordinal()]) {
            case 1: {
                Item var65 = s.a(o.TEKTON);
                return s.a(var65, s.aU());
            }
            case 2: {
                return s.a(s.aX(), s.aU());
            }
            case 3: {
                Item var65 = s.c(o.MUTTADILE);
                return s.a(var65, s.aS());
            }
            case 4: {
                int[] var28;
                Item var65 = s.b(o.ABYSSAL_PORTAL);
                WeaponStyle var71 = WeaponMap.StyleMap.getOrDefault(var65.getId(), WeaponStyle.RANGE);
                if (s.llIllIlIlllIIl(var71, WeaponStyle.RANGE)) {
                    var28 = s.aS();
                    0;
                    if (3 <= 2) {
                        return null;
                    }
                } else {
                    var28 = s.aT();
                }
                return s.a(var65, var28);
            }
            case 5: {
                int[] var28;
                Item var65 = s.b(o.ICE_DEMON);
                WeaponStyle var71 = WeaponMap.StyleMap.getOrDefault(var65.getId(), WeaponStyle.RANGE);
                if (s.llIllIlIlllIIl(var71, WeaponStyle.RANGE)) {
                    var28 = s.aS();
                    0;
                    if (-1 == ((0xD8 ^ 0xAA ^ (4 ^ 0x7A)) & (0x9C ^ 0x95 ^ (0x3E ^ 0x3B) ^ -1))) {
                        return null;
                    }
                } else {
                    var28 = s.aT();
                }
                return s.a(var65, var28);
            }
            case 6: {
                int var20 = aG.dk();
                if (s.llIllIlIlllIII(var20, lIlIIlllIIII[5])) {
                    return s.a(s.d(o.VASA_CRYSTAL), s.aU());
                }
                return s.a(s.c(o.VASA), s.aS());
            }
            case 7: {
                return s.a(s.c(o.ABYSSAL_PORTAL), s.aS());
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static Item e(o o2) {
        List<Item> list = s.a(WeaponStyle.MELEE);
        ItemManager itemManager = Static.getItemManager();
        double d2 = 0.0;
        Item item = null;
        Iterator<Item> var66 = list.iterator();
        while (s.llIllIlIllIlll(var66.hasNext() ? 1 : 0)) {
            double var27;
            o var101;
            void var106;
            Item var63 = var66.next();
            ItemEquipmentStats var18 = var106.getItemStats(var63.getId(), lIlIIlllIIII[0]).getEquipment();
            if (s.llIllIllllIIIl(var18.getAspeed(), lIlIIlllIIII[4])) {
                0;
                if (3 > -1) continue;
                return null;
            }
            int var95 = Math.max(var18.getAstab(), Math.max(var18.getAcrush(), var18.getAslash()));
            double var57 = r.a(var18.getStr(), 1.0, var95, 1.0, var101.aO().getDefenceLevel(), var101.aO().getStabDef(), var18.getAspeed());
            if (s.llIllIlllIllII(s.llIllIllllIIII(var57, var27))) {
                Item lllllllllllllllIllIlIlIllIIlIIII = var63;
                var27 = var57;
            }
            0;
            if (-(0x45 ^ 0 ^ (0x37 ^ 0x77)) < 0) continue;
            return null;
        }
        return item;
    }

    private static int llIllIlllIlIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    static {
        s.llIllIlIllIIll();
        s.llIllIlIllIIlI();
    }

    private static int llIllIlllIlllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    /*
     * WARNING - void declaration
     */
    public static Item b(o o2) {
        void var6;
        List<Item> list = s.a(WeaponStyle.MAGIC);
        if (!s.llIllIlllIllIl((Object)o2, (Object)o.ABYSSAL_PORTAL) || s.llIllIlIlllIIl((Object)o2, (Object)o.ICE_DEMON)) {
            List<Object> var67 = s.aW();
            if (s.llIllIlIllIlll((var67 = var67.stream().filter(item -> {
                int n2;
                if (!s.llIllIlIllIllI(item.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[13]]) ? 1 : 0) || s.llIllIlIllIlll(item.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[14]]) ? 1 : 0)) {
                    n2 = lIlIIlllIIII[2];
                    0;
                    if (-1 == 1) {
                        return ((102 + 51 - 152 + 236 ^ 156 + 8 - 82 + 84) & (0x4E ^ 0x3F ^ (0x8B ^ 0xB1) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIlIIlllIIII[0];
                }
                return n2 != 0;
            }).collect(Collectors.toList())).size())) {
                return (Item)var67.get(lIlIIlllIIII[0]);
            }
        }
        if (s.llIllIlllIllII(var6.size())) {
            return (Item)var6.get(lIlIIlllIIII[0]);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static EquipmentSetup b(int[] nArray) {
        void var1_1;
        int[] var80;
        if (s.llIllIllllIIlI(nArray)) {
            return null;
        }
        int[] var53 = new int[lIlIIlllIIII[1]];
        int var98 = lIlIIlllIIII[0];
        while (s.llIllIlIllIlII(var98, var80.length)) {
            if (s.llIllIlIllIllI(var80[var98])) {
                var53[var98] = lIlIIlllIIII[0];
                0;
                if (-1 >= 3) {
                    return null;
                }
            } else {
                var53[var98] = lIlIIlllIIII[2];
            }
            ++var98;
            0;
            if (3 >= 1) continue;
            return null;
        }
        return new EquipmentSetup(nArray, (int[])var1_1, new String[lIlIIlllIIII[1]]);
    }

    private static boolean llIllIllllIIlI(Object object) {
        return object == null;
    }

    private static void llIllIlIllIIll() {
        lIlIIlllIIII = new int[16];
        s.lIlIIlllIIII[0] = (0x2B ^ 0x33) & ~(0xB6 ^ 0xAE);
        s.lIlIIlllIIII[1] = 0x86 ^ 0x88;
        s.lIlIIlllIIII[2] = 1;
        s.lIlIIlllIIII[3] = 0xFFFFFFFE & 0x1D8B;
        s.lIlIIlllIIII[4] = 0xD0 ^ 0xB5 ^ (0x76 ^ 0x17);
        s.lIlIIlllIIII[5] = 3;
        s.lIlIIlllIIII[6] = 0x17 ^ 0x12;
        s.lIlIIlllIIII[7] = 2;
        s.lIlIIlllIIII[8] = 0x38 ^ 0x3E;
        s.lIlIIlllIIII[9] = 0x37 ^ 0x30;
        s.lIlIIlllIIII[10] = 0x98 ^ 0x90;
        s.lIlIIlllIIII[11] = 0x51 ^ 0x58;
        s.lIlIIlllIIII[12] = 0xD ^ 7;
        s.lIlIIlllIIII[13] = 37 + 130 - 84 + 66 ^ 86 + 15 - -11 + 46;
        s.lIlIIlllIIII[14] = 14 + 19 - -83 + 36 ^ 27 + 132 - 138 + 127;
        s.lIlIIlllIIII[15] = 0x21 ^ 0x3A ^ (0x7F ^ 0x69);
    }

    public static EquipmentSetup bc() {
        return s.b(s.a(s.bd(), s.aS()));
    }

    /*
     * WARNING - void declaration
     */
    public static List<Item> a(WeaponStyle weaponStyle, o o2) {
        ItemManager itemManager = Static.getItemManager();
        List<Item> list = s.a(weaponStyle);
        int n2 = lIlIIlllIIII[0];
        int n3 = lIlIIlllIIII[0];
        Iterator<Item> var10 = list.iterator();
        while (s.llIllIlIllIlll(var10.hasNext() ? 1 : 0)) {
            WeaponStyle var9;
            void var46;
            Item var48 = var10.next();
            ItemEquipmentStats lllllllllllllllIllIlIlIlllIlllll = var46.getItemStats(var48.getId(), lIlIIlllIIII[0]).getEquipment();
            if (s.llIllIlIlllIIl(var9, WeaponStyle.MELEE)) {
                // empty if block
            }
            0;
            if ((0x11 ^ 0x15) != 0) continue;
            return null;
        }
        return null;
    }

    public static EquipmentSetup bb() {
        Item item = s.e(o.OLM_LEFT_HAND);
        return s.b(s.a(item, s.aU()));
    }

    private static boolean llIllIlIllIlll(int n2) {
        return n2 != 0;
    }

    public static int[] aZ() {
        Item item = s.aY();
        if (s.llIllIllllIIlI(item)) {
            return null;
        }
        return s.a(item, s.aU());
    }

    /*
     * WARNING - void declaration
     */
    public static int[] aT() {
        void var42;
        Item var45;
        void var2;
        int var25;
        ItemManager itemManager = Static.getItemManager();
        int[] nArray = new int[lIlIIlllIIII[1]];
        int[] nArray2 = Inventory.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray3 = Equipment.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray4 = s.a(nArray2, nArray3);
        EquipmentInventorySlot[] equipmentInventorySlotArray = EquipmentInventorySlot.values();
        int n2 = equipmentInventorySlotArray.length;
        int var79 = lIlIIlllIIII[0];
        while (s.llIllIlIllIlII(var79, var25)) {
            int n3;
            void var29 = var2[var79];
            var45 = Equipment.fromSlot((EquipmentInventorySlot)var29);
            int n4 = var29.getSlotIdx();
            if (s.llIllIlIllIlIl(var45)) {
                n3 = var45.getId();
                0;
                if (-1 > 3) {
                    return null;
                }
            } else {
                n3 = lIlIIlllIIII[0];
            }
            var91[n4] = n3;
            ++var79;
            0;
            if (3 >= ((0x62 ^ 0x23 ^ (2 ^ 0x6F)) & (0x5D ^ 0x70 ^ 1 ^ -1))) continue;
            return null;
        }
        var2 = var42;
        var25 = ((void)var2).length;
        var79 = lIlIIlllIIII[0];
        while (s.llIllIlIllIlII(var79, var25)) {
            void var77;
            void var29 = var2[var79];
            var45 = var77.getItemStats((int)var29, lIlIIlllIIII[0]);
            if (s.llIllIlIllIlIl(var45)) {
                if (s.llIllIlIllIllI(var45.isEquipable() ? 1 : 0)) {
                    0;
                    if (((0x13 ^ 0x4E) & ~(0xFC ^ 0xA1)) != ((0x5F ^ 0x72) & ~(0x6B ^ 0x46))) {
                        return null;
                    }
                } else {
                    void var91;
                    int var50 = var45.getEquipment().getSlot();
                    if (s.llIllIlIllIllI((int)var91[var50])) {
                        var91[var50] = var29;
                        0;
                        
                        }
                    } else {
                        ItemStats var43 = var77.getItemStats((int)var91[var50], lIlIIlllIIII[0]);
                        if (s.llIllIlIllIlII(var43.getEquipment().getMdmg(), var45.getEquipment().getMdmg())) {
                            var91[var50] = var29;
                            0;
                            if (3 < 3) {
                                return null;
                            }
                        } else if (s.llIllIlIllIlII(var43.getEquipment().getAmagic(), var45.getEquipment().getAmagic())) {
                            var91[var50] = var29;
                        }
                    }
                }
            }
            ++var79;
            0;
            if (1 > -1) continue;
            return null;
        }
        return nArray;
    }

    public static int[] aV() {
        int[] nArray = s.aS();
        return new int[lIlIIlllIIII[0]];
    }

    private static boolean llIllIlllIllII(int n2) {
        return n2 > 0;
    }

    public static Item aY() {
        List list = s.aW().stream().filter(item -> {
            int n2;
            if (!s.llIllIlIllIllI(item.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[6]]) ? 1 : 0) || !s.llIllIlIllIllI(item.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[8]]) ? 1 : 0) || s.llIllIlIllIlll(item.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[9]]) ? 1 : 0)) {
                n2 = lIlIIlllIIII[2];
                0;
                
                }
            } else {
                n2 = lIlIIlllIIII[0];
            }
            return n2 != 0;
        }).collect(Collectors.toList());
        if (s.llIllIlIllIllI(list.size())) {
            return null;
        }
        return (Item)list.get(lIlIIlllIIII[0]);
    }

    /*
     * WARNING - void declaration
     */
    public static Item d(o o2) {
        List<Item> list = s.a(WeaponStyle.MELEE);
        ItemManager itemManager = Static.getItemManager();
        double d2 = 0.0;
        Item item = null;
        Iterator<Item> var17 = list.iterator();
        while (s.llIllIlIllIlll(var17.hasNext() ? 1 : 0)) {
            double var64;
            o var23;
            void var88;
            Item var1 = var17.next();
            if (s.llIllIlIllIlIl(var1) && s.llIllIlIllIlll(var1.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[2]]) ? 1 : 0)) {
                0;
                if (((0x79 ^ 0x38 ^ (0xF7 ^ 0x8E)) & (89 + 120 - 83 + 24 ^ 111 + 12 - 17 + 68 ^ -1)) != 3) continue;
                return null;
            }
            ItemEquipmentStats var12 = var88.getItemStats(var1.getId(), lIlIIlllIIII[0]).getEquipment();
            double var92 = r.a(var12.getStr(), 1.0, var12.getAstab(), 1.0, var23.aO().getDefenceLevel(), var23.aO().getStabDef(), var12.getAspeed());
            if (s.llIllIlllIllII(s.llIllIlllIllll(var92, var64))) {
                Item lllllllllllllllIllIlIlIllIlIIIll = var1;
                var64 = var92;
            }
            0;
            if ((0x93 ^ 0x81 ^ (0x63 ^ 0x75)) != 0) continue;
            return null;
        }
        return item;
    }

    public static List<Item> a(WeaponStyle weaponStyle) {
        ItemManager itemManager = Static.getItemManager();
        List<Item> list = s.aW();
        return list.stream().filter(item -> {
            boolean bl2;
            if (s.llIllIlIlllIIl(WeaponMap.StyleMap.get(item.getId()), weaponStyle)) {
                bl2 = lIlIIlllIIII[2];
                0;
                if (3 >= (0xC6 ^ 0xC2)) {
                    return false;
                }
            } else {
                bl2 = lIlIIlllIIII[0];
            }
            return bl2;
        }).collect(Collectors.toList());
    }

    private static boolean llIllIlIllIllI(int n2) {
        return n2 == 0;
    }

    public static int[] a(Item item, int[] nArray) {
        ItemManager itemManager = Static.getItemManager();
        ItemEquipmentStats itemEquipmentStats = itemManager.getItemStats(item.getId(), lIlIIlllIIII[0]).getEquipment();
        if (s.llIllIlIllIlll(itemEquipmentStats.isTwoHanded() ? 1 : 0)) {
            nArray[s.lIlIIlllIIII[6]] = lIlIIlllIIII[0];
        }
        nArray[s.lIlIIlllIIII[5]] = item.getId();
        return nArray;
    }

    private static String llIllIlIllIIII(String var83, String var103) {
        var83 = new String(Base64.getDecoder().decode(var83.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var60 = new StringBuilder();
        char[] var55 = var103.toCharArray();
        int var44 = lIlIIlllIIII[0];
        char[] var73 = var83.toCharArray();
        int var14 = var73.length;
        int var84 = lIlIIlllIIII[0];
        while (s.llIllIlIllIlII(var84, var14)) {
            char var72 = var73[var84];
            var60.append((char)(var72 ^ var55[var44 % var55.length]));
            0;
            ++var44;
            ++var84;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var60);
    }

    private static boolean llIllIlllIllIl(Object object, Object object2) {
        return object != object2;
    }

    public static Item aX() {
        ItemManager itemManager = Static.getItemManager();
        List<Item> list = s.aW();
        return (Item)list.stream().filter(item -> item.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[15]])).collect(Collectors.toList()).get(lIlIIlllIIII[0]);
    }

    /*
     * WARNING - void declaration
     */
    public static int[] aS() {
        void var68;
        Item var8;
        void var51;
        int var96;
        ItemManager itemManager = Static.getItemManager();
        int[] nArray = new int[lIlIIlllIIII[1]];
        int[] nArray2 = Inventory.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray3 = Equipment.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray4 = s.a(nArray2, nArray3);
        EquipmentInventorySlot[] equipmentInventorySlotArray = EquipmentInventorySlot.values();
        int n2 = equipmentInventorySlotArray.length;
        int var3 = lIlIIlllIIII[0];
        while (s.llIllIlIllIlII(var3, var96)) {
            int n3;
            void var13 = var51[var3];
            var8 = Equipment.fromSlot((EquipmentInventorySlot)var13);
            int n4 = var13.getSlotIdx();
            if (s.llIllIlIllIlIl(var8)) {
                n3 = var8.getId();
                0;
                if (1 == 0) {
                    return null;
                }
            } else {
                n3 = lIlIIlllIIII[0];
            }
            var56[n4] = n3;
            ++var3;
            0;
            if ((67 + 21 - -42 + 15 ^ 69 + 105 - 94 + 68) > 0) continue;
            return null;
        }
        var51 = var68;
        var96 = ((void)var51).length;
        var3 = lIlIIlllIIII[0];
        while (s.llIllIlIllIlII(var3, var96)) {
            void var62;
            void var13 = var51[var3];
            var8 = var62.getItemStats((int)var13, lIlIIlllIIII[0]);
            if (s.llIllIlIllIlIl(var8)) {
                if (s.llIllIlIllIllI(var8.isEquipable() ? 1 : 0)) {
                    0;
                    if (1 < (3 & ~3)) {
                        return null;
                    }
                } else {
                    ItemStats var100;
                    void var56;
                    int var4 = var8.getEquipment().getSlot();
                    if (s.llIllIlIllIllI((int)var56[var4])) {
                        var56[var4] = var13;
                    }
                    if (s.llIllIlIllIlII((var100 = var62.getItemStats((int)var56[var4], lIlIIlllIIII[0])).getEquipment().getRstr(), var8.getEquipment().getRstr())) {
                        var56[var4] = var13;
                        0;
                        if (((0x16 ^ 0x3F ^ (0x1C ^ 8)) & (49 + 116 - 94 + 108 ^ 106 + 107 - 172 + 101 ^ -1)) != 0) {
                            return null;
                        }
                    } else if (s.llIllIlIllIlII(var100.getEquipment().getArange(), var8.getEquipment().getArange())) {
                        var56[var4] = var13;
                    }
                }
            }
            ++var3;
            0;
            
            return null;
        }
        return nArray;
    }

    private static boolean llIllIlIllIlIl(Object object) {
        return object != null;
    }
}

