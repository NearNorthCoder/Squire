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
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a_Unknown;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.c_Unknown;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.l_Unknown;

/* TASK: Fishing -> FishingTask */
@TaskDesc(name="Fishing", priority=7, blocking=true)
public class FishingTask
extends l_Unknown {
    private static /* synthetic */ int[] lIIllIllIlllI;
    private static /* synthetic */ String[] lIIllIllIllIl;

    private static void lIllIIIlIlIllll() {
        lIIllIllIllIl = new String[lIIllIllIlllI[2]];
        j.lIIllIllIllIl[j.lIIllIllIlllI[1]] = j."Shadow danger in fishin!";
        j.lIIllIllIllIl[j.lIIllIllIlllI[0]] = j."Harpoon";
    }

    private static boolean lIllIIIlIllIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIllIIIlIlIlllI(String var2, String var11) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), lIIllIllIlllI[9]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIIllIllIlllI[2], var8);
            return new String(var10.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIlIllIIII() {
        lIIllIllIlllI = new int[10];
        j.lIIllIllIlllI[0] = 1;
        j.lIIllIllIlllI[1] = (3 ^ 6) & ~(0x7D ^ 0x78);
        j.lIIllIllIlllI[2] = 2;
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
            0;
            
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
        0;
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
        void var6;
        j var1;
        Player player = Players.getLocal();
        if (j.lIllIIIlIllIIll(player)) {
            return lIIllIllIlllI[1];
        }
        int var5 = var1.au.a();
        c var3 = var1.ar.N();
        if (j.lIllIIIlIllIIlI(var5, lIIllIllIlllI[2])) {
            return lIIllIllIlllI[1];
        }
        int[] nArray = new int[lIIllIllIlllI[0]];
        nArray[j.lIIllIllIlllI[1]] = lIIllIllIlllI[3];
        TileObject var7 = TileObjects.getNearest((int[])nArray);
        if (j.lIllIIIlIllIlII(var7 instanceof GameObject) && j.lIllIIIlIllIlII(((GameObject)var7).getWorldArea().contains(var6.getWorldLocation()) ? 1 : 0)) {
            System.out.println(lIIllIllIllIl[lIIllIllIlllI[1]]);
        }
        NPC var4 = null;
        if (j.lIllIIIlIllIIlI(var1.au.f(), var1.as.numberOfFish() - lIIllIllIlllI[4])) {
            var4 = NPCs.getNearest(nPC -> {
                int n2;
                if (j.lIllIIIlIllIlIl(lIIllIllIlllI[5], nPC.getId()) && j.lIllIIIlIllIllI(nPC.getWorldLocation().distanceTo(var3.ah()), lIIllIllIlllI[8]) && j.lIllIIIlIllIlII(this.au.c(this.au.a((NPC)nPC)) ? 1 : 0)) {
                    n2 = lIIllIllIlllI[0];
                    0;
                    
                    }
                } else {
                    n2 = lIIllIllIlllI[1];
                }
                return n2 != 0;
            });
        }
        if (j.lIllIIIlIllIIll(var4)) {
            var4 = NPCs.getNearest(nPC -> {
                int n2;
                if (j.lIllIIIlIllIlII(Set.of(Integer.valueOf(lIIllIllIlllI[6]), Integer.valueOf(lIIllIllIlllI[7]), Integer.valueOf(lIIllIllIlllI[5])).contains(nPC.getId()) ? 1 : 0) && j.lIllIIIlIllIllI(nPC.getWorldLocation().distanceTo(var3.ah()), lIIllIllIlllI[8]) && j.lIllIIIlIllIlII(this.au.c(this.au.a((NPC)nPC)) ? 1 : 0)) {
                    n2 = lIIllIllIlllI[0];
                    0;
                    if (-1 > 3) {
                        return ((153 + 42 - 192 + 162 ^ 138 + 34 - 64 + 34) & (0x4A ^ 9 ^ (0x16 ^ 0x7E) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIllIllIlllI[1];
                }
                return n2 != 0;
            });
        }
        if (j.lIllIIIlIllIIll(var4)) {
            return var1.b(var3);
        }
        if (j.lIllIIIlIllIlII(var1.au.a((Locatable)var4) ? 1 : 0) && j.lIllIIIlIllIlII(var1.au.c(var6.getWorldLocation()) ? 1 : 0)) {
            return lIIllIllIlllI[0];
        }
        if (j.lIllIIIlIllIlII(var6.getInteracting() instanceof NPC) && j.lIllIIIlIllIlII(var1.au.c(var6.getWorldLocation()) ? 1 : 0) && (!j.lIllIIIlIllIlIl(var4.getId(), lIIllIllIlllI[5]) || j.lIllIIIlIllIlIl(var6.getInteracting().getId(), lIIllIllIlllI[5])) && j.lIllIIIlIllIIIl(Dialog.isOpen() ? 1 : 0)) {
            return lIIllIllIlllI[0];
        }
        var5_5.interact(lIIllIllIllIl[lIIllIllIlllI[0]]);
        return lIIllIllIlllI[0];
    }

    private static boolean lIllIIIlIllIIlI(int n2, int n3) {
        return n2 < n3;
    }
}

