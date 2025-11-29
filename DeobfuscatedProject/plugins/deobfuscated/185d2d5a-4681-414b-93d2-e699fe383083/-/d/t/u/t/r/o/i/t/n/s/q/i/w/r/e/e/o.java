/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.a;
import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.b;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Lighting Brazier", priority=2, blocking=true, register=true)
public class o
extends Task {
    private static /* synthetic */ int[] lIlIlllllIIII;
    public static final /* synthetic */ int Y;
    private final /* synthetic */ SquireWintertodtConfig aa;
    private final /* synthetic */ b Z;
    private /* synthetic */ int ab;
    private static /* synthetic */ String[] lIlIllllIlllI;

    private static boolean llIIIIllIlIIIll(Object object) {
        return object != null;
    }

    @Inject
    public o(b b2, SquireWintertodtConfig squireWintertodtConfig) {
        this.ab = lIlIlllllIIII[0];
        this.Z = b2;
        this.aa = squireWintertodtConfig;
    }

    private static String llIIIIllIIlIlIl(String llllllllllllllIllIIlllIlIIIllIII, String llllllllllllllIllIIlllIlIIIlIIlI) {
        llllllllllllllIllIIlllIlIIIllIII = new String(Base64.getDecoder().decode(llllllllllllllIllIIlllIlIIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlllIlIIIlIllI = new StringBuilder();
        char[] llllllllllllllIllIIlllIlIIIlIlIl = llllllllllllllIllIIlllIlIIIlIIlI.toCharArray();
        int llllllllllllllIllIIlllIlIIIlIlII = lIlIlllllIIII[0];
        char[] llllllllllllllIllIIlllIlIIIIlllI = llllllllllllllIllIIlllIlIIIllIII.toCharArray();
        int llllllllllllllIllIIlllIlIIIIllIl = llllllllllllllIllIIlllIlIIIIlllI.length;
        int llllllllllllllIllIIlllIlIIIIllII = lIlIlllllIIII[0];
        while (o.llIIIIllIlIIIII(llllllllllllllIllIIlllIlIIIIllII, llllllllllllllIllIIlllIlIIIIllIl)) {
            char llllllllllllllIllIIlllIlIIIllIIl = llllllllllllllIllIIlllIlIIIIlllI[llllllllllllllIllIIlllIlIIIIllII];
            llllllllllllllIllIIlllIlIIIlIllI.append((char)(llllllllllllllIllIIlllIlIIIllIIl ^ llllllllllllllIllIIlllIlIIIlIlIl[llllllllllllllIllIIlllIlIIIlIlII % llllllllllllllIllIIlllIlIIIlIlIl.length]));
            0;
            ++llllllllllllllIllIIlllIlIIIlIlII;
            ++llllllllllllllIllIIlllIlIIIIllII;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIlllIlIIIlIllI);
    }

    static {
        o.llIIIIllIIlllII();
        o.llIIIIllIIlIlll();
        Y = lIlIlllllIIII[7];
    }

    @Subscribe
    public void b(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (!o.llIIIIllIIlllIl(string.contains(lIlIllllIlllI[lIlIlllllIIII[2]]) ? 1 : 0) || o.llIIIIllIIlllll(string.contains(lIlIllllIlllI[lIlIlllllIIII[6]]) ? 1 : 0)) {
            o llllllllllllllIllIIlllIlIIlllIlI;
            llllllllllllllIllIIlllIlIIlllIlI.sleep(lIlIlllllIIII[0]);
        }
    }

    private static boolean llIIIIllIlIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String llIIIIllIIlIllI(String llllllllllllllIllIIlllIlIIlIlIII, String llllllllllllllIllIIlllIlIIlIIlIl) {
        try {
            SecretKeySpec llllllllllllllIllIIlllIlIIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlllIlIIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIlIlllllIIII[4]), "DES");
            Cipher llllllllllllllIllIIlllIlIIlIlIlI = Cipher.getInstance("DES");
            llllllllllllllIllIIlllIlIIlIlIlI.init(lIlIlllllIIII[6], llllllllllllllIllIIlllIlIIlIlIll);
            return new String(llllllllllllllIllIIlllIlIIlIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlllIlIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlllIlIIlIlIIl) {
            llllllllllllllIllIIlllIlIIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIllIlIIIlI(Object object) {
        return object == null;
    }

    private static boolean llIIIIllIIlllll(int n2) {
        return n2 != 0;
    }

    private static String llIIIIllIIlIlII(String llllllllllllllIllIIlllIlIIIIIIIl, String llllllllllllllIllIIlllIlIIIIIIII) {
        try {
            SecretKeySpec llllllllllllllIllIIlllIlIIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlllIlIIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlllIlIIIIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlllIlIIIIIlIl.init(lIlIlllllIIII[6], llllllllllllllIllIIlllIlIIIIIllI);
            return new String(llllllllllllllIllIIlllIlIIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlllIlIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlllIlIIIIIlII) {
            llllllllllllllIllIIlllIlIIIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIllIlIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIIllIlIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        o llllllllllllllIllIIlllIlIlIIIIlI;
        if (o.llIIIIllIIlllIl(this.Z.i() ? 1 : 0)) {
            return lIlIlllllIIII[0];
        }
        a llllllllllllllIllIIlllIlIlIIIIIl = llllllllllllllIllIIlllIlIlIIIIlI.Z.q();
        Player llllllllllllllIllIIlllIlIlIIIIII = Players.getLocal();
        if (o.llIIIIllIIllllI(llllllllllllllIllIIlllIlIlIIIIlI.Z.k(), lIlIlllllIIII[1])) {
            if (o.llIIIIllIIlllll(llllllllllllllIllIIlllIlIlIIIIlI.Z.s() ? 1 : 0)) {
                return lIlIlllllIIII[2];
            }
            if (!o.llIIIIllIIlllIl(llllllllllllllIllIIlllIlIlIIIIII.isMoving() ? 1 : 0) || o.llIIIIllIlIIIII(llllllllllllllIllIIlllIlIlIIIIIl.b().distanceTo((Locatable)llllllllllllllIllIIlllIlIlIIIIII), lIlIlllllIIII[3])) {
                return lIlIlllllIIII[0];
            }
            Movement.walk((WorldPoint)llllllllllllllIllIIlllIlIlIIIIIl.b());
            return lIlIlllllIIII[2];
        }
        if (o.llIIIIllIlIIIIl(llllllllllllllIllIIlllIlIlIIIIIl.b().distanceTo((Locatable)llllllllllllllIllIIlllIlIlIIIIII), lIlIlllllIIII[3])) {
            return lIlIlllllIIII[0];
        }
        NPC llllllllllllllIllIIlllIlIIllllll = NPCs.getNearest((WorldPoint)llllllllllllllIllIIlllIlIlIIIIIl.b(), nPC -> {
            int n2;
            if (o.llIIIIllIlIIlIl(nPC.getId(), lIlIlllllIIII[7]) && o.llIIIIllIlIIlII(nPC.distanceTo(llllllllllllllIllIIlllIlIlIIIIIl.b()), lIlIlllllIIII[5])) {
                n2 = lIlIlllllIIII[2];
                0;
                if ((0xF5 ^ 0xB3 ^ (0x1A ^ 0x58)) != (8 + 47 - -3 + 69 ^ (0xC4 ^ 0xBF))) {
                    return ((0xF ^ 0x3E ^ (0x50 ^ 0x36)) & (181 + 101 - 44 + 14 ^ 78 + 151 - 180 + 122 ^ -1)) != 0;
                }
            } else {
                n2 = lIlIlllllIIII[0];
            }
            return n2 != 0;
        });
        if (o.llIIIIllIlIIIlI(llllllllllllllIllIIlllIlIIllllll)) {
            if (o.llIIIIllIlIIIIl(llllllllllllllIllIIlllIlIlIIIIlI.ab, lIlIlllllIIII[4])) {
                llllllllllllllIllIIlllIlIlIIIIlI.Z.r();
                llllllllllllllIllIIlllIlIlIIIIlI.ab = lIlIlllllIIII[0];
                return lIlIlllllIIII[0];
            }
            if (o.llIIIIllIlIIIII(llllllllllllllIllIIlllIlIlIIIIIl.b().distanceTo((Locatable)Players.getLocal()), lIlIlllllIIII[5])) {
                llllllllllllllIllIIlllIlIlIIIIlI.ab += lIlIlllllIIII[2];
            }
            return lIlIlllllIIII[0];
        }
        TileObject llllllllllllllIllIIlllIlIIlllllI = TileObjects.getNearest((WorldPoint)llllllllllllllIllIIlllIlIlIIIIIl.b(), tileObject -> {
            int n2;
            if (o.llIIIIllIlIIIll(tileObject.getName()) && o.llIIIIllIIlllll(tileObject.getName().toLowerCase(Locale.ROOT).contains(lIlIllllIlllI[lIlIlllllIIII[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlllllIIII[2]];
                stringArray[o.lIlIlllllIIII[0]] = lIlIllllIlllI[lIlIlllllIIII[1]];
                if (o.llIIIIllIIlllll(tileObject.hasAction(stringArray) ? 1 : 0) && o.llIIIIllIlIIlII(llllllllllllllIllIIlllIlIlIIIIIl.b().distanceTo((Locatable)tileObject), lIlIlllllIIII[3])) {
                    n2 = lIlIlllllIIII[2];
                    0;
                    if (3 > 2) return n2 != 0;
                    return ((36 + 126 - 157 + 235 ^ 135 + 23 - 46 + 56) & (0xD1 ^ 0xB7 ^ (0x8F ^ 0xB1) ^ -1)) != 0;
                }
            }
            n2 = lIlIlllllIIII[0];
            return n2 != 0;
        });
        if (o.llIIIIllIlIIIlI(llllllllllllllIllIIlllIlIIlllllI)) {
            return lIlIlllllIIII[0];
        }
        this.ab = lIlIlllllIIII[0];
        var4_4.interact(lIlIllllIlllI[lIlIlllllIIII[0]]);
        this.sleep(lIlIlllllIIII[6]);
        return lIlIlllllIIII[2];
    }

    private static void llIIIIllIIlIlll() {
        lIlIllllIlllI = new String[lIlIlllllIIII[8]];
        o.lIlIllllIlllI[o.lIlIlllllIIII[0]] = o."Light";
        o.lIlIllllIlllI[o.lIlIlllllIIII[2]] = o."seeps into your bones";
        o.lIlIllllIlllI[o.lIlIlllllIIII[6]] = o."Congratulations";
        o.lIlIllllIlllI[o.lIlIlllllIIII[3]] = o."brazier";
        o.lIlIllllIlllI[o.lIlIlllllIIII[1]] = o."Light";
    }

    private static boolean llIIIIllIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIllIIllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llIIIIllIIlllII() {
        lIlIlllllIIII = new int[9];
        o.lIlIlllllIIII[0] = (0x13 ^ 2 ^ (0x12 ^ 0x5F)) & (0xB3 ^ 0xBF ^ (0xF9 ^ 0xA9) ^ -1);
        o.lIlIlllllIIII[1] = 7 ^ 3;
        o.lIlIlllllIIII[2] = 1;
        o.lIlIlllllIIII[3] = 3;
        o.lIlIlllllIIII[4] = 0xB3 ^ 0x8A ^ (0x5D ^ 0x6C);
        o.lIlIlllllIIII[5] = 0x56 ^ 1 ^ (0x3A ^ 0x67);
        o.lIlIlllllIIII[6] = 2;
        o.lIlIlllllIIII[7] = -(0xFFFFE309 & 0x3FF7) & (0xFFFFBFEB & 0x7FDF);
        o.lIlIlllllIIII[8] = 0 + 22 - -140 + 23 ^ 87 + 138 - 223 + 186;
    }

    private static boolean llIIIIllIIlllIl(int n2) {
        return n2 == 0;
    }
}

