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
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.magic.Thralls
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a_Unknown;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.e_Unknown;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.magic.Thralls;

/* TASK: Using thrall -> UsingthrallTask */
@TaskDesc(name="Using thrall", priority=4999)
public class UsingThrallTask
extends Task {
    private static /* synthetic */ String[] lIllIIllllIl;
    private static /* synthetic */ int[] lIllIIlllllI;
    private final /* synthetic */ a be;
    private final /* synthetic */ SquireDukeSucellus bd;

    private static String lllIIllIIlIIll(String var14, String var17) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var5 = var17.toCharArray();
        int var4 = lIllIIlllllI[0];
        char[] var11 = var14.toCharArray();
        int var1 = var11.length;
        int var10 = lIllIIlllllI[0];
        while (C.lllIIllIIllIIl(var10, var1)) {
            char var3 = var11[var10];
            var16.append((char)(var3 ^ var5[var4 % var5.length]));
            0;
            ++var4;
            ++var10;
            0;
            
            return null;
        }
        return String.valueOf(var16);
    }

    private static void lllIIllIIlIlII() {
        lIllIIllllIl = new String[lIllIIlllllI[4]];
        C.lIllIIllllIl[C.lIllIIlllllI[0]] = C."Gate";
        C.lIllIIllllIl[C.lIllIIlllllI[1]] = C."Quick-escape";
        C.lIllIIllllIl[C.lIllIIlllllI[2]] = C."Duke Sucellus";
        C.lIllIIllllIl[C.lIllIIlllllI[3]] = C."Attack";
    }

    private static boolean lllIIllIIlIllI(int n2) {
        return n2 == 0;
    }

    @Inject
    public C(SquireDukeSucellus squireDukeSucellus, a a2) {
        this.bd = squireDukeSucellus;
        this.be = a2;
    }

    private static boolean lllIIllIIllIII(int n2) {
        return n2 != 0;
    }

    static {
        C.lllIIllIIlIlIl();
        C.lllIIllIIlIlII();
    }

    private static boolean lllIIllIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        if (C.lllIIllIIlIllI(Thralls.canUse() ? 1 : 0)) {
            return lIllIIlllllI[0];
        }
        NPC var15 = NPCs.getNearest(nPC -> {
            int n2;
            if (C.lllIIllIIllIII(nPC.getName().equals(lIllIIllllIl[lIllIIlllllI[2]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIIlllllI[1]];
                stringArray[C.lIllIIlllllI[0]] = lIllIIllllIl[lIllIIlllllI[3]];
                if (C.lllIIllIIllIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIIlllllI[1];
                    0;
                    if (((0xA ^ 0x25) & ~(0x24 ^ 0xB)) == 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIIlllllI[0];
            return n2 != 0;
        });
        if (C.lllIIllIIlIlll(var15)) {
            return lIllIIlllllI[0];
        }
        TileObject var7 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (C.lllIIllIIllIII(tileObject.getName().equals(lIllIIllllIl[lIllIIlllllI[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIIlllllI[1]];
                stringArray[C.lIllIIlllllI[0]] = lIllIIllllIl[lIllIIlllllI[1]];
                if (C.lllIIllIIllIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIIlllllI[1];
                    0;
                    if (((0x67 ^ 0x39 ^ (0x56 ^ 0x2A)) & (0xD8 ^ 0xC1 ^ (0x2B ^ 0x10) ^ -1)) <= (((0xF2 ^ 0xAF) & ~(0x66 ^ 0x3B) ^ (0x9E ^ 0xC4)) & (0x76 ^ 0x38 ^ (0 ^ 0x14) ^ -1))) return n2 != 0;
                    return ((11 + 53 - -20 + 96 ^ 35 + 87 - 24 + 64) & (0xBE ^ 0x9A ^ (0xA5 ^ 0x97) ^ -1)) != 0;
                }
            }
            n2 = lIllIIlllllI[0];
            return n2 != 0;
        });
        if (C.lllIIllIIlIlll(var7)) {
            return lIllIIlllllI[0];
        }
        Player var2 = Players.getLocal();
        if (C.lllIIllIIlIlll(var2)) {
            return lIllIIlllllI[0];
        }
        if (C.lllIIllIIlIllI(e.l(var7).contains((Locatable)var2) ? 1 : 0) && C.lllIIllIIlIllI(e.q(var7) ? 1 : 0) && C.lllIIllIIlIllI(e.r(var7) ? 1 : 0)) {
            return lIllIIlllllI[0];
        }
        return Thralls.useBestThrall();
    }

    private static String lllIIllIIlIIlI(String var9, String var12) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), lIllIIlllllI[5]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIllIIlllllI[2], var8);
            return new String(var6.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static void lllIIllIIlIlIl() {
        lIllIIlllllI = new int[6];
        C.lIllIIlllllI[0] = (0x83 ^ 0x92) & ~(0x91 ^ 0x80);
        C.lIllIIlllllI[1] = 1;
        C.lIllIIlllllI[2] = 2;
        C.lIllIIlllllI[3] = 3;
        C.lIllIIlllllI[4] = 9 ^ 0xD;
        C.lIllIIlllllI[5] = 0x1D ^ 0x6A ^ 85 + 31 - -5 + 6;
    }

    private static boolean lllIIllIIlIlll(Object object) {
        return object == null;
    }
}

