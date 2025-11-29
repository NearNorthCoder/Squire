package e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
@TaskDesc(name = "Banking", priority = 15, blocking = true)
/* renamed from: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.l  reason: invalid package */
/* loaded from: 1a91e21b-fcbe-4432-8f0e-1258958a8366.jar:e/g/n/r/p/l/q/-/-/e/m/i/t/e/e/s/t/i/k/r/k/u/l.class */
public class l extends Task {
    private final /* synthetic */ b F;
    private static /* synthetic */ String[] lIIllIlIIllll;
    private final /* synthetic */ TempleTrekkingConfig E;
    private final /* synthetic */ TempleTrekkingPlugin D;
    private static /* synthetic */ int[] lIIllIlIlIIII;
    private /* synthetic */ Player G;

    @Inject
    public l(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig, b bVar) {
        this.E = templeTrekkingConfig;
        this.F = bVar;
        this.D = templeTrekkingPlugin;
    }

    private static String lIllIIIIlIlIlIl(String llllllllllllllIlllIllllIllIIIIIl, String llllllllllllllIlllIllllIllIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllIllIIIIII.getBytes(StandardCharsets.UTF_8)), lIIllIlIlIIII[5]), "DES");
            Cipher llllllllllllllIlllIllllIllIIIIll = Cipher.getInstance("DES");
            llllllllllllllIlllIllllIllIIIIll.init(lIIllIlIlIIII[2], secretKeySpec);
            return new String(llllllllllllllIlllIllllIllIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllIllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllllIllIIIIlI) {
            llllllllllllllIlllIllllIllIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIlIllIll(int i, int i2) {
        return i != i2;
    }

    private static void lIllIIIIlIlIllI() {
        lIIllIlIIllll = new String[lIIllIlIlIIII[7]];
        lIIllIlIIllll[lIIllIlIlIIII[0]] = lIllIIIIlIlIlII("8Ub/axM07XU=", "QDHQi");
        lIIllIlIIllll[lIIllIlIlIIII[1]] = lIllIIIIlIlIlII("u0fOV/honx8=", "hKbMN");
        lIIllIlIIllll[lIIllIlIlIIII[2]] = lIllIIIIlIlIlII("BtQQVmAvwsdRVt+5BfPeZ+h52w6GemTJ07m20x4xnupLcQ70NzlMSw==", "PdqKs");
        lIIllIlIIllll[lIIllIlIlIIII[3]] = lIllIIIIlIlIlIl("8dlalbq/8mw=", "rPagk");
        lIIllIlIIllll[lIIllIlIlIIII[4]] = lIllIIIIlIlIlII("jJGpAHZOnXQ=", "HnJeT");
        lIIllIlIIllll[lIIllIlIlIIII[6]] = lIllIIIIlIlIlIl("N0g66TsCsvs=", "NNbhY");
    }

    private static boolean lIllIIIIlIlllII(int i) {
        return i != 0;
    }

    private static boolean lIllIIIIlIllIIl(int i) {
        return i == 0;
    }

    static {
        lIllIIIIlIlIlll();
        lIllIIIIlIlIllI();
    }

    private static boolean lIllIIIIlIllIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIllIIIIlIllllI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v114, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v121, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v29, types: [boolean] */
    public boolean run() {
        this.G = Players.getLocal();
        if (!lIllIIIIlIllIII(this.G) && !lIllIIIIlIllIIl(this.D.e() ? 1 : 0)) {
            int[] iArr = new int[lIIllIlIlIIII[1]];
            iArr[lIIllIlIlIIII[0]] = this.E.food().u();
            Item first = Inventory.getFirst(iArr);
            if (lIllIIIIlIllIlI(first) && lIllIIIIlIllIll(Skills.getBoostedLevel(Skill.HITPOINTS), Skills.getLevel(Skill.HITPOINTS))) {
                String[] strArr = new String[lIIllIlIlIIII[2]];
                strArr[lIIllIlIlIIII[0]] = lIIllIlIIllll[lIIllIlIlIIII[0]];
                strArr[lIIllIlIlIIII[1]] = lIIllIlIIllll[lIIllIlIlIIII[1]];
                first.interact(strArr);
                sleep(lIIllIlIlIIII[3]);
                return lIIllIlIlIIII[1];
            } else if (lIllIIIIlIlllII(this.E.healInBank() ? 1 : 0) && lIllIIIIlIlllII(Bank.isOpen() ? 1 : 0) && lIllIIIIlIllIll(Skills.getBoostedLevel(Skill.HITPOINTS), Skills.getLevel(Skill.HITPOINTS))) {
                Bank.withdraw(this.E.food().u(), (int) Math.ceil((Skills.getLevel(Skill.HITPOINTS) - Skills.getBoostedLevel(Skill.HITPOINTS)) / this.E.food().v()), Bank.WithdrawMode.ITEM);
                sleep(lIIllIlIlIIII[1]);
                return lIIllIlIlIIII[1];
            } else {
                if (lIllIIIIlIlllII(this.D.i().matchesInventory() ? 1 : 0) && (!lIllIIIIlIlllII(this.E.healInBank() ? 1 : 0) || lIllIIIIlIlllIl(Skills.getBoostedLevel(Skill.HITPOINTS), Skills.getLevel(Skill.HITPOINTS)))) {
                    if (lIllIIIIlIlllII(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        sleep(lIIllIlIlIIII[1]);
                        return lIIllIlIlIIII[1];
                    } else if (lIllIIIIlIllIIl(Bank.isOpen() ? 1 : 0)) {
                        if (!lIllIIIIlIllIIl(this.D.f().contains(this.G) ? 1 : 0)) {
                            this.D.b((boolean) lIIllIlIlIIII[0]);
                            return lIIllIlIlIIII[0];
                        }
                        Movement.walkTo(this.D.f());
                        "".length();
                        return lIIllIlIlIIII[1];
                    }
                }
                if (lIllIIIIlIlllII(Bank.isOpen() ? 1 : 0)) {
                    this.D.i().withdraw();
                    "".length();
                    sleep(lIIllIlIlIIII[4]);
                    return lIIllIlIlIIII[1];
                }
                BankLocation nearest = BankLocation.getNearest();
                if (!lIllIIIIlIllllI(nearest.getArea().distanceTo2D(this.G.getWorldArea()), lIIllIlIlIIII[5])) {
                    Movement.walkTo(nearest);
                    "".length();
                    return lIIllIlIlIIII[1];
                }
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lIllIIIIlIlllII(tileObject.getName().contains(lIIllIlIIllll[lIIllIlIlIIII[4]]) ? 1 : 0)) {
                        String[] strArr2 = new String[lIIllIlIlIIII[1]];
                        strArr2[lIIllIlIlIIII[0]] = lIIllIlIIllll[lIIllIlIlIIII[6]];
                        if (lIllIIIIlIlllII(tileObject.hasAction(strArr2) ? 1 : 0)) {
                            ?? r0 = lIIllIlIlIIII[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return lIIllIlIlIIII[0];
                });
                if (lIllIIIIlIllIII(nearest2)) {
                    System.out.print(lIIllIlIIllll[lIIllIlIlIIII[2]]);
                    this.D.forceStop();
                }
                if (lIllIIIIlIllIlI(nearest2) && lIllIIIIlIllIIl(this.G.isMoving() ? 1 : 0)) {
                    nearest2.interact(lIIllIlIIllll[lIIllIlIlIIII[3]]);
                    return lIIllIlIlIIII[1];
                }
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : lIIllIlIlIIII[0];
            }
        }
        return lIIllIlIlIIII[0];
    }

    private static boolean lIllIIIIlIllIII(Object obj) {
        return obj == null;
    }

    private static String lIllIIIIlIlIlII(String llllllllllllllIlllIllllIllIIlllI, String llllllllllllllIlllIllllIllIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllIllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllllIllIlIIII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllllIllIlIIII.init(lIIllIlIlIIII[2], secretKeySpec);
            return new String(llllllllllllllIlllIllllIllIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllIllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllllIllIIllll) {
            llllllllllllllIlllIllllIllIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIlIlllIl(int i, int i2) {
        return i >= i2;
    }

    private static void lIllIIIIlIlIlll() {
        lIIllIlIlIIII = new int[8];
        lIIllIlIlIIII[0] = (107 ^ 125) & ((39 ^ 49) ^ (-1));
        lIIllIlIlIIII[1] = " ".length();
        lIIllIlIlIIII[2] = "  ".length();
        lIIllIlIlIIII[3] = "   ".length();
        lIIllIlIlIIII[4] = (102 ^ 8) ^ (18 ^ 120);
        lIIllIlIlIIII[5] = 24 ^ 16;
        lIIllIlIlIIII[6] = 97 ^ 100;
        lIIllIlIlIIII[7] = (39 ^ 125) ^ (192 ^ 156);
    }
}
