package r.g.q.p000.s.r.s.u.i.e.r.r.n.c.s.p001.e.s.e.o.e.d.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireSorceressGardenConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Turning In Juice")
/* renamed from: r.g.q.-.s.r.s.u.i.e.r.r.n.c.s.-.e.s.e.o.e.d.a.c  reason: invalid package */
/* loaded from: 36afa564-21f3-409d-8955-c6e80fe75d70.jar:r/g/q/-/s/r/s/u/i/e/r/r/n/c/s/-/e/s/e/o/e/d/a/c.class */
public class c extends Task {
    private static /* synthetic */ String[] lIIllIIlIlIII;
    private static /* synthetic */ int[] lIIllIIlIlIIl;
    private final /* synthetic */ SquireSorceressGardenConfig t;

    static {
        lIlIllllllIIIII();
        lIlIlllllIlllll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    private boolean t() {
        String[] strArr = new String[lIIllIIlIlIIl[1]];
        strArr[lIIllIIlIlIIl[0]] = lIIllIIlIlIII[lIIllIIlIlIIl[0]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lIlIllllllIIIll(nearest)) {
            Movement.walk(new WorldPoint(lIIllIIlIlIIl[3], lIIllIIlIlIIl[4], lIIllIIlIlIIl[0]));
            return lIIllIIlIlIIl[1];
        }
        if (lIlIllllllIIlII(Movement.getRunEnergy(), lIIllIIlIlIIl[5]) && lIlIllllllIIIlI(Inventory.contains(this::c) ? 1 : 0)) {
            Inventory.getFirst(this::c).interact(lIIllIIlIlIII[lIIllIIlIlIIl[1]]);
        }
        int[] iArr = new int[lIIllIIlIlIIl[1]];
        iArr[lIIllIIlIlIIl[0]] = lIIllIIlIlIIl[2];
        Inventory.getFirst(iArr).useOn(nearest);
        return lIIllIIlIlIIl[1];
    }

    private static boolean lIlIllllllIIlIl(int i) {
        return i == 0;
    }

    private boolean c(Item item) {
        return item.getName().toLowerCase().contains(lIIllIIlIlIII[lIIllIIlIlIIl[6]]);
    }

    private static void lIlIlllllIlllll() {
        lIIllIIlIlIII = new String[lIIllIIlIlIIl[7]];
        lIIllIIlIlIII[lIIllIIlIlIIl[0]] = lIlIlllllIllIIl("Y8CLYQJsR/k=", "viqki");
        lIIllIIlIlIII[lIIllIIlIlIIl[1]] = lIlIlllllIllIIl("ZBhj4WGrodo=", "jwzbQ");
        lIIllIIlIlIII[lIIllIIlIlIIl[6]] = lIlIlllllIllllI("PZAUhoUZ9WQ=", "ntCHo");
    }

    private static boolean lIlIllllllIIIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIlIllllllIIIll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean u() {
        if (lIlIllllllIIlIl(Bank.isOpen() ? 1 : 0)) {
            Bank.open();
            "".length();
            return lIIllIIlIlIIl[1];
        } else if (lIlIllllllIIlII(Movement.getRunEnergy(), lIIllIIlIlIIl[5]) && lIlIllllllIIlIl(Inventory.contains(this::c) ? 1 : 0)) {
            Bank.withdraw(this::c, lIIllIIlIlIIl[1], Bank.WithdrawMode.ITEM);
            return lIIllIIlIlIIl[1];
        } else {
            Bank.withdrawAll(lIIllIIlIlIIl[2], Bank.WithdrawMode.ITEM);
            return lIIllIIlIlIIl[1];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    public boolean run() {
        if (lIlIllllllIIIIl(this.t.botActivity(), a.EXCHANGE)) {
            return lIIllIIlIlIIl[0];
        }
        if (lIlIllllllIIIlI(s() ? 1 : 0)) {
            boolean t = t();
            "".length();
            return (((((38 + 29) - (-19)) + 149) ^ (((136 + 60) - 95) + 97)) & (((189 ^ 175) ^ (13 ^ 50)) ^ (-" ".length()))) == "  ".length() ? ((196 ^ 131) ^ (0 ^ 80)) & (((((62 + 21) - 57) + 128) ^ (((14 + 12) - (-92)) + 23)) ^ (-" ".length())) : t;
        }
        return u();
    }

    private static boolean lIlIllllllIIIlI(int i) {
        return i != 0;
    }

    @Inject
    public c(SquireSorceressGardenConfig squireSorceressGardenConfig) {
        this.t = squireSorceressGardenConfig;
    }

    private static String lIlIlllllIllllI(String llllllllllllllIllllIIIIlIllllIll, String llllllllllllllIllllIIIIlIllllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIlIllllIlI.getBytes(StandardCharsets.UTF_8)), lIIllIIlIlIIl[8]), "DES");
            Cipher llllllllllllllIllllIIIIlIlllllIl = Cipher.getInstance("DES");
            llllllllllllllIllllIIIIlIlllllIl.init(lIIllIIlIlIIl[6], secretKeySpec);
            return new String(llllllllllllllIllllIIIIlIlllllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIlIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIIlIlllllII) {
            llllllllllllllIllllIIIIlIlllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllllllIIlII(int i, int i2) {
        return i <= i2;
    }

    private static String lIlIlllllIllIIl(String llllllllllllllIllllIIIIllIIIlIII, String llllllllllllllIllllIIIIllIIIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIllIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIIlIlIIl[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIllIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIIllIIIlIIl) {
            llllllllllllllIllllIIIIllIIIlIIl.printStackTrace();
            return null;
        }
    }

    private boolean s() {
        int[] iArr = new int[lIIllIIlIlIIl[1]];
        iArr[lIIllIIlIlIIl[0]] = lIIllIIlIlIIl[2];
        return Inventory.contains(iArr);
    }

    private static void lIlIllllllIIIII() {
        lIIllIIlIlIIl = new int[9];
        lIIllIIlIlIIl[0] = (157 ^ 167) & ((159 ^ 165) ^ (-1));
        lIIllIIlIlIIl[1] = " ".length();
        lIIllIIlIlIIl[2] = (-((-1569) & 6079)) & (-16385) & 31743;
        lIIllIIlIlIIl[3] = (-" ".length()) & (-289) & 3575;
        lIIllIIlIlIIl[4] = (-((-9129) & 25530)) & (-4865) & 24447;
        lIIllIIlIlIIl[5] = (200 ^ 168) ^ (249 ^ 177);
        lIIllIIlIlIIl[6] = "  ".length();
        lIIllIIlIlIIl[7] = "   ".length();
        lIIllIIlIlIIl[8] = 174 ^ 166;
    }
}
