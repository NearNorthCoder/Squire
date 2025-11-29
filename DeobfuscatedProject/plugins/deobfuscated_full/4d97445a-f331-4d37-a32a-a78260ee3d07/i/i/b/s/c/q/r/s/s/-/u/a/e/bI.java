/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.sarachnis.SarachnisConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;

/* TASK: Drinking prayer potion -> DrinkingprayerpotionTask */
@TaskDesc(name="Drinking prayer potion", priority=5)
public class bI
extends Task {
    private static /* synthetic */ String[] llIIlIII;
    private static /* synthetic */ int[] llIIlIlI;
    private final /* synthetic */ SarachnisConfig gB;

    private static String lIlIlllllI(String llIllIlIIllIllI, String llIllIlIIllIIll) {
        try {
            SecretKeySpec llIllIlIIlllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIlIIllIIll.getBytes(StandardCharsets.UTF_8)), llIIlIlI[9]), "DES");
            Cipher llIllIlIIlllIII = Cipher.getInstance("DES");
            llIllIlIIlllIII.init(llIIlIlI[8], llIllIlIIlllIIl);
            return new String(llIllIlIIlllIII.doFinal(Base64.getDecoder().decode(llIllIlIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllIlIIllIlll) {
            llIllIlIIllIlll.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIIIl() {
        llIIlIII = new String[llIIlIlI[7]];
        bI.llIIlIII[bI.llIIlIlI[1]] = bI."Drink";
        bI.llIIlIII[bI.llIIlIlI[0]] = bI."Prayer";
        bI.llIIlIII[bI.llIIlIlI[8]] = bI."Super rest";
    }

    private static boolean lIllIIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        bI llIllIlIlIlIIII;
        void llIllIlIlIIllll;
        int[] nArray = new int[llIIlIlI[0]];
        nArray[bI.llIIlIlI[1]] = llIIlIlI[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        WorldArea worldArea = new WorldArea(llIIlIlI[3], llIIlIlI[4], llIIlIlI[5], llIIlIlI[6], llIIlIlI[1]);
        if (bI.lIllIIIIll(worldArea.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIlIlI[1];
        }
        if (bI.lIllIIIlII(llIllIlIlIIllll)) {
            return llIIlIlI[1];
        }
        if (bI.lIllIIIlIl(Prayers.getPoints(), llIllIlIlIlIIII.gB.restorePrayerLevel())) {
            return llIIlIlI[1];
        }
        Item llIllIlIlIIllIl = Inventory.getFirst(item -> {
            int n2;
            if (!bI.lIllIIIIll(item.getName().startsWith(llIIlIII[llIIlIlI[0]]) ? 1 : 0) || bI.lIllIIIllI(item.getName().startsWith(llIIlIII[llIIlIlI[8]]) ? 1 : 0)) {
                n2 = llIIlIlI[0];
                0;
                if (3 == 0) {
                    return false;
                }
            } else {
                n2 = llIIlIlI[1];
            }
            return n2 != 0;
        });
        if (bI.lIllIIIlII(llIllIlIlIIllIl)) {
            return llIIlIlI[1];
        }
        var3_3.interact(llIIlIII[llIIlIlI[1]]);
        this.sleep(llIIlIlI[7]);
        return llIIlIlI[0];
    }

    static {
        bI.lIllIIIIlI();
        bI.lIllIIIIIl();
    }

    private static String lIlIllllll(String llIllIlIlIIIIIl, String llIllIlIlIIIIII) {
        try {
            SecretKeySpec llIllIlIlIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIlIlIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIllIlIlIIIlIl = Cipher.getInstance("Blowfish");
            llIllIlIlIIIlIl.init(llIIlIlI[8], llIllIlIlIIIllI);
            return new String(llIllIlIlIIIlIl.doFinal(Base64.getDecoder().decode(llIllIlIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllIlIlIIIlII) {
            llIllIlIlIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIIlII(Object object) {
        return object == null;
    }

    @Inject
    public bI(SarachnisConfig sarachnisConfig) {
        this.gB = sarachnisConfig;
    }

    private static String lIlIllllIl(String llIllIlIIlIIllI, String llIllIlIIlIIIII) {
        llIllIlIIlIIllI = new String(Base64.getDecoder().decode(llIllIlIIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIllIlIIlIIlII = new StringBuilder();
        char[] llIllIlIIlIIIll = llIllIlIIlIIIII.toCharArray();
        int llIllIlIIlIIIlI = llIIlIlI[1];
        char[] llIllIlIIIlllII = llIllIlIIlIIllI.toCharArray();
        int llIllIlIIIllIll = llIllIlIIIlllII.length;
        int llIllIlIIIllIlI = llIIlIlI[1];
        while (bI.lIllIIIlll(llIllIlIIIllIlI, llIllIlIIIllIll)) {
            char llIllIlIIlIIlll = llIllIlIIIlllII[llIllIlIIIllIlI];
            llIllIlIIlIIlII.append((char)(llIllIlIIlIIlll ^ llIllIlIIlIIIll[llIllIlIIlIIIlI % llIllIlIIlIIIll.length]));
            0;
            ++llIllIlIIlIIIlI;
            ++llIllIlIIIllIlI;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return String.valueOf(llIllIlIIlIIlII);
    }

    private static void lIllIIIIlI() {
        llIIlIlI = new int[10];
        bI.llIIlIlI[0] = 1;
        bI.llIIlIlI[1] = (0x1B ^ 0x31 ^ (0xD0 ^ 0xC2)) & (0x2A ^ 0 ^ (0x1F ^ 0xD) ^ -1);
        bI.llIIlIlI[2] = -(0xFFFFD7BF & 0x2C61) & (0xFFFFF7FD & 0x2E2B);
        bI.llIIlIlI[3] = 0xFFFFD726 & 0x2FFF;
        bI.llIIlIlI[4] = 0xFFFFBEBB & 0x67E5;
        bI.llIIlIlI[5] = 0x57 ^ 0x4F;
        bI.llIIlIlI[6] = 0x83 ^ 0x94;
        bI.llIIlIlI[7] = 3;
        bI.llIIlIlI[8] = 2;
        bI.llIIlIlI[9] = 104 + 86 - 164 + 125 ^ 113 + 154 - 194 + 86;
    }
}

