package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Olm Mage Hand", priority = 20000)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aN  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aN.class */
public class aN extends aR {
    private static /* synthetic */ int[] lIlIIIlIllll;
    private static /* synthetic */ String[] lIlIIIlIlllI;
    private /* synthetic */ boolean dZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public boolean cg() {
        List<WorldPoint> dH;
        if (!llIlIllIIllIIl(ct() ? 1 : 0) && !llIlIllIIllIIl(du() ? 1 : 0)) {
            cm();
            db();
            if (llIlIllIIllIIl(this.ed.aH())) {
                dw();
                "".length();
                return lIlIIIlIllll[1];
            }
            System.out.println("Turn: " + dI() + " | " + this.ed.az() + " | direction: " + this.ed.am());
            if (llIlIllIIllIlI(dI() ? 1 : 0)) {
                System.out.println(lIlIIIlIlllI[lIlIIIlIllll[0]]);
                String k = k(lIlIIIlIllll[0]);
                if (!llIlIllIIllIlI(k.equals(lIlIIIlIlllI[lIlIIIlIllll[1]]) ? 1 : 0) || (llIlIllIIllIlI(this.ed.at() ? 1 : 0) && !llIlIllIIllIll(this.ed.aH(), dU()))) {
                    return dw();
                }
                dH = m(k);
                "".length();
                if ("   ".length() <= "  ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                "".length();
                if ((" ".length() & (" ".length() ^ (-" ".length()))) != 0) {
                    return ((249 ^ 148) ^ (143 ^ 196)) & (((((4 + 53) - (-10)) + 89) ^ (((35 + 116) - 91) + 126)) ^ (-" ".length()));
                }
            } else {
                dH = dH();
            }
            if (llIlIllIIllIIl(dH.contains(this.bS.getWorldLocation()) ? 1 : 0)) {
                WorldPoint orElse = dH.stream().filter(worldPoint -> {
                    if (llIlIllIIllIlI(Reachable.isWalkable(worldPoint) ? 1 : 0) && llIlIllIIllIIl(this.ed.ap().contains(worldPoint) ? 1 : 0)) {
                        ?? r0 = lIlIIIlIllll[1];
                        "".length();
                        return ((((60 + 0) - 42) + 118) ^ (((44 + 73) - 110) + 133)) <= "   ".length() ? ((((213 + 172) - 292) + 128) ^ (((71 + 79) - 127) + 136)) & (((156 ^ 180) ^ (173 ^ 199)) ^ (-" ".length())) : r0;
                    }
                    return lIlIIIlIllll[0];
                }).min(Comparator.comparingDouble(worldPoint2 -> {
                    return worldPoint2.distanceTo2DHypotenuse(this.bS.getWorldLocation());
                })).orElse(null);
                if (llIlIllIIlllII(Movement.getDestination()) && llIlIllIIllIlI(Movement.getDestination().equals(orElse) ? 1 : 0)) {
                    return lIlIIIlIllll[0];
                }
                Movement.setDestination(orElse);
                return lIlIIIlIllll[1];
            }
            return lIlIIIlIllll[0];
        }
        return lIlIIIlIllll[0];
    }

    private static boolean llIlIllIIlllll(int i, int i2) {
        return i < i2;
    }

    private static String llIlIllIIlIllI(String lllllllllllllllIlllIIIIIlIIlIIll, String lllllllllllllllIlllIIIIIlIIlIIlI) {
        String lllllllllllllllIlllIIIIIlIIlIIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIIIIlIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIIIIlIIlIIIl = new StringBuilder();
        char[] charArray = lllllllllllllllIlllIIIIIlIIlIIlI.toCharArray();
        int lllllllllllllllIlllIIIIIlIIIllll = lIlIIIlIllll[0];
        char[] charArray2 = lllllllllllllllIlllIIIIIlIIlIIll2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIIlIllll[0];
        while (llIlIllIIlllll(i, length)) {
            char lllllllllllllllIlllIIIIIlIIlIlII = charArray2[i];
            lllllllllllllllIlllIIIIIlIIlIIIl.append((char) (lllllllllllllllIlllIIIIIlIIlIlII ^ charArray[lllllllllllllllIlllIIIIIlIIIllll % charArray.length]));
            "".length();
            lllllllllllllllIlllIIIIIlIIIllll++;
            i++;
            "".length();
            if ((172 ^ 168) < (108 ^ 104)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlllIIIIIlIIlIIIl);
    }

    private static boolean llIlIllIIlllII(Object obj) {
        return obj != null;
    }

    private static boolean llIlIllIIlllIl(Object obj) {
        return obj == null;
    }

    private static boolean llIlIllIIllIlI(int i) {
        return i != 0;
    }

    private static boolean llIlIllIIllIIl(int i) {
        return i == 0;
    }

    private static String llIlIllIIlIlIl(String lllllllllllllllIlllIIIIIIllllllI, String lllllllllllllllIlllIIIIIIlllllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIIIIIlllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIlIllll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIIIIIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIIIIIlllllll) {
            lllllllllllllllIlllIIIIIIlllllll.printStackTrace();
            return null;
        }
    }

    static {
        llIlIllIIllIII();
        llIlIllIIlIlll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Inject
    protected aN(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.dZ = lIlIIIlIllll[0];
    }

    private static boolean llIlIllIIllIll(int i, int i2) {
        return i >= i2;
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public List<Prayer> ci() {
        ArrayList arrayList = new ArrayList();
        Prayer aE = this.ed.aE();
        if (llIlIllIIlllIl(aE)) {
            aE = Prayer.PROTECT_FROM_MAGIC;
        }
        List offensive = Prayers.getOffensive();
        arrayList.add(aE);
        "".length();
        arrayList.addAll(offensive);
        "".length();
        return arrayList;
    }

    private static void llIlIllIIllIII() {
        lIlIIIlIllll = new int[3];
        lIlIIIlIllll[0] = (209 ^ 149) & ((84 ^ 16) ^ (-1));
        lIlIIIlIllll[1] = " ".length();
        lIlIIIlIllll[2] = "  ".length();
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public EquipmentSetup cj() {
        return this.ea.P();
    }

    private static boolean llIlIllIIllllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    public void db() {
        if (llIlIllIIllIlI(cj().isFullyEquipped() ? 1 : 0) && llIlIllIIllllI(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
    }

    private static void llIlIllIIlIlll() {
        lIlIIIlIlllI = new String[lIlIIIlIllll[2]];
        lIlIIIlIlllI[lIlIIIlIllll[0]] = llIlIllIIlIlIl("mMroPgC96I+Hj+12C6R0OVC4lGvrnnsb", "fxxNL");
        lIlIIIlIlllI[lIlIIIlIllll[1]] = llIlIllIIlIllI("AD4kHRY=", "RwcUB");
    }
}
