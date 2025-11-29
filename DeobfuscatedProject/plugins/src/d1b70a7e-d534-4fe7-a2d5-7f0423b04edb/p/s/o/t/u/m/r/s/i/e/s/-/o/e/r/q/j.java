/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
 */
package p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.c;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.l;

@TaskDesc(name="Fishing", priority=7, blocking=true)
public class j
extends l {
    private static /* synthetic */ int[] lIIllIllIlllI;
    private static /* synthetic */ String[] lIIllIllIllIl;

    private static void lIllIIIlIlIllll() {
        lIIllIllIllIl = new String[lIIllIllIlllI[2]];
        j.lIIllIllIllIl[j.lIIllIllIlllI[1]] = j.lIllIIIlIlIlllI("sq6acRm8sLNVZhsSJmA8JkquhPjbG/dl/2oN2wTriJI=", "tHTMr");
        j.lIIllIllIllIl[j.lIIllIllIlllI[0]] = j.lIllIIIlIlIlllI("VUiFN9371T8=", "njxlk");
    }

    private static boolean lIllIIIlIllIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIllIIIlIlIlllI(String llllllllllllllIlllIlllIIIllIIllI, String llllllllllllllIlllIlllIIIllIIlIl) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIIIllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIIIllIIlIl.getBytes(StandardCharsets.UTF_8)), lIIllIllIlllI[9]), "DES");
            Cipher llllllllllllllIlllIlllIIIllIlIlI = Cipher.getInstance("DES");
            llllllllllllllIlllIlllIIIllIlIlI.init(lIIllIllIlllI[2], llllllllllllllIlllIlllIIIllIlIll);
            return new String(llllllllllllllIlllIlllIIIllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIIIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlllIIIllIlIIl) {
            llllllllllllllIlllIlllIIIllIlIIl.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIlIllIIII() {
        lIIllIllIlllI = new int[10];
        j.lIIllIllIlllI[0] = " ".length();
        j.lIIllIllIlllI[1] = (3 ^ 6) & ~(0x7D ^ 0x78);
        j.lIIllIllIlllI[2] = "  ".length();
        j.lIIllIllIlllI[3] = -(0xFFFFF7FA & 0x4FD7) & (0xFFFFF7FF & 0xEFFF);
        j.lIIllIllIlllI[4] = 0xD ^ 0x50 ^ (0xC5 ^ 0x9C);
        j.lIIllIllIlllI[5] = 0xFFFFEB4B & 0x3DFD;
        j.lIIllIllIlllI[6] = 0xFFFFBFE5 & 0x695F;
        j.lIIllIllIlllI[7] = 0xFFFFF9F9 & 0x2F4E;
        j.lIIllIllIlllI[8] = 115 + 151 - 167 + 62 ^ 41 + 116 - 122 + 146;
        j.lIIllIllIlllI[9] = 0x50 ^ 0x58;
    }

    @Override
    public boolean ak() {
        int n2;
        if (j.lIllIIIlIllIIIl(this.ar.L() ? 1 : 0) && j.lIllIIIlIllIIlI(this.au.f(), this.as.numberOfFish())) {
            n2 = lIIllIllIlllI[0];
            "".length();
            if (null != null) {
                return ((0x12 ^ 0x4F ^ (0x18 ^ 0x7D)) & (51 + 132 - 52 + 32 ^ 94 + 48 - 1 + 14 ^ -" ".length())) != 0;
            }
        } else {
            n2 = lIIllIllIlllI[1];
        }
        return n2 != 0;
    }

    private static boolean lIllIIIlIllIlII(int n2) {
        return n2 != 0;
    }

    @Inject
    protected j(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    static {
        j.lIllIIIlIllIIII();
        j.lIllIIIlIlIllll();
    }

    private static boolean lIllIIIlIllIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIIIlIllIIll(Object object) {
        return object == null;
    }

    public boolean b(c c2) {
        if (j.lIllIIIlIllIlII(this.au.a(c2.ag()) ? 1 : 0)) {
            return this.au.e(c2.ag());
        }
        this.au.b(c2.ag());
        "".length();
        return lIIllIllIlllI[0];
    }

    private static boolean lIllIIIlIllIIIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var5_5;
        void llllllllllllllIlllIlllIIlIIIIlII;
        j llllllllllllllIlllIlllIIlIIIIlIl;
        Player player = Players.getLocal();
        if (j.lIllIIIlIllIIll(player)) {
            return lIIllIllIlllI[1];
        }
        int llllllllllllllIlllIlllIIlIIIIIll = llllllllllllllIlllIlllIIlIIIIlIl.au.a();
        c llllllllllllllIlllIlllIIlIIIIIlI = llllllllllllllIlllIlllIIlIIIIlIl.ar.N();
        if (j.lIllIIIlIllIIlI(llllllllllllllIlllIlllIIlIIIIIll, lIIllIllIlllI[2])) {
            return lIIllIllIlllI[1];
        }
        int[] nArray = new int[lIIllIllIlllI[0]];
        nArray[j.lIIllIllIlllI[1]] = lIIllIllIlllI[3];
        TileObject llllllllllllllIlllIlllIIlIIIIIIl = TileObjects.getNearest((int[])nArray);
        if (j.lIllIIIlIllIlII(llllllllllllllIlllIlllIIlIIIIIIl instanceof GameObject) && j.lIllIIIlIllIlII(((GameObject)llllllllllllllIlllIlllIIlIIIIIIl).getWorldArea().contains(llllllllllllllIlllIlllIIlIIIIlII.getWorldLocation()) ? 1 : 0)) {
            System.out.println(lIIllIllIllIl[lIIllIllIlllI[1]]);
        }
        NPC llllllllllllllIlllIlllIIlIIIIIII = null;
        if (j.lIllIIIlIllIIlI(llllllllllllllIlllIlllIIlIIIIlIl.au.f(), llllllllllllllIlllIlllIIlIIIIlIl.as.numberOfFish() - lIIllIllIlllI[4])) {
            llllllllllllllIlllIlllIIlIIIIIII = NPCs.getNearest(nPC -> {
                int n2;
                if (j.lIllIIIlIllIlIl(lIIllIllIlllI[5], nPC.getId()) && j.lIllIIIlIllIllI(nPC.getWorldLocation().distanceTo(llllllllllllllIlllIlllIIlIIIIIlI.ah()), lIIllIllIlllI[8]) && j.lIllIIIlIllIlII(this.au.c(this.au.a((NPC)nPC)) ? 1 : 0)) {
                    n2 = lIIllIllIlllI[0];
                    "".length();
                    if (null != null) {
                        return ((0xAF ^ 0x90) & ~(4 ^ 0x3B)) != 0;
                    }
                } else {
                    n2 = lIIllIllIlllI[1];
                }
                return n2 != 0;
            });
        }
        if (j.lIllIIIlIllIIll(llllllllllllllIlllIlllIIlIIIIIII)) {
            llllllllllllllIlllIlllIIlIIIIIII = NPCs.getNearest(nPC -> {
                int n2;
                if (j.lIllIIIlIllIlII(Set.of(Integer.valueOf(lIIllIllIlllI[6]), Integer.valueOf(lIIllIllIlllI[7]), Integer.valueOf(lIIllIllIlllI[5])).contains(nPC.getId()) ? 1 : 0) && j.lIllIIIlIllIllI(nPC.getWorldLocation().distanceTo(llllllllllllllIlllIlllIIlIIIIIlI.ah()), lIIllIllIlllI[8]) && j.lIllIIIlIllIlII(this.au.c(this.au.a((NPC)nPC)) ? 1 : 0)) {
                    n2 = lIIllIllIlllI[0];
                    "".length();
                    if (-" ".length() > "   ".length()) {
                        return ((153 + 42 - 192 + 162 ^ 138 + 34 - 64 + 34) & (0x4A ^ 9 ^ (0x16 ^ 0x7E) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lIIllIllIlllI[1];
                }
                return n2 != 0;
            });
        }
        if (j.lIllIIIlIllIIll(llllllllllllllIlllIlllIIlIIIIIII)) {
            return llllllllllllllIlllIlllIIlIIIIlIl.b(llllllllllllllIlllIlllIIlIIIIIlI);
        }
        if (j.lIllIIIlIllIlII(llllllllllllllIlllIlllIIlIIIIlIl.au.a((Locatable)llllllllllllllIlllIlllIIlIIIIIII) ? 1 : 0) && j.lIllIIIlIllIlII(llllllllllllllIlllIlllIIlIIIIlIl.au.c(llllllllllllllIlllIlllIIlIIIIlII.getWorldLocation()) ? 1 : 0)) {
            return lIIllIllIlllI[0];
        }
        if (j.lIllIIIlIllIlII(llllllllllllllIlllIlllIIlIIIIlII.getInteracting() instanceof NPC) && j.lIllIIIlIllIlII(llllllllllllllIlllIlllIIlIIIIlIl.au.c(llllllllllllllIlllIlllIIlIIIIlII.getWorldLocation()) ? 1 : 0) && (!j.lIllIIIlIllIlIl(llllllllllllllIlllIlllIIlIIIIIII.getId(), lIIllIllIlllI[5]) || j.lIllIIIlIllIlIl(llllllllllllllIlllIlllIIlIIIIlII.getInteracting().getId(), lIIllIllIlllI[5])) && j.lIllIIIlIllIIIl(Dialog.isOpen() ? 1 : 0)) {
            return lIIllIllIlllI[0];
        }
        var5_5.interact(lIIllIllIllIl[lIIllIllIlllI[0]]);
        return lIIllIllIlllI[0];
    }

    private static boolean lIllIIIlIllIIlI(int n2, int n3) {
        return n2 < n3;
    }
}

