package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Banking", priority = 999, blocking = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.F  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/F.class */
public abstract class F extends D {
    @Inject
    protected /* synthetic */ C0010g cZ;
    private static /* synthetic */ int[] lllIllllIlII;
    private static /* synthetic */ String[] lllIllllIIll;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean a(Predicate<Item> predicate, int i) {
        if (!lIIIlllIIIlllII(Bank.Inventory.getFirst(predicate))) {
            if (lIIIlllIIIllllI(Inventory.getFreeSlots(), i)) {
                Bank.depositInventory();
                return lllIllllIlII[1];
            }
            Bank.withdraw(predicate, i, Bank.WithdrawMode.ITEM);
            return lllIllllIlII[1];
        }
        Item first = Bank.Inventory.getFirst(predicate);
        String[] strArr = new String[lllIllllIlII[3]];
        strArr[lllIllllIlII[0]] = lllIllllIIll[lllIllllIlII[3]];
        strArr[lllIllllIlII[1]] = lllIllllIIll[lllIllllIlII[4]];
        first.interact(strArr);
        return lllIllllIlII[1];
    }

    private static boolean lIIIlllIIIllllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIlllIIIlllII(Object obj) {
        return obj != null;
    }

    private static boolean lIIIlllIIIlllIl(int i, int i2) {
        return i >= i2;
    }

    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.D
    public abstract boolean bY();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.D
    public boolean run() {
        if (lIIIlllIIIllIlI(this.cV.enableBanking() ? 1 : 0)) {
            return lllIllllIlII[0];
        }
        if (lIIIlllIIIllIll(cc() ? 1 : 0)) {
            this.cW.b(ce().needsToBank());
        }
        if (lIIIlllIIIllIlI(this.cW.s() ? 1 : 0)) {
            return lllIllllIlII[0];
        }
        if (lIIIlllIIIllIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lllIllllIlII[1];
        }
        return bY();
    }

    private static String lIIIlllIIIlIlll(String lllllllllllllllIIllIIIllIIIIIlll, String lllllllllllllllIIllIIIllIIIIIllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIIllIIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIllIIIllIIIIIlII = lllllllllllllllIIllIIIllIIIIIllI.toCharArray();
        int lllllllllllllllIIllIIIllIIIIIIll = lllIllllIlII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIIllIIIlIlllllIll = lllIllllIlII[0];
        while (lIIIlllIIIllllI(lllllllllllllllIIllIIIlIlllllIll, length)) {
            sb.append((char) (charArray[lllllllllllllllIIllIIIlIlllllIll] ^ lllllllllllllllIIllIIIllIIIIIlII[lllllllllllllllIIllIIIllIIIIIIll % lllllllllllllllIIllIIIllIIIIIlII.length]));
            "".length();
            lllllllllllllllIIllIIIllIIIIIIll++;
            lllllllllllllllIIllIIIlIlllllIll++;
            "".length();
            if (" ".length() == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIIIlllIIIlIllI(String lllllllllllllllIIllIIIllIIIlIlll, String lllllllllllllllIIllIIIllIIIlIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIllIIIlIllI.getBytes(StandardCharsets.UTF_8)), lllIllllIlII[6]), "DES");
            Cipher lllllllllllllllIIllIIIllIIIllIIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIIIllIIIllIIl.init(lllIllllIlII[3], secretKeySpec);
            return new String(lllllllllllllllIIllIIIllIIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIllIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIIllIIIllIII) {
            lllllllllllllllIIllIIIllIIIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIIIllIll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    protected boolean cd() {
        String[] strArr = new String[lllIllllIlII[1]];
        strArr[lllIllllIlII[0]] = lllIllllIIll[lllIllllIlII[0]];
        TileObject nearest = TileObjects.getNearest(strArr);
        String[] strArr2 = new String[lllIllllIlII[1]];
        strArr2[lllIllllIlII[0]] = lllIllllIIll[lllIllllIlII[1]];
        NPC nearest2 = NPCs.getNearest(strArr2);
        if ((lIIIlllIIIlllII(nearest) && lIIIlllIIIllIll(Reachable.isInteractable(nearest) ? 1 : 0) && !lIIIlllIIIlllIl(Players.getLocal().distanceTo(nearest), lllIllllIlII[2])) || (lIIIlllIIIlllII(nearest2) && lIIIlllIIIllIll(Reachable.isInteractable(nearest2) ? 1 : 0) && lIIIlllIIIllllI(Players.getLocal().distanceTo(nearest2), lllIllllIlII[2]))) {
            ?? r0 = lllIllllIlII[1];
            "".length();
            return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIllllIlII[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public F(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h) {
        super(squireNightmareConfig, squireNightmarePlugin, c0011h);
    }

    private static void lIIIlllIIIllIIl() {
        lllIllllIlII = new int[7];
        lllIllllIlII[0] = (67 ^ 99) & ((93 ^ 125) ^ (-1));
        lllIllllIlII[1] = " ".length();
        lllIllllIlII[2] = (212 ^ 182) ^ (48 ^ 94);
        lllIllllIlII[3] = "  ".length();
        lllIllllIlII[4] = "   ".length();
        lllIllllIlII[5] = (56 ^ 94) ^ (66 ^ 32);
        lllIllllIlII[6] = 7 ^ 15;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean cc() {
        if (!lIIIlllIIIllIlI(cd() ? 1 : 0) || lIIIlllIIIllIll(this.cZ.m(this.cV.bankLocation().bJ()) ? 1 : 0)) {
            ?? r0 = lllIllllIlII[1];
            "".length();
            return ((((71 + 34) - 1) + 57) ^ (((129 + 150) - 237) + 123)) < (((56 ^ 74) ^ (187 ^ 192)) & (((4 ^ 95) ^ (43 ^ 121)) ^ (-" ".length()))) ? ((((134 + 98) - 179) + 86) ^ (((41 + 109) - 117) + 155)) & (((133 ^ 199) ^ (245 ^ 128)) ^ (-" ".length())) : r0;
        }
        return lllIllllIlII[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BankLoadout ce() {
        return (BankLoadout) this.cV.bankLoadout().selected(BankLoadout.class);
    }

    static {
        lIIIlllIIIllIIl();
        lIIIlllIIIllIII();
    }

    private static boolean lIIIlllIIIllIlI(int i) {
        return i == 0;
    }

    private static void lIIIlllIIIllIII() {
        lllIllllIIll = new String[lllIllllIlII[5]];
        lllIllllIIll[lllIllllIlII[0]] = lIIIlllIIIlIllI("oWW64RqjJ6SomDDCU1L84A==", "frXnH");
        lllIllllIIll[lllIllllIlII[1]] = lIIIlllIIIlIlll("MSU8EjMB", "sDRyV");
        lllIllllIIll[lllIllllIlII[3]] = lIIIlllIIIlIlll("AwsiGCM=", "GyKvH");
        lllIllllIIll[lllIllllIlII[4]] = lIIIlllIIIlIlll("IAYj", "egWvk");
    }
}
