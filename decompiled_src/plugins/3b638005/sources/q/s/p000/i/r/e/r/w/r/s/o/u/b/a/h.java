package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.managers.InventoryManager;
@TaskDesc(name = "Checking State", priority = 2147482310)
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.h  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/h.class */
public class h extends Task {
    private final /* synthetic */ SquireBarrowsConfig E;
    private static /* synthetic */ String[] llllIIIIlll;
    private static /* synthetic */ int[] llllIIIlIII;
    private final /* synthetic */ Instant F = Instant.now();
    private final /* synthetic */ SquireBarrows D;

    static {
        lIllIIllIlIlIl();
        lIllIIllIlIlII();
    }

    private static void lIllIIllIlIlIl() {
        llllIIIlIII = new int[14];
        llllIIIlIII[0] = (154 ^ 173) & ((7 ^ 48) ^ (-1));
        llllIIIlIII[1] = (-((-367) & 30207)) & (-292) & 9794995;
        llllIIIlIII[2] = " ".length();
        llllIIIlIII[3] = (-2177) & 11261;
        llllIIIlIII[4] = "  ".length();
        llllIIIlIII[5] = "   ".length();
        llllIIIlIII[6] = (-((-5033) & 21437)) & (-8705) & 28671;
        llllIIIlIII[7] = (-((-19009) & 27215)) & (-4865) & 16383;
        llllIIIlIII[8] = 176 ^ 180;
        llllIIIlIII[9] = (62 ^ 35) ^ (166 ^ 190);
        llllIIIlIII[10] = (99 ^ 124) ^ (64 ^ 89);
        llllIIIlIII[11] = 96 ^ 103;
        llllIIIlIII[12] = (15 ^ 20) ^ (25 ^ 10);
        llllIIIlIII[13] = (3 ^ 4) ^ (147 ^ 157);
    }

