package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.plugins.gauntlet.SquireGauntlet;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Giving up", priority = 100, blocking = true)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.O  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/O.class */
public class O extends AbstractC0013n {
    private static /* synthetic */ String[] llIlIIIIllII;
    private static /* synthetic */ int[] llIlIIIIllIl;
    private final /* synthetic */ SquireGauntlet bZ;

    private static String lIIIIIIIlllIIll(String lllllllllllllllIlIIIllIllIlIIIIl, String lllllllllllllllIlIIIllIllIlIIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIIllIllIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIllIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIllIllIlIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIllIllIlIIIll.init(llIlIIIIllIl[3], lllllllllllllllIlIIIllIllIlIIlII);
            return new String(lllllllllllllllIlIIIllIllIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIllIllIlIIIlI) {
            lllllllllllllllIlIIIllIllIlIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIIlllIllI(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIIIIllllIII(Object obj) {
        return obj == null;
    }

    private static void lIIIIIIIlllIlII() {
        llIlIIIIllII = new String[llIlIIIIllIl[3]];
        llIlIIIIllII[llIlIIIIllIl[1]] = lIIIIIIIlllIIlI("CCcAABt0NxEKBA==", "YRicp");
        llIlIIIIllII[llIlIIIIllIl[0]] = lIIIIIIIlllIIll("/SaT+YK+WV1oQEj4t9klUg==", "eirIM");
    }

    private static boolean lIIIIIIIlllIlll(int i) {
        return i != 0;
    }

    private static boolean lIIIIIIIllllIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        C0007h V = this.ba.V();
        Player local = Players.getLocal();
        if (lIIIIIIIlllIllI(V) && lIIIIIIIlllIllI(local) && !lIIIIIIIlllIlll(local.isMoving() ? 1 : 0)) {
            if (lIIIIIIIlllIlll(V.av().e(local.getWorldLocation()) ? 1 : 0)) {
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    return C0004e.ac.contains(Integer.valueOf(tileObject.getId()));
                });
                if (lIIIIIIIllllIII(nearest)) {
                    return llIlIIIIllIl[1];
                }
                if (lIIIIIIIlllIlll(Players.getLocal().isMoving() ? 1 : 0)) {
                    return llIlIIIIllIl[0];
                }
                nearest.interact(llIlIIIIllII[llIlIIIIllIl[1]]);
                this.bZ.a(this.bZ.k() + llIlIIIIllIl[0]);
                Log.info("Unlucky spawns or no T3 Magic weapon. Giving up, count: " + this.bZ.k());
                return llIlIIIIllIl[0];
            }
            Item first = Inventory.getFirst(item -> {
                return C0004e.ab.contains(Integer.valueOf(item.getId()));
            });
            if (lIIIIIIIlllIllI(first)) {
                first.interact(llIlIIIIllII[llIlIIIIllIl[0]]);
                "".length();
                if ((3 ^ 7) <= (-" ".length())) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                ScenePoint fromWorld = ScenePoint.fromWorld(V.av().aW().dx(llIlIIIIllIl[2]).dy(llIlIIIIllIl[2]));
                Movement.setDestination(fromWorld.getX(), fromWorld.getY());
            }
            return llIlIIIIllIl[0];
        }
        return llIlIIIIllIl[1];
    }

    private static void lIIIIIIIlllIlIl() {
        llIlIIIIllIl = new int[4];
        llIlIIIIllIl[0] = " ".length();
        llIlIIIIllIl[1] = (25 ^ 34) & ((50 ^ 9) ^ (-1));
        llIlIIIIllIl[2] = 160 ^ 166;
        llIlIIIIllIl[3] = "  ".length();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public O(SquireGauntlet squireGauntlet, C0002c c0002c) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIlIIIIllIl[0]];
        enumC0003dArr[llIlIIIIllIl[1]] = EnumC0003d.GIVE_UP;
        this.bZ = squireGauntlet;
    }

    private static String lIIIIIIIlllIIlI(String lllllllllllllllIlIIIllIllIIlIIIl, String lllllllllllllllIlIIIllIllIIlIIII) {
        String lllllllllllllllIlIIIllIllIIlIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIllIllIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIllIllIIIllll = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIIllIllIIlIIII.toCharArray();
        int lllllllllllllllIlIIIllIllIIIllIl = llIlIIIIllIl[1];
        char[] charArray2 = lllllllllllllllIlIIIllIllIIlIIIl2.toCharArray();
        int length = charArray2.length;
        int i = llIlIIIIllIl[1];
        while (lIIIIIIIllllIIl(i, length)) {
            char lllllllllllllllIlIIIllIllIIlIIlI = charArray2[i];
            lllllllllllllllIlIIIllIllIIIllll.append((char) (lllllllllllllllIlIIIllIllIIlIIlI ^ charArray[lllllllllllllllIlIIIllIllIIIllIl % charArray.length]));
            "".length();
            lllllllllllllllIlIIIllIllIIIllIl++;
            i++;
            "".length();
            if ((-(19 ^ 22)) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIIllIllIIIllll);
    }

    static {
        lIIIIIIIlllIlIl();
        lIIIIIIIlllIlII();
    }
}
