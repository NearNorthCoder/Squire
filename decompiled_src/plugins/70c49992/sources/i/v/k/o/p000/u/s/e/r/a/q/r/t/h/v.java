package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
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
@TaskDesc(name = "Dodge", priority = 25)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.v  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/v.class */
public class v extends w {
    private static /* synthetic */ String[] lIlIllIIllllI;
    /* synthetic */ int cc;
    private static /* synthetic */ int[] lIlIllIIlllll;
    @Inject
    /* synthetic */ C0003d l;

    private static boolean llIIIIIIllllIIl(int i2) {
        return i2 == 0;
    }

    private static void llIIIIIIlllIllI() {
        lIlIllIIlllll = new int[8];
        lIlIllIIlllll[0] = ((34 ^ 80) ^ (33 ^ 97)) & (((198 ^ 131) ^ (113 ^ 6)) ^ (-" ".length()));
        lIlIllIIlllll[1] = " ".length();
        lIlIllIIlllll[2] = "  ".length();
        lIlIllIIlllll[3] = (-24649) & 32605;
        lIlIllIIlllll[4] = (-206) & 32205;
        lIlIllIIlllll[5] = "   ".length();
        lIlIllIIlllll[6] = (29 ^ 43) ^ (176 ^ 142);
        lIlIllIIlllll[7] = (72 ^ 47) ^ (209 ^ 176);
    }

