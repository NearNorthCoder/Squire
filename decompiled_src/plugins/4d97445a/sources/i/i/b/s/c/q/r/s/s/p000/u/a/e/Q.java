package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.combat.Lure.LureConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Running")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.Q  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/Q.class */
public class Q extends Task {
    private final /* synthetic */ M cc;
    private static /* synthetic */ int[] llIlIIIll;
    private final /* synthetic */ LureConfig cd;
    private static /* synthetic */ String[] llIIlIlll;

    private static void lIllIIlIlII() {
        llIIlIlll = new String[llIlIIIll[3]];
        llIIlIlll[llIlIIIll[0]] = lIllIIlIIlI("/rQVdp9FRnw=", "OjkQp");
        llIIlIlll[llIlIIIll[1]] = lIllIIlIIll("BDARDQM=", "SYtag");
    }

    private static boolean lIllIlllIIl(Object obj) {
        return obj == null;
    }

    private static String lIllIIlIIll(String lIllIIIllIIIlII, String lIllIIIllIIIIll) {
        String str = new String(Base64.getDecoder().decode(lIllIIIllIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIIIllIIIIlI = new StringBuilder();
        char[] charArray = lIllIIIllIIIIll.toCharArray();
        int lIllIIIllIIIIII = llIlIIIll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = llIlIIIll[0];
        while (lIllIlllIll(i2, length)) {
            lIllIIIllIIIIlI.append((char) (charArray2[i2] ^ charArray[lIllIIIllIIIIII % charArray.length]));
            "".length();
            lIllIIIllIIIIII++;
            i2++;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lIllIIIllIIIIlI);
    }

    private static void lIllIllIllI() {
        llIlIIIll = new int[4];
        llIlIIIll[0] = ((19 ^ 120) ^ (56 ^ 66)) & (((((66 + 179) - 241) + 181) ^ (((156 + 58) - 147) + 101)) ^ (-" ".length()));
        llIlIIIll[1] = " ".length();
        llIlIIIll[2] = 128 ^ 143;
        llIlIIIll[3] = "  ".length();
    }

    static {
        lIllIllIllI();
        lIllIIlIlII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean aN() {
        if (lIllIlllIlI(Movement.getRunEnergy(), llIlIIIll[2])) {
            return llIlIIIll[0];
        }
        if (lIllIllIlll(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        return llIlIIIll[0];
    }

    @Inject
    public Q(M m, LureConfig lureConfig) {
        this.cc = m;
        this.cd = lureConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v93, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v97, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    public boolean run() {
        WorldPoint aJ;
        if (lIllIllIlll(this.cc.aI() ? 1 : 0)) {
            return llIlIIIll[0];
        }
        if (lIllIlllIII(aN() ? 1 : 0)) {
            return llIlIIIll[1];
        }
        Player local = Players.getLocal();
        if (lIllIlllIIl(local)) {
            return llIlIIIll[0];
        }
        N aG = this.cc.aG();
        if (!lIllIlllIIl(this.cc.a((boolean) llIlIIIll[0], (NPC) null))) {
            WorldPoint destination = Movement.getDestination();
            if (lIllIlllIIl(destination)) {
                if (lIllIlllIII(local.getWorldLocation().equals(aG.aJ()) ? 1 : 0)) {
                    aJ = aG.aK();
                    "".length();
                    if (" ".length() <= 0) {
                        return ((24 ^ 124) ^ (216 ^ 162)) & (((39 ^ 10) ^ (143 ^ 188)) ^ (-" ".length()));
                    }
                } else {
                    aJ = aG.aJ();
                }
                Movement.walkTo(aJ);
                "".length();
                return llIlIIIll[1];
            }
            if (lIllIlllIII(aG.aJ().equals(destination) ? 1 : 0)) {
                Movement.walkTo(aG.aK());
                "".length();
                "".length();
                if (0 != 0) {
                    return ((60 ^ 87) ^ (198 ^ 131)) & (((29 ^ 61) ^ (42 ^ 36)) ^ (-" ".length()));
                }
            } else {
                Movement.walkTo(aG.aJ());
                "".length();
            }
            return llIlIIIll[1];
        }
        if (lIllIllIlll(aG.aJ().equals(local.getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(aG.aJ());
            "".length();
        }
        int[] iArr = new int[llIlIIIll[1]];
        iArr[llIlIIIll[0]] = this.cd.primaryWeaponID();
        if (lIllIllIlll(Equipment.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llIlIIIll[1]];
            iArr2[llIlIIIll[0]] = this.cd.primaryWeaponID();
            if (lIllIlllIII(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[llIlIIIll[1]];
                iArr3[llIlIIIll[0]] = this.cd.primaryWeaponID();
                Inventory.getFirst(iArr3).interact(llIIlIlll[llIlIIIll[0]]);
            }
        }
        if (lIllIlllIII(this.cd.usingSecondary() ? 1 : 0)) {
            int[] iArr4 = new int[llIlIIIll[1]];
            iArr4[llIlIIIll[0]] = this.cd.secondaryWeaponID();
            if (lIllIllIlll(Equipment.contains(iArr4) ? 1 : 0)) {
                int[] iArr5 = new int[llIlIIIll[1]];
                iArr5[llIlIIIll[0]] = this.cd.secondaryWeaponID();
                if (lIllIlllIII(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[llIlIIIll[1]];
                    iArr6[llIlIIIll[0]] = this.cd.secondaryWeaponID();
                    Inventory.getFirst(iArr6).interact(llIIlIlll[llIlIIIll[1]]);
                }
            }
        }
        return llIlIIIll[0];
    }

    private static boolean lIllIlllIlI(int i2, int i3) {
        return i2 <= i3;
    }

    private static boolean lIllIlllIII(int i2) {
        return i2 != 0;
    }

    private static boolean lIllIlllIll(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIllIllIlll(int i2) {
        return i2 == 0;
    }

    private static String lIllIIlIIlI(String lIllIIIlIlIllll, String lIllIIIlIlIlllI) {
        try {
            SecretKeySpec lIllIIIlIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIIlIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIIIll[3], lIllIIIlIllIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllIIIlIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIIIlIllIIII) {
            lIllIIIlIllIIII.printStackTrace();
            return null;
        }
    }
}
