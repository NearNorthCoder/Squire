package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Attacking Akkha (Butterfly)")
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ay  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/ay.class */
public class C0025ay extends AbstractC0016ap {
    private static /* synthetic */ int[] lIllIIllIlI;
    private /* synthetic */ int dr;
    private static /* synthetic */ String[] lIllIIllIIl;

    private static boolean lIIlIllIIlIIIl(int i, int i2) {
        return i > i2;
    }

    static {
        lIIlIllIIIllII();
        lIIlIllIIIlIll();
    }

    private static boolean lIIlIllIIIllIl(int i) {
        return i == 0;
    }

    private static boolean lIIlIllIIlIIII(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIllIIIlIlI(String llllllllllllllllIlIlIIllIllIIIlI, String llllllllllllllllIlIlIIllIlIlllII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIIllIllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIlIIllIllIIIII = new StringBuilder();
        char[] llllllllllllllllIlIlIIllIlIlllll = llllllllllllllllIlIlIIllIlIlllII.toCharArray();
        int llllllllllllllllIlIlIIllIlIllIIl = lIllIIllIlI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIllIIllIlI[0];
        while (lIIlIllIIlIIII(i, length)) {
            char llllllllllllllllIlIlIIllIllIIIll = charArray[i];
            llllllllllllllllIlIlIIllIllIIIII.append((char) (llllllllllllllllIlIlIIllIllIIIll ^ llllllllllllllllIlIlIIllIlIlllll[llllllllllllllllIlIlIIllIlIllIIl % llllllllllllllllIlIlIIllIlIlllll.length]));
            "".length();
            llllllllllllllllIlIlIIllIlIllIIl++;
            i++;
            "".length();
            if ((-" ".length()) >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIlIlIIllIllIIIII);
    }

    private static void lIIlIllIIIllII() {
        lIllIIllIlI = new int[3];
        lIllIIllIlI[0] = ((13 ^ 2) ^ (110 ^ 52)) & (((88 ^ 87) ^ (127 ^ 37)) ^ (-" ".length()));
        lIllIIllIlI[1] = " ".length();
        lIllIIllIlI[2] = "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v104, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        if (lIIlIllIIIllIl(bu() ? 1 : 0)) {
            return lIllIIllIlI[0];
        }
        if (lIIlIllIIIlllI(Players.getLocal().isMoving() ? 1 : 0)) {
            bp();
        }
        EnumC0066o bv = bv();
        if (lIIlIllIIIllll(bv)) {
            return lIllIIllIlI[0];
        }
        WorldPoint worldPoint = null;
        int i = lIllIIllIlI[0];
        do {
            if (lIIlIllIIlIIII(i, bv.M().size())) {
                if (lIIlIllIIIlllI(a(bv.M().get(i)).equals(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    worldPoint = a(bv.M().get((i + lIllIIllIlI[1]) % bv.M().size()));
                    "".length();
                    if (0 != 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    i++;
                    "".length();
                }
            }
            NPC J = J();
            if (lIIlIllIIIllIl(g(J) ? 1 : 0)) {
                WorldPoint a = bx().a(this.cu);
                String[] strArr = new String[lIllIIllIlI[1]];
                strArr[lIllIIllIlI[0]] = lIllIIllIIl[lIllIIllIlI[0]];
                J = NPCs.getNearest(a, strArr);
            }
            if (lIIlIllIIIllll(J)) {
                return lIllIIllIlI[0];
            }
            WorldPoint worldLocation = Players.getLocal().getWorldLocation();
            for (Point point : bv.N()) {
                if (lIIlIllIIIlllI(worldLocation.equals(a(point)) ? 1 : 0)) {
                    J.interact(lIllIIllIIl[lIllIIllIlI[1]]);
                }
                "".length();
                if (((((89 + 130) - 89) + 1) ^ (((112 + 111) - 201) + 113)) == (-" ".length())) {
                    return ((164 ^ 130) ^ (68 ^ 32)) & (((((110 + 78) - 142) + 82) ^ (((187 + 118) - 186) + 75)) ^ (-" ".length()));
                }
            }
            if (lIIlIllIIIllll(worldPoint) && lIIlIllIIIllIl(Players.getLocal().isMoving() ? 1 : 0)) {
                g(a(bv.M().get(lIllIIllIlI[0])));
                return lIllIIllIlI[1];
            }
            if (!lIIlIllIIlIIIl(J().getWorldArea().distanceTo(Players.getLocal()), lIllIIllIlI[2]) && !lIIlIllIIIllll(worldPoint)) {
                Movement.setDestination(worldPoint);
                return lIllIIllIlI[1];
            }
            return lIllIIllIlI[0];
        } while (((247 ^ 188) ^ (72 ^ 7)) == ((((44 + 59) - 44) + 91) ^ (((37 + 22) - 29) + 116)));
        return ((37 ^ 93) ^ (93 ^ 4)) & (((226 ^ 144) ^ (85 ^ 6)) ^ (-" ".length()));
    }

    private static void lIIlIllIIIlIll() {
        lIllIIllIIl = new String[lIllIIllIlI[2]];
        lIllIIllIIl[lIllIIllIlI[0]] = lIIlIllIIIlIIl("SABmF3PeoE4YbnPVem2tjA==", "MMFJc");
        lIllIIllIIl[lIllIIllIlI[1]] = lIIlIllIIIlIlI("KBg4GSgC", "ilLxK");
    }

    private static String lIIlIllIIIlIIl(String llllllllllllllllIlIlIIllIlllIIlI, String llllllllllllllllIlIlIIllIlllIIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIllIlllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIllIlllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIllIlI[2], llllllllllllllllIlIlIIllIlllIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIllIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIIllIlllIIll) {
            llllllllllllllllIlIlIIllIlllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllIIIllll(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIllIIIlllI(int i) {
        return i != 0;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0016ap, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return lIIlIllIIIllIl(g(J()) ? 1 : 0) ? this.cW.shadowAttackStyle() : super.br();
    }

    @Inject
    protected C0025ay(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
        this.dr = lIllIIllIlI[0];
    }
}
