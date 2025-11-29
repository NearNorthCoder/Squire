package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.openosrs.client.util.WeaponMap;
import com.openosrs.client.util.WeaponStyle;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
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
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.s  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/s.class */
public class C0044s {
    private static /* synthetic */ int[] lIlIIlllIIII;
    private static /* synthetic */ String[] lIlIIllIllll;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public static Item c(EnumC0040o enumC0040o) {
        List list;
        List<Item> a = a(WeaponStyle.RANGE);
        ItemManager itemManager = Static.getItemManager();
        double lllllllllllllllIllIlIlIllIlllIII = 0.0d;
        Item item = null;
        for (Item item2 : a) {
            List<Item> aW = aW();
            int[] iArr = new int[lIlIIlllIIII[2]];
            iArr[lIlIIlllIIII[0]] = lIlIIlllIIII[3];
            NPC nearest = NPCs.getNearest(iArr);
            if (llIllIlIlllIIl(EnumC0040o.MUTTADILE, enumC0040o) && llIllIlIllIlIl(nearest)) {
                list = (List) aW.stream().filter(item3 -> {
                    return item3.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[12]]);
                }).collect(Collectors.toList());
                "".length();
                if ((((15 ^ 21) ^ (70 ^ 16)) & (((((44 + 207) - 42) + 13) ^ (((34 + 32) - (-35)) + 45)) ^ (-" ".length()))) != (((50 ^ 0) ^ (82 ^ 70)) & (((252 ^ 139) ^ (198 ^ 151)) ^ (-" ".length())))) {
                    return null;
                }
            } else {
                list = (List) aW.stream().filter(item4 -> {
                    if (!llIllIlIllIllI(item4.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[10]]) ? 1 : 0) || llIllIlIllIlll(item4.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[11]]) ? 1 : 0)) {
                        ?? r0 = lIlIIlllIIII[2];
                        "".length();
                        return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIIlllIIII[0];
                }).collect(Collectors.toList());
            }
            if (llIllIlIllIllI(list.isEmpty() ? 1 : 0)) {
                return (Item) list.get(lIlIIlllIIII[0]);
            }
            ItemEquipmentStats equipment = itemManager.getItemStats(item2.getId(), (boolean) lIlIIlllIIII[0]).getEquipment();
            double a2 = C0043r.a(equipment.getRstr(), 1.0d, equipment.getArange(), 1.0d, enumC0040o.aO().getDefenceLevel(), enumC0040o.aO().getRangeDef(), equipment.getAspeed());
            if (llIllIlllIllII(llIllIlllIlllI(a2, lllllllllllllllIllIlIlIllIlllIII))) {
                item = item2;
                lllllllllllllllIllIlIlIllIlllIII = a2;
            }
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return item;
    }

    private static boolean llIllIlIllIlII(int i, int i2) {
        return i < i2;
    }

    private static int llIllIllllIIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    public static int[] a(int[] iArr, int[] iArr2) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(a(iArr));
        "".length();
        hashSet.addAll(a(iArr2));
        "".length();
        return hashSet.stream().mapToInt((v0) -> {
            return v0.intValue();
        }).toArray();
    }

    private static boolean llIllIllllIIIl(int i, int i2) {
        return i != i2;
    }

    private static String llIllIlIlIllll(String lllllllllllllllIllIlIlIlIIllIlII, String lllllllllllllllIllIlIlIlIIllIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIlIlIIllIIll.getBytes(StandardCharsets.UTF_8)), lIlIIlllIIII[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIlllIIII[7], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIlIlIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIlIlIIllIlIl) {
            lllllllllllllllIllIlIlIlIIllIlIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    public static Item bd() {
        EnumC0040o enumC0040o = EnumC0040o.OLM_HEAD;
        List<Item> a = a(WeaponStyle.RANGE);
        ItemManager itemManager = Static.getItemManager();
        double d = 0.0d;
        Item item = null;
        for (Item item2 : a) {
            if (llIllIlIllIlll(item2.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[7]]) ? 1 : 0)) {
                "".length();
                if ((((247 ^ 180) ^ (41 ^ 126)) & (((5 ^ 65) ^ (80 ^ 0)) ^ (-" ".length()))) < 0) {
                    return null;
                }
            } else {
                List list = (List) aW().stream().filter(item3 -> {
                    if (!llIllIlIllIllI(item3.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[5]]) ? 1 : 0) || llIllIlIllIlll(item3.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[4]]) ? 1 : 0)) {
                        ?? r0 = lIlIIlllIIII[2];
                        "".length();
                        return (-" ".length()) > 0 ? ((157 ^ 143) ^ (38 ^ 122)) & (((43 ^ 37) ^ (82 ^ 18)) ^ (-" ".length())) : r0;
                    }
                    return lIlIIlllIIII[0];
                }).collect(Collectors.toList());
                if (llIllIlIllIlll(list.size())) {
                    return (Item) list.get(lIlIIlllIIII[0]);
                }
                ItemEquipmentStats equipment = itemManager.getItemStats(item2.getId(), (boolean) lIlIIlllIIII[0]).getEquipment();
                double a2 = C0043r.a(equipment.getRstr(), 1.0d, equipment.getArange(), 1.0d, enumC0040o.aO().getDefenceLevel(), enumC0040o.aO().getRangeDef(), equipment.getAspeed());
                if (llIllIlllIllII(llIllIllllIIll(a2, d))) {
                    item = item2;
                    d = a2;
                }
                "".length();
                if (((249 ^ 154) ^ (1 ^ 102)) < ((90 ^ 16) ^ (42 ^ 100))) {
                    return null;
                }
            }
        }
        return item;
    }

    public static List<Item> aW() {
        ItemManager itemManager = Static.getItemManager();
        Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
        List<Item> list = (List) Inventory.getAll().stream().filter(item -> {
            ItemStats itemStats = itemManager.getItemStats(item.getId(), (boolean) lIlIIlllIIII[0]);
            if (llIllIlIllIlIl(itemStats) && llIllIlIllIlIl(itemStats.getEquipment()) && llIllIlIlllIII(itemStats.getEquipment().getSlot(), EquipmentInventorySlot.WEAPON.getSlotIdx())) {
                ?? r0 = lIlIIlllIIII[2];
                "".length();
                return (((89 ^ 97) ^ (38 ^ 86)) & (((47 ^ 41) ^ (220 ^ 146)) ^ (-" ".length()))) > ((100 ^ 64) ^ (164 ^ 132)) ? ((210 ^ 155) ^ (54 ^ 86)) & (((121 ^ 54) ^ (38 ^ 64)) ^ (-" ".length())) : r0;
            }
            return lIlIIlllIIII[0];
        }).collect(Collectors.toList());
        if (llIllIlIllIlIl(fromSlot)) {
            list.add(fromSlot);
            "".length();
        }
        return list;
    }

    private static int llIllIlllIllll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static void llIllIlIllIIlI() {
        lIlIIllIllll = new String[lIlIIlllIIII[1]];
        lIlIIllIllll[lIlIIlllIIII[0]] = llIllIlIlIllll("/R5NYDxW6ca1v0L8USztAQ==", "NfDQm");
        lIlIIllIllll[lIlIIlllIIII[2]] = llIllIlIllIIII("FAYANikIFQ==", "ggeZM");
        lIlIIllIllll[lIlIIlllIIII[7]] = llIllIlIllIIIl("gAxjJbRZbqYRSkEEvaZs/Q==", "myxwM");
        lIlIIllIllll[lIlIIlllIIII[5]] = llIllIlIlIllll("noIWdFN2pMk96t16zHWieg==", "SOvYx");
        lIlIIllIllll[lIlIIlllIIII[4]] = llIllIlIlIllll("fxGEZmk2wPzdB0BubtdUyA==", "wPfLl");
        lIlIIllIllll[lIlIIlllIIII[6]] = llIllIlIllIIII("BjA7KQUXcTIiDhcmOj8O", "dQUMj");
        lIlIIllIllll[lIlIIlllIIII[8]] = llIllIlIlIllll("wn3DwoqfhP05f/xPgwIg4ZoqpNWQYVeF", "lOkbP");
        lIlIIllIllll[lIlIIlllIIII[9]] = llIllIlIllIIIl("2JnXoiIjvW3ys+HaiMaI3Q==", "Ipuov");
        lIlIIllIllll[lIlIIlllIIII[10]] = llIllIlIllIIII("JgQeGwM3F1cKGCU=", "Rswhw");
        lIlIIllIllll[lIlIIlllIIII[11]] = llIllIlIllIIIl("6ewhWQmsc0kauN1UEBb7Tw==", "IOhCk");
        lIlIIllIllll[lIlIIlllIIII[12]] = llIllIlIlIllll("yU97dabfXuiWcflvxWMiMQ==", "tqTOb");
        lIlIIllIllll[lIlIIlllIIII[13]] = llIllIlIlIllll("nmF+X+mI4aK9IIfaIjoQqg==", "cRDxZ");
        lIlIIllIllll[lIlIIlllIIII[14]] = llIllIlIllIIIl("olySCCv/y5A1L+9gCaKebA==", "BtFRU");
        lIlIIllIllll[lIlIIlllIIII[15]] = llIllIlIllIIII("Bw0AGCsPAQ==", "wdcsJ");
    }

    public static EquipmentSetup ba() {
        return b(a(b(EnumC0040o.OLM_RIGHT_HAND), aT()));
    }

    private static boolean llIllIlIlllIII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    public static Item a(EnumC0040o enumC0040o) {
        List<Item> a = a(WeaponStyle.MELEE);
        ItemManager itemManager = Static.getItemManager();
        double d = 0.0d;
        Item item = null;
        for (Item item2 : a) {
            if (llIllIlIlllIIl(enumC0040o, EnumC0040o.TEKTON) && llIllIlIllIlll(item2.getName().contains(lIlIIllIllll[lIlIIlllIIII[0]]) ? 1 : 0)) {
                return item2;
            }
            ItemEquipmentStats equipment = itemManager.getItemStats(item2.getId(), (boolean) lIlIIlllIIII[0]).getEquipment();
            double a2 = C0043r.a(equipment.getStr(), 1.0d, equipment.getAcrush(), 1.0d, enumC0040o.aO().getDefenceLevel(), enumC0040o.aO().getCrushDef(), equipment.getAspeed());
            if (llIllIlllIllII(llIllIlllIlIll(a2, d))) {
                item = item2;
                d = a2;
            }
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        }
        return item;
    }

    private static boolean llIllIlIlllIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String llIllIlIllIIIl(String lllllllllllllllIllIlIlIlIlIIIIIl, String lllllllllllllllIllIlIlIlIlIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIlIlIlIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIlllIIII[7], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIlIlIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlIlIlIlIIIIlI) {
            lllllllllllllllIllIlIlIlIlIIIIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public static int[] aU() {
        int i;
        ItemManager itemManager = Static.getItemManager();
        int[] iArr = new int[lIlIIlllIIII[1]];
        int[] a = a(Inventory.getAll().stream().mapToInt(item -> {
            return item.getId();
        }).toArray(), Equipment.getAll().stream().mapToInt(item2 -> {
            return item2.getId();
        }).toArray());
        EquipmentInventorySlot[] values = EquipmentInventorySlot.values();
        int length = values.length;
        int i2 = lIlIIlllIIII[0];
        while (llIllIlIllIlII(i2, length)) {
            EquipmentInventorySlot equipmentInventorySlot = values[i2];
            Item fromSlot = Equipment.fromSlot(equipmentInventorySlot);
            int slotIdx = equipmentInventorySlot.getSlotIdx();
            if (llIllIlIllIlIl(fromSlot)) {
                i = fromSlot.getId();
                "".length();
                if ((-"  ".length()) > 0) {
                    return null;
                }
            } else {
                i = lIlIIlllIIII[0];
            }
            iArr[slotIdx] = i;
            i2++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        int length2 = a.length;
        int i3 = lIlIIlllIIII[0];
        while (llIllIlIllIlII(i3, length2)) {
            int i4 = a[i3];
            ItemStats itemStats = itemManager.getItemStats(i4, (boolean) lIlIIlllIIII[0]);
            if (llIllIlIllIlIl(itemStats) && llIllIlIllIlll(itemStats.isEquipable() ? 1 : 0)) {
                if (llIllIlIlllIII(itemStats.getEquipment().getSlot(), EquipmentInventorySlot.WEAPON.getSlotIdx())) {
                    "".length();
                    if ("   ".length() <= "  ".length()) {
                        return null;
                    }
                } else {
                    int slot = itemStats.getEquipment().getSlot();
                    if (llIllIlIllIllI(iArr[slot])) {
                        iArr[slot] = i4;
                        "".length();
                        if (((((30 ^ 72) & ((69 ^ 19) ^ (-1))) ^ (57 ^ 15)) & ((((164 ^ 132) & ((179 ^ 147) ^ (-1))) ^ (122 ^ 76)) ^ (-" ".length()))) < 0) {
                            return null;
                        }
                    } else if (llIllIlIllIlII(itemManager.getItemStats(iArr[slot], (boolean) lIlIIlllIIII[0]).getEquipment().getStr(), itemStats.getEquipment().getStr())) {
                        iArr[slot] = i4;
                    }
                }
            }
            i3++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return iArr;
    }

    private static int llIllIllllIIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static List<Integer> a(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i = lIlIIlllIIII[0];
        while (llIllIlIllIlII(i, length)) {
            arrayList.add(Integer.valueOf(iArr[i]));
            "".length();
            i++;
            "".length();
            if (" ".length() == "   ".length()) {
                return null;
            }
        }
        return arrayList;
    }

    public static int[] e(N n) {
        int[] aT;
        int[] aT2;
        switch (C0045t.bD[n.ordinal()]) {
            case 1:
                return a(a(EnumC0040o.TEKTON), aU());
            case 2:
                return a(aX(), aU());
            case 3:
                return a(c(EnumC0040o.MUTTADILE), aS());
            case 4:
                Item b = b(EnumC0040o.ABYSSAL_PORTAL);
                if (llIllIlIlllIIl((WeaponStyle) WeaponMap.StyleMap.getOrDefault(Integer.valueOf(b.getId()), WeaponStyle.RANGE), WeaponStyle.RANGE)) {
                    aT2 = aS();
                    "".length();
                    if ("   ".length() <= "  ".length()) {
                        return null;
                    }
                } else {
                    aT2 = aT();
                }
                return a(b, aT2);
            case 5:
                Item b2 = b(EnumC0040o.ICE_DEMON);
                if (llIllIlIlllIIl((WeaponStyle) WeaponMap.StyleMap.getOrDefault(Integer.valueOf(b2.getId()), WeaponStyle.RANGE), WeaponStyle.RANGE)) {
                    aT = aS();
                    "".length();
                    if ((-" ".length()) == (((216 ^ 170) ^ (4 ^ 122)) & (((156 ^ 149) ^ (62 ^ 59)) ^ (-" ".length())))) {
                        return null;
                    }
                } else {
                    aT = aT();
                }
                return a(b2, aT);
            case 6:
                return llIllIlIlllIII(aG.dk(), lIlIIlllIIII[5]) ? a(d(EnumC0040o.VASA_CRYSTAL), aU()) : a(c(EnumC0040o.VASA), aS());
            case 7:
                return a(c(EnumC0040o.ABYSSAL_PORTAL), aS());
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    public static Item e(EnumC0040o enumC0040o) {
        List<Item> a = a(WeaponStyle.MELEE);
        ItemManager itemManager = Static.getItemManager();
        double d = 0.0d;
        Item item = null;
        for (Item item2 : a) {
            ItemEquipmentStats equipment = itemManager.getItemStats(item2.getId(), (boolean) lIlIIlllIIII[0]).getEquipment();
            if (llIllIllllIIIl(equipment.getAspeed(), lIlIIlllIIII[4])) {
                "".length();
                if ("   ".length() <= (-" ".length())) {
                    return null;
                }
            } else {
                double a2 = C0043r.a(equipment.getStr(), 1.0d, Math.max(equipment.getAstab(), Math.max(equipment.getAcrush(), equipment.getAslash())), 1.0d, enumC0040o.aO().getDefenceLevel(), enumC0040o.aO().getStabDef(), equipment.getAspeed());
                if (llIllIlllIllII(llIllIllllIIII(a2, d))) {
                    item = item2;
                    d = a2;
                }
                "".length();
                if ((-((69 ^ 0) ^ (55 ^ 119))) >= 0) {
                    return null;
                }
            }
        }
        return item;
    }

    private static int llIllIlllIlIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    static {
        llIllIlIllIIll();
        llIllIlIllIIlI();
    }

    private static int llIllIlllIlllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    public static Item b(EnumC0040o enumC0040o) {
        List<Item> a = a(WeaponStyle.MAGIC);
        if (!llIllIlllIllIl(enumC0040o, EnumC0040o.ABYSSAL_PORTAL) || llIllIlIlllIIl(enumC0040o, EnumC0040o.ICE_DEMON)) {
            List list = (List) aW().stream().filter(item -> {
                if (!llIllIlIllIllI(item.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[13]]) ? 1 : 0) || llIllIlIllIlll(item.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[14]]) ? 1 : 0)) {
                    ?? r0 = lIlIIlllIIII[2];
                    "".length();
                    return (-" ".length()) == " ".length() ? ((((102 + 51) - 152) + 236) ^ (((156 + 8) - 82) + 84)) & (((78 ^ 63) ^ (139 ^ 177)) ^ (-" ".length())) : r0;
                }
                return lIlIIlllIIII[0];
            }).collect(Collectors.toList());
            if (llIllIlIllIlll(list.size())) {
                return (Item) list.get(lIlIIlllIIII[0]);
            }
        }
        if (llIllIlllIllII(a.size())) {
            return a.get(lIlIIlllIIII[0]);
        }
        return null;
    }

    public static EquipmentSetup b(int[] iArr) {
        if (llIllIllllIIlI(iArr)) {
            return null;
        }
        int[] iArr2 = new int[lIlIIlllIIII[1]];
        int i = lIlIIlllIIII[0];
        while (llIllIlIllIlII(i, iArr.length)) {
            if (llIllIlIllIllI(iArr[i])) {
                iArr2[i] = lIlIIlllIIII[0];
                "".length();
                if ((-" ".length()) >= "   ".length()) {
                    return null;
                }
            } else {
                iArr2[i] = lIlIIlllIIII[2];
            }
            i++;
            "".length();
            if ("   ".length() < " ".length()) {
                return null;
            }
        }
        return new EquipmentSetup(iArr, iArr2, new String[lIlIIlllIIII[1]]);
    }

    private static boolean llIllIllllIIlI(Object obj) {
        return obj == null;
    }

    private static void llIllIlIllIIll() {
        lIlIIlllIIII = new int[16];
        lIlIIlllIIII[0] = (43 ^ 51) & ((182 ^ 174) ^ (-1));
        lIlIIlllIIII[1] = 134 ^ 136;
        lIlIIlllIIII[2] = " ".length();
        lIlIIlllIIII[3] = (-2) & 7563;
        lIlIIlllIIII[4] = (208 ^ 181) ^ (118 ^ 23);
        lIlIIlllIIII[5] = "   ".length();
        lIlIIlllIIII[6] = 23 ^ 18;
        lIlIIlllIIII[7] = "  ".length();
        lIlIIlllIIII[8] = 56 ^ 62;
        lIlIIlllIIII[9] = 55 ^ 48;
        lIlIIlllIIII[10] = 152 ^ 144;
        lIlIIlllIIII[11] = 81 ^ 88;
        lIlIIlllIIII[12] = 13 ^ 7;
        lIlIIlllIIII[13] = (((37 + 130) - 84) + 66) ^ (((86 + 15) - (-11)) + 46);
        lIlIIlllIIII[14] = (((14 + 19) - (-83)) + 36) ^ (((27 + 132) - 138) + 127);
        lIlIIlllIIII[15] = (33 ^ 58) ^ (127 ^ 105);
    }

    public static EquipmentSetup bc() {
        return b(a(bd(), aS()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    public static List<Item> a(WeaponStyle weaponStyle, EnumC0040o enumC0040o) {
        ItemManager itemManager = Static.getItemManager();
        List<Item> a = a(weaponStyle);
        int i = lIlIIlllIIII[0];
        int i2 = lIlIIlllIIII[0];
        for (Item item : a) {
            itemManager.getItemStats(item.getId(), (boolean) lIlIIlllIIII[0]).getEquipment();
            if (llIllIlIlllIIl(weaponStyle, WeaponStyle.MELEE)) {
            }
            "".length();
            if (!(true ^ true)) {
                return null;
            }
        }
        return null;
    }

    public static EquipmentSetup bb() {
        return b(a(e(EnumC0040o.OLM_LEFT_HAND), aU()));
    }

    private static boolean llIllIlIllIlll(int i) {
        return i != 0;
    }

    public static int[] aZ() {
        Item aY = aY();
        if (llIllIllllIIlI(aY)) {
            return null;
        }
        return a(aY, aU());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public static int[] aT() {
        int i;
        ItemManager itemManager = Static.getItemManager();
        int[] iArr = new int[lIlIIlllIIII[1]];
        int[] a = a(Inventory.getAll().stream().mapToInt(item -> {
            return item.getId();
        }).toArray(), Equipment.getAll().stream().mapToInt(item2 -> {
            return item2.getId();
        }).toArray());
        EquipmentInventorySlot[] values = EquipmentInventorySlot.values();
        int length = values.length;
        int i2 = lIlIIlllIIII[0];
        while (llIllIlIllIlII(i2, length)) {
            EquipmentInventorySlot equipmentInventorySlot = values[i2];
            Item fromSlot = Equipment.fromSlot(equipmentInventorySlot);
            int slotIdx = equipmentInventorySlot.getSlotIdx();
            if (llIllIlIllIlIl(fromSlot)) {
                i = fromSlot.getId();
                "".length();
                if ((-" ".length()) > "   ".length()) {
                    return null;
                }
            } else {
                i = lIlIIlllIIII[0];
            }
            iArr[slotIdx] = i;
            i2++;
            "".length();
            if ("   ".length() < (((98 ^ 35) ^ (2 ^ 111)) & (((93 ^ 112) ^ " ".length()) ^ (-" ".length())))) {
                return null;
            }
        }
        int length2 = a.length;
        int i3 = lIlIIlllIIII[0];
        while (llIllIlIllIlII(i3, length2)) {
            int i4 = a[i3];
            ItemStats itemStats = itemManager.getItemStats(i4, (boolean) lIlIIlllIIII[0]);
            if (llIllIlIllIlIl(itemStats)) {
                if (llIllIlIllIllI(itemStats.isEquipable() ? 1 : 0)) {
                    "".length();
                    if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                        return null;
                    }
                } else {
                    int slot = itemStats.getEquipment().getSlot();
                    if (llIllIlIllIllI(iArr[slot])) {
                        iArr[slot] = i4;
                        "".length();
                        if (0 != 0) {
                            return null;
                        }
                    } else {
                        ItemStats itemStats2 = itemManager.getItemStats(iArr[slot], (boolean) lIlIIlllIIII[0]);
                        if (llIllIlIllIlII(itemStats2.getEquipment().getMdmg(), itemStats.getEquipment().getMdmg())) {
                            iArr[slot] = i4;
                            "".length();
                            if ("   ".length() < "   ".length()) {
                                return null;
                            }
                        } else if (llIllIlIllIlII(itemStats2.getEquipment().getAmagic(), itemStats.getEquipment().getAmagic())) {
                            iArr[slot] = i4;
                        }
                    }
                }
            }
            i3++;
            "".length();
            if (" ".length() <= (-" ".length())) {
                return null;
            }
        }
        return iArr;
    }

    public static int[] aV() {
        aS();
        return new int[lIlIIlllIIII[0]];
    }

    private static boolean llIllIlllIllII(int i) {
        return i > 0;
    }

    public static Item aY() {
        List list = (List) aW().stream().filter(item -> {
            if (llIllIlIllIllI(item.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[6]]) ? 1 : 0) && llIllIlIllIllI(item.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[8]]) ? 1 : 0) && !llIllIlIllIlll(item.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[9]]) ? 1 : 0)) {
                return lIlIIlllIIII[0];
            }
            ?? r0 = lIlIIlllIIII[2];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }).collect(Collectors.toList());
        if (llIllIlIllIllI(list.size())) {
            return null;
        }
        return (Item) list.get(lIlIIlllIIII[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    public static Item d(EnumC0040o enumC0040o) {
        List<Item> a = a(WeaponStyle.MELEE);
        ItemManager itemManager = Static.getItemManager();
        double d = 0.0d;
        Item item = null;
        for (Item item2 : a) {
            if (llIllIlIllIlIl(item2) && llIllIlIllIlll(item2.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[2]]) ? 1 : 0)) {
                "".length();
                if ((((121 ^ 56) ^ (247 ^ 142)) & (((((89 + 120) - 83) + 24) ^ (((111 + 12) - 17) + 68)) ^ (-" ".length()))) == "   ".length()) {
                    return null;
                }
            } else {
                ItemEquipmentStats equipment = itemManager.getItemStats(item2.getId(), (boolean) lIlIIlllIIII[0]).getEquipment();
                double a2 = C0043r.a(equipment.getStr(), 1.0d, equipment.getAstab(), 1.0d, enumC0040o.aO().getDefenceLevel(), enumC0040o.aO().getStabDef(), equipment.getAspeed());
                if (llIllIlllIllII(llIllIlllIllll(a2, d))) {
                    item = item2;
                    d = a2;
                }
                "".length();
                if (!((true ^ true) ^ (true ^ true))) {
                    return null;
                }
            }
        }
        return item;
    }

    public static List<Item> a(WeaponStyle weaponStyle) {
        Static.getItemManager();
        return (List) aW().stream().filter(item -> {
            if (llIllIlIlllIIl(WeaponMap.StyleMap.get(Integer.valueOf(item.getId())), weaponStyle)) {
                ?? r0 = lIlIIlllIIII[2];
                "".length();
                return "   ".length() >= (198 ^ 194) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIIlllIIII[0];
        }).collect(Collectors.toList());
    }

    private static boolean llIllIlIllIllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    public static int[] a(Item item, int[] iArr) {
        if (llIllIlIllIlll(Static.getItemManager().getItemStats(item.getId(), (boolean) lIlIIlllIIII[0]).getEquipment().isTwoHanded() ? 1 : 0)) {
            iArr[lIlIIlllIIII[6]] = lIlIIlllIIII[0];
        }
        iArr[lIlIIlllIIII[5]] = item.getId();
        return iArr;
    }

    private static String llIllIlIllIIII(String lllllllllllllllIllIlIlIlIIlIIlII, String lllllllllllllllIllIlIlIlIIlIIIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIlIlIIlIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIllIlIlIlIIlIIIll.toCharArray();
        int lllllllllllllllIllIlIlIlIIlIIIII = lIlIIlllIIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIIlllIIII[0];
        while (llIllIlIllIlII(i, length)) {
            char lllllllllllllllIllIlIlIlIIlIIlIl = charArray2[i];
            sb.append((char) (lllllllllllllllIllIlIlIlIIlIIlIl ^ charArray[lllllllllllllllIllIlIlIlIIlIIIII % charArray.length]));
            "".length();
            lllllllllllllllIllIlIlIlIIlIIIII++;
            i++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIllIlllIllIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    public static Item aX() {
        Static.getItemManager();
        return (Item) ((List) aW().stream().filter(item -> {
            return item.getName().toLowerCase().contains(lIlIIllIllll[lIlIIlllIIII[15]]);
        }).collect(Collectors.toList())).get(lIlIIlllIIII[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public static int[] aS() {
        int i;
        ItemManager itemManager = Static.getItemManager();
        int[] iArr = new int[lIlIIlllIIII[1]];
        int[] a = a(Inventory.getAll().stream().mapToInt(item -> {
            return item.getId();
        }).toArray(), Equipment.getAll().stream().mapToInt(item2 -> {
            return item2.getId();
        }).toArray());
        EquipmentInventorySlot[] values = EquipmentInventorySlot.values();
        int length = values.length;
        int i2 = lIlIIlllIIII[0];
        while (llIllIlIllIlII(i2, length)) {
            EquipmentInventorySlot equipmentInventorySlot = values[i2];
            Item fromSlot = Equipment.fromSlot(equipmentInventorySlot);
            int slotIdx = equipmentInventorySlot.getSlotIdx();
            if (llIllIlIllIlIl(fromSlot)) {
                i = fromSlot.getId();
                "".length();
                if (" ".length() == 0) {
                    return null;
                }
            } else {
                i = lIlIIlllIIII[0];
            }
            iArr[slotIdx] = i;
            i2++;
            "".length();
            if (((((67 + 21) - (-42)) + 15) ^ (((69 + 105) - 94) + 68)) <= 0) {
                return null;
            }
        }
        int length2 = a.length;
        int i3 = lIlIIlllIIII[0];
        while (llIllIlIllIlII(i3, length2)) {
            int i4 = a[i3];
            ItemStats itemStats = itemManager.getItemStats(i4, (boolean) lIlIIlllIIII[0]);
            if (llIllIlIllIlIl(itemStats)) {
                if (llIllIlIllIllI(itemStats.isEquipable() ? 1 : 0)) {
                    "".length();
                    if (" ".length() < ("   ".length() & ("   ".length() ^ (-1)))) {
                        return null;
                    }
                } else {
                    int slot = itemStats.getEquipment().getSlot();
                    if (llIllIlIllIllI(iArr[slot])) {
                        iArr[slot] = i4;
                    }
                    ItemStats itemStats2 = itemManager.getItemStats(iArr[slot], (boolean) lIlIIlllIIII[0]);
                    if (llIllIlIllIlII(itemStats2.getEquipment().getRstr(), itemStats.getEquipment().getRstr())) {
                        iArr[slot] = i4;
                        "".length();
                        if ((((22 ^ 63) ^ (28 ^ 8)) & (((((49 + 116) - 94) + 108) ^ (((106 + 107) - 172) + 101)) ^ (-" ".length()))) != 0) {
                            return null;
                        }
                    } else if (llIllIlIllIlII(itemStats2.getEquipment().getArange(), itemStats.getEquipment().getArange())) {
                        iArr[slot] = i4;
                    }
                }
            }
            i3++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return iArr;
    }

    private static boolean llIllIlIllIlIl(Object obj) {
        return obj != null;
    }
}
