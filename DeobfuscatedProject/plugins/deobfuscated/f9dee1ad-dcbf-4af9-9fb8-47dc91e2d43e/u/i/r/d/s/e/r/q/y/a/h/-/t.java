/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import u.i.r.d.s.e.r.q.y.a.h.-.a;

@TaskDesc(name="Using blowpipe spec", priority=100)
public class t
extends Task {
    private static /* synthetic */ String[] llllIlIIlIIl;
    private static /* synthetic */ int[] llllIlIIlIlI;
    private final /* synthetic */ SquireAlchemicalHydraConfig aB;
    private /* synthetic */ String aC;
    private final /* synthetic */ a aA;

    private static String lIIlIIIIlIlIIII(String lllllllllllllllIIlIlIIlIlIIIlllI, String lllllllllllllllIIlIlIIlIlIIlIIlI) {
        lllllllllllllllIIlIlIIlIlIIIlllI = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlIlIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIIlIlIIlIIIl = new StringBuilder();
        char[] lllllllllllllllIIlIlIIlIlIIlIIII = lllllllllllllllIIlIlIIlIlIIlIIlI.toCharArray();
        int lllllllllllllllIIlIlIIlIlIIIllll = llllIlIIlIlI[0];
        char[] lllllllllllllllIIlIlIIlIlIIIlIIl = lllllllllllllllIIlIlIIlIlIIIlllI.toCharArray();
        int lllllllllllllllIIlIlIIlIlIIIlIII = lllllllllllllllIIlIlIIlIlIIIlIIl.length;
        int lllllllllllllllIIlIlIIlIlIIIIlll = llllIlIIlIlI[0];
        while (t.lIIlIIIIlIllIIl(lllllllllllllllIIlIlIIlIlIIIIlll, lllllllllllllllIIlIlIIlIlIIIlIII)) {
            char lllllllllllllllIIlIlIIlIlIIlIlII = lllllllllllllllIIlIlIIlIlIIIlIIl[lllllllllllllllIIlIlIIlIlIIIIlll];
            lllllllllllllllIIlIlIIlIlIIlIIIl.append((char)(lllllllllllllllIIlIlIIlIlIIlIlII ^ lllllllllllllllIIlIlIIlIlIIlIIII[lllllllllllllllIIlIlIIlIlIIIllll % lllllllllllllllIIlIlIIlIlIIlIIII.length]));
            0;
            ++lllllllllllllllIIlIlIIlIlIIIllll;
            ++lllllllllllllllIIlIlIIlIlIIIIlll;
            0;
            if (-(74 + 34 - 5 + 44 ^ 23 + 130 - 115 + 113) < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlIIlIlIIlIIIl);
    }

    private static void lIIlIIIIlIlIIll() {
        llllIlIIlIlI = new int[9];
        t.llllIlIIlIlI[0] = (0x6E ^ 0x3A) & ~(0x1D ^ 0x49);
        t.llllIlIIlIlI[1] = 0x4E ^ 0x7C;
        t.llllIlIIlIlI[2] = 0x94 ^ 0x9E;
        t.llllIlIIlIlI[3] = 1;
        t.llllIlIIlIlI[4] = 2;
        t.llllIlIIlIlI[5] = 3;
        t.llllIlIIlIlI[6] = 0xAC ^ 0xA8;
        t.llllIlIIlIlI[7] = 0x43 ^ 0x37 ^ (0x6B ^ 0x1A);
        t.llllIlIIlIlI[8] = 118 + 2 - -10 + 11 ^ 2 + 68 - 32 + 95;
    }

    private static boolean lIIlIIIIlIlIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIIIlIlIlII(Object object) {
        return object == null;
    }

    private static boolean lIIlIIIIlIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIIIIlIIllll(String lllllllllllllllIIlIlIIlIIlllllII, String lllllllllllllllIIlIlIIlIIlllllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIlIlIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIlIIlllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIIlIlIIIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIIlIlIIIIIII.init(llllIlIIlIlI[4], lllllllllllllllIIlIlIIlIlIIIIIIl);
            return new String(lllllllllllllllIIlIlIIlIlIIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlIIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIIlIIlllllll) {
            lllllllllllllllIIlIlIIlIIlllllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIlIlIlll(int n2, int n3) {
        return n2 <= n3;
    }

    public boolean run() {
        t lllllllllllllllIIlIlIIlIlIlIIIII;
        if (t.lIIlIIIIlIlIlII(this.aA.k())) {
            return llllIlIIlIlI[0];
        }
        if (t.lIIlIIIIlIlIlIl(lllllllllllllllIIlIlIIlIlIlIIIII.aA.k().Q() ? 1 : 0)) {
            return llllIlIIlIlI[0];
        }
        Item lllllllllllllllIIlIlIIlIlIIlllll = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (t.lIIlIIIIlIlIlII(lllllllllllllllIIlIlIIlIlIIlllll)) {
            return llllIlIIlIlI[0];
        }
        if (!t.lIIlIIIIlIlIllI(Combat.getSpecEnergy(), llllIlIIlIlI[1]) || t.lIIlIIIIlIlIlll(Combat.getMissingHealth(), llllIlIIlIlI[2])) {
            String[] stringArray = new String[llllIlIIlIlI[3]];
            stringArray[t.llllIlIIlIlI[0]] = lllllllllllllllIIlIlIIlIlIlIIIII.aC;
            if (t.lIIlIIIIlIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[llllIlIIlIlI[3]];
                stringArray2[t.llllIlIIlIlI[0]] = lllllllllllllllIIlIlIIlIlIlIIIII.aC;
                Inventory.getFirst((String[])stringArray2).interact(llllIlIIlIIl[llllIlIIlIlI[3]]);
            }
            return llllIlIIlIlI[0];
        }
        if (t.lIIlIIIIlIllIII(lllllllllllllllIIlIlIIlIlIIlllll.getName().contains(llllIlIIlIIl[llllIlIIlIlI[4]]) ? 1 : 0)) {
            String[] stringArray = new String[llllIlIIlIlI[3]];
            stringArray[t.llllIlIIlIlI[0]] = llllIlIIlIIl[llllIlIIlIlI[5]];
            Item lllllllllllllllIIlIlIIlIlIIllllI = Inventory.getFirst((String[])stringArray);
            lllllllllllllllIIlIlIIlIlIlIIIII.aC = lllllllllllllllIIlIlIIlIlIIlllll.getName();
            if (t.lIIlIIIIlIlIlII(lllllllllllllllIIlIlIIlIlIIllllI)) {
                return llllIlIIlIlI[0];
            }
            if (t.lIIlIIIIlIlIllI(Combat.getSpecEnergy(), llllIlIIlIlI[1]) && t.lIIlIIIIlIlIlIl(lllllllllllllllIIlIlIIlIlIlIIIII.aB.blowpipeSpec() ? 1 : 0)) {
                lllllllllllllllIIlIlIIlIlIIllllI.interact(llllIlIIlIIl[llllIlIIlIlI[6]]);
            }
            return llllIlIIlIlI[3];
        }
        if (t.lIIlIIIIlIlIlIl(Combat.isSpecEnabled() ? 1 : 0)) {
            return llllIlIIlIlI[0];
        }
        Combat.toggleSpec();
        return llllIlIIlIlI[3];
    }

    static {
        t.lIIlIIIIlIlIIll();
        t.lIIlIIIIlIlIIlI();
    }

    @Inject
    public t(a a2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.aC = llllIlIIlIIl[llllIlIIlIlI[0]];
        this.aA = a2;
        this.aB = squireAlchemicalHydraConfig;
    }

    private static boolean lIIlIIIIlIllIII(int n2) {
        return n2 == 0;
    }

    private static String lIIlIIIIlIlIIIl(String lllllllllllllllIIlIlIIlIIllIllll, String lllllllllllllllIIlIlIIlIIlllIIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIlIIlllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIlIIlllIIII.getBytes(StandardCharsets.UTF_8)), llllIlIIlIlI[8]), "DES");
            Cipher lllllllllllllllIIlIlIIlIIlllIIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIIlIIlllIIll.init(llllIlIIlIlI[4], lllllllllllllllIIlIlIIlIIlllIlII);
            return new String(lllllllllllllllIIlIlIIlIIlllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIlIIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIIlIIlllIIlI) {
            lllllllllllllllIIlIlIIlIIlllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIlIlIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIlIIIIlIlIIlI() {
        llllIlIIlIIl = new String[llllIlIIlIlI[7]];
        t.llllIlIIlIIl[t.llllIlIIlIlI[0]] = t."";
        t.llllIlIIlIIl[t.llllIlIIlIlI[3]] = t."Wield";
        t.llllIlIIlIIl[t.llllIlIIlIlI[4]] = t."blowpipe";
        t.llllIlIIlIIl[t.llllIlIIlIlI[5]] = t."Toxic blowpipe";
        t.llllIlIIlIIl[t.llllIlIIlIlI[6]] = t."Wield";
    }
}

