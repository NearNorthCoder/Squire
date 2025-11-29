package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.client.Static;
@TaskDesc(name = "Handling baba prayers", priority = Integer.MAX_VALUE, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aH  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aH.class */
public class aH extends W {
    private /* synthetic */ int dF;
    private static /* synthetic */ String[] lIllllllIll;
    private static /* synthetic */ int[] lIlllllllII;

    private static boolean lIIllIllllIlIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public boolean aS() {
        return lIlllllllII[1];
    }

    private static boolean lIIllIlllllIlI(int i) {
        return i != 0;
    }

    private static boolean lIIllIlllllIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIllIllllIllI(int i, int i2) {
        return i == i2;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public List<Prayer> aN() {
        String[] strArr = new String[lIlllllllII[1]];
        strArr[lIlllllllII[0]] = lIllllllIll[lIlllllllII[0]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lIIllIllllIlIl(nearest) && lIIllIllllIllI(nearest.getId(), lIlllllllII[2])) {
            return List.of(aQ());
        }
        String[] strArr2 = new String[lIlllllllII[1]];
        strArr2[lIlllllllII[0]] = lIllllllIll[lIlllllllII[1]];
        return (lIIllIllllIlll(this.dF, Static.getClient().getTickCount()) && lIIllIllllIlIl(NPCs.getNearest(strArr2))) ? List.of(Prayer.PROTECT_FROM_MISSILES, aQ()) : List.of(Prayer.PROTECT_FROM_MELEE, aQ());
    }

    private static void lIIllIllllIlII() {
        lIlllllllII = new int[11];
        lIlllllllII[0] = ((((116 + 48) - 22) + 40) ^ (((121 + 79) - 100) + 37)) & (((57 ^ 115) ^ (221 ^ 168)) ^ (-" ".length()));
        lIlllllllII[1] = " ".length();
        lIlllllllII[2] = (-20489) & 32268;
        lIlllllllII[3] = (-1161) & 16348;
        lIlllllllII[4] = "   ".length();
        lIlllllllII[5] = (-((-18951) & 23127)) & (-16525) & 32478;
        lIlllllllII[6] = (-((-25363) & 29531)) & (-149) & 16095;
        lIlllllllII[7] = "  ".length();
        lIlllllllII[8] = (-((-4601) & 13817)) & (-4673) & 15999;
        lIlllllllII[9] = 85 ^ 80;
        lIlllllllII[10] = 20 ^ 28;
    }

    @Inject
    public aH(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.dF = lIlllllllII[0];
    }

    static {
        lIIllIllllIlII();
        lIIllIllllIIll();
    }

    private static boolean lIIllIllllIlll(int i, int i2) {
        return i > i2;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public EnumC0073v aT() {
        return EnumC0073v.FLICK;
    }

    private static String lIIllIllllIIII(String llllllllllllllllIlIIlIIIllIIIlll, String llllllllllllllllIlIIlIIIllIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIIIllIIIllI.getBytes(StandardCharsets.UTF_8)), lIlllllllII[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlllllllII[7], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIIIllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIIIllIIIIll) {
            llllllllllllllllIlIIlIIIllIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIlllllIII(int i, int i2) {
        return i != i2;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public boolean aL() {
        SquireAutoTOA squireAutoTOA = this.cm;
        int[] iArr = new int[lIlllllllII[4]];
        iArr[lIlllllllII[0]] = lIlllllllII[5];
        iArr[lIlllllllII[1]] = lIlllllllII[6];
        iArr[lIlllllllII[7]] = lIlllllllII[2];
        return squireAutoTOA.a(iArr);
    }

    private static boolean lIIllIlllllIIl(Object obj) {
        return obj == null;
    }

    private static String lIIllIllllIIIl(String llllllllllllllllIlIIlIIIllIlllII, String llllllllllllllllIlIIlIIIllIllIll) {
        String llllllllllllllllIlIIlIIIllIlllII2 = new String(Base64.getDecoder().decode(llllllllllllllllIlIIlIIIllIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIlIIlIIIllIllIIl = llllllllllllllllIlIIlIIIllIllIll.toCharArray();
        int llllllllllllllllIlIIlIIIllIllIII = lIlllllllII[0];
        char[] charArray = llllllllllllllllIlIIlIIIllIlllII2.toCharArray();
        int length = charArray.length;
        int i = lIlllllllII[0];
        while (lIIllIlllllIll(i, length)) {
            char llllllllllllllllIlIIlIIIllIlllIl = charArray[i];
            sb.append((char) (llllllllllllllllIlIIlIIIllIlllIl ^ llllllllllllllllIlIIlIIIllIllIIl[llllllllllllllllIlIIlIIIllIllIII % llllllllllllllllIlIIlIIIllIllIIl.length]));
            "".length();
            llllllllllllllllIlIIlIIIllIllIII++;
            i++;
            "".length();
            if ("   ".length() == (((168 ^ 191) ^ (99 ^ 122)) & (((169 ^ 151) ^ (152 ^ 168)) ^ (-" ".length())) & ((((10 ^ 44) ^ (161 ^ 173)) & (((142 ^ 167) ^ "   ".length()) ^ (-" ".length()))) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.W
    public int aO() {
        return lIlllllllII[3];
    }

    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        GraphicsObject graphicsObject = graphicsObjectCreated.getGraphicsObject();
        if (lIIllIlllllIII(graphicsObjectCreated.getGraphicsObject().getId(), lIlllllllII[8])) {
            return;
        }
        WorldPoint fromLocal = WorldPoint.fromLocal(Static.getClient(), graphicsObject.getLocation());
        String[] strArr = new String[lIlllllllII[1]];
        strArr[lIlllllllII[0]] = lIllllllIll[lIlllllllII[7]];
        NPC nearest = NPCs.getNearest(strArr);
        if (!lIIllIlllllIIl(nearest) && lIIllIlllllIlI(nearest.getWorldArea().contains(fromLocal) ? 1 : 0)) {
            this.dF = Static.getClient().getTickCount() + lIlllllllII[9];
        }
    }

    private static String lIIllIllllIIlI(String llllllllllllllllIlIIlIIIlllIllII, String llllllllllllllllIlIIlIIIlllIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIIIlllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllllllII[7], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIIIlllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIIIlllIllIl) {
            llllllllllllllllIlIIlIIIlllIllIl.printStackTrace();
            return null;
        }
    }

    private static void lIIllIllllIIll() {
        lIllllllIll = new String[lIlllllllII[4]];
        lIllllllIll[lIlllllllII[0]] = lIIllIllllIIII("VyO4u9qQVyg=", "oxEbf");
        lIllllllIll[lIlllllllII[1]] = lIIllIllllIIIl("BTs6NTgp", "GZXZW");
        lIllllllIll[lIlllllllII[7]] = lIIllIllllIIlI("ixwIxcydWr0=", "RqcoT");
    }
}
