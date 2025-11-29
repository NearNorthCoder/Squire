/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.GameState
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.managers.InventoryManager
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

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
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.managers.InventoryManager;

@TaskDesc(name="Checking State", priority=2147482310)
public class h
extends Task {
    private final /* synthetic */ SquireBarrowsConfig E;
    private static /* synthetic */ String[] llllIIIIlll;
    private static /* synthetic */ int[] llllIIIlIII;
    private final /* synthetic */ Instant F;
    private final /* synthetic */ SquireBarrows D;

    static {
        h.lIllIIllIlIlIl();
        h.lIllIIllIlIlII();
    }

    private static void lIllIIllIlIlIl() {
        llllIIIlIII = new int[14];
        h.llllIIIlIII[0] = (0x9A ^ 0xAD) & ~(7 ^ 0x30);
        h.llllIIIlIII[1] = -(0xFFFFFE91 & 0x75FF) & (0xFFFFFEDC & 0x9575B3);
        h.llllIIIlIII[2] = 1;
        h.llllIIIlIII[3] = 0xFFFFF77F & 0x2BFD;
        h.llllIIIlIII[4] = 2;
        h.llllIIIlIII[5] = 3;
        h.llllIIIlIII[6] = -(0xFFFFEC57 & 0x53BD) & (0xFFFFDDFF & 0x6FFF);
        h.llllIIIlIII[7] = -(0xFFFFB5BF & 0x6A4F) & (0xFFFFECFF & 0x3FFF);
        h.llllIIIlIII[8] = 0xB0 ^ 0xB4;
        h.llllIIIlIII[9] = 0x3E ^ 0x23 ^ (0xA6 ^ 0xBE);
        h.llllIIIlIII[10] = 0x63 ^ 0x7C ^ (0x40 ^ 0x59);
        h.llllIIIlIII[11] = 0x60 ^ 0x67;
        h.llllIIIlIII[12] = 0xF ^ 0x14 ^ (0x19 ^ 0xA);
        h.llllIIIlIII[13] = 3 ^ 4 ^ (0x93 ^ 0x9D);
    }

    private static String lIllIIllIlIIlI(String llllllllllllllllIIIlllIllllIlllI, String llllllllllllllllIIIlllIllllIllll) {
        try {
            SecretKeySpec llllllllllllllllIIIlllIlllllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIlllIllllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIlllIlllllIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIlllIlllllIIlI.init(llllIIIlIII[4], llllllllllllllllIIIlllIlllllIIll);
            return new String(llllllllllllllllIIIlllIlllllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIlllIllllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIlllIlllllIIIl) {
            llllllllllllllllIIIlllIlllllIIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    public h(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.F = Instant.now();
        this.D = squireBarrows;
        this.E = squireBarrowsConfig;
    }

    private static boolean lIllIIllIllIll(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        h llllllllllllllllIIIllllIIIIlIIII;
        if (h.lIllIIllIlIllI(Game.getState(), GameState.LOGGED_IN)) {
            return llllIIIlIII[0];
        }
        if (h.lIllIIllIlIlll(Players.getLocal())) {
            return llllIIIlIII[0];
        }
        if (!h.lIllIIllIllIII(Game.isInCutscene() ? 1 : 0) || h.lIllIIllIlIlll(InventoryManager.getCachedContainers().get(InventoryID.INVENTORY.getId()))) {
            return llllIIIlIII[0];
        }
        Widget llllllllllllllllIIIllllIIIIIllll = Widgets.fromId((int)llllIIIlIII[1]);
        if (h.lIllIIllIlIlll(llllllllllllllllIIIllllIIIIIllll)) {
            return llllIIIlIII[0];
        }
        WidgetInfo llllllllllllllllIIIllllIIIIIlllI = Tab.INVENTORY.getWidgetInfo();
        if (!h.lIllIIllIllIIl(llllllllllllllllIIIllllIIIIIlllI) || h.lIllIIllIllIII(Widgets.isVisible((Widget)Widgets.get((WidgetInfo)llllllllllllllllIIIllllIIIIIlllI)) ? 1 : 0)) {
            return llllIIIlIII[0];
        }
        int[] nArray = new int[llllIIIlIII[2]];
        nArray[h.llllIIIlIII[0]] = llllIIIlIII[3];
        Item llllllllllllllllIIIllllIIIIIllIl = Inventory.getFirst((int[])nArray);
        if (h.lIllIIllIllIIl(llllllllllllllllIIIllllIIIIIllIl)) {
            Inventory.dropAll(item -> {
                boolean bl;
                if (h.lIllIIllIlllIl(item.getId(), llllIIIlIII[3])) {
                    bl = llllIIIlIII[2];
                    0;
                    if (null != null) {
                        return ((0x78 ^ 0x73 ^ (0x72 ^ 0x4B)) & (0x2F ^ 0x57 ^ (0x48 ^ 2) ^ -1)) != 0;
                    }
                } else {
                    bl = llllIIIlIII[0];
                }
                return bl;
            });
            0;
            return llllIIIlIII[2];
        }
        if (h.lIllIIllIllIlI(Inventory.getFreeSlots(), llllIIIlIII[4]) && h.lIllIIllIllIII(Inventory.contains(item -> {
            String[] stringArray = new String[llllIIIlIII[2]];
            stringArray[h.llllIIIlIII[0]] = llllIIIIlll[llllIIIlIII[12]];
            return item.hasAction(stringArray);
        }) ? 1 : 0)) {
            Log.info((String)llllIIIIlll[llllIIIlIII[0]]);
            llllllllllllllllIIIllllIIIIlIIII.D.a(llllIIIlIII[2]);
        }
        int n2 = Inventory.contains(item -> {
            int n2;
            if (!h.lIllIIllIllIII(item.getName().toLowerCase().contains(llllIIIIlll[llllIIIlIII[10]]) ? 1 : 0) || h.lIllIIllIllIll(item.getName().toLowerCase().contains(llllIIIIlll[llllIIIlIII[11]]) ? 1 : 0)) {
                n2 = llllIIIlIII[2];
                0;
                if (null != null) {
                    return ((128 + 33 - 127 + 107 ^ 17 + 117 - 85 + 137) & (0x23 ^ 0x59 ^ (0x3A ^ 0x77) ^ -1)) != 0;
                }
            } else {
                n2 = llllIIIlIII[0];
            }
            return n2 != 0;
        });
        if (h.lIllIIllIllIll(llllllllllllllllIIIllllIIIIlIIII.E.bankForPrayer() ? 1 : 0) && h.lIllIIllIllIII(n2)) {
            Log.info((String)llllIIIIlll[llllIIIlIII[2]]);
            llllllllllllllllIIIllllIIIIlIIII.D.a(llllIIIlIII[2]);
        }
        Item llllllllllllllllIIIllllIIIIIlIll = Inventory.getFirst(item -> {
            String[] stringArray = new String[llllIIIlIII[2]];
            stringArray[h.llllIIIlIII[0]] = llllIIIIlll[llllIIIlIII[9]];
            return item.hasAction(stringArray);
        });
        if (h.lIllIIllIllIll(llllllllllllllllIIIllllIIIIlIIII.E.bankForFood() ? 1 : 0) && h.lIllIIllIlIlll(llllllllllllllllIIIllllIIIIIlIll) && (!h.lIllIIllIlllII(Combat.getCurrentHealth(), llllllllllllllllIIIllllIIIIlIIII.E.eatAtHp()) || h.lIllIIllIllIII(llllllllllllllllIIIllllIIIIlIIII.D.m() ? 1 : 0))) {
            Log.info((String)llllIIIIlll[llllIIIlIII[4]]);
            llllllllllllllllIIIllllIIIIlIIII.D.a(llllIIIlIII[2]);
        }
        if (h.lIllIIllIllIII(llllllllllllllllIIIllllIIIIlIIII.E.useHouse() ? 1 : 0) && h.lIllIIllIllIll(llllllllllllllllIIIllllIIIIlIIII.D.v() ? 1 : 0)) {
            if (h.lIllIIllIllIII(llllllllllllllllIIIllllIIIIlIIII.D.h() ? 1 : 0)) {
                llllllllllllllllIIIllllIIIIlIIII.D.b(llllIIIlIII[0]);
                return llllIIIlIII[2];
            }
            Log.info((String)llllIIIIlll[llllIIIlIII[5]]);
            return llllllllllllllllIIIllllIIIIlIIII.J();
        }
        return llllIIIlIII[0];
    }

    private static boolean lIllIIllIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIIllIlIIll(String llllllllllllllllIIIlllIllllIIIII, String llllllllllllllllIIIlllIlllIllIlI) {
        llllllllllllllllIIIlllIllllIIIII = new String(Base64.getDecoder().decode(llllllllllllllllIIIlllIllllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIlllIlllIllllI = new StringBuilder();
        char[] llllllllllllllllIIIlllIlllIlllIl = llllllllllllllllIIIlllIlllIllIlI.toCharArray();
        int llllllllllllllllIIIlllIlllIlllII = llllIIIlIII[0];
        char[] llllllllllllllllIIIlllIlllIlIllI = llllllllllllllllIIIlllIllllIIIII.toCharArray();
        int llllllllllllllllIIIlllIlllIlIlIl = llllllllllllllllIIIlllIlllIlIllI.length;
        int llllllllllllllllIIIlllIlllIlIlII = llllIIIlIII[0];
        while (h.lIllIIllIllIlI(llllllllllllllllIIIlllIlllIlIlII, llllllllllllllllIIIlllIlllIlIlIl)) {
            char llllllllllllllllIIIlllIllllIIIIl = llllllllllllllllIIIlllIlllIlIllI[llllllllllllllllIIIlllIlllIlIlII];
            llllllllllllllllIIIlllIlllIllllI.append((char)(llllllllllllllllIIIlllIllllIIIIl ^ llllllllllllllllIIIlllIlllIlllIl[llllllllllllllllIIIlllIlllIlllII % llllllllllllllllIIIlllIlllIlllIl.length]));
            0;
            ++llllllllllllllllIIIlllIlllIlllII;
            ++llllllllllllllllIIIlllIlllIlIlII;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIIlllIlllIllllI);
    }

    private boolean J() {
        WorldPoint worldPoint = new WorldPoint(llllIIIlIII[6], llllIIIlIII[7], llllIIIlIII[0]);
        if (h.lIllIIllIllIII(Movement.shouldWalk() ? 1 : 0)) {
            return llllIIIlIII[2];
        }
        System.out.println(llllIIIIlll[llllIIIlIII[8]]);
        Movement.walkTo((WorldPoint)worldPoint);
        0;
        return llllIIIlIII[2];
    }

    private static boolean lIllIIllIllIIl(Object object) {
        return object != null;
    }

    private static boolean lIllIIllIlIllI(Object object, Object object2) {
        return object != object2;
    }

    private static void lIllIIllIlIlII() {
        llllIIIIlll = new String[llllIIIlIII[13]];
        h.llllIIIIlll[h.llllIIIlIII[0]] = h."Inventory full, need to bank loot";
        h.llllIIIIlll[h.llllIIIlIII[2]] = h."Out of prayer restores, need to bank";
        h.llllIIIIlll[h.llllIIIlIII[4]] = h."No food or not enough food";
        h.llllIIIIlll[h.llllIIIlIII[5]] = h."We have looted chest, but it doesn't seem like we need to bank yet.";
        h.llllIIIIlll[h.llllIIIlIII[8]] = h."Reset walking";
        h.llllIIIIlll[h.llllIIIlIII[9]] = h."Eat";
        h.llllIIIIlll[h.llllIIIlIII[10]] = h."prayer";
        h.llllIIIIlll[h.llllIIIlIII[11]] = h."restore";
        h.llllIIIIlll[h.llllIIIlIII[12]] = h."Eat";
    }

    private static boolean lIllIIllIlIlll(Object object) {
        return object == null;
    }

    private static boolean lIllIIllIllIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIllIlllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIllIIllIlIIIl(String llllllllllllllllIIIlllIlllllllIl, String llllllllllllllllIIIlllIllllllIlI) {
        try {
            SecretKeySpec llllllllllllllllIIIllllIIIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIlllIllllllIlI.getBytes(StandardCharsets.UTF_8)), llllIIIlIII[12]), "DES");
            Cipher llllllllllllllllIIIlllIlllllllll = Cipher.getInstance("DES");
            llllllllllllllllIIIlllIlllllllll.init(llllIIIlIII[4], llllllllllllllllIIIllllIIIIIIIII);
            return new String(llllllllllllllllIIIlllIlllllllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIlllIlllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIlllIllllllllI) {
            llllllllllllllllIIIlllIllllllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIllIlllIl(int n2, int n3) {
        return n2 == n3;
    }
}

