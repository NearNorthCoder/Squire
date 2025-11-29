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

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aG;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.o;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.r;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.t;
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

public class s {
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
        Iterator<Item> lllllllllllllllIllIlIlIllIllIllI = list.iterator();
        while (s.llIllIlIllIlll(lllllllllllllllIllIlIlIllIllIllI.hasNext() ? 1 : 0)) {
            double lllllllllllllllIllIlIlIllIlllIII;
            void lllllllllllllllIllIlIlIllIlllIIl;
            o lllllllllllllllIllIlIlIllIlllIll;
            Item lllllllllllllllIllIlIlIllIllIlIl = lllllllllllllllIllIlIlIllIllIllI.next();
            List<Object> lllllllllllllllIllIlIlIllIllIlII = s.aW();
            int[] nArray = new int[lIlIIlllIIII[2]];
            nArray[s.lIlIIlllIIII[0]] = lIlIIlllIIII[3];
            NPC lllllllllllllllIllIlIlIllIllIIll = NPCs.getNearest((int[])nArray);
            if (s.llIllIlIlllIIl((Object)o.MUTTADILE, (Object)lllllllllllllllIllIlIlIllIlllIll) && s.llIllIlIllIlIl(lllllllllllllllIllIlIlIllIllIIll)) {
                lllllllllllllllIllIlIlIllIllIlII = lllllllllllllllIllIlIlIllIllIlII.stream().filter(item -> item.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[12]])).collect(Collectors.toList());
                0;
                if (((0xF ^ 0x15 ^ (0x46 ^ 0x10)) & (44 + 207 - 42 + 13 ^ 34 + 32 - -35 + 45 ^ -1)) != ((0x32 ^ 0 ^ (0x52 ^ 0x46)) & (0xFC ^ 0x8B ^ (0xC6 ^ 0x97) ^ -1))) {
                    return null;
                }
            } else {
                lllllllllllllllIllIlIlIllIllIlII = lllllllllllllllIllIlIlIllIllIlII.stream().filter(item -> {
                    int n2;
                    if (!s.llIllIlIllIllI(item.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[10]]) ? 1 : 0) || s.llIllIlIllIlll(item.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[11]]) ? 1 : 0)) {
                        n2 = lIlIIlllIIII[2];
                        0;
                        if (2 != 2) {
                            return ((0xEB ^ 0xB7) & ~(0x55 ^ 9)) != 0;
                        }
                    } else {
                        n2 = lIlIIlllIIII[0];
                    }
                    return n2 != 0;
                }).collect(Collectors.toList());
            }
            if (s.llIllIlIllIllI(lllllllllllllllIllIlIlIllIllIlII.isEmpty() ? 1 : 0)) {
                return (Item)lllllllllllllllIllIlIlIllIllIlII.get(lIlIIlllIIII[0]);
            }
            ItemEquipmentStats lllllllllllllllIllIlIlIllIllIIlI = lllllllllllllllIllIlIlIllIlllIIl.getItemStats(lllllllllllllllIllIlIlIllIllIlIl.getId(), lIlIIlllIIII[0]).getEquipment();
            double lllllllllllllllIllIlIlIllIllIIIl = r.a(lllllllllllllllIllIlIlIllIllIIlI.getRstr(), 1.0, lllllllllllllllIllIlIlIllIllIIlI.getArange(), 1.0, lllllllllllllllIllIlIlIllIlllIll.aO().getDefenceLevel(), lllllllllllllllIllIlIlIllIlllIll.aO().getRangeDef(), lllllllllllllllIllIlIlIllIllIIlI.getAspeed());
            if (s.llIllIlllIllII(s.llIllIlllIlllI(lllllllllllllllIllIlIlIllIllIIIl, lllllllllllllllIllIlIlIllIlllIII))) {
                Item lllllllllllllllIllIlIlIllIllIlll = lllllllllllllllIllIlIlIllIllIlIl;
                lllllllllllllllIllIlIlIllIlllIII = lllllllllllllllIllIlIlIllIllIIIl;
            }
            0;
            if (null == null) continue;
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

    private static String llIllIlIlIllll(String lllllllllllllllIllIlIlIlIIllIlII, String lllllllllllllllIllIlIlIlIIllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIllIlIlIlIIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIlIlIIllIIIl.getBytes(StandardCharsets.UTF_8)), lIlIIlllIIII[10]), "DES");
            Cipher lllllllllllllllIllIlIlIlIIllIllI = Cipher.getInstance("DES");
            lllllllllllllllIllIlIlIlIIllIllI.init(lIlIIlllIIII[7], lllllllllllllllIllIlIlIlIIllIlll);
            return new String(lllllllllllllllIllIlIlIlIIllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIlIlIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlIlIlIIllIlIl) {
            lllllllllllllllIllIlIlIlIIllIlIl.printStackTrace();
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
        Iterator<Item> lllllllllllllllIllIlIlIlIlIlllll = list.iterator();
        while (s.llIllIlIllIlll(lllllllllllllllIllIlIlIlIlIlllll.hasNext() ? 1 : 0)) {
            double lllllllllllllllIllIlIlIlIllIIIIl;
            void lllllllllllllllIllIlIlIlIllIIlII;
            void lllllllllllllllIllIlIlIlIllIIIlI;
            Item lllllllllllllllIllIlIlIlIlIllllI = lllllllllllllllIllIlIlIlIlIlllll.next();
            if (s.llIllIlIllIlll(lllllllllllllllIllIlIlIlIlIllllI.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[7]]) ? 1 : 0)) {
                0;
                if (((0xF7 ^ 0xB4 ^ (0x29 ^ 0x7E)) & (5 ^ 0x41 ^ (0x50 ^ 0) ^ -1)) >= 0) continue;
                return null;
            }
            List<Object> lllllllllllllllIllIlIlIlIlIlllIl = s.aW();
            if (s.llIllIlIllIlll((lllllllllllllllIllIlIlIlIlIlllIl = lllllllllllllllIllIlIlIlIlIlllIl.stream().filter(item -> {
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
                return (Item)lllllllllllllllIllIlIlIlIlIlllIl.get(lIlIIlllIIII[0]);
            }
            ItemEquipmentStats lllllllllllllllIllIlIlIlIlIlllII = lllllllllllllllIllIlIlIlIllIIIlI.getItemStats(lllllllllllllllIllIlIlIlIlIllllI.getId(), lIlIIlllIIII[0]).getEquipment();
            double lllllllllllllllIllIlIlIlIlIllIll = r.a(lllllllllllllllIllIlIlIlIlIlllII.getRstr(), 1.0, lllllllllllllllIllIlIlIlIlIlllII.getArange(), 1.0, lllllllllllllllIllIlIlIlIllIIlII.aO().getDefenceLevel(), lllllllllllllllIllIlIlIlIllIIlII.aO().getRangeDef(), lllllllllllllllIllIlIlIlIlIlllII.getAspeed());
            if (s.llIllIlllIllII(s.llIllIllllIIll(lllllllllllllllIllIlIlIlIlIllIll, lllllllllllllllIllIlIlIlIllIIIIl))) {
                Item lllllllllllllllIllIlIlIlIllIIIII = lllllllllllllllIllIlIlIlIlIllllI;
                lllllllllllllllIllIlIlIlIllIIIIl = lllllllllllllllIllIlIlIlIlIllIll;
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
        Iterator<Item> lllllllllllllllIllIlIlIlllIlIIII = list.iterator();
        while (s.llIllIlIllIlll(lllllllllllllllIllIlIlIlllIlIIII.hasNext() ? 1 : 0)) {
            double lllllllllllllllIllIlIlIlllIlIIlI;
            void lllllllllllllllIllIlIlIlllIlIIll;
            o lllllllllllllllIllIlIlIlllIlIlIl;
            Item lllllllllllllllIllIlIlIlllIIllll = lllllllllllllllIllIlIlIlllIlIIII.next();
            if (s.llIllIlIlllIIl((Object)lllllllllllllllIllIlIlIlllIlIlIl, (Object)o.TEKTON) && s.llIllIlIllIlll(lllllllllllllllIllIlIlIlllIIllll.getName().contains(lIlIIllIllll[lIlIIlllIIII[0]]) ? 1 : 0)) {
                return lllllllllllllllIllIlIlIlllIIllll;
            }
            ItemEquipmentStats lllllllllllllllIllIlIlIlllIIlllI = lllllllllllllllIllIlIlIlllIlIIll.getItemStats(lllllllllllllllIllIlIlIlllIIllll.getId(), lIlIIlllIIII[0]).getEquipment();
            double lllllllllllllllIllIlIlIlllIIllIl = r.a(lllllllllllllllIllIlIlIlllIIlllI.getStr(), 1.0, lllllllllllllllIllIlIlIlllIIlllI.getAcrush(), 1.0, lllllllllllllllIllIlIlIlllIlIlIl.aO().getDefenceLevel(), lllllllllllllllIllIlIlIlllIlIlIl.aO().getCrushDef(), lllllllllllllllIllIlIlIlllIIlllI.getAspeed());
            if (s.llIllIlllIllII(s.llIllIlllIlIll(lllllllllllllllIllIlIlIlllIIllIl, lllllllllllllllIllIlIlIlllIlIIlI))) {
                Item lllllllllllllllIllIlIlIlllIlIIIl = lllllllllllllllIllIlIlIlllIIllll;
                lllllllllllllllIllIlIlIlllIlIIlI = lllllllllllllllIllIlIlIlllIIllIl;
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

    private static String llIllIlIllIIIl(String lllllllllllllllIllIlIlIlIIllllll, String lllllllllllllllIllIlIlIlIlIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIllIlIlIlIlIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIlIlIlIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlIlIlIlIIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlIlIlIlIIIIll.init(lIlIIlllIIII[7], lllllllllllllllIllIlIlIlIlIIIlII);
            return new String(lllllllllllllllIllIlIlIlIlIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIlIlIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlIlIlIlIIIIlI) {
            lllllllllllllllIllIlIlIlIlIIIIlI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static int[] aU() {
        void lllllllllllllllIllIlIlIlllllllII;
        Item lllllllllllllllIllIlIlIlllllIlll;
        void lllllllllllllllIllIlIlIllllllIll;
        int lllllllllllllllIllIlIlIllllllIlI;
        ItemManager itemManager = Static.getItemManager();
        int[] nArray = new int[lIlIIlllIIII[1]];
        int[] nArray2 = Inventory.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray3 = Equipment.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray4 = s.a(nArray2, nArray3);
        EquipmentInventorySlot[] equipmentInventorySlotArray = EquipmentInventorySlot.values();
        int n2 = equipmentInventorySlotArray.length;
        int lllllllllllllllIllIlIlIllllllIIl = lIlIIlllIIII[0];
        while (s.llIllIlIllIlII(lllllllllllllllIllIlIlIllllllIIl, lllllllllllllllIllIlIlIllllllIlI)) {
            int n3;
            void lllllllllllllllIllIlIlIllllllIII = lllllllllllllllIllIlIlIllllllIll[lllllllllllllllIllIlIlIllllllIIl];
            lllllllllllllllIllIlIlIlllllIlll = Equipment.fromSlot((EquipmentInventorySlot)lllllllllllllllIllIlIlIllllllIII);
            int n4 = lllllllllllllllIllIlIlIllllllIII.getSlotIdx();
            if (s.llIllIlIllIlIl(lllllllllllllllIllIlIlIlllllIlll)) {
                n3 = lllllllllllllllIllIlIlIlllllIlll.getId();
                0;
                if (-2 > 0) {
                    return null;
                }
            } else {
                n3 = lIlIIlllIIII[0];
            }
            lllllllllllllllIllIlIlIlllllllll[n4] = n3;
            ++lllllllllllllllIllIlIlIllllllIIl;
            0;
            if (((0xF ^ 0x3F) & ~(0x68 ^ 0x58)) == 0) continue;
            return null;
        }
        lllllllllllllllIllIlIlIllllllIll = lllllllllllllllIllIlIlIlllllllII;
        lllllllllllllllIllIlIlIllllllIlI = ((void)lllllllllllllllIllIlIlIllllllIll).length;
        lllllllllllllllIllIlIlIllllllIIl = lIlIIlllIIII[0];
        while (s.llIllIlIllIlII(lllllllllllllllIllIlIlIllllllIIl, lllllllllllllllIllIlIlIllllllIlI)) {
            void lllllllllllllllIllIlIllIIIIIIIII;
            void lllllllllllllllIllIlIlIllllllIII = lllllllllllllllIllIlIlIllllllIll[lllllllllllllllIllIlIlIllllllIIl];
            lllllllllllllllIllIlIlIlllllIlll = lllllllllllllllIllIlIllIIIIIIIII.getItemStats((int)lllllllllllllllIllIlIlIllllllIII, lIlIIlllIIII[0]);
            if (s.llIllIlIllIlIl(lllllllllllllllIllIlIlIlllllIlll) && s.llIllIlIllIlll(lllllllllllllllIllIlIlIlllllIlll.isEquipable() ? 1 : 0)) {
                if (s.llIllIlIlllIII(lllllllllllllllIllIlIlIlllllIlll.getEquipment().getSlot(), EquipmentInventorySlot.WEAPON.getSlotIdx())) {
                    0;
                    if (3 <= 2) {
                        return null;
                    }
                } else {
                    void lllllllllllllllIllIlIlIlllllllll;
                    int lllllllllllllllIllIlIlIlllllIllI = lllllllllllllllIllIlIlIlllllIlll.getEquipment().getSlot();
                    if (s.llIllIlIllIllI((int)lllllllllllllllIllIlIlIlllllllll[lllllllllllllllIllIlIlIlllllIllI])) {
                        lllllllllllllllIllIlIlIlllllllll[lllllllllllllllIllIlIlIlllllIllI] = lllllllllllllllIllIlIlIllllllIII;
                        0;
                        if ((((0x1E ^ 0x48) & ~(0x45 ^ 0x13) ^ (0x39 ^ 0xF)) & ((0xA4 ^ 0x84) & ~(0xB3 ^ 0x93) ^ (0x7A ^ 0x4C) ^ -1)) < 0) {
                            return null;
                        }
                    } else {
                        ItemStats lllllllllllllllIllIlIlIlllllIlIl = lllllllllllllllIllIlIllIIIIIIIII.getItemStats((int)lllllllllllllllIllIlIlIlllllllll[lllllllllllllllIllIlIlIlllllIllI], lIlIIlllIIII[0]);
                        if (s.llIllIlIllIlII(lllllllllllllllIllIlIlIlllllIlIl.getEquipment().getStr(), lllllllllllllllIllIlIlIlllllIlll.getEquipment().getStr())) {
                            lllllllllllllllIllIlIlIlllllllll[lllllllllllllllIllIlIlIlllllIllI] = lllllllllllllllIllIlIlIllllllIII;
                        }
                    }
                }
            }
            ++lllllllllllllllIllIlIlIllllllIIl;
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
        void lllllllllllllllIllIlIllIIIllllll;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int lllllllllllllllIllIlIllIIIlllllI = lIlIIlllIIII[0];
        while (s.llIllIlIllIlII(lllllllllllllllIllIlIllIIIlllllI, (int)lllllllllllllllIllIlIllIIIllllll)) {
            void lllllllllllllllIllIlIllIIlIIIIIl;
            void lllllllllllllllIllIlIllIIlIIIIII;
            void lllllllllllllllIllIlIllIIIllllIl = lllllllllllllllIllIlIllIIlIIIIII[lllllllllllllllIllIlIllIIIlllllI];
            lllllllllllllllIllIlIllIIlIIIIIl.add((int)lllllllllllllllIllIlIllIIIllllIl);
            0;
            ++lllllllllllllllIllIlIllIIIlllllI;
            0;
            if (1 != 3) continue;
            return null;
        }
        return arrayList;
    }

    public static int[] e(N n2) {
        switch (t.bD[n2.ordinal()]) {
            case 1: {
                Item lllllllllllllllIllIlIlIllIIIIIII = s.a(o.TEKTON);
                return s.a(lllllllllllllllIllIlIlIllIIIIIII, s.aU());
            }
            case 2: {
                return s.a(s.aX(), s.aU());
            }
            case 3: {
                Item lllllllllllllllIllIlIlIllIIIIIII = s.c(o.MUTTADILE);
                return s.a(lllllllllllllllIllIlIlIllIIIIIII, s.aS());
            }
            case 4: {
                int[] lllllllllllllllIllIlIlIlIlllllll;
                Item lllllllllllllllIllIlIlIllIIIIIII = s.b(o.ABYSSAL_PORTAL);
                WeaponStyle lllllllllllllllIllIlIlIlIllllllI = WeaponMap.StyleMap.getOrDefault(lllllllllllllllIllIlIlIllIIIIIII.getId(), WeaponStyle.RANGE);
                if (s.llIllIlIlllIIl(lllllllllllllllIllIlIlIlIllllllI, WeaponStyle.RANGE)) {
                    lllllllllllllllIllIlIlIlIlllllll = s.aS();
                    0;
                    if (3 <= 2) {
                        return null;
                    }
                } else {
                    lllllllllllllllIllIlIlIlIlllllll = s.aT();
                }
                return s.a(lllllllllllllllIllIlIlIllIIIIIII, lllllllllllllllIllIlIlIlIlllllll);
            }
            case 5: {
                int[] lllllllllllllllIllIlIlIlIlllllll;
                Item lllllllllllllllIllIlIlIllIIIIIII = s.b(o.ICE_DEMON);
                WeaponStyle lllllllllllllllIllIlIlIlIllllllI = WeaponMap.StyleMap.getOrDefault(lllllllllllllllIllIlIlIllIIIIIII.getId(), WeaponStyle.RANGE);
                if (s.llIllIlIlllIIl(lllllllllllllllIllIlIlIlIllllllI, WeaponStyle.RANGE)) {
                    lllllllllllllllIllIlIlIlIlllllll = s.aS();
                    0;
                    if (-1 == ((0xD8 ^ 0xAA ^ (4 ^ 0x7A)) & (0x9C ^ 0x95 ^ (0x3E ^ 0x3B) ^ -1))) {
                        return null;
                    }
                } else {
                    lllllllllllllllIllIlIlIlIlllllll = s.aT();
                }
                return s.a(lllllllllllllllIllIlIlIllIIIIIII, lllllllllllllllIllIlIlIlIlllllll);
            }
            case 6: {
                int lllllllllllllllIllIlIlIlIlllllIl = aG.dk();
                if (s.llIllIlIlllIII(lllllllllllllllIllIlIlIlIlllllIl, lIlIIlllIIII[5])) {
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
        Iterator<Item> lllllllllllllllIllIlIlIllIIIllll = list.iterator();
        while (s.llIllIlIllIlll(lllllllllllllllIllIlIlIllIIIllll.hasNext() ? 1 : 0)) {
            double lllllllllllllllIllIlIlIllIIlIIIl;
            o lllllllllllllllIllIlIlIllIIlIlII;
            void lllllllllllllllIllIlIlIllIIlIIlI;
            Item lllllllllllllllIllIlIlIllIIIlllI = lllllllllllllllIllIlIlIllIIIllll.next();
            ItemEquipmentStats lllllllllllllllIllIlIlIllIIIllIl = lllllllllllllllIllIlIlIllIIlIIlI.getItemStats(lllllllllllllllIllIlIlIllIIIlllI.getId(), lIlIIlllIIII[0]).getEquipment();
            if (s.llIllIllllIIIl(lllllllllllllllIllIlIlIllIIIllIl.getAspeed(), lIlIIlllIIII[4])) {
                0;
                if (3 > -1) continue;
                return null;
            }
            int lllllllllllllllIllIlIlIllIIIllII = Math.max(lllllllllllllllIllIlIlIllIIIllIl.getAstab(), Math.max(lllllllllllllllIllIlIlIllIIIllIl.getAcrush(), lllllllllllllllIllIlIlIllIIIllIl.getAslash()));
            double lllllllllllllllIllIlIlIllIIIlIll = r.a(lllllllllllllllIllIlIlIllIIIllIl.getStr(), 1.0, lllllllllllllllIllIlIlIllIIIllII, 1.0, lllllllllllllllIllIlIlIllIIlIlII.aO().getDefenceLevel(), lllllllllllllllIllIlIlIllIIlIlII.aO().getStabDef(), lllllllllllllllIllIlIlIllIIIllIl.getAspeed());
            if (s.llIllIlllIllII(s.llIllIllllIIII(lllllllllllllllIllIlIlIllIIIlIll, lllllllllllllllIllIlIlIllIIlIIIl))) {
                Item lllllllllllllllIllIlIlIllIIlIIII = lllllllllllllllIllIlIlIllIIIlllI;
                lllllllllllllllIllIlIlIllIIlIIIl = lllllllllllllllIllIlIlIllIIIlIll;
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
        void lllllllllllllllIllIlIlIlllIIlIII;
        List<Item> list = s.a(WeaponStyle.MAGIC);
        if (!s.llIllIlllIllIl((Object)o2, (Object)o.ABYSSAL_PORTAL) || s.llIllIlIlllIIl((Object)o2, (Object)o.ICE_DEMON)) {
            List<Object> lllllllllllllllIllIlIlIlllIIIlll = s.aW();
            if (s.llIllIlIllIlll((lllllllllllllllIllIlIlIlllIIIlll = lllllllllllllllIllIlIlIlllIIIlll.stream().filter(item -> {
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
                return (Item)lllllllllllllllIllIlIlIlllIIIlll.get(lIlIIlllIIII[0]);
            }
        }
        if (s.llIllIlllIllII(lllllllllllllllIllIlIlIlllIIlIII.size())) {
            return (Item)lllllllllllllllIllIlIlIlllIIlIII.get(lIlIIlllIIII[0]);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static EquipmentSetup b(int[] nArray) {
        void var1_1;
        int[] lllllllllllllllIllIlIlIlIlllIIIl;
        if (s.llIllIllllIIlI(nArray)) {
            return null;
        }
        int[] lllllllllllllllIllIlIlIlIlllIIII = new int[lIlIIlllIIII[1]];
        int lllllllllllllllIllIlIlIlIllIllll = lIlIIlllIIII[0];
        while (s.llIllIlIllIlII(lllllllllllllllIllIlIlIlIllIllll, lllllllllllllllIllIlIlIlIlllIIIl.length)) {
            if (s.llIllIlIllIllI(lllllllllllllllIllIlIlIlIlllIIIl[lllllllllllllllIllIlIlIlIllIllll])) {
                lllllllllllllllIllIlIlIlIlllIIII[lllllllllllllllIllIlIlIlIllIllll] = lIlIIlllIIII[0];
                0;
                if (-1 >= 3) {
                    return null;
                }
            } else {
                lllllllllllllllIllIlIlIlIlllIIII[lllllllllllllllIllIlIlIlIllIllll] = lIlIIlllIIII[2];
            }
            ++lllllllllllllllIllIlIlIlIllIllll;
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
        Iterator<Item> lllllllllllllllIllIlIlIllllIIIIl = list.iterator();
        while (s.llIllIlIllIlll(lllllllllllllllIllIlIlIllllIIIIl.hasNext() ? 1 : 0)) {
            WeaponStyle lllllllllllllllIllIlIlIllllIIllI;
            void lllllllllllllllIllIlIlIllllIIlIl;
            Item lllllllllllllllIllIlIlIllllIIIII = lllllllllllllllIllIlIlIllllIIIIl.next();
            ItemEquipmentStats lllllllllllllllIllIlIlIlllIlllll = lllllllllllllllIllIlIlIllllIIlIl.getItemStats(lllllllllllllllIllIlIlIllllIIIII.getId(), lIlIIlllIIII[0]).getEquipment();
            if (s.llIllIlIlllIIl(lllllllllllllllIllIlIlIllllIIllI, WeaponStyle.MELEE)) {
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
        void lllllllllllllllIllIlIllIIIIlIlII;
        Item lllllllllllllllIllIlIllIIIIIllll;
        void lllllllllllllllIllIlIllIIIIlIIll;
        int lllllllllllllllIllIlIllIIIIlIIlI;
        ItemManager itemManager = Static.getItemManager();
        int[] nArray = new int[lIlIIlllIIII[1]];
        int[] nArray2 = Inventory.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray3 = Equipment.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray4 = s.a(nArray2, nArray3);
        EquipmentInventorySlot[] equipmentInventorySlotArray = EquipmentInventorySlot.values();
        int n2 = equipmentInventorySlotArray.length;
        int lllllllllllllllIllIlIllIIIIlIIIl = lIlIIlllIIII[0];
        while (s.llIllIlIllIlII(lllllllllllllllIllIlIllIIIIlIIIl, lllllllllllllllIllIlIllIIIIlIIlI)) {
            int n3;
            void lllllllllllllllIllIlIllIIIIlIIII = lllllllllllllllIllIlIllIIIIlIIll[lllllllllllllllIllIlIllIIIIlIIIl];
            lllllllllllllllIllIlIllIIIIIllll = Equipment.fromSlot((EquipmentInventorySlot)lllllllllllllllIllIlIllIIIIlIIII);
            int n4 = lllllllllllllllIllIlIllIIIIlIIII.getSlotIdx();
            if (s.llIllIlIllIlIl(lllllllllllllllIllIlIllIIIIIllll)) {
                n3 = lllllllllllllllIllIlIllIIIIIllll.getId();
                0;
                if (-1 > 3) {
                    return null;
                }
            } else {
                n3 = lIlIIlllIIII[0];
            }
            lllllllllllllllIllIlIllIIIIlIlll[n4] = n3;
            ++lllllllllllllllIllIlIllIIIIlIIIl;
            0;
            if (3 >= ((0x62 ^ 0x23 ^ (2 ^ 0x6F)) & (0x5D ^ 0x70 ^ 1 ^ -1))) continue;
            return null;
        }
        lllllllllllllllIllIlIllIIIIlIIll = lllllllllllllllIllIlIllIIIIlIlII;
        lllllllllllllllIllIlIllIIIIlIIlI = ((void)lllllllllllllllIllIlIllIIIIlIIll).length;
        lllllllllllllllIllIlIllIIIIlIIIl = lIlIIlllIIII[0];
        while (s.llIllIlIllIlII(lllllllllllllllIllIlIllIIIIlIIIl, lllllllllllllllIllIlIllIIIIlIIlI)) {
            void lllllllllllllllIllIlIllIIIIllIII;
            void lllllllllllllllIllIlIllIIIIlIIII = lllllllllllllllIllIlIllIIIIlIIll[lllllllllllllllIllIlIllIIIIlIIIl];
            lllllllllllllllIllIlIllIIIIIllll = lllllllllllllllIllIlIllIIIIllIII.getItemStats((int)lllllllllllllllIllIlIllIIIIlIIII, lIlIIlllIIII[0]);
            if (s.llIllIlIllIlIl(lllllllllllllllIllIlIllIIIIIllll)) {
                if (s.llIllIlIllIllI(lllllllllllllllIllIlIllIIIIIllll.isEquipable() ? 1 : 0)) {
                    0;
                    if (((0x13 ^ 0x4E) & ~(0xFC ^ 0xA1)) != ((0x5F ^ 0x72) & ~(0x6B ^ 0x46))) {
                        return null;
                    }
                } else {
                    void lllllllllllllllIllIlIllIIIIlIlll;
                    int lllllllllllllllIllIlIllIIIIIlllI = lllllllllllllllIllIlIllIIIIIllll.getEquipment().getSlot();
                    if (s.llIllIlIllIllI((int)lllllllllllllllIllIlIllIIIIlIlll[lllllllllllllllIllIlIllIIIIIlllI])) {
                        lllllllllllllllIllIlIllIIIIlIlll[lllllllllllllllIllIlIllIIIIIlllI] = lllllllllllllllIllIlIllIIIIlIIII;
                        0;
                        if (null != null) {
                            return null;
                        }
                    } else {
                        ItemStats lllllllllllllllIllIlIllIIIIIllIl = lllllllllllllllIllIlIllIIIIllIII.getItemStats((int)lllllllllllllllIllIlIllIIIIlIlll[lllllllllllllllIllIlIllIIIIIlllI], lIlIIlllIIII[0]);
                        if (s.llIllIlIllIlII(lllllllllllllllIllIlIllIIIIIllIl.getEquipment().getMdmg(), lllllllllllllllIllIlIllIIIIIllll.getEquipment().getMdmg())) {
                            lllllllllllllllIllIlIllIIIIlIlll[lllllllllllllllIllIlIllIIIIIlllI] = lllllllllllllllIllIlIllIIIIlIIII;
                            0;
                            if (3 < 3) {
                                return null;
                            }
                        } else if (s.llIllIlIllIlII(lllllllllllllllIllIlIllIIIIIllIl.getEquipment().getAmagic(), lllllllllllllllIllIlIllIIIIIllll.getEquipment().getAmagic())) {
                            lllllllllllllllIllIlIllIIIIlIlll[lllllllllllllllIllIlIllIIIIIlllI] = lllllllllllllllIllIlIllIIIIlIIII;
                        }
                    }
                }
            }
            ++lllllllllllllllIllIlIllIIIIlIIIl;
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
                if (null != null) {
                    return ((0x44 ^ 0xD) & ~(0x7A ^ 0x33)) != 0;
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
        Iterator<Item> lllllllllllllllIllIlIlIllIlIIIlI = list.iterator();
        while (s.llIllIlIllIlll(lllllllllllllllIllIlIlIllIlIIIlI.hasNext() ? 1 : 0)) {
            double lllllllllllllllIllIlIlIllIlIIlII;
            o lllllllllllllllIllIlIlIllIlIIlll;
            void lllllllllllllllIllIlIlIllIlIIlIl;
            Item lllllllllllllllIllIlIlIllIlIIIIl = lllllllllllllllIllIlIlIllIlIIIlI.next();
            if (s.llIllIlIllIlIl(lllllllllllllllIllIlIlIllIlIIIIl) && s.llIllIlIllIlll(lllllllllllllllIllIlIlIllIlIIIIl.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[2]]) ? 1 : 0)) {
                0;
                if (((0x79 ^ 0x38 ^ (0xF7 ^ 0x8E)) & (89 + 120 - 83 + 24 ^ 111 + 12 - 17 + 68 ^ -1)) != 3) continue;
                return null;
            }
            ItemEquipmentStats lllllllllllllllIllIlIlIllIlIIIII = lllllllllllllllIllIlIlIllIlIIlIl.getItemStats(lllllllllllllllIllIlIlIllIlIIIIl.getId(), lIlIIlllIIII[0]).getEquipment();
            double lllllllllllllllIllIlIlIllIIlllll = r.a(lllllllllllllllIllIlIlIllIlIIIII.getStr(), 1.0, lllllllllllllllIllIlIlIllIlIIIII.getAstab(), 1.0, lllllllllllllllIllIlIlIllIlIIlll.aO().getDefenceLevel(), lllllllllllllllIllIlIlIllIlIIlll.aO().getStabDef(), lllllllllllllllIllIlIlIllIlIIIII.getAspeed());
            if (s.llIllIlllIllII(s.llIllIlllIllll(lllllllllllllllIllIlIlIllIIlllll, lllllllllllllllIllIlIlIllIlIIlII))) {
                Item lllllllllllllllIllIlIlIllIlIIIll = lllllllllllllllIllIlIlIllIlIIIIl;
                lllllllllllllllIllIlIlIllIlIIlII = lllllllllllllllIllIlIlIllIIlllll;
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
                    return ((0xC5 ^ 0xA4) & ~(0xC4 ^ 0xA5)) != 0;
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

    private static String llIllIlIllIIII(String lllllllllllllllIllIlIlIlIIlIIlII, String lllllllllllllllIllIlIlIlIIIllllI) {
        lllllllllllllllIllIlIlIlIIlIIlII = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIlIlIIlIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlIlIlIIlIIIlI = new StringBuilder();
        char[] lllllllllllllllIllIlIlIlIIlIIIIl = lllllllllllllllIllIlIlIlIIIllllI.toCharArray();
        int lllllllllllllllIllIlIlIlIIlIIIII = lIlIIlllIIII[0];
        char[] lllllllllllllllIllIlIlIlIIIllIlI = lllllllllllllllIllIlIlIlIIlIIlII.toCharArray();
        int lllllllllllllllIllIlIlIlIIIllIIl = lllllllllllllllIllIlIlIlIIIllIlI.length;
        int lllllllllllllllIllIlIlIlIIIllIII = lIlIIlllIIII[0];
        while (s.llIllIlIllIlII(lllllllllllllllIllIlIlIlIIIllIII, lllllllllllllllIllIlIlIlIIIllIIl)) {
            char lllllllllllllllIllIlIlIlIIlIIlIl = lllllllllllllllIllIlIlIlIIIllIlI[lllllllllllllllIllIlIlIlIIIllIII];
            lllllllllllllllIllIlIlIlIIlIIIlI.append((char)(lllllllllllllllIllIlIlIlIIlIIlIl ^ lllllllllllllllIllIlIlIlIIlIIIIl[lllllllllllllllIllIlIlIlIIlIIIII % lllllllllllllllIllIlIlIlIIlIIIIl.length]));
            0;
            ++lllllllllllllllIllIlIlIlIIlIIIII;
            ++lllllllllllllllIllIlIlIlIIIllIII;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIlIlIlIIlIIIlI);
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
        void lllllllllllllllIllIlIllIIIlIllII;
        Item lllllllllllllllIllIlIllIIIlIIlll;
        void lllllllllllllllIllIlIllIIIlIlIll;
        int lllllllllllllllIllIlIllIIIlIlIlI;
        ItemManager itemManager = Static.getItemManager();
        int[] nArray = new int[lIlIIlllIIII[1]];
        int[] nArray2 = Inventory.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray3 = Equipment.getAll().stream().mapToInt(item -> item.getId()).toArray();
        int[] nArray4 = s.a(nArray2, nArray3);
        EquipmentInventorySlot[] equipmentInventorySlotArray = EquipmentInventorySlot.values();
        int n2 = equipmentInventorySlotArray.length;
        int lllllllllllllllIllIlIllIIIlIlIIl = lIlIIlllIIII[0];
        while (s.llIllIlIllIlII(lllllllllllllllIllIlIllIIIlIlIIl, lllllllllllllllIllIlIllIIIlIlIlI)) {
            int n3;
            void lllllllllllllllIllIlIllIIIlIlIII = lllllllllllllllIllIlIllIIIlIlIll[lllllllllllllllIllIlIllIIIlIlIIl];
            lllllllllllllllIllIlIllIIIlIIlll = Equipment.fromSlot((EquipmentInventorySlot)lllllllllllllllIllIlIllIIIlIlIII);
            int n4 = lllllllllllllllIllIlIllIIIlIlIII.getSlotIdx();
            if (s.llIllIlIllIlIl(lllllllllllllllIllIlIllIIIlIIlll)) {
                n3 = lllllllllllllllIllIlIllIIIlIIlll.getId();
                0;
                if (1 == 0) {
                    return null;
                }
            } else {
                n3 = lIlIIlllIIII[0];
            }
            lllllllllllllllIllIlIllIIIlIllll[n4] = n3;
            ++lllllllllllllllIllIlIllIIIlIlIIl;
            0;
            if ((67 + 21 - -42 + 15 ^ 69 + 105 - 94 + 68) > 0) continue;
            return null;
        }
        lllllllllllllllIllIlIllIIIlIlIll = lllllllllllllllIllIlIllIIIlIllII;
        lllllllllllllllIllIlIllIIIlIlIlI = ((void)lllllllllllllllIllIlIllIIIlIlIll).length;
        lllllllllllllllIllIlIllIIIlIlIIl = lIlIIlllIIII[0];
        while (s.llIllIlIllIlII(lllllllllllllllIllIlIllIIIlIlIIl, lllllllllllllllIllIlIllIIIlIlIlI)) {
            void lllllllllllllllIllIlIllIIIllIIII;
            void lllllllllllllllIllIlIllIIIlIlIII = lllllllllllllllIllIlIllIIIlIlIll[lllllllllllllllIllIlIllIIIlIlIIl];
            lllllllllllllllIllIlIllIIIlIIlll = lllllllllllllllIllIlIllIIIllIIII.getItemStats((int)lllllllllllllllIllIlIllIIIlIlIII, lIlIIlllIIII[0]);
            if (s.llIllIlIllIlIl(lllllllllllllllIllIlIllIIIlIIlll)) {
                if (s.llIllIlIllIllI(lllllllllllllllIllIlIllIIIlIIlll.isEquipable() ? 1 : 0)) {
                    0;
                    if (1 < (3 & ~3)) {
                        return null;
                    }
                } else {
                    ItemStats lllllllllllllllIllIlIllIIIlIIlIl;
                    void lllllllllllllllIllIlIllIIIlIllll;
                    int lllllllllllllllIllIlIllIIIlIIllI = lllllllllllllllIllIlIllIIIlIIlll.getEquipment().getSlot();
                    if (s.llIllIlIllIllI((int)lllllllllllllllIllIlIllIIIlIllll[lllllllllllllllIllIlIllIIIlIIllI])) {
                        lllllllllllllllIllIlIllIIIlIllll[lllllllllllllllIllIlIllIIIlIIllI] = lllllllllllllllIllIlIllIIIlIlIII;
                    }
                    if (s.llIllIlIllIlII((lllllllllllllllIllIlIllIIIlIIlIl = lllllllllllllllIllIlIllIIIllIIII.getItemStats((int)lllllllllllllllIllIlIllIIIlIllll[lllllllllllllllIllIlIllIIIlIIllI], lIlIIlllIIII[0])).getEquipment().getRstr(), lllllllllllllllIllIlIllIIIlIIlll.getEquipment().getRstr())) {
                        lllllllllllllllIllIlIllIIIlIllll[lllllllllllllllIllIlIllIIIlIIllI] = lllllllllllllllIllIlIllIIIlIlIII;
                        0;
                        if (((0x16 ^ 0x3F ^ (0x1C ^ 8)) & (49 + 116 - 94 + 108 ^ 106 + 107 - 172 + 101 ^ -1)) != 0) {
                            return null;
                        }
                    } else if (s.llIllIlIllIlII(lllllllllllllllIllIlIllIIIlIIlIl.getEquipment().getArange(), lllllllllllllllIllIlIllIIIlIIlll.getEquipment().getArange())) {
                        lllllllllllllllIllIlIllIIIlIllll[lllllllllllllllIllIlIllIIIlIIllI] = lllllllllllllllIllIlIllIIIlIlIII;
                    }
                }
            }
            ++lllllllllllllllIllIlIllIIIlIlIIl;
            0;
            if (null == null) continue;
            return null;
        }
        return nArray;
    }

    private static boolean llIllIlIllIlIl(Object object) {
        return object != null;
    }
}

