package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ActorDeath;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Red X Cycle", priority = 50, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aK  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aK.class */
public class aK extends aI {
    private /* synthetic */ int eb;
    private static /* synthetic */ int[] llIlIIlIlll;
    private static /* synthetic */ String[] llIlIIlIllI;
    private /* synthetic */ int ed;
    private /* synthetic */ int ec;

    private static boolean lIlIIlIllIIllI(Object obj) {
        return obj == null;
    }

    private static String lIlIIlIlIlllll(String llllllllllllllllIIllIllIIIllllll, String llllllllllllllllIIllIllIIIlllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIllIIIlllllI.getBytes(StandardCharsets.UTF_8)), llIlIIlIlll[15]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIIlIlll[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIllIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIllIIlIIIIII) {
            llllllllllllllllIIllIllIIlIIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIllIlIIl(int i, int i2) {
        return i != i2;
    }

    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        if (lIlIIlIllIllII(this.eb, this.cu.getTickCount())) {
            return;
        }
        if (lIlIIlIllIIlll(graphicsObjectCreated.getGraphicsObject().getId(), llIlIIlIlll[13])) {
            this.eb = this.cu.getTickCount() + llIlIIlIlll[2];
        }
        if (lIlIIlIllIIlll(graphicsObjectCreated.getGraphicsObject().getId(), llIlIIlIlll[14]) && lIlIIlIllIIIll(WorldPoint.fromLocal(this.cu, graphicsObjectCreated.getGraphicsObject().getLocation()).equals(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            this.eb = this.cu.getTickCount() + llIlIIlIlll[2];
        }
    }

    @Inject
    protected aK(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static void lIlIIlIllIIIlI() {
        llIlIIlIlll = new int[16];
        llIlIIlIlll[0] = -" ".length();
        llIlIIlIlll[1] = ((((122 + 156) - 124) + 53) ^ (((5 + 107) - 54) + 72)) & (((((137 + 73) - 163) + 157) ^ (((41 + 88) - 125) + 125)) ^ (-" ".length()));
        llIlIIlIlll[2] = " ".length();
        llIlIIlIlll[3] = (-((-1163) & 5371)) & (-2049) & 15999;
        llIlIIlIlll[4] = "   ".length();
        llIlIIlIlll[5] = "  ".length();
        llIlIIlIlll[6] = 104 ^ 108;
        llIlIIlIlll[7] = 72 ^ 94;
        llIlIIlIlll[8] = (125 ^ 102) ^ (63 ^ 0);
        llIlIIlIlll[9] = (9 ^ 12) ^ (181 ^ 172);
        llIlIIlIlll[10] = (-20483) & 32262;
        llIlIIlIlll[11] = (64 ^ 4) ^ (93 ^ 31);
        llIlIIlIlll[12] = (-13846) & 16095;
        llIlIIlIlll[13] = (-10545) & 11647;
        llIlIIlIlll[14] = (-18439) & 19886;
        llIlIIlIlll[15] = 7 ^ 15;
    }

    private static boolean lIlIIlIllIllII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIIlIllIlIlI(int i) {
        return i > 0;
    }

    private static boolean lIlIIlIllIIlll(int i, int i2) {
        return i == i2;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public void r() {
        this.eb = llIlIIlIlll[0];
        this.ec = llIlIIlIlll[0];
    }

    private static int lIlIIlIllIIlII(float f, float f2) {
        return (f > f2 ? 1 : (f == f2 ? 0 : -1));
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIlIIlIllIIIll(chatMessage.getMessage().contains(llIlIIlIllI[llIlIIlIlll[1]]) ? 1 : 0)) {
            r();
        }
    }

    private static boolean lIlIIlIllIlIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlIIlIllIlIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIlIllIIlIl(int i) {
        return i == 0;
    }

    private static String lIlIIlIllIIIII(String llllllllllllllllIIllIllIIlIIllII, String llllllllllllllllIIllIllIIlIIlIll) {
        try {
            SecretKeySpec llllllllllllllllIIllIllIIlIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIllIIlIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllIllIIlIIlllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllIllIIlIIlllI.init(llIlIIlIlll[5], llllllllllllllllIIllIllIIlIIllll);
            return new String(llllllllllllllllIIllIllIIlIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIllIIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIllIIlIIllIl) {
            llllllllllllllllIIllIllIIlIIllIl.printStackTrace();
            return null;
        }
    }

    static {
        lIlIIlIllIIIlI();
        lIlIIlIllIIIIl();
    }

    private static boolean lIlIIlIllIIIll(int i) {
        return i != 0;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aI, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bm() {
        r();
        return super.bm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v117, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aI
    public boolean bC() {
        int i;
        int i2;
        if (lIlIIlIllIIlIl(this.cW.redX() ? 1 : 0)) {
            return llIlIIlIlll[1];
        }
        NPC bB = bB();
        if (lIlIIlIllIIllI(bB)) {
            return llIlIIlIlll[1];
        }
        Set<WorldPoint> bF = bF();
        Player local = Players.getLocal();
        if (lIlIIlIllIIlll(this.cu.getTickCount(), this.eb)) {
            i = llIlIIlIlll[2];
            "".length();
            if ((67 ^ 71) <= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = llIlIIlIlll[1];
        }
        if (lIlIIlIllIIIll(i)) {
            WorldPoint center = bB.getWorldArea().getCenter();
            WorldPoint worldPoint = (WorldPoint) center.createWorldArea(llIlIIlIlll[2]).toWorldPointList().stream().filter(worldPoint2 -> {
                if (lIlIIlIllIIlll(Math.abs(worldPoint2.getWorldX() - center.getWorldX()), llIlIIlIlll[2]) && lIlIIlIllIIlll(Math.abs(worldPoint2.getWorldY() - center.getWorldY()), llIlIIlIlll[2])) {
                    ?? r0 = llIlIIlIlll[2];
                    "".length();
                    return "  ".length() >= "   ".length() ? ((((91 + 203) - 135) + 69) ^ (((167 + 62) - 90) + 53)) & (((199 ^ 180) ^ (92 ^ 11)) ^ (-" ".length())) : r0;
                }
                return llIlIIlIlll[1];
            }).filter(Reachable::isWalkable).filter(worldPoint3 -> {
                if (lIlIIlIllIIlIl(bF.contains(worldPoint3) ? 1 : 0)) {
                    ?? r0 = llIlIIlIlll[2];
                    "".length();
                    return 0 != 0 ? ((147 ^ 171) ^ (209 ^ 161)) & (((((105 + 48) - 67) + 114) ^ (((106 + 100) - 186) + 108)) ^ (-" ".length())) : r0;
                }
                return llIlIIlIlll[1];
            }).min(Comparator.comparingInt(worldPoint4 -> {
                return worldPoint4.distanceTo(local);
            })).orElse(null);
            if (lIlIIlIllIIlIl(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            Movement.setDestination(worldPoint);
            return llIlIIlIlll[2];
        }
        if (lIlIIlIllIIlll(bB.getAnimation(), llIlIIlIlll[3]) && lIlIIlIllIlIII(this.eb, this.cu.getTickCount()) && lIlIIlIllIIlIl(bB.getWorldArea().contains(local) ? 1 : 0)) {
            this.ed = this.cu.getTickCount();
            if (lIlIIlIllIIlll(bA(), llIlIIlIlll[4])) {
                i2 = llIlIIlIlll[5];
                "".length();
                if (((96 ^ 57) & ((197 ^ 156) ^ (-1))) >= (89 ^ 93)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                i2 = llIlIIlIlll[6];
            }
            this.eb = this.cu.getTickCount() + i2;
        }
        if (lIlIIlIllIIlIl(this.cu.getTickCount() - this.ec) && lIlIIlIllIlIIl(bA(), llIlIIlIlll[4])) {
            if (lIlIIlIllIIlIl(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            WorldPoint a = a(new Point(llIlIIlIlll[7], llIlIIlIlll[8]));
            WorldPoint a2 = a(new Point(llIlIIlIlll[7], llIlIIlIlll[9]));
            WorldPoint worldLocation = local.getWorldLocation();
            if (lIlIIlIllIlIlI(lIlIIlIllIIlII(a.distanceTo2DHypotenuse(worldLocation), a2.distanceTo2DHypotenuse(worldLocation)))) {
                a = a2;
            }
            if (lIlIIlIllIIIll(bF.contains(a) ? 1 : 0)) {
                return llIlIIlIlll[2];
            }
            Movement.setDestination(a);
            return llIlIIlIlll[2];
        } else if (lIlIIlIllIlIll(local.getInteracting(), bB)) {
            return llIlIIlIlll[2];
        } else {
            bp();
            if (lIlIIlIllIIIll(bB.getWorldArea().contains(local) ? 1 : 0) && lIlIIlIllIIIll(Movement.isRunEnabled() ? 1 : 0) && lIlIIlIllIlIIl(bB.getId(), llIlIIlIlll[10])) {
                Movement.toggleRun();
                this.ec = this.cu.getTickCount() + llIlIIlIlll[4];
                bB.interact(llIlIIlIllI[llIlIIlIlll[2]]);
            }
            if (lIlIIlIllIllII(this.cu.getTickCount() - this.ec, llIlIIlIlll[11])) {
                bB.interact(llIlIIlIllI[llIlIIlIlll[5]]);
            }
            return llIlIIlIlll[2];
        }
    }

    private static void lIlIIlIllIIIIl() {
        llIlIIlIllI = new String[llIlIIlIlll[4]];
        llIlIIlIllI[llIlIIlIlll[1]] = lIlIIlIlIlllll("JHZaEliWNiGBuqwnDjidRg==", "lyklH");
        llIlIIlIllI[llIlIIlIlll[2]] = lIlIIlIllIIIII("R6P0NRSX6j8=", "AcUZX");
        llIlIIlIllI[llIlIIlIlll[5]] = lIlIIlIlIlllll("VMpE5i9fIeE=", "bhFbd");
    }

    @Subscribe
    public void a(ActorDeath actorDeath) {
        if (lIlIIlIllIlIll(actorDeath.getActor(), Players.getLocal())) {
            r();
        }
    }

    private Set<WorldPoint> bF() {
        HashSet hashSet = new HashSet();
        for (GraphicsObject graphicsObject : this.cu.getGraphicsObjects()) {
            if (lIlIIlIllIlIIl(graphicsObject.getId(), llIlIIlIlll[12])) {
                "".length();
                if ((((((94 + 135) - 154) + 156) ^ (((30 + 4) - (-123)) + 23)) & (((((139 + 209) - 258) + 149) ^ (((136 + 18) - 35) + 69)) ^ (-" ".length()))) != 0) {
                    return null;
                }
            } else {
                hashSet.add(WorldPoint.fromLocal(this.cu, graphicsObject.getLocation()));
                "".length();
                "".length();
                if ((((80 ^ 11) ^ (45 ^ 115)) & (((247 ^ 159) ^ (169 ^ 196)) ^ (-" ".length()))) != 0) {
                    return null;
                }
            }
        }
        return hashSet;
    }
}
