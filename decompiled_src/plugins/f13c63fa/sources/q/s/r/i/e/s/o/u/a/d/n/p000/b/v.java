package q.s.r.i.e.s.o.u.a.d.n.p000.b;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandosConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Looting Items", priority = 5, blocking = true)
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.v  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/v.class */
public class v extends Task {
    private final /* synthetic */ i ao;
    private final /* synthetic */ g ap;
    private final /* synthetic */ SquireBandosConfig aq;
    private static /* synthetic */ String[] lllIIIlIlIl;
    private final /* synthetic */ e an;
    private static /* synthetic */ int[] lllIIIlIlll;

    private static String lIlIllIlllIlII(String llllllllllllllllIIlIIllIllIIIIlI, String llllllllllllllllIIlIIllIllIIIIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllIllIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIllIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIlIlll[4], llllllllllllllllIIlIIllIllIIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIllIllIIIIll) {
            llllllllllllllllIIlIIllIllIIIIll.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIlllIllI() {
        lllIIIlIlIl = new String[lllIIIlIlll[8]];
        lllIIIlIlIl[lllIIIlIlll[0]] = lIlIllIlllIlII("/XTSi5lXpsg=", "ocsiN");
        lllIIIlIlIl[lllIIIlIlll[2]] = lIlIllIlllIlIl("MYsEc3ecZVQ=", "hvNvw");
        lllIIIlIlIl[lllIIIlIlll[4]] = lIlIllIlllIlIl("n21Nr7stYlo=", "XXBKR");
        lllIIIlIlIl[lllIIIlIlll[5]] = lIlIllIlllIlIl("UGqSRaxk+Wk=", "uhQMx");
        lllIIIlIlIl[lllIIIlIlll[7]] = lIlIllIlllIlIl("wTqZoo5C5/E=", "MNrZa");
    }

    private static boolean lIlIllIlllllII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIllIllllllI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIllIlllllIl(int i) {
        return i == 0;
    }

    static {
        lIlIllIllllIIl();
        lIlIllIlllIllI();
    }

    private static boolean lIlIllIlllllll(Object obj) {
        return obj != null;
    }

    private static boolean lIlIllIllllIlI(int i) {
        return i != 0;
    }

    private static void lIlIllIllllIIl() {
        lllIIIlIlll = new int[9];
        lllIIIlIlll[0] = ((120 ^ 55) ^ (103 ^ 13)) & (((62 ^ 21) ^ (91 ^ 85)) ^ (-" ".length()));
        lllIIIlIlll[1] = (-1) & Integer.MAX_VALUE;
        lllIIIlIlll[2] = " ".length();
        lllIIIlIlll[3] = (135 ^ 190) ^ (77 ^ 96);
        lllIIIlIlll[4] = "  ".length();
        lllIIIlIlll[5] = "   ".length();
        lllIIIlIlll[6] = (((119 + 70) - 160) + 98) ^ (35 ^ 84);
        lllIIIlIlll[7] = 152 ^ 156;
        lllIIIlIlll[8] = (83 ^ 109) ^ (17 ^ 42);
    }

    @Inject
    public v(e eVar, i iVar, g gVar, SquireBandosConfig squireBandosConfig) {
        this.an = eVar;
        this.ao = iVar;
        this.ap = gVar;
        this.aq = squireBandosConfig;
    }

    private static boolean lIlIllIllllIll(Object obj) {
        return obj == null;
    }

    private TileItem P() {
        TileItem orElse = this.ao.H().orElse(null);
        if (lIlIllIllllIll(orElse)) {
            return null;
        }
        if (lIlIllIlllllII(this.ao.a(orElse), lllIIIlIlll[1])) {
            return orElse;
        }
        List all = TileItems.getAll(tileItem -> {
            if (lIlIllIllllIlI(tileItem.isStackable() ? 1 : 0)) {
                int[] iArr = new int[lllIIIlIlll[2]];
                iArr[lllIIIlIlll[0]] = tileItem.getId();
                if (lIlIllIllllIlI(Inventory.contains(iArr) ? 1 : 0) && lIlIllIllllIlI(tileItem.getWorldLocation().equals(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    ?? r0 = lllIIIlIlll[2];
                    "".length();
                    return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lllIIIlIlll[0];
        });
        if (lIlIllIlllllIl(all.isEmpty() ? 1 : 0)) {
            return (TileItem) all.get(lllIIIlIlll[0]);
        }
        if (lIlIllIllllIlI(Inventory.isFull() ? 1 : 0)) {
            return this.ao.I().orElse(orElse);
        }
        TileItem nearest = TileItems.getNearest(tileItem2 -> {
            return tileItem2.getName().toLowerCase().contains(lllIIIlIlIl[lllIIIlIlll[7]]);
        });
        return (lIlIllIlllllll(nearest) && lIlIlllIIIIIII(Combat.getMissingHealth(), lllIIIlIlll[6])) ? nearest : orElse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    public boolean run() {
        int i;
        if (!lIlIllIllllIlI(this.an.t() ? 1 : 0) || lIlIllIllllIlI(this.an.s() ? 1 : 0)) {
            return lllIIIlIlll[0];
        }
        TileItem P = P();
        if (lIlIllIllllIll(P)) {
            return lllIIIlIlll[0];
        }
        if (lIlIllIlllllII(this.ao.a(P), lllIIIlIlll[1])) {
            i = lllIIIlIlll[2];
            "".length();
            if (" ".length() < 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = lllIIIlIlll[0];
        }
        int i2 = i;
        if (lIlIllIllllIlI(this.an.v() ? 1 : 0) && lIlIllIlllllIl(i2)) {
            return lllIIIlIlll[0];
        }
        if (lIlIllIllllllI(this.an.r(), lllIIIlIlll[3]) && lIlIllIlllllIl(i2)) {
            return lllIIIlIlll[0];
        }
        if (lIlIllIllllIlI(Movement.isRunEnabled() ? 1 : 0) && lIlIllIllllIlI(this.aq.turnOffRun() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (lIlIllIllllIlI(Inventory.isFull() ? 1 : 0)) {
            int[] iArr = new int[lllIIIlIlll[2]];
            iArr[lllIIIlIlll[0]] = P.getId();
            if (!lIlIllIllllIlI(Inventory.contains(iArr) ? 1 : 0) || lIlIllIlllllIl(P.isStackable() ? 1 : 0)) {
                Item G = this.ap.G();
                if (lIlIllIlllllll(G)) {
                    String str = lllIIIlIlIl[lllIIIlIlll[0]];
                    if (lIlIllIllllIlI(G.hasAction((v1) -> {
                        return r1.equals(v1);
                    }) ? 1 : 0)) {
                        return lllIIIlIlll[0];
                    }
                    G.interact(lllIIIlIlIl[lllIIIlIlll[2]]);
                    return lllIIIlIlll[2];
                }
                Item orElse = this.ao.J().orElse(null);
                if (!lIlIllIllllIll(orElse) && !lIlIllIlllllIl(this.ao.a(orElse, P) ? 1 : 0)) {
                    orElse.interact(lllIIIlIlIl[lllIIIlIlll[4]]);
                }
                return lllIIIlIlll[0];
            }
        }
        if (lIlIllIllllIlI(Movement.shouldWalk() ? 1 : 0)) {
            P.interact(lllIIIlIlIl[lllIIIlIlll[5]]);
            sleep(lllIIIlIlll[2]);
        }
        return lllIIIlIlll[2];
    }

    private static String lIlIllIlllIlIl(String llllllllllllllllIIlIIllIllIIllll, String llllllllllllllllIIlIIllIllIIlllI) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllIllIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIllIIlllI.getBytes(StandardCharsets.UTF_8)), lllIIIlIlll[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIlIlll[4], llllllllllllllllIIlIIllIllIlIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIllIllIlIIII) {
            llllllllllllllllIIlIIllIllIlIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIIIIIII(int i, int i2) {
        return i > i2;
    }
}
