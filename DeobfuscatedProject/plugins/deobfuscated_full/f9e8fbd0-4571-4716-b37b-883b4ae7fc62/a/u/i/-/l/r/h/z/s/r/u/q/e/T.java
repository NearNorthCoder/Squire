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
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.ad;
import a.u.i.-.l.r.h.z.s.r.u.q.e.k;
import a.u.i.-.l.r.h.z.s.r.u.q.e.v;
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

/* TASK: Attacking zulrah -> AttackingzulrahTask */
@TaskDesc(name="Attacking zulrah", priority=35, register=true)
public class T
extends ad {
    private static /* synthetic */ int[] lIllIlIIlllIl;
    private static /* synthetic */ String[] lIllIlIIlllII;
    private /* synthetic */ int ar;
    private final /* synthetic */ SquireZulrah aq;

    private static void llIIIlllllIIIlI() {
        lIllIlIIlllIl = new int[5];
        T.lIllIlIIlllIl[0] = 1;
        T.lIllIlIIlllIl[1] = (0x7E ^ 0x20) & ~(5 ^ 0x5B);
        T.lIllIlIIlllIl[2] = 0xFFFFDFFD & 0x33D2;
        T.lIllIlIIlllIl[3] = 76 + 111 - 175 + 123 ^ 10 + 68 - -22 + 43;
        T.lIllIlIIlllIl[4] = 2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ac() {
        void var1_1;
        T var9;
        if (T.llIIIlllllIIIll(this.aB.getTickCount() - this.az.Z(), lIllIlIIlllIl[0])) {
            return lIllIlIIlllIl[1];
        }
        String[] stringArray = new String[lIllIlIIlllIl[0]];
        stringArray[T.lIllIlIIlllIl[1]] = lIllIlIIlllII[lIllIlIIlllIl[1]];
        NPC var2 = NPCs.getNearest((String[])stringArray);
        if (!T.llIIIlllllIIlII(var2) || !T.llIIIlllllIIlIl(var2.getAnimation(), lIllIlIIlllIl[2]) || T.llIIIlllllIIllI(var2.isDead() ? 1 : 0)) {
            return lIllIlIIlllIl[1];
        }
        Player var6 = Players.getLocal();
        WorldPoint llllllllllllllIllIIIlllIlIllIIII = var6.getWorldLocation();
        k var1 = var9.az.V().C();
        if (T.llIIIlllllIIllI(var6.isMoving() ? 1 : 0) && T.llIIIlllllIIlll((Object)var1, (Object)k.INITIAL)) {
            return lIllIlIIlllIl[1];
        }
        if (T.llIIIlllllIIlll((Object)var1, (Object)k.JAD_PHASE_W) && T.llIIIlllllIlIII(var9.az.aa(), lIllIlIIlllIl[3])) {
            return lIllIlIIlllIl[1];
        }
        if (!T.llIIIlllllIlIIl(var6.getInteracting()) || T.llIIIlllllIIIll(var9.aB.getTickCount() - var9.ar, lIllIlIIlllIl[0])) {
            return lIllIlIIlllIl[1];
        }
        if (T.llIIIlllllIIllI(var6.isMoving() ? 1 : 0) && T.llIIIlllllIIlll((Object)var1, (Object)k.MAGMA_CENTER_NW)) {
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

    private static String llIIIlllllIIIII(String var4, String var7) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lIllIlIIlllIl[3]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lIllIlIIlllIl[4], var8);
            return new String(var3.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
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
    protected T(SquireZulrah squireZulrah, v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
        this.aq = squireZulrah;
    }

    private static void llIIIlllllIIIIl() {
        lIllIlIIlllII = new String[lIllIlIIlllIl[4]];
        T.lIllIlIIlllII[T.lIllIlIIlllIl[1]] = T."Zulrah";
        T.lIllIlIIlllII[T.lIllIlIIlllIl[0]] = T."You eat";
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

