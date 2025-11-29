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
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.dagannothkings.DagannothKingConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

/* TASK: Eating food -> EatingfoodTask */
@TaskDesc(name="Eating food", priority=5)
public class EatingFoodTask
extends Task {
    private static /* synthetic */ int[] llIIIlIl;
    private final /* synthetic */ DagannothKingConfig cJ;
    private static /* synthetic */ String[] llIIIIIl;

    private static void lIlIllIIIl() {
        llIIIlIl = new int[8];
        ah.llIIIlIl[0] = 1;
        ah.llIIIlIl[1] = (0xA9 ^ 0x93) & ~(0x60 ^ 0x5A);
        ah.llIIIlIl[2] = -(0x84 ^ 0xC3) & (0xFFFFFFEF & 0x225F);
        ah.llIIIlIl[3] = -(0xFFFFFAD7 & 0x4D3A) & (0xFFFFEF3F & 0x5FF7);
        ah.llIIIlIl[4] = 0xFFFFE7EF & 0x3EB1;
        ah.llIIIlIl[5] = 45 + 107 - 37 + 18 ^ 91 + 82 - 97 + 81;
        ah.llIIIlIl[6] = 3 ^ (0x1A ^ 0xE);
        ah.llIIIlIl[7] = 2;
    }

    private static void lIlIlIlllI() {
        llIIIIIl = new String[llIIIlIl[7]];
        ah.llIIIIIl[ah.llIIIlIl[1]] = ah."Eat";
        ah.llIIIIIl[ah.llIIIlIl[0]] = ah."Eat";
    }

    private static String lIlIlIllII(String llIllIllIlIIllI, String llIllIllIlIIlIl) {
        try {
            SecretKeySpec llIllIllIlIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIllIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIllIllIlIlIII = Cipher.getInstance("Blowfish");
            llIllIllIlIlIII.init(llIIIlIl[7], llIllIllIlIlIIl);
            return new String(llIllIllIlIlIII.doFinal(Base64.getDecoder().decode(llIllIllIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllIllIlIIlll) {
            llIllIllIlIIlll.printStackTrace();
            return null;
        }
    }

    private static String lIlIlIlIll(String llIllIllIllIllI, String llIllIllIllIlIl) {
        llIllIllIllIllI = new String(Base64.getDecoder().decode(llIllIllIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIllIllIlllIIl = new StringBuilder();
        char[] llIllIllIlllIII = llIllIllIllIlIl.toCharArray();
        int llIllIllIllIlll = llIIIlIl[1];
        char[] llIllIllIllIIIl = llIllIllIllIllI.toCharArray();
        int llIllIllIllIIII = llIllIllIllIIIl.length;
        int llIllIllIlIllll = llIIIlIl[1];
        while (ah.lIlIllIlII(llIllIllIlIllll, llIllIllIllIIII)) {
            char llIllIllIllllII = llIllIllIllIIIl[llIllIllIlIllll];
            llIllIllIlllIIl.append((char)(llIllIllIllllII ^ llIllIllIlllIII[llIllIllIllIlll % llIllIllIlllIII.length]));
            0;
            ++llIllIllIllIlll;
            ++llIllIllIlIllll;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(llIllIllIlllIIl);
    }

    private static boolean lIlIllIIll(Object object) {
        return object == null;
    }

    private static boolean lIlIllIIlI(int n2) {
        return n2 == 0;
    }

    static {
        ah.lIlIllIIIl();
        ah.lIlIlIlllI();
    }

    @Inject
    private ah(DagannothKingConfig dagannothKingConfig) {
        this.cJ = dagannothKingConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        ah llIllIlllIIlIIl;
        void llIllIlllIIlIII;
        int[] nArray = new int[llIIIlIl[0]];
        nArray[ah.llIIIlIl[1]] = llIIIlIl[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        WorldArea worldArea = new WorldArea(llIIIlIl[3], llIIIlIl[4], llIIIlIl[5], llIIIlIl[6], llIIIlIl[1]);
        if (ah.lIlIllIIlI(worldArea.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIIlIl[1];
        }
        if (ah.lIlIllIIll(llIllIlllIIlIII)) {
            return llIIIlIl[1];
        }
        if (ah.lIlIllIlII(Combat.getMissingHealth(), llIllIlllIIlIIl.cJ.eatMissingHealth())) {
            return llIIIlIl[1];
        }
        Item llIllIlllIIIllI = Inventory.getFirst(item -> item.hasAction(llIIIIIl[llIIIlIl[0]]::equals));
        if (ah.lIlIllIIll(llIllIlllIIIllI)) {
            return llIIIlIl[1];
        }
        var3_3.interact(llIIIIIl[llIIIlIl[1]]);
        return llIIIlIl[0];
    }

    private static boolean lIlIllIlII(int n2, int n3) {
        return n2 < n3;
    }
}

