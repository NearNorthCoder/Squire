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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aI;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Moving next to rubble", priority=100, blocking=true, register=true)
public class aP
extends aI {
    private /* synthetic */ boolean eh;
    private static final /* synthetic */ int eg;
    private static /* synthetic */ String[] llIIIllllII;
    private static /* synthetic */ int[] llIIIllllIl;

    static {
        aP.lIIlllllIllllI();
        aP.lIIlllllIlllIl();
        eg = llIIIllllIl[3];
    }

    private static void lIIlllllIlllIl() {
        llIIIllllII = new String[llIIIllllIl[4]];
        aP.llIIIllllII[aP.llIIIllllIl[0]] = aP."Rubble";
        aP.llIIIllllII[aP.llIIIllllIl[1]] = aP."Ba-Ba throws a large boulder at you";
        aP.llIIIllllII[aP.llIIIllllIl[2]] = aP."Rubble";
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (aP.lIIllllllIIIII(npcDespawned.getNpc().getName().contains(llIIIllllII[llIIIllllIl[0]]) ? 1 : 0)) {
            this.eh = llIIIllllIl[0];
        }
    }

    private static String lIIlllllIlllII(String llllllllllllllllIlIIIIlIlIIllIII, String llllllllllllllllIlIIIIlIlIIlIlIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIIIlIlIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIlIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), llIIIllllIl[3]), "DES");
            Cipher llllllllllllllllIlIIIIlIlIIllIlI = Cipher.getInstance("DES");
            llllllllllllllllIlIIIIlIlIIllIlI.init(llIIIllllIl[2], llllllllllllllllIlIIIIlIlIIllIll);
            return new String(llllllllllllllllIlIIIIlIlIIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIlIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIIIlIlIIllIIl) {
            llllllllllllllllIlIIIIlIlIIllIIl.printStackTrace();
            return null;
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

    private static void lIIlllllIllllI() {
        llIIIllllIl = new int[5];
        aP.llIIIllllIl[0] = (0x6E ^ 0x56) & ~(0x58 ^ 0x60);
        aP.llIIIllllIl[1] = 1;
        aP.llIIIllllIl[2] = 2;
        aP.llIIIllllIl[3] = 0x29 ^ 0x21;
        aP.llIIIllllIl[4] = 3;
    }

    private static String lIIlllllIllIll(String llllllllllllllllIlIIIIlIlIIIlIII, String llllllllllllllllIlIIIIlIlIIIIlll) {
        llllllllllllllllIlIIIIlIlIIIlIII = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIIlIlIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIIIlIlIIIIllI = new StringBuilder();
        char[] llllllllllllllllIlIIIIlIlIIIIlIl = llllllllllllllllIlIIIIlIlIIIIlll.toCharArray();
        int llllllllllllllllIlIIIIlIlIIIIlII = llIIIllllIl[0];
        char[] llllllllllllllllIlIIIIlIIllllllI = llllllllllllllllIlIIIIlIlIIIlIII.toCharArray();
        int llllllllllllllllIlIIIIlIIlllllIl = llllllllllllllllIlIIIIlIIllllllI.length;
        int llllllllllllllllIlIIIIlIIlllllII = llIIIllllIl[0];
        while (aP.lIIllllllIIIlI(llllllllllllllllIlIIIIlIIlllllII, llllllllllllllllIlIIIIlIIlllllIl)) {
            char llllllllllllllllIlIIIIlIlIIIlIIl = llllllllllllllllIlIIIIlIIllllllI[llllllllllllllllIlIIIIlIIlllllII];
            llllllllllllllllIlIIIIlIlIIIIllI.append((char)(llllllllllllllllIlIIIIlIlIIIlIIl ^ llllllllllllllllIlIIIIlIlIIIIlIl[llllllllllllllllIlIIIIlIlIIIIlII % llllllllllllllllIlIIIIlIlIIIIlIl.length]));
            0;
            ++llllllllllllllllIlIIIIlIlIIIIlII;
            ++llllllllllllllllIlIIIIlIIlllllII;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIIIIlIlIIIIllI);
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
    protected aP(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bC() {
        void llllllllllllllllIlIIIIlIlIlIlIIl;
        aP llllllllllllllllIlIIIIlIlIlIlIlI;
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(llIIIllllII[llIIIllllIl[2]]));
        if (!aP.lIIlllllIlllll(nPC2) || aP.lIIllllllIIIII(nPC2.isDead() ? 1 : 0)) {
            return llIIIllllIl[0];
        }
        if (aP.lIIllllllIIIIl(llllllllllllllllIlIIIIlIlIlIlIlI.eh ? 1 : 0)) {
            return llIIIllllIl[0];
        }
        WorldPoint llllllllllllllllIlIIIIlIlIlIlIII = Players.getLocal().getWorldLocation();
        if (aP.lIIllllllIIIII(llllllllllllllllIlIIIIlIlIlIlIIl.getWorldArea().isInMeleeDistance(llllllllllllllllIlIIIIlIlIlIlIII) ? 1 : 0)) {
            return llIIIllllIl[1];
        }
        Movement.setDestination((WorldPoint)nPC2.getWorldArea().getCenter());
        return llIIIllllIl[1];
    }
}

