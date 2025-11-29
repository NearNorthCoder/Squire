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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private static boolean lIllllIllll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        void lIlIlllIlIllIII;
        Player player = Players.getLocal();
        if (R.lIllllIllIl(player)) {
            return llIllIllI[0];
        }
        if (!R.lIllllIlllI(lIlIlllIlIllIII.isAnimating() ? 1 : 0) || R.lIllllIllll(lIlIlllIlIllIII.getInteracting())) {
            return llIllIllI[0];
        }
        Interactable[] interactableArray = new Interactable[llIllIllI[1]];
        interactableArray[R.llIllIllI[0]] = Players.getLocal();
        NPC lIlIlllIlIlIlll = (NPC)((SceneEntityQueryResults)((NPCQuery)NPCs.query().targeting(interactableArray)).results()).nearest();
        if (R.lIllllIllll(lIlIlllIlIlIlll)) {
            return llIllIllI[0];
        }
        int[] nArray = new int[llIllIllI[1]];
        nArray[R.llIllIllI[0]] = llIllIllI[2];
        NPC lIlIlllIlIlIllI = NPCs.getNearest((int[])nArray);
        if (R.lIllllIllIl(lIlIlllIlIlIllI)) {
            return llIllIllI[0];
        }
        if (R.lIlllllIIII(lIlIlllIlIlIllI.distanceTo((Locatable)lIlIlllIlIllIII), llIllIllI[3])) {
            return llIllIllI[0];
        }
        var3_3.interact(llIllIlIl[llIllIllI[0]]);
        return llIllIllI[1];
    }

    private static boolean lIllllIllIl(Object object) {
        return object == null;
    }

    static {
        R.lIllllIllII();
        R.lIllllIlIll();
    }

    private static boolean lIlllllIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllllIlllI(int n2) {
        return n2 == 0;
    }

    private static void lIllllIlIll() {
        llIllIlIl = new String[llIllIllI[1]];
        R.llIllIlIl[R.llIllIllI[0]] = "Disturb";
    }
}

