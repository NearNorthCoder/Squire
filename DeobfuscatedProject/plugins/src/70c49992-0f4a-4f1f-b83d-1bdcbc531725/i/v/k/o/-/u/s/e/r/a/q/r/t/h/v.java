/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.movement.Movement
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.d;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Dodge", priority=25)
public class v
extends w {
    private static /* synthetic */ String[] lIlIllIIllllI;
    /* synthetic */ int cc;
    private static /* synthetic */ int[] lIlIllIIlllll;
    @Inject
    /* synthetic */ d l;

    private static boolean llIIIIIIllllIIl(int n2) {
        return n2 == 0;
    }

    private static void llIIIIIIlllIllI() {
        lIlIllIIlllll = new int[8];
        v.lIlIllIIlllll[0] = (0x22 ^ 0x50 ^ (0x21 ^ 0x61)) & (0xC6 ^ 0x83 ^ (0x71 ^ 6) ^ -" ".length());
        v.lIlIllIIlllll[1] = " ".length();
        v.lIlIllIIlllll[2] = "  ".length();
        v.lIlIllIIlllll[3] = 0xFFFF9FB7 & 0x7F5D;
        v.lIlIllIIlllll[4] = 0xFFFFFF32 & 0x7DCD;
        v.lIlIllIIlllll[5] = "   ".length();
        v.lIlIllIIlllll[6] = 0x1D ^ 0x2B ^ (0xB0 ^ 0x8E);
        v.lIlIllIIlllll[7] = 0x48 ^ 0x2F ^ (0xD1 ^ 0xB0);
    }

    private static boolean llIIIIIIlllIlll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean i(WorldPoint worldPoint) {
        int n2;
        v llllllllllllllIllIlIIlIIlIlIIIlI;
        void llllllllllllllIllIlIIlIIlIlIIIIl;
        if (v.llIIIIIIlllllII(Math.abs(this.cf.getTickCount() - this.cg.G()), lIlIllIIlllll[5])) {
            return lIlIllIIlllll[0];
        }
        WorldPoint llllllllllllllIllIlIIlIIlIlIIIII = Players.getLocal().getWorldLocation();
        int llllllllllllllIllIlIIlIIlIIlllll = Math.abs(llllllllllllllIllIlIIlIIlIlIIIII.getY() - llllllllllllllIllIlIIlIIlIlIIIIl.getWorldY());
        WorldPoint llllllllllllllIllIlIIlIIlIIllllI = llllllllllllllIllIlIIlIIlIlIIIII.dy(lIlIllIIlllll[1]);
        int llllllllllllllIllIlIIlIIlIIlllIl = lIlIllIIlllll[6];
        if (v.llIIIIIIllllIII(Equipment.contains(item -> item.getName().toLowerCase().contains(lIlIllIIllllI[lIlIllIIlllll[0]])) ? 1 : 0)) {
            llllllllllllllIllIlIIlIIlIIlllIl = lIlIllIIlllll[7];
        }
        if (v.llIIIIIIllllIII(llllllllllllllIllIlIIlIIlIlIIIlI.cg.C() ? 1 : 0)) {
            llllllllllllllIllIlIIlIIlIIlllIl = lIlIllIIlllll[2];
        }
        if (v.llIIIIIIlllllIl(llllllllllllllIllIlIIlIIlIIlllll, llllllllllllllIllIlIIlIIlIIlllIl) && v.llIIIIIIllllIII(TileObjects.getAll(tileObject -> {
            int n2;
            if (v.llIIIIIIllllllI(tileObject.getId(), lIlIllIIlllll[4]) && v.llIIIIIIllllIII(tileObject.getWorldLocation().equals((Object)llllllllllllllIllIlIIlIIlIIllllI) ? 1 : 0)) {
                n2 = lIlIllIIlllll[1];
                "".length();
                if (" ".length() >= "  ".length()) {
                    return ((0x1D ^ 5) & ~(0x88 ^ 0x90)) != 0;
                }
            } else {
                n2 = lIlIllIIlllll[0];
            }
            return n2 != 0;
        }).isEmpty() ? 1 : 0)) {
            n2 = lIlIllIIlllll[1];
            "".length();
            if ("   ".length() == 0) {
                return ((9 + 66 - -46 + 6 ^ (0x42 ^ 0x31)) & (0x6F ^ 0x16 ^ (0x7F ^ 0xA) ^ -" ".length())) != 0;
            }
        } else {
            n2 = lIlIllIIlllll[0];
        }
        return n2 != 0;
    }

    private static boolean llIIIIIIlllllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIIIIIlllllII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected v(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
        this.cc = lIlIllIIlllll[0];
    }

    static {
        v.llIIIIIIlllIllI();
        v.llIIIIIIlllIlIl();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b(NPC nPC) {
        int n2;
        block3: {
            block2: {
                if (!v.llIIIIIIllllIlI(nPC.getAnimation(), lIlIllIIlllll[3])) break block2;
                int[] nArray = new int[lIlIllIIlllll[1]];
                nArray[v.lIlIllIIlllll[0]] = lIlIllIIlllll[4];
                if (!v.llIIIIIIllllIll(TileObjects.getNearest((int[])nArray))) break block3;
            }
            n2 = lIlIllIIlllll[1];
            "".length();
            if (null == null) return n2 != 0;
            return (" ".length() & ~" ".length()) != 0;
        }
        n2 = lIlIllIIlllll[0];
        return n2 != 0;
    }

    private static void llIIIIIIlllIlIl() {
        lIlIllIIllllI = new String[lIlIllIIlllll[1]];
        v.lIlIllIIllllI[v.lIlIllIIlllll[0]] = v.llIIIIIIlllIlII("rqjgC5HOVBX5ADaMH/Zdpg==", "satvi");
    }

    private static boolean llIIIIIIllllIlI(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var5_5;
        WorldPoint llllllllllllllIllIlIIlIIlIlIlIll;
        WorldPoint worldPoint;
        WorldPoint llllllllllllllIllIlIIlIIlIlIllII;
        void llllllllllllllIllIlIIlIIlIlIllll;
        v llllllllllllllIllIlIIlIIlIllIIII;
        NPC nPC = this.cg.c(lIlIllIIlllll[1]);
        if (v.llIIIIIIlllIlll(nPC)) {
            return lIlIllIIlllll[0];
        }
        int n2 = llllllllllllllIllIlIIlIIlIllIIII.b((NPC)llllllllllllllIllIlIIlIIlIlIllll);
        if (v.llIIIIIIllllIII(Movement.isRunEnabled() ? 1 : 0) && v.llIIIIIIllllIII(n2)) {
            Movement.toggleRun();
            "".length();
            if (" ".length() < -" ".length()) {
                return ((0xC8 ^ 0xA4 ^ (0xB2 ^ 0x94)) & (1 ^ 0xF ^ (0x47 ^ 3) ^ -" ".length())) != 0;
            }
        } else if (v.llIIIIIIllllIIl(Movement.isRunEnabled() ? 1 : 0) && v.llIIIIIIllllIIl(n2)) {
            Movement.toggleRun();
        }
        WorldPoint llllllllllllllIllIlIIlIIlIlIllIl = llllllllllllllIllIlIIlIIlIllIIII.l.n();
        if (v.llIIIIIIllllIII(n2) && v.llIIIIIIllllIIl(llllllllllllllIllIlIIlIIlIllIIII.cg.C() ? 1 : 0)) {
            llllllllllllllIllIlIIlIIlIlIllIl = llllllllllllllIllIlIIlIIlIllIIII.l.o();
        }
        if (v.llIIIIIIllllIII(llllllllllllllIllIlIIlIIlIlIllIl.equals((Object)(llllllllllllllIllIlIIlIIlIlIllII = Players.getLocal().getWorldLocation())) ? 1 : 0)) {
            return lIlIllIIlllll[0];
        }
        if (v.llIIIIIIllllIIl(n2) && v.llIIIIIIllllIII(llllllllllllllIllIlIIlIIlIllIIII.cc % lIlIllIIlllll[2])) {
            llllllllllllllIllIlIIlIIlIllIIII.cc += lIlIllIIlllll[1];
            return lIlIllIIlllll[0];
        }
        if (v.llIIIIIIllllIII(n2) && v.llIIIIIIllllIII(llllllllllllllIllIlIIlIIlIllIIII.i(llllllllllllllIllIlIIlIIlIlIllll.getWorldLocation()) ? 1 : 0)) {
            return lIlIllIIlllll[0];
        }
        if (v.llIIIIIIllllIII(n2)) {
            worldPoint = llllllllllllllIllIlIIlIIlIllIIII.l.p();
            "".length();
            if (" ".length() >= (0x10 ^ 0x14)) {
                return ((0x72 ^ 0x49) & ~(0xBE ^ 0x85)) != 0;
            }
        } else {
            worldPoint = llllllllllllllIllIlIIlIIlIlIlIll = llllllllllllllIllIlIIlIIlIllIIII.l.n();
        }
        if (v.llIIIIIIllllIII(llllllllllllllIllIlIIlIIlIllIIII.cg.z() ? 1 : 0)) {
            Movement.toggleRun();
            llllllllllllllIllIlIIlIIlIlIlIll = llllllllllllllIllIlIIlIIlIllIIII.l.t();
        }
        Movement.setDestination((WorldPoint)var5_5);
        this.cc += lIlIllIIlllll[1];
        return lIlIllIIlllll[1];
    }

    private static String llIIIIIIlllIlII(String llllllllllllllIllIlIIlIIlIIIllll, String llllllllllllllIllIlIIlIIlIIIlllI) {
        try {
            SecretKeySpec llllllllllllllIllIlIIlIIlIIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIlIIlIIIlllI.getBytes(StandardCharsets.UTF_8)), lIlIllIIlllll[6]), "DES");
            Cipher llllllllllllllIllIlIIlIIlIIlIIll = Cipher.getInstance("DES");
            llllllllllllllIllIlIIlIIlIIlIIll.init(lIlIllIIlllll[2], llllllllllllllIllIlIIlIIlIIlIlII);
            return new String(llllllllllllllIllIlIIlIIlIIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIlIIlIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIlIIlIIlIIlI) {
            llllllllllllllIllIlIIlIIlIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIIllllIll(Object object) {
        return object != null;
    }

    private static boolean llIIIIIIllllIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIIIllllllI(int n2, int n3) {
        return n2 == n3;
    }
}

