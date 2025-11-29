/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.NpcDespawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.NpcDespawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Moving next to rubble", priority=100, blocking=true, register=true)
public class MovingNextToRubbleTask
extends AutotoaTaskBase {
    private  boolean eh;
    private static final  int eg;

    static {
        aP.lIIlllllIllllI();
        aP.lIIlllllIlllIl();
        eg = llIIIllllIl[3];
    }

    private static void lIIlllllIlllIl() {
        llIIIllllII = new String[llIIIllllIl[4]];
        aP.llIIIllllII[aP.llIIIllllIl[0]] = "Rubble";
        aP.llIIIllllII[aP.llIIIllllIl[1]] = "Ba-Ba throws a large boulder at you";
        aP.llIIIllllII[aP.llIIIllllIl[2]] = "Rubble";
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (aP.lIIllllllIIIII(npcDespawned.getNpc().getName().contains(llIIIllllII[llIIIllllIl[0]]) ? 1 : 0)) {
            this.eh = llIIIllllIl[0];
        }
    }

    private static boolean lIIllllllIIIIl(int n2) {
        return n2 == 0;
    }

    @Override
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (aP.lIIllllllIIIII(chatMessage.getMessage().contains(llIIIllllII[llIIIllllIl[1]]) ? 1 : 0)) {
            this.eh = llIIIllllIl[1];
        }
    }

        return String.valueOf(var1);
    }

    private static boolean lIIlllllIlllll(Object object) {
        return object != null;
    }

    private static boolean lIIllllllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllllllIIIII(int n2) {
        return n2 != 0;
    }

    @Inject
    protected MovingNextToRubbleTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bC() {
        void var2;
        aP var3;
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(llIIIllllII[llIIIllllIl[2]]));
        if (!aP.lIIlllllIlllll(nPC2) || aP.lIIllllllIIIII(nPC2.isDead() ? 1 : 0)) {
            return llIIIllllIl[0];
        }
        if (aP.lIIllllllIIIIl(var3.eh ? 1 : 0)) {
            return llIIIllllIl[0];
        }
        WorldPoint var4 = Players.getLocal().getWorldLocation();
        if (aP.lIIllllllIIIII(var2.getWorldArea().isInMeleeDistance(var4) ? 1 : 0)) {
            return llIIIllllIl[1];
        }
        Movement.setDestination((WorldPoint)nPC2.getWorldArea().getCenter());
        return llIIIllllIl[1];
    }
}

