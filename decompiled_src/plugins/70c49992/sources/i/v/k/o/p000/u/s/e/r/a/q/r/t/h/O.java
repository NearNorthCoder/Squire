package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import com.google.inject.Inject;
import com.openosrs.client.game.WorldLocation;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.House;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Traversing to Rel", priority = 100)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.O  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/O.class */
public class O extends Task {
    private final /* synthetic */ Client cC;
    private static /* synthetic */ String[] lIlIllIIlIIII;
    private static final /* synthetic */ WorldPoint cy;
    private static final /* synthetic */ int cz;
    private final /* synthetic */ SquireVorkathPlugin cB;
    private static /* synthetic */ int[] lIlIllIIlIIIl;
    private final /* synthetic */ SquireVorkathConfig cA;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v24, types: [boolean] */
    public boolean run() {
        if (llIIIIIIIlllIlI(Arrays.stream(this.cC.getMapRegions()).anyMatch(i2 -> {
            if (llIIIIIIlIIIIll(i2, lIlIllIIlIIIl[15])) {
                ?? r0 = lIlIllIIlIIIl[0];
                "".length();
                return (-((((117 + 39) - (-25)) + 1) ^ (((123 + 99) - 91) + 48))) >= 0 ? ((((87 + 165) - 76) + 37) ^ (((99 + 129) - 220) + 173)) & (((218 ^ 168) ^ (211 ^ 193)) ^ (-" ".length())) : r0;
            }
            return lIlIllIIlIIIl[1];
        }) ? 1 : 0)) {
            ah();
            "".length();
            return lIlIllIIlIIIl[0];
        } else if (!llIIIIIIIlllIll(this.cC.isInInstancedRegion() ? 1 : 0) || llIIIIIIIlllIlI(Arrays.stream(this.cC.getMapRegions()).anyMatch(i3 -> {
            if (llIIIIIIlIIIIll(i3, lIlIllIIlIIIl[14])) {
                ?? r0 = lIlIllIIlIIIl[0];
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIllIIlIIIl[1];
        }) ? 1 : 0)) {
            return lIlIllIIlIIIl[1];
        } else {
            WorldPoint worldLocation = Players.getLocal().getWorldLocation();
            if (llIIIIIIIllllII(cy.distanceTo(worldLocation), lIlIllIIlIIIl[2]) && llIIIIIIIllllIl(worldLocation.getX(), cy.getX())) {
                return lIlIllIIlIIIl[1];
            }
            if (llIIIIIIIlllIll(((BankLoadout) this.cA.bankLoadout().selected(BankLoadout.class)).needsToBank() ? 1 : 0) && llIIIIIIIlllllI(Combat.getMissingHealth()) && llIIIIIIIllllIl(Skills.getBoostedLevel(Skill.PRAYER), Skills.getLevel(Skill.PRAYER))) {
                this.cB.a((boolean) lIlIllIIlIIIl[1]);
                ah();
                "".length();
                return lIlIllIIlIIIl[0];
            } else if (llIIIIIIIlllIlI(((BankLoadout) this.cA.bankLoadout().selected(BankLoadout.class)).needsToBank() ? 1 : 0)) {
                return lIlIllIIlIIIl[1];
            } else {
                int[] iArr = new int[lIlIllIIlIIIl[0]];
                iArr[lIlIllIIlIIIl[1]] = lIlIllIIlIIIl[3];
                TileObject nearest = TileObjects.getNearest(iArr);
                if (!llIIIIIIIllllll(nearest)) {
                    nearest.interact(lIlIllIIlIIII[lIlIllIIlIIIl[1]]);
                    sleep(lIlIllIIlIIIl[6]);
                    return lIlIllIIlIIIl[0];
                }
                if ((!llIIIIIIlIIIIII(worldLocation.getRegionID(), lIlIllIIlIIIl[4]) || !llIIIIIIlIIIIII(worldLocation.getRegionID(), lIlIllIIlIIIl[5])) && !llIIIIIIIlllIll(this.cB.c() ? 1 : 0)) {
                    return lIlIllIIlIIIl[1];
                }
                return ah();
            }
        }
    }

    private static boolean llIIIIIIIllllIl(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean llIIIIIIIlllIll(int i2) {
        return i2 == 0;
    }

    private static boolean llIIIIIIlIIIIIl(Object obj) {
        return obj != null;
    }

    static {
        llIIIIIIIlllIIl();
        llIIIIIIIlllIII();
        cz = lIlIllIIlIIIl[4];
        cy = new WorldPoint(lIlIllIIlIIIl[16], lIlIllIIlIIIl[17], lIlIllIIlIIIl[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    private boolean ah() {
        if (llIIIIIIIlllIll(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIllIIlIIIl[0];
        }
        int[] iArr = new int[lIlIllIIlIIIl[0]];
        iArr[lIlIllIIlIIIl[1]] = lIlIllIIlIIIl[7];
        if (llIIIIIIlIIIIIl(Inventory.getFirst(iArr))) {
            int[] iArr2 = new int[lIlIllIIlIIIl[0]];
            iArr2[lIlIllIIlIIIl[1]] = lIlIllIIlIIIl[7];
            Inventory.getFirst(iArr2).interact(lIlIllIIlIIII[lIlIllIIlIIIl[0]]);
            return lIlIllIIlIIIl[0];
        }
        int[] iArr3 = new int[lIlIllIIlIIIl[8]];
        iArr3[lIlIllIIlIIIl[1]] = lIlIllIIlIIIl[9];
        iArr3[lIlIllIIlIIIl[0]] = lIlIllIIlIIIl[10];
        Item first = Inventory.getFirst(iArr3);
        if (llIIIIIIlIIIIIl(first)) {
            first.interact(lIlIllIIlIIII[lIlIllIIlIIIl[8]]);
            Keyboard.type(lIlIllIIlIIIl[11]);
            return lIlIllIIlIIIl[0];
        }
        if (llIIIIIIlIIIIlI(House.getHouseLocation(), WorldLocation.RELLEKKA_POH_PORTAL)) {
            int[] iArr4 = new int[lIlIllIIlIIIl[0]];
            iArr4[lIlIllIIlIIIl[1]] = lIlIllIIlIIIl[12];
            Item first2 = Inventory.getFirst(iArr4);
            if (llIIIIIIlIIIIIl(first2)) {
                first2.interact(lIlIllIIlIIII[lIlIllIIlIIIl[13]]);
                return lIlIllIIlIIIl[0];
            }
            Widget widget = Widgets.get(SpellBook.Standard.TELEPORT_TO_HOUSE.getWidget());
            if (llIIIIIIlIIIIIl(widget)) {
                widget.interact(lIlIllIIlIIII[lIlIllIIlIIIl[6]]);
                return lIlIllIIlIIIl[0];
            }
        }
        Movement.walkTo(cy);
        "".length();
        return lIlIllIIlIIIl[0];
    }

    @Inject
    protected O(SquireVorkathConfig squireVorkathConfig, SquireVorkathPlugin squireVorkathPlugin, Client client) {
        this.cA = squireVorkathConfig;
        this.cC = client;
        this.cB = squireVorkathPlugin;
    }

    private static boolean llIIIIIIlIIIIll(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean llIIIIIIlIIIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIIIIIIIllllll(Object obj) {
        return obj == null;
    }

    private static boolean llIIIIIIlIIIIII(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean llIIIIIIIlllllI(int i2) {
        return i2 <= 0;
    }

    private static String llIIIIIIIllIlll(String llllllllllllllIllIlIIllIIllIIIIl, String llllllllllllllIllIlIIllIIllIIIII) {
        try {
            SecretKeySpec llllllllllllllIllIlIIllIIllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIllIIllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIllIIllIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIllIIllIIIll.init(lIlIllIIlIIIl[8], llllllllllllllIllIlIIllIIllIIlII);
            return new String(llllllllllllllIllIlIIllIIllIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIllIIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIllIIllIIIlI) {
            llllllllllllllIllIlIIllIIllIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIIIllllII(int i2, int i3) {
        return i2 <= i3;
    }

    private static void llIIIIIIIlllIIl() {
        lIlIllIIlIIIl = new int[20];
        lIlIllIIlIIIl[0] = " ".length();
        lIlIllIIlIIIl[1] = (140 ^ 144) & ((114 ^ 110) ^ (-1));
        lIlIllIIlIIIl[2] = 74 ^ 90;
        lIlIllIIlIIIl[3] = (-((-24869) & 30125)) & (-833) & 32733;
        lIlIllIIlIIIl[4] = (-((-3131) & 24315)) & (-1031) & 32767;
        lIlIllIIlIIIl[5] = (-1154) & 11705;
        lIlIllIIlIIIl[6] = 123 ^ 127;
        lIlIllIIlIIIl[7] = (-((-12108) & 28655)) & (-1) & 29679;
        lIlIllIIlIIIl[8] = "  ".length();
        lIlIllIIlIIIl[9] = (-((-9355) & 11723)) & (-16513) & 28669;
        lIlIllIIlIIIl[10] = (-20801) & 30590;
        lIlIllIIlIIIl[11] = 160 ^ 166;
        lIlIllIIlIIIl[12] = (-((-6473) & 31193)) & (-3) & 32735;
        lIlIllIIlIIIl[13] = "   ".length();
        lIlIllIIlIIIl[14] = (-((-1081) & 7353)) & (-1025) & 16319;
        lIlIllIIlIIIl[15] = (-19585) & 32714;
        lIlIllIIlIIIl[16] = (-((-645) & 14310)) & (-7) & 15871;
        lIlIllIIlIIIl[17] = (-20484) & 23539;
        lIlIllIIlIIIl[18] = 81 ^ 84;
        lIlIllIIlIIIl[19] = 34 ^ 42;
    }

    private static void llIIIIIIIlllIII() {
        lIlIllIIlIIII = new String[lIlIllIIlIIIl[18]];
        lIlIllIIlIIII[lIlIllIIlIIIl[1]] = llIIIIIIIllIllI("e6q3Wh5xBWk=", "xuodK");
        lIlIllIIlIIII[lIlIllIIlIIIl[0]] = llIIIIIIIllIlll("8PJGs8bdlXZZGULkL0itow==", "oRScc");
        lIlIllIIlIIII[lIlIllIIlIIIl[8]] = llIIIIIIIllIllI("mogG1XSvvmz/946TiO9zKw==", "GAnrl");
        lIlIllIIlIIII[lIlIllIIlIIIl[13]] = llIIIIIIIllIllI("TkY1rhLRA/A=", "izWnG");
        lIlIllIIlIIII[lIlIllIIlIIIl[6]] = llIIIIIIIllIllI("6uYN34UeUk8=", "uqijr");
    }

    private static String llIIIIIIIllIllI(String llllllllllllllIllIlIIllIIlIlIlII, String llllllllllllllIllIlIIllIIlIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIllIIlIlIIll.getBytes(StandardCharsets.UTF_8)), lIlIllIIlIIIl[19]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIllIIlIIIl[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIllIIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIllIIlIlIlIl) {
            llllllllllllllIllIlIIllIIlIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIIIlllIlI(int i2) {
        return i2 != 0;
    }
}
