package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

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
@TaskDesc(name = "Handling Gear")
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.r  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/r.class */
public class r extends Task {
    private static /* synthetic */ String[] llIIlIIlllIl;
    private final /* synthetic */ SquireGorillaPlugin ab;
    private final /* synthetic */ SquireGorillaConfig ac;
    private static /* synthetic */ int[] llIIlIIllllI;

    private static boolean lllllIlIIlIIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lllllIlIIIlllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    public boolean a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        int[] iArr;
        EquipmentSetup equipmentSetup = (EquipmentSetup) configStorageBox.selected(EquipmentSetup.class);
        if (lllllIlIIlIIII(equipmentSetup)) {
            iArr = equipmentSetup.getIds();
            "".length();
            if (((true ^ true) ^ (true ^ true)) != ((true ^ true) ^ (true ^ true))) {
                return ((((62 + 152) - 168) + 197) ^ (((97 + 71) - 91) + 108)) & (((186 ^ 137) ^ (246 ^ 143)) ^ (-" ".length()));
            }
        } else {
            iArr = new int[llIIlIIllllI[0]];
        }
        List all = Inventory.getAll(iArr);
        if (lllllIlIIIlllI(all.isEmpty() ? 1 : 0)) {
            return llIIlIIllllI[0];
        }
        int lllllllllllllllIlIIllllllllIllIl = llIIlIIllllI[0];
        while (lllllIlIIlIlII(lllllllllllllllIlIIllllllllIllIl, Math.min(all.size(), llIIlIIllllI[8]))) {
            ((Item) all.get(lllllllllllllllIlIIllllllllIllIl)).interact(str -> {
                if (!lllllIlIIlIIII(str) || (lllllIlIIlIIIl(str.equals(llIIlIIlllIl[llIIlIIllllI[9]]) ? 1 : 0) && lllllIlIIlIIIl(str.equals(llIIlIIlllIl[llIIlIIllllI[10]]) ? 1 : 0) && !lllllIlIIIlllI(str.equals(llIIlIIlllIl[llIIlIIllllI[8]]) ? 1 : 0))) {
                    return llIIlIIllllI[0];
                }
                ?? r0 = llIIlIIllllI[1];
                "".length();
                return "   ".length() != "   ".length() ? ((((48 + 39) - (-6)) + 66) ^ (((124 + 107) - 84) + 36)) & (((5 ^ 69) ^ (249 ^ 145)) ^ (-" ".length())) : r0;
            });
            lllllllllllllllIlIIllllllllIllIl++;
            "".length();
            if (" ".length() == 0) {
                return ((229 ^ 167) ^ (125 ^ 38)) & (((190 ^ 152) ^ (169 ^ 150)) ^ (-" ".length()));
            }
        }
        return llIIlIIllllI[1];
    }

    private static boolean lllllIlIIlIIll(int i, int i2) {
        return i > i2;
    }

    private static void lllllIlIIIlIll() {
        llIIlIIlllIl = new String[llIIlIIllllI[19]];
        llIIlIIlllIl[llIIlIIllllI[0]] = lllllIlIIIlIII("oMuQM5/4X1M=", "iPwst");
        llIIlIIlllIl[llIIlIIllllI[1]] = lllllIlIIIlIIl("si4FjrNT2ko=", "HQzQt");
        llIIlIIlllIl[llIIlIIllllI[4]] = lllllIlIIIlIIl("jFycXmogJPk=", "gGfIP");
        llIIlIIlllIl[llIIlIIllllI[5]] = lllllIlIIIlIII("uu2mh7LOfLI=", "AXsoy");
        llIIlIIlllIl[llIIlIIllllI[6]] = lllllIlIIIlIlI("EDkYKRM6", "QMlHp");
        llIIlIIlllIl[llIIlIIllllI[7]] = lllllIlIIIlIIl("CoBjo2JpvMQ=", "OXMaO");
        llIIlIIlllIl[llIIlIIllllI[9]] = lllllIlIIIlIII("6nfgxIucGfY=", "QhKrc");
        llIIlIIlllIl[llIIlIIllllI[10]] = lllllIlIIIlIII("/Gpcwi8KkcU=", "PVgyj");
        llIIlIIlllIl[llIIlIIllllI[8]] = lllllIlIIIlIIl("Flsf8KnKC3E=", "EmTgB");
        llIIlIIlllIl[llIIlIIllllI[11]] = lllllIlIIIlIlI("JDkMOg1wNBg8GQ==", "PVtSn");
        llIIlIIlllIl[llIIlIIllllI[12]] = lllllIlIIIlIIl("rm05oiCvD0oe0YxJ0psVbw==", "pClTX");
        llIIlIIlllIl[llIIlIIllllI[13]] = lllllIlIIIlIlI("Hy4kIDEDIj8vdQsgMg==", "lOVAU");
        llIIlIIlllIl[llIIlIIllllI[14]] = lllllIlIIIlIII("HSsY+fvlypQ=", "ouyvO");
        llIIlIIlllIl[llIIlIIllllI[15]] = lllllIlIIIlIII("z/p7peExbnc=", "nQQSW");
        llIIlIIlllIl[llIIlIIllllI[16]] = lllllIlIIIlIII("0cQeTpSNr6w=", "swWcC");
        llIIlIIlllIl[llIIlIIllllI[17]] = lllllIlIIIlIIl("YfpPbNs2iis=", "cMNAQ");
        llIIlIIlllIl[llIIlIIllllI[18]] = lllllIlIIIlIII("QZguCkGMtMU=", "goIJr");
    }

    private static boolean lllllIlIIlIIIl(int i) {
        return i == 0;
    }

    private static String lllllIlIIIlIlI(String lllllllllllllllIlIIlllllllIlIlll, String lllllllllllllllIlIIlllllllIlIllI) {
        String lllllllllllllllIlIIlllllllIlIlll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlllllllIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlllllllIlIlIl = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIlllllllIlIllI.toCharArray();
        int lllllllllllllllIlIIlllllllIlIIll = llIIlIIllllI[0];
        char[] charArray2 = lllllllllllllllIlIIlllllllIlIlll2.toCharArray();
        int length = charArray2.length;
        int i = llIIlIIllllI[0];
        while (lllllIlIIlIlII(i, length)) {
            char lllllllllllllllIlIIlllllllIllIII = charArray2[i];
            lllllllllllllllIlIIlllllllIlIlIl.append((char) (lllllllllllllllIlIIlllllllIllIII ^ charArray[lllllllllllllllIlIIlllllllIlIIll % charArray.length]));
            "".length();
            lllllllllllllllIlIIlllllllIlIIll++;
            i++;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIlllllllIlIlIl);
    }

    static {
        lllllIlIIIllII();
        lllllIlIIIlIll();
    }

    private static boolean lllllIlIIlIIII(Object obj) {
        return obj != null;
    }

    private static boolean lllllIlIIlIlII(int i, int i2) {
        return i < i2;
    }

    @Inject
    public r(SquireGorillaPlugin squireGorillaPlugin, SquireGorillaConfig squireGorillaConfig) {
        this.ab = squireGorillaPlugin;
        this.ac = squireGorillaConfig;
    }

    private static String lllllIlIIIlIII(String lllllllllllllllIlIIlllllllIIIIlI, String lllllllllllllllIlIIlllllllIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlllllllIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllllllIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlIIllllI[4], lllllllllllllllIlIIlllllllIIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllllllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlllllllIIIIll) {
            lllllllllllllllIlIIlllllllIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIlIIIllIl(Object obj) {
        return obj == null;
    }

    private static void lllllIlIIIllII() {
        llIIlIIllllI = new int[20];
        llIIlIIllllI[0] = (107 ^ 34) & ((87 ^ 30) ^ (-1));
        llIIlIIllllI[1] = " ".length();
        llIIlIIllllI[2] = 28 ^ 46;
        llIIlIIllllI[3] = 43 ^ 53;
        llIIlIIllllI[4] = "  ".length();
        llIIlIIllllI[5] = "   ".length();
        llIIlIIllllI[6] = (((27 + 79) - 4) + 44) ^ (((77 + 42) - 77) + 108);
        llIIlIIllllI[7] = (40 ^ 90) ^ (243 ^ 132);
        llIIlIIllllI[8] = 134 ^ 142;
        llIIlIIllllI[9] = 76 ^ 74;
        llIIlIIllllI[10] = 156 ^ 155;
        llIIlIIllllI[11] = (102 ^ 109) ^ "  ".length();
        llIIlIIllllI[12] = (90 ^ 99) ^ (131 ^ 176);
        llIIlIIllllI[13] = (175 ^ 148) ^ (89 ^ 105);
        llIIlIIllllI[14] = (168 ^ 183) ^ (210 ^ 193);
        llIIlIIllllI[15] = 91 ^ 86;
        llIIlIIllllI[16] = 133 ^ 139;
        llIIlIIllllI[17] = 5 ^ 10;
        llIIlIIllllI[18] = (((86 + 55) - 55) + 71) ^ (((12 + 94) - (-27)) + 8);
        llIIlIIllllI[19] = 83 ^ 66;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v103, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    public boolean run() {
        NPC interacting;
        int i;
        int i2;
        ConfigStorageBox<EquipmentSetup> ranged;
        if (lllllIlIIIllIl(Players.getLocal().getInteracting())) {
            interacting = NPCs.getNearest(npc -> {
                if (lllllIlIIIllll(npc.getInteracting(), Players.getLocal())) {
                    ?? r0 = llIIlIIllllI[1];
                    "".length();
                    return "   ".length() == 0 ? ((85 ^ 112) ^ (36 ^ 68)) & (((((115 + 83) - 193) + 212) ^ (((22 + 42) - (-63)) + 29)) ^ (-" ".length())) : r0;
                }
                return llIIlIIllllI[0];
            });
            "".length();
            if (0 != 0) {
                return ((77 ^ 101) ^ (154 ^ 164)) & (((239 ^ 162) ^ (53 ^ 110)) ^ (-" ".length()));
            }
        } else {
            interacting = Players.getLocal().getInteracting();
        }
        NPC npc2 = interacting;
        if (lllllIlIIIllIl(npc2)) {
            return llIIlIIllllI[0];
        }
        c a = this.ab.a(npc2);
        if (!lllllIlIIIllIl(a) && !lllllIlIIIllIl(a.A())) {
            if (lllllIlIIIlllI(((EquipmentSetup) this.ac.melee().selected(EquipmentSetup.class)).contains(itemComposition -> {
                String name = itemComposition.getName();
                if (lllllIlIIIllIl(name)) {
                    return llIIlIIllllI[0];
                }
                String lowerCase = name.toLowerCase();
                if (lllllIlIIlIIIl(lowerCase.contains(llIIlIIlllIl[llIIlIIllllI[16]]) ? 1 : 0) && lllllIlIIlIIIl(lowerCase.contains(llIIlIIlllIl[llIIlIIllllI[17]]) ? 1 : 0) && !lllllIlIIIlllI(lowerCase.contains(llIIlIIlllIl[llIIlIIllllI[18]]) ? 1 : 0)) {
                    return llIIlIIllllI[0];
                }
                ?? r0 = llIIlIIllllI[1];
                "".length();
                return (-((((121 + 117) - 156) + 91) ^ (((11 + 11) - (-29)) + 118))) >= 0 ? ((((123 + 72) - 84) + 16) ^ (164 ^ 128)) & (((23 ^ 124) ^ (167 ^ 151)) ^ (-" ".length())) : r0;
            }) ? 1 : 0) && lllllIlIIIllll(a.A(), HeadIcon.MAGIC)) {
                i = llIIlIIllllI[1];
                "".length();
                if (" ".length() > " ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                i = llIIlIIllllI[0];
            }
            int i3 = i;
            if (lllllIlIIIllll(a.A(), HeadIcon.MELEE)) {
                i2 = llIIlIIllllI[1];
                "".length();
                if ((-" ".length()) >= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                i2 = llIIlIIllllI[0];
            }
            int i4 = i2;
            if (lllllIlIIIlllI(i4) && lllllIlIIlIIII(Equipment.fromSlot(EquipmentInventorySlot.SHIELD)) && lllllIlIIlIIIl(Inventory.getFreeSlots())) {
                Item first = Inventory.getFirst(item -> {
                    String[] strArr = new String[llIIlIIllllI[1]];
                    strArr[llIIlIIllllI[0]] = llIIlIIlllIl[llIIlIIllllI[15]];
                    return item.hasAction(strArr);
                });
                if (lllllIlIIlIIII(first)) {
                    first.interact(llIIlIIlllIl[llIIlIIllllI[0]]);
                    return llIIlIIllllI[1];
                }
                Item first2 = Inventory.getFirst(item2 -> {
                    String[] strArr = new String[llIIlIIllllI[1]];
                    strArr[llIIlIIllllI[0]] = llIIlIIlllIl[llIIlIIllllI[14]];
                    return item2.hasAction(strArr);
                });
                if (lllllIlIIlIIII(first2)) {
                    first2.interact(llIIlIIlllIl[llIIlIIllllI[1]]);
                    return llIIlIIllllI[1];
                }
                return llIIlIIllllI[0];
            } else if (lllllIlIIlIIIl(i4) && lllllIlIIlIIlI(Combat.getSpecEnergy(), llIIlIIllllI[2]) && lllllIlIIlIIll(Combat.getMissingHealth(), llIIlIIllllI[3]) && lllllIlIIIlllI(Inventory.contains(item3 -> {
                return item3.getName().toLowerCase().contains(llIIlIIlllIl[llIIlIIllllI[13]]);
            }) ? 1 : 0)) {
                Inventory.getFirst(item4 -> {
                    return item4.getName().toLowerCase().contains(llIIlIIlllIl[llIIlIIllllI[12]]);
                }).interact(llIIlIIlllIl[llIIlIIllllI[4]]);
                Combat.toggleSpec();
                npc2.interact(llIIlIIlllIl[llIIlIIllllI[5]]);
                return llIIlIIllllI[1];
            } else if (lllllIlIIIlllI(i4) && lllllIlIIlIIlI(Combat.getSpecEnergy(), llIIlIIllllI[2]) && lllllIlIIlIIll(Combat.getMissingHealth(), llIIlIIllllI[3]) && lllllIlIIIlllI(Equipment.contains(item5 -> {
                return item5.getName().toLowerCase().contains(llIIlIIlllIl[llIIlIIllllI[11]]);
            }) ? 1 : 0)) {
                Combat.toggleSpec();
                npc2.interact(llIIlIIlllIl[llIIlIIllllI[6]]);
                return llIIlIIllllI[1];
            } else {
                if (!lllllIlIIlIIIl(i4) || lllllIlIIIlllI(i3)) {
                    ranged = this.ac.ranged();
                    "".length();
                    if ((((((145 + 34) - (-3)) + 45) ^ (((36 + 59) - 12) + 77)) & (((205 ^ 159) ^ (79 ^ 94)) ^ (-" ".length()))) < 0) {
                        return ((30 ^ 126) ^ (26 ^ 38)) & (((212 ^ 129) ^ (39 ^ 46)) ^ (-" ".length()));
                    }
                } else {
                    ranged = this.ac.melee();
                }
                if (lllllIlIIIlllI(a(ranged) ? 1 : 0)) {
                    npc2.interact(llIIlIIlllIl[llIIlIIllllI[7]]);
                    return llIIlIIllllI[1];
                }
                return llIIlIIllllI[0];
            }
        }
        return llIIlIIllllI[0];
    }

    private static String lllllIlIIIlIIl(String lllllllllllllllIlIIllllllIllIlIl, String lllllllllllllllIlIIllllllIllIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIIllllllIlllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllllIllIlII.getBytes(StandardCharsets.UTF_8)), llIIlIIllllI[8]), "DES");
            Cipher lllllllllllllllIlIIllllllIllIlll = Cipher.getInstance("DES");
            lllllllllllllllIlIIllllllIllIlll.init(llIIlIIllllI[4], lllllllllllllllIlIIllllllIlllIII);
            return new String(lllllllllllllllIlIIllllllIllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllllIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllllllIllIllI) {
            lllllllllllllllIlIIllllllIllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIlIIIllll(Object obj, Object obj2) {
        return obj == obj2;
    }
}
