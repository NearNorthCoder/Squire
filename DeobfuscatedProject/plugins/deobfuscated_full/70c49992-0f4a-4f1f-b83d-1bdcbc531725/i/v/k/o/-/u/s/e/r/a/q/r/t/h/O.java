/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.openosrs.client.game.WorldLocation
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.House
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Widgets
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

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
import net.runelite.api.widgets.WidgetInfo;
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

/* TASK: Traversing to Rel -> TraversingtorelTask */
@TaskDesc(name="Traversing to Rel", priority=100)
public class O
extends Task {
    private final /* synthetic */ Client cC;
    private static /* synthetic */ String[] lIlIllIIlIIII;
    private static final /* synthetic */ WorldPoint cy;
    private static final /* synthetic */ int cz;
    private final /* synthetic */ SquireVorkathPlugin cB;
    private static /* synthetic */ int[] lIlIllIIlIIIl;
    private final /* synthetic */ SquireVorkathConfig cA;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        O var3;
        if (O.llIIIIIIIlllIlI(Arrays.stream(this.cC.getMapRegions()).anyMatch(n2 -> {
            boolean bl;
            if (O.llIIIIIIlIIIIll(n2, lIlIllIIlIIIl[15])) {
                bl = lIlIllIIlIIIl[0];
                0;
                if (-(117 + 39 - -25 + 1 ^ 123 + 99 - 91 + 48) >= 0) {
                    return ((87 + 165 - 76 + 37 ^ 99 + 129 - 220 + 173) & (0xDA ^ 0xA8 ^ (0xD3 ^ 0xC1) ^ -1)) != 0;
                }
            } else {
                bl = lIlIllIIlIIIl[1];
            }
            return bl;
        }) ? 1 : 0)) {
            this.ah();
            0;
            return lIlIllIIlIIIl[0];
        }
        if (!O.llIIIIIIIlllIll(var3.cC.isInInstancedRegion() ? 1 : 0) || O.llIIIIIIIlllIlI(Arrays.stream(var3.cC.getMapRegions()).anyMatch(n2 -> {
            boolean bl;
            if (O.llIIIIIIlIIIIll(n2, lIlIllIIlIIIl[14])) {
                bl = lIlIllIIlIIIl[0];
                0;
                if (((0x13 ^ 0x42) & ~(0xCE ^ 0x9F)) != 0) {
                    return false;
                }
            } else {
                bl = lIlIllIIlIIIl[1];
            }
            return bl;
        }) ? 1 : 0)) {
            return lIlIllIIlIIIl[1];
        }
        WorldPoint var17 = Players.getLocal().getWorldLocation();
        if (O.llIIIIIIIllllII(cy.distanceTo(var17), lIlIllIIlIIIl[2]) && O.llIIIIIIIllllIl(var17.getX(), cy.getX())) {
            return lIlIllIIlIIIl[1];
        }
        if (O.llIIIIIIIlllIll(((BankLoadout)var3.cA.bankLoadout().selected(BankLoadout.class)).needsToBank() ? 1 : 0) && O.llIIIIIIIlllllI(Combat.getMissingHealth()) && O.llIIIIIIIllllIl(Skills.getBoostedLevel((Skill)Skill.PRAYER), Skills.getLevel((Skill)Skill.PRAYER))) {
            var3.cB.a(lIlIllIIlIIIl[1]);
            var3.ah();
            0;
            return lIlIllIIlIIIl[0];
        }
        if (O.llIIIIIIIlllIlI(((BankLoadout)var3.cA.bankLoadout().selected(BankLoadout.class)).needsToBank() ? 1 : 0)) {
            return lIlIllIIlIIIl[1];
        }
        int[] nArray = new int[lIlIllIIlIIIl[0]];
        nArray[O.lIlIllIIlIIIl[1]] = lIlIllIIlIIIl[3];
        TileObject var18 = TileObjects.getNearest((int[])nArray);
        if (O.llIIIIIIIllllll(var18)) {
            if (O.llIIIIIIlIIIIII(var17.getRegionID(), lIlIllIIlIIIl[4]) && O.llIIIIIIlIIIIII(var17.getRegionID(), lIlIllIIlIIIl[5])) {
                return var3.ah();
            }
            if (O.llIIIIIIIlllIll(var3.cB.c() ? 1 : 0)) {
                return var3.ah();
            }
            return lIlIllIIlIIIl[1];
        }
        var2_2.interact(lIlIllIIlIIII[lIlIllIIlIIIl[1]]);
        this.sleep(lIlIllIIlIIIl[6]);
        return lIlIllIIlIIIl[0];
    }

    private static boolean llIIIIIIIllllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIIIIIIlllIll(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIIIlIIIIIl(Object object) {
        return object != null;
    }

    static {
        O.llIIIIIIIlllIIl();
        O.llIIIIIIIlllIII();
        cz = lIlIllIIlIIIl[4];
        cy = new WorldPoint(lIlIllIIlIIIl[16], lIlIllIIlIIIl[17], lIlIllIIlIIIl[1]);
    }

    private boolean ah() {
        if (O.llIIIIIIIlllIll(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIllIIlIIIl[0];
        }
        int[] nArray = new int[lIlIllIIlIIIl[0]];
        nArray[O.lIlIllIIlIIIl[1]] = lIlIllIIlIIIl[7];
        Item var15 = Inventory.getFirst((int[])nArray);
        if (O.llIIIIIIlIIIIIl(var15)) {
            int[] nArray2 = new int[lIlIllIIlIIIl[0]];
            nArray2[O.lIlIllIIlIIIl[1]] = lIlIllIIlIIIl[7];
            Inventory.getFirst((int[])nArray2).interact(lIlIllIIlIIII[lIlIllIIlIIIl[0]]);
            return lIlIllIIlIIIl[0];
        }
        int[] nArray3 = new int[lIlIllIIlIIIl[8]];
        nArray3[O.lIlIllIIlIIIl[1]] = lIlIllIIlIIIl[9];
        nArray3[O.lIlIllIIlIIIl[0]] = lIlIllIIlIIIl[10];
        Item var8 = Inventory.getFirst((int[])nArray3);
        if (O.llIIIIIIlIIIIIl(var8)) {
            var8.interact(lIlIllIIlIIII[lIlIllIIlIIIl[8]]);
            Keyboard.type((int)lIlIllIIlIIIl[11]);
            return lIlIllIIlIIIl[0];
        }
        if (O.llIIIIIIlIIIIlI(House.getHouseLocation(), WorldLocation.RELLEKKA_POH_PORTAL)) {
            int[] nArray4 = new int[lIlIllIIlIIIl[0]];
            nArray4[O.lIlIllIIlIIIl[1]] = lIlIllIIlIIIl[12];
            Item var16 = Inventory.getFirst((int[])nArray4);
            if (O.llIIIIIIlIIIIIl(var16)) {
                var16.interact(lIlIllIIlIIII[lIlIllIIlIIIl[13]]);
                return lIlIllIIlIIIl[0];
            }
            SpellBook.Standard var1 = SpellBook.Standard.TELEPORT_TO_HOUSE;
            Widget var12 = Widgets.get((WidgetInfo)var1.getWidget());
            if (O.llIIIIIIlIIIIIl(var12)) {
                var12.interact(lIlIllIIlIIII[lIlIllIIlIIIl[6]]);
                return lIlIllIIlIIIl[0];
            }
        }
        Movement.walkTo((WorldPoint)cy);
        0;
        return lIlIllIIlIIIl[0];
    }

    @Inject
    protected O(SquireVorkathConfig squireVorkathConfig, SquireVorkathPlugin squireVorkathPlugin, Client client) {
        this.cA = squireVorkathConfig;
        this.cC = client;
        this.cB = squireVorkathPlugin;
    }

    private static boolean llIIIIIIlIIIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIIIIlIIIIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIIIIIIIllllll(Object object) {
        return object == null;
    }

    private static boolean llIIIIIIlIIIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIIIIIIlllllI(int n2) {
        return n2 <= 0;
    }

    private static String llIIIIIIIllIlll(String var2, String var7) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIlIllIIlIIIl[8], var14);
            return new String(var6.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIIIllllII(int n2, int n3) {
        return n2 <= n3;
    }

    private static void llIIIIIIIlllIIl() {
        lIlIllIIlIIIl = new int[20];
        O.lIlIllIIlIIIl[0] = 1;
        O.lIlIllIIlIIIl[1] = (0x8C ^ 0x90) & ~(0x72 ^ 0x6E);
        O.lIlIllIIlIIIl[2] = 0x4A ^ 0x5A;
        O.lIlIllIIlIIIl[3] = -(0xFFFF9EDB & 0x75AD) & (0xFFFFFCBF & 0x7FDD);
        O.lIlIllIIlIIIl[4] = -(0xFFFFF3C5 & 0x5EFB) & (0xFFFFFBF9 & Short.MAX_VALUE);
        O.lIlIllIIlIIIl[5] = 0xFFFFFB7E & 0x2DB9;
        O.lIlIllIIlIIIl[6] = 0x7B ^ 0x7F;
        O.lIlIllIIlIIIl[7] = -(0xFFFFD0B4 & 0x6FEF) & (0xFFFFFFFF & 0x73EF);
        O.lIlIllIIlIIIl[8] = 2;
        O.lIlIllIIlIIIl[9] = -(0xFFFFDB75 & 0x2DCB) & (0xFFFFBF7F & 0x6FFD);
        O.lIlIllIIlIIIl[10] = 0xFFFFAEBF & 0x777E;
        O.lIlIllIIlIIIl[11] = 0xA0 ^ 0xA6;
        O.lIlIllIIlIIIl[12] = -(0xFFFFE6B7 & 0x79D9) & (0xFFFFFFFD & 0x7FDF);
        O.lIlIllIIlIIIl[13] = 3;
        O.lIlIllIIlIIIl[14] = -(0xFFFFFBC7 & 0x1CB9) & (0xFFFFFBFF & 0x3FBF);
        O.lIlIllIIlIIIl[15] = 0xFFFFB37F & 0x7FCA;
        O.lIlIllIIlIIIl[16] = -(0xFFFFFD7B & 0x37E6) & (0xFFFFFFF9 & 0x3DFF);
        O.lIlIllIIlIIIl[17] = 0xFFFFAFFC & 0x5BF3;
        O.lIlIllIIlIIIl[18] = 0x51 ^ 0x54;
        O.lIlIllIIlIIIl[19] = 0x22 ^ 0x2A;
    }

    private static void llIIIIIIIlllIII() {
        lIlIllIIlIIII = new String[lIlIllIIlIIIl[18]];
        O.lIlIllIIlIIII[O.lIlIllIIlIIIl[1]] = O."Enter";
        O.lIlIllIIlIIII[O.lIlIllIIlIIIl[0]] = O."Teleport";
        O.lIlIllIIlIIII[O.lIlIllIIlIIIl[8]] = O."Teleport";
        O.lIlIllIIlIIII[O.lIlIllIIlIIIl[13]] = O."Outside";
        O.lIlIllIIlIIII[O.lIlIllIIlIIIl[6]] = O."Outside";
    }

    private static String llIIIIIIIllIllI(String var11, String var10) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), lIlIllIIlIIIl[19]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(lIlIllIIlIIIl[8], var4);
            return new String(var13.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIIIlllIlI(int n2) {
        return n2 != 0;
    }
}

