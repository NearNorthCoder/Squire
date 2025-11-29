package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Prayer;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bg  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/bg.class */
public abstract class bg extends U {
    private static /* synthetic */ String[] lIlIllIIIIlI;
    private static /* synthetic */ int[] lIlIllIIIIll;
    protected /* synthetic */ C0039n al;
    protected /* synthetic */ int el;
    protected static /* synthetic */ int em;
    protected /* synthetic */ C0039n ak;
    protected /* synthetic */ int am;

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public List<Prayer> ci() {
        return null;
    }

    protected int ei() {
        int[] iArr = new int[lIlIllIIIIll[3]];
        iArr[lIlIllIIIIll[5]] = lIlIllIIIIll[8];
        return Inventory.getCount(iArr);
    }

    static {
        llIllllllIlIll();
        llIllllllIlIlI();
        em = lIlIllIIIIll[10];
    }

    private static void llIllllllIlIll() {
        lIlIllIIIIll = new int[11];
        lIlIllIIIIll[0] = -" ".length();
        lIlIllIIIIll[1] = "   ".length();
        lIlIllIIIIll[2] = (6 ^ 69) ^ (118 ^ 41);
        lIlIllIIIIll[3] = " ".length();
        lIlIllIIIIll[4] = "  ".length();
        lIlIllIIIIll[5] = (25 ^ 123) & ((249 ^ 155) ^ (-1));
        lIlIllIIIIll[6] = (-((-18472) & 20159)) & (-10273) & 32759;
        lIlIllIIIIll[7] = (-((-28865) & 30459)) & (-10241) & 32635;
        lIlIllIIIIll[8] = (-((-513) & 11796)) & (-65) & 32255;
        lIlIllIIIIll[9] = (-((-28729) & 30841)) & (-9729) & 32747;
        lIlIllIIIIll[10] = (-2629) & 32639;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int cp() {
        return Inventory.getCount(item -> {
            return item.getName().startsWith(lIlIllIIIIlI[lIlIllIIIIll[3]]);
        });
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public EquipmentSetup cj() {
        return llIllllllIlllI(this.co.R()) ? this.co.R() : this.co.Q();
    }

    private static void llIllllllIlIlI() {
        lIlIllIIIIlI = new String[lIlIllIIIIll[4]];
        lIlIllIIIIlI[lIlIllIIIIll[5]] = llIllllllIlIII("r3OI7F9o8C4nufED6It4KA==", "XxfMB");
        lIlIllIIIIlI[lIlIllIIIIll[3]] = llIllllllIlIIl("HAMbCzdjFUkDPSA=", "DfibT");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int eh() {
        return eg() + cp() + cq();
    }

    private static boolean llIlllllllIIIl(Object obj) {
        return obj == null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int cq() {
        return Inventory.getCount(item -> {
            return item.getName().startsWith(lIlIllIIIIlI[lIlIllIIIIll[5]]);
        });
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean cg() {
        return dY();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean ch() {
        if (llIllllllIllII(this.bS.getPlane(), lIlIllIIIIll[4])) {
            return lIlIllIIIIll[5];
        }
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (llIllllllIllIl(this.ak.bw, N.FARMING)) {
            ?? r0 = lIlIllIIIIll[3];
            "".length();
            return (182 ^ 178) == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIllIIIIll[5];
    }

    private static boolean llIlllllllIIII(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int ed() {
        return ((lIlIllIIIIll[2] - el().size()) - lIlIllIIIIll[3]) - lIlIllIIIIll[4];
    }

    protected int ej() {
        int[] iArr = new int[lIlIllIIIIll[3]];
        iArr[lIlIllIIIIll[5]] = lIlIllIIIIll[9];
        return Inventory.getCount(iArr);
    }

    private List<Integer> a(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int lllllllllllllllIllIIllIIllIIIlIl = iArr.length;
        int i = lIlIllIIIIll[5];
        while (llIllllllIllll(i, lllllllllllllllIllIIllIIllIIIlIl)) {
            arrayList.add(Integer.valueOf(iArr[i]));
            "".length();
            i++;
            "".length();
            if ((-" ".length()) == "   ".length()) {
                return null;
            }
        }
        return arrayList;
    }

    private static boolean llIllllllIllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    public abstract boolean dY();

    private static String llIllllllIlIII(String lllllllllllllllIllIIllIIlIlIIlll, String lllllllllllllllIllIIllIIlIlIIllI) {
        try {
            SecretKeySpec lllllllllllllllIllIIllIIlIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIllIIlIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIllIIlIlIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIllIIlIlIlIIl.init(lIlIllIIIIll[4], lllllllllllllllIllIIllIIlIlIlIlI);
            return new String(lllllllllllllllIllIIllIIlIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIllIIlIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIllIIlIlIlIII) {
            lllllllllllllllIllIIllIIlIlIlIII.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Inject
    public bg(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIllIIIIll[0];
        this.el = lIlIllIIIIll[1];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int ef() {
        int[] iArr = new int[lIlIllIIIIll[3]];
        iArr[lIlIllIIIIll[5]] = lIlIllIIIIll[6];
        return Inventory.getCount(iArr);
    }

    private static String llIllllllIlIIl(String lllllllllllllllIllIIllIIlIIlIlll, String lllllllllllllllIllIIllIIlIIlIllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIIllIIlIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIllIIllIIlIIlIllI.toCharArray();
        int lllllllllllllllIllIIllIIlIIlIIll = lIlIllIIIIll[5];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIllIIIIll[5];
        while (llIllllllIllll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIllIIllIIlIIlIIll % charArray.length]));
            "".length();
            lllllllllllllllIllIIllIIlIIlIIll++;
            i++;
            "".length();
            if ("  ".length() < "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIllllllIlllI(Object obj) {
        return obj != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public HashSet<Integer> el() {
        EquipmentSetup P = this.co.P();
        EquipmentSetup Q = this.co.Q();
        EquipmentSetup O = this.co.O();
        EquipmentSetup R = this.co.R();
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(a(Q.getIds()));
        "".length();
        hashSet.addAll(a(P.getIds()));
        "".length();
        hashSet.addAll(a(O.getIds()));
        "".length();
        if (llIllllllIlllI(R)) {
            hashSet.addAll(a(R.getIds()));
            "".length();
        }
        List<Item> all = Equipment.getAll();
        HashSet hashSet2 = new HashSet();
        for (Item item : all) {
            if (llIlllllllIIIl(item)) {
                "".length();
                if ((-" ".length()) == " ".length()) {
                    return null;
                }
            } else {
                hashSet2.add(Integer.valueOf(item.getId()));
                "".length();
                "".length();
                if (0 != 0) {
                    return null;
                }
            }
        }
        hashSet.removeAll(hashSet2);
        "".length();
        hashSet.remove(Integer.valueOf(lIlIllIIIIll[0]));
        "".length();
        hashSet.remove(Integer.valueOf(lIlIllIIIIll[5]));
        "".length();
        return hashSet;
    }

    private static boolean llIllllllIllll(int i, int i2) {
        return i < i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int eg() {
        int[] iArr = new int[lIlIllIIIIll[3]];
        iArr[lIlIllIIIIll[5]] = lIlIllIIIIll[7];
        return Inventory.getCount(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int ee() {
        return ed() - this.el;
    }

    private static boolean llIllllllIllII(int i, int i2) {
        return i != i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int ek() {
        return ei() + ej();
    }
}
