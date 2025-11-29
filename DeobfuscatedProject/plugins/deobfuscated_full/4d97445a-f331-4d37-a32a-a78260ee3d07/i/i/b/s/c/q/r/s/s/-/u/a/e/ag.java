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
import gg.squire.basics.dagannothkings.DagannothKingConfig;
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
public class ag
extends Task {
    private static /* synthetic */ int[] lIlIIIIIl;
    private static /* synthetic */ String[] lIlIIIIII;
    private final /* synthetic */ DagannothKingConfig cI;

    private static boolean lIIIllIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIIIlIlllll(String llIIIIllllIIIIl, String llIIIIllllIIIII) {
        try {
            SecretKeySpec llIIIIllllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIllllIIIII.getBytes(StandardCharsets.UTF_8)), lIlIIIIIl[9]), "DES");
            Cipher llIIIIllllIIIll = Cipher.getInstance("DES");
            llIIIIllllIIIll.init(lIlIIIIIl[8], llIIIIllllIIlII);
            return new String(llIIIIllllIIIll.doFinal(Base64.getDecoder().decode(llIIIIllllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIllllIIIlI) {
            llIIIIllllIIIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIIllIIIII() {
        lIlIIIIII = new String[lIlIIIIIl[7]];
        ag.lIlIIIIII[ag.lIlIIIIIl[1]] = ag."Drink";
        ag.lIlIIIIII[ag.lIlIIIIIl[0]] = ag."Prayer";
        ag.lIlIIIIII[ag.lIlIIIIIl[8]] = ag."Super rest";
    }

    private static void lIIIllIIIIl() {
        lIlIIIIIl = new int[10];
        ag.lIlIIIIIl[0] = 1;
        ag.lIlIIIIIl[1] = (7 ^ 0x57) & ~(0xF6 ^ 0xA6);
        ag.lIlIIIIIl[2] = 0xFFFFFE1F & 0x23E9;
        ag.lIlIIIIIl[3] = 0xFFFFF7BE & 0xF67;
        ag.lIlIIIIIl[4] = 0xFFFFAEF7 & 0x77A9;
        ag.lIlIIIIIl[5] = 0x84 ^ 0x9C;
        ag.lIlIIIIIl[6] = 0 ^ 0x53 ^ (3 ^ 0x47);
        ag.lIlIIIIIl[7] = 3;
        ag.lIlIIIIIl[8] = 2;
        ag.lIlIIIIIl[9] = 0x50 ^ 0x58;
    }

    private static boolean lIIIllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIlIllllI(String llIIIIlllllIIIl, String llIIIIlllllIlIl) {
        llIIIIlllllIIIl = new String(Base64.getDecoder().decode(llIIIIlllllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIIlllllIlII = new StringBuilder();
        char[] llIIIIlllllIIll = llIIIIlllllIlIl.toCharArray();
        int llIIIIlllllIIlI = lIlIIIIIl[1];
        char[] llIIIIllllIllII = llIIIIlllllIIIl.toCharArray();
        int llIIIIllllIlIll = llIIIIllllIllII.length;
        int llIIIIllllIlIlI = lIlIIIIIl[1];
        while (ag.lIIIllIIllI(llIIIIllllIlIlI, llIIIIllllIlIll)) {
            char llIIIIlllllIlll = llIIIIllllIllII[llIIIIllllIlIlI];
            llIIIIlllllIlII.append((char)(llIIIIlllllIlll ^ llIIIIlllllIIll[llIIIIlllllIIlI % llIIIIlllllIIll.length]));
            0;
            ++llIIIIlllllIIlI;
            ++llIIIIllllIlIlI;
            0;
            if (((0x37 ^ 0x24) & ~(0xBC ^ 0xAF)) < 1) continue;
            return null;
        }
        return String.valueOf(llIIIIlllllIlII);
    }

    private static boolean lIIIllIIIlI(int n2) {
        return n2 == 0;
    }

    static {
        ag.lIIIllIIIIl();
        ag.lIIIllIIIII();
    }

    private static boolean lIIIllIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllIIIll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        ag llIIIlIIIIIIllI;
        void llIIIlIIIIIIlIl;
        int[] nArray = new int[lIlIIIIIl[0]];
        nArray[ag.lIlIIIIIl[1]] = lIlIIIIIl[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        WorldArea worldArea = new WorldArea(lIlIIIIIl[3], lIlIIIIIl[4], lIlIIIIIl[5], lIlIIIIIl[6], lIlIIIIIl[1]);
        if (ag.lIIIllIIIlI(worldArea.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return lIlIIIIIl[1];
        }
        if (ag.lIIIllIIIll(llIIIlIIIIIIlIl)) {
            return lIlIIIIIl[1];
        }
        if (ag.lIIIllIIlII(Prayers.getPoints(), llIIIlIIIIIIllI.cI.restorePrayerLevel())) {
            return lIlIIIIIl[1];
        }
        Item llIIIlIIIIIIIll = Inventory.getFirst(item -> {
            boolean bl2;
            if (!ag.lIIIllIIIlI(item.getName().startsWith(lIlIIIIII[lIlIIIIIl[0]]) ? 1 : 0) || ag.lIIIllIIlIl(item.getName().startsWith(lIlIIIIII[lIlIIIIIl[8]]) ? 1 : 0)) {
                bl2 = lIlIIIIIl[0];
                0;
                if (((0x47 ^ 0x70) & ~(0x32 ^ 5)) != 0) {
                    return false;
                }
            } else {
                bl2 = lIlIIIIIl[1];
            }
            return bl2;
        });
        if (ag.lIIIllIIIll(llIIIlIIIIIIIll)) {
            return lIlIIIIIl[1];
        }
        var3_3.interact(lIlIIIIII[lIlIIIIIl[1]]);
        this.sleep(lIlIIIIIl[7]);
        return lIlIIIIIl[0];
    }

    @Inject
    public ag(DagannothKingConfig dagannothKingConfig) {
        this.cI = dagannothKingConfig;
    }
}

