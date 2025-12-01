package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Entering fight", priority = 100, blocking = true)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.P  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/P.class */
public class P extends Q {
    private final /* synthetic */ Client cG;
    private static final /* synthetic */ WorldPoint cF;
    private static /* synthetic */ String[] lIlIlIlIlllIl;
    public static final /* synthetic */ WorldPoint cE;
    public static final /* synthetic */ WorldArea cD;
    private static /* synthetic */ int[] lIlIlIlIllllI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.Q
    public boolean Q() {
        if (lIllllllIllIlIl(this.cG.isInInstancedRegion() ? 1 : 0)) {
            return lIlIlIlIllllI[0];
        }
        TileObject nearest = TileObjects.getNearest(cE, tileObject -> {
            String[] strArr = new String[lIlIlIlIllllI[1]];
            strArr[lIlIlIlIllllI[0]] = lIlIlIlIlllIl[lIlIlIlIllllI[1]];
            return tileObject.hasAction(strArr);
        });
        if (!lIllllllIllIllI(nearest)) {
            nearest.interact(lIlIlIlIlllIl[lIlIlIlIllllI[0]]);
            return lIlIlIlIllllI[1];
        }
        Movement.walkTo(cF);
        "".length();
        return lIlIlIlIllllI[0];
    }

    static {
        lIllllllIllIlII();
        lIllllllIllIIll();
        cD = new WorldPoint(lIlIlIlIllllI[2], lIlIlIlIllllI[3], lIlIlIlIllllI[0]).toWorldArea();
        cE = new WorldPoint(lIlIlIlIllllI[4], lIlIlIlIllllI[5], lIlIlIlIllllI[0]);
        cF = new WorldPoint(lIlIlIlIllllI[6], lIlIlIlIllllI[7], lIlIlIlIllllI[0]);
    }

    private static boolean lIllllllIllIlll(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIllllllIllIIlI(String llllllllllllllIllIlIlIIllIIllIlI, String llllllllllllllIllIlIlIIllIIllIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlIIllIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIlIlIIllIIlIlll = llllllllllllllIllIlIlIIllIIllIIl.toCharArray();
        int llllllllllllllIllIlIlIIllIIlIllI = lIlIlIlIllllI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int llllllllllllllIllIlIlIIllIIIlllI = lIlIlIlIllllI[0];
        while (lIllllllIllIlll(llllllllllllllIllIlIlIIllIIIlllI, length)) {
            sb.append((char) (charArray[llllllllllllllIllIlIlIIllIIIlllI] ^ llllllllllllllIllIlIlIIllIIlIlll[llllllllllllllIllIlIlIIllIIlIllI % llllllllllllllIllIlIlIIllIIlIlll.length]));
            "".length();
            llllllllllllllIllIlIlIIllIIlIllI++;
            llllllllllllllIllIlIlIIllIIIlllI++;
            "".length();
            if (((true ^ true) ^ (true ^ true)) != ((true ^ true) ^ (true ^ true))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllllllIllIllI(Object obj) {
        return obj == null;
    }

    private static void lIllllllIllIlII() {
        lIlIlIlIllllI = new int[9];
        lIlIlIlIllllI[0] = (54 ^ 41) & ((152 ^ 135) ^ (-1));
        lIlIlIlIllllI[1] = " ".length();
        lIlIlIlIllllI[2] = (-((-2081) & 31291)) & (-1025) & 32511;
        lIlIlIlIllllI[3] = (-((-17693) & 29981)) & (-38) & 16359;
        lIlIlIlIllllI[4] = (-22019) & 24287;
        lIlIlIlIllllI[5] = (-((-15537) & 31921)) & (-8197) & 28639;
        lIlIlIlIllllI[6] = (-((-19177) & 32761)) & (-10) & 15865;
        lIlIlIlIllllI[7] = (-((-197) & 20709)) & (-11) & 24571;
        lIlIlIlIllllI[8] = "  ".length();
    }

    @Inject
    protected P(Client client, SquireVorkathConfig squireVorkathConfig) {
        super(client, squireVorkathConfig);
        this.cG = client;
    }

    private static void lIllllllIllIIll() {
        lIlIlIlIlllIl = new String[lIlIlIlIllllI[8]];
        lIlIlIlIlllIl[lIlIlIlIllllI[0]] = lIllllllIllIIlI("FyEKHQ15IhUVHQ==", "TMcpo");
        lIlIlIlIlllIl[lIlIlIlIllllI[1]] = lIllllllIllIIlI("Fxo8BAt5GSMMGw==", "TvUii");
    }

    private static boolean lIllllllIllIlIl(int i2) {
        return i2 != 0;
    }
}
