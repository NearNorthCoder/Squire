/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import gg.squire.thieving.tasks.ThievingManager;

@TaskDesc(name="Starting Minigame", priority=50)
public class StartingMinigameTask
extends Task {
    
    private final  a I;

    static {
        n.lIIlIlIIlllIlII();
        n.lIIlIlIIlllIIll();
    }

    public boolean run() {
        int[] nArray = new int[lllllllIIlIl[0]];
        nArray[n.lllllllIIlIl[1]] = lllllllIIlIl[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (n.lIIlIlIIlllIlIl(nPC)) {
            return lllllllIIlIl[1];
        }
        if (n.lIIlIlIIlllIllI(Movement.shouldWalk() ? 1 : 0)) {
            return lllllllIIlIl[1];
        }
        if (n.lIIlIlIIlllIllI(Movement.isRunEnabled() ? 1 : 0) && n.lIIlIlIIlllIlll(Movement.getRunEnergy(), lllllllIIlIl[3])) {
            Movement.toggleRun();
        }
        this.I.a(lllllllIIlIl[1]);
        nPC.interact(lllllllIIlII[lllllllIIlIl[1]]);
        return lllllllIIlIl[0];
    }

    private static void lIIlIlIIlllIIll() {
        lllllllIIlII = new String[lllllllIIlIl[0]];
        n.lllllllIIlII[n.lllllllIIlIl[1]] = "Start-minigame";
    }

    @Inject
    public StartingMinigameTask(a a2) {
        this.I = a2;
    }

    private static boolean lIIlIlIIlllIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIlIIlllIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlIIlllIlIl(Object object) {
        return object == null;
    }
}

