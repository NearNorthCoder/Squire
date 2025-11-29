package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
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
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
@TaskDesc(name = "Start room", priority = 10000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aX  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aX.class */
public class aX extends U {
    private /* synthetic */ int am;
    private static /* synthetic */ int[] lIlIlIllIlII;
    private static /* synthetic */ String[] lIlIlIllIIll;
    private /* synthetic */ C0039n ak;
    private /* synthetic */ C0039n al;

    static {
        llIllllIlIlIII();
        llIllllIlIIlll();
    }

    private static String llIllllIlIIlIl(String lllllllllllllllIllIIllllIIIIIIII, String lllllllllllllllIllIIlllIllllllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlllIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIllllIIIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIllllIIIIIIlI.init(lIlIlIllIlII[3], secretKeySpec);
            return new String(lllllllllllllllIllIIllllIIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIllllIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIllllIIIIIIIl) {
            lllllllllllllllIllIIllllIIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static void llIllllIlIlIII() {
        lIlIlIllIlII = new int[6];
        lIlIlIllIlII[0] = -" ".length();
        lIlIlIllIlII[1] = " ".length();
        lIlIlIllIlII[2] = (124 ^ 78) & ((152 ^ 170) ^ (-1));
        lIlIlIllIlII[3] = "  ".length();
        lIlIlIllIlII[4] = "   ".length();
        lIlIlIllIlII[5] = (94 ^ 23) ^ (244 ^ 181);
    }

    @Inject
    protected aX(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIlIllIlII[0];
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public EquipmentSetup cj() {
        return null;
    }

    private static boolean llIllllIlIlIll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean ch() {
        if (llIllllIlIlIlI(C0046u.bf() ? 1 : 0)) {
            return lIlIlIllIlII[2];
        }
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (llIllllIlIllII(this.ak.bw, N.START)) {
            ?? r0 = lIlIlIllIlII[1];
            "".length();
            return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIlIllIlII[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean cg() {
        if (llIllllIlIlIIl(Reachable.isWalkable(this.ak.bt) ? 1 : 0)) {
            Movement.setDestination(this.al.bs);
            return lIlIlIllIlII[1];
        }
        if (llIllllIlIlIlI(Tabs.isOpen(Tab.INVENTORY) ? 1 : 0)) {
            Tabs.open(Tab.INVENTORY);
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (llIllllIlIlIIl(tileObject.getName().equals(lIlIlIllIIll[lIlIlIllIlII[1]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIlIllIlII[1]];
                strArr[lIlIlIllIlII[2]] = lIlIlIllIIll[lIlIlIllIlII[3]];
                if (llIllllIlIlIIl(tileObject.hasAction(strArr) ? 1 : 0) && llIllllIlIlIIl(this.ak.a((Locatable) tileObject) ? 1 : 0)) {
                    ?? r0 = lIlIlIllIlII[1];
                    "".length();
                    return ((237 ^ 195) & ((48 ^ 30) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlIlIllIlII[2];
        });
        if (llIllllIlIlIll(nearest)) {
            return lIlIlIllIlII[2];
        }
        nearest.interact(lIlIlIllIIll[lIlIlIllIlII[2]]);
        return lIlIlIllIlII[1];
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public List<Prayer> ci() {
        return null;
    }

    private static boolean llIllllIlIlIIl(int i) {
        return i != 0;
    }

    private static void llIllllIlIIlll() {
        lIlIlIllIIll = new String[lIlIlIllIlII[4]];
        lIlIlIllIIll[lIlIlIllIlII[2]] = llIllllIlIIlIl("mDmHPPObbSo=", "hdhVm");
        lIlIlIllIIll[lIlIlIllIlII[1]] = llIllllIlIIllI("etjQwSgc874=", "XeSbu");
        lIlIlIllIIll[lIlIlIllIlII[3]] = llIllllIlIIlIl("e4D0Lxb40EA=", "LSGyX");
    }

    private static boolean llIllllIlIlIlI(int i) {
        return i == 0;
    }

    private static boolean llIllllIlIllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String llIllllIlIIllI(String lllllllllllllllIllIIlllIllllIIll, String lllllllllllllllIllIIlllIllllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIllIIlllIllllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlllIllllIIlI.getBytes(StandardCharsets.UTF_8)), lIlIlIllIlII[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIllIlII[3], lllllllllllllllIllIIlllIllllIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlllIllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlllIllllIlII) {
            lllllllllllllllIllIIlllIllllIlII.printStackTrace();
            return null;
        }
    }
}
