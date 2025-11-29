/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ap_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.m_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.NEnum;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z_Unknown;

/* TASK: Solving memory puzzle -> SolvingmemorypuzzleTask */
@TaskDesc(name="Solving memory puzzle", priority=200, blocking=true)
public class SolvingMemoryPuzzleTask
extends ap_Unknown {
    private static /* synthetic */ String[] llIIlllllIl;
    private static /* synthetic */ int[] llIIllllllI;
    private final /* synthetic */ m dm;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        aw var11;
        NPC nPC2 = this.J();
        if (aw.lIlIIIlllllIIl(nPC2)) {
            return llIIllllllI[0];
        }
        Queue<n> var18 = var11.dm.G();
        if (aw.lIlIIIlllllIlI(var18.isEmpty() ? 1 : 0)) {
            return llIIllllllI[0];
        }
        n var16 = var18.peek();
        WorldPoint var13 = var16.a(var11.cu);
        if (aw.lIlIIIlllllIll(var13)) {
            return llIIllllllI[0];
        }
        WorldPoint var9 = Players.getLocal().getWorldLocation();
        if (aw.lIlIIIllllllII(var13.distanceTo(var9), llIIllllllI[1]) && aw.lIlIIIlllllIlI(NPCs.getAll(nPC -> {
            int n2;
            if (aw.lIlIIIlllllIIl(nPC.getName()) && aw.lIlIIIlllllIlI(nPC.getName().toLowerCase().contains(llIIlllllIl[llIIllllllI[1]]) ? 1 : 0) && aw.lIlIIIlllllIlI(nPC.getWorldLocation().equals((Object)var9) ? 1 : 0)) {
                n2 = llIIllllllI[1];
                0;
                if (3 <= 2) {
                    return ((0x74 ^ 0x42 ^ (0x75 ^ 0x1D)) & (106 + 183 - 91 + 11 ^ 9 + 54 - -55 + 25 ^ -1)) != 0;
                }
            } else {
                n2 = llIIllllllI[0];
            }
            return n2 != 0;
        }).isEmpty() ? 1 : 0)) {
            return llIIllllllI[1];
        }
        if (aw.lIlIIIllllllIl(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        try {
            var11.g(var13);
            return llIIllllllI[1];
        }
        catch (NullPointerException nullPointerException) {
            void var4_4;
            Log.info((String)llIIlllllIl[llIIllllllI[0]]);
            nullPointerException.printStackTrace();
            Movement.setDestination((WorldPoint)var4_4);
            return llIIllllllI[1];
        }
    }

    @Inject
    protected aw(Client client, z z2, TOAConfig tOAConfig, m m2) {
        super(client, z2, tOAConfig);
        this.dm = m2;
    }

    private static boolean lIlIIIllllllII(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlIIIllllIllI(String var14, String var2) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var19 = var2.toCharArray();
        int var1 = llIIllllllI[0];
        char[] var6 = var14.toCharArray();
        int var4 = var6.length;
        int var17 = llIIllllllI[0];
        while (aw.lIlIIIlllllllI(var17, var4)) {
            char var12 = var6[var17];
            var3.append((char)(var12 ^ var19[var1 % var19.length]));
            0;
            ++var1;
            ++var17;
            0;
            
            return null;
        }
        return String.valueOf(var3);
    }

    private static boolean lIlIIIllllllIl(int n2) {
        return n2 == 0;
    }

    @Override
    public void r() {
        this.dm.G().clear();
    }

    private static boolean lIlIIIlllllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIIIlllllIII() {
        llIIllllllI = new int[3];
        aw.llIIllllllI[0] = (0x15 ^ 0x1C) & ~(0x1D ^ 0x14);
        aw.llIIllllllI[1] = 1;
        aw.llIIllllllI[2] = 2;
    }

    private static void lIlIIIllllIlll() {
        llIIlllllIl = new String[llIIllllllI[2]];
        aw.llIIlllllIl[aw.llIIllllllI[0]] = aw."Encountered NPE walking to quadrant order puzzle solution";
        aw.llIIlllllIl[aw.llIIllllllI[1]] = aw."orb";
    }

    private static boolean lIlIIIlllllIlI(int n2) {
        return n2 != 0;
    }

    private static String lIlIIIllllIlIl(String var7, String var8) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(llIIllllllI[2], var5);
            return new String(var10.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlllllIIl(Object object) {
        return object != null;
    }

    static {
        aw.lIlIIIlllllIII();
        aw.lIlIIIllllIlll();
    }

    private static boolean lIlIIIlllllIll(Object object) {
        return object == null;
    }
}

