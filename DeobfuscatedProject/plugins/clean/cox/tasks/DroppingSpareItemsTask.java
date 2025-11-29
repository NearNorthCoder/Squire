/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum38;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Dropping spare items", priority=30000)
public class DroppingSpareItemsTask
extends Task {
    
    private final  SquireChambersPlugin cF;
     boolean cE;
     int cD;

        return String.valueOf(var1);
    }

    protected boolean cv() {
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            if (ad.llIlllIIlIIllI(item.getName().startsWith(lIlIlIIIllll[lIlIlIIlIIII[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIlIIII[1]];
                stringArray[ad.lIlIlIIlIIII[0]] = lIlIlIIIllll[lIlIlIIlIIII[13]];
                if (ad.llIlllIIlIIllI(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIIlIIII[1];

                    if (1 >= 1) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIlIIlIIII[0];
            return n2 != 0;
        });
        if (ad.llIlllIIlIlIII(item2)) {
            return lIlIlIIlIIII[0];
        }
        item2.interact(lIlIlIIIllll[lIlIlIIlIIII[0]]);
        this.sleep(lIlIlIIlIIII[13]);
        return lIlIlIIlIIII[1];
    }

    private static boolean llIlllIIlIlIIl(Object object) {
        return object != null;
    }

    private static void llIlllIIlIIlII() {
        lIlIlIIIllll = new String[lIlIlIIlIIII[10]];
        ad.lIlIlIIIllll[ad.lIlIlIIlIIII[0]] = "Drink";
        ad.lIlIlIIIllll[ad.lIlIlIIlIIII[1]] = "Stamina potion";
        ad.lIlIlIIIllll[ad.lIlIlIIlIIII[13]] = "Drink";
    }

    private static boolean llIlllIIlIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean llIlllIIlIlIll(int n2) {
        return n2 <= 0;
    }

    private static boolean llIlllIIlIllIl(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public DroppingSpareItemsTask(SquireChambersPlugin squireChambersPlugin) {
        this.cD = lIlIlIIlIIII[0];
        this.cE = lIlIlIIlIIII[0];
        this.cF = squireChambersPlugin;
    }

    private static boolean llIlllIIlIlIII(Object object) {
        return object == null;
    }

    private static boolean llIlllIIlIlIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llIlllIIlIIllI(int n2) {
        return n2 != 0;
    }

    static {
        ad.llIlllIIlIIlIl();
        ad.llIlllIIlIIlII();
    }

    public boolean run() {
        int var2;
        ad var3;
        if (!ad.llIlllIIlIIllI(u.be() ? 1 : 0) || ad.llIlllIIlIIlll(u.bf() ? 1 : 0)) {
            return lIlIlIIlIIII[0];
        }
        Player var4 = Players.getLocal();
        if (ad.llIlllIIlIlIII(var4)) {
            return lIlIlIIlIIII[0];
        }
        n var5 = var3.cF.L();
        if (!ad.llIlllIIlIlIIl(var3.cF.L()) || ad.llIlllIIlIIlll(var3.cF.L().a((Locatable)var4) ? 1 : 0)) {
            return lIlIlIIlIIII[0];
        }
        int[] nArray = new int[lIlIlIIlIIII[1]];
        nArray[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[2];
        if (ad.llIlllIIlIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIlIlIIlIIII[1]];
            nArray2[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[2];
            Inventory.dropAll((int[])nArray2);

            return lIlIlIIlIIII[1];
        }
        int[] nArray3 = new int[lIlIlIIlIIII[1]];
        nArray3[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[3];
        if (ad.llIlllIIlIIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            if (ad.llIlllIIlIlIlI((Object)var5.aM(), (Object)N.ICE_DEMON)) {
                int[] nArray4 = new int[lIlIlIIlIIII[1]];
                nArray4[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[3];
                Inventory.dropAll((int[])nArray4);

                return lIlIlIIlIIII[1];
            }
            var2 = lIlIlIIlIIII[4] - var3.cF.K() + (lIlIlIIlIIII[5] - Skills.getLevel((Skill)Skill.WOODCUTTING)) / lIlIlIIlIIII[6];
            if (ad.llIlllIIlIlIll(var2)) {
                int[] nArray5 = new int[lIlIlIIlIIII[1]];
                nArray5[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[3];
                Inventory.dropAll((int[])nArray5);

                return lIlIlIIlIIII[1];
            }
        }
        int[] nArray6 = new int[lIlIlIIlIIII[1]];
        nArray6[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[7];
        if (ad.llIlllIIlIIllI(Inventory.contains((int[])nArray6) ? 1 : 0) && ad.llIlllIIlIlIlI((Object)var5.aM(), (Object)N.ICE_DEMON)) {
            int[] nArray7 = new int[lIlIlIIlIIII[1]];
            nArray7[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[7];
            Inventory.dropAll((int[])nArray7);

            return lIlIlIIlIIII[1];
        }
        int[] nArray8 = new int[lIlIlIIlIIII[1]];
        nArray8[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[8];
        if (ad.llIlllIIlIIllI(Inventory.contains((int[])nArray8) ? 1 : 0)) {
            if (ad.llIlllIIlIlIlI((Object)var5.aM(), (Object)N.ICE_DEMON) && ad.llIlllIIlIlIlI((Object)var5.aM(), (Object)N.MUTTADILES)) {
                int[] nArray9 = new int[lIlIlIIlIIII[1]];
                nArray9[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[8];
                Inventory.dropAll((int[])nArray9);

                return lIlIlIIlIIII[1];
            }
            if (ad.llIlllIIlIllII((Object)var5.aM(), (Object)N.ICE_DEMON) && ad.llIlllIIlIlIll(var2 = lIlIlIIlIIII[4] - var3.cF.K() + (lIlIlIIlIIII[5] - Skills.getLevel((Skill)Skill.WOODCUTTING)) / lIlIlIIlIIII[6])) {
                int[] nArray10 = new int[lIlIlIIlIIII[1]];
                nArray10[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[8];
                Inventory.dropAll((int[])nArray10);

                return lIlIlIIlIIII[1];
            }
        }
        int[] nArray11 = new int[lIlIlIIlIIII[1]];
        nArray11[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[9];
        if (ad.llIlllIIlIIllI(Inventory.contains((int[])nArray11) ? 1 : 0) && ad.llIlllIIlIlIlI((Object)var5.aM(), (Object)N.THIEVING)) {
            int[] nArray12 = new int[lIlIlIIlIIII[1]];
            nArray12[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[9];
            Inventory.dropAll((int[])nArray12);

            return lIlIlIIlIIII[1];
        }
        int[] nArray13 = new int[lIlIlIIlIIII[10]];
        nArray13[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[11];
        nArray13[ad.lIlIlIIlIIII[1]] = lIlIlIIlIIII[12];
        nArray13[ad.lIlIlIIlIIII[13]] = lIlIlIIlIIII[14];
        if (ad.llIlllIIlIIllI(Inventory.contains((int[])nArray13) ? 1 : 0)) {
            int[] nArray14 = new int[lIlIlIIlIIII[10]];
            nArray14[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[11];
            nArray14[ad.lIlIlIIlIIII[1]] = lIlIlIIlIIII[12];
            nArray14[ad.lIlIlIIlIIII[13]] = lIlIlIIlIIII[14];
            Inventory.dropAll((int[])nArray14);

            return lIlIlIIlIIII[1];
        }
        int[] nArray15 = new int[lIlIlIIlIIII[13]];
        nArray15[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[15];
        nArray15[ad.lIlIlIIlIIII[1]] = lIlIlIIlIIII[16];
        if (ad.llIlllIIlIIllI(Inventory.contains((int[])nArray15) ? 1 : 0) && ad.llIlllIIlIlIlI((Object)var5.aM(), (Object)N.END)) {
            int[] nArray16 = new int[lIlIlIIlIIII[13]];
            nArray16[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[15];
            nArray16[ad.lIlIlIIlIIII[1]] = lIlIlIIlIIII[16];
            Inventory.dropAll((int[])nArray16);

            return lIlIlIIlIIII[1];
        }
        int[] nArray17 = new int[lIlIlIIlIIII[1]];
        nArray17[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[17];
        if (ad.llIlllIIlIIllI(Inventory.contains((int[])nArray17) ? 1 : 0) && ad.llIlllIIlIlIlI((Object)var5.aM(), (Object)N.CRABS)) {
            int[] nArray18 = new int[lIlIlIIlIIII[1]];
            nArray18[ad.lIlIlIIlIIII[0]] = lIlIlIIlIIII[17];
            Inventory.dropAll((int[])nArray18);

            return lIlIlIIlIIII[1];
        }
        return lIlIlIIlIIII[0];
    }

    private static boolean llIlllIIlIllII(Object object, Object object2) {
        return object == object2;
    }
}

