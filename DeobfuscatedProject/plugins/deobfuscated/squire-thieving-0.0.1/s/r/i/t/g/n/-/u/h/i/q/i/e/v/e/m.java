/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Hitsplat
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.HitsplatApplied
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Hitsplat;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.b;

@TaskDesc(name="Cancelling attacking bandit/thug", priority=8, blocking=true, register=true)
public class m
extends Task {
    private /* synthetic */ boolean M;
    private static /* synthetic */ String[] lIIlllIIIllll;
    private final /* synthetic */ SquireThievingConfig L;
    private static /* synthetic */ int[] lIIlllIIlIIII;

    private static boolean lIllIIlIllIlIlI(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        void llllllllllllllIlllIllIIIlIIllIIl;
        Hitsplat hitsplat = hitsplatApplied.getHitsplat();
        if (!m.lIllIIlIllIlllI(hitsplat.getAmount(), lIIlllIIlIIII[3]) || m.lIllIIlIllIllll(hitsplat.getAmount(), lIIlllIIlIIII[4])) {
            return;
        }
        if (m.lIllIIlIllIllIl(llllllllllllllIlllIllIIIlIIllIIl.getActor() instanceof NPC)) {
            return;
        }
        Player llllllllllllllIlllIllIIIlIIlIlll = (Player)llllllllllllllIlllIllIIIlIIllIIl.getActor();
        if (m.lIllIIlIllIlIlI(llllllllllllllIlllIllIIIlIIlIlll, Players.getLocal())) {
            return;
        }
        this.M = lIIlllIIlIIII[1];
    }

    private static boolean lIllIIlIllIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIllIIlIllIlIIl() {
        lIIlllIIlIIII = new int[6];
        m.lIIlllIIlIIII[0] = (0x55 ^ 0x5E) & ~(0x28 ^ 0x23);
        m.lIIlllIIlIIII[1] = 1;
        m.lIIlllIIlIIII[2] = 2;
        m.lIIlllIIlIIII[3] = 0x18 ^ 0x1C;
        m.lIIlllIIlIIII[4] = 0xAA ^ 0xAF;
        m.lIIlllIIlIIII[5] = 3;
    }

    private static boolean lIllIIlIllIlIll(int n2) {
        return n2 == 0;
    }

    private static String lIllIIlIllIIlll(String llllllllllllllIlllIllIIIIlllIIIl, String llllllllllllllIlllIllIIIIlllIIII) {
        try {
            SecretKeySpec llllllllllllllIlllIllIIIIlllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIIIlllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIIIIlllIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIIIIlllIlIl.init(lIIlllIIlIIII[2], llllllllllllllIlllIllIIIIlllIllI);
            return new String(llllllllllllllIlllIllIIIIlllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIIIIlllIlII) {
            llllllllllllllIlllIllIIIIlllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIlllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIIlIllIlIII() {
        lIIlllIIIllll = new String[lIIlllIIlIIII[3]];
        m.lIIlllIIIllll[m.lIIlllIIlIIII[0]] = m."Pickpocket";
        m.lIIlllIIIllll[m.lIIlllIIlIIII[1]] = m."during combat";
        m.lIIlllIIIllll[m.lIIlllIIlIIII[2]] = m."after combat";
        m.lIIlllIIIllll[m.lIIlllIIlIIII[5]] = m."Attack";
    }

    private static boolean lIllIIlIllIllII(Object object) {
        return object == null;
    }

    static {
        m.lIllIIlIllIlIIl();
        m.lIllIIlIllIlIII();
    }

    private static boolean lIllIIlIllIlllI(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        m llllllllllllllIlllIllIIIlIlIIlll;
        if (m.lIllIIlIllIlIlI((Object)this.L.method(), (Object)b.BLACK_JACK)) {
            return lIIlllIIlIIII[0];
        }
        if (m.lIllIIlIllIlIll(llllllllllllllIlllIllIIIlIlIIlll.M ? 1 : 0)) {
            return lIIlllIIlIIII[0];
        }
        Player llllllllllllllIlllIllIIIlIlIIllI = Players.getLocal();
        NPC llllllllllllllIlllIllIIIlIlIIlIl = NPCs.getNearest(nPC -> {
            int n2;
            if (m.lIllIIlIlllIIII(nPC.getInteracting(), llllllllllllllIlllIllIIIlIlIIllI) && m.lIllIIlIllIllIl(nPC.hasAction(lIIlllIIIllll[lIIlllIIlIIII[5]]::equals) ? 1 : 0)) {
                n2 = lIIlllIIlIIII[1];
                0;
                if (-1 != -1) {
                    return ((93 + 5 - 12 + 71 ^ 92 + 104 - 69 + 1) & (0xC9 ^ 0xB7 ^ (0x4E ^ 0x2D) ^ -1)) != 0;
                }
            } else {
                n2 = lIIlllIIlIIII[0];
            }
            return n2 != 0;
        });
        if (m.lIllIIlIllIllII(llllllllllllllIlllIllIIIlIlIIlIl)) {
            llllllllllllllIlllIllIIIlIlIIlll.M = lIIlllIIlIIII[0];
            return lIIlllIIlIIII[1];
        }
        var2_2.interact(lIIlllIIIllll[lIIlllIIlIIII[0]]);
        return lIIlllIIlIIII[1];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void b(ChatMessage chatMessage) {
        void llllllllllllllIlllIllIIIlIlIIIII;
        if (m.lIllIIlIllIlIlI((Object)this.L.method(), (Object)b.BLACK_JACK)) {
            return;
        }
        if (m.lIllIIlIllIlIlI(llllllllllllllIlllIllIIIlIlIIIII.getType(), ChatMessageType.GAMEMESSAGE) && m.lIllIIlIllIlIlI(llllllllllllllIlllIllIIIlIlIIIII.getType(), ChatMessageType.SPAM)) {
            return;
        }
        String llllllllllllllIlllIllIIIlIIlllll = llllllllllllllIlllIllIIIlIlIIIII.getMessage();
        if (!m.lIllIIlIllIlIll(llllllllllllllIlllIllIIIlIIlllll.contains(lIIlllIIIllll[lIIlllIIlIIII[1]]) ? 1 : 0) || m.lIllIIlIllIllIl(llllllllllllllIlllIllIIIlIIlllll.contains(lIIlllIIIllll[lIIlllIIlIIII[2]]) ? 1 : 0)) {
            llllllllllllllIlllIllIIIlIlIIIIl.M = lIIlllIIlIIII[1];
        }
    }

    private static boolean lIllIIlIlllIIII(Object object, Object object2) {
        return object == object2;
    }

    private static String lIllIIlIllIIllI(String llllllllllllllIlllIllIIIlIIIlIII, String llllllllllllllIlllIllIIIlIIIIIlI) {
        llllllllllllllIlllIllIIIlIIIlIII = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIIIlIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIIIlIIIIllI = new StringBuilder();
        char[] llllllllllllllIlllIllIIIlIIIIlIl = llllllllllllllIlllIllIIIlIIIIIlI.toCharArray();
        int llllllllllllllIlllIllIIIlIIIIlII = lIIlllIIlIIII[0];
        char[] llllllllllllllIlllIllIIIIllllllI = llllllllllllllIlllIllIIIlIIIlIII.toCharArray();
        int llllllllllllllIlllIllIIIIlllllIl = llllllllllllllIlllIllIIIIllllllI.length;
        int llllllllllllllIlllIllIIIIlllllII = lIIlllIIlIIII[0];
        while (m.lIllIIlIlllIIIl(llllllllllllllIlllIllIIIIlllllII, llllllllllllllIlllIllIIIIlllllIl)) {
            char llllllllllllllIlllIllIIIlIIIlIIl = llllllllllllllIlllIllIIIIllllllI[llllllllllllllIlllIllIIIIlllllII];
            llllllllllllllIlllIllIIIlIIIIllI.append((char)(llllllllllllllIlllIllIIIlIIIlIIl ^ llllllllllllllIlllIllIIIlIIIIlIl[llllllllllllllIlllIllIIIlIIIIlII % llllllllllllllIlllIllIIIlIIIIlIl.length]));
            0;
            ++llllllllllllllIlllIllIIIlIIIIlII;
            ++llllllllllllllIlllIllIIIIlllllII;
            0;
            if (-(0x9B ^ 0x9E) < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIllIIIlIIIIllI);
    }

    @Inject
    public m(SquireThievingConfig squireThievingConfig) {
        this.L = squireThievingConfig;
    }

    private static boolean lIllIIlIllIllIl(int n2) {
        return n2 != 0;
    }
}

