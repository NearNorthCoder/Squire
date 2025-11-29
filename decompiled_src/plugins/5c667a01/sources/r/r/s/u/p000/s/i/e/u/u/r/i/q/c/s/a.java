package r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/a.class */
public abstract class a extends Task {
    private static /* synthetic */ String[] lIIlIlIllIllI;
    protected final /* synthetic */ Client d;
    protected final /* synthetic */ SquireScurriusConfig b;
    protected final /* synthetic */ SquireScurrius a;
    protected /* synthetic */ Player e;
    protected final /* synthetic */ b c;
    private static /* synthetic */ int[] lIIlIlIllIlll;
    protected /* synthetic */ boolean g;
    protected /* synthetic */ NPC f;

    /* JADX INFO: Access modifiers changed from: protected */
    @Inject
    public a(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b bVar, Client client) {
        this.a = squireScurrius;
        this.b = squireScurriusConfig;
        this.c = bVar;
        this.d = client;
    }

    private static boolean lIlIllIIIllIIII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIllIIIlIllll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    public boolean run() {
        if (lIlIllIIIlIllIl(c() ? 1 : 0)) {
            return lIIlIlIllIlll[0];
        }
        this.e = Players.getLocal();
        if (lIlIllIIIlIlllI(this.e)) {
            return lIIlIlIllIlll[0];
        }
        String[] strArr = new String[lIIlIlIllIlll[1]];
        strArr[lIIlIlIllIlll[0]] = lIIlIlIllIllI[lIIlIlIllIlll[0]];
        this.f = NPCs.getNearest(strArr);
        return lIlIllIIIlIlllI(this.f) ? lIIlIlIllIlll[0] : a();
    }

    private static boolean lIlIllIIIllIIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIllIIIllIIlI(int i, int i2) {
        return i < i2;
    }

