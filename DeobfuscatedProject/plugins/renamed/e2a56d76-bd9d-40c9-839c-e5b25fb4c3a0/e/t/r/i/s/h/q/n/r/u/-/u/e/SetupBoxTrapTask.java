/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.Tile
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.scene.Tiles
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import e.t.r.i.s.h.q.n.r.u.-.u.e.a_Unknown;
import e.t.r.i.s.h.q.n.r.u.-.u.e.DEnum;
import e.t.r.i.s.h.q.n.r.u.-.u.e.EEnum;
import e.t.r.i.s.h.q.n.r.u.-.u.e.j_Unknown;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.Tile;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.scene.Tiles;

/* TASK: Setup Box Trap -> SetupboxtrapTask */
@TaskDesc(name="Setup Box Trap", priority=20, blocking=true)
public class SetupBoxTrapTask
extends j_Unknown {
    private final /* synthetic */ int[] y;
    private /* synthetic */ long A;
    private final /* synthetic */ d x;
    private static /* synthetic */ int[] llllIIIIlllI;
    private static /* synthetic */ String[] llllIIIIllIl;
    private final /* synthetic */ int[] z;

    private static boolean lIIIlllIllIlIIl(int n2) {
        return n2 > 0;
    }

    private static void lIIIlllIllIIIll() {
        llllIIIIlllI = new int[19];
        n.llllIIIIlllI[0] = 0x45 ^ 0x7B ^ (0xD ^ 0x37);
        n.llllIIIIlllI[1] = (5 + 32 - -49 + 75 ^ 111 + 90 - 69 + 38) & (176 + 168 - 185 + 27 ^ 89 + 107 - 32 + 13 ^ -1);
        n.llllIIIIlllI[2] = (0x70 ^ 6) + (84 + 29 - 87 + 201) - (10 + 108 - 38 + 53) + (0x8F ^ 0xAA);
        n.llllIIIIlllI[3] = 1;
        n.llllIIIIlllI[4] = (0xF ^ 8) + (61 + 41 - -24 + 15) - -(0x21 ^ 0x67) + (0x36 ^ 0x17);
        n.llllIIIIlllI[5] = 2;
        n.llllIIIIlllI[6] = 227 + 242 - 435 + 219;
        n.llllIIIIlllI[7] = 3;
        n.llllIIIIlllI[8] = (0xC1 ^ 0x87) + (144 + 69 - 141 + 80) - (97 + 86 - 89 + 119) + (186 + 14 - 137 + 183);
        n.llllIIIIlllI[9] = -(0x3B ^ 0x7A) & (0xFFFFBFFF & 0x58FD);
        n.llllIIIIlllI[10] = 0xFFFFF8FF & 0x1FBC;
        n.llllIIIIlllI[11] = -(0xFFFFFBE9 & 0x6717) & (0xFFFFFFDF & 0x777C);
        n.llllIIIIlllI[12] = 0xFFFF957C & 0x7EDB;
        n.llllIIIIlllI[13] = 0xFFFFBF5A & 0x67BD;
        n.llllIIIIlllI[14] = 0xFFFFB7BB & 0x4BF6;
        n.llllIIIIlllI[15] = 0xFFFF9FFB & 0x6797;
        n.llllIIIIlllI[16] = 0xFFFFD6E5 & 0x3D9B;
        n.llllIIIIlllI[17] = 0xFFFFFEF2 & 0x5ED;
        n.llllIIIIlllI[18] = 18 + 92 - 102 + 125 ^ 84 + 39 - 87 + 105;
    }

    private static int lIIIlllIllIIlII(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static String lIIIlllIllIIIII(String var16, String var5) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var11 = var5.toCharArray();
        int var18 = llllIIIIlllI[1];
        char[] var22 = var16.toCharArray();
        int var14 = var22.length;
        int var4 = llllIIIIlllI[1];
        while (n.lIIIlllIllIllIl(var4, var14)) {
            char var6 = var22[var4];
            var8.append((char)(var6 ^ var11[var18 % var11.length]));
            0;
            ++var18;
            ++var4;
            0;
            
            return null;
        }
        return String.valueOf(var8);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean x() {
        n var19;
        void var9;
        Player player = Players.getLocal();
        if (n.lIIIlllIllIIlIl(this.y().b() ? 1 : 0) && n.lIIIlllIllIIllI(player.getAnimation(), llllIIIIlllI[11])) {
            return llllIIIIlllI[1];
        }
        if (!n.lIIIlllIllIIllI(var9.getAnimation(), llllIIIIlllI[11]) || n.lIIIlllIllIIlll(var9.getAnimation(), llllIIIIlllI[12])) {
            if (n.lIIIlllIllIlIII(var19.z().tickManipulation() ? 1 : 0)) {
                var19.tickManipulation();
                0;
            }
            return llllIIIIlllI[3];
        }
        if (n.lIIIlllIllIlIIl(n.lIIIlllIllIIlII(var19.A - 2L, var19.y().i().get()))) {
            Movement.walkTo((WorldPoint)var19.x.l());
            0;
            return llllIIIIlllI[3];
        }
        if (n.lIIIlllIllIlIlI((Object)var19.z().method(), (Object)e.CHINS)) {
            Item var2;
            WorldPoint var15 = var19.y().a(var19.x);
            if (n.lIIIlllIllIlIll(var15)) {
                return llllIIIIlllI[1];
            }
            Tile var20 = Tiles.getAt((WorldPoint)var15);
            if (n.lIIIlllIllIllII(var20) && n.lIIIlllIllIllII(var20.getGroundItems()) && n.lIIIlllIllIIlIl((var2 = var20.getGroundItems().stream().filter(tileItem -> {
                boolean bl;
                if (n.lIIIlllIllIIlll(tileItem.getId(), llllIIIIlllI[13])) {
                    bl = llllIIIIlllI[3];
                    0;
                    if (-2 >= 0) {
                        return ((0x33 ^ 0x1B ^ (0x23 ^ 0x19)) & (0x37 ^ 0x3A ^ (0x95 ^ 0x8A) ^ -1)) != 0;
                    }
                } else {
                    bl = llllIIIIlllI[1];
                }
                return bl;
            }).collect(Collectors.toList())).isEmpty() ? 1 : 0)) {
                ((TileItem)var2.get(llllIIIIlllI[1])).interact(llllIIIIllIl[llllIIIIlllI[1]]);
                var19.A = var19.y().i().get() - (long)(var9.distanceTo(var15) / llllIIIIlllI[5]);
                return llllIIIIlllI[3];
            }
            if (n.lIIIlllIllIIlIl(var9.getWorldLocation().equals((Object)var15) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var15, (boolean)llllIIIIlllI[1]);
                0;
                return llllIIIIlllI[3];
            }
            int[] nArray = new int[llllIIIIlllI[3]];
            nArray[n.llllIIIIlllI[1]] = llllIIIIlllI[13];
            var2 = Inventory.getFirst((int[])nArray);
            if (n.lIIIlllIllIlIll(var2)) {
                return llllIIIIlllI[1];
            }
            var2.interact(llllIIIIllIl[llllIIIIlllI[3]]);
            var19.A = var19.y().i().get();
            return llllIIIIlllI[3];
        }
        return llllIIIIlllI[3];
    }

    private static boolean lIIIlllIllIlIlI(Object object, Object object2) {
        return object == object2;
    }

    private boolean tickManipulation() {
        n var7;
        int[] nArray = new int[llllIIIIlllI[3]];
        nArray[n.llllIIIIlllI[1]] = llllIIIIlllI[14];
        Item item = Inventory.getFirst((int[])nArray);
        Item item2 = Inventory.getFirst((int[])this.z);
        if (n.lIIIlllIllIllII(item2) && n.lIIIlllIllIllII(item)) {
            int[] nArray2 = new int[llllIIIIlllI[3]];
            nArray2[n.llllIIIIlllI[1]] = item.getId();
            Inventory.getFirst((int[])nArray2).useOn(item2);
            return llllIIIIlllI[3];
        }
        Item var12 = Inventory.getFirst((int[])var7.y);
        int[] nArray3 = new int[llllIIIIlllI[3]];
        nArray3[n.llllIIIIlllI[1]] = llllIIIIlllI[15];
        Item var13 = Inventory.getFirst((int[])nArray3);
        if (n.lIIIlllIllIllII(var12) && n.lIIIlllIllIllII(var13)) {
            int[] nArray4 = new int[llllIIIIlllI[3]];
            nArray4[n.llllIIIIlllI[1]] = var12.getId();
            Inventory.getFirst((int[])nArray4).useOn(var13);
            return llllIIIIlllI[3];
        }
        return llllIIIIlllI[1];
    }

    private static boolean lIIIlllIllIllIl(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public n(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.CHINS);
        this.x = this.z().chinLocation();
        int[] nArray = new int[llllIIIIlllI[0]];
        nArray[n.llllIIIIlllI[1]] = llllIIIIlllI[2];
        nArray[n.llllIIIIlllI[3]] = llllIIIIlllI[4];
        nArray[n.llllIIIIlllI[5]] = llllIIIIlllI[6];
        nArray[n.llllIIIIlllI[7]] = llllIIIIlllI[8];
        this.y = nArray;
        int[] nArray2 = new int[llllIIIIlllI[5]];
        nArray2[n.llllIIIIlllI[1]] = llllIIIIlllI[9];
        nArray2[n.llllIIIIlllI[3]] = llllIIIIlllI[10];
        this.z = nArray2;
        this.A = 0L;
    }

    private static boolean lIIIlllIllIIlIl(int n2) {
        return n2 == 0;
    }

    private static void lIIIlllIllIIIlI() {
        llllIIIIllIl = new String[llllIIIIlllI[5]];
        n.llllIIIIllIl[n.llllIIIIlllI[1]] = n."Lay";
        n.llllIIIIllIl[n.llllIIIIlllI[3]] = n."Lay";
    }

    private static boolean lIIIlllIllIlIll(Object object) {
        return object == null;
    }

    private boolean A() {
        boolean bl;
        int n2 = Players.getLocal().getAnimation();
        if (!n.lIIIlllIllIIllI(n2, llllIIIIlllI[16]) || n.lIIIlllIllIIlll(n2, llllIIIIlllI[17])) {
            bl = llllIIIIlllI[3];
            0;
            
            }
        } else {
            bl = llllIIIIlllI[1];
        }
        return bl;
    }

    private static boolean lIIIlllIllIIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIlllIllIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlllIllIllII(Object object) {
        return object != null;
    }

    private static String lIIIlllIllIIIIl(String var1, String var21) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), llllIIIIlllI[18]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(llllIIIIlllI[5], var10);
            return new String(var3.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIllIIlll(int n2, int n3) {
        return n2 == n3;
    }

    static {
        n.lIIIlllIllIIIll();
        n.lIIIlllIllIIIlI();
    }
}

