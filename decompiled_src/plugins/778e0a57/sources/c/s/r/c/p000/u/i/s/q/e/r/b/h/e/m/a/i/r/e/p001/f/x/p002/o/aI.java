package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Enter Olm Room", priority = 21000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aI  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aI.class */
public class aI extends aR {
    private static /* synthetic */ int[] lIIlllllIIll;
    private static /* synthetic */ String[] lIIllllIllll;

    private static String llIlIIlIIIllIl(String lllllllllllllllIlllIlIIIlIIIllll, String lllllllllllllllIlllIlIIIlIIIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIlIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllllIIll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIlIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIIlIIlIIII) {
            lllllllllllllllIlllIlIIIlIIlIIII.printStackTrace();
            return null;
        }
    }

    private static void llIlIIlIIlllIl() {
        lIIllllIllll = new String[lIIlllllIIll[1]];
        lIIllllIllll[lIIlllllIIll[0]] = llIlIIlIIIllIl("WwscVuZqtk1AIMJrFrHVSw==", "NrJGX");
    }

    private static boolean llIlIIlIlIIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public EquipmentSetup cj() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public boolean cg() {
        if (!llIlIIlIIlllll(ct() ? 1 : 0) && !llIlIIlIlIIIII(C0046u.bh(), EnumC0048w.GET_OUT)) {
            TileObject dq = dq();
            if (llIlIIlIlIIIIl(dq)) {
                return lIIlllllIIll[0];
            }
            dq.interact(lIIllllIllll[lIIlllllIIll[0]]);
            return lIIlllllIIll[1];
        }
        return lIIlllllIIll[0];
    }

    static {
        llIlIIlIIllllI();
        llIlIIlIIlllIl();
    }

    private static boolean llIlIIlIlIIIIl(Object obj) {
        return obj == null;
    }

    @Inject
    protected aI(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static void llIlIIlIIllllI() {
        lIIlllllIIll = new int[3];
        lIIlllllIIll[0] = ((83 ^ 55) ^ (139 ^ 181)) & (((((46 + 199) - 215) + 197) ^ (((160 + 15) - 142) + 152)) ^ (-" ".length()));
        lIIlllllIIll[1] = " ".length();
        lIIlllllIIll[2] = "  ".length();
    }

    private static boolean llIlIIlIIlllll(int i) {
        return i != 0;
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.aR
    public List<Prayer> ci() {
        ArrayList arrayList = new ArrayList();
        Prayer aE = this.ed.aE();
        if (llIlIIlIlIIIIl(aE)) {
            aE = Prayer.PROTECT_FROM_MAGIC;
        }
        List offensive = Prayers.getOffensive();
        arrayList.add(aE);
        "".length();
        arrayList.addAll(offensive);
        "".length();
        return arrayList;
    }
}