    private static String lIlIllIIIlIlIIl(String llllllllllllllIllllIllIlIIIIllIl, String llllllllllllllIllllIllIlIIIIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllIlIIIIlllI.getBytes(StandardCharsets.UTF_8)), lIIlIlIllIlll[5]), "DES");
            Cipher llllllllllllllIllllIllIlIIIlIIIl = Cipher.getInstance("DES");
            llllllllllllllIllllIllIlIIIlIIIl.init(lIIlIlIllIlll[2], secretKeySpec);
            return new String(llllllllllllllIllllIllIlIIIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllIlIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIllIlIIIlIIII) {
            llllllllllllllIllllIllIlIIIlIIII.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIIIlIlIlI(String llllllllllllllIllllIllIlIIlIIlII, String llllllllllllllIllllIllIlIIlIIIll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllIllIlIIlIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllllIllIlIIlIIIIl = llllllllllllllIllllIllIlIIlIIIll.toCharArray();
        int llllllllllllllIllllIllIlIIlIIIII = lIIlIlIllIlll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIlIlIllIlll[0];
        while (lIlIllIIIllIIlI(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIllllIllIlIIlIIIIl[llllllllllllllIllllIllIlIIlIIIII % llllllllllllllIllllIllIlIIlIIIIl.length]));
            "".length();
            llllllllllllllIllllIllIlIIlIIIII++;
            i++;
            "".length();
            if (((((158 + 42) - 59) + 33) ^ (((54 + 25) - (-20)) + 72)) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIllIIIlIlllI(Object obj) {
        return obj == null;
    }

    private static void lIlIllIIIlIlIll() {
        lIIlIlIllIllI = new String[lIIlIlIllIlll[2]];
        lIIlIlIllIllI[lIIlIlIllIlll[0]] = lIlIllIIIlIlIIl("8l5H9gDCqXP5wV6KN4dfqg==", "BwxmT");
        lIIlIlIllIllI[lIIlIlIllIlll[1]] = lIlIllIIIlIlIlI("GiY/EDMgMDk=", "IEJbA");
    }

    private static boolean lIlIllIIIlIllIl(int i) {
        return i == 0;
    }

    static {
        lIlIllIIIlIllII();
        lIlIllIIIlIlIll();
    }

    protected WorldPoint b() {
        int[] iArr = new int[lIIlIlIllIlll[1]];
        iArr[lIIlIlIllIlll[0]] = d.A;
        TileObject nearest = TileObjects.getNearest(iArr);
        return lIlIllIIIlIlllI(nearest) ? new WorldPoint(lIIlIlIllIlll[0], lIIlIlIllIlll[0], lIIlIlIllIlll[0]) : nearest.getWorldLocation().dx(lIIlIlIllIlll[2]).dy(lIIlIlIllIlll[3]);
    }

    public abstract boolean a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean a(WorldPoint worldPoint) {
        for (GraphicsObject graphicsObject : this.d.getGraphicsObjects()) {
            if (lIlIllIIIllIIIl(graphicsObject.getId(), d.B) && lIlIllIIIlIllll(WorldPoint.fromLocal(this.d, graphicsObject.getLocation()).equals(worldPoint) ? 1 : 0)) {
                return lIIlIlIllIlll[1];
            }
            "".length();
            if ((180 ^ 176) <= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIIlIlIllIlll[0];
    }

    private static void lIlIllIIIlIllII() {
        lIIlIlIllIlll = new int[6];
        lIIlIlIllIlll[0] = " ".length() & (" ".length() ^ (-1));
        lIIlIlIllIlll[1] = " ".length();
        lIIlIlIllIlll[2] = "  ".length();
        lIIlIlIllIlll[3] = (9 ^ 76) ^ (97 ^ 33);
        lIIlIlIllIlll[4] = "   ".length();
        lIIlIlIllIlll[5] = 106 ^ 98;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    protected boolean c() {
        if (!lIlIllIIIlIllll(this.d.isInInstancedRegion() ? 1 : 0) && !lIlIllIIIlIllll(d.F.contains(Players.getLocal()) ? 1 : 0)) {
            return lIIlIlIllIlll[0];
        }
        return lIIlIlIllIlll[1];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public WorldPoint a(boolean z) {
        String[] strArr = new String[lIIlIlIllIlll[1]];
        strArr[lIIlIlIllIlll[0]] = lIIlIlIllIllI[lIIlIlIllIlll[1]];
        NPC nearest = NPCs.getNearest(strArr);
        return (lIlIllIIIlIllll(z ? 1 : 0) && lIlIllIIIllIIII(nearest)) ? (WorldPoint) nearest.getWorldArea().offset(lIIlIlIllIlll[1]).toWorldPointList().stream().filter(worldPoint -> {
            if (lIlIllIIIlIllIl(a(worldPoint) ? 1 : 0) && lIlIllIIIlIllll(Reachable.isWalkable(worldPoint) ? 1 : 0) && lIlIllIIIlIllll(nearest.getWorldArea().isInMeleeDistance(worldPoint) ? 1 : 0)) {
                ?? r0 = lIIlIlIllIlll[1];
                "".length();
                return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIlIlIllIlll[0];
        }).min(Comparator.comparingInt(worldPoint2 -> {
            return worldPoint2.distanceTo(this.e);
        })).orElse(null) : (WorldPoint) this.e.getWorldArea().offset(lIIlIlIllIlll[4]).toWorldPointList().stream().filter(worldPoint3 -> {
            if (lIlIllIIIlIllIl(a(worldPoint3) ? 1 : 0)) {
                ?? r0 = lIIlIlIllIlll[1];
                "".length();
                return "   ".length() > ((53 ^ 122) ^ (254 ^ 181)) ? ((225 ^ 186) ^ (224 ^ 135)) & (((164 ^ 139) ^ (1 ^ 18)) ^ (-" ".length())) : r0;
            }
            return lIIlIlIllIlll[0];
        }).min(Comparator.comparingInt(worldPoint4 -> {
            return worldPoint4.distanceTo(this.e);
        })).orElse(null);
    }
}
