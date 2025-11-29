package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.World;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Doing Vyre stuff", priority = 133337, blocking = true)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.A  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/A.class */
public class A extends AbstractC0000a {
    private final /* synthetic */ int[] at;
    private static /* synthetic */ int[] lIIllIlIlllIl;
    private final /* synthetic */ WorldArea ap;
    private final /* synthetic */ WorldArea aq;
    private static /* synthetic */ String[] lIIllIlIlllII;
    private final /* synthetic */ WorldPoint as;
    private final /* synthetic */ WorldPoint ar;

    private static boolean lIllIIIIlllIIII(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private boolean a(Actor actor) {
        if (!lIllIIIIllIlIlI(this.ap.contains(actor.getWorldLocation()) ? 1 : 0) || lIllIIIIllIllII(this.aq.contains(actor.getWorldLocation()) ? 1 : 0)) {
            ?? r0 = lIIllIlIlllIl[12];
            "".length();
            return "  ".length() > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIllIlIlllIl[4];
    }

    private static boolean lIllIIIIllIllll(int i, int i2) {
        return i == i2;
    }

    private TileObject I() {
        WorldPoint worldPoint = this.ar;
        String[] strArr = new String[lIIllIlIlllIl[12]];
        strArr[lIIllIlIlllIl[4]] = lIIllIlIlllII[lIIllIlIlllIl[14]];
        return TileObjects.getNearest(worldPoint, strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean J() {
        TileObject I = I();
        if (lIllIIIIllIlIll(I)) {
            return lIIllIlIlllIl[4];
        }
        String[] strArr = new String[lIIllIlIlllIl[12]];
        strArr[lIIllIlIlllIl[4]] = lIIllIlIlllII[lIIllIlIlllIl[10]];
        return I.hasAction(strArr);
    }

    private static boolean lIllIIIIllIlIll(Object obj) {
        return obj == null;
    }

    private static String lIllIIIIllIIlIl(String llllllllllllllIlllIlllllllllIIIl, String llllllllllllllIlllIlllllllllIIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllllllllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIllllllllIlllI = llllllllllllllIlllIlllllllllIIII.toCharArray();
        int llllllllllllllIlllIllllllllIllIl = lIIllIlIlllIl[4];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIllIlIlllIl[4];
        while (lIllIIIIllIllIl(i, length)) {
            char llllllllllllllIlllIlllllllllIIlI = charArray[i];
            sb.append((char) (llllllllllllllIlllIlllllllllIIlI ^ llllllllllllllIlllIllllllllIlllI[llllllllllllllIlllIllllllllIllIl % llllllllllllllIlllIllllllllIlllI.length]));
            "".length();
            llllllllllllllIlllIllllllllIllIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIllIIIIllIIlll() {
        lIIllIlIlllII = new String[lIIllIlIlllIl[2]];
        lIIllIlIlllII[lIIllIlIlllIl[4]] = lIllIIIIllIIlIl("GxsePTI=", "XwqNW");
        lIIllIlIlllII[lIIllIlIlllIl[12]] = lIllIIIIllIIllI("rmEZrVVDXVM=", "WemMn");
        lIIllIlIlllII[lIIllIlIlllIl[14]] = lIllIIIIllIIllI("TqmIbt2mSYQ=", "yTNxR");
        lIIllIlIlllII[lIIllIlIlllIl[10]] = lIllIIIIllIIlIl("Ig82BQg=", "acYvm");
        lIIllIlIlllII[lIIllIlIlllIl[3]] = lIllIIIIllIIlIl("ED1yKRUieDM8RzwlfmgTLz1yLAI0LDsmBjMxPSZHLityMxppeBc5EiY0OzwefXgpNQ==", "GXRHg");
        lIIllIlIlllII[lIIllIlIlllIl[17]] = lIllIIIIllIIllI("RXn2FAAwJVU=", "oHmUY");
        lIIllIlIlllII[lIIllIlIlllIl[7]] = lIllIIIIllIIllI("xCF5OK8IaHE=", "Gnsmu");
    }

    private static boolean lIllIIIIllIllIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private boolean e(boolean z) {
        WorldPoint worldPoint;
        TileObject I = I();
        if (!lIllIIIIllIlllI(I) || lIllIIIIllIlIlI(J() ? 1 : 0)) {
            return lIIllIlIlllIl[4];
        }
        Player local = Players.getLocal();
        if (lIllIIIIllIlIll(local)) {
            return lIIllIlIlllIl[4];
        }
        if (lIllIIIIllIllII(z ? 1 : 0)) {
            worldPoint = this.ar;
            "".length();
            if ((((((116 + 177) - 252) + 193) ^ (((121 + 9) - 65) + 131)) & (((87 ^ 51) ^ (205 ^ 135)) ^ (-" ".length()))) >= ((44 ^ 75) ^ (205 ^ 174))) {
                return ((((18 + 51) - (-4)) + 64) ^ (((88 + 149) - 148) + 108)) & (((((54 + 47) - 45) + 86) ^ (((56 + 109) - 51) + 80)) ^ (-" ".length()));
            }
        } else {
            worldPoint = this.as;
        }
        WorldPoint worldPoint2 = worldPoint;
        boolean llllllllllllllIllllIIIIIIIIIllIl = local.getWorldLocation().equals(worldPoint2);
        String str = lIIllIlIlllII[lIIllIlIlllIl[3]];
        Object[] objArr = new Object[lIIllIlIlllIl[10]];
        objArr[lIIllIlIlllIl[4]] = local.getWorldLocation();
        objArr[lIIllIlIlllIl[12]] = worldPoint2;
        objArr[lIIllIlIlllIl[14]] = Boolean.valueOf(llllllllllllllIllllIIIIIIIIIllIl);
        Log.info(str, objArr);
        if (lIllIIIIllIlIlI(llllllllllllllIllllIIIIIIIIIllIl ? 1 : 0)) {
            Movement.setDestination(worldPoint2);
            "".length();
            if ((-((214 ^ 129) ^ (218 ^ 137))) > 0) {
                return ((213 ^ 181) ^ (204 ^ 187)) & (((255 ^ 194) ^ (239 ^ 197)) ^ (-" ".length()));
            }
        } else {
            String[] strArr = new String[lIIllIlIlllIl[14]];
            strArr[lIIllIlIlllIl[4]] = lIIllIlIlllII[lIIllIlIlllIl[17]];
            strArr[lIIllIlIlllIl[12]] = lIIllIlIlllII[lIIllIlIlllIl[7]];
            I.interact(strArr);
        }
        return lIIllIlIlllIl[12];
    }

    private static boolean lIllIIIIllIllII(int i) {
        return i != 0;
    }

    static {
        lIllIIIIllIlIII();
        lIllIIIIllIIlll();
    }

    private static boolean lIllIIIIllIlIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String lIllIIIIllIIllI(String llllllllllllllIllllIIIIIIIIIIIIl, String llllllllllllllIllllIIIIIIIIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIIIIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIIIIIIIIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIIIIIIIIIIll.init(lIIllIlIlllIl[14], secretKeySpec);
            return new String(llllllllllllllIllllIIIIIIIIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIIIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIIIIIIIIIlI) {
            llllllllllllllIllllIIIIIIIIIIIlI.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIIllIlIII() {
        lIIllIlIlllIl = new int[18];
        lIIllIlIlllIl[0] = (-20481) & 24141;
        lIIllIlIlllIl[1] = (-((-6167) & 23135)) & (-133) & 20478;
        lIIllIlIlllIl[2] = (((73 + 90) - 132) + 100) ^ (((109 + 106) - 162) + 79);
        lIIllIlIlllIl[3] = 18 ^ 22;
        lIIllIlIlllIl[4] = ((((125 + 108) - 223) + 144) ^ (((13 + 97) - 96) + 158)) & (((106 ^ 14) ^ (10 ^ 88)) ^ (-" ".length()));
        lIIllIlIlllIl[5] = (-((-188) & 29119)) & (-133) & 32727;
        lIIllIlIlllIl[6] = (-((-293) & 25524)) & (-4161) & 32767;
        lIIllIlIlllIl[7] = 103 ^ 97;
        lIIllIlIlllIl[8] = (-(((41 + 49) - (-13)) + 58)) & (-8449) & 12270;
        lIIllIlIlllIl[9] = (-577) & 3953;
        lIIllIlIlllIl[10] = "   ".length();
        lIIllIlIlllIl[11] = (-((-29282) & 30701)) & (-17) & 26111;
        lIIllIlIlllIl[12] = " ".length();
        lIIllIlIlllIl[13] = (-((-26353) & 28409)) & (-4738) & 31471;
        lIIllIlIlllIl[14] = "  ".length();
        lIIllIlIlllIl[15] = (-3736) & 28415;
        lIIllIlIlllIl[16] = (-((-16689) & 19251)) & (-17) & 12283;
        lIIllIlIlllIl[17] = (((6 + 115) - 7) + 41) ^ (((62 + 63) - (-16)) + 17);
    }

    private static boolean lIllIIIIllIlllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v104, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v108, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v112, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    @Override // s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.AbstractC0000a
    public boolean l() {
        if (lIllIIIIllIlIIl(this.p.pickpocketTarget(), EnumC0005f.VYRE)) {
            return lIIllIlIlllIl[4];
        }
        if (lIllIIIIllIlIlI(this.o.f().equals(this.ar) ? 1 : 0)) {
            this.o.a(this.ar);
        }
        Player local = Players.getLocal();
        if (!lIllIIIIllIlIll(local) && !lIllIIIIllIllII(o() ? 1 : 0)) {
            TileObject I = I();
            if (lIllIIIIllIlIll(I)) {
                return lIIllIlIlllIl[4];
            }
            if (lIllIIIIllIllII(a((Actor) local) ? 1 : 0) && lIllIIIIllIllII(J() ? 1 : 0) && lIllIIIIllIlIlI(this.o.j() ? 1 : 0)) {
                I.interact(lIIllIlIlllII[lIIllIlIlllIl[4]]);
                return lIIllIlIlllIl[12];
            } else if (!lIllIIIIllIllII(this.o.j() ? 1 : 0)) {
                if (lIllIIIIllIlIlI(Movement.shouldWalk() ? 1 : 0)) {
                    return lIIllIlIlllIl[4];
                }
                NPC H = H();
                if (lIllIIIIllIllII(a((Actor) H) ? 1 : 0)) {
                    this.o.a(Worlds.getCurrentId());
                    "".length();
                    if (" ".length() < 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    this.o.a(lIIllIlIlllIl[4]);
                    World currentWorld = Worlds.getCurrentWorld();
                    Worlds.hopTo(Worlds.getRandom(world -> {
                        if (lIllIIIIllIllII(world.isNormal() ? 1 : 0) && lIllIIIIllIllll(world.getLocation(), currentWorld.getLocation()) && lIllIIIIlllIIII(world.getId(), currentWorld.getId()) && lIllIIIIllIllII(world.isMembers() ? 1 : 0)) {
                            ?? r0 = lIIllIlIlllIl[12];
                            "".length();
                            return "   ".length() < 0 ? ((32 ^ 52) ^ (21 ^ 99)) & (((((115 + 116) - 91) + 94) ^ (((28 + 11) - (-96)) + 1)) ^ (-" ".length())) : r0;
                        }
                        return lIIllIlIlllIl[4];
                    }));
                }
                return (!lIllIIIIllIllII(a((Actor) local) ? 1 : 0) || lIllIIIIllIllII(Reachable.isInteractable(H) ? 1 : 0)) ? e(lIIllIlIlllIl[12]) : lIIllIlIlllIl[4];
            } else if (lIllIIIIllIllII(Inventory.contains(this.at) ? 1 : 0)) {
                int[] iArr = this.at;
                int llllllllllllllIllllIIIIIIIlIIIll = iArr.length;
                int i = lIIllIlIlllIl[4];
                while (lIllIIIIllIllIl(i, llllllllllllllIllllIIIIIIIlIIIll)) {
                    int i2 = iArr[i];
                    int[] iArr2 = new int[lIIllIlIlllIl[12]];
                    iArr2[lIIllIlIlllIl[4]] = i2;
                    Inventory.getFirst(iArr2).interact(lIIllIlIlllII[lIIllIlIlllIl[12]]);
                    i++;
                    "".length();
                    if ((-"  ".length()) > 0) {
                        return ((((39 + 202) - 203) + 208) ^ (((119 + 107) - 87) + 38)) & (((67 ^ 22) ^ (127 ^ 109)) ^ (-" ".length()));
                    }
                }
                return lIIllIlIlllIl[12];
            } else {
                return e(lIIllIlIlllIl[4]);
            }
        }
        return lIIllIlIlllIl[4];
    }

    @Inject
    public A(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
        this.ap = new WorldArea(lIIllIlIlllIl[0], lIIllIlIlllIl[1], lIIllIlIlllIl[2], lIIllIlIlllIl[3], lIIllIlIlllIl[4]);
        this.aq = new WorldArea(lIIllIlIlllIl[5], lIIllIlIlllIl[6], lIIllIlIlllIl[3], lIIllIlIlllIl[7], lIIllIlIlllIl[4]);
        this.ar = new WorldPoint(lIIllIlIlllIl[8], lIIllIlIlllIl[1], lIIllIlIlllIl[4]);
        this.as = new WorldPoint(lIIllIlIlllIl[8], lIIllIlIlllIl[9], lIIllIlIlllIl[4]);
        int[] iArr = new int[lIIllIlIlllIl[10]];
        iArr[lIIllIlIlllIl[4]] = lIIllIlIlllIl[11];
        iArr[lIIllIlIlllIl[12]] = lIIllIlIlllIl[13];
        iArr[lIIllIlIlllIl[14]] = lIIllIlIlllIl[15];
        this.at = iArr;
    }

    private static boolean lIllIIIIllIlIlI(int i) {
        return i == 0;
    }

    private NPC H() {
        int[] iArr = new int[lIIllIlIlllIl[12]];
        iArr[lIIllIlIlllIl[4]] = lIIllIlIlllIl[16];
        return NPCs.getNearest(iArr);
    }
}
