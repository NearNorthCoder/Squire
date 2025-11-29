/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.HeadIcon
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gorillas.SquireGorillaConfig;
import gg.squire.gorillas.SquireGorillaPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.HeadIcon;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.c;

@TaskDesc(name="Handling Gear")
public class r
extends Task {
    private static /* synthetic */ String[] llIIlIIlllIl;
    private final /* synthetic */ SquireGorillaPlugin ab;
    private final /* synthetic */ SquireGorillaConfig ac;
    private static /* synthetic */ int[] llIIlIIllllI;

    private static boolean lllllIlIIlIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllllIlIIIlllI(int n2) {
        return n2 != 0;
    }

    public boolean a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        int[] lllllllllllllllIlIIllllllllIllll;
        List lllllllllllllllIlIIllllllllIlllI;
        int[] nArray;
        EquipmentSetup equipmentSetup = (EquipmentSetup)configStorageBox.selected(EquipmentSetup.class);
        if (r.lllllIlIIlIIII(equipmentSetup)) {
            nArray = equipmentSetup.getIds();
            0;
            if ((0xAD ^ 0xB3 ^ (0x48 ^ 0x52)) != (0xD2 ^ 0x9F ^ (0x51 ^ 0x18))) {
                return ((62 + 152 - 168 + 197 ^ 97 + 71 - 91 + 108) & (0xBA ^ 0x89 ^ (0xF6 ^ 0x8F) ^ -1)) != 0;
            }
        } else {
            nArray = new int[llIIlIIllllI[0]];
        }
        if (r.lllllIlIIIlllI((lllllllllllllllIlIIllllllllIlllI = Inventory.getAll((int[])(lllllllllllllllIlIIllllllllIllll = nArray))).isEmpty() ? 1 : 0)) {
            return llIIlIIllllI[0];
        }
        int lllllllllllllllIlIIllllllllIllIl = llIIlIIllllI[0];
        while (r.lllllIlIIlIlII(lllllllllllllllIlIIllllllllIllIl, Math.min(lllllllllllllllIlIIllllllllIlllI.size(), llIIlIIllllI[8]))) {
            Item lllllllllllllllIlIIllllllllIllII = (Item)lllllllllllllllIlIIllllllllIlllI.get(lllllllllllllllIlIIllllllllIllIl);
            lllllllllllllllIlIIllllllllIllII.interact(string -> {
                int n2;
                if (r.lllllIlIIlIIII(string) && (!r.lllllIlIIlIIIl(string.equals(llIIlIIlllIl[llIIlIIllllI[9]]) ? 1 : 0) || !r.lllllIlIIlIIIl(string.equals(llIIlIIlllIl[llIIlIIllllI[10]]) ? 1 : 0) || r.lllllIlIIIlllI(string.equals(llIIlIIlllIl[llIIlIIllllI[8]]) ? 1 : 0))) {
                    n2 = llIIlIIllllI[1];
                    0;
                    if (3 != 3) {
                        return ((48 + 39 - -6 + 66 ^ 124 + 107 - 84 + 36) & (5 ^ 0x45 ^ (0xF9 ^ 0x91) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIlIIllllI[0];
                }
                return n2 != 0;
            });
            ++lllllllllllllllIlIIllllllllIllIl;
            0;
            if (1 != 0) continue;
            return ((0xE5 ^ 0xA7 ^ (0x7D ^ 0x26)) & (0xBE ^ 0x98 ^ (0xA9 ^ 0x96) ^ -1)) != 0;
        }
        return llIIlIIllllI[1];
    }

    private static boolean lllllIlIIlIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static void lllllIlIIIlIll() {
        llIIlIIlllIl = new String[llIIlIIllllI[19]];
        r.llIIlIIlllIl[r.llIIlIIllllI[0]] = r."Eat";
        r.llIIlIIlllIl[r.llIIlIIllllI[1]] = r."Drop";
        r.llIIlIIlllIl[r.llIIlIIllllI[4]] = r."Wield";
        r.llIIlIIlllIl[r.llIIlIIllllI[5]] = r."Attack";
        r.llIIlIIlllIl[r.llIIlIIllllI[6]] = r."Attack";
        r.llIIlIIlllIl[r.llIIlIIllllI[7]] = r."Attack";
        r.llIIlIIlllIl[r.llIIlIIllllI[9]] = r."Wield";
        r.llIIlIIlllIl[r.llIIlIIllllI[10]] = r."Wear";
        r.llIIlIIlllIl[r.llIIlIIllllI[8]] = r."Equip";
        r.llIIlIIlllIl[r.llIIlIIllllI[11]] = r."toxic blow";
        r.llIIlIIlllIl[r.llIIlIIllllI[12]] = r."saradomin god";
        r.llIIlIIlllIl[r.llIIlIIllllI[13]] = r."saradomin god";
        r.llIIlIIlllIl[r.llIIlIIllllI[14]] = r."Drink";
        r.llIIlIIlllIl[r.llIIlIIllllI[15]] = r."Eat";
        r.llIIlIIlllIl[r.llIIlIIllllI[16]] = r."trident";
        r.llIIlIIlllIl[r.llIIlIIllllI[17]] = r."staff";
        r.llIIlIIlllIl[r.llIIlIIllllI[18]] = r."tumeken";
    }

    private static boolean lllllIlIIlIIIl(int n2) {
        return n2 == 0;
    }

    private static String lllllIlIIIlIlI(String lllllllllllllllIlIIlllllllIlIIlI, String lllllllllllllllIlIIlllllllIlIllI) {
        lllllllllllllllIlIIlllllllIlIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlllllllIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlllllllIlIlIl = new StringBuilder();
        char[] lllllllllllllllIlIIlllllllIlIlII = lllllllllllllllIlIIlllllllIlIllI.toCharArray();
        int lllllllllllllllIlIIlllllllIlIIll = llIIlIIllllI[0];
        char[] lllllllllllllllIlIIlllllllIIllIl = lllllllllllllllIlIIlllllllIlIIlI.toCharArray();
        int lllllllllllllllIlIIlllllllIIllII = lllllllllllllllIlIIlllllllIIllIl.length;
        int lllllllllllllllIlIIlllllllIIlIll = llIIlIIllllI[0];
        while (r.lllllIlIIlIlII(lllllllllllllllIlIIlllllllIIlIll, lllllllllllllllIlIIlllllllIIllII)) {
            char lllllllllllllllIlIIlllllllIllIII = lllllllllllllllIlIIlllllllIIllIl[lllllllllllllllIlIIlllllllIIlIll];
            lllllllllllllllIlIIlllllllIlIlIl.append((char)(lllllllllllllllIlIIlllllllIllIII ^ lllllllllllllllIlIIlllllllIlIlII[lllllllllllllllIlIIlllllllIlIIll % lllllllllllllllIlIIlllllllIlIlII.length]));
            0;
            ++lllllllllllllllIlIIlllllllIlIIll;
            ++lllllllllllllllIlIIlllllllIIlIll;
            0;
            if (2 >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlllllllIlIlIl);
    }

    static {
        r.lllllIlIIIllII();
        r.lllllIlIIIlIll();
    }

    private static boolean lllllIlIIlIIII(Object object) {
        return object != null;
    }

    private static boolean lllllIlIIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public r(SquireGorillaPlugin squireGorillaPlugin, SquireGorillaConfig squireGorillaConfig) {
        this.ab = squireGorillaPlugin;
        this.ac = squireGorillaConfig;
    }

    private static String lllllIlIIIlIII(String lllllllllllllllIlIIlllllllIIIIII, String lllllllllllllllIlIIlllllllIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlllllllIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllllllIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlllllllIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlllllllIIIlII.init(llIIlIIllllI[4], lllllllllllllllIlIIlllllllIIIlIl);
            return new String(lllllllllllllllIlIIlllllllIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllllllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlllllllIIIIll) {
            lllllllllllllllIlIIlllllllIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIlIIIllIl(Object object) {
        return object == null;
    }

    private static void lllllIlIIIllII() {
        llIIlIIllllI = new int[20];
        r.llIIlIIllllI[0] = (0x6B ^ 0x22) & ~(0x57 ^ 0x1E);
        r.llIIlIIllllI[1] = 1;
        r.llIIlIIllllI[2] = 0x1C ^ 0x2E;
        r.llIIlIIllllI[3] = 0x2B ^ 0x35;
        r.llIIlIIllllI[4] = 2;
        r.llIIlIIllllI[5] = 3;
        r.llIIlIIllllI[6] = 27 + 79 - 4 + 44 ^ 77 + 42 - 77 + 108;
        r.llIIlIIllllI[7] = 0x28 ^ 0x5A ^ (0xF3 ^ 0x84);
        r.llIIlIIllllI[8] = 0x86 ^ 0x8E;
        r.llIIlIIllllI[9] = 0x4C ^ 0x4A;
        r.llIIlIIllllI[10] = 0x9C ^ 0x9B;
        r.llIIlIIllllI[11] = 0x66 ^ 0x6D ^ 2;
        r.llIIlIIllllI[12] = 0x5A ^ 0x63 ^ (0x83 ^ 0xB0);
        r.llIIlIIllllI[13] = 0xAF ^ 0x94 ^ (0x59 ^ 0x69);
        r.llIIlIIllllI[14] = 0xA8 ^ 0xB7 ^ (0xD2 ^ 0xC1);
        r.llIIlIIllllI[15] = 0x5B ^ 0x56;
        r.llIIlIIllllI[16] = 0x85 ^ 0x8B;
        r.llIIlIIllllI[17] = 5 ^ 0xA;
        r.llIIlIIllllI[18] = 86 + 55 - 55 + 71 ^ 12 + 94 - -27 + 8;
        r.llIIlIIllllI[19] = 0x53 ^ 0x42;
    }

    public boolean run() {
        ConfigStorageBox<EquipmentSetup> configStorageBox;
        int lllllllllllllllIlIIllllllllllIlI;
        int n2;
        int lllllllllllllllIlIIllllllllllIll;
        int n3;
        r lllllllllllllllIlIIllllllllllllI;
        NPC lllllllllllllllIlIIlllllllllllIl;
        NPC nPC2;
        if (r.lllllIlIIIllIl(Players.getLocal().getInteracting())) {
            nPC2 = NPCs.getNearest(nPC -> {
                boolean bl;
                if (r.lllllIlIIIllll(nPC.getInteracting(), Players.getLocal())) {
                    bl = llIIlIIllllI[1];
                    0;
                    if (3 == 0) {
                        return ((0x55 ^ 0x70 ^ (0x24 ^ 0x44)) & (115 + 83 - 193 + 212 ^ 22 + 42 - -63 + 29 ^ -1)) != 0;
                    }
                } else {
                    bl = llIIlIIllllI[0];
                }
                return bl;
            });
            0;
            if (null != null) {
                return ((0x4D ^ 0x65 ^ (0x9A ^ 0xA4)) & (0xEF ^ 0xA2 ^ (0x35 ^ 0x6E) ^ -1)) != 0;
            }
        } else {
            nPC2 = (NPC)Players.getLocal().getInteracting();
        }
        if (r.lllllIlIIIllIl(lllllllllllllllIlIIlllllllllllIl = nPC2)) {
            return llIIlIIllllI[0];
        }
        c lllllllllllllllIlIIlllllllllllII = lllllllllllllllIlIIllllllllllllI.ab.a(lllllllllllllllIlIIlllllllllllIl);
        if (r.lllllIlIIIllIl(lllllllllllllllIlIIlllllllllllII)) {
            return llIIlIIllllI[0];
        }
        if (r.lllllIlIIIllIl(lllllllllllllllIlIIlllllllllllII.A())) {
            return llIIlIIllllI[0];
        }
        if (r.lllllIlIIIlllI(((EquipmentSetup)lllllllllllllllIlIIllllllllllllI.ac.melee().selected(EquipmentSetup.class)).contains(itemComposition -> {
            boolean bl;
            void lllllllllllllllIlIIllllllllIIlIl;
            String string = itemComposition.getName();
            if (r.lllllIlIIIllIl(string)) {
                return llIIlIIllllI[0];
            }
            String lllllllllllllllIlIIllllllllIIlII = lllllllllllllllIlIIllllllllIIlIl.toLowerCase();
            if (!r.lllllIlIIlIIIl(lllllllllllllllIlIIllllllllIIlII.contains(llIIlIIlllIl[llIIlIIllllI[16]]) ? 1 : 0) || !r.lllllIlIIlIIIl(lllllllllllllllIlIIllllllllIIlII.contains(llIIlIIlllIl[llIIlIIllllI[17]]) ? 1 : 0) || r.lllllIlIIIlllI(lllllllllllllllIlIIllllllllIIlII.contains(llIIlIIlllIl[llIIlIIllllI[18]]) ? 1 : 0)) {
                bl = llIIlIIllllI[1];
                0;
                if (-(121 + 117 - 156 + 91 ^ 11 + 11 - -29 + 118) >= 0) {
                    return ((123 + 72 - 84 + 16 ^ (0xA4 ^ 0x80)) & (0x17 ^ 0x7C ^ (0xA7 ^ 0x97) ^ -1)) != 0;
                }
            } else {
                bl = llIIlIIllllI[0];
            }
            return bl;
        }) ? 1 : 0) && r.lllllIlIIIllll(lllllllllllllllIlIIlllllllllllII.A(), HeadIcon.MAGIC)) {
            n3 = llIIlIIllllI[1];
            0;
            if (1 > 1) {
                return ((0xE0 ^ 0xB0) & ~(0x29 ^ 0x79)) != 0;
            }
        } else {
            n3 = lllllllllllllllIlIIllllllllllIll = llIIlIIllllI[0];
        }
        if (r.lllllIlIIIllll(lllllllllllllllIlIIlllllllllllII.A(), HeadIcon.MELEE)) {
            n2 = llIIlIIllllI[1];
            0;
            if (-1 >= 0) {
                return ((0xAB ^ 0x97) & ~(0x76 ^ 0x4A)) != 0;
            }
        } else {
            n2 = llIIlIIllllI[0];
        }
        if (r.lllllIlIIIlllI(lllllllllllllllIlIIllllllllllIlI = n2) && r.lllllIlIIlIIII(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD)) && r.lllllIlIIlIIIl(Inventory.getFreeSlots())) {
            Item lllllllllllllllIlIIllllllllllIIl = Inventory.getFirst(item -> {
                String[] stringArray = new String[llIIlIIllllI[1]];
                stringArray[r.llIIlIIllllI[0]] = llIIlIIlllIl[llIIlIIllllI[15]];
                return item.hasAction(stringArray);
            });
            if (r.lllllIlIIlIIII(lllllllllllllllIlIIllllllllllIIl)) {
                lllllllllllllllIlIIllllllllllIIl.interact(llIIlIIlllIl[llIIlIIllllI[0]]);
                return llIIlIIllllI[1];
            }
            Item lllllllllllllllIlIIllllllllllIII = Inventory.getFirst(item -> {
                String[] stringArray = new String[llIIlIIllllI[1]];
                stringArray[r.llIIlIIllllI[0]] = llIIlIIlllIl[llIIlIIllllI[14]];
                return item.hasAction(stringArray);
            });
            if (r.lllllIlIIlIIII(lllllllllllllllIlIIllllllllllIII)) {
                lllllllllllllllIlIIllllllllllIII.interact(llIIlIIlllIl[llIIlIIllllI[1]]);
                return llIIlIIllllI[1];
            }
            return llIIlIIllllI[0];
        }
        if (r.lllllIlIIlIIIl(lllllllllllllllIlIIllllllllllIlI) && r.lllllIlIIlIIlI(Combat.getSpecEnergy(), llIIlIIllllI[2]) && r.lllllIlIIlIIll(Combat.getMissingHealth(), llIIlIIllllI[3]) && r.lllllIlIIIlllI(Inventory.contains(item -> item.getName().toLowerCase().contains(llIIlIIlllIl[llIIlIIllllI[13]])) ? 1 : 0)) {
            Item lllllllllllllllIlIIllllllllllIIl = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIIlIIlllIl[llIIlIIllllI[12]]));
            lllllllllllllllIlIIllllllllllIIl.interact(llIIlIIlllIl[llIIlIIllllI[4]]);
            Combat.toggleSpec();
            lllllllllllllllIlIIlllllllllllIl.interact(llIIlIIlllIl[llIIlIIllllI[5]]);
            return llIIlIIllllI[1];
        }
        if (r.lllllIlIIIlllI(lllllllllllllllIlIIllllllllllIlI) && r.lllllIlIIlIIlI(Combat.getSpecEnergy(), llIIlIIllllI[2]) && r.lllllIlIIlIIll(Combat.getMissingHealth(), llIIlIIllllI[3]) && r.lllllIlIIIlllI(Equipment.contains(item -> item.getName().toLowerCase().contains(llIIlIIlllIl[llIIlIIllllI[11]])) ? 1 : 0)) {
            Combat.toggleSpec();
            lllllllllllllllIlIIlllllllllllIl.interact(llIIlIIlllIl[llIIlIIllllI[6]]);
            return llIIlIIllllI[1];
        }
        if (!r.lllllIlIIlIIIl(lllllllllllllllIlIIllllllllllIlI) || r.lllllIlIIIlllI(lllllllllllllllIlIIllllllllllIll)) {
            configStorageBox = lllllllllllllllIlIIllllllllllllI.ac.ranged();
            0;
            if (((145 + 34 - -3 + 45 ^ 36 + 59 - 12 + 77) & (0xCD ^ 0x9F ^ (0x4F ^ 0x5E) ^ -1)) < 0) {
                return ((0x1E ^ 0x7E ^ (0x1A ^ 0x26)) & (0xD4 ^ 0x81 ^ (0x27 ^ 0x2E) ^ -1)) != 0;
            }
        } else {
            configStorageBox = lllllllllllllllIlIIllllllllllllI.ac.melee();
        }
        if (r.lllllIlIIIlllI(lllllllllllllllIlIIllllllllllllI.a(configStorageBox) ? 1 : 0)) {
            lllllllllllllllIlIIlllllllllllIl.interact(llIIlIIlllIl[llIIlIIllllI[7]]);
            return llIIlIIllllI[1];
        }
        return llIIlIIllllI[0];
    }

    private static String lllllIlIIIlIIl(String lllllllllllllllIlIIllllllIllIIll, String lllllllllllllllIlIIllllllIllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIllllllIlllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllllIllIIlI.getBytes(StandardCharsets.UTF_8)), llIIlIIllllI[8]), "DES");
            Cipher lllllllllllllllIlIIllllllIllIlll = Cipher.getInstance("DES");
            lllllllllllllllIlIIllllllIllIlll.init(llIIlIIllllI[4], lllllllllllllllIlIIllllllIlllIII);
            return new String(lllllllllllllllIlIIllllllIllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllllIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllllllIllIllI) {
            lllllllllllllllIlIIllllllIllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIlIIIllll(Object object, Object object2) {
        return object == object2;
    }
}

