package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.Tile;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.scene.Tiles;
@TaskDesc(name = "Setup Bird Snare", priority = 20, blocking = true)
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.E  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/E.class */
public class E extends j {
    private static /* synthetic */ int[] llllIIIIIlIl;
    private /* synthetic */ long I;
    private final /* synthetic */ EnumC0002c H;
    private static /* synthetic */ String[] llllIIIIIlII;

    @Inject
    public E(C0000a c0000a, SquireHunterConfig squireHunterConfig) {
        super(c0000a, squireHunterConfig, EnumC0004e.BIRDS);
        this.H = z().birdLocation();
        this.I = 0L;
    }

    static {
        lIIIlllIlIIIIll();
        lIIIlllIlIIIIlI();
    }

    private static boolean lIIIlllIlIIlIII(int i) {
        return i != 0;
    }

    private static void lIIIlllIlIIIIll() {
        llllIIIIIlIl = new int[6];
        llllIIIIIlIl[0] = (20 ^ 72) & ((10 ^ 86) ^ (-1));
        llllIIIIIlIl[1] = " ".length();
        llllIIIIIlIl[2] = (((31 + 55) - 12) + 59) ^ (((44 + 136) - 146) + 109);
        llllIIIIIlIl[3] = "  ".length();
        llllIIIIIlIl[4] = (-16577) & 26582;
        llllIIIIIlIl[5] = 32 ^ 40;
    }

    private static void lIIIlllIlIIIIlI() {
        llllIIIIIlII = new String[llllIIIIIlIl[3]];
        llllIIIIIlII[llllIIIIIlIl[0]] = lIIIlllIlIIIIII("hSqh8kg7tJ0=", "ISrIk");
        llllIIIIIlII[llllIIIIIlIl[1]] = lIIIlllIlIIIIIl("PRsa", "qzcHS");
    }

    private static boolean lIIIlllIlIIlIll(int i, int i2) {
        return i == i2;
    }

    private static int lIIIlllIlIIIlII(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static String lIIIlllIlIIIIII(String lllllllllllllllIIlIllIlIIlIIlIll, String lllllllllllllllIIlIllIlIIlIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIlIIlIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), llllIIIIIlIl[5]), "DES");
            Cipher lllllllllllllllIIlIllIlIIlIIllIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIlIIlIIllIl.init(llllIIIIIlIl[3], lllllllllllllllIIlIllIlIIlIIlllI);
            return new String(lllllllllllllllIIlIllIlIIlIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIlIIlIIllII) {
            lllllllllllllllIIlIllIlIIlIIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIlIIIlIl(int i) {
        return i == 0;
    }

    private static boolean lIIIlllIlIIIllI(int i) {
        return i > 0;
    }

    private static boolean lIIIlllIlIIlIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIIIlllIlIIIlll(Object obj) {
        return obj == null;
    }

    private static String lIIIlllIlIIIIIl(String lllllllllllllllIIlIllIlIIIllIllI, String lllllllllllllllIIlIllIlIIIlllIlI) {
        String lllllllllllllllIIlIllIlIIIllIllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIIIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIllIlIIIlllIlI.toCharArray();
        int lllllllllllllllIIlIllIlIIIllIlll = llllIIIIIlIl[0];
        char[] charArray2 = lllllllllllllllIIlIllIlIIIllIllI2.toCharArray();
        int length = charArray2.length;
        int i = llllIIIIIlIl[0];
        while (lIIIlllIlIIlIIl(i, length)) {
            char lllllllllllllllIIlIllIlIIIllllII = charArray2[i];
            sb.append((char) (lllllllllllllllIIlIllIlIIIllllII ^ charArray[lllllllllllllllIIlIllIlIIIllIlll % charArray.length]));
            "".length();
            lllllllllllllllIIlIllIlIIIllIlll++;
            i++;
            "".length();
            if (" ".length() <= (((((17 + 89) - 70) + 106) ^ (((161 + 70) - 126) + 70)) & (((54 ^ 5) ^ (129 ^ 147)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    @Override // e.t.r.i.s.h.q.n.r.u.p000.u.e.j
    public boolean x() {
        if (lIIIlllIlIIIlIl(y().b() ? 1 : 0)) {
            return llllIIIIIlIl[0];
        }
        Player local = Players.getLocal();
        if (lIIIlllIlIIIllI(lIIIlllIlIIIlII(this.I - 2, y().i().get()))) {
            if (lIIIlllIlIIIlIl(Movement.shouldWalk() ? 1 : 0)) {
                return llllIIIIIlIl[0];
            }
            Movement.walkTo(this.H.l());
            "".length();
            return llllIIIIIlIl[1];
        }
        WorldPoint a = y().a(this.H);
        if (lIIIlllIlIIIlll(a)) {
            return llllIIIIIlIl[0];
        }
        if (lIIIlllIlIIlIII(local.isAnimating() ? 1 : 0) && lIIIlllIlIIlIIl(local.getAnimationFrame(), llllIIIIIlIl[2])) {
            return llllIIIIIlIl[0];
        }
        Tile at = Tiles.getAt(a);
        if (lIIIlllIlIIlIlI(at) && lIIIlllIlIIlIlI(at.getGroundItems())) {
            List list = (List) at.getGroundItems().stream().filter(tileItem -> {
                if (lIIIlllIlIIlIll(tileItem.getId(), llllIIIIIlIl[4])) {
                    ?? r0 = llllIIIIIlIl[1];
                    "".length();
                    return (181 ^ 177) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llllIIIIIlIl[0];
            }).collect(Collectors.toList());
            if (lIIIlllIlIIIlIl(list.isEmpty() ? 1 : 0)) {
                ((TileItem) list.get(llllIIIIIlIl[0])).interact(llllIIIIIlII[llllIIIIIlIl[0]]);
                this.I = y().i().get() - (local.distanceTo(a) / llllIIIIIlIl[3]);
                return llllIIIIIlIl[1];
            }
        }
        if (lIIIlllIlIIIlIl(local.getWorldLocation().equals(a) ? 1 : 0)) {
            Movement.walkTo(a);
            "".length();
            return llllIIIIIlIl[1];
        }
        int[] iArr = new int[llllIIIIIlIl[1]];
        iArr[llllIIIIIlIl[0]] = llllIIIIIlIl[4];
        Item first = Inventory.getFirst(iArr);
        if (lIIIlllIlIIIlll(first)) {
            return llllIIIIIlIl[0];
        }
        first.interact(llllIIIIIlII[llllIIIIIlIl[1]]);
        this.I = y().i().get();
        return llllIIIIIlIl[1];
    }

    private static boolean lIIIlllIlIIlIIl(int i, int i2) {
        return i < i2;
    }
}
