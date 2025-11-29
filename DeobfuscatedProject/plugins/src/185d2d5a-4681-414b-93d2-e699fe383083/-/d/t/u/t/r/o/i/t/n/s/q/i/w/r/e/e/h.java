/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Quest
 *  net.unethicalite.api.Interactable
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 */
package -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.b;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Quest;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Creating Rejuvenation Potions", priority=0x7FFFFFFF, blocking=true)
public class h
extends Task {
    private final /* synthetic */ b M;
    private static /* synthetic */ String[] lIlIlllllllll;
    private static /* synthetic */ int[] lIllIIIIIIIlI;
    private final /* synthetic */ SquireWintertodtConfig L;

    private static boolean llIIIIllllIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIlllIlllll(int n2) {
        return n2 == 0;
    }

    private static void llIIIIlllIlllII() {
        lIllIIIIIIIlI = new int[20];
        h.lIllIIIIIIIlI[0] = " ".length();
        h.lIllIIIIIIIlI[1] = (0xE9 ^ 0x88 ^ (0x99 ^ 0xB2)) & (0x1A ^ 0x12 ^ (0xE9 ^ 0xAB) ^ -" ".length());
        h.lIllIIIIIIIlI[2] = 0x2F ^ 0x2A;
        h.lIllIIIIIIIlI[3] = "  ".length();
        h.lIllIIIIIIIlI[4] = -(0xFFFFAB6F & 0x7EB1) & (0xFFFFFEFF & 0x7BF7);
        h.lIllIIIIIIIlI[5] = -(0xFFFFA37C & 0x7DA7) & (0xFFFFF1FB & Short.MAX_VALUE);
        h.lIllIIIIIIIlI[6] = 0xFFFFFBEC & 0x769B;
        h.lIllIIIIIIIlI[7] = -" ".length();
        h.lIllIIIIIIIlI[8] = "   ".length();
        h.lIllIIIIIIIlI[9] = 0x48 ^ 0x75 ^ (0x28 ^ 0x11);
        h.lIllIIIIIIIlI[10] = -(0xFFFFCFBF & 0x7A51) & (0xFFFFFFFD & 0x7FF3);
        h.lIllIIIIIIIlI[11] = 0xA0 ^ 0xA6;
        h.lIllIIIIIIIlI[12] = 0xA1 ^ 0xB8 ^ (0xAC ^ 0xB2);
        h.lIllIIIIIIIlI[13] = 0x5B ^ 0x53;
        h.lIllIIIIIIIlI[14] = 0xA4 ^ 0x9D ^ (0xA4 ^ 0x94);
        h.lIllIIIIIIIlI[15] = 0xD7 ^ 0xBF ^ (0x34 ^ 0x56);
        h.lIllIIIIIIIlI[16] = 0xAD ^ 0xA6;
        h.lIllIIIIIIIlI[17] = 0x47 ^ 0x4B;
        h.lIllIIIIIIIlI[18] = 88 + 17 - 33 + 78 ^ 99 + 32 - 50 + 74;
        h.lIllIIIIIIIlI[19] = 0x46 ^ 0x48;
    }

    private static boolean llIIIIlllIllllI(int n2, int n3) {
        return n2 == n3;
    }

    private static String llIIIIlllIIllIl(String llllllllllllllIllIIllIllIllIIlll, String llllllllllllllIllIIllIllIllIlIII) {
        try {
            SecretKeySpec llllllllllllllIllIIllIllIllIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIllIllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIllIllIllIlIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIllIllIllIlIll.init(lIllIIIIIIIlI[3], llllllllllllllIllIIllIllIllIllII);
            return new String(llllllllllllllIllIIllIllIllIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIllIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIllIllIllIlIlI) {
            llllllllllllllIllIIllIllIllIlIlI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean C() {
        void var3_3;
        void llllllllllllllIllIIllIlllIIllIIl;
        void llllllllllllllIllIIllIlllIIllIlI;
        int n2 = Inventory.getCount(item -> item.getName().contains(lIlIlllllllll[lIllIIIIIIIlI[15]]));
        String[] stringArray = new String[lIllIIIIIIIlI[0]];
        stringArray[h.lIllIIIIIIIlI[1]] = lIlIlllllllll[lIllIIIIIIIlI[9]];
        int n3 = Inventory.getCount((String[])stringArray);
        if (h.llIIIIllllIIIll(n2) && h.llIIIIlllIlllll(n3)) {
            Inventory.dropAll(item -> item.getName().contains(lIlIlllllllll[lIllIIIIIIIlI[14]]));
            "".length();
            return lIllIIIIIIIlI[0];
        }
        if (!h.llIIIIllllIIIII((int)llllllllllllllIllIIllIlllIIllIlI) || h.llIIIIlllIlllll((int)llllllllllllllIllIIllIlllIIllIIl)) {
            return lIllIIIIIIIlI[1];
        }
        if (h.llIIIIllllIIIII(Quests.isFinished((Quest)Quest.DRUIDIC_RITUAL) ? 1 : 0)) {
            Inventory.use(item -> item.getName().contains(lIlIlllllllll[lIllIIIIIIIlI[13]]), item -> item.getName().equals(lIlIlllllllll[lIllIIIIIIIlI[12]]));
            "".length();
            return lIllIIIIIIIlI[0];
        }
        String[] stringArray2 = new String[lIllIIIIIIIlI[0]];
        stringArray2[h.lIllIIIIIIIlI[1]] = lIlIlllllllll[lIllIIIIIIIlI[2]];
        NPC llllllllllllllIllIIllIlllIIllIII = NPCs.getNearest((String[])stringArray2);
        if (h.llIIIIllllIIlII(llllllllllllllIllIIllIlllIIllIII)) {
            int[] nArray = new int[lIllIIIIIIIlI[0]];
            nArray[h.lIllIIIIIIIlI[1]] = lIllIIIIIIIlI[10];
            llllllllllllllIllIIllIlllIIllIII = NPCs.getNearest((int[])nArray);
        }
        if (h.llIIIIllllIIIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIllIIIIIIIlI[0];
        }
        Inventory.use(item -> lIlIlllllllll[lIllIIIIIIIlI[11]].equalsIgnoreCase(item.getName()), (Interactable)var3_3);
        "".length();
        return lIllIIIIIIIlI[0];
    }

    private static String llIIIIlllIlIIIl(String llllllllllllllIllIIllIllIlllIllI, String llllllllllllllIllIIllIllIlllIlIl) {
        try {
            SecretKeySpec llllllllllllllIllIIllIllIllllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIllIlllIlIl.getBytes(StandardCharsets.UTF_8)), lIllIIIIIIIlI[13]), "DES");
            Cipher llllllllllllllIllIIllIllIllllIII = Cipher.getInstance("DES");
            llllllllllllllIllIIllIllIllllIII.init(lIllIIIIIIIlI[3], llllllllllllllIllIIllIllIllllIIl);
            return new String(llllllllllllllIllIIllIllIllllIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIllIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIllIllIlllIlll) {
            llllllllllllllIllIIllIllIlllIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIllllIIIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIIIllllIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIllllIIIll(int n2) {
        return n2 > 0;
    }

    static {
        h.llIIIIlllIlllII();
        h.llIIIIlllIllIIl();
    }

    @Inject
    public h(SquireWintertodtConfig squireWintertodtConfig, b b2) {
        this.L = squireWintertodtConfig;
        this.M = b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void llllllllllllllIllIIllIlllIIllllI;
        void llllllllllllllIllIIllIlllIIlllll;
        h llllllllllllllIllIIllIlllIlIIIIl;
        int n2 = Inventory.getCount(item -> {
            int n2;
            if (h.llIIIIllllIIIII(item.getName().startsWith(lIlIlllllllll[lIllIIIIIIIlI[17]]) ? 1 : 0) && h.llIIIIlllIlllll(item.getName().contains(lIlIlllllllll[lIllIIIIIIIlI[18]]) ? 1 : 0)) {
                n2 = lIllIIIIIIIlI[0];
                "".length();
                if (-(64 + 155 - 160 + 114 ^ 128 + 164 - 266 + 143) >= 0) {
                    return ((3 ^ 0x1B ^ (0x86 ^ 0x99)) & (0xBF ^ 0x89 ^ (0x7A ^ 0x4B) ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIllIIIIIIIlI[1];
            }
            return n2 != 0;
        });
        int n3 = Inventory.getCount(item -> item.getName().contains(lIlIlllllllll[lIllIIIIIIIlI[16]]));
        String[] stringArray = new String[lIllIIIIIIIlI[0]];
        stringArray[h.lIllIIIIIIIlI[1]] = lIlIlllllllll[lIllIIIIIIIlI[1]];
        int n4 = Inventory.getCount((String[])stringArray);
        if (!h.llIIIIlllIlllIl(n2) || h.llIIIIlllIllllI(n4, this.L.foodAmount())) {
            return llllllllllllllIllIIllIlllIlIIIIl.C();
        }
        if (h.llIIIIlllIlllll(llllllllllllllIllIIllIlllIlIIIIl.M.i() ? 1 : 0)) {
            return lIllIIIIIIIlI[1];
        }
        if (h.llIIIIllllIIIII(Players.getLocal().isMoving() ? 1 : 0)) {
            return lIllIIIIIIIlI[0];
        }
        if (h.llIIIIllllIIIIl(Inventory.getFreeSlots(), lIllIIIIIIIlI[2])) {
            int[] nArray = new int[lIllIIIIIIIlI[3]];
            nArray[h.lIllIIIIIIIlI[1]] = lIllIIIIIIIlI[4];
            nArray[h.lIllIIIIIIIlI[0]] = lIllIIIIIIIlI[5];
            Inventory.dropAll((int[])nArray);
            "".length();
        }
        if (h.llIIIIlllIlllll((int)llllllllllllllIllIIllIlllIIlllll)) {
            int[] nArray = new int[lIllIIIIIIIlI[0]];
            nArray[h.lIllIIIIIIIlI[1]] = lIllIIIIIIIlI[6];
            TileObjects.getNearest((int[])nArray).interact(lIlIlllllllll[lIllIIIIIIIlI[0]]);
            return lIllIIIIIIIlI[0];
        }
        if (h.llIIIIllllIIIIl((int)llllllllllllllIllIIllIlllIIllllI, llllllllllllllIllIIllIlllIlIIIIl.L.foodAmount())) {
            if (h.llIIIIllllIIIlI(Players.getLocal().getAnimation(), lIllIIIIIIIlI[7])) {
                return lIllIIIIIIIlI[0];
            }
            String[] stringArray2 = new String[lIllIIIIIIIlI[0]];
            stringArray2[h.lIllIIIIIIIlI[1]] = lIlIlllllllll[lIllIIIIIIIlI[3]];
            TileObjects.getNearest((String[])stringArray2).interact(lIlIlllllllll[lIllIIIIIIIlI[8]]);
            return lIllIIIIIIIlI[0];
        }
        return lIllIIIIIIIlI[1];
    }

    private static void llIIIIlllIllIIl() {
        lIlIlllllllll = new String[lIllIIIIIIIlI[19]];
        h.lIlIlllllllll[h.lIllIIIIIIIlI[1]] = h.llIIIIlllIIllII("Ej4lBgRwJDUZBw==", "PLPke");
        h.lIlIlllllllll[h.lIllIIIIIIIlI[0]] = h.llIIIIlllIIllIl("YY3GHX0oYIdVS/8rQh0hV88re6H8FR0i", "SkJzE");
        h.lIlIlllllllll[h.lIllIIIIIIIlI[3]] = h.llIIIIlllIIllIl("qg1WCFQDdm3vUBFilKu12g==", "VzqJm");
        h.lIlIlllllllll[h.lIllIIIIIIIlI[8]] = h.llIIIIlllIlIIIl("7w+d8ydpDsc=", "vhwQg");
        h.lIlIlllllllll[h.lIllIIIIIIIlI[9]] = h.llIIIIlllIIllII("MRYCAjdTDBIdNA==", "sdwoV");
        h.lIlIlllllllll[h.lIllIIIIIIIlI[2]] = h.llIIIIlllIIllIl("s7CIzyR1mVA=", "RJqWi");
        h.lIlIlllllllll[h.lIllIIIIIIIlI[11]] = h.llIIIIlllIIllII("NTgWAilXIgYdKg==", "wJcoH");
        h.lIlIlllllllll[h.lIllIIIIIIIlI[12]] = h.llIIIIlllIIllIl("te32muIOxNFbvmLokObMBg==", "CFVqx");
        h.lIlIlllllllll[h.lIllIIIIIIIlI[13]] = h.llIIIIlllIIllIl("dSWqqyvIFyg=", "nxVuq");
        h.lIlIlllllllll[h.lIllIIIIIIIlI[14]] = h.llIIIIlllIIllII("LQwP", "XbitA");
        h.lIlIlllllllll[h.lIllIIIIIIIlI[15]] = h.llIIIIlllIIllII("NBgF", "AvceN");
        h.lIlIlllllllll[h.lIllIIIIIIIlI[16]] = h.llIIIIlllIlIIIl("5JPj6NxC+8k=", "GQpDM");
        h.lIlIlllllllll[h.lIllIIIIIIIlI[17]] = h.llIIIIlllIlIIIl("um3HCPpw73jpOa267LgUNw==", "ekGnm");
        h.lIlIlllllllll[h.lIllIIIIIIIlI[18]] = h.llIIIIlllIIllIl("BXSGpUHQRF4=", "yPpkD");
    }

    private static boolean llIIIIllllIIlII(Object object) {
        return object == null;
    }

    private static boolean llIIIIlllIlllIl(int n2) {
        return n2 <= 0;
    }

    private static String llIIIIlllIIllII(String llllllllllllllIllIIllIlllIIIIllI, String llllllllllllllIllIIllIlllIIIIlIl) {
        llllllllllllllIllIIllIlllIIIIllI = new String(Base64.getDecoder().decode(llllllllllllllIllIIllIlllIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIllIlllIIIlIIl = new StringBuilder();
        char[] llllllllllllllIllIIllIlllIIIlIII = llllllllllllllIllIIllIlllIIIIlIl.toCharArray();
        int llllllllllllllIllIIllIlllIIIIlll = lIllIIIIIIIlI[1];
        char[] llllllllllllllIllIIllIlllIIIIIIl = llllllllllllllIllIIllIlllIIIIllI.toCharArray();
        int llllllllllllllIllIIllIlllIIIIIII = llllllllllllllIllIIllIlllIIIIIIl.length;
        int llllllllllllllIllIIllIllIlllllll = lIllIIIIIIIlI[1];
        while (h.llIIIIllllIIIIl(llllllllllllllIllIIllIllIlllllll, llllllllllllllIllIIllIlllIIIIIII)) {
            char llllllllllllllIllIIllIlllIIIllII = llllllllllllllIllIIllIlllIIIIIIl[llllllllllllllIllIIllIllIlllllll];
            llllllllllllllIllIIllIlllIIIlIIl.append((char)(llllllllllllllIllIIllIlllIIIllII ^ llllllllllllllIllIIllIlllIIIlIII[llllllllllllllIllIIllIlllIIIIlll % llllllllllllllIllIIllIlllIIIlIII.length]));
            "".length();
            ++llllllllllllllIllIIllIlllIIIIlll;
            ++llllllllllllllIllIIllIllIlllllll;
            "".length();
            if (((0x6B ^ 0x71) & ~(0x7E ^ 0x64)) >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIllIlllIIIlIIl);
    }
}