    private static boolean llIIIIIIlllIlll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    private boolean i(WorldPoint worldPoint) {
        if (llIIIIIIlllllII(Math.abs(this.cf.getTickCount() - this.cg.G()), lIlIllIIlllll[5])) {
            return lIlIllIIlllll[0];
        }
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        int abs = Math.abs(worldLocation.getY() - worldPoint.getWorldY());
        WorldPoint dy = worldLocation.dy(lIlIllIIlllll[1]);
        int i2 = lIlIllIIlllll[6];
        if (llIIIIIIllllIII(Equipment.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIllIIllllI[lIlIllIIlllll[0]]);
        }) ? 1 : 0)) {
            i2 = lIlIllIIlllll[7];
        }
        if (llIIIIIIllllIII(this.cg.C() ? 1 : 0)) {
            i2 = lIlIllIIlllll[2];
        }
        if (llIIIIIIlllllIl(abs, i2) && llIIIIIIllllIII(TileObjects.getAll(tileObject -> {
            if (llIIIIIIllllllI(tileObject.getId(), lIlIllIIlllll[4]) && llIIIIIIllllIII(tileObject.getWorldLocation().equals(dy) ? 1 : 0)) {
                ?? r0 = lIlIllIIlllll[1];
                "".length();
                return " ".length() >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIllIIlllll[0];
        }).isEmpty() ? 1 : 0)) {
            ?? r0 = lIlIllIIlllll[1];
            "".length();
            return "   ".length() == 0 ? ((((9 + 66) - (-46)) + 6) ^ (66 ^ 49)) & (((111 ^ 22) ^ (127 ^ 10)) ^ (-" ".length())) : r0;
        }
        return lIlIllIIlllll[0];
    }

    private static boolean llIIIIIIlllllIl(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean llIIIIIIlllllII(int i2, int i3) {
        return i2 < i3;
    }

    @Inject
    protected v(Client client, C0005f c0005f, SquireVorkathConfig squireVorkathConfig) {
        super(client, c0005f, squireVorkathConfig);
        this.cc = lIlIllIIlllll[0];
    }

    static {
        llIIIIIIlllIllI();
        llIIIIIIlllIlIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private boolean b(NPC npc) {
        if (llIIIIIIllllIlI(npc.getAnimation(), lIlIllIIlllll[3])) {
            int[] iArr = new int[lIlIllIIlllll[1]];
            iArr[lIlIllIIlllll[0]] = lIlIllIIlllll[4];
            if (!llIIIIIIllllIll(TileObjects.getNearest(iArr))) {
                return lIlIllIIlllll[0];
            }
        }
        ?? r0 = lIlIllIIlllll[1];
        "".length();
        return 0 != 0 ? " ".length() & (" ".length() ^ (-1)) : r0;
    }

    private static void llIIIIIIlllIlIl() {
        lIlIllIIllllI = new String[lIlIllIIlllll[1]];
        lIlIllIIllllI[lIlIllIIlllll[0]] = llIIIIIIlllIlII("rqjgC5HOVBX5ADaMH/Zdpg==", "satvi");
    }

    private static boolean llIIIIIIllllIlI(int i2, int i3) {
        return i2 != i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.w
    public boolean Q() {
        WorldPoint n;
        NPC c = this.cg.c(lIlIllIIlllll[1]);
        if (llIIIIIIlllIlll(c)) {
            return lIlIllIIlllll[0];
        }
        boolean b = b(c);
        if (llIIIIIIllllIII(Movement.isRunEnabled() ? 1 : 0) && llIIIIIIllllIII(b ? 1 : 0)) {
            Movement.toggleRun();
            "".length();
            if (" ".length() < (-" ".length())) {
                return ((200 ^ 164) ^ (178 ^ 148)) & (((1 ^ 15) ^ (71 ^ 3)) ^ (-" ".length()));
            }
        } else if (llIIIIIIllllIIl(Movement.isRunEnabled() ? 1 : 0) && llIIIIIIllllIIl(b ? 1 : 0)) {
            Movement.toggleRun();
        }
        WorldPoint n2 = this.l.n();
        if (llIIIIIIllllIII(b ? 1 : 0) && llIIIIIIllllIIl(this.cg.C() ? 1 : 0)) {
            n2 = this.l.o();
        }
        if (llIIIIIIllllIII(n2.equals(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lIlIllIIlllll[0];
        }
        if (llIIIIIIllllIIl(b ? 1 : 0) && llIIIIIIllllIII(this.cc % lIlIllIIlllll[2])) {
            this.cc += lIlIllIIlllll[1];
            return lIlIllIIlllll[0];
        } else if (llIIIIIIllllIII(b ? 1 : 0) && llIIIIIIllllIII(i(c.getWorldLocation()) ? 1 : 0)) {
            return lIlIllIIlllll[0];
        } else {
            if (llIIIIIIllllIII(b ? 1 : 0)) {
                n = this.l.p();
                "".length();
                if (" ".length() >= (16 ^ 20)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                n = this.l.n();
            }
            WorldPoint worldPoint = n;
            if (llIIIIIIllllIII(this.cg.z() ? 1 : 0)) {
                Movement.toggleRun();
                worldPoint = this.l.t();
            }
            Movement.setDestination(worldPoint);
            this.cc += lIlIllIIlllll[1];
            return lIlIllIIlllll[1];
        }
    }

    private static String llIIIIIIlllIlII(String llllllllllllllIllIlIIlIIlIIlIIIl, String llllllllllllllIllIlIIlIIlIIlIIII) {
        try {
            SecretKeySpec llllllllllllllIllIlIIlIIlIIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIlIIlIIlIIII.getBytes(StandardCharsets.UTF_8)), lIlIllIIlllll[6]), "DES");
            Cipher llllllllllllllIllIlIIlIIlIIlIIll = Cipher.getInstance("DES");
            llllllllllllllIllIlIIlIIlIIlIIll.init(lIlIllIIlllll[2], llllllllllllllIllIlIIlIIlIIlIlII);
            return new String(llllllllllllllIllIlIIlIIlIIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIlIIlIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIlIIlIIlIIlI) {
            llllllllllllllIllIlIIlIIlIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIIllllIll(Object obj) {
        return obj != null;
    }

    private static boolean llIIIIIIllllIII(int i2) {
        return i2 != 0;
    }

    private static boolean llIIIIIIllllllI(int i2, int i3) {
        return i2 == i3;
    }
}
