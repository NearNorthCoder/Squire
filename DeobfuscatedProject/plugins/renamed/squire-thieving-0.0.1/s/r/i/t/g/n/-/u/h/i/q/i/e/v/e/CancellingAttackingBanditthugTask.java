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
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.BEnum;

/* TASK: Cancelling attacking bandit/thug -> Cancellingattackingbandit/ThugTask */
@TaskDesc(name="Cancelling attacking bandit/thug", priority=8, blocking=true, register=true)
public class CancellingAttackingBanditthugTask
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
        void var18;
        Hitsplat hitsplat = hitsplatApplied.getHitsplat();
        if (!m.lIllIIlIllIlllI(hitsplat.getAmount(), lIIlllIIlIIII[3]) || m.lIllIIlIllIllll(hitsplat.getAmount(), lIIlllIIlIIII[4])) {
            return;
        }
        if (m.lIllIIlIllIllIl(var18.getActor() instanceof NPC)) {
            return;
        }
        Player var16 = (Player)var18.getActor();
        if (m.lIllIIlIllIlIlI(var16, Players.getLocal())) {
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

    private static String lIllIIlIllIIlll(String var11, String var10) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(lIIlllIIlIIII[2], var1);
            return new String(var13.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
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
        m var8;
        if (m.lIllIIlIllIlIlI((Object)this.L.method(), (Object)b.BLACK_JACK)) {
            return lIIlllIIlIIII[0];
        }
        if (m.lIllIIlIllIlIll(var8.M ? 1 : 0)) {
            return lIIlllIIlIIII[0];
        }
        Player var4 = Players.getLocal();
        NPC var12 = NPCs.getNearest(nPC -> {
            int n2;
            if (m.lIllIIlIlllIIII(nPC.getInteracting(), var4) && m.lIllIIlIllIllIl(nPC.hasAction(lIIlllIIIllll[lIIlllIIlIIII[5]]::equals) ? 1 : 0)) {
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
        if (m.lIllIIlIllIllII(var12)) {
            var8.M = lIIlllIIlIIII[0];
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
        void var9;
        if (m.lIllIIlIllIlIlI((Object)this.L.method(), (Object)b.BLACK_JACK)) {
            return;
        }
        if (m.lIllIIlIllIlIlI(var9.getType(), ChatMessageType.GAMEMESSAGE) && m.lIllIIlIllIlIlI(var9.getType(), ChatMessageType.SPAM)) {
            return;
        }
        String var15 = var9.getMessage();
        if (!m.lIllIIlIllIlIll(var15.contains(lIIlllIIIllll[lIIlllIIlIIII[1]]) ? 1 : 0) || m.lIllIIlIllIllIl(var15.contains(lIIlllIIIllll[lIIlllIIlIIII[2]]) ? 1 : 0)) {
            llllllllllllllIlllIllIIIlIlIIIIl.M = lIIlllIIlIIII[1];
        }
    }

    private static boolean lIllIIlIlllIIII(Object object, Object object2) {
        return object == object2;
    }

    private static String lIllIIlIllIIllI(String var19, String var6) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var20 = var6.toCharArray();
        int var2 = lIIlllIIlIIII[0];
        char[] var7 = var19.toCharArray();
        int var3 = var7.length;
        int var17 = lIIlllIIlIIII[0];
        while (m.lIllIIlIlllIIIl(var17, var3)) {
            char var5 = var7[var17];
            var14.append((char)(var5 ^ var20[var2 % var20.length]));
            0;
            ++var2;
            ++var17;
            0;
            if (-(0x9B ^ 0x9E) < 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    @Inject
    public m(SquireThievingConfig squireThievingConfig) {
        this.L = squireThievingConfig;
    }

    private static boolean lIllIIlIllIllIl(int n2) {
        return n2 != 0;
    }
}

