/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.events.ExperienceGained
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.i.q.u.r.-.n.s.e.r.i.AEnum;
import m.e.i.q.u.r.-.n.s.e.r.i.CEnum;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.ExperienceGained;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;

/* TASK: Mining -> MiningTask */
@TaskDesc(name="Mining", register=true)
public class MiningTask
extends Task {
    private /* synthetic */ boolean C;
    private static /* synthetic */ String[] lllllIllIIIl;
    private final /* synthetic */ int[] z;
    private /* synthetic */ int A;
    private static /* synthetic */ int[] lllllIllIIlI;
    private /* synthetic */ boolean B;
    private final /* synthetic */ SquireMinerConfig y;
    private final /* synthetic */ SquireMiner x;

    private static boolean lIIlIIllllllIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIlIIllllllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlIIlllllIIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIIlllllllII(Object object, Object object2) {
        return object == object2;
    }

    private WorldPoint s() {
        return Players.getLocal().getWorldLocation();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var28;
        String string = chatMessage.getMessage();
        if (s.lIIlIIlllllIlII(string.contains(lllllIllIIIl[lllllIllIIlI[27]]) ? 1 : 0)) {
            this.B = lllllIllIIlI[3];
            if (s.lIIlIIlllllIlII(Movement.isRunEnabled() ? 1 : 0)) {
                this.sleep(lllllIllIIlI[3]);
                0;
                if (((158 + 108 - 91 + 68 ^ 35 + 114 - 76 + 96) & (176 + 177 - 235 + 122 ^ 66 + 74 - 35 + 65 ^ -1)) < 0) {
                    return;
                }
            } else {
                s var3;
                var3.sleep(lllllIllIIlI[5]);
            }
        }
        if (s.lIIlIIlllllIlII(var28.contains(lllllIllIIIl[lllllIllIIlI[28]]) ? 1 : 0)) {
            var3.C = lllllIllIIlI[1];
        }
        if (s.lIIlIIlllllIlII(var28.contains(lllllIllIIIl[lllllIllIIlI[29]]) ? 1 : 0)) {
            var3.C = lllllIllIIlI[3];
        }
    }

    public boolean run() {
        s var19;
        if (s.lIIlIIlllllIIll((Object)this.y.activity(), (Object)a.GRANITE)) {
            return lllllIllIIlI[1];
        }
        if (s.lIIlIIlllllIlII(var19.y.waterskins()) && s.lIIlIIlllllIlIl(Inventory.contains((int[])var19.z) ? 1 : 0)) {
            int[] nArray = new int[lllllIllIIlI[3]];
            nArray[s.lllllIllIIlI[1]] = lllllIllIIlI[9];
            if (s.lIIlIIlllllIlIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                System.out.println(lllllIllIIIl[lllllIllIIlI[1]]);
                return lllllIllIIlI[1];
            }
        }
        int[] nArray = new int[lllllIllIIlI[3]];
        nArray[s.lllllIllIIlI[1]] = lllllIllIIlI[2];
        if (s.lIIlIIlllllIllI(Inventory.getCount((int[])nArray), var19.y.waterskins())) {
            int[] nArray2 = new int[lllllIllIIlI[3]];
            nArray2[s.lllllIllIIlI[1]] = lllllIllIIlI[2];
            Inventory.getFirst((int[])nArray2).interact(lllllIllIIIl[lllllIllIIlI[3]]);
            return lllllIllIIlI[3];
        }
        if (s.lIIlIIlllllIlll(Inventory.getFreeSlots(), lllllIllIIlI[5]) && s.lIIlIIlllllIlII(Inventory.contains(item -> item.getName().contains(lllllIllIIIl[lllllIllIIlI[30]])) ? 1 : 0)) {
            Inventory.dropAll(item -> item.getName().contains(lllllIllIIIl[lllllIllIIlI[10]]));
            0;
        }
        if (s.lIIlIIlllllIlIl(Movement.isRunEnabled() ? 1 : 0) && s.lIIlIIlllllIllI(Movement.getRunEnergy(), lllllIllIIlI[10])) {
            Movement.toggleRun();
            return lllllIllIIlI[3];
        }
        if (s.lIIlIIlllllIlII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lllllIllIIlI[1];
        }
        Player var4 = Players.getLocal();
        if (s.lIIlIIllllllIII(var4)) {
            return lllllIllIIlI[1];
        }
        if (s.lIIlIIllllllIIl(var19.A, lllllIllIIlI[11]) && s.lIIlIIlllllIlll(var4.distanceTo(c.SOUTH_FOUR.d()), lllllIllIIlI[12])) {
            Log.info((String)lllllIllIIIl[lllllIllIIlI[5]]);
            var19.C = lllllIllIIlI[3];
        }
        if (!s.lIIlIIlllllIlIl(Inventory.isFull() ? 1 : 0) || s.lIIlIIlllllIlII(var4.isAnimating() ? 1 : 0) && s.lIIlIIlllllIlIl(var19.a(var4) ? 1 : 0)) {
            return lllllIllIIlI[1];
        }
        int[] nArray3 = new int[lllllIllIIlI[3]];
        nArray3[s.lllllIllIIlI[1]] = lllllIllIIlI[15];
        List var6 = TileObjects.getAt((WorldPoint)new WorldPoint(lllllIllIIlI[13], lllllIllIIlI[14], lllllIllIIlI[1]), (int[])nArray3);
        int[] nArray4 = new int[lllllIllIIlI[3]];
        nArray4[s.lllllIllIIlI[1]] = lllllIllIIlI[15];
        List var10 = TileObjects.getAt((WorldPoint)new WorldPoint(lllllIllIIlI[13], lllllIllIIlI[16], lllllIllIIlI[1]), (int[])nArray4);
        int[] nArray5 = new int[lllllIllIIlI[3]];
        nArray5[s.lllllIllIIlI[1]] = lllllIllIIlI[15];
        List var7 = TileObjects.getAt((WorldPoint)new WorldPoint(lllllIllIIlI[13], lllllIllIIlI[17], lllllIllIIlI[1]), (int[])nArray5);
        int[] nArray6 = new int[lllllIllIIlI[3]];
        nArray6[s.lllllIllIIlI[1]] = lllllIllIIlI[15];
        List var22 = TileObjects.getAt((WorldPoint)new WorldPoint(lllllIllIIlI[18], lllllIllIIlI[19], lllllIllIIlI[1]), (int[])nArray6);
        TileObject var17 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (s.lIIlIIllllllIlI(tileObject.getId(), lllllIllIIlI[15]) && s.lIIlIIlllllIlII(c.SOUTH_FOUR.a(tileObject.getWorldLocation()) ? 1 : 0)) {
                n2 = lllllIllIIlI[3];
                0;
                if (-2 >= 0) {
                    return false;
                }
            } else {
                n2 = lllllIllIIlI[1];
            }
            return n2 != 0;
        });
        if (s.lIIlIIllllllIII(var17)) {
            Movement.walkTo((WorldPoint)new WorldPoint(lllllIllIIlI[20], lllllIllIIlI[21], lllllIllIIlI[1]));
            0;
            return lllllIllIIlI[3];
        }
        if (s.lIIlIIlllllIlIl(Reachable.isInteractable((Locatable)var17) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(lllllIllIIlI[20], lllllIllIIlI[21], lllllIllIIlI[1]));
            0;
            return lllllIllIIlI[3];
        }
        if (s.lIIlIIlllllIlII(var19.C ? 1 : 0) && s.lIIlIIlllllIlII(Players.getLocal().isAnimating() ? 1 : 0)) {
            return lllllIllIIlI[1];
        }
        WorldPoint var20 = new WorldPoint(lllllIllIIlI[22], lllllIllIIlI[14], lllllIllIIlI[1]);
        if (s.lIIlIIlllllIlII(var19.s().equals((Object)var20) ? 1 : 0) && !s.lIIlIIlllllIlIl(var19.B ? 1 : 0) || !s.lIIlIIlllllIlIl(var19.C ? 1 : 0) || s.lIIlIIlllllIllI(var20.distanceTo2D(var19.s()), lllllIllIIlI[11])) {
            var19.sleep(lllllIllIIlI[23]);
            var19.B = lllllIllIIlI[1];
            var19.x.a();
            ((TileObject)var10.get(lllllIllIIlI[1])).interact(lllllIllIIIl[lllllIllIIlI[7]]);
            return lllllIllIIlI[1];
        }
        if (s.lIIlIIlllllIlII(var19.s().equals((Object)new WorldPoint(lllllIllIIlI[22], lllllIllIIlI[16], lllllIllIIlI[1])) ? 1 : 0) && s.lIIlIIlllllIlII(var19.B ? 1 : 0)) {
            var19.B = lllllIllIIlI[1];
            var19.C = lllllIllIIlI[1];
            var19.x.a();
            ((TileObject)var7.get(lllllIllIIlI[1])).interact(lllllIllIIIl[lllllIllIIlI[0]]);
            return lllllIllIIlI[1];
        }
        if (s.lIIlIIlllllIlII(var19.s().equals((Object)new WorldPoint(lllllIllIIlI[22], lllllIllIIlI[17], lllllIllIIlI[1])) ? 1 : 0) && s.lIIlIIlllllIlII(var19.B ? 1 : 0)) {
            var19.B = lllllIllIIlI[1];
            var19.C = lllllIllIIlI[1];
            var19.x.a();
            ((TileObject)var22.get(lllllIllIIlI[1])).interact(lllllIllIIIl[lllllIllIIlI[23]]);
            return lllllIllIIlI[1];
        }
        if (s.lIIlIIlllllIlII(var19.s().equals((Object)new WorldPoint(lllllIllIIlI[18], lllllIllIIlI[17], lllllIllIIlI[1])) ? 1 : 0) && s.lIIlIIlllllIlII(var19.B ? 1 : 0)) {
            var19.B = lllllIllIIlI[1];
            var19.C = lllllIllIIlI[1];
            var19.x.a();
            ((TileObject)var6.get(lllllIllIIlI[1])).interact(lllllIllIIIl[lllllIllIIlI[24]]);
            return lllllIllIIlI[1];
        }
        return lllllIllIIlI[3];
    }

    private static boolean lIIlIIllllllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIlIIlllIIlIll() {
        lllllIllIIIl = new String[lllllIllIIlI[11]];
        s.lllllIllIIIl[s.lllllIllIIlI[1]] = s."Config says we're using waterskins, we do not have any + no circlet of water.";
        s.lllllIllIIIl[s.lllllIllIIlI[3]] = s."Drop";
        s.lllllIllIIIl[s.lllllIllIIlI[5]] = s."Missed 4 cycles in a row, resetting.";
        s.lllllIllIIIl[s.lllllIllIIlI[7]] = s."Mine";
        s.lllllIllIIIl[s.lllllIllIIlI[0]] = s."Mine";
        s.lllllIllIIIl[s.lllllIllIIlI[23]] = s."Mine";
        s.lllllIllIIIl[s.lllllIllIIlI[24]] = s."Mine";
        s.lllllIllIIIl[s.lllllIllIIlI[27]] = s."You swing your pick at the rock.";
        s.lllllIllIIIl[s.lllllIllIIlI[28]] = s."You manage to quarry some granite.";
        s.lllllIllIIIl[s.lllllIllIIlI[29]] = s."Shantay Pass";
        s.lllllIllIIIl[s.lllllIllIIlI[10]] = s."Granite";
        s.lllllIllIIIl[s.lllllIllIIlI[30]] = s."Granite";
    }

    private boolean a(Player player) {
        boolean bl;
        if (!s.lIIlIIllllllIlI(player.getAnimation(), lllllIllIIlI[25]) || s.lIIlIIllllllIll(player.getAnimation(), lllllIllIIlI[26])) {
            bl = lllllIllIIlI[3];
            0;
            if (2 <= 0) {
                return false;
            }
        } else {
            bl = lllllIllIIlI[1];
        }
        return bl;
    }

    private static boolean lIIlIIlllllIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIlllllllIl(int n2, int n3) {
        return n2 < n3;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        this.A += lllllIllIIlI[3];
    }

    private static boolean lIIlIIlllllIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIlIIlllIIlIlI(String var1, String var24) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(lllllIllIIlI[5], var13);
            return new String(var15.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIlllIIlIII(String var8, String var9) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), lllllIllIIlI[28]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lllllIllIIlI[5], var5);
            return new String(var2.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIlllIIlIIl(String var27, String var12) {
        var27 = new String(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var29 = new StringBuilder();
        char[] var25 = var12.toCharArray();
        int var14 = lllllIllIIlI[1];
        char[] var18 = var27.toCharArray();
        int var16 = var18.length;
        int var26 = lllllIllIIlI[1];
        while (s.lIIlIIlllllllIl(var26, var16)) {
            char var23 = var18[var26];
            var29.append((char)(var23 ^ var25[var14 % var25.length]));
            0;
            ++var14;
            ++var26;
            0;
            if (((0x40 ^ 0x5E) & ~(0x1D ^ 3)) == ((0xBE ^ 0x87) & ~(0x26 ^ 0x1F))) continue;
            return null;
        }
        return String.valueOf(var29);
    }

    private static boolean lIIlIIlllllIlIl(int n2) {
        return n2 == 0;
    }

    @Inject
    public s(SquireMiner squireMiner, SquireMinerConfig squireMinerConfig) {
        int[] nArray = new int[lllllIllIIlI[0]];
        nArray[s.lllllIllIIlI[1]] = lllllIllIIlI[2];
        nArray[s.lllllIllIIlI[3]] = lllllIllIIlI[4];
        nArray[s.lllllIllIIlI[5]] = lllllIllIIlI[6];
        nArray[s.lllllIllIIlI[7]] = lllllIllIIlI[8];
        this.z = nArray;
        this.A = lllllIllIIlI[1];
        this.C = lllllIllIIlI[3];
        this.x = squireMiner;
        this.y = squireMinerConfig;
    }

    private static boolean lIIlIIlllllIlll(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        s.lIIlIIlllllIIlI();
        s.lIIlIIlllIIlIll();
    }

    @Subscribe
    public void a(ExperienceGained experienceGained) {
        if (s.lIIlIIlllllllII(experienceGained.getSkill(), Skill.MINING)) {
            this.A = lllllIllIIlI[1];
        }
    }

    private static boolean lIIlIIllllllIII(Object object) {
        return object == null;
    }

    private static void lIIlIIlllllIIlI() {
        lllllIllIIlI = new int[31];
        s.lllllIllIIlI[0] = 0x49 ^ 0x4D;
        s.lllllIllIIlI[1] = (0x91 ^ 0x80) & ~(0x87 ^ 0x96);
        s.lllllIllIIlI[2] = -(0xFFFFDEF9 & 0x6147) & (0xFFFFEF7F & 0x57DF);
        s.lllllIllIIlI[3] = 1;
        s.lllllIllIIlI[4] = 0xFFFFB761 & 0x4FBF;
        s.lllllIllIIlI[5] = 2;
        s.lllllIllIIlI[6] = -(0xFFFFE85D & 0x7FB7) & (0xFFFFFF37 & 0x6FFF);
        s.lllllIllIIlI[7] = 3;
        s.lllllIllIIlI[8] = 0xFFFF8F37 & 0x77ED;
        s.lllllIllIIlI[9] = -(0xFFFF86F7 & 0x7DAF) & (0xFFFFEFFF & 0x7DFF);
        s.lllllIllIIlI[10] = 0x65 ^ 0x6F;
        s.lllllIllIIlI[11] = 1 ^ 0xD;
        s.lllllIllIIlI[12] = 66 + 94 - 35 + 22 ^ 83 + 26 - 6 + 53;
        s.lllllIllIIlI[13] = 0xFFFF9EDF & 0x6D7D;
        s.lllllIllIIlI[14] = 0xFFFF9B7E & 0x6FDD;
        s.lllllIllIIlI[15] = 0xFFFFECFF & 0x3F7B;
        s.lllllIllIIlI[16] = -(0xFFFFF4A3 & 0x2F7F) & (0xFFFFFF7F & 0x2FFF);
        s.lllllIllIIlI[17] = -(0xFFFFFDB7 & 0x726A) & (0xFFFFFFFF & 0x7B7F);
        s.lllllIllIIlI[18] = -1 & (0xFFFFFCDF & 0xF7F);
        s.lllllIllIIlI[19] = -(0xFFFF9565 & 0x7EBB) & (0xFFFFFF7F & 0x1FFF);
        s.lllllIllIIlI[20] = -(0xFFFFE6FF & 0x5B91) & (0xFFFFCEF1 & 0x7FFE);
        s.lllllIllIIlI[21] = -(0x19 ^ 6) & (0xFFFF9F7E & 0x6BFF);
        s.lllllIllIIlI[22] = 0xFFFFFF7E & 0xCDF;
        s.lllllIllIIlI[23] = 0x4C ^ 0x49;
        s.lllllIllIIlI[24] = 78 + 145 - 169 + 107 ^ 31 + 49 - 76 + 163;
        s.lllllIllIIlI[25] = 0xFFFFDCB7 & 0x37C9;
        s.lllllIllIIlI[26] = -(0xFFFFB99F & 0x6F78) & (0xFFFFEDFF & 0x3FF7);
        s.lllllIllIIlI[27] = 0x42 ^ 0x45;
        s.lllllIllIIlI[28] = 0x34 ^ 0x3C;
        s.lllllIllIIlI[29] = 0xBE ^ 0xB7;
        s.lllllIllIIlI[30] = 3 ^ (0xCC ^ 0xC4);
    }
}

