/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 */
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.n;
import -.r.u.q.e.s.o.t.a.i.z;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;

@TaskDesc(name="Handling Warden Prayers", register=true)
public class G
extends z {
    private static /* synthetic */ String[] lIIllllllllIl;
    private /* synthetic */ Prayer ba;
    private static /* synthetic */ int[] lIIlllllllllI;

    @Override
    public boolean C() {
        int[] nArray = new int[lIIlllllllllI[1]];
        nArray[G.lIIlllllllllI[2]] = lIIlllllllllI[3];
        nArray[G.lIIlllllllllI[4]] = lIIlllllllllI[5];
        nArray[G.lIIlllllllllI[6]] = lIIlllllllllI[7];
        nArray[G.lIIlllllllllI[8]] = lIIlllllllllI[9];
        nArray[G.lIIlllllllllI[10]] = lIIlllllllllI[11];
        nArray[G.lIIlllllllllI[12]] = lIIlllllllllI[13];
        return this.aS.a(nArray);
    }

    private static void lIllIlIllIIllII() {
        lIIlllllllllI = new int[17];
        G.lIIlllllllllI[0] = 0xFFFFFF71 & 0x3BDE;
        G.lIIlllllllllI[1] = 0x50 ^ 0x56;
        G.lIIlllllllllI[2] = (0xA ^ 6) & ~(0x91 ^ 0x9D);
        G.lIIlllllllllI[3] = -(0xFFFF9B5F & 0x76B1) & (0xFFFFFFFB & 0x3FFD);
        G.lIIlllllllllI[4] = 1;
        G.lIIlllllllllI[5] = -(0xFFFFB7D6 & 0x5A3F) & (0xFFFFFFFF & 0x3FFF);
        G.lIIlllllllllI[6] = 2;
        G.lIIlllllllllI[7] = -(0x27 ^ 0x32) & (0xFFFFFFFF & 0x2DFF);
        G.lIIlllllllllI[8] = 3;
        G.lIIlllllllllI[9] = -(0xFFFFD7DB & 0x7A37) & (0xFFFFFFFE & Short.MAX_VALUE);
        G.lIIlllllllllI[10] = 0x35 ^ 0x31;
        G.lIIlllllllllI[11] = -(0xFFFF9B7B & 0x7697) & (0xFFFFFFFF & 0x3FFF);
        G.lIIlllllllllI[12] = 0x67 ^ 0x62;
        G.lIIlllllllllI[13] = -2 & (0xFFFFAFFF & 0x7DEF);
        G.lIIlllllllllI[14] = 0xFFFFE7FF & 0x3DBC;
        G.lIIlllllllllI[15] = 0xFFFFADFD & 0x77BF;
        G.lIIlllllllllI[16] = 0x74 ^ 0x2B ^ (0x4F ^ 0x18);
    }

    private static String lIllIlIllIIlIlI(String llllllllllllllIlllIIlllIIllllIII, String llllllllllllllIlllIIlllIIllllIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIlllIIlllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlllIIllllIIl.getBytes(StandardCharsets.UTF_8)), lIIlllllllllI[16]), "DES");
            Cipher llllllllllllllIlllIIlllIIlllllII = Cipher.getInstance("DES");
            llllllllllllllIlllIIlllIIlllllII.init(lIIlllllllllI[6], llllllllllllllIlllIIlllIIlllllIl);
            return new String(llllllllllllllIlllIIlllIIlllllII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlllIIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlllIIllllIll) {
            llllllllllllllIlllIIlllIIllllIll.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Prayer> E() {
        if (G.lIllIlIllIIllIl(this.ba)) {
            return List.of(this.H());
        }
        return List.of(this.H(), this.ba);
    }

    @Override
    public boolean I() {
        return this.C();
    }

    @Override
    public n J() {
        return this.aT.prayFlickWarden();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void llllllllllllllIlllIIlllIlIIIlIII;
        Actor actor = animationChanged.getActor();
        if (G.lIllIlIllIIlllI(actor instanceof Player)) {
            return;
        }
        if (G.lIllIlIllIIllll(llllllllllllllIlllIIlllIlIIIlIII.getAnimation(), lIIlllllllllI[14])) {
            llllllllllllllIlllIIlllIlIIIlIlI.ba = Prayer.PROTECT_FROM_MISSILES;
            0;
            if (null != null) {
                return;
            }
        } else if (G.lIllIlIllIIllll(llllllllllllllIlllIIlllIlIIIlIII.getAnimation(), lIIlllllllllI[15])) {
            llllllllllllllIlllIIlllIlIIIlIlI.ba = Prayer.PROTECT_FROM_MAGIC;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void llllllllllllllIlllIIlllIlIIIIIll;
        if (G.lIllIlIllIlIIII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String llllllllllllllIlllIIlllIlIIIIIlI = llllllllllllllIlllIIlllIlIIIIIll.getMessage();
        if (G.lIllIlIllIIlllI(llllllllllllllIlllIIlllIlIIIIIlI.contains(lIIllllllllIl[lIIlllllllllI[2]]) ? 1 : 0)) {
            llllllllllllllIlllIIlllIlIIIIlII.ba = Prayer.PROTECT_FROM_MELEE;
            0;
            if (1 < 0) {
                return;
            }
        } else if (G.lIllIlIllIIlllI(llllllllllllllIlllIIlllIlIIIIIlI.contains(lIIllllllllIl[lIIlllllllllI[4]]) ? 1 : 0)) {
            llllllllllllllIlllIIlllIlIIIIlII.ba = Prayer.PROTECT_FROM_MAGIC;
            0;
            if (2 < ((0x5B ^ 0x6B) & ~(0x2F ^ 0x1F))) {
                return;
            }
        } else if (G.lIllIlIllIIlllI(llllllllllllllIlllIIlllIlIIIIIlI.contains(lIIllllllllIl[lIIlllllllllI[6]]) ? 1 : 0)) {
            llllllllllllllIlllIIlllIlIIIIlII.ba = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    private static boolean lIllIlIllIIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIllIlIllIIlIll() {
        lIIllllllllIl = new String[lIIlllllllllI[8]];
        G.lIIllllllllIl[G.lIIlllllllllI[2]] = G."scimitar";
        G.lIIllllllllIl[G.lIIlllllllllI[4]] = G."skull";
        G.lIIllllllllIl[G.lIIlllllllllI[6]] = G."arrow";
    }

    private static boolean lIllIlIllIlIIII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIlIllIIllIl(Object object) {
        return object == null;
    }

    private static boolean lIllIlIllIIlllI(int n2) {
        return n2 != 0;
    }

    static {
        G.lIllIlIllIIllII();
        G.lIllIlIllIIlIll();
    }

    @Override
    public int F() {
        return lIIlllllllllI[0];
    }

    @Inject
    public G(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
    }
}

