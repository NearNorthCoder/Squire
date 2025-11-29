package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.coords.RectangularArea;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Attacking Parasite", priority = 2147483626)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.ag  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/ag.class */
public class ag extends al {
    private static final /* synthetic */ Logger dS;
    private static /* synthetic */ String[] llllIllIlIII;
    private static /* synthetic */ int[] llllIllIlIIl;

    private static boolean lIIlIIIllIIIIll(Object obj) {
        return obj != null;
    }

    private static String lIIlIIIlIllllII(String lllllllllllllllIIlIlIllllllIIIIl, String lllllllllllllllIIlIlIllllllIIIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIllllllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIlllllIlllll = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIlIllllllIIIII.toCharArray();
        int lllllllllllllllIIlIlIlllllIlllIl = llllIllIlIIl[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllIllIlIIl[1];
        while (lIIlIIIllIIIllI(i, length)) {
            lllllllllllllllIIlIlIlllllIlllll.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIlIlllllIlllIl % charArray.length]));
            "".length();
            lllllllllllllllIIlIlIlllllIlllIl++;
            i++;
            "".length();
            if (((165 ^ 147) ^ (171 ^ 153)) <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIlIlllllIlllll);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.al
    public boolean cr() {
        WorldPoint worldLocation = this.cL.getLocalPlayer().getWorldLocation();
        if ((!lIIlIIIlIllllll(this.cM.ap()) || !lIIlIIIllIIIIII(this.cS.getId(), llllIllIlIIl[0])) && !lIIlIIIllIIIIIl(this.cM.aq() ? 1 : 0) && !lIIlIIIlIllllll(this.cM.at())) {
            NPC aX = this.cJ.aX();
            if (lIIlIIIllIIIIlI(aX)) {
                return llllIllIlIIl[1];
            }
            if (lIIlIIIllIIIIll(C0008e.ay())) {
                RectangularArea ay = C0008e.ay();
                if (lIIlIIIllIIIlII(ay.contains(aX.getWorldLocation()) ? 1 : 0) && lIIlIIIllIIIlII(ay.contains(worldLocation) ? 1 : 0)) {
                    Log.info(llllIllIlIII[llllIllIlIIl[1]]);
                    return llllIllIlIIl[1];
                } else if (lIIlIIIllIIIlII(ay.contains(aX.getWorldLocation()) ? 1 : 0) && lIIlIIIllIIIIIl(ay.contains(worldLocation) ? 1 : 0) && lIIlIIIllIIIlIl(worldLocation.distanceTo(aX), llllIllIlIIl[2])) {
                    this.ec.a(aX, (EquipmentSetup) this.cK.totemGear().selected(EquipmentSetup.class));
                    "".length();
                    return llllIllIlIIl[3];
                }
            }
            return lIIlIIIllIIIIIl(this.cK.assistantMode() ? 1 : 0) ? llllIllIlIIl[1] : x(aX);
        }
        return llllIllIlIIl[1];
    }

    private static boolean lIIlIIIllIIIlIl(int i, int i2) {
        return i <= i2;
    }

    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.al
    public EquipmentSetup cq() {
        return (EquipmentSetup) this.cK.parasiteGear().selected(EquipmentSetup.class);
    }

    private static void lIIlIIIlIlllllI() {
        llllIllIlIIl = new int[4];
        llllIllIlIIl[0] = (-(83 ^ 89)) & (-69) & 11231;
        llllIllIlIIl[1] = ((((23 + 54) - 2) + 54) ^ (((194 + 84) - 214) + 134)) & (((184 ^ 145) ^ (21 ^ 123)) ^ (-" ".length()));
        llllIllIlIIl[2] = (((94 + 74) - 149) + 122) ^ (((99 + 93) - 92) + 32);
        llllIllIlIIl[3] = " ".length();
    }

    private static boolean lIIlIIIllIIIlII(int i) {
        return i == 0;
    }

    private static void lIIlIIIlIllllIl() {
        llllIllIlIII = new String[llllIllIlIIl[3]];
        llllIllIlIII[llllIllIlIIl[1]] = lIIlIIIlIllllII("OgEeSCgAGgsLIh0ADUg5FRwLGyAAC0obIBoND0g+EU4LGixUAAUcaR0ASg4lGxkPGmkVHA8JZVQPBwxpHRpKAToaSR5G", "tnjhI");
    }

    private static boolean lIIlIIIlIllllll(int i) {
        return i > 0;
    }

    private static boolean lIIlIIIllIIIllI(int i, int i2) {
        return i < i2;
    }

    static {
        lIIlIIIlIlllllI();
        lIIlIIIlIllllIl();
        dS = LoggerFactory.getLogger(ag.class);
    }

    private static boolean lIIlIIIllIIIIIl(int i) {
        return i != 0;
    }

    @Inject
    protected ag(C0013j c0013j, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0009f c0009f) {
        super(c0013j, client, squireNightmareConfig, squireNightmarePlugin, c0009f);
    }

    private static boolean lIIlIIIllIIIIII(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIlIIIllIIIIlI(Object obj) {
        return obj == null;
    }
}
