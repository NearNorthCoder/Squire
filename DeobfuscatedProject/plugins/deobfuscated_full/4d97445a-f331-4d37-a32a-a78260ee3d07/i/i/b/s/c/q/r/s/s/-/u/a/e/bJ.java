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
import gg.squire.basics.sarachnis.SarachnisConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
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
public class bJ
extends Task {
    private static /* synthetic */ int[] lIIllIlI;
    private final /* synthetic */ SarachnisConfig gC;
    private static /* synthetic */ String[] lIIllIIl;

    private static boolean lIIlIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlIIIIIl() {
        lIIllIlI = new int[8];
        bJ.lIIllIlI[0] = 1;
        bJ.lIIllIlI[1] = (0x12 ^ 0x4B) & ~(0x21 ^ 0x78);
        bJ.lIIllIlI[2] = 0xFFFFB22B & 0x6FDD;
        bJ.lIIllIlI[3] = 0xFFFFC736 & 0x3FEF;
        bJ.lIIllIlI[4] = -(0xFFFFD60F & 0x39F7) & (0xFFFFFFFF & 0x36A7);
        bJ.lIIllIlI[5] = 0xDE ^ 0xBD ^ (0xC2 ^ 0xB9);
        bJ.lIIllIlI[6] = 0x67 ^ 0x70;
        bJ.lIIllIlI[7] = 2;
    }

    private static boolean lIIlIIIIll(Object object) {
        return object == null;
    }

    static {
        bJ.lIIlIIIIIl();
        bJ.lIIlIIIIII();
    }

    private static void lIIlIIIIII() {
        lIIllIIl = new String[lIIllIlI[7]];
        bJ.lIIllIIl[bJ.lIIllIlI[1]] = bJ."Eat";
        bJ.lIIllIIl[bJ.lIIllIlI[0]] = bJ."Eat";
    }

    @Inject
    private bJ(SarachnisConfig sarachnisConfig) {
        this.gC = sarachnisConfig;
    }

    private static String lIIIllllll(String lllIIIIlIlIlIlI, String lllIIIIlIlIlIIl) {
        lllIIIIlIlIlIlI = new String(Base64.getDecoder().decode(lllIIIIlIlIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIIIlIlIllIl = new StringBuilder();
        char[] lllIIIIlIlIllII = lllIIIIlIlIlIIl.toCharArray();
        int lllIIIIlIlIlIll = lIIllIlI[1];
        char[] lllIIIIlIlIIlIl = lllIIIIlIlIlIlI.toCharArray();
        int lllIIIIlIlIIlII = lllIIIIlIlIIlIl.length;
        int lllIIIIlIlIIIll = lIIllIlI[1];
        while (bJ.lIIlIIIlII(lllIIIIlIlIIIll, lllIIIIlIlIIlII)) {
            char lllIIIIlIllIIII = lllIIIIlIlIIlIl[lllIIIIlIlIIIll];
            lllIIIIlIlIllIl.append((char)(lllIIIIlIllIIII ^ lllIIIIlIlIllII[lllIIIIlIlIlIll % lllIIIIlIlIllII.length]));
            0;
            ++lllIIIIlIlIlIll;
            ++lllIIIIlIlIIIll;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(lllIIIIlIlIllIl);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        bJ lllIIIIlIllllIl;
        void lllIIIIlIllllII;
        int[] nArray = new int[lIIllIlI[0]];
        nArray[bJ.lIIllIlI[1]] = lIIllIlI[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        WorldArea worldArea = new WorldArea(lIIllIlI[3], lIIllIlI[4], lIIllIlI[5], lIIllIlI[6], lIIllIlI[1]);
        if (bJ.lIIlIIIIlI(worldArea.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return lIIllIlI[1];
        }
        if (bJ.lIIlIIIIll(lllIIIIlIllllII)) {
            return lIIllIlI[1];
        }
        if (bJ.lIIlIIIlII(Combat.getMissingHealth(), lllIIIIlIllllIl.gC.eatMissingHealth())) {
            return lIIllIlI[1];
        }
        Item lllIIIIlIlllIlI = Inventory.getFirst(item -> item.hasAction(lIIllIIl[lIIllIlI[0]]::equals));
        if (bJ.lIIlIIIIll(lllIIIIlIlllIlI)) {
            return lIIllIlI[1];
        }
        var3_3.interact(lIIllIIl[lIIllIlI[1]]);
        return lIIllIlI[0];
    }

    private static boolean lIIlIIIIlI(int n2) {
        return n2 == 0;
    }
}

