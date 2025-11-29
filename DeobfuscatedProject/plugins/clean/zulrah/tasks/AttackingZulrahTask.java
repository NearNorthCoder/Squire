/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahTaskBase;
import gg.squire.zulrah.tasks.GameEnum24;
import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Attacking zulrah", priority=35, register=true)
public class AttackingZulrahTask
extends ZulrahTaskBase {

    private  int ar;
    private final  SquireZulrah aq;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ac() {
        void var1_1;
        T var1;
        if (T.llIIIlllllIIIll(this.aB.getTickCount() - this.az.Z(), lIllIlIIlllIl[0])) {
            return lIllIlIIlllIl[1];
        }
        String[] stringArray = new String[lIllIlIIlllIl[0]];
        stringArray[T.lIllIlIIlllIl[1]] = lIllIlIIlllII[lIllIlIIlllIl[1]];
        NPC var2 = NPCs.getNearest((String[])stringArray);
        if (!T.llIIIlllllIIlII(var2) || !T.llIIIlllllIIlIl(var2.getAnimation(), lIllIlIIlllIl[2]) || T.llIIIlllllIIllI(var2.isDead() ? 1 : 0)) {
            return lIllIlIIlllIl[1];
        }
        Player var3 = Players.getLocal();
        WorldPoint var4 = var3.getWorldLocation();
        k var5 = var1.az.V().C();
        if (T.llIIIlllllIIllI(var3.isMoving() ? 1 : 0) && T.llIIIlllllIIlll((Object)var5, (Object)k.INITIAL)) {
            return lIllIlIIlllIl[1];
        }
        if (T.llIIIlllllIIlll((Object)var5, (Object)k.JAD_PHASE_W) && T.llIIIlllllIlIII(var1.az.aa(), lIllIlIIlllIl[3])) {
            return lIllIlIIlllIl[1];
        }
        if (!T.llIIIlllllIlIIl(var3.getInteracting()) || T.llIIIlllllIIIll(var1.aB.getTickCount() - var1.ar, lIllIlIIlllIl[0])) {
            return lIllIlIIlllIl[1];
        }
        if (T.llIIIlllllIIllI(var3.isMoving() ? 1 : 0) && T.llIIIlllllIIlll((Object)var5, (Object)k.MAGMA_CENTER_NW)) {
            return lIllIlIIlllIl[1];
        }
        var1_1.interact(lIllIlIIlllIl[0]);
        this.sleep(lIllIlIIlllIl[0]);
        return lIllIlIIlllIl[0];
    }

    private static boolean llIIIlllllIIlII(Object object) {
        return object != null;
    }

    private static boolean llIIIlllllIIlll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIIIlllllIlIIl(Object object) {
        return object == null;
    }

    static {
        T.llIIIlllllIIIlI();
        T.llIIIlllllIIIIl();
    }

    private static boolean llIIIlllllIIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIIlllllIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIlllllIIllI(int n2) {
        return n2 != 0;
    }

    @Inject
    protected AttackingZulrahTask(SquireZulrah squireZulrah, v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
        this.aq = squireZulrah;
    }

    private static void llIIIlllllIIIIl() {
        lIllIlIIlllII = new String[lIllIlIIlllIl[4]];
        T.lIllIlIIlllII[T.lIllIlIIlllIl[1]] = "Zulrah";
        T.lIllIlIIlllII[T.lIllIlIIlllIl[0]] = "You eat";
    }

    private static boolean llIIIlllllIlIII(int n2, int n3) {
        return n2 >= n3;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (T.llIIIlllllIIllI(chatMessage.getMessage().contains(lIllIlIIlllII[lIllIlIIlllIl[0]]) ? 1 : 0)) {
            this.ar = this.aB.getTickCount();
        }
    }
}

