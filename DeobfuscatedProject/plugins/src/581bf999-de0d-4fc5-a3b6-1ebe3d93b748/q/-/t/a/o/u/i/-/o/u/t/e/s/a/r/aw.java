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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ap;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.m;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.n;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Solving memory puzzle", priority=200, blocking=true)
public class aw
extends ap {
    private static /* synthetic */ String[] llIIlllllIl;
    private static /* synthetic */ int[] llIIllllllI;
    private final /* synthetic */ m dm;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        aw llllllllllllllllIIlllIlIIIIIlllI;
        NPC nPC2 = this.J();
        if (aw.lIlIIIlllllIIl(nPC2)) {
            return llIIllllllI[0];
        }
        Queue<n> llllllllllllllllIIlllIlIIIIIllII = llllllllllllllllIIlllIlIIIIIlllI.dm.G();
        if (aw.lIlIIIlllllIlI(llllllllllllllllIIlllIlIIIIIllII.isEmpty() ? 1 : 0)) {
            return llIIllllllI[0];
        }
        n llllllllllllllllIIlllIlIIIIIlIll = llllllllllllllllIIlllIlIIIIIllII.peek();
        WorldPoint llllllllllllllllIIlllIlIIIIIlIlI = llllllllllllllllIIlllIlIIIIIlIll.a(llllllllllllllllIIlllIlIIIIIlllI.cu);
        if (aw.lIlIIIlllllIll(llllllllllllllllIIlllIlIIIIIlIlI)) {
            return llIIllllllI[0];
        }
        WorldPoint llllllllllllllllIIlllIlIIIIIlIIl = Players.getLocal().getWorldLocation();
        if (aw.lIlIIIllllllII(llllllllllllllllIIlllIlIIIIIlIlI.distanceTo(llllllllllllllllIIlllIlIIIIIlIIl), llIIllllllI[1]) && aw.lIlIIIlllllIlI(NPCs.getAll(nPC -> {
            int n2;
            if (aw.lIlIIIlllllIIl(nPC.getName()) && aw.lIlIIIlllllIlI(nPC.getName().toLowerCase().contains(llIIlllllIl[llIIllllllI[1]]) ? 1 : 0) && aw.lIlIIIlllllIlI(nPC.getWorldLocation().equals((Object)llllllllllllllllIIlllIlIIIIIlIIl) ? 1 : 0)) {
                n2 = llIIllllllI[1];
                "".length();
                if ("   ".length() <= "  ".length()) {
                    return ((0x74 ^ 0x42 ^ (0x75 ^ 0x1D)) & (106 + 183 - 91 + 11 ^ 9 + 54 - -55 + 25 ^ -" ".length())) != 0;
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
            llllllllllllllllIIlllIlIIIIIlllI.g(llllllllllllllllIIlllIlIIIIIlIlI);
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

    private static String lIlIIIllllIllI(String llllllllllllllllIIlllIIllllIIlll, String llllllllllllllllIIlllIIllllIIllI) {
        llllllllllllllllIIlllIIllllIIlll = new String(Base64.getDecoder().decode(llllllllllllllllIIlllIIllllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlllIIllllIlIlI = new StringBuilder();
        char[] llllllllllllllllIIlllIIllllIlIIl = llllllllllllllllIIlllIIllllIIllI.toCharArray();
        int llllllllllllllllIIlllIIllllIlIII = llIIllllllI[0];
        char[] llllllllllllllllIIlllIIllllIIIlI = llllllllllllllllIIlllIIllllIIlll.toCharArray();
        int llllllllllllllllIIlllIIllllIIIIl = llllllllllllllllIIlllIIllllIIIlI.length;
        int llllllllllllllllIIlllIIllllIIIII = llIIllllllI[0];
        while (aw.lIlIIIlllllllI(llllllllllllllllIIlllIIllllIIIII, llllllllllllllllIIlllIIllllIIIIl)) {
            char llllllllllllllllIIlllIIllllIllIl = llllllllllllllllIIlllIIllllIIIlI[llllllllllllllllIIlllIIllllIIIII];
            llllllllllllllllIIlllIIllllIlIlI.append((char)(llllllllllllllllIIlllIIllllIllIl ^ llllllllllllllllIIlllIIllllIlIIl[llllllllllllllllIIlllIIllllIlIII % llllllllllllllllIIlllIIllllIlIIl.length]));
            "".length();
            ++llllllllllllllllIIlllIIllllIlIII;
            ++llllllllllllllllIIlllIIllllIIIII;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlllIIllllIlIlI);
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
        aw.llIIllllllI[1] = " ".length();
        aw.llIIllllllI[2] = "  ".length();
    }

    private static void lIlIIIllllIlll() {
        llIIlllllIl = new String[llIIllllllI[2]];
        aw.llIIlllllIl[aw.llIIllllllI[0]] = aw.lIlIIIllllIlIl("Y6YZ3yJ4dbV1+xJvOqmHtS4iYs+4gfcsdpsYCfVA68uzWXSOPKWlIgV3FBo9uuDt8/blQsc+EmTBHltruatsPw==", "KoUdX");
        aw.llIIlllllIl[aw.llIIllllllI[1]] = aw.lIlIIIllllIllI("PxEQ", "Pcrom");
    }

    private static boolean lIlIIIlllllIlI(int n2) {
        return n2 != 0;
    }

    private static String lIlIIIllllIlIl(String llllllllllllllllIIlllIIlllllllII, String llllllllllllllllIIlllIIllllllIll) {
        try {
            SecretKeySpec llllllllllllllllIIlllIIlllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIIllllllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlllIIllllllllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlllIIllllllllI.init(llIIllllllI[2], llllllllllllllllIIlllIIlllllllll);
            return new String(llllllllllllllllIIlllIIllllllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIIlllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlllIIlllllllIl) {
            llllllllllllllllIIlllIIlllllllIl.printStackTrace();
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

