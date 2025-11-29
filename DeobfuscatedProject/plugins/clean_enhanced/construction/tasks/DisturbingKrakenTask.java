/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.unethicalite.api.Interactable
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.query.entities.NPCQuery
 *  net.unethicalite.api.query.results.SceneEntityQueryResults
 */
package gg.squire.construction.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.query.entities.NPCQuery;
import net.unethicalite.api.query.results.SceneEntityQueryResults;

@TaskDesc(name="Disturbing Kraken")
public class DisturbingKrakenTask
extends Task {
    private static  int[] llIllIllI;
    private static  String[] llIllIlIl;

    private static boolean var1(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        void var2;
        Player player = Players.getLocal();
        if (R.var3(player)) {
            return llIllIllI[0];
        }
        if (!R.var4(var2.isAnimating() ? 1 : 0) || R.var1(var2.getInteracting())) {
            return llIllIllI[0];
        }
        Interactable[] interactableArray = new Interactable[llIllIllI[1]];
        interactableArray[R.llIllIllI[0]] = Players.getLocal();
        NPC var5 = (NPC)((SceneEntityQueryResults)((NPCQuery)NPCs.query().targeting(interactableArray)).results()).nearest();
        if (R.var1(var5)) {
            return llIllIllI[0];
        }
        int[] nArray = new int[llIllIllI[1]];
        nArray[R.llIllIllI[0]] = llIllIllI[2];
        NPC var6 = NPCs.getNearest((int[])nArray);
        if (R.var3(var6)) {
            return llIllIllI[0];
        }
        if (R.var7(var6.distanceTo((Locatable)var2), llIllIllI[3])) {
            return llIllIllI[0];
        }
        var3_3.interact(llIllIlIl[llIllIllI[0]]);
        return llIllIllI[1];
    }

    private static boolean var3(Object object) {
        return object == null;
    }

    static {
        R.var8();
        R.var9();
    }

    private static void var8() {
        llIllIllI = new int[5];
        R.llIllIllI[0] = (8 ^ 0x5F) & ~(6 ^ 0x51);
        R.llIllIllI[1] = 1;
        R.llIllIllI[2] = -(0xFFFF9FFB & 0x7E15) & (0xFFFFFFFD & 0x1FFF);
        R.llIllIllI[3] = 0xA9 ^ 0xA3;
        R.llIllIllI[4] = 2;
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean var7(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static void var9() {
        llIllIlIl = new String[llIllIllI[1]];
        R.llIllIlIl[R.llIllIllI[0]] = "Disturb";
    }
}

