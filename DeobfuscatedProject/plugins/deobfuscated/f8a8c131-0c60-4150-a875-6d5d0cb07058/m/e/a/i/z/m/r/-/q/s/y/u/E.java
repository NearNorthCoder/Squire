/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.client.Static
 */
package m.e.a.i.z.m.r.-.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.a.i.z.m.r.-.q.s.y.u.l;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.World;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.client.Static;

@TaskDesc(name="Getting Killcount", priority=5)
public class E
extends Task {
    private static /* synthetic */ String[] lIllIIlIIIIII;
    private static final /* synthetic */ WorldPoint aI;
    private static /* synthetic */ int[] lIllIIlIIIIIl;
    private final /* synthetic */ Client aK;
    private final /* synthetic */ l aJ;

    private static boolean llIIIlIllIlIIlI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        E llllllllllllllIllIIlIlIllIIIIlIl;
        if (E.llIIIlIllIIllII(this.aJ.B() ? 1 : 0)) {
            return lIllIIlIIIIIl[0];
        }
        if (E.llIIIlIllIIllIl(llllllllllllllIllIIlIlIllIIIIlIl.aJ.F(), llllllllllllllIllIIlIlIllIIIIlIl.R())) {
            return lIllIIlIIIIIl[0];
        }
        Player llllllllllllllIllIIlIlIllIIIIlII = Players.getLocal();
        if (E.llIIIlIllIIlllI(llllllllllllllIllIIlIlIllIIIIlII.getInteracting())) {
            return lIllIIlIIIIIl[0];
        }
        NPC llllllllllllllIllIIlIlIllIIIIIll = NPCs.getNearest(nPC -> {
            int n2;
            if (E.llIIIlIllIlIIlI(nPC.isDead() ? 1 : 0) && E.llIIIlIllIIllII(nPC.getName().equals(lIllIIlIIIIII[lIllIIlIIIIIl[3]]) ? 1 : 0) && E.llIIIlIllIlIIII(nPC.distanceTo(aI), lIllIIlIIIIIl[14])) {
                n2 = lIllIIlIIIIIl[3];
                0;
                if (-(0x27 ^ 0x23) > 0) {
                    return ((0xC9 ^ 0xAB) & ~(0xC9 ^ 0xAB)) != 0;
                }
            } else {
                n2 = lIllIIlIIIIIl[0];
            }
            return n2 != 0;
        });
        if (E.llIIIlIllIIllll(llllllllllllllIllIIlIlIllIIIIIll)) {
            if (E.llIIIlIllIlIIII(Players.getLocal().distanceTo(aI), lIllIIlIIIIIl[1])) {
                Worlds.hopTo((World)Worlds.getRandom(world -> {
                    int n2;
                    if (E.llIIIlIllIIllII(world.isMembers() ? 1 : 0) && E.llIIIlIllIIllII(world.isNormal() ? 1 : 0)) {
                        n2 = lIllIIlIIIIIl[3];
                        0;
                        if ((2 & ~2) != 0) {
                            return ((0x1F ^ 0x21) & ~(0x4D ^ 0x73)) != 0;
                        }
                    } else {
                        n2 = lIllIIlIIIIIl[0];
                    }
                    return n2 != 0;
                }));
                llllllllllllllIllIIlIlIllIIIIlIl.sleep(lIllIIlIIIIIl[2]);
                return lIllIIlIIIIIl[3];
            }
            return lIllIIlIIIIIl[0];
        }
        var2_2.interact(lIllIIlIIIIII[lIllIIlIIIIIl[0]]);
        this.sleep(lIllIIlIIIIIl[4]);
        return lIllIIlIIIIIl[3];
    }

    private static boolean llIIIlIllIIlllI(Object object) {
        return object != null;
    }

    static {
        E.llIIIlIllIIlIll();
        E.llIIIlIllIIlIlI();
        aI = new WorldPoint(lIllIIlIIIIIl[15], lIllIIlIIIIIl[16], lIllIIlIIIIIl[4]);
    }

    private static void llIIIlIllIIlIll() {
        lIllIIlIIIIIl = new int[18];
        E.lIllIIlIIIIIl[0] = (0xCD ^ 0x8E ^ (0xA9 ^ 0xB1)) & (0x14 ^ 0x68 ^ (0x1A ^ 0x3D) ^ -1);
        E.lIllIIlIIIIIl[1] = 0x68 ^ 0x57 ^ (0xB5 ^ 0x80);
        E.lIllIIlIIIIIl[2] = 0x80 ^ 0x8F ^ (0x34 ^ 0x3F);
        E.lIllIIlIIIIIl[3] = 1;
        E.lIllIIlIIIIIl[4] = 2;
        E.lIllIIlIIIIIl[5] = -(0xFFFFECE6 & 0x539B) & (0xFFFFFEED & 0x73D7);
        E.lIllIIlIIIIIl[6] = 44 + 9 - -12 + 122 ^ 127 + 61 - 181 + 173;
        E.lIllIIlIIIIIl[7] = 0xFFFFBAC7 & 0x777B;
        E.lIllIIlIIIIIl[8] = 0x3B ^ 0x22;
        E.lIllIIlIIIIIl[9] = 0xFFFFF74F & 0x3AF2;
        E.lIllIIlIIIIIl[10] = 110 + 154 - 236 + 145 ^ 46 + 30 - -43 + 60;
        E.lIllIIlIIIIIl[11] = -(0xFFFFFDBF & 0x4F6F) & (0xFFFFFF6F & Short.MAX_VALUE);
        E.lIllIIlIIIIIl[12] = 3 ^ 0x20;
        E.lIllIIlIIIIIl[13] = 0x56 ^ 0x7E;
        E.lIllIIlIIIIIl[14] = 0xB9 ^ 0xA1;
        E.lIllIIlIIIIIl[15] = 0xFFFFABFD & 0x5F5F;
        E.lIllIIlIIIIIl[16] = 0xFFFF95FB & 0x7EED;
        E.lIllIIlIIIIIl[17] = 0xE ^ 6;
    }

    private static boolean llIIIlIllIlIIII(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public E(l l2) {
        this.aJ = l2;
        this.aK = Static.getClient();
    }

    private static boolean llIIIlIllIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIlIllIIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIIlIllIlIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIlIllIIllll(Object object) {
        return object == null;
    }

    private int R() {
        E llllllllllllllIllIIlIlIllIIIIIIl;
        if (E.llIIIlIllIlIIIl(this.aK.getVarbitValue(lIllIIlIIIIIl[5]), lIllIIlIIIIIl[4])) {
            return lIllIIlIIIIIl[6];
        }
        if (E.llIIIlIllIlIIIl(llllllllllllllIllIIlIlIllIIIIIIl.aK.getVarbitValue(lIllIIlIIIIIl[7]), lIllIIlIIIIIl[4])) {
            return lIllIIlIIIIIl[8];
        }
        if (E.llIIIlIllIlIIIl(llllllllllllllIllIIlIlIllIIIIIIl.aK.getVarbitValue(lIllIIlIIIIIl[9]), lIllIIlIIIIIl[4])) {
            return lIllIIlIIIIIl[10];
        }
        if (E.llIIIlIllIlIIIl(llllllllllllllIllIIlIlIllIIIIIIl.aK.getVarbitValue(lIllIIlIIIIIl[11]), lIllIIlIIIIIl[4])) {
            return lIllIIlIIIIIl[12];
        }
        return lIllIIlIIIIIl[13];
    }

    private static boolean llIIIlIllIIllII(int n2) {
        return n2 != 0;
    }

    private static String llIIIlIllIIlIIl(String llllllllllllllIllIIlIlIlIlIlllIl, String llllllllllllllIllIIlIlIlIlIlllII) {
        try {
            SecretKeySpec llllllllllllllIllIIlIlIlIllIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlIlIlIlllII.getBytes(StandardCharsets.UTF_8)), lIllIIlIIIIIl[17]), "DES");
            Cipher llllllllllllllIllIIlIlIlIlIlllll = Cipher.getInstance("DES");
            llllllllllllllIllIIlIlIlIlIlllll.init(lIllIIlIIIIIl[4], llllllllllllllIllIIlIlIlIllIIIII);
            return new String(llllllllllllllIllIIlIlIlIlIlllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlIlIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlIlIlIlIllllI) {
            llllllllllllllIllIIlIlIlIlIllllI.printStackTrace();
            return null;
        }
    }

    private static void llIIIlIllIIlIlI() {
        lIllIIlIIIIII = new String[lIllIIlIIIIIl[4]];
        E.lIllIIlIIIIII[E.lIllIIlIIIIIl[0]] = E."Attack";
        E.lIllIIlIIIIII[E.lIllIIlIIIIIl[3]] = E."Imp";
    }

    private static String llIIIlIllIIlIII(String llllllllllllllIllIIlIlIlIlllIIlI, String llllllllllllllIllIIlIlIlIlllIIIl) {
        llllllllllllllIllIIlIlIlIlllIIlI = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIlIlIlllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlIlIlIlllIIII = new StringBuilder();
        char[] llllllllllllllIllIIlIlIlIllIllll = llllllllllllllIllIIlIlIlIlllIIIl.toCharArray();
        int llllllllllllllIllIIlIlIlIllIlllI = lIllIIlIIIIIl[0];
        char[] llllllllllllllIllIIlIlIlIllIlIII = llllllllllllllIllIIlIlIlIlllIIlI.toCharArray();
        int llllllllllllllIllIIlIlIlIllIIlll = llllllllllllllIllIIlIlIlIllIlIII.length;
        int llllllllllllllIllIIlIlIlIllIIllI = lIllIIlIIIIIl[0];
        while (E.llIIIlIllIlIIll(llllllllllllllIllIIlIlIlIllIIllI, llllllllllllllIllIIlIlIlIllIIlll)) {
            char llllllllllllllIllIIlIlIlIlllIIll = llllllllllllllIllIIlIlIlIllIlIII[llllllllllllllIllIIlIlIlIllIIllI];
            llllllllllllllIllIIlIlIlIlllIIII.append((char)(llllllllllllllIllIIlIlIlIlllIIll ^ llllllllllllllIllIIlIlIlIllIllll[llllllllllllllIllIIlIlIlIllIlllI % llllllllllllllIllIIlIlIlIllIllll.length]));
            0;
            ++llllllllllllllIllIIlIlIlIllIlllI;
            ++llllllllllllllIllIIlIlIlIllIIllI;
            0;
            if (((0xB1 ^ 0xAA ^ (4 ^ 0x7F)) & (166 + 74 - 101 + 82 ^ 100 + 84 - 177 + 182 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIlIlIlIlllIIII);
    }
}

