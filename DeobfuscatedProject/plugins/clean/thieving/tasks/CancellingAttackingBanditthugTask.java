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
package gg.squire.thieving.tasks;

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
import gg.squire.thieving.tasks.GameEnum;

@TaskDesc(name="Cancelling attacking bandit/thug", priority=8, blocking=true, register=true)
public class CancellingAttackingBanditthugTask
extends Task {
    private  boolean M;
    
    private final  SquireThievingConfig L;

    private static boolean lIllIIlIllIlIlI(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        void var1;
        Hitsplat hitsplat = hitsplatApplied.getHitsplat();
        if (!m.lIllIIlIllIlllI(hitsplat.getAmount(), lIIlllIIlIIII[3]) || m.lIllIIlIllIllll(hitsplat.getAmount(), lIIlllIIlIIII[4])) {
            return;
        }
        if (m.lIllIIlIllIllIl(var1.getActor() instanceof NPC)) {
            return;
        }
        Player var2 = (Player)var1.getActor();
        if (m.lIllIIlIllIlIlI(var2, Players.getLocal())) {
            return;
        }
        this.M = lIIlllIIlIIII[1];
    }

    private static boolean lIllIIlIllIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIIlIllIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIlIlllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIIlIllIlIII() {
        lIIlllIIIllll = new String[lIIlllIIlIIII[3]];
        m.lIIlllIIIllll[m.lIIlllIIlIIII[0]] = "Pickpocket";
        m.lIIlllIIIllll[m.lIIlllIIlIIII[1]] = "during combat";
        m.lIIlllIIIllll[m.lIIlllIIlIIII[2]] = "after combat";
        m.lIIlllIIIllll[m.lIIlllIIlIIII[5]] = "Attack";
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
        m var3;
        if (m.lIllIIlIllIlIlI((Object)this.L.method(), (Object)b.BLACK_JACK)) {
            return lIIlllIIlIIII[0];
        }
        if (m.lIllIIlIllIlIll(var3.M ? 1 : 0)) {
            return lIIlllIIlIIII[0];
        }
        Player var4 = Players.getLocal();
        NPC var5 = NPCs.getNearest(nPC -> {
            int n2;
            if (m.lIllIIlIlllIIII(nPC.getInteracting(), var4) && m.lIllIIlIllIllIl(nPC.hasAction(lIIlllIIIllll[lIIlllIIlIIII[5]]::equals) ? 1 : 0)) {
                n2 = lIIlllIIlIIII[1];

                if (-1 != -1) {
                    return ((93 + 5 - 12 + 71 ^ 92 + 104 - 69 + 1) & (0xC9 ^ 0xB7 ^ (0x4E ^ 0x2D) ^ -1)) != 0;
                }
            } else {
                n2 = lIIlllIIlIIII[0];
            }
            return n2 != 0;
        });
        if (m.lIllIIlIllIllII(var5)) {
            var3.M = lIIlllIIlIIII[0];
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
        void var6;
        if (m.lIllIIlIllIlIlI((Object)this.L.method(), (Object)b.BLACK_JACK)) {
            return;
        }
        if (m.lIllIIlIllIlIlI(var6.getType(), ChatMessageType.GAMEMESSAGE) && m.lIllIIlIllIlIlI(var6.getType(), ChatMessageType.SPAM)) {
            return;
        }
        String var7 = var6.getMessage();
        if (!m.lIllIIlIllIlIll(var7.contains(lIIlllIIIllll[lIIlllIIlIIII[1]]) ? 1 : 0) || m.lIllIIlIllIllIl(var7.contains(lIIlllIIIllll[lIIlllIIlIIII[2]]) ? 1 : 0)) {
            var8.M = lIIlllIIlIIII[1];
        }
    }

    private static boolean lIllIIlIlllIIII(Object object, Object object2) {
        return object == object2;
    }

        return String.valueOf(var9);
    }

    @Inject
    public CancellingAttackingBanditthugTask(SquireThievingConfig squireThievingConfig) {
        this.L = squireThievingConfig;
    }

    private static boolean lIllIIlIllIllIl(int n2) {
        return n2 != 0;
    }
}

