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
package gg.squire.mining.tasks;

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
import gg.squire.mining.tasks.GameEnum29;
import gg.squire.mining.tasks.GameEnum26;
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

@TaskDesc(name="Mining", register=true)
public class MiningTask
extends Task {
    private  boolean C;
    
    private final  int[] z;
    private  int A;
    
    private  boolean B;
    private final  SquireMinerConfig y;
    private final  SquireMiner x;

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

    private WorldPoint MiningTask() {
        return Players.getLocal().getWorldLocation();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var1;
        String string = chatMessage.getMessage();
        if (s.lIIlIIlllllIlII(string.contains(lllllIllIIIl[lllllIllIIlI[27]]) ? 1 : 0)) {
            this.B = lllllIllIIlI[3];
            if (s.lIIlIIlllllIlII(Movement.isRunEnabled() ? 1 : 0)) {
                this.sleep(lllllIllIIlI[3]);

                if (((158 + 108 - 91 + 68 ^ 35 + 114 - 76 + 96) & (176 + 177 - 235 + 122 ^ 66 + 74 - 35 + 65 ^ -1)) < 0) {
                    return;
                }
            } else {
                s var2;
                var2.sleep(lllllIllIIlI[5]);
            }
        }
        if (s.lIIlIIlllllIlII(var1.contains(lllllIllIIIl[lllllIllIIlI[28]]) ? 1 : 0)) {
            var2.C = lllllIllIIlI[1];
        }
        if (s.lIIlIIlllllIlII(var1.contains(lllllIllIIIl[lllllIllIIlI[29]]) ? 1 : 0)) {
            var2.C = lllllIllIIlI[3];
        }
    }

    public boolean run() {
        s var3;
        if (s.lIIlIIlllllIIll((Object)this.y.activity(), (Object)a.GRANITE)) {
            return lllllIllIIlI[1];
        }
        if (s.lIIlIIlllllIlII(var3.y.waterskins()) && s.lIIlIIlllllIlIl(Inventory.contains((int[])var3.z) ? 1 : 0)) {
            int[] nArray = new int[lllllIllIIlI[3]];
            nArray[s.lllllIllIIlI[1]] = lllllIllIIlI[9];
            if (s.lIIlIIlllllIlIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                System.out.println(lllllIllIIIl[lllllIllIIlI[1]]);
                return lllllIllIIlI[1];
            }
        }
        int[] nArray = new int[lllllIllIIlI[3]];
        nArray[s.lllllIllIIlI[1]] = lllllIllIIlI[2];
        if (s.lIIlIIlllllIllI(Inventory.getCount((int[])nArray), var3.y.waterskins())) {
            int[] nArray2 = new int[lllllIllIIlI[3]];
            nArray2[s.lllllIllIIlI[1]] = lllllIllIIlI[2];
            Inventory.getFirst((int[])nArray2).interact(lllllIllIIIl[lllllIllIIlI[3]]);
            return lllllIllIIlI[3];
        }
        if (s.lIIlIIlllllIlll(Inventory.getFreeSlots(), lllllIllIIlI[5]) && s.lIIlIIlllllIlII(Inventory.contains(item -> item.getName().contains(lllllIllIIIl[lllllIllIIlI[30]])) ? 1 : 0)) {
            Inventory.dropAll(item -> item.getName().contains(lllllIllIIIl[lllllIllIIlI[10]]));

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
        if (s.lIIlIIllllllIIl(var3.A, lllllIllIIlI[11]) && s.lIIlIIlllllIlll(var4.distanceTo(c.SOUTH_FOUR.d()), lllllIllIIlI[12])) {
            Log.info((String)lllllIllIIIl[lllllIllIIlI[5]]);
            var3.C = lllllIllIIlI[3];
        }
        if (!s.lIIlIIlllllIlIl(Inventory.isFull() ? 1 : 0) || s.lIIlIIlllllIlII(var4.isAnimating() ? 1 : 0) && s.lIIlIIlllllIlIl(var3.a(var4) ? 1 : 0)) {
            return lllllIllIIlI[1];
        }
        int[] nArray3 = new int[lllllIllIIlI[3]];
        nArray3[s.lllllIllIIlI[1]] = lllllIllIIlI[15];
        List var5 = TileObjects.getAt((WorldPoint)new WorldPoint(lllllIllIIlI[13], lllllIllIIlI[14], lllllIllIIlI[1]), (int[])nArray3);
        int[] nArray4 = new int[lllllIllIIlI[3]];
        nArray4[s.lllllIllIIlI[1]] = lllllIllIIlI[15];
        List var6 = TileObjects.getAt((WorldPoint)new WorldPoint(lllllIllIIlI[13], lllllIllIIlI[16], lllllIllIIlI[1]), (int[])nArray4);
        int[] nArray5 = new int[lllllIllIIlI[3]];
        nArray5[s.lllllIllIIlI[1]] = lllllIllIIlI[15];
        List var7 = TileObjects.getAt((WorldPoint)new WorldPoint(lllllIllIIlI[13], lllllIllIIlI[17], lllllIllIIlI[1]), (int[])nArray5);
        int[] nArray6 = new int[lllllIllIIlI[3]];
        nArray6[s.lllllIllIIlI[1]] = lllllIllIIlI[15];
        List var8 = TileObjects.getAt((WorldPoint)new WorldPoint(lllllIllIIlI[18], lllllIllIIlI[19], lllllIllIIlI[1]), (int[])nArray6);
        TileObject var9 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (s.lIIlIIllllllIlI(tileObject.getId(), lllllIllIIlI[15]) && s.lIIlIIlllllIlII(c.SOUTH_FOUR.a(tileObject.getWorldLocation()) ? 1 : 0)) {
                n2 = lllllIllIIlI[3];

            } else {
                n2 = lllllIllIIlI[1];
            }
            return n2 != 0;
        });
        if (s.lIIlIIllllllIII(var9)) {
            Movement.walkTo((WorldPoint)new WorldPoint(lllllIllIIlI[20], lllllIllIIlI[21], lllllIllIIlI[1]));

            return lllllIllIIlI[3];
        }
        if (s.lIIlIIlllllIlIl(Reachable.isInteractable((Locatable)var9) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(lllllIllIIlI[20], lllllIllIIlI[21], lllllIllIIlI[1]));

            return lllllIllIIlI[3];
        }
        if (s.lIIlIIlllllIlII(var3.C ? 1 : 0) && s.lIIlIIlllllIlII(Players.getLocal().isAnimating() ? 1 : 0)) {
            return lllllIllIIlI[1];
        }
        WorldPoint var10 = new WorldPoint(lllllIllIIlI[22], lllllIllIIlI[14], lllllIllIIlI[1]);
        if (s.lIIlIIlllllIlII(var3.MiningTask().equals((Object)var10) ? 1 : 0) && !s.lIIlIIlllllIlIl(var3.B ? 1 : 0) || !s.lIIlIIlllllIlIl(var3.C ? 1 : 0) || s.lIIlIIlllllIllI(var10.distanceTo2D(var3.MiningTask()), lllllIllIIlI[11])) {
            var3.sleep(lllllIllIIlI[23]);
            var3.B = lllllIllIIlI[1];
            var3.x.a();
            ((TileObject)var6.get(lllllIllIIlI[1])).interact(lllllIllIIIl[lllllIllIIlI[7]]);
            return lllllIllIIlI[1];
        }
        if (s.lIIlIIlllllIlII(var3.MiningTask().equals((Object)new WorldPoint(lllllIllIIlI[22], lllllIllIIlI[16], lllllIllIIlI[1])) ? 1 : 0) && s.lIIlIIlllllIlII(var3.B ? 1 : 0)) {
            var3.B = lllllIllIIlI[1];
            var3.C = lllllIllIIlI[1];
            var3.x.a();
            ((TileObject)var7.get(lllllIllIIlI[1])).interact(lllllIllIIIl[lllllIllIIlI[0]]);
            return lllllIllIIlI[1];
        }
        if (s.lIIlIIlllllIlII(var3.MiningTask().equals((Object)new WorldPoint(lllllIllIIlI[22], lllllIllIIlI[17], lllllIllIIlI[1])) ? 1 : 0) && s.lIIlIIlllllIlII(var3.B ? 1 : 0)) {
            var3.B = lllllIllIIlI[1];
            var3.C = lllllIllIIlI[1];
            var3.x.a();
            ((TileObject)var8.get(lllllIllIIlI[1])).interact(lllllIllIIIl[lllllIllIIlI[23]]);
            return lllllIllIIlI[1];
        }
        if (s.lIIlIIlllllIlII(var3.MiningTask().equals((Object)new WorldPoint(lllllIllIIlI[18], lllllIllIIlI[17], lllllIllIIlI[1])) ? 1 : 0) && s.lIIlIIlllllIlII(var3.B ? 1 : 0)) {
            var3.B = lllllIllIIlI[1];
            var3.C = lllllIllIIlI[1];
            var3.x.a();
            ((TileObject)var5.get(lllllIllIIlI[1])).interact(lllllIllIIIl[lllllIllIIlI[24]]);
            return lllllIllIIlI[1];
        }
        return lllllIllIIlI[3];
    }

    private static boolean lIIlIIllllllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIlIIlllIIlIll() {
        lllllIllIIIl = new String[lllllIllIIlI[11]];
        s.lllllIllIIIl[s.lllllIllIIlI[1]] = "Config says we're using waterskins, we do not have any + no circlet of water.";
        s.lllllIllIIIl[s.lllllIllIIlI[3]] = "Drop";
        s.lllllIllIIIl[s.lllllIllIIlI[5]] = "Missed 4 cycles in a row, resetting.";
        s.lllllIllIIIl[s.lllllIllIIlI[7]] = "Mine";
        s.lllllIllIIIl[s.lllllIllIIlI[0]] = "Mine";
        s.lllllIllIIIl[s.lllllIllIIlI[23]] = "Mine";
        s.lllllIllIIIl[s.lllllIllIIlI[24]] = "Mine";
        s.lllllIllIIIl[s.lllllIllIIlI[27]] = "You swing your pick at the rock.";
        s.lllllIllIIIl[s.lllllIllIIlI[28]] = "You manage to quarry some granite.";
        s.lllllIllIIIl[s.lllllIllIIlI[29]] = "Shantay Pass";
        s.lllllIllIIIl[s.lllllIllIIlI[10]] = "Granite";
        s.lllllIllIIIl[s.lllllIllIIlI[30]] = "Granite";
    }

    private boolean a(Player player) {
        boolean bl;
        if (!s.lIIlIIllllllIlI(player.getAnimation(), lllllIllIIlI[25]) || s.lIIlIIllllllIll(player.getAnimation(), lllllIllIIlI[26])) {
            bl = lllllIllIIlI[3];

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

        return String.valueOf(var11);
    }

    private static boolean lIIlIIlllllIlIl(int n2) {
        return n2 == 0;
    }

    @Inject
    public MiningTask(SquireMiner squireMiner, SquireMinerConfig squireMinerConfig) {
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

}

