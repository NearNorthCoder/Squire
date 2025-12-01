package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Gear;
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aR  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aR.class */
public abstract class aR extends Task {
    private static /* synthetic */ int[] lIlIlIllIlIl;
    protected /* synthetic */ Player bS;
    protected final /* synthetic */ SquireChambersConfig eb;
    protected final /* synthetic */ C0034i ed;
    protected final /* synthetic */ Client ec;
    protected final /* synthetic */ SquireChambersPlugin ea;
    private static /* synthetic */ String[] lIlIlIlIllII;

    /* JADX INFO: Access modifiers changed from: protected */
    @Inject
    public aR(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        this.ea = squireChambersPlugin;
        this.eb = squireChambersConfig;
        this.ec = client;
        this.ed = squireChambersPlugin.y();
    }

    protected WorldArea dC() {
        return new WorldArea(dx().dx(lIlIlIllIlIl[9]).dy(lIlIlIllIlIl[2]), lIlIlIllIlIl[10], lIlIlIllIlIl[10]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<WorldPoint> m(String str) {
        return l(str);
    }

    public abstract boolean cg();

    /* JADX INFO: Access modifiers changed from: protected */
    public void cm() {
        EquipmentSetup cj = cj();
        if (llIllllIllIIIl(cj) || llIllllIlIllll(cj.isEquipped() ? 1 : 0)) {
            return;
        }
        Gear.swapTo(cj);
        "".length();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean dt() {
        NPC nearest = NPCs.getNearest(npc -> {
            if (llIllllIlIllll(npc.getName().contains(lIlIlIlIllII[lIlIlIllIlIl[27]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIlIllIlIl[2]];
                strArr[lIlIlIllIlIl[0]] = lIlIlIlIllII[lIlIlIllIlIl[28]];
                if (llIllllIlIllll(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIlIllIlIl[2];
                    "".length();
                    return " ".length() >= "  ".length() ? ((((148 + 146) - 201) + 105) ^ (((83 + 85) - 40) + 1)) & (((48 ^ 59) ^ (11 ^ 71)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIlIllIlIl[0];
        });
        if (llIllllIllIIIl(nearest)) {
            System.out.println(lIlIlIlIllII[lIlIlIllIlIl[4]]);
            return lIlIlIllIlIl[0];
        }
        nearest.interact(lIlIlIlIllII[lIlIlIllIlIl[5]]);
        return lIlIlIllIlIl[2];
    }

    private static boolean llIllllIllIlll(int i, int i2) {
        return i < i2;
    }

    protected List<WorldPoint> l(String str) {
        if (llIllllIllIIIl(this.ed.ax())) {
            return null;
        }
        boolean dG = dG();
        int i = lIlIlIllIlIl[3];
        switch (str.hashCode()) {
            case -2021012075:
                if (llIllllIlIllll(str.equals(lIlIlIlIllII[lIlIlIllIlIl[13]]) ? 1 : 0)) {
                    i = lIlIlIllIlIl[0];
                    "".length();
                    if (" ".length() <= 0) {
                        return null;
                    }
                }
                break;
            case -1691410980:
                if (llIllllIlIllll(str.equals(lIlIlIlIllII[lIlIlIllIlIl[15]]) ? 1 : 0)) {
                    i = lIlIlIllIlIl[4];
                    "".length();
                    if (0 != 0) {
                        return null;
                    }
                }
                break;
            case 2332679:
                if (llIllllIlIllll(str.equals(lIlIlIlIllII[lIlIlIllIlIl[14]]) ? 1 : 0)) {
                    i = lIlIlIllIlIl[2];
                    "".length();
                    if (" ".length() != " ".length()) {
                        return null;
                    }
                }
                break;
            case 77974012:
                if (llIllllIlIllll(str.equals(lIlIlIlIllII[lIlIlIllIlIl[10]]) ? 1 : 0)) {
                    i = lIlIlIllIlIl[5];
                    break;
                }
                break;
        }
        switch (i) {
            case 0:
                if (llIllllIlIllll(dC().contains(this.bS) ? 1 : 0)) {
                    return dB().toWorldPointList();
                }
                List<WorldPoint> worldPointList = dD().toWorldPointList();
                worldPointList.addAll(dB().toWorldPointList());
                "".length();
                return worldPointList;
            case 1:
                return llIllllIlIllll(dG ? 1 : 0) ? dC().toWorldPointList() : dE().toWorldPointList();
            case 2:
                return llIllllIllIIII(dG ? 1 : 0) ? dB().toWorldPointList() : dD().toWorldPointList();
            case 3:
                return llIllllIllIIII(dG ? 1 : 0) ? dC().toWorldPointList() : dE().toWorldPointList();
            default:
                System.out.println("Direction:" + str);
                System.out.println(lIlIlIlIllII[lIlIlIllIlIl[16]]);
                return null;
        }
    }

    private static boolean llIllllIllIllI(int i, int i2) {
        return i != i2;
    }

    private static boolean llIllllIllIIII(int i) {
        return i == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean dv() {
        if ((!llIllllIllIIII(this.ed.at() ? 1 : 0) || llIllllIlIllll(this.ea.z().aL() ? 1 : 0)) && llIllllIllIIlI(Combat.getSpecEnergy(), lIlIlIllIlIl[6])) {
            ?? r0 = lIlIlIllIlIl[2];
            "".length();
            return "   ".length() <= " ".length() ? ((((25 + 125) - 75) + 69) ^ (((4 + 41) - (-131)) + 18)) & (((((218 + 183) - 225) + 44) ^ (((86 + 95) - 66) + 27)) ^ (-" ".length())) : r0;
        }
        return lIlIlIllIlIl[0];
    }

    protected WorldPoint dO() {
        return dx().dx(lIlIlIllIlIl[22]).dy(lIlIlIllIlIl[18]);
    }

    private static boolean llIllllIlIllll(int i) {
        return i != 0;
    }

    public abstract List<Prayer> ci();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean ds() {
        if (llIllllIllIIIl(NPCs.getNearest(npc -> {
            if (llIllllIlIllll(npc.getName().contains(lIlIlIlIllII[lIlIlIllIlIl[29]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIlIllIlIl[2]];
                strArr[lIlIlIllIlIl[0]] = lIlIlIlIllII[lIlIlIllIlIl[30]];
                if (llIllllIlIllll(npc.hasAction(strArr) ? 1 : 0) && llIllllIllIIII(npc.isDead() ? 1 : 0)) {
                    ?? r0 = lIlIlIllIlIl[2];
                    "".length();
                    return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIlIllIlIl[0];
        }))) {
            return lIlIlIllIlIl[0];
        }
        if (llIllllIlIllll(this.ed.at() ? 1 : 0)) {
            if (llIllllIllIlIl(this.ed.aG(), dV()) && llIllllIllIllI(this.ed.aG(), lIlIlIllIlIl[3]) && (!llIllllIllIlll(this.ed.aH(), dU()) || !llIllllIllIllI(this.ed.aH(), lIlIlIllIlIl[3]))) {
                return lIlIlIllIlIl[0];
            }
            ?? r0 = lIlIlIllIlIl[2];
            "".length();
            return ((64 ^ 1) & ((31 ^ 94) ^ (-1))) >= (31 ^ 27) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIlIllIlIl[2];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public WorldPoint dK() {
        int i;
        if (llIllllIlIllll(dG() ? 1 : 0)) {
            i = lIlIlIllIlIl[2];
            "".length();
            if ((((67 ^ 82) ^ (136 ^ 166)) & (((0 ^ 45) ^ (180 ^ 166)) ^ (-" ".length()))) != 0) {
                return null;
            }
        } else {
            i = lIlIlIllIlIl[3];
        }
        int i2 = i;
        return llIllllIlIllll(dG() ? 1 : 0) ? dJ().dx(i2 * lIlIlIllIlIl[0]).dy(i2 * lIlIlIllIlIl[1]) : dJ().dx(i2 * lIlIlIllIlIl[0]).dy(i2 * lIlIlIllIlIl[7]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String k(boolean z) {
        if (llIllllIllIIIl(this.ed.ax())) {
            return null;
        }
        boolean dG = dG();
        if (llIllllIlIllll(dB().contains(this.bS) ? 1 : 0)) {
            return llIllllIlIllll(dG ? 1 : 0) ? lIlIlIlIllII[lIlIlIllIlIl[12]] : lIlIlIlIllII[lIlIlIllIlIl[17]];
        } else if (llIllllIlIllll(dD().contains(this.bS) ? 1 : 0)) {
            return llIllllIllIIII(dG ? 1 : 0) ? lIlIlIlIllII[lIlIlIllIlIl[18]] : lIlIlIlIllII[lIlIlIllIlIl[19]];
        } else {
            if (llIllllIlIllll(z ? 1 : 0)) {
                if (llIllllIlIllll(dG ? 1 : 0) && llIllllIlIllll(dC().contains(this.bS) ? 1 : 0)) {
                    return lIlIlIlIllII[lIlIlIllIlIl[20]];
                }
                if (llIllllIllIIII(dG ? 1 : 0) && llIllllIlIllll(dE().contains(this.bS) ? 1 : 0)) {
                    return lIlIlIlIllII[lIlIlIllIlIl[11]];
                }
            }
            return lIlIlIlIllII[lIlIlIllIlIl[21]];
        }
    }

    private static boolean llIllllIllIIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    public boolean ct() {
        if (llIllllIllIIll(C0046u.bh(), EnumC0048w.GET_OUT)) {
            return lIlIlIllIlIl[0];
        }
        TileObject dq = dq();
        if (llIllllIllIIIl(dq)) {
            return lIlIlIllIlIl[0];
        }
        Player local = Players.getLocal();
        if (!llIllllIllIIIl(local) && llIllllIllIlII(local.getWorldY(), dq.getWorldY())) {
            ?? r0 = lIlIlIllIlIl[2];
            "".length();
            return 0 != 0 ? ((246 ^ 188) ^ (172 ^ 176)) & (((32 ^ 31) ^ (217 ^ 176)) ^ (-" ".length())) : r0;
        }
        return lIlIlIllIlIl[0];
    }

    protected WorldArea dF() {
        return new WorldArea(dx().dx(lIlIlIllIlIl[9]).dy(lIlIlIllIlIl[10]), lIlIlIllIlIl[10], lIlIlIllIlIl[4]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public WorldPoint dJ() {
        return llIllllIlIllll(dG() ? 1 : 0) ? dO() : dM();
    }

    protected WorldPoint dM() {
        return dx().dx(lIlIlIllIlIl[1]).dy(lIlIlIllIlIl[14]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean du() {
        if (llIllllIllIIIl(NPCs.getNearest(npc -> {
            if (llIllllIlIllll(npc.getName().contains(lIlIlIlIllII[lIlIlIllIlIl[25]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIlIllIlIl[2]];
                strArr[lIlIlIllIlIl[0]] = lIlIlIlIllII[lIlIlIllIlIl[26]];
                if (llIllllIlIllll(npc.hasAction(strArr) ? 1 : 0) && llIllllIllIIII(npc.isDead() ? 1 : 0)) {
                    ?? r0 = lIlIlIllIlIl[2];
                    "".length();
                    return " ".length() > "  ".length() ? ((((100 + 59) - 123) + 163) ^ (((40 + 156) - 22) + 18)) & (((244 ^ 175) ^ (25 ^ 69)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIlIllIlIl[0];
        }))) {
            return lIlIlIllIlIl[0];
        }
        if (llIllllIlIllll(this.ed.at() ? 1 : 0)) {
            if (llIllllIllIlll(this.ed.aH(), dU()) && llIllllIllIllI(this.ed.aH(), lIlIlIllIlIl[3])) {
                if (llIllllIllIIII(this.ed.aG())) {
                    ?? r0 = lIlIlIllIlIl[2];
                    "".length();
                    return ((130 ^ 190) ^ (182 ^ 142)) < (((((149 + 4) - 68) + 163) ^ (((80 + 21) - 41) + 121)) & (((85 ^ 27) ^ "   ".length()) ^ (-" ".length()))) ? ((72 ^ 60) ^ (7 ^ 110)) & (((((18 + 113) - 13) + 48) ^ (((63 + 5) - 56) + 175)) ^ (-" ".length())) : r0;
                }
                return lIlIlIllIlIl[0];
            } else if (llIllllIllIllI(this.ed.aG(), lIlIlIllIlIl[3]) && llIllllIllIlIl(this.ed.aG(), dV())) {
                ?? r02 = lIlIlIllIlIl[2];
                "".length();
                return (-" ".length()) == " ".length() ? ((30 ^ 36) ^ (71 ^ 102)) & (((62 ^ 1) ^ (168 ^ 140)) ^ (-" ".length())) : r02;
            } else {
                return lIlIlIllIlIl[0];
            }
        }
        return lIlIlIllIlIl[2];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public WorldPoint dN() {
        return dx().dx(lIlIlIllIlIl[1]).dy(lIlIlIllIlIl[7]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean dI() {
        return (llIllllIlIllll(dH().contains(this.bS.getWorldLocation()) ? 1 : 0) && llIllllIlllIII(this.ed.az(), lIlIlIllIlIl[2])) ? lIlIlIllIlIl[2] : lIlIlIllIlIl[0];
    }

    private static boolean llIllllIllIlII(int i, int i2) {
        return i > i2;
    }

    protected WorldArea dR() {
        return llIllllIlIllll(dG() ? 1 : 0) ? dB() : dD();
    }

    protected WorldPoint dz() {
        return dx().dx(lIlIlIllIlIl[8]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public WorldArea dQ() {
        return llIllllIlIllll(dG() ? 1 : 0) ? dC() : dE();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public WorldArea dT() {
        return llIllllIlIllll(dG() ? 1 : 0) ? dD() : dB();
    }

    private static void llIllllIlIllIl() {
        lIlIlIlIllII = new String[lIlIlIllIlIl[35]];
        lIlIlIlIllII[lIlIlIllIlIl[0]] = llIllllIIlIlII("KseFWQfFxdcRvUsiCmZveskSHepZ7L8d", "OMIjV");
        lIlIlIlIllII[lIlIlIllIlIl[2]] = llIllllIIlIlIl("FjEGEAc8", "WErqd");
        lIlIlIlIllII[lIlIlIllIlIl[4]] = llIllllIIlIlII("4OhU16vaFuWzdQsuK/x2QlcBrK2n2uPN", "IpDiY");
        lIlIlIlIllII[lIlIlIllIlIl[5]] = llIllllIIlIlII("8aKe5fSySX4=", "HcdkK");
        lIlIlIlIllII[lIlIlIllIlIl[1]] = llIllllIIlIlIl("Gww2OmUeBDYqZRwIKyc3HQl4IDUb", "xmXNE");
        lIlIlIlIllII[lIlIlIllIlIl[7]] = llIllllIIlIllI("TptkLcoabHnsepf3T543fIoFI42UdSlZ", "qsRrw");
        lIlIlIlIllII[lIlIlIllIlIl[8]] = llIllllIIlIlII("zU22SYWWab8=", "kecnc");
        lIlIlIlIllII[lIlIlIllIlIl[13]] = llIllllIIlIlII("eQKUYv4zDzk=", "msYsj");
        lIlIlIlIllII[lIlIlIllIlIl[14]] = llIllllIIlIllI("CY1E4i6jWgw=", "MAgWi");
        lIlIlIlIllII[lIlIlIllIlIl[15]] = llIllllIIlIllI("OZkOph/qXjUhkb8X3ifjUQ==", "UxjtN");
        lIlIlIlIllII[lIlIlIllIlIl[10]] = llIllllIIlIlII("RCOADR2xjbo=", "hEqUH");
        lIlIlIlIllII[lIlIlIllIlIl[16]] = llIllllIIlIlIl("Ox06JgcgGzkkcz8XOTdzPwA4LRRJc1Y=", "hRwcS");
        lIlIlIlIllII[lIlIlIllIlIl[12]] = llIllllIIlIlII("rg39WCGAzJc=", "LqGAT");
        lIlIlIlIllII[lIlIlIllIlIl[17]] = llIllllIIlIlII("5DwNefVk81M=", "uLyzm");
        lIlIlIlIllII[lIlIlIllIlIl[18]] = llIllllIIlIlIl("Hi0EGjY=", "LdCRb");
        lIlIlIlIllII[lIlIlIllIlIl[19]] = llIllllIIlIlIl("BSc/JQ==", "IbyqO");
        lIlIlIlIllII[lIlIlIllIlIl[20]] = llIllllIIlIlII("+pn7p0X/hr4=", "ZPuIO");
        lIlIlIlIllII[lIlIlIllIlIl[11]] = llIllllIIlIlII("2kT+NIwd3x8=", "FEKLB");
        lIlIlIlIllII[lIlIlIllIlIl[21]] = llIllllIIlIlIl("KBoTCy0g", "eSWOa");
        lIlIlIlIllII[lIlIlIllIlIl[23]] = llIllllIIlIlII("Enbm3NJMKFSLMRdwQKYO5Q==", "KDSng");
        lIlIlIlIllII[lIlIlIllIlIl[24]] = llIllllIIlIllI("1tierGS2NNg=", "JAbvM");
        lIlIlIlIllII[lIlIlIllIlIl[25]] = llIllllIIlIllI("ZG0dJLDJ4ZfX76s66cXr7A==", "MUckR");
        lIlIlIlIllII[lIlIlIllIlIl[26]] = llIllllIIlIlIl("BwYBEhIt", "Frusq");
        lIlIlIlIllII[lIlIlIllIlIl[27]] = llIllllIIlIlII("UGRScIwXgWeY6LeZ28xzXQ==", "ETYAf");
        lIlIlIlIllII[lIlIlIllIlIl[28]] = llIllllIIlIlII("+KEVoRJA7+A=", "vUPMH");
        lIlIlIlIllII[lIlIlIllIlIl[29]] = llIllllIIlIlIl("CgEQGWIlCBca", "FdvmB");
        lIlIlIlIllII[lIlIlIllIlIl[30]] = llIllllIIlIllI("biR3ME3+98s=", "LgOOY");
        lIlIlIlIllII[lIlIlIllIlIl[31]] = llIllllIIlIlIl("FDoyNj1zBzs6", "SHWWI");
        lIlIlIlIllII[lIlIlIllIlIl[32]] = llIllllIIlIlII("q8bNrkQWFJU=", "qlCJs");
        lIlIlIlIllII[lIlIlIllIlIl[33]] = llIllllIIlIllI("WfmBBHSHPwEBeY8NzW8YenKbr25wkHeA", "lERGm");
        lIlIlIlIllII[lIlIlIllIlIl[34]] = llIllllIIlIlII("eqoVtdS7q7DLLtacnxWvyw==", "cJpLT");
    }

    protected WorldArea dD() {
        return new WorldArea(dx().dx(lIlIlIllIlIl[9]).dy(lIlIlIllIlIl[11]), lIlIlIllIlIl[10], lIlIlIllIlIl[7]);
    }

    private static boolean llIllllIllIlIl(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    public boolean run() {
        if (!llIllllIlIllll(this.eb.pause() ? 1 : 0) && !llIllllIllIIII(this.ec.isInInstancedRegion() ? 1 : 0)) {
            this.bS = Players.getLocal();
            return llIllllIllIIIl(this.bS) ? lIlIlIllIlIl[0] : (!llIllllIllIIlI(C0046u.bg(), lIlIlIllIlIl[1]) || llIllllIlIllll(this.bS.getPlane())) ? lIlIlIllIlIl[0] : cg();
        }
        return lIlIlIllIlIl[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int dU() {
        return this.eb.mageThreshold();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean dw() {
        NPC nearest = NPCs.getNearest(npc -> {
            if (llIllllIlIllll(npc.getName().contains(lIlIlIlIllII[lIlIlIllIlIl[23]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIlIllIlIl[2]];
                strArr[lIlIlIllIlIl[0]] = lIlIlIlIllII[lIlIlIllIlIl[24]];
                if (llIllllIlIllll(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIlIllIlIl[2];
                    "".length();
                    return 0 != 0 ? ((54 ^ 37) ^ (110 ^ 97)) & (((((88 + 71) - 34) + 9) ^ (((108 + 136) - 194) + 104)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIlIllIlIl[0];
        });
        if (llIllllIllIIIl(nearest)) {
            System.out.println(lIlIlIlIllII[lIlIlIllIlIl[1]]);
            return lIlIlIllIlIl[0];
        }
        System.out.println(lIlIlIlIllII[lIlIlIllIlIl[7]]);
        nearest.interact(lIlIlIlIllII[lIlIlIllIlIl[8]]);
        return lIlIlIllIlIl[2];
    }

    protected WorldPoint dy() {
        return dx().dx(lIlIlIllIlIl[8]);
    }

    static {
        llIllllIlIlllI();
        llIllllIlIllIl();
    }

    protected WorldArea dB() {
        return new WorldArea(dx().dx(lIlIlIllIlIl[9]).dy(lIlIlIllIlIl[2]), lIlIlIllIlIl[10], lIlIlIllIlIl[7]);
    }

    public abstract EquipmentSetup cj();

    private static void llIllllIlIlllI() {
        lIlIlIllIlIl = new int[36];
        lIlIlIllIlIl[0] = ((113 ^ 100) ^ (178 ^ 188)) & (((((197 + 170) - 152) + 7) ^ (((39 + 19) - 2) + 141)) ^ (-" ".length()));
        lIlIlIllIlIl[1] = (((51 + 53) - 4) + 30) ^ (((29 + 66) - (-14)) + 25);
        lIlIlIllIlIl[2] = " ".length();
        lIlIlIllIlIl[3] = -" ".length();
        lIlIlIllIlIl[4] = "  ".length();
        lIlIlIllIlIl[5] = "   ".length();
        lIlIlIllIlIl[6] = (((132 + 7) - 27) + 32) ^ (((126 + 156) - 225) + 105);
        lIlIlIllIlIl[7] = 11 ^ 14;
        lIlIlIllIlIl[8] = (((121 + 167) - 120) + 29) ^ (((191 + 17) - 44) + 31);
        lIlIlIllIlIl[9] = -(17 ^ 21);
        lIlIlIllIlIl[10] = ((138 ^ 131) & ((97 ^ 104) ^ (-1))) ^ (141 ^ 135);
        lIlIlIllIlIl[11] = 164 ^ 181;
        lIlIlIllIlIl[12] = 4 ^ 8;
        lIlIlIllIlIl[13] = 114 ^ 117;
        lIlIlIllIlIl[14] = 92 ^ 84;
        lIlIlIllIlIl[15] = (((75 + 50) - 101) + 183) ^ (((112 + 197) - 151) + 40);
        lIlIlIllIlIl[16] = 166 ^ 173;
        lIlIlIllIlIl[17] = 117 ^ 120;
        lIlIlIllIlIl[18] = 116 ^ 122;
        lIlIlIllIlIl[19] = (201 ^ 173) ^ (105 ^ 2);
        lIlIlIllIlIl[20] = 107 ^ 123;
        lIlIlIllIlIl[21] = (((9 + 7) - (-114)) + 28) ^ (((105 + 53) - 126) + 108);
        lIlIlIllIlIl[22] = -"   ".length();
        lIlIlIllIlIl[23] = 139 ^ 152;
        lIlIlIllIlIl[24] = 93 ^ 73;
        lIlIlIllIlIl[25] = 181 ^ 160;
        lIlIlIllIlIl[26] = 155 ^ 141;
        lIlIlIllIlIl[27] = 108 ^ 123;
        lIlIlIllIlIl[28] = 28 ^ 4;
        lIlIlIllIlIl[29] = (223 ^ 161) ^ (66 ^ 37);
        lIlIlIllIlIl[30] = 147 ^ 137;
        lIlIlIllIlIl[31] = 176 ^ 171;
        lIlIlIllIlIl[32] = 183 ^ 171;
        lIlIlIllIlIl[33] = 111 ^ 114;
        lIlIlIllIlIl[34] = (195 ^ 156) ^ (246 ^ 183);
        lIlIlIllIlIl[35] = 14 ^ 17;
    }

    private static String llIllllIIlIlIl(String lllllllllllllllIllIIlllIlIIIIIll, String lllllllllllllllIllIIlllIlIIIIIlI) {
        String lllllllllllllllIllIIlllIlIIIIIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIIlllIlIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIllIIlllIlIIIIIII = lllllllllllllllIllIIlllIlIIIIIlI.toCharArray();
        int lllllllllllllllIllIIlllIIlllllll = lIlIlIllIlIl[0];
        char[] charArray = lllllllllllllllIllIIlllIlIIIIIll2.toCharArray();
        int length = charArray.length;
        int i = lIlIlIllIlIl[0];
        while (llIllllIllIlll(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIllIIlllIlIIIIIII[lllllllllllllllIllIIlllIIlllllll % lllllllllllllllIllIIlllIlIIIIIII.length]));
            "".length();
            lllllllllllllllIllIIlllIIlllllll++;
            i++;
            "".length();
            if ("   ".length() == (((28 ^ 74) ^ (247 ^ 192)) & (((((107 + 118) - 152) + 164) ^ (((126 + 125) - 206) + 95)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TileObject dq() {
        return TileObjects.getNearest(tileObject -> {
            if (llIllllIlIllll(tileObject.getName().contains(lIlIlIlIllII[lIlIlIllIlIl[33]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIlIllIlIl[2]];
                strArr[lIlIlIllIlIl[0]] = lIlIlIlIllII[lIlIlIllIlIl[34]];
                if (llIllllIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIlIllIlIl[2];
                    "".length();
                    return (-" ".length()) < (-" ".length()) ? ((((156 + 2) - (-36)) + 55) ^ (((123 + 33) - 39) + 64)) & (((25 ^ 95) ^ (173 ^ 167)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIlIllIlIl[0];
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean dr() {
        NPC nearest = NPCs.getNearest(npc -> {
            if (llIllllIlIllll(npc.getName().equals(lIlIlIlIllII[lIlIlIllIlIl[31]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIlIllIlIl[2]];
                strArr[lIlIlIllIlIl[0]] = lIlIlIlIllII[lIlIlIllIlIl[32]];
                if (llIllllIlIllll(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIlIllIlIl[2];
                    "".length();
                    return (-"  ".length()) > 0 ? ((225 ^ 171) ^ (1 ^ 24)) & (((107 ^ 41) ^ (99 ^ 114)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIlIllIlIl[0];
        });
        if (llIllllIllIIIl(nearest)) {
            System.out.println(lIlIlIlIllII[lIlIlIllIlIl[0]]);
            return lIlIlIllIlIl[0];
        }
        nearest.interact(lIlIlIlIllII[lIlIlIllIlIl[2]]);
        return lIlIlIllIlIl[2];
    }

    protected WorldPoint dx() {
        return dq().getWorldLocation();
    }

    protected WorldPoint dA() {
        return dx().dx(lIlIlIllIlIl[8]);
    }

    protected WorldArea dE() {
        return new WorldArea(dx().dx(lIlIlIllIlIl[9]).dy(lIlIlIllIlIl[12]), lIlIlIllIlIl[10], lIlIlIllIlIl[10]);
    }

    private static String llIllllIIlIllI(String lllllllllllllllIllIIlllIIllIIIIl, String lllllllllllllllIllIIlllIIllIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlllIIllIIIII.getBytes(StandardCharsets.UTF_8)), lIlIlIllIlIl[14]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIllIlIl[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlllIIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlllIIlIlllIl) {
            lllllllllllllllIllIIlllIIlIlllIl.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public WorldPoint dL() {
        int i;
        if (llIllllIlIllll(dG() ? 1 : 0)) {
            i = lIlIlIllIlIl[2];
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        } else {
            i = lIlIlIllIlIl[3];
        }
        int i2 = i;
        return dJ().dx(i2 * lIlIlIllIlIl[0]).dy(i2 * lIlIlIllIlIl[5]);
    }

    protected WorldArea dS() {
        return llIllllIlIllll(dG() ? 1 : 0) ? dE() : dC();
    }

    private static boolean llIllllIlllIII(int i, int i2) {
        return i == i2;
    }

    private static String llIllllIIlIlII(String lllllllllllllllIllIIlllIIllIlllI, String lllllllllllllllIllIIlllIIllIllIl) {
        try {
            SecretKeySpec lllllllllllllllIllIIlllIIlllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlllIIllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIllIlIl[4], lllllllllllllllIllIIlllIIlllIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlllIIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlllIIllIllll) {
            lllllllllllllllIllIIlllIIllIllll.printStackTrace();
            return null;
        }
    }

    protected int dV() {
        return this.eb.meleeThreshold();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    protected boolean dG() {
        if (llIllllIllIlll(this.ed.ax().getWorldX(), this.bS.getWorldX())) {
            ?? r0 = lIlIlIllIlIl[2];
            "".length();
            return ((23 ^ 12) ^ (148 ^ 139)) < ((223 ^ 181) ^ (56 ^ 86)) ? ((140 ^ 158) ^ (137 ^ 169)) & (((((118 + 68) - 56) + 60) ^ (((124 + 121) - 162) + 57)) ^ (-" ".length())) : r0;
        }
        return lIlIlIllIlIl[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<WorldPoint> dH() {
        if (llIllllIllIIIl(this.ed.ax())) {
            return null;
        }
        return l(this.ed.am());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public WorldPoint dP() {
        return dx().dx(lIlIlIllIlIl[22]).dy(lIlIlIllIlIl[11]);
    }

    private static boolean llIllllIllIIIl(Object obj) {
        return obj == null;
    }

    private static boolean llIllllIllIIlI(int i, int i2) {
        return i >= i2;
    }
}