    private static String lIllIIllIlIIlI(String llllllllllllllllIIIlllIlllllIIII, String llllllllllllllllIIIlllIllllIllll) {
        try {
            SecretKeySpec llllllllllllllllIIIlllIlllllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIlllIllllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIlllIlllllIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIlllIlllllIIlI.init(llllIIIlIII[4], llllllllllllllllIIIlllIlllllIIll);
            return new String(llllllllllllllllIIIlllIlllllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIlllIlllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIlllIlllllIIIl) {
            llllllllllllllllIIIlllIlllllIIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    public h(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.D = squireBarrows;
        this.E = squireBarrowsConfig;
    }

    private static boolean lIllIIllIllIll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v96, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v31, types: [boolean] */
    public boolean run() {
        if (!lIllIIllIlIllI(Game.getState(), GameState.LOGGED_IN) && !lIllIIllIlIlll(Players.getLocal())) {
            if (!lIllIIllIllIII(Game.isInCutscene() ? 1 : 0) || lIllIIllIlIlll(InventoryManager.getCachedContainers().get(Integer.valueOf(InventoryID.INVENTORY.getId())))) {
                return llllIIIlIII[0];
            }
            if (lIllIIllIlIlll(Widgets.fromId(llllIIIlIII[1]))) {
                return llllIIIlIII[0];
            }
            WidgetInfo widgetInfo = Tab.INVENTORY.getWidgetInfo();
            if (!lIllIIllIllIIl(widgetInfo) || lIllIIllIllIII(Widgets.isVisible(Widgets.get(widgetInfo)) ? 1 : 0)) {
                return llllIIIlIII[0];
            }
            int[] iArr = new int[llllIIIlIII[2]];
            iArr[llllIIIlIII[0]] = llllIIIlIII[3];
            if (lIllIIllIllIIl(Inventory.getFirst(iArr))) {
                Inventory.dropAll(item -> {
                    if (lIllIIllIlllIl(item.getId(), llllIIIlIII[3])) {
                        ?? r0 = llllIIIlIII[2];
                        "".length();
                        return 0 != 0 ? ((120 ^ 115) ^ (114 ^ 75)) & (((47 ^ 87) ^ (72 ^ 2)) ^ (-" ".length())) : r0;
                    }
                    return llllIIIlIII[0];
                });
                "".length();
                return llllIIIlIII[2];
            }
            if (lIllIIllIllIlI(Inventory.getFreeSlots(), llllIIIlIII[4]) && lIllIIllIllIII(Inventory.contains(item2 -> {
                String[] strArr = new String[llllIIIlIII[2]];
                strArr[llllIIIlIII[0]] = llllIIIIlll[llllIIIlIII[12]];
                return item2.hasAction(strArr);
            }) ? 1 : 0)) {
                Log.info(llllIIIIlll[llllIIIlIII[0]]);
                this.D.a((boolean) llllIIIlIII[2]);
            }
            boolean contains = Inventory.contains(item3 -> {
                if (!lIllIIllIllIII(item3.getName().toLowerCase().contains(llllIIIIlll[llllIIIlIII[10]]) ? 1 : 0) || lIllIIllIllIll(item3.getName().toLowerCase().contains(llllIIIIlll[llllIIIlIII[11]]) ? 1 : 0)) {
                    ?? r0 = llllIIIlIII[2];
                    "".length();
                    return 0 != 0 ? ((((128 + 33) - 127) + 107) ^ (((17 + 117) - 85) + 137)) & (((35 ^ 89) ^ (58 ^ 119)) ^ (-" ".length())) : r0;
                }
                return llllIIIlIII[0];
            });
            if (lIllIIllIllIll(this.E.bankForPrayer() ? 1 : 0) && lIllIIllIllIII(contains ? 1 : 0)) {
                Log.info(llllIIIIlll[llllIIIlIII[2]]);
                this.D.a((boolean) llllIIIlIII[2]);
            }
            Item first = Inventory.getFirst(item4 -> {
                String[] strArr = new String[llllIIIlIII[2]];
                strArr[llllIIIlIII[0]] = llllIIIIlll[llllIIIlIII[9]];
                return item4.hasAction(strArr);
            });
            if (lIllIIllIllIll(this.E.bankForFood() ? 1 : 0) && lIllIIllIlIlll(first) && (!lIllIIllIlllII(Combat.getCurrentHealth(), this.E.eatAtHp()) || lIllIIllIllIII(this.D.m() ? 1 : 0))) {
                Log.info(llllIIIIlll[llllIIIlIII[4]]);
                this.D.a((boolean) llllIIIlIII[2]);
            }
            if (lIllIIllIllIII(this.E.useHouse() ? 1 : 0) && lIllIIllIllIll(this.D.v() ? 1 : 0)) {
                if (lIllIIllIllIII(this.D.h() ? 1 : 0)) {
                    this.D.b((boolean) llllIIIlIII[0]);
                    return llllIIIlIII[2];
                }
                Log.info(llllIIIIlll[llllIIIlIII[5]]);
                return J();
            }
            return llllIIIlIII[0];
        }
        return llllIIIlIII[0];
    }

    private static boolean lIllIIllIllIlI(int i, int i2) {
        return i < i2;
    }

    private static String lIllIIllIlIIll(String llllllllllllllllIIIlllIllllIIIII, String llllllllllllllllIIIlllIlllIlllll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIIlllIllllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIlllIlllIllllI = new StringBuilder();
        char[] llllllllllllllllIIIlllIlllIlllIl = llllllllllllllllIIIlllIlllIlllll.toCharArray();
        int llllllllllllllllIIIlllIlllIlllII = llllIIIlIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llllIIIlIII[0];
        while (lIllIIllIllIlI(i, length)) {
            char llllllllllllllllIIIlllIllllIIIIl = charArray[i];
            llllllllllllllllIIIlllIlllIllllI.append((char) (llllllllllllllllIIIlllIllllIIIIl ^ llllllllllllllllIIIlllIlllIlllIl[llllllllllllllllIIIlllIlllIlllII % llllllllllllllllIIIlllIlllIlllIl.length]));
            "".length();
            llllllllllllllllIIIlllIlllIlllII++;
            i++;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIIlllIlllIllllI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean J() {
        WorldPoint worldPoint = new WorldPoint(llllIIIlIII[6], llllIIIlIII[7], llllIIIlIII[0]);
        if (lIllIIllIllIII(Movement.shouldWalk() ? 1 : 0)) {
            return llllIIIlIII[2];
        }
        System.out.println(llllIIIIlll[llllIIIlIII[8]]);
        Movement.walkTo(worldPoint);
        "".length();
        return llllIIIlIII[2];
    }

    private static boolean lIllIIllIllIIl(Object obj) {
        return obj != null;
    }

    private static boolean lIllIIllIlIllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void lIllIIllIlIlII() {
        llllIIIIlll = new String[llllIIIlIII[13]];
        llllIIIIlll[llllIIIlIII[0]] = lIllIIllIlIIIl("wE8Q/fTF+PlXy8qDylOk1Sl3ImA06GUOQsUzVVdN6qQ3m5hbQzvQGQ==", "AvTOi");
        llllIIIIlll[llllIIIlIII[2]] = lIllIIllIlIIlI("RSzRdQnetFh/tV7RAoZPzUroFB/AJhPaKBy08vpn4ol/HJsboJ5knQ==", "dnVNv");
        llllIIIIlll[llllIIIlIII[4]] = lIllIIllIlIIlI("anPeL+QPjWdxt0+C33hL89HgrVQMyrvcdR1i9aDvyKg=", "MKRlr");
        llllIIIIlll[llllIIIlIII[5]] = lIllIIllIlIIIl("AGNb1Y74D3VYQG8lvRvEWHeggxelYJAadaxhg+aoG+pP2ATm/21BTMzGmqvsfJfhbb61KWYEjRoAzu6Jta0Psegye8xLvhUG", "yVbBM");
        llllIIIIlll[llllIIIlIII[8]] = lIllIIllIlIIlI("py15MGHPEwwIrg+PJKnxqw==", "XLEko");
        llllIIIIlll[llllIIIlIII[9]] = lIllIIllIlIIIl("ACOZ3c1H80I=", "TsHgB");
        llllIIIIlll[llllIIIlIII[10]] = lIllIIllIlIIlI("2SpKRDlO8+I=", "mnxRl");
        llllIIIIlll[llllIIIlIII[11]] = lIllIIllIlIIll("ESQ+PRkRJA==", "cAMIv");
        llllIIIIlll[llllIIIlIII[12]] = lIllIIllIlIIIl("5NOaKIbbqac=", "SDgTk");
    }

    private static boolean lIllIIllIlIlll(Object obj) {
        return obj == null;
    }

    private static boolean lIllIIllIllIII(int i) {
        return i == 0;
    }

    private static boolean lIllIIllIlllII(int i, int i2) {
        return i >= i2;
    }

    private static String lIllIIllIlIIIl(String llllllllllllllllIIIlllIlllllllIl, String llllllllllllllllIIIlllIlllllllII) {
        try {
            SecretKeySpec llllllllllllllllIIIllllIIIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIlllIlllllllII.getBytes(StandardCharsets.UTF_8)), llllIIIlIII[12]), "DES");
            Cipher llllllllllllllllIIIlllIlllllllll = Cipher.getInstance("DES");
            llllllllllllllllIIIlllIlllllllll.init(llllIIIlIII[4], llllllllllllllllIIIllllIIIIIIIII);
            return new String(llllllllllllllllIIIlllIlllllllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIlllIlllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIlllIllllllllI) {
            llllllllllllllllIIIlllIllllllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIllIlllIl(int i, int i2) {
        return i == i2;
    }
}
