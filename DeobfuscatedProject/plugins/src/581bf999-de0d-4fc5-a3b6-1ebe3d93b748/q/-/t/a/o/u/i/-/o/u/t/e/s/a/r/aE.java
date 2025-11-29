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
 *  net.unethicalite.api.entities.NPCs
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
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
import net.unethicalite.api.entities.NPCs;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.W;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.v;

@TaskDesc(name="Handling Warden Prayers", register=true, priority=0x7FFFFFFF)
public class aE
extends W {
    private /* synthetic */ Prayer dE;
    private static /* synthetic */ int[] llIllIIIIll;
    private static /* synthetic */ String[] llIlIllllll;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void llllllllllllllllIIlIllllllIIllIl;
        if (aE.lIlIlIIIllIIll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String llllllllllllllllIIlIllllllIIllII = llllllllllllllllIIlIllllllIIllIl.getMessage();
        if (aE.lIlIlIIIllIIIl(llllllllllllllllIIlIllllllIIllII.contains(llIlIllllll[llIllIIIIll[2]]) ? 1 : 0)) {
            llllllllllllllllIIlIllllllIIlllI.dE = Prayer.PROTECT_FROM_MELEE;
            "".length();
            if ((0xE6 ^ 0xA4 ^ (0xD4 ^ 0x92)) <= "  ".length()) {
                return;
            }
        } else if (aE.lIlIlIIIllIIIl(llllllllllllllllIIlIllllllIIllII.contains(llIlIllllll[llIllIIIIll[4]]) ? 1 : 0)) {
            llllllllllllllllIIlIllllllIIlllI.dE = Prayer.PROTECT_FROM_MAGIC;
            "".length();
            if (-" ".length() > ((0x8C ^ 0xB6) & ~(0x36 ^ 0xC))) {
                return;
            }
        } else if (aE.lIlIlIIIllIIIl(llllllllllllllllIIlIllllllIIllII.contains(llIlIllllll[llIllIIIIll[1]]) ? 1 : 0)) {
            llllllllllllllllIIlIllllllIIlllI.dE = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    @Override
    public int aO() {
        return llIllIIIIll[0];
    }

    @Inject
    public aE(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
    }

    private static boolean lIlIlIIIllIIII(Object object) {
        return object != null;
    }

    private static boolean lIlIlIIIllIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIIIlIllll(Object object) {
        return object == null;
    }

    private static String lIlIlIIIlIllII(String llllllllllllllllIIlIlllllIllIlll, String llllllllllllllllIIlIlllllIllIllI) {
        try {
            SecretKeySpec llllllllllllllllIIlIlllllIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlllllIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlllllIlllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlllllIlllIIl.init(llIllIIIIll[1], llllllllllllllllIIlIlllllIlllIlI);
            return new String(llllllllllllllllIIlIlllllIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlllllIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlllllIlllIII) {
            llllllllllllllllIIlIlllllIlllIII.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIIIlIlllI() {
        llIllIIIIll = new int[19];
        aE.llIllIIIIll[0] = -(0xFFFFE6E9 & 0x5DBF) & (0xFFFFFFFF & 0x7FF8);
        aE.llIllIIIIll[1] = "  ".length();
        aE.llIllIIIIll[2] = (0x55 ^ 0x1B) & ~(0xD4 ^ 0x9A);
        aE.llIllIIIIll[3] = 0xFFFFFFFB & 0x2DFE;
        aE.llIllIIIIll[4] = " ".length();
        aE.llIllIIIIll[5] = -(0xFFFFC3D7 & 0x7E2D) & (0xFFFFFFFF & 0x6FFF);
        aE.llIllIIIIll[6] = 0xAD ^ 0xAB;
        aE.llIllIIIIll[7] = -(0xFFFFBDB5 & 0x524F) & (0xFFFFBFEF & 0x7DFD);
        aE.llIllIIIIll[8] = -(0xFFFFF3FE & 0x1E03) & (0xFFFFFFEF & 0x3FFB);
        aE.llIllIIIIll[9] = -(0xFFFFAA45 & 0x57BB) & (0xFFFFFFFF & 0x2FEB);
        aE.llIllIIIIll[10] = "   ".length();
        aE.llIllIIIIll[11] = -" ".length() & (0xFFFFBDED & 0x6FFE);
        aE.llIllIIIIll[12] = 107 + 116 - 115 + 71 ^ 91 + 10 - -62 + 20;
        aE.llIllIIIIll[13] = -(0xFFFFC6BF & 0x7B51) & (0xFFFFFFFF & 0x6FFD);
        aE.llIllIIIIll[14] = 0x82 ^ 0xAE ^ (0x9C ^ 0xB5);
        aE.llIllIIIIll[15] = 0xFFFFEDEF & 0x3FFE;
        aE.llIllIIIIll[16] = 0xFFFFFDFF & 0x27BC;
        aE.llIllIIIIll[17] = -(0xFFFFDF07 & 0x7AFB) & (0xFFFFFFBF & Short.MAX_VALUE);
        aE.llIllIIIIll[18] = 0x75 ^ 0x7D;
    }

    private static void lIlIlIIIlIllIl() {
        llIlIllllll = new String[llIllIIIIll[10]];
        aE.llIlIllllll[aE.llIllIIIIll[2]] = aE.lIlIlIIIlIlIll("Fc/kw894I/jutRQtro+7aw==", "FhKsc");
        aE.llIlIllllll[aE.llIllIIIIll[4]] = aE.lIlIlIIIlIlIll("6CAaF9JmNxM=", "ELxim");
        aE.llIlIllllll[aE.llIllIIIIll[1]] = aE.lIlIlIIIlIllII("y9p6fsIN57s=", "OBhdm");
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

    private static String lIlIlIIIlIlIll(String llllllllllllllllIIlIllllllIIIIlI, String llllllllllllllllIIlIllllllIIIIll) {
        try {
            SecretKeySpec llllllllllllllllIIlIllllllIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllllllIIIIll.getBytes(StandardCharsets.UTF_8)), llIllIIIIll[18]), "DES");
            Cipher llllllllllllllllIIlIllllllIIIllI = Cipher.getInstance("DES");
            llllllllllllllllIIlIllllllIIIllI.init(llIllIIIIll[1], llllllllllllllllIIlIllllllIIIlll);
            return new String(llllllllllllllllIIlIllllllIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllllllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIllllllIIIlIl) {
            llllllllllllllllIIlIllllllIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIllIIlI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean aL() {
        int[] nArray = new int[llIllIIIIll[1]];
        nArray[aE.llIllIIIIll[2]] = llIllIIIIll[3];
        nArray[aE.llIllIIIIll[4]] = llIllIIIIll[5];
        if (aE.lIlIlIIIllIIII(NPCs.getNearest((int[])nArray))) {
            return llIllIIIIll[4];
        }
        int[] nArray2 = new int[llIllIIIIll[6]];
        nArray2[aE.llIllIIIIll[2]] = llIllIIIIll[7];
        nArray2[aE.llIllIIIIll[4]] = llIllIIIIll[8];
        nArray2[aE.llIllIIIIll[1]] = llIllIIIIll[9];
        nArray2[aE.llIllIIIIll[10]] = llIllIIIIll[11];
        nArray2[aE.llIllIIIIll[12]] = llIllIIIIll[13];
        nArray2[aE.llIllIIIIll[14]] = llIllIIIIll[15];
        return this.cm.a(nArray2);
    }

    private static boolean lIlIlIIIllIIll(Object object, Object object2) {
        return object != object2;
    }

    @Override
    public boolean aS() {
        return this.aL();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void llllllllllllllllIIlIllllllIlIIlI;
        Actor actor = animationChanged.getActor();
        if (aE.lIlIlIIIllIIIl(actor instanceof Player)) {
            return;
        }
        if (aE.lIlIlIIIllIIlI(llllllllllllllllIIlIllllllIlIIlI.getAnimation(), llIllIIIIll[16])) {
            llllllllllllllllIIlIllllllIlIlII.dE = Prayer.PROTECT_FROM_MISSILES;
            "".length();
            if (null != null) {
                return;
            }
        } else if (aE.lIlIlIIIllIIlI(llllllllllllllllIIlIllllllIlIIlI.getAnimation(), llIllIIIIll[17])) {
            llllllllllllllllIIlIllllllIlIlII.dE = Prayer.PROTECT_FROM_MAGIC;
        }
    }

    static {
        aE.lIlIlIIIlIlllI();
        aE.lIlIlIIIlIllIl();
    }

    @Override
    public List<Prayer> aN() {
        if (aE.lIlIlIIIlIllll(this.dE)) {
            return List.of(this.aQ());
        }
        return List.of(this.aQ(), this.dE);
    }
}

